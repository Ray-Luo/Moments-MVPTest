package com.raystone.ray.goplaces.Map;

import com.google.android.gms.maps.MapFragment;

/**
 * Created by Ray on 1/15/2016.
 */
public interface MapContract {

    interface View
    {
        void executeLocationTask();
        void currentLocation();
        void previousMoment();
        void nextMoment();
        void momentsOnMap();
        void toDetail();
        void toList();
        MapFragment getMapFragment();
    }

    interface UserActionsListener
    {
        void searchAddress();
        void showCurrentLocation();
        void showPreviousMoment();
        void showNextMoment();
        void showMomentsOnMap();
        void mapToDetail();
        void mapToList();
    }
}
