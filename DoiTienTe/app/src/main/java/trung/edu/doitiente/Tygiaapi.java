package trung.edu.doitiente;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Tygiaapi {
    @GET("v4/latest/{base}")
    Call<Tygia> getRates(@Path("base") String base);
}
