package hu.bme.aut.namedayapp.ui.about;

import javax.inject.Inject;

import hu.bme.aut.namedayapp.interactors.NameDaySearchByDateInteractor;
import hu.bme.aut.namedayapp.ui.Presenter;

public class AboutPresenter extends Presenter<AboutScreen> {
    private NameDaySearchByDateInteractor nameDaySearchByDateInteractor;

    @Inject
    public AboutPresenter(){
       // this.nameDaySearchByDateInteractor = nameDaySearchByDateInteractor;
    }

    @Override
    public void attachScreen(AboutScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }

    public void getBasicInformation(){
        screen.getBasicInformation();
    }

    public void getVersionInformation(){
        screen.getVersionInformation();
    }
}