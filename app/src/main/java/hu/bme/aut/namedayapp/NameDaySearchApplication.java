package hu.bme.aut.namedayapp;

import android.app.Application;

import hu.bme.aut.namedayapp.interactors.InteractorModule;
import hu.bme.aut.namedayapp.ui.UIModule;

public class NameDaySearchApplication extends Application {

    public static NameDaySearchApplicationComponent injector;

    @Override
    public void onCreate(){
        super.onCreate();
        System.out.println("Oncreate called");
        injector = DaggerNameDaySearchApplicationComponent.builder().
                uIModule(
                        new UIModule(this)
                ).build();

        System.out.println("HERE HERE HERE : " + injector);
    }
}
