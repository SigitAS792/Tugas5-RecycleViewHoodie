package com.example.lenovo.recycleviewhoodie;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHoodie;
    private ArrayList<Hoodie> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvHoodie = findViewById(R.id.rv_sayur);
        rvHoodie.setHasFixedSize(true);

        list.addAll(HoodieData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvHoodie.setLayoutManager(new LinearLayoutManager(this));
        ListHoodie listHeroAdapter = new ListHoodie(list);
        rvHoodie.setAdapter(listHeroAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode (int selectedMode){
        switch (selectedMode){
            case R.id.action_list:
                showRecyclerList();
                break;
            case R.id.action_grid:
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                showRecyclerCardView();
                break;
        }
    }

    private void showRecyclerGrid(){
        rvHoodie.setLayoutManager(new GridLayoutManager(this, 2));
        GridHoodie gridHeroAdapter = new GridHoodie(list);
        rvHoodie.setAdapter(gridHeroAdapter);
    }

    private void showRecyclerCardView(){
        rvHoodie.setLayoutManager(new LinearLayoutManager(this));
        CardViewHoodie cardViewHeroAdapter = new CardViewHoodie(list);
        rvHoodie.setAdapter(cardViewHeroAdapter);
    }
}
