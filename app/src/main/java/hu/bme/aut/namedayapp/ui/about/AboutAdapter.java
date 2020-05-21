package hu.bme.aut.namedayapp.ui.about;

import android.content.Context;
import android.widget.StackView;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AboutAdapter extends StackView {

    @Inject
    public AboutAdapter(Context context) {
        super(context);
    }


}