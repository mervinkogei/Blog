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
            instances.add(this);
            this.id=instances.size();
        }

      public static ArrayList<Post> getAll(){
        return  instances;
      }
      public  static  void clearAll(){
        instances.clear();
      }
      public static Post findById(int id){
        return instances.get(id-1);
      }
      public int getId(){
        return this.id;
      }
      public String getTitle(){
        return this.title;
    }
       public String getDescription(){
        return this.description;
    }
       public LocalDateTime getCreated_date(){
        return this.created_date;
    }

    }

