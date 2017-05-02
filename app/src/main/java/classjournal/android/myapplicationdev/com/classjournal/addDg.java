package classjournal.android.myapplicationdev.com.classjournal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class addDg extends AppCompatActivity {

    TextView tvWeek;
    dailyGrade dailyGrade;
    ArrayList<dailyGrade> dailyGrades;
    RadioGroup rg;
    RadioButton rb;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_dg);

        dailyGrades = new ArrayList<dailyGrade>();
        tvWeek = (TextView)findViewById(R.id.textViewWeek);
        btn = (Button) findViewById(R. id. buttonSubmit);

        Intent intentReceived = getIntent();
        String weeks = intentReceived.getStringExtra("week");
        tvWeek.setText("Week " + weeks);

        Intent intent = getIntent();

        dailyGrade grade = (dailyGrade) intent.getSerializableExtra("dg");

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                // Get the RadioGroup object
                rg = (RadioGroup) findViewById(R.id.rg);
                // Get the Id of the selected radio button in the RadioGroup
                int selectedButtonId = rg.getCheckedRadioButtonId();
                // Get the radio button object from the Id we had gotten above
                rb = (RadioButton) findViewById(selectedButtonId);

                Intent i = new Intent();
                i.putExtra("grade", rb.getText().toString());
                // Set result to RESULT_OK to indicate normal response and pass in the intent containing the data
                setResult(RESULT_OK, i);
                // Call this when your activity is done and should be closed.
                finish();
//                String dg = rb.getText().toString();
//                tvWeek.append(size);


            }});


    }
}
