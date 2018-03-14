package com.utng.edu.menuapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class ListActivity extends AppCompatActivity {

    //DATA SOURCE
    String[] names={"El Carruaje","El Delfín Pescados y Mariscos","Marcello Pizza","Pollo Sabroso","Restaurante La Provincia"};
    String[] positions={"Guanajuato 5\n" +
            "Tenedor libre · Agradable · Informal","Calle Veracruz 2\n" +
            "Agradable · Informal", "Avenida A, Av. Sur 38\n" +
            "Agradable · Informal","Michoacán 10\n" +
            "Solo dinero en efectivo · Agradable · Informal","Principal 4\n" +
            "Agradable · Informal · Grupos"};
    int[] images={R.drawable.carruaje, R.drawable.delfin,R.drawable.marcello_pizza,R.drawable.pollo_sabroso,
            R.drawable.provincia,R.drawable.toro_rojo,R.drawable.tortugas};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //REFERENCE RECYCLER
        RecyclerView rv= (RecyclerView) findViewById(R.id.myRecycler);

        //SET PROPERTIES
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setItemAnimator(new DefaultItemAnimator());

        //ADAPTER
        MyAdapter adapter=new MyAdapter(this,names,positions,images);
        rv.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list, menu);
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
