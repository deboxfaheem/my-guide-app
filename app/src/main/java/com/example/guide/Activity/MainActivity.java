package com.example.guide.Activity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.viewpager.widget.ViewPager;


import com.example.guide.AdapterClass.ViewPagerAdapter;
import com.example.guide.Fragments.CompletedTourFrag;
import com.example.guide.Fragments.Homefragment;
import com.example.guide.Fragments.PendingTourFrag;
import com.example.guide.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener, NavigationView.OnNavigationItemSelectedListener {

    private AppBarConfiguration mAppBarConfiguration;
    BottomNavigationView bottomNavigationView;
    private NavigationView navigationView;
    private ViewPager viewPager;
    private ViewPagerAdapter mViewPagerAdapter;
    private DrawerLayout mDrawer;
    private Toolbar toolbar;
    private NavigationView nvDrawer;
    ImageView side_barmenuicon;
    DrawerLayout drawer;
    Fragment fragment;
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        side_barmenuicon = findViewById(R.id.side_navigationbar);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        viewPager = findViewById(R.id.view_pager);
        mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mViewPagerAdapter);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new Homefragment()).commit();
        bottomNavigationView = findViewById(R.id.bottomnavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        NavigationView navigationView = findViewById(R.id.nav_view);
        side_barmenuicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.openDrawer(GravityCompat.START);
            }
        });
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

      viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }

        @Override
        public void onPageSelected(int position) {
            switch (position) {
                case 0:
                    bottomNavigationView.getMenu().findItem(R.id.nav_hometour).setChecked(true);
                    break;
                case 1:
                    bottomNavigationView.getMenu().findItem(R.id.nav_Pendingtours).setChecked(true);
                    break;
                case 2:
                    bottomNavigationView.getMenu().findItem(R.id.nav_deliveredtour).setChecked(true);
                    break;
                case 3:
                    bottomNavigationView.getMenu().findItem(R.id.nav_alertstour).setChecked(true);
                    break;
                case 4:
                    bottomNavigationView.getMenu().findItem(R.id.nav_nameclint).setChecked(true);
                    break;
            }
        }
//
        @Override
        public void onPageScrollStateChanged(int state) {

        }
    });
}
    //

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main_drawer, menu);
        return true;
    }
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.nav_tools) {
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
     @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()) {
            case R.id.nav_hometour:
                viewPager.setCurrentItem(0);
                break;
            case R.id.nav_Pendingtours:
                viewPager.setCurrentItem(1);
                break;
            case R.id.nav_deliveredtour:
                viewPager.setCurrentItem(2);
                break;
            case R.id.nav_alertstour:
                viewPager.setCurrentItem(3);
                break;
            case R.id.nav_nameclint:
                viewPager.setCurrentItem(4);
                break;
        }
        int id=menuItem.getItemId();
        if(id==R.id.sidenav_home){
            Toast.makeText(MainActivity.this, "Homefragment", Toast.LENGTH_LONG).show();
            viewPager.setCurrentItem(0);
        }
        else if(id==R.id.sidenav_pening) {
            Toast.makeText(MainActivity.this, "Pendingfragment", Toast.LENGTH_LONG).show();
            viewPager.setCurrentItem(1);
        }
        else if(id==R.id.sidenav_completed){
            viewPager.setCurrentItem(2);
        }
        else if(id==R.id.sidenav_alert){
            viewPager.setCurrentItem(3);
        }
        else if(id==R.id.sidenav_clint){
            viewPager.setCurrentItem(4);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }}

//
//    @Override
//    public void onPointerCaptureChanged(boolean hasCapture) {
//    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.item_menu, menu);
//        return true;
//    }
//}