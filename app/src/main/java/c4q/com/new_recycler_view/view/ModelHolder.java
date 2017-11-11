package c4q.com.new_recycler_view.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import c4q.com.new_recycler_view.Model;
import c4q.com.new_recycler_view.R;

/**
 * Created by D on 11/11/17.
 */

public class ModelHolder extends RecyclerView.ViewHolder {


    private ImageView model1;
    private TextView name;
    private TextView age;
    private TextView rating;


    public ModelHolder(View itemView) {
        super(itemView);

        model1 = (ImageView) itemView.findViewById(R.id.model);
        name = (TextView) itemView.findViewById(R.id.model_name_textview);
        age = (TextView) itemView.findViewById(R.id.model_age_textview);
        rating = (TextView) itemView.findViewById(R.id.model_rating_textview);
    }

    public void onBind(Model model) {
        name.setText("Name: " + model.getName());
        age.setText("Author: " + model.getAge());
        rating.setText("Instagram followers: " + model.getRating());
        model1.setImageResource(model.getModel());
    }
}
