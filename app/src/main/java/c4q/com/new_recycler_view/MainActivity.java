package c4q.com.new_recycler_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Display;

import java.util.ArrayList;
import java.util.List;

import c4q.com.new_recycler_view.controller.Model_Adapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView modelRecyclerView = (RecyclerView) findViewById(R.id.model_recycler);

        List<Model> models = new ArrayList<>();
        models.add(new Model(R.drawable.b_burgos,"Bernice Burgos","30","Fire!!"));
        models.add(new Model(R.drawable.s_santiago,"Stephanie Santiago","28",""));
        models.add(new Model(R.drawable.amirah_dyme,"Amirah Dyme","22","693k"));


        Model_Adapter modelAdapter = new Model_Adapter(models);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());


        modelRecyclerView.setAdapter(modelAdapter);
        modelRecyclerView.setLayoutManager(linearLayoutManager);

    }
}
