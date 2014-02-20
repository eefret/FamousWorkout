package com.kaissersoft.FamousWorkout.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.kaissersoft.FamousWorkout.R;
import com.kaissersoft.FamousWorkout.pojos.Muscle;

/**
 * Created by Christopher Herrera on 2/20/14.
 */
public class MuscleArrayListAdapter extends ArrayAdapter<Muscle> {

    //==================================================================================================================
    //FIELDS
    //==================================================================================================================
    private Context context;
    private Muscle[] muscleList;

    //==================================================================================================================
    //CONSTRUCTORS
    //==================================================================================================================
    public MuscleArrayListAdapter(Context context, Muscle[] objects) {
        super(context, R.layout.muscle_list_element, objects);
        this.context = context;
        this.muscleList = objects;
    }

    //==================================================================================================================
    //OVERRIDEN METHODS
    //==================================================================================================================

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View rowView = inflater.inflate(R.layout.muscle_list_element, parent, false);


        TextView muscleTitle = (TextView) rowView.findViewById(R.id.muscle_title);
        TextView muscleDescription = (TextView) rowView.findViewById(R.id.muscle_description);
        ImageView muscleImage = (ImageView) rowView.findViewById(R.id.muscle_image);

        muscleTitle.setText(muscleList[position].getMuscleName());
        muscleDescription.setText(muscleList[position].getMuscleDescription());
        muscleImage.setImageResource(muscleList[position].getMuscleIcon());
        muscleImage.setContentDescription(muscleList[position].getMuscleDescription());

        return rowView;
    }
}
