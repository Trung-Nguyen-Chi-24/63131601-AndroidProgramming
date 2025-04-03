package trung.edu.luyentap5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class Activitycau2 extends AppCompatActivity {
    ListView listview;
    ArrayAdapter<String> adapter;
    ArrayList<String> itemlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_activitycau2);

        listview = findViewById(R.id.listview);

        itemlist = new ArrayList<>();
        itemlist.add("Lam Dong");
        itemlist.add("Dien Bien");
        itemlist.add("Phu Quoc");
        itemlist.add("Tien Giang");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, itemlist);
        listview.setAdapter(adapter);
        // Bắt sự kiện click item
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String NhanItem = itemlist.get(position);
                Intent intent = new Intent(Activitycau2.this, ItemActivity.class);
                intent.putExtra("NhanItem", NhanItem);
                startActivity(intent);
            }
        });
    }
}
