package com.kaissersoft.FamousWorkout.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.kaissersoft.FamousWorkout.R;

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
        return rootView;
    }
    //==================================================================================================
    //METHODS
    //==================================================================================================

    //==================================================================================================
    //INNER CLASSES
    //==================================================================================================


}
