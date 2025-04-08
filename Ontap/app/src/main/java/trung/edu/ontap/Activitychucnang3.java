package trung.edu.ontap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class Activitychucnang3 extends AppCompatActivity {

    ListView listview1;
    ArrayAdapter<String> adapter;
    ArrayList<String> itemlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_activitychucnang3);
        listview1 = findViewById(R.id.listview);

        itemlist = new ArrayList<>();
        itemlist.add("Tiến về Sài Gòn");
        itemlist.add("Giải phóng Miền Nam");
        itemlist.add("Đất nước trọn niềm vui");
        itemlist.add("Bài ca tống nhất");
        itemlist.add("Mùa xuân trên than phố HCM");
        itemlist.add("...");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, itemlist);
        listview1.setAdapter(adapter);

        listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String NhanItem = itemlist.get(position);
                Intent intent = new Intent(Activitychucnang3.this, Item3Activity.class);
                intent.putExtra("NhanItem", NhanItem);
                startActivity(intent);
            }
        });
    }
}