package com.raystone.ray.goplaces.PlaceDetail.ChoosePicLevel3;

/**
 * Created by Ray on 1/15/2016.
 */
public class PlaceDetailPresenter implements PlaceDetailContract.UserActionsListener{

    private final PlaceDetailContract.View mPlaceDetailView;

    public PlaceDetailPresenter(PlaceDetailContract.View placeDetailView)
    {this.mPlaceDetailView = placeDetailView;}

    @Override
    public void initializeData()
    {
        mPlaceDetailView.initialize();
    }

    @Override
    public void addPictures(int position)
    {
        mPlaceDetailView.add(position);
    }

    @Override
    public void findLocation()
    {
        mPlaceDetailView.locate();
    }

    @Override
    public void shareWithFacebook()
    {
        mPlaceDetailView.share();
    }

    @Override
    public void addNewPlaces()
    {
        mPlaceDetailView.addPlace();
    }

    @Override
    public void returnToMap()
    {
        mPlaceDetailView.toMap();
    }

    @Override
    public void addPicByGallery()
    {
        mPlaceDetailView.saveTempPlace();
        mPlaceDetailView.viewGallery();
    }

    @Override
    public void addPicByTakingPhoto()
    {
        mPlaceDetailView.saveTempPlace();
        mPlaceDetailView.camera();
    }



}
