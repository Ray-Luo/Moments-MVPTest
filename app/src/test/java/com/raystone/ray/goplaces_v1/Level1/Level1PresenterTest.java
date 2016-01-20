package com.raystone.ray.goplaces_v1.Level1;

import com.raystone.ray.goplaces.PlaceDetail.ChoosePicLevel1.Level1Contract;
import com.raystone.ray.goplaces.PlaceDetail.ChoosePicLevel1.Level1Presenter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.verify;
/**
 * Created by Ray on 1/17/2016.
 */
public class Level1PresenterTest {

    @Mock
    private Level1Contract.View mLevel1View;

    private Level1Presenter mLevel1Presenter;

    @Before
    public void setupLevel1Presenter()
    {
        MockitoAnnotations.initMocks(this);
        mLevel1Presenter = new Level1Presenter(mLevel1View);
    }

    @Test
    public void returnToMap()
    {
        mLevel1Presenter.returnToMap();
        verify(mLevel1View).toMap();
    }

    @Test
    public void toLevel2()
    {
        mLevel1Presenter.level1ToLevel2(anyInt());
        mLevel1View.toLevel2(anyInt());
    }
}
