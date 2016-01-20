package com.raystone.ray.goplaces_v1.EditPlace;

import com.raystone.ray.goplaces.PlaceDetail.EditPlace.EditPlaceContract;
import com.raystone.ray.goplaces.PlaceDetail.EditPlace.EditPlacePresenter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.verify;
/**
 * Created by Ray on 1/17/2016.
 */
public class EditPlacePresenterTest {

    @Mock
    private EditPlaceContract.View mEditPlaceView;

    private EditPlacePresenter mEditPlacePresenter;

    @Before
    public void setupPlaceDetailPresenter()
    {
        MockitoAnnotations.initMocks(this);
        mEditPlacePresenter = new EditPlacePresenter(mEditPlaceView);
    }

    @Test
    public void initializeData()
    {
        mEditPlacePresenter.initializeData();
        verify(mEditPlaceView).initialize();
    }

    @Test
    public void addPictures()
    {
        mEditPlacePresenter.addPictures(anyInt());
        verify(mEditPlaceView).add(anyInt());
    }

    @Test
    public void findLocation()
    {
        mEditPlacePresenter.findLocation();
        verify(mEditPlaceView).locate();
    }

    @Test
    public void shareWithFacebook()
    {
        mEditPlacePresenter.shareWithFacebook();
        verify(mEditPlaceView).share();
    }

    @Test
    public void savePlace()
    {
        mEditPlacePresenter.savePlaces();
        verify(mEditPlaceView).save();
    }

    @Test
    public void returnToList()
    {
        mEditPlacePresenter.returnToList();
        verify(mEditPlaceView).toList();
    }

    @Test
    public void addPicByGallery()
    {
        mEditPlacePresenter.addPicByGallery();
        verify(mEditPlaceView).viewGallery();
    }

    @Test
    public void addPicByTakingPhoto()
    {
        mEditPlacePresenter.addPicByTakingPhoto();
        verify(mEditPlaceView).camera();
    }

}
