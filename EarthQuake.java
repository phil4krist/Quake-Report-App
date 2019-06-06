public class EarthQuake {
    // Double value: Name of Song
    private String mMagnitude;

    // String value: Name of Artist
    private String mLocation;

    // String value: Length of Song
    private String mDate;


    // Define the constructor for the class
    public EarthQuake(String magnitude, String location, String date){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

// Creates method for retrieving the magnitude of the earthquake.

    public String getMagnitude() {
        return mMagnitude;
    }

    // Creates method for retrieving the location of the earthquake.

    public String getLocation() {
        return mLocation;
    }

    // Creates method for retrieving the date of earthquake.

    public String getDate() {
        return mDate;
    }

}
