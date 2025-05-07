package trung.edu.doitiente;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public class TienteActivity extends AppCompatActivity {
    EditText etInput, etOutput;
    GridLayout gridLayout;
    Button btnSwap;
    String country;
    double rate = 1;
    boolean isForward = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiente);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        etInput = findViewById(R.id.etInput);
        etOutput = findViewById(R.id.etOutput);
        gridLayout = findViewById(R.id.gridLayout);
        btnSwap = findViewById(R.id.btnSwap);

        country = getIntent().getStringExtra("country");
        setToolbar(country);  // chỉ set Toolbar
        fetchExchangeRate();  // fetch online tỷ giá

        createNumberPad();

        btnSwap.setOnClickListener(v -> {
            isForward = !isForward;
            etInput.setText("");
            etOutput.setText("");
            if (isForward) {
                btnSwap.setText("VND ➔ Ngoại tệ");
            } else {
                btnSwap.setText("Ngoại tệ ➔ VND");
            }
        });

        toolbar.setNavigationOnClickListener(v -> finish());
    }

    private void setToolbar(String country) {
        Toolbar toolbar = findViewById(R.id.toolbar);

        switch (country) {
            case "My":
                toolbar.setTitle("Chuyển đổi VND - USD");
                toolbar.setNavigationIcon(R.drawable.co_us);
                break;
            case "China":
                toolbar.setTitle("Chuyển đổi VND - CNY");
                toolbar.setNavigationIcon(R.drawable.co_china);
                break;
            case "Korea":
                toolbar.setTitle("Chuyển đổi VND - KRW");
                toolbar.setNavigationIcon(R.drawable.co_korean);
                break;
            case "UK":
                toolbar.setTitle("Chuyển đổi VND - GBP");
                toolbar.setNavigationIcon(R.drawable.co_uk);
                break;
            default:
                toolbar.setTitle("Chuyển đổi tiền tệ");
                break;
        }
    }

    private void createNumberPad() {
        String[] buttons = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "=", "0", "C"};

        for (String text : buttons) {
            Button button = new Button(this);
            button.setText(text);
            button.setTextSize(24);
            button.setBackgroundResource(R.drawable.button_background);
            button.setTextColor(getResources().getColor(android.R.color.white));
            button.setOnClickListener(this::onButtonClick);
            gridLayout.addView(button);
        }
    }

    private void onButtonClick(View v) {
        Button b = (Button) v;
        String buttonText = b.getText().toString();
        String currentInput = etInput.getText().toString();

        if (buttonText.equals("=")) {
            convert();
        } else if (buttonText.equals("C")) {
            etInput.setText("");
            etOutput.setText("");
        } else {
            etInput.setText(currentInput + buttonText);
        }
    }

    private void convert() {
        String inputStr = etInput.getText().toString();
        if (!inputStr.isEmpty()) {
            double input = Double.parseDouble(inputStr);
            double output;

            if (isForward) {
                output = input * rate;
            } else {
                output = input / rate;
            }
            etOutput.setText(String.format("%.2f", output));
        }
    }

    // ========= Retrofit API ===========

    private void fetchExchangeRate() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.exchangerate-api.com/v4/") //
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APIcuatoi api = retrofit.create(APIcuatoi.class);
        Call<Tygia> call = api.getRates("VND");

        call.enqueue(new Callback<Tygia>() {
            @Override
            public void onResponse(Call<Tygia> call, Response<Tygia> response) {
                if (response.isSuccessful() && response.body() != null) {
                    Map<String, Double> ratesMap = response.body().rates;

                    // Lấy rate theo country
                    switch (country) {
                        case "US":
                            rate = ratesMap.get("USD");
                            break;
                        case "China":
                            rate = ratesMap.get("CNY");
                            break;
                        case "Korea":
                            rate = ratesMap.get("KRW");
                            break;
                        case "UK":
                            rate = ratesMap.get("GBP");
                            break;
                    }

                    Toast.makeText(TienteActivity.this, "Tỉ giá đã cập nhật: " + rate, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(TienteActivity.this, "Không lấy được tỉ giá.", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Tygia> call, Throwable t) {
                Toast.makeText(TienteActivity.this, "Lỗi mạng: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    // Interface cho Retrofit
    public interface APIcuatoi {
        @GET("latest/{base}")
        Call<Tygia> getRates(@Path("base") String base);
    }

    // Model response cho tỷ giá
    public static class Tygia {
        @SerializedName("rates")
        public Map<String, Double> rates;
    }
}
