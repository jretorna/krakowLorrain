package retornaz.fr.krakow.view;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

import retornaz.fr.krakow.R;
import retornaz.fr.krakow.data.Item;

public class FragmentListview extends ListFragment {

    public static final String TAG = FragmentListview.class.getSimpleName();

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    public void loadData(List<Item> items) {
        setListAdapter(new ItemsAdapter(getActivity(), items));
    }

    /*---------- Adapter ------------*/

    public class ItemsAdapter extends BaseAdapter {

        List<Item> mItems;

        private LayoutInflater mInflater;
        private Context mContext;

        public ItemsAdapter(Context context, List<Item> items) {
            mItems = items;
            mInflater = LayoutInflater.from(context);
            mContext = context;
        }

        @Override
        public int getCount() {
            return mItems.size();
        }

        @Override
        public Object getItem(int position) {
            return mItems.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = convertView;
            if (convertView == null) {
                view = mInflater.inflate(R.layout.activity_eat_scroll, parent, false);
            }
            ((TextView) view.findViewById(R.id.textDescription)).setText(((Item) getItem(position)).getmTitle());
            ((TextView) view.findViewById(R.id.address1)).setText(((Item) getItem(position)).getmDescription());
            ((RatingBar) view.findViewById(R.id.Note)).setRating(((Item) getItem(position)).getmRate());
            setListenerOnMoreBtn(view, position);
            return view;
        }

        private void setListenerOnMoreBtn(View view, final int position) {
            view.findViewById(R.id.ViewMessageOne).setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    View fragment = ((MainActivity) mContext).findViewById(R.id.fragment2);
                    if (fragment == null) {
                        // Version smartphone
                    } else {
                        // Version tablette
                        Log.d(TAG, "clic !");
                        Item item = (Item) getItem(position);
                        ((MainActivity) getActivity()).showSubItem(item);
                    }
                }
            });
        }
    }
}