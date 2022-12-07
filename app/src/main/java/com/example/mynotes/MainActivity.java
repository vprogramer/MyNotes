package com.example.mynotes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int menu_id = item.getItemId();
        switch(menu_id){
            case R.id.settings :
                System.out.println("settings");
                return true;
            case R.id.hidden_notes:
                System.out.println("hidden notes");
                return true;
            case R.id.open:
                System.out.println("open");
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

   public boolean onClick() {
        System.out.println("Ckicked");
        return true;
   }
}