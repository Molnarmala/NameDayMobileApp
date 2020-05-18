package hu.bme.aut.namedayapp.interactors;

import dagger.Module;
import dagger.Provides;

@Module
public class InteractorModule {

    public NameDaySearchByNameInteractor provideNameDaySearchByNameInteractor(){
        return new NameDaySearchByNameInteractor();
    }

    @Provides
    public NameDaySearchByDateInteractor provideNameDaySearchByDateInteractor(){
        return new NameDaySearchByDateInteractor();
    }
    @Provides
    public ListPlaceHolderInteractor provideWelcomeTextInteractor(){
        return new ListPlaceHolderInteractor();
    }


}