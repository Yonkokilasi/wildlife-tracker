import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
    static int getHerokuAssignedPort() {
       ProcessBuilder processBuilder = new ProcessBuilder();
       if (processBuilder.environment().get("PORT") != null) {
         return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
   return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
    public static void main(String[] args) {

       port(getHerokuAssignedPort());
       staticFileLocation("/public");
       String layout = "templates/layout.vtl";

       // get method for index. to display links to sightings and endangered animals
       get("/", (request, response)-> {
       Map<String, Object> model = new HashMap<String, Object>();
       model.put("template","templates/index.vtl");
       return new ModelAndView(model,layout);
       }, new VelocityTemplateEngine());

       // get method for form to add a sighting
       get("/sightings",         (request,response)-> {
           Map<String,Object> model = new HashMap<String,Object>();
           model.put("sightings",Sighting.all());
            model.put("template","templates/sightings.vtl");
           return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        post("/sightings",(request, response)-> {
            Map<String,Object> model = new HashMap<String,Object>();
            int animalId = Integer.parseInt(request.queryParams("animalId"));
            String rangername = request.queryParams("rangername");
            String location = request.queryParams("location");
            Sighting newSighting = new Sighting(rangername,location,animalId);
            newSighting.save();
            model.put("template","templates/sighting-success.vtl");
             return new ModelAndView(model, layout);
         }, new VelocityTemplateEngine());

         get("/recentsightings", (request, response) -> {
          Map<String,Object> model = new HashMap<String,Object>();
          model.put("sightings",Sighting.all());
          model.put("template","templates/recentsightings.vtl");
          return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        post("/recentsightings",(request,response) -> {
            Map<String , Object> model = new HashMap<String,Object>();
            int animalId = Integer.parseInt(request.queryParams("animalId"));
            String rangername = request.queryParams("rangername");
            String location = request.queryParams("location");
            Sighting newSighting = new Sighting(rangername,location,animalId);
            newSighting.save();

            model.put("template","templates/index.vtl");
            return new ModelAndView(model, layout);
          }, new VelocityTemplateEngine());
    }
}
