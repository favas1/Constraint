package com.project.constraint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

import com.project.constraint.adapters.AdapterGridview;
import com.project.model.model_grid;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView txtrs,txttot;
    private List<model_grid> list;
    private GridView gridv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        txtrs.setText(getString(R.string.Rs) + "1500");
        txttot.setText(getString(R.string.Rs) + " 3000 ");

        list = new ArrayList<>();
       list.add(new model_grid("Warehouse North","500"));
        list.add(new model_grid("Warehouse South","500"));
        list.add(new model_grid("Warehouse West","500"));
        list.add(new model_grid("Warehouse East","500"));
        list.add(new model_grid("Warehouse NothEast","500"));
        AdapterGridview adp = new AdapterGridview(getApplicationContext(), list);
        gridv1.setAdapter(adp);

    }

    private void init() {
        txtrs = findViewById(R.id.txtrs);
        gridv1=findViewById(R.id.gridv1);
        txttot=findViewById(R.id.txttot);
    }
}