package hu.bme.aut.namedayapp.ui.main;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.navigation.NavigationView;

import javax.inject.Inject;

import hu.bme.aut.namedayapp.NameDaySearchApplication;
import hu.bme.aut.namedayapp.R;

public class MainActivity extends AppCompatActivity implements MainScreen {
    private NavigationView bottomNavigationView;

    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NameDaySearchApplication app = new NameDaySearchApplication();
        NameDaySearchApplication.getInstance().inject(this);

        bottomNavigationView = findViewById(R.id.nav_view);
        bottomNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                return false;
            }
        });
    }

    @Override
    public void showWelcomeText(String text) {
        TextView placeHolderTextView = findViewById(R.id.placeholderTextView);
        placeHolderTextView.setText(text);
    }

    @Override
    public void onStart() {
        super.onStart();
        mainPresenter.attachScreen(this);
    }
}