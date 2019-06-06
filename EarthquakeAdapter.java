import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * {@link EarthquakeAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link EarthQuake} objects.
 */
public class EarthquakeAdapter extends ArrayAdapter<EarthQuake>  {

    /**
     * Create a new {@link EarthquakeAdapter} object.
     *  @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param earthQuakes is the list of {@link EarthQuake}s to be displayed.
     */
    public EarthquakeAdapter(EarthquakeActivity context, ArrayList<EarthQuake> earthQuakes) {
        super(context, 0, earthQuakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earth_quake_list_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        EarthQuake currentEarthQuake = getItem(position);

        // Find the TextView in the song_item.xml layout with the ID name_of_song.
        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude);

        // Get the Song Name from the currentSong object and set this text on
        // the Song TextView.
        magnitudeTextView.setText(currentEarthQuake.getMagnitude());

        // Find the TextView in the song_item.xml layout with the ID name_of_artist

        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location);
        // Get the artist name from the currentSong object and set this text on
        // the artist name TextView.
        locationTextView.setText(currentEarthQuake.getLocation());

        //Find the TextView with ID Date

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);

        // Display the date in that TextView
        dateTextView.setText(currentEarthQuake.getDate());

        // Return the whole list item layout (containing 3 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }

    /**
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }

    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }**/
}
