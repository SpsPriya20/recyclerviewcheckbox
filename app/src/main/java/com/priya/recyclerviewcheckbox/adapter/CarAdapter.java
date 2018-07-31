package com.priya.recyclerviewcheckbox.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.priya.recyclerviewcheckbox.R;
import com.priya.recyclerviewcheckbox.model.Car;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.Carholder> {
    ArrayList<Car>carlist;
    Activity activity;

     private boolean status [];

    public CarAdapter (ArrayList<Car>carlist,Activity activity){
        this.activity=activity;
        this.carlist=carlist;
       status = new  boolean[carlist.size()];

    }
    @NonNull
    @Override
    public Carholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.car_adapter,parent,false);
        Carholder carholder=new Carholder(view);

        return carholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Carholder holder, int position) {
        holder.Carname.setText(carlist.get(position).getCarname());
        holder.Price.setText(carlist.get(position).getPrice()+"");
        holder.Model.setText(carlist.get(position).getModel());
        holder.Year.setText(carlist.get(position).getYear()+"");
        holder.checkBox.setChecked(status[position]);


    }

    @Override
    public int getItemCount() {
        return carlist.size();
    }

    class Carholder extends RecyclerView.ViewHolder{
        TextView Carname;
        TextView Model;
        TextView Year;
        TextView Price;
        CheckBox checkBox;
        public Carholder(View itemView) {
            super(itemView);
            Carname=itemView.findViewById(R.id.CarnameTv);
            Model=itemView.findViewById(R.id.ModelTv);
            Year=itemView.findViewById(R.id.YearTv);
            Price=itemView.findViewById(R.id.PriceTv);
            checkBox=itemView.findViewById(R.id.CheckCb);
        }
    }

    public boolean[] getStatus(){
        return status;
    }

    public ArrayList<Car>getCarlist(){
        return carlist;
    }
     public Activity getActivity(){
        return activity;
     }

     public void update1Status(){
        if (status[0]==true)
        status[0]=false;
        else{
            status[0]=true;
         }
     }
     public void update2Status(){
        if (status[1]==true)
        status[1]=false;
        else {
            status[1]=true;
        }
     }
     public void updateall(){
        for (int i=0; i<status.length;++i){
            status[i]=true;
        }
     }
}
