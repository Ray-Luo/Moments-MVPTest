package com.raystone.ray.goplaces.PlaceDetail.ChoosePicLevel1;

/**
 * Created by Ray on 1/15/2016.
 */
public class Level1Presenter implements Level1Contract.UserActionsListener {

    private final Level1Contract.View mLevel1View;

    public Level1Presenter(Level1Contract.View level1View)
    {this.mLevel1View = level1View;}

    @Override
    public void returnToMap()
    {
        mLevel1View.toMap();
    }

    @Override
    public void level1ToLevel2(int position)
    {
        mLevel1View.toLevel2(position);
    }
}
