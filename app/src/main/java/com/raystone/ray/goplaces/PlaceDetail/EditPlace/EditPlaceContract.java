package com.raystone.ray.goplaces.PlaceDetail.EditPlace;

import android.graphics.Bitmap;

import com.raystone.ray.goplaces.Helper.Place;

import java.util.List;

/**
 * Created by Ray on 1/16/2016.
 */
public interface EditPlaceContract {

    interface View{
        void initialize();
        void add(int position);
        void locate();
        void share();
        void save();
        void toList();
        void viewGallery();
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
        void savePlaces();
        void returnToList();
        void addPicByGallery();
        void addPicByTakingPhoto();
    }

}
