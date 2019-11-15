import models.Post;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.PatternSyntaxException;

public class App {

    public static void main(String[] args) {


        get("/posts/:id/delete", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            int idOfPostToDelete = Integer.parseInt(req.params("id")); //pull id - must match route segment
            Post deletePost = Post.findById(idOfPostToDelete); //use it to find post
            Post.deletePost(deletePost.getId());
            res.redirect("/");
            return null;
        }, new HandlebarsTemplateEngine());


        get("/", (req,res)->{
            Map<String, Object> model = new HashMap<>();
            model.put("allPosts", Post.getAll());
            return new ModelAndView(model,"index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/posts/new", (req,res)->{
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model,"newPost.hbs");
        }, new HandlebarsTemplateEngine());

        post("/posts/new", (request, response) -> { //URL to make new post on POST route
            Post newPost = new Post(request.queryParams("title"), request.queryParams("description"));
            response.redirect("/");
            return null;
        }, new HandlebarsTemplateEngine());

        get("/posts/:id",(request, response) -> {
            Map<String, Object> model = new HashMap<>();
            int idOfPostToView = Integer.parseInt(request.params("id"));
            Post viewPost = Post.findById(idOfPostToView);
            model.put("post", viewPost);
            return new ModelAndView(model, "postDetail.hbs");
        }, new HandlebarsTemplateEngine());

        get("/posts/:id/update", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            int idOfPostToEdit = Integer.parseInt(req.params("id"));
            Post editPost = Post.findById(idOfPostToEdit);
            model.put("editPost", editPost);
            return new ModelAndView(model, "newPost.hbs");
        }, new HandlebarsTemplateEngine());

        post("/posts/:id/update", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            String newTitle = req.queryParams("title");
            String newDescription = req.queryParams("description");
            int idOfPostToEdit = Integer.parseInt(req.params("id"));
            Post editPost = Post.findById(idOfPostToEdit);
            editPost.setTitle(newTitle);
            editPost.setDescription(newDescription);
            Post.update(idOfPostToEdit,editPost); //don’t forget me
            res.redirect("/");
            return null;
        }, new HandlebarsTemplateEngine());

    }
}
