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
    Button btnInfo, btnEmail, btnAdd;

    int sizeOfWeeks;
    int requestCodeForGrade = 1;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        lvInfo = (ListView)findViewById(R.id.ListViewInfo);

        dG = new ArrayList<dailyGrade>();
        dG.add(new dailyGrade(1, "B"));
        dG.add(new dailyGrade(2, "C"));
        dG.add(new dailyGrade(3, "A"));

        aa = new DGAdapter(this, R.layout.row, dG);
        lvInfo.setAdapter(aa);

        btnInfo = (Button) findViewById(R.id.btnInfo);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnEmail = (Button) findViewById(R.id.btnEmail);

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent dipIntent = new Intent(Intent.ACTION_VIEW);
                dipIntent.setData(Uri.parse("http://www.rp.edu.sg/Diploma_in_Mobile_Software_Development_(R47).aspx"));
                startActivity(dipIntent);
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sizeOfWeeks = dG.size() + 1;
                Intent weeks = new Intent(InfoActivity.this, addDg.class);
                weeks.putExtra("week", dG.size() + 1 + "");
                startActivityForResult(weeks, requestCodeForGrade);
            }
        });

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL,
                        new String[]{"jason_lim@rp.edu.sg"});
                email.putExtra(Intent.EXTRA_SUBJECT,
                        "Test Email from C347");
                email.putExtra(Intent.EXTRA_TEXT,
                        "Hi faci \n\n I am.... \n Please read my remarks so far, thank you! \n" +
                                "" );
                // This MIME type indicates email
                email.setType("message/rfc822");
                // createChooser shows user a list of app that can handle
                // this MIME type, which is, email
                startActivity(Intent.createChooser(email,
                        "Choose an Email client :"));

            }
        });
    }

}
