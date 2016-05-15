package retornaz.fr.krakow.mvp;

import java.util.ArrayList;
import java.util.List;

import retornaz.fr.krakow.data.Item;
import retornaz.fr.krakow.data.SubItem;

/**
 * Created by Trooper on 15/05/2016.
 */
public class MainPresenter implements IMainPresenter {

    private IMainView mView;

    public MainPresenter(IMainView view) {
        mView = view;
    }

    @Override
    public void loadItemsDatas() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(1,"Pate", "Manger des pates c'est vraiment cool", 1));
        items.add(new Item(2,"Porc", "Un bon bout de cochon", 2));
        items.add(new Item(3,"Riz", "C'est bon le riz", 3));
        items.add(new Item(4,"Dinde", "La dinde c'est bon pour la muscu ! Quoi de mieux qu'un bon riz-dinde", 4));
        mView.displayItemsDatas(items);
    }

    @Override
    public void loadSubItemsDatas() {
        List<SubItem> subItems = new ArrayList<>();
        subItems.add(new SubItem(1,"Je mange des pates"));
        subItems.add(new SubItem(3,"Je mange du riz"));
        subItems.add(new SubItem(4,"Je mange de la dinde"));
        subItems.add(new SubItem(2,"Je mange du porc"));
        mView.displaySubItemsDatas(subItems);
    }
}
