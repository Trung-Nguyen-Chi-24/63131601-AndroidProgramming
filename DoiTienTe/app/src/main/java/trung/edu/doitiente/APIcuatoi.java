package trung.edu.doitiente;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APIcuatoi {
    @GET("latest")
    Call<Tygia> getRates(@Query("base") String base);
}

