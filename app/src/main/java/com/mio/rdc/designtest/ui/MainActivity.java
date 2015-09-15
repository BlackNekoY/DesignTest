package com.mio.rdc.designtest.ui;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.mio.rdc.designtest.R;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private FloatingActionButton fabBtn;
    private Toolbar toolbar;
    private ActionBarDrawerToggle toggle;
    private DrawerLayout drawerLayout;
    private TabLayout tabLayout;
    private CollapsingToolbarLayout collapsingToolbarLayout;
    private AppBarLayout appBar;
    private NavigationView navigationView;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fabBtn = ((FloatingActionButton) findViewById(R.id.fab_btn));
        toolbar = ((Toolbar) findViewById(R.id.toolbar));
        drawerLayout = ((DrawerLayout) findViewById(R.id.drawer_layout));
//        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        appBar = (AppBarLayout) findViewById(R.id.appBarLayout);
        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsingToolbarLayout);
        navigationView = (NavigationView) findViewById(R.id.navigationView);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        collapsingToolbarLayout.setTitle("Design Library");

        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();

        fabBtn.setOnClickListener(this);
/*
        tabLayout.addTab(tabLayout.newTab().setText("Tab1"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab2"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab3"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab4"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab5"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab6"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab7"));*/

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fab_btn:
                Snackbar snackbar = Snackbar.make(findViewById(R.id.rootLayout), "Hi!I'm a snack bar!", Snackbar.LENGTH_INDEFINITE);
                snackbar.setAction("提示", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                    }
                });
                snackbar.show();
                break;
        }
    }
}
