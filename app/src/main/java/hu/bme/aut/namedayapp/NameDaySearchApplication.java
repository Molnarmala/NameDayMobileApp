package hu.bme.aut.namedayapp;

import android.app.Application;

import hu.bme.aut.namedayapp.interactors.InteractorModule;
import hu.bme.aut.namedayapp.ui.UIModule;

public class NameDaySearchApplication extends Application {
    private static NameDaySearchApplication sInstance;
    public NameDaySearchApplicationComponent injector;

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

    public NameDaySearchApplication() {
        sInstance = this;
    }

    public static NameDaySearchApplicationComponent getInstance() {
        return sInstance.getAppComponent();
    }

    private NameDaySearchApplicationComponent getAppComponent() {
        if (injector == null) {
            injector = DaggerNameDaySearchApplicationComponent.builder().
                    uIModule(
                            new UIModule(this)
                    ).build();
        }
        return injector;
    }
}
