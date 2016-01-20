package com.raystone.ray.goplaces.Map;

/**
 * Created by Ray on 1/15/2016.
 */
public class MapPresenter implements MapContract.UserActionsListener{

    private final MapContract.View mMapView;

    public MapPresenter(MapContract.View mapView)
    {this.mMapView = mapView;}

    @Override
    public void searchAddress()
    {
        mMapView.executeLocationTask();
    }

    @Override
    public void showCurrentLocation()
    {
        mMapView.currentLocation();
    }

    @Override
    public void showPreviousMoment()
    {
        mMapView.previousMoment();
    }

    @Override
    public void showNextMoment()
    {
        mMapView.nextMoment();
    }

    @Override
    public void showMomentsOnMap()
    {
        mMapView.momentsOnMap();
    }

    @Override
    public void mapToDetail()
    {
        mMapView.toDetail();
    }

    @Override
    public void mapToList()
    {
        mMapView.toList();
    }
}
