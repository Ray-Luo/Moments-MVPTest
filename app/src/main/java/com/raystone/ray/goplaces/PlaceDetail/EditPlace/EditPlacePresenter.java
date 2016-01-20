package com.raystone.ray.goplaces.PlaceDetail.EditPlace;

/**
 * Created by Ray on 1/16/2016.
 */
public class EditPlacePresenter implements EditPlaceContract.UserActionsListener{

    private final EditPlaceContract.View mEditPlaceView;

    public EditPlacePresenter(EditPlaceContract.View editPlaceView)
    {this.mEditPlaceView = editPlaceView;}

    @Override
    public void initializeData()
    {
        mEditPlaceView.initialize();
    }

    @Override
    public void addPictures(int position)
    {
        mEditPlaceView.add(position);
    }

    @Override
    public void findLocation()
    {
        mEditPlaceView.locate();
    }

    @Override
    public void shareWithFacebook()
    {
        mEditPlaceView.share();
    }

    @Override
    public void savePlaces()
    {
        mEditPlaceView.save();
    }

    @Override
    public void addPicByGallery()
    {
        mEditPlaceView.viewGallery();
    }

    @Override
    public void addPicByTakingPhoto()
    {
        mEditPlaceView.camera();
    }

    @Override
    public void returnToList()
    {
        mEditPlaceView.toList();
    }
}
