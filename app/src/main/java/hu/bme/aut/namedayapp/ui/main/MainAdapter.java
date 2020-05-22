package hu.bme.aut.namedayapp.ui.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import hu.bme.aut.namedayapp.R;
import hu.bme.aut.namedayapp.model.NameDay;
import hu.bme.aut.namedayapp.utils.DateHelper;

@Singleton
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private
    List<NameDay> nameDays;
    private Context context;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView nameTextView;
        public TextView dateTextView;

        public ViewHolder(View itemView) {
            super(itemView);

            nameTextView = itemView.findViewById(R.id.nameDayName);
            dateTextView = itemView.findViewById(R.id.nameDayDate);
        }
    }

    @Inject
    public MainAdapter(){
    }

    public void setActivityContext(Context context){
        this.context=context;
    }

    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cardview_nameday, viewGroup, false);
        MainAdapter.ViewHolder vh = new MainAdapter.ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final MainAdapter.ViewHolder viewHolder, final int position) {
        viewHolder.nameTextView.setText(nameDays.get(position).getData().getNamedays().getHu());
        viewHolder.dateTextView.setText(DateHelper.ConvertToMonthAndDayFormat(nameDays.get(position).getData().getDates()));
    }

    @Override
    public int getItemCount() {
        return nameDays.size();
    }
}


