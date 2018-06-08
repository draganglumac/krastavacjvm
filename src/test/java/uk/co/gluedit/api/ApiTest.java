package uk.co.gluedit.api;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import uk.co.gluedit.api.model.Post;

import java.net.URL;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ApiTest {

    private Api api;

    @Before
    public void setUp() throws Exception {
        URL url = new URL("http://localhost:3000");
        api = new Api(url);
    }

    @Test
    public void getFirstPost() {
        Post firstPost = api.getPost(1);

        assertEquals(firstPost.id, 1);
        assertEquals(firstPost.title, "json-server");
        assertEquals(firstPost.author, "typicode");
    }
}
