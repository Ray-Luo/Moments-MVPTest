package com.raystone.ray.goplaces.PlaceDetail.ChoosePicLevel1;

/**
 * Created by Ray on 1/15/2016.
 */
public interface Level1Contract {

    interface View
    {
        void toMap();
        void toLevel2(int position);
    }

    interface UserActionsListener{
        void returnToMap();
        void level1ToLevel2(int position);
    }

}
