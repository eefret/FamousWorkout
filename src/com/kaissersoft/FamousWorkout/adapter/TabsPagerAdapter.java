package com.kaissersoft.FamousWorkout.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.kaissersoft.FamousWorkout.fragments.ExercisesTab;
import com.kaissersoft.FamousWorkout.fragments.FamousWorkoutTab;
import com.kaissersoft.FamousWorkout.fragments.PersonalWorkoutTab;

/**
 * Created by Christopher Herrera on 2/12/14.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {
        switch (index) {
            case 0:
                return new ExercisesTab();
            case 1:
                return new FamousWorkoutTab();
            case 2:
                return new PersonalWorkoutTab();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
