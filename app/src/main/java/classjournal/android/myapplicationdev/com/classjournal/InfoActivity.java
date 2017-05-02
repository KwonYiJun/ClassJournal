package classjournal.android.myapplicationdev.com.classjournal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by 15031795 on 2/5/2017.
 */

public class InfoActivity extends AppCompatActivity {


    ListView lvInfo;
    ArrayAdapter aa;
    ArrayList<dailyGrade> dG;
    Button btnInfo;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        lvInfo = (ListView)findViewById(R.id.ListViewInfo);

        dG = new ArrayList<dailyGrade>();
        dG.add(new dailyGrade("1", "B"));
        dG.add(new dailyGrade("2", "C"));
        dG.add(new dailyGrade("3", "A"));

        aa = new DGAdapter(this, R.layout.row, dG);
        lvInfo.setAdapter(aa);

        btnInfo = (Button) findViewById(R.id.btnInfo);
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent dipIntent = new Intent(Intent.ACTION_VIEW);
                dipIntent.setData(Uri.parse("http://www.rp.edu.sg/Diploma_in_Mobile_Software_Development_(R47).aspx"));
                startActivity(dipIntent);
            }
        });
    }

}
