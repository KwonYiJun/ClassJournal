package classjournal.android.myapplicationdev.com.classjournal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvModule;
    ArrayList<String> al;
    ArrayAdapter<String> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvModule = (ListView)findViewById(R. id. lvModule);

        al = new ArrayList<String>();
        al.add("C347");

        aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, al);
        lvModule.setAdapter(aa);

        lvModule.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String year = al.get(position).toString();
                Intent i = new Intent(MainActivity.this, InfoActivity.class);
//                i.putExtra("year", year);
                startActivity(i);
            }
        });
    }
}
