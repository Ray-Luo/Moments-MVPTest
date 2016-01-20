package com.raystone.ray.goplaces_v1.Level2;

import com.raystone.ray.goplaces.PlaceDetail.ChoosePicLevel2.Level2Contract;
import com.raystone.ray.goplaces.PlaceDetail.ChoosePicLevel2.Level2Presenter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.verify;
/**
 * Created by Ray on 1/17/2016.
 */
public class Level2PresenterTest {

    @Mock
    private Level2Contract.View mLevel2View;

    private Level2Presenter mLevel2Presenter;

    @Before
    public void setupLevel2Presenter()
    {
        MockitoAnnotations.initMocks(this);
        mLevel2Presenter = new Level2Presenter(mLevel2View);
    }

    @Test
    public void showNumberOfPicturesSelected()
    {
        mLevel2Presenter.numberOfSelectedPictures(anyInt());
        verify(mLevel2View).showNumber(anyInt());
    }

    @Test
    public void returnToMap()
    {
        mLevel2Presenter.returnToMap();
        verify(mLevel2View).toMap();
    }

    @Test
    public void finishPicking()
    {
        mLevel2Presenter.finishPickingPictures();
        verify(mLevel2View).finishPicking();
    }

    @Test
    public void toDetail()
    {
        mLevel2Presenter.level2ToDetail();
        verify(mLevel2View).toDetail();
    }

    @Test
    public void toEditDetail()
    {
        mLevel2Presenter.level2ToEditDetail();
        verify(mLevel2View).toEditDetail();
    }
}
