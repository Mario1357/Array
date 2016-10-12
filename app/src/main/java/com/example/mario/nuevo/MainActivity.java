package com.example.mario.nuevo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = (ListView) findViewById(R.id.lista);

        final ArrayList<String> musica = new ArrayList<String>();

        musica.add("Banda");
        musica.add("Rock");
        musica.add("Metal");
        musica.add("Jazz");
        musica.add("Punk");
        musica.add("Pop");
        musica.add("Electronica");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, musica);


        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast toast =
                        Toast.makeText(getApplicationContext(),
                                "Tu musica favorita es " + musica.get(position), Toast.LENGTH_LONG);

                toast.show();
            }
        });

    }

}
