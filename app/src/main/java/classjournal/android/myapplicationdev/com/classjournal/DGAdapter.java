package classjournal.android.myapplicationdev.com.classjournal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 15017591 on 2/5/2017.
 */

public class DGAdapter extends ArrayAdapter<dailyGrade> {
    private ArrayList<dailyGrade> dG;
    private Context context;
    private TextView tvDG, textViewWeek;
    private ImageView ivDG;

    public DGAdapter(Context context, int resource, ArrayList<dailyGrade> objects){
        super(context, resource, objects);
        // Store the dailygrade that is passed to this adapter
        dG = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvDG = (TextView)rowView.findViewById(R.id.textViewDG);
        // Get the ImageView object
        ivDG = (ImageView)rowView.findViewById(R.id.imageViewDG);


        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the dailygrade at the same index.
        dailyGrade currentdG = dG.get(position);
        // Set the TextView to show the food

        tvDG.setText(currentdG.getDg());
        textViewWeek.append("" + currentdG.getWeek());
        // Set the image to star or nostar accordingly
        // Return the nicely done up View to the ListView
        return rowView;
    }

}


