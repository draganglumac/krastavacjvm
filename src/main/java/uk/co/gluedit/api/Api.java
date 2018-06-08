package uk.co.gluedit.api;

import retrofit2.Retrofit;
import uk.co.gluedit.api.model.Post;

import java.net.URL;

public class Api {

    private final URL url;
//    private final Retrofit fitty;

    public Api(URL uri) {
        this.url = uri;
    }

    public Post getPost(int id) {
        return null;
    }

}
