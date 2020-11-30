package com.example.guide.Activity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager.widget.ViewPager;


import com.example.guide.AdapterClass.ViewPagerAdapter;
import com.example.guide.Fragments.AlertFrag;
import com.example.guide.Fragments.ClientFrag;
import com.example.guide.Fragments.CompletedDutiesFrag;
import com.example.guide.Fragments.Homefragment;
import com.example.guide.Fragments.PendingDutieFrag;
import com.example.guide.Model.Pending;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        side_barmenuicon=findViewById(R.id.side_navigationbar);
        final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
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

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

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
        return true;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item_menu, menu);
        return true;
    }
}