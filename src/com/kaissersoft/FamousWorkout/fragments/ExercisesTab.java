package com.kaissersoft.FamousWorkout.fragments;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.kaissersoft.FamousWorkout.R;
import com.kaissersoft.FamousWorkout.adapter.MuscleArrayListAdapter;
import com.kaissersoft.FamousWorkout.pojos.Muscle;

import java.util.ArrayList;

/**
 * Created by Christopher Herrera on 2/12/14.
 */
public class ExercisesTab extends ListFragment {
    //==================================================================================================
    //CONSTANTS
    //==================================================================================================

    //==================================================================================================
    //LOCAL VARIABLES
    //==================================================================================================

    View rootView;
    //==================================================================================================
    //OVERRIDEN METHODS
    //==================================================================================================


    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        TextView titulo = (TextView) v.findViewById(R.id.muscle_title);
        Toast.makeText(getActivity(), titulo.getText(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.exercises, null);
        ArrayList<Muscle> muscleArrayList = Muscle.getAllMuscles(inflater.getContext());
        Muscle[] musclesList = muscleArrayList.toArray(new Muscle[muscleArrayList.size()]);
        MuscleArrayListAdapter adapter = new MuscleArrayListAdapter(
                inflater.getContext(), musclesList);
        setListAdapter(adapter);

        return rootView;
    }
    //==================================================================================================
    //METHODS
    //==================================================================================================

    //==================================================================================================
    //INNER CLASSES
    //==================================================================================================


}
