package models;

import org.junit.Test;
import static org.junit.Assert.*;
import java.text.SimpleDateFormat;


public class TestPost {
@Test
    public void testPost_instanciatesCorrectly_true() throws Exception {
    Post testPost = new Post(2, "hammer", "a nailing tool", "12 / 12 / 2012");
    assertEquals(true, testPost instanceof Post);
}
    @Test
    public void testPost_getsId_true()  {
    Post testPost = new Post(2, "hammer", "a nailing tool", "12 / 12 / 2012");
    assertEquals(2, Post.getId());
    }
    @Test
    public void testPost_getsTitle_true()  {
    Post testPost = new Post(2, "hammer", "a nailing tool", "12 / 12 / 2012");
    assertEquals("hammer", Post.getTitle());
    }

    @Test
    public void testPost_getsDescription_true()  {
    Post testPost = new Post(2, "hammer", "a nailing tool", "12 / 12 / 2012");
    assertEquals("a nailing tool", Post.getDesc());
    }

    @Test
    public void testPost_getsDate_true()  {
    Post testPost = new Post(2, "hammer", "a nailing tool", "12 / 12 / 2012");
    assertEquals(new SimpleDateFormat("12/12/2012"), Post.getDate());
    }

    @Test
    public void testPost_getsNumberOfPostsInPost_true(){
    Post testPost=new Post(1,"drug","not good for brain","30/03/2000");
    Post testPost1=new Post(2,"medicine","good for brain","31/03/2000");
    assertEquals(2,Post.fetchAll().size());
    }

    @Test
    public void testPost_getsIndividualPostById_true(){
    Post testPost=new Post(1,"drug","not good for brain","30/03/2000");
    Post testPost1=new Post(2,"medicine","good for brain","31/03/2000");
    Post testPost2=new Post(3,"coding","too much may cause anurisms","18/05/2001");
    assertEquals((1, Post.fetchById(testpost.getId()).getId());
     }

     @Test
    public void testPost_deleteAllPosts_true(){
    Post testPost=new Post(1,"drug","not good for brain","30/03/2000");
    Post testPost1=new Post(2,"medicine","good for brain","31/03/2000");
    Post testPost2=new Post(3,"coding","too much may cause anurisms","18/05/2001");
    assertNull(Post.deleteAll());
    }

    @Test
    public void testPost_deletePostById_true(){
    Post testPost=new Post(1,"drug","not good for brain","30/03/2000");
    Post testPost1=new Post(2,"medicine","good for brain","31/03/2000");
    Post testPost2=new Post(3,"coding","too much may cause anurisms","18/05/2001");
    assertNull(testPost.deleteById(testPost.getId()));
    }

    @Test
    public void testPost_updatePostById_true(){
    Post testPost=new Post(1,"drug","not good for brain","30/03/2000");
    String newTitle =testPost.updatePostById().getTitle("tree");
    assertEquals(false,newTitle.equals(testPost.getTitle()));
    }
}
