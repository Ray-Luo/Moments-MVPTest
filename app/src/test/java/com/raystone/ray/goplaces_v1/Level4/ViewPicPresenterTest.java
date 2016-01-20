package com.raystone.ray.goplaces_v1.Level4;

import com.raystone.ray.goplaces.PlaceDetail.ChoosePicLevel4.ViewPicContract;
import com.raystone.ray.goplaces.PlaceDetail.ChoosePicLevel4.ViewPicPresenter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;
/**
 * Created by Ray on 1/17/2016.
 */
public class ViewPicPresenterTest {

    @Mock
    private ViewPicContract.View mViewPicView;

    private ViewPicPresenter mViewPicPresenter;

    @Before
    public void setupPlaceDetailPresenter()
    {
        MockitoAnnotations.initMocks(this);
        mViewPicPresenter = new ViewPicPresenter(mViewPicView);
    }

    @Test
    public void clickOnDeleteButton()
    {
        mViewPicPresenter.deletePhoto();
        verify(mViewPicView).delete();
    }

    @Test
    public void clickOnConfirmButton()
    {
        mViewPicPresenter.confirmPhoto();
        verify(mViewPicView).confirm();
    }
}
