package com.priya.recyclerviewcheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.priya.recyclerviewcheckbox.adapter.CarAdapter;
import com.priya.recyclerviewcheckbox.model.Car;

import java.util.ArrayList;

public class RecyclerViewCheckboxActivity extends AppCompatActivity {

   public ArrayList<Car>carlist;
   public CarAdapter carAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_checkbox);
        Button button=findViewById(R.id.Click1);
        Button button1=findViewById(R.id.ClickBt);
        Button button2=findViewById(R.id.Click2);

        RecyclerView recyclerView=findViewById(R.id.RecycleRv);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carAdapter.update1Status();
                carAdapter.notifyItemChanged(0);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carAdapter.update2Status();
                carAdapter.notifyItemChanged(1);


            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carAdapter.updateall();
                carAdapter.notifyDataSetChanged();
            }
        });



        carlist=new ArrayList<>();
        Car c1= new Car("Audi","Higher",2012,4000000);
        carlist.add(c1);
        Car c2= new Car("Hyundai","lower",2010,600000);
        carlist.add(c2);
        Car c3=new Car("Honda","medium",2016,5000000);
        carlist.add(c3);
        Car c4=new Car("Mercedes","higher",2017,60000000);
        carlist.add(c4);
        Car c5=new Car("Toyato","higher",2016,700000);
        carlist.add(c5);

          carAdapter=new CarAdapter(carlist,RecyclerViewCheckboxActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(carAdapter);
        carAdapter.getStatus();




    }
}
