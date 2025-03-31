package trung.edu.luyentap3;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ActivityCau2 extends AppCompatActivity {
    ListView listview;
    ArrayAdapter<String> adapter;
    ArrayList<String> itemlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau2);
        listview = findViewById(R.id.listview);

        // Khởi tạo danh sách trước khi gán vào adapter
        itemlist = new ArrayList<>();
        itemlist.add("Da nang");
        itemlist.add("Nha Trang");
        itemlist.add("Phu Quoc");
        itemlist.add("Ha Noi");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, itemlist);
        listview.setAdapter(adapter);
    }

}