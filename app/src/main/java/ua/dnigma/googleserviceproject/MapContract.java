package ua.dnigma.googleserviceproject;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;

/**
 * Created by Даниил on 01.03.2018.
 */

public class MapContract {

    interface Presenter {

        void initMap();

    }

    interface View {

        Activity getContext();
    }

}
