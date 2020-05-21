package hu.bme.aut.namedayapp.interactors;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
public class InteractorModule {

    @Inject
    NameDaySearchByNameInteractor provideNameDaySearchByNameInteractor(){
        return new NameDaySearchByNameInteractor();
    }

    @Provides
    NameDaySearchByDateInteractor provideNameDaySearchByDateInteractor(){
        return new NameDaySearchByDateInteractor();
    }
    @Provides
    ListPlaceHolderInteractor provideWelcomeTextInteractor(){
        return new ListPlaceHolderInteractor();
    }


}