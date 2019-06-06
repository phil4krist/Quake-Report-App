import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<EarthQuake> earthquakes = new ArrayList<>();
        earthquakes.add(new EarthQuake("7.2", " San Franscico", "November 12, 2018"));
        earthquakes.add(new EarthQuake("7.2", " San Franscico", "November 12, 2018"));
        earthquakes.add(new EarthQuake("7.2", " San Franscico", "November 12, 2018"));
        earthquakes.add(new EarthQuake("7.2", " San Franscico", "November 12, 2018"));
        earthquakes.add(new EarthQuake("7.2", " San Franscico", "November 12, 2018"));
        earthquakes.add(new EarthQuake("7.2", " San Franscico", "November 12, 2018"));

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new adapter that takes the list of earthquakes as inputs
        EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}

