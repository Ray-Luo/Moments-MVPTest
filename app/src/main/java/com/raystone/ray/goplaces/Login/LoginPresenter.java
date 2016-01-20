package com.raystone.ray.goplaces.Login;

//import com.google.common.base.Preconditions;

/**
 * Created by Ray on 1/14/2016.
 */
public class LoginPresenter implements LoginContract.UserActionsListener{

    private final LoginContract.View mLoginView;

    public LoginPresenter( LoginContract.View loginView)
    {
        mLoginView = loginView;
    }

    @Override
    public void loginWithPassword()
    {
        mLoginView.checkPassword();
    }

    @Override
    public void jumpToRegister()
    {
        mLoginView.register();
    }

    @Override
    public void jumpToMap()
    {
        mLoginView.toMap();
    }
}
