package models;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import java.text.SimpleDateFormat;


public class TestPost {

    @After
    public void tearDown() {
        Post.clearAll(); //clear out all the posts before each test.
    }
    @Test
    public void testPost_instanciatesCorrectly_true() throws Exception {
    Post testPost = new Post( "hammer", "a nailing tool");
    assertEquals(true, testPost instanceof Post);
}
//    @Test
//    public void testPost_getsId_true()  {
//    Post testPost = new Post("hammer", "a nailing tool");
//    assertEquals(2, Post.getId());
//    }
    @Test
    public void testPost_getsTitle_true()  {
    Post testPost = new Post( "hammer", "a nailing tool");
    assertEquals("hammer", testPost.getTitle());
    }

    @Test
    public void testPost_getsDescription_true()  {
    Post testPost = new Post( "hammer", "a nailing tool");
    assertEquals("a nailing tool", testPost.getDesc());
    }

//    @Test
//    public void testPost_getsDate_true()  {
//    Post testPost = new Post( "hammer", "a nailing tool");
//    assertEquals(new SimpleDateFormat("12/12/2012"), Post.getDate());
//    }

    @Test
    public void testPost_getsNumberOfPostsInPost_true(){
    Post testPost=new Post("drug","not good for brain");
    Post testPost1=new Post("medicine","good for brain");
    assertEquals(2,Post.fetchAll().size());
    }

//    @Test
//    public void testPost_getsIndividualPostById_true(){
//    Post testPost=new Post("drug","not good for brain");
//    Post testPost1=new Post("medicine","good for brain");
//    Post testPost2=new Post("coding","too much may cause anurisms");
//    assertEquals(1, Post.findById().getId());
//     }

//     @Test
//    public void testPost_deleteAllPosts_true(){
//         Post testPost=new Post("drug","not good for brain");
//         Post testPost1=new Post("medicine","good for brain");
//         Post testPost2=new Post("coding","too much may cause anurisms");
//    assertEquals(Post.clearAll());
//    }

//    @Test
//    public void testPost_deletePostById_true(){
//        Post testPost=new Post("drug","not good for brain");
//        Post testPost1=new Post("medicine","good for brain");
//        Post testPost2=new Post("coding","too much may cause anurisms");
//    assertNull(testPost.clearById(testPost.getId()););
//    }

    @Test
    public void testPost_updatePostById_true(){
    Post testPost=new Post("drug","not good for brain");
    String newTitle =testPost.updatePostById("good for brains");
    assertEquals(false,newTitle.equals(testPost.getTitle()));
    }
}
