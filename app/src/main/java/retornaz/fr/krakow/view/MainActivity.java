package retornaz.fr.krakow.view;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import java.util.List;

import retornaz.fr.krakow.R;
import retornaz.fr.krakow.data.Item;
import retornaz.fr.krakow.data.SubItem;
import retornaz.fr.krakow.mvp.IMainPresenter;
import retornaz.fr.krakow.mvp.IMainView;
import retornaz.fr.krakow.mvp.MainPresenter;


public class MainActivity extends FragmentActivity implements IMainView {

    private FragmentListview mListViewFragment;
    private FragmentWebview mWebViewFragment;
    private IMainPresenter mMainPresenter;
    private List<SubItem> mSubItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        mMainPresenter = new MainPresenter(this);
        mMainPresenter.loadItemsDatas();
        mMainPresenter.loadSubItemsDatas();
    }

    private void initView() {
        setContentView(R.layout.activity_main);
        mListViewFragment = (FragmentListview) getSupportFragmentManager().findFragmentById(R.id.fragment1);
        mWebViewFragment = (FragmentWebview) getSupportFragmentManager().findFragmentById(R.id.fragment2);
    }


    @Override
    public void displayItemsDatas(List<Item> items) {
        mListViewFragment.loadData(items);
    }

    @Override
    public void displaySubItemsDatas(List<SubItem> subItems) {
        mSubItems = subItems;
    }

    @Override
    public void showSubItem(Item item) {
        if (item != null && mSubItems != null && mSubItems.size() > 0) {
            for (SubItem sub : mSubItems) {
                if (sub.getParentId() == item.getmId()) {
                    mWebViewFragment.showSubItem(item, sub);
                }
            }
        }
    }

    public FragmentWebview getWebViewFragment() {
        return mWebViewFragment;
    }
}
