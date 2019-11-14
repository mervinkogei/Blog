import models.Post;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        get("/", (req,res)->{
            Map<String, Object> model = new HashMap<>();
            model.put("allPosts", Post.getAllPosts());
            return new ModelAndView(model,"index.hbs");
        }, new HandlebarsTemplateEngine());

        post("/posts/new", (request, response) -> { //URL to make new post on POST route
            Map<String, Object> model = new HashMap<>();
            Post newPost = new Post();
            model.put("post", newPost);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());

    }
}
