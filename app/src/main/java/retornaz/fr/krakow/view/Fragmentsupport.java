package retornaz.fr.krakow.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import retornaz.fr.krakow.R;

public class Fragmentsupport extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_support);
        Intent intent = getIntent();

    }
}