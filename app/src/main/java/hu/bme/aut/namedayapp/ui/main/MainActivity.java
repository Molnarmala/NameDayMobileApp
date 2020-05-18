package hu.bme.aut.namedayapp.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import javax.inject.Inject;

import hu.bme.aut.namedayapp.NameDaySearchApplication;
import hu.bme.aut.namedayapp.R;
import hu.bme.aut.namedayapp.ui.about.AboutActivity;

public class MainActivity extends AppCompatActivity implements MainScreen, NavigationView.OnNavigationItemSelectedListener {
    private NavigationView bottomNavigationView;
    private Toolbar toolbar;

    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
System.out.println("ASD");
        setContentView(R.layout.activity_main);


        NameDaySearchApplication.injector.inject(this);

        bottomNavigationView = findViewById(R.id.nav_view);
        bottomNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                return false;
            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        switch (id){
            case R.id.nav_main:
                break;
            case R.id.nav_about:
                Intent intent1= new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent1);
                break;
        }
        return true;
    }

    @Override
    public void showWelcomeText(String text) {
        TextView placeHolderTextView = findViewById(R.id.placeholderTextView);
        placeHolderTextView.setText(text);
    }

    @Override
    public void onStart()
    {
        super.onStart();
        mainPresenter.attachScreen(this);
    }
}
/*

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, MainScreen{
    private BottomNavigationView bottomNavigationView;
    private Toolbar toolbar;

    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        NameDaySearchApplication.injector.inject(this);

        bottomNavigationView = findViewById(R.id.nav_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                return false;
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        mainPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        mainPresenter.detachScreen();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id=item.getItemId();
        switch (id){
            case R.id.nav_main:
                break;
            case R.id.nav_about:
                Intent intent1= new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent1);
                break;
        }
        return true;
    }

    @Override
    public void onResume(){
        super.onResume();
        mainPresenter.showWelcomeText();
    }

    @Override
    public void showWelcomeText(String text) {
        TextView placeHolderTextView = findViewById(R.id.placeholderTextView);
        placeHolderTextView.setText(text);

    }
}
*/
