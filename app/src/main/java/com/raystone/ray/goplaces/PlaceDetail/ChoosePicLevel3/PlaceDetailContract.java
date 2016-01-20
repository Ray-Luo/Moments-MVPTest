package com.raystone.ray.goplaces.PlaceDetail.ChoosePicLevel3;

import android.graphics.Bitmap;

import com.raystone.ray.goplaces.Helper.Place;

import java.util.List;

/**
 * Created by Ray on 1/15/2016.
 */
public interface PlaceDetailContract {
    interface View{
        void initialize();
        void add(int position);
        void locate();
        void share();
        void addPlace();
        void toMap();
        void viewGallery();
        void saveTempPlace();
        void camera();
        void viewPics(int position);
        String listToString(List<String> str);
        List<Bitmap> getPics(Place place);
    }

    interface UserActionsListener{
        void initializeData();
        void addPictures(int position);
        void findLocation();
        void shareWithFacebook();
        void addNewPlaces();
        void returnToMap();
        void addPicByGallery();
        void addPicByTakingPhoto();
    }
}
