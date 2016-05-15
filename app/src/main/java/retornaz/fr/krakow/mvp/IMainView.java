package retornaz.fr.krakow.mvp;

import java.util.List;

import retornaz.fr.krakow.data.Item;
import retornaz.fr.krakow.data.SubItem;

/**
 * Created by Trooper on 15/05/2016.
 */
public interface IMainView {
    void displayItemsDatas(List<Item> items);
    void displaySubItemsDatas(List<SubItem> subItems);
    void showSubItem(Item item);
}
