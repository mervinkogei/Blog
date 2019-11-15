//import models.Post;
//import spark.ModelAndView;
//import spark.template.handlebars.HandlebarsTemplateEngine;
//import static spark.Spark.*;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class App {
//
//    public static void main(String[] args) {
//
//
//
//        get("/posts/delete", (req, res) -> {
//            Map<String, Object> model = new HashMap<>();
//            Post.clearAll();
//            res.redirect("/");
//            return null;
//        }, new HandlebarsTemplateEngine());
//
//
//        post("/posts/:id/delete", (req, res) -> {
//            Map<String, Object> model = new HashMap<>();
//            int idOfPostToDelete = Integer.parseInt(req.queryParams("id")); //pull id - must match route segment
////            Post deletePost = Post.findById(idOfPostToDelete); //use it to find post
//            Post.deletePost(idOfPostToDelete);
//            res.redirect("/");
//        }, new HandlebarsTemplateEngine());
//
//
//
//        get("/", (req,res)->{
//            Map<String, Object> model = new HashMap<>();
////            model.put("allPosts", Post.getAllPosts());
//            return new ModelAndView(model,"index.hbs");
//        }, new HandlebarsTemplateEngine());
//
//        post("/posts/new", (request, response) -> { //URL to make new post on POST route
//            Map<String, Object> model = new HashMap<>();
//            Post newPost = new Post();
//            model.put("post", newPost);
//            response.redirect("/");
//            return null;
//        }, new HandlebarsTemplateEngine());
//
//        get("/posts/:id",(request, response) -> {
//            Map<String, Object> model = new HashMap<>();
////            model.put("post", Post.findById());
//            return new ModelAndView(model, "postDetail.hbs");
//        }, new HandlebarsTemplateEngine());
//
//        get("/posts/:id/update", (req, res) -> {
//            Map<String, Object> model = new HashMap<>();
//            int idOfPostToEdit = Integer.parseInt(req.params("id"));
//            Post editPost = Post.findById(idOfPostToEdit);
//            model.put("editPost", editPost);
//            return new ModelAndView(model, "newPost.hbs");
//        }, new HandlebarsTemplateEngine());
//
//        post("/posts/:id/update", (req, res) -> {
//            Map<String, Object> model = new HashMap<>();
//            String newTitle = req.queryParams("title");
//            String newDescription = req.queryParams("description");
//            int idOfPostToEdit = Integer.parseInt(req.params("id"));
////            Post editPost = Post.findById(idOfPostToEdit);
////            editPost.update(newTitle,newDescription); //don’t forget me
//            return new ModelAndView(model, "success.hbs");
//        }, new HandlebarsTemplateEngine());
//
//    }
//}
