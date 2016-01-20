package com.raystone.ray.goplaces.PlaceDetail.ChoosePicLevel2;

/**
 * Created by Ray on 1/15/2016.
 */
public class Level2Presenter implements Level2Contract.UserActionsListener{

    private final Level2Contract.View mLevel2View;

    public Level2Presenter(Level2Contract.View level2View)
    {this.mLevel2View = level2View;}

    @Override
    public void returnToMap()
    {
        mLevel2View.toMap();
    }

    @Override
    public void level2ToDetail()
    {
        mLevel2View.toDetail();
    }

    @Override
    public void numberOfSelectedPictures(int count)
    {
        mLevel2View.showNumber(count);
    }

    @Override
    public void finishPickingPictures()
    {
        mLevel2View.finishPicking();
    }

    @Override
    public void level2ToEditDetail()
    {
        mLevel2View.toEditDetail();
    }
}
