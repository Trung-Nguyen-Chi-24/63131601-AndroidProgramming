package trung.edu.doitiente;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import androidx.appcompat.widget.Toolbar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tiente);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        etInput = findViewById(R.id.etInput);
        etOutput = findViewById(R.id.etOutput);
        gridLayout = findViewById(R.id.gridLayout);
        btnSwap = findViewById(R.id.btnSwap);

        country = getIntent().getStringExtra("country");
        setRateAndToolbar(country);
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

    private void setRateAndToolbar(String country) {
        Toolbar toolbar = findViewById(R.id.toolbar);

        switch (country) {
            case "My":
                rate = 0.000042;
                toolbar.setTitle("Chuyển đổi VND ↔ USD");
                toolbar.setNavigationIcon(R.drawable.co_us);
                break;
            case "China":
                rate = 0.00031;
                toolbar.setTitle("Chuyển đổi VND ↔ NDT");
                toolbar.setNavigationIcon(R.drawable.co_china);
                break;
            case "Korea":
                rate = 0.054;
                toolbar.setTitle("Chuyển đổi VND ↔ KRW");
                toolbar.setNavigationIcon(R.drawable.co_korean);
                break;
            case "UK":
                rate = 0.000033;
                toolbar.setTitle("Chuyển đổi VND ↔ GBP");
                toolbar.setNavigationIcon(R.drawable.co_uk);
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
}