package com.raystone.ray.goplaces_v1.PlaceList;

import com.raystone.ray.goplaces.PlaceList.PlaceListContract;
import com.raystone.ray.goplaces.PlaceList.PlaceListPresenter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;
/**
 * Created by Ray on 1/17/2016.
 */
public class PlaceListPresenterTest {

    @Mock
    private PlaceListContract.View mPlaceListView;

    private PlaceListPresenter mPlaceListPresenter;

    @Before
    public void setupPlaceDetailPresenter()
    {
        MockitoAnnotations.initMocks(this);
        mPlaceListPresenter = new PlaceListPresenter(mPlaceListView);
    }

    @Test
    public void updateUI()
    {
        mPlaceListPresenter.updateUI();
        verify(mPlaceListView).update();
    }

    @Test
    public void listToEdit()
    {
        mPlaceListPresenter.listToEdit();
        verify(mPlaceListView).toEdit();
    }


}
