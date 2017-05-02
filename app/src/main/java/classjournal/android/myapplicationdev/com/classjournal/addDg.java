package classjournal.android.myapplicationdev.com.classjournal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class addDg extends AppCompatActivity {

    RadioGroup rgOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_dg);

        Button btn = (Button) findViewById(R. id. buttonSubmit);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                // Get the RadioGroup object
                RadioGroup rg = (RadioGroup) findViewById(R.id.rg);
                // Get the Id of the selected radio button in the RadioGroup
                int selectedButtonId = rg.getCheckedRadioButtonId();
                // Get the radio button object from the Id we had gotten above
                RadioButton rb = (RadioButton) findViewById(selectedButtonId);
            }});
    }
}
