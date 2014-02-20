package com.kaissersoft.FamousWorkout.fragments;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.kaissersoft.FamousWorkout.R;
import com.kaissersoft.FamousWorkout.pojos.Muscle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Christopher Herrera on 2/12/14.
 */
public class ExercisesTab extends Fragment {
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.exercises, null);
        Resources res = getResources();
        List<Integer> muscleDrawables = new ArrayList<Integer>();
        muscleDrawables.add(R.drawable.ic_launcher);//Biceps
        muscleDrawables.add(R.drawable.ic_launcher);//Triceps
        muscleDrawables.add(R.drawable.ic_launcher);//Shoulders
        muscleDrawables.add(R.drawable.ic_launcher);//Chest
        muscleDrawables.add(R.drawable.ic_launcher);//Back
        muscleDrawables.add(R.drawable.ic_launcher);//Abs
        muscleDrawables.add(R.drawable.ic_launcher);//Forearm
        muscleDrawables.add(R.drawable.ic_launcher);//Trapeze
        muscleDrawables.add(R.drawable.ic_launcher);//Legs
        muscleDrawables.add(R.drawable.ic_launcher);//Calves

        List<String> muscleTitleArray = new ArrayList<String>(Arrays.asList(res.getStringArray(R.array.exercises_titles)));
        List<String> muscleDescriptionArray = new ArrayList<String>(Arrays.asList(res.getStringArray(R.array.exercises_description)));

        ArrayList<Muscle> muscleList = new ArrayList<Muscle>(10);


        return rootView;
    }
    //==================================================================================================
    //METHODS
    //==================================================================================================

    //==================================================================================================
    //INNER CLASSES
    //==================================================================================================


}
