package com.ed.iu.saif.materialdesignnavdrawerwithtoolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //Pop Menu Work here
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //inflating menu
        getMenuInflater().inflate(R.menu.popup_menu,menu);
        return true;
    }

    //menu button click listner
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemclicked=item.getItemId();
        switch (itemclicked){
            case R.id.menuitem_1:
                Toast.makeText(this, "Item 1 Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuitem_2:
                Toast.makeText(this, "Item 2 Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuitem_3:
                Toast.makeText(this, "Item 3 Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuaction_1:
                Toast.makeText(this, "Action 1 Clicked", Toast.LENGTH_SHORT).show();
                break;
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
