package com.raystone.ray.goplaces_v1.Map;



import com.raystone.ray.goplaces.Map.MapContract;
import com.raystone.ray.goplaces.Map.MapPresenter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;

/**
 * Created by Ray on 1/17/2016.
 */
public class MapPresenterTest {

    @Mock
    private MapContract.View mMapView;

    private MapPresenter mMapPresenter;

    @Before
    public void setupMapPresenter()
    {
        MockitoAnnotations.initMocks(this);
        mMapPresenter = new MapPresenter(mMapView);
    }

    @Test
    public void searchAddress()
    {
        mMapPresenter.searchAddress();
        verify(mMapView).executeLocationTask();
    }

    @Test
    public void clickOnLocating_showCurrentLocation()
    {
        mMapPresenter.showCurrentLocation();
        verify(mMapView).currentLocation();
    }

    @Test
    public void clickOnPreviousMoment()
    {
        mMapPresenter.showPreviousMoment();
        verify(mMapView).previousMoment();
    }

    @Test
    public void clickOnNextMoment()
    {
        mMapPresenter.showNextMoment();
        verify(mMapView).nextMoment();
    }

    @Test
    public void clickOnMarker()
    {
        mMapPresenter.mapToDetail();
        verify(mMapView).toDetail();
    }

    @Test
    public void goToListMode()
    {
        mMapPresenter.mapToList();
        verify(mMapView).toList();
    }

    @Test
    public void showMomentsOnMap()
    {
        mMapPresenter.showMomentsOnMap();
        verify(mMapView).momentsOnMap();
    }
}
