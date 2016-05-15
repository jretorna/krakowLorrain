package retornaz.fr.krakow.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import retornaz.fr.krakow.R;
import retornaz.fr.krakow.data.Item;
import retornaz.fr.krakow.data.SubItem;

public class FragmentWebview extends Fragment {

    TextView mCommentary;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentwebview, container, false);
        mCommentary = ((TextView) view.findViewById(R.id.commentary));
        mCommentary.setText("");
        return view;
    }

    public void showSubItem(Item item, SubItem subItem) {
        mCommentary.setText(subItem.getCommentary());
    }
}