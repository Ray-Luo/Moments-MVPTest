package com.raystone.ray.goplaces_v1.Level3;

import com.raystone.ray.goplaces.PlaceDetail.ChoosePicLevel3.PlaceDetailContract;
import com.raystone.ray.goplaces.PlaceDetail.ChoosePicLevel3.PlaceDetailPresenter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.verify;
/**
 * Created by Ray on 1/17/2016.
 */
public class PlaceDetailPresenterTest {

    @Mock
    private PlaceDetailContract.View mPlaceDetailView;

    private PlaceDetailPresenter mPlaceDetailPresenter;

    @Before
    public void setupPlaceDetailPresenter()
    {
        MockitoAnnotations.initMocks(this);
        mPlaceDetailPresenter = new PlaceDetailPresenter(mPlaceDetailView);
    }

    @Test
    public void initializeData()
    {
        mPlaceDetailPresenter.initializeData();
        verify(mPlaceDetailView).initialize();
    }

    @Test
    public void addPictures()
    {
        mPlaceDetailPresenter.addPictures(anyInt());
        verify(mPlaceDetailView).add(anyInt());
    }

    @Test
    public void clickOnLocationImageView()
    {
        mPlaceDetailPresenter.findLocation();
        verify(mPlaceDetailView).locate();
    }

    @Test
    public void click0nAddPlaceButton()
    {
        mPlaceDetailPresenter.addNewPlaces();
        verify(mPlaceDetailView).addPlace();
    }

    @Test
    public void returnToMap()
    {
        mPlaceDetailPresenter.returnToMap();
        verify(mPlaceDetailView).toMap();
    }

    @Test
    public void addPicturesByGallery()
    {
        mPlaceDetailPresenter.addPicByGallery();
        verify(mPlaceDetailView).viewGallery();
    }

    @Test
    public void addPicturesByTakingPhoto()
    {
        mPlaceDetailPresenter.addPicByTakingPhoto();
        verify(mPlaceDetailView).camera();
    }

    @Test
    public void shareWithFacebook()
    {
        mPlaceDetailPresenter.shareWithFacebook();
        verify(mPlaceDetailView).share();
    }
}
