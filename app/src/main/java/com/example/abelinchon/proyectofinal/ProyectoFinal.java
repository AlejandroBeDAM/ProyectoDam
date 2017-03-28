package com.example.abelinchon.proyectofinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class ProyectoFinal extends AppCompatActivity {
    private TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proyecto_final);
        inicializarTab();
    }

    private void inicializarTab() {
        tabHost = (TabHost)findViewById(R.id.tabhost);
        tabHost.setup();

        TabHost.TabSpec spec = tabHost.newTabSpec("Pestaña uno");
        spec.setContent(R.id.Peliculas);
        spec.setIndicator("Peliculas");
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec("Pestaña dos");
        spec.setContent(R.id.Series);
        spec.setIndicator("Series");
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec("Pestaña tres");
        spec.setContent(R.id.Anime);
        spec.setIndicator("Anime");
        tabHost.addTab(spec);
    }
}
