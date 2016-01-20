package com.raystone.ray.goplaces.PlaceDetail.ChoosePicLevel2;

/**
 * Created by Ray on 1/15/2016.
 */
public interface Level2Contract {

    interface View
    {
        void toMap();
        void toDetail();
        void showNumber(int count);
        void finishPicking();
        void toEditDetail();
    }

    interface UserActionsListener
    {
        void returnToMap();
        void level2ToDetail();
        void numberOfSelectedPictures(int count);
        void finishPickingPictures();
        void level2ToEditDetail();
    }
}
