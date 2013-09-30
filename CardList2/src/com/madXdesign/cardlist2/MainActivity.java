package com.madXdesign.cardlist2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ActionBarActivity {
    private String[] textos = {
            "Etiam adipiscing congue eros a consequat. Praesent eu aliquet nisi. Nunc fringilla tincidunt enim, at viverra turpis semper at. Sed."
          , "Vestibulum mauris nunc, convallis eu porta ac, imperdiet in tortor. Duis dapibus augue et urna facilisis sagittis. Integer elit mauris."
          , "Donec eleifend ornare urna, id porta velit venenatis a. Nulla non neque eleifend, tincidunt ligula ut, luctus erat. Proin lorem."
    };
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = new ArrayAdapter<String>(this
                , R.layout.row_layout
                , android.R.id.text1
                , textos);
        ((ListView)findViewById(android.R.id.list)).setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
