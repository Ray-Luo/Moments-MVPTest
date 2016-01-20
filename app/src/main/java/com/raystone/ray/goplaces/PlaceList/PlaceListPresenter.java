package com.raystone.ray.goplaces.PlaceList;

import com.raystone.ray.goplaces.Helper.MoveAmongFragments;

/**
 * Created by Ray on 1/16/2016.
 */
public class PlaceListPresenter implements PlaceListContract.UserActionsListener{

    private final PlaceListContract.View mPlaceListView;

    public PlaceListPresenter(PlaceListContract.View placeListView)
    {this.mPlaceListView = placeListView;}

    @Override
    public void updateUI()
    {
        mPlaceListView.update();
    }

    @Override
    public void listToEdit()
    {
        MoveAmongFragments.STATE = "LISTFROMPLACE";
        MoveAmongFragments.editPlaceMode = true;
        mPlaceListView.toEdit();
    }
}
