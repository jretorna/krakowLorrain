package retornaz.fr.krakow.data;

/**
 * Created by Trooper on 15/05/2016.
 */
public class Item {

    private int mId;
    private String mTitle;
    private String mDescription;
    private float mRate;

    public Item() { }

    public Item(int id, String mTitle, String mDescription, int mRate) {
        this.mId = id;
        this.mTitle = mTitle;
        this.mDescription = mDescription;
        this.mRate = mRate;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public float getmRate() {
        return mRate;
    }

    public void setmRate(float mRate) {
        this.mRate = mRate;
    }
}
