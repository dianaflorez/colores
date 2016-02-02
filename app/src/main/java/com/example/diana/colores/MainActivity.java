package com.example.diana.colores;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView cambiocolor;
    int swr=0, swa = 0, swaz = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cambiocolor = (TextView) findViewById(R.id.txt_cambiocolor);

    }

    public void onRBClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.r_rojo:
                if (checked)
                    // Pirates are the best
                    cambiocolor.setBackgroundColor(Color.parseColor("#F51212"));
                    cambiocolor.setText("Rojo");
                    break;
            case R.id.r_amarillo:
                if (checked)
                    cambiocolor.setBackgroundColor(Color.parseColor("#ECFA2C"));
                    cambiocolor.setText("Amarillo");
                    break;
            case R.id.r_azul:
                if (checked)
                    cambiocolor.setBackgroundColor(Color.parseColor("#277AA4"));
                cambiocolor.setText("Azul");
                break;
        }
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        /*
        if (view.getId() == R.id.r_rojo){

            cambiocolor.setBackgroundColor(Color.parseColor("#F51212"));
            cambiocolor.setText("Rojo....");
        }
        */
        // Check which checkbox was clicked

        switch(view.getId()) {
            case R.id.cb_rojo:
                if (checked)
                    swr = 1;
                else
                    swr = 0;
                break;
            case R.id.cb_amarillo:
                if (checked)
                    swa = 1;
                else
                    swa = 0;
                break;
            case R.id.cb_azul :
                if (checked)
                    swaz = 1;
                else
                    swaz = 0;
                break;
        }

        if (swr == 1 && swa == 0 && swaz == 0){
            cambiocolor.setBackgroundColor(Color.parseColor("#F51212"));
            cambiocolor.setText("Rojo...");
        }else if (swr == 0 && swa == 1 && swaz == 0){
            cambiocolor.setBackgroundColor(Color.parseColor("#ECFA2C"));
            cambiocolor.setText("Amarillo...");
        }else if (swr == 0 && swa == 0 && swaz == 1){
            cambiocolor.setBackgroundColor(Color.parseColor("#277AA4"));
            cambiocolor.setText("Azul");
        }else if (swr == 1 && swa == 1 && swaz == 0){
            cambiocolor.setBackgroundColor(Color.parseColor("#FC9D04"));
            cambiocolor.setText("Naranja");
        }else if (swr == 1 && swa == 0 && swaz == 1){
            cambiocolor.setBackgroundColor(Color.parseColor("#59048E"));
            cambiocolor.setText("Purpura");
        }else if (swr == 0 && swa == 1 && swaz == 1){
            cambiocolor.setBackgroundColor(Color.parseColor("#048E04"));
            cambiocolor.setText("Verde");
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
