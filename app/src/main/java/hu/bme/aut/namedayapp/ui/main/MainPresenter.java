package hu.bme.aut.namedayapp.ui.main;

import javax.inject.Inject;

import hu.bme.aut.namedayapp.interactors.ListPlaceHolderInteractor;
import hu.bme.aut.namedayapp.ui.Presenter;

public class MainPresenter extends Presenter<MainScreen> {
    private ListPlaceHolderInteractor listPlaceHolderInteractor;

    @Inject
    public MainPresenter(){

    }

    @Override
    public void attachScreen(MainScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }

    public void showWelcomeText() {
        String text = listPlaceHolderInteractor.getWelcomeText();
        screen.showWelcomeText(text);
    }
}
