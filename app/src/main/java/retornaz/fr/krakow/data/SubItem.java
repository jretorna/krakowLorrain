package retornaz.fr.krakow.data;

/**
 * Created by Trooper on 15/05/2016.
 */
public class SubItem {

    private int mParentId;
    private String mCommentary;

    public SubItem(int parentId, String commentary) {
        this.mParentId = parentId;
        this.mCommentary = commentary;
    }

    public int getParentId() {
        return mParentId;
    }

    public void setParentId(int parentId) {
        this.mParentId = parentId;
    }

    public String getCommentary() {
        return mCommentary;
    }

    public void setCommentary(String commentary) {
        this.mCommentary = commentary;
    }
}
