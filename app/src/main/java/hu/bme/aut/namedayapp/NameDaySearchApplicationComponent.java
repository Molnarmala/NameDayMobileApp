package hu.bme.aut.namedayapp;

import javax.inject.Singleton;

import dagger.Component;
import hu.bme.aut.namedayapp.interactors.InteractorModule;
import hu.bme.aut.namedayapp.ui.UIModule;
import hu.bme.aut.namedayapp.ui.about.AboutActivity;
import hu.bme.aut.namedayapp.ui.main.MainActivity;

@Singleton
@Component(modules = {UIModule.class, InteractorModule.class})
public interface NameDaySearchApplicationComponent
{

    void inject(MainActivity mainActivity);
    void inject(AboutActivity aboutActivity);

}