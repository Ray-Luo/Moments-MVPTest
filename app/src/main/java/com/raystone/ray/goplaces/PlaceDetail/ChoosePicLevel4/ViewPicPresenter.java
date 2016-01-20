package com.raystone.ray.goplaces.PlaceDetail.ChoosePicLevel4;

/**
 * Created by Ray on 1/16/2016.
 */
public class ViewPicPresenter implements ViewPicContract.UserActionsListener {

    private final ViewPicContract.View mViewPicView;

    public ViewPicPresenter(ViewPicContract.View viewPic)
    {this.mViewPicView = viewPic;}

    @Override
    public void deletePhoto()
    {
        mViewPicView.delete();
    }

    @Override
    public void confirmPhoto()
    {
        mViewPicView.confirm();
    }
}
