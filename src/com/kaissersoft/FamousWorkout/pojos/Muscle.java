package com.kaissersoft.FamousWorkout.pojos;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import com.kaissersoft.FamousWorkout.R;
import com.kaissersoft.FamousWorkout.enums.MusclesEnum;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Christopher Herrera on 2/19/14.
 */
public class Muscle implements Serializable {

    //==================================================================================================================
    // CONSTANTS
    //==================================================================================================================
    private static final String TAG = "Muscle";
    //==================================================================================================================
    // CONSTRUCTORS
    //==================================================================================================================

    public Muscle(Context context, MusclesEnum tipo) {
        this.context = context;
        Resources res = context.getResources();
        this.muscleNames = res.getStringArray(R.array.exercises_titles);
        this.musclesDescriptions = res.getStringArray(R.array.exercises_description);

        this.muscleName = this.muscleNames[tipo.getIndex() - 1];
        this.muscleDescription = this.musclesDescriptions[tipo.getIndex() - 1];
        this.muscleIcon = getMuscleImage(tipo);
    }

    //==================================================================================================================
    // FIELDS
    //==================================================================================================================
    private String muscleName;
    private String muscleDescription;
    private Context context;
    private int muscleIcon;
    private String[] muscleNames;
    private String[] musclesDescriptions;

    //==================================================================================================================
    // GETTERS AND SETTERS
    //==================================================================================================================

    public String getMuscleName() {
        return muscleName;
    }

    public String getMuscleDescription() {
        return muscleDescription;
    }

    public int getMuscleIcon() {
        return muscleIcon;
    }

    //==================================================================================================================
    // METHODS
    //==================================================================================================================

    private int getMuscleImage(MusclesEnum indiceMusculo) {
        //@todo Llenar con Drawables correctos
        switch (indiceMusculo) {
            case BICEPS:
                return R.drawable.ic_launcher;
            case TRICEPS:
                return R.drawable.ic_launcher;
            case SHOULDERS:
                return R.drawable.ic_launcher;
            case CHEST:
                return R.drawable.ic_launcher;
            case BACK:
                return R.drawable.ic_launcher;
            case ABS:
                return R.drawable.ic_launcher;
            case FOREARM:
                return R.drawable.ic_launcher;
            case TRAPEZE:
                return R.drawable.ic_launcher;
            case LEGS:
                return R.drawable.ic_launcher;
            case CALVES:
                return R.drawable.ic_launcher;
            default:
                return R.drawable.ic_launcher;
        }
    }

    public static ArrayList<Muscle> getAllMuscles(Context context) {
        ArrayList<Muscle> muscleList = new ArrayList<Muscle>(12);

        for (MusclesEnum muscle : MusclesEnum.values()) {
            Log.d(TAG, String.valueOf(muscle.getIndex()));
            muscleList.add(new Muscle(context, muscle));
        }
        return muscleList;
    }


}
