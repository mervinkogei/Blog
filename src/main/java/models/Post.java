package models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Post {


    private String title;
    private String description;
    private LocalDateTime created_date;
    private int id;
    private static ArrayList<Post> instances = new ArrayList <>();

    public Post (String title, String description){

            this.title=title;
            this.description=description;
            this.created_date=LocalDateTime.now();
            this.id=instances.size();
            instances.add(this);
        }

      public static ArrayList<Post> fetchAll(){
        return  instances;
      }
      public  static  void clearAll(){
        instances.clear();
      }
      public static Post findById(int id){
        return instances.get(id-1);
      }
      public static Post deletePost(int id){
        return instances.remove(id-1);
      }
      public String updatePostById(String description){
            this.description = description;
          return description;
      }
      public int getId(){
        return this.id;
      }
      public String getTitle(){
        return this.title;
    }
       public String getDesc(){
        return this.description;
    }
       public LocalDateTime getDate(){
        return this.created_date;
    }

    }


