package c4q.com.new_recycler_view.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import c4q.com.new_recycler_view.Model;
import c4q.com.new_recycler_view.R;
import c4q.com.new_recycler_view.view.ModelHolder;

/**
 * Created by D on 11/11/17.
 */

public class Model_Adapter extends RecyclerView.Adapter<ModelHolder> {

    List<Model> modelList;

    public Model_Adapter( List<Model> modelList) {
        this.modelList = modelList;
    }


    @Override
    public ModelHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_model, parent, false);
        return new ModelHolder(childView);
    }

    @Override
    public void onBindViewHolder(ModelHolder holder, int position) {
        Model model = modelList.get(position);
        holder.onBind(model);

    }

    public int getItemCount() {
        return modelList.size();
    }





}
