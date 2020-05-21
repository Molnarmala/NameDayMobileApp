package hu.bme.aut.namedayapp.ui.about;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

public class AboutActivity extends AppCompatActivity implements AboutScreen {
    private TextView titleTextView;
    private TextView basicInformationTextView;
    private TextView versionInformationTextView;


    public AboutActivity()
    {

    }

    @Inject
    AboutAdapter aboutAdapter;
    @Inject
    AboutPresenter aboutPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    protected void onStart() {
        super.onStart();
        aboutPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        aboutPresenter.detachScreen();
    }

    @Override
    public void onResume(){
        super.onResume();
    }

    @Override
    public void getBasicInformation() {

    }

    @Override
    public void getVersionInformation() {

    }
}
