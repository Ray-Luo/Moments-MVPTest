package com.raystone.ray.goplaces.PlaceDetail.ChoosePicLevel4;


import android.graphics.Bitmap;

/**
 * Created by Ray on 1/16/2016.
 */
public interface ViewPicContract {

    interface View
    {
        void delete();
        void confirm();
        void initListViews(Bitmap bitmap);
        void returnToDetail();
    }

    interface UserActionsListener
    {
        void deletePhoto();
        void confirmPhoto();
    }
}
