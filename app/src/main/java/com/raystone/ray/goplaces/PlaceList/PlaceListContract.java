package com.raystone.ray.goplaces.PlaceList;

/**
 * Created by Ray on 1/16/2016.
 */
public interface PlaceListContract {
    interface View{
        void update();
        void toEdit();
    }

    interface UserActionsListener{
        void updateUI();
        void listToEdit();
    }
}
