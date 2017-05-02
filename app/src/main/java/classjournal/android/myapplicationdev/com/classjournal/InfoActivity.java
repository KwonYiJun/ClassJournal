package classjournal.android.myapplicationdev.com.classjournal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by 15031795 on 2/5/2017.
 */

public class InfoActivity extends AppCompatActivity {

    Button btnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

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
