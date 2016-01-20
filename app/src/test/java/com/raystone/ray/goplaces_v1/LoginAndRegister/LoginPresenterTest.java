package com.raystone.ray.goplaces_v1.LoginAndRegister;

import com.raystone.ray.goplaces.Login.LoginContract;
import com.raystone.ray.goplaces.Login.LoginPresenter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;

/**
 * Created by Ray on 1/17/2016.
 */
public class LoginPresenterTest {

    @Mock
    private LoginContract.View mLoginView;

    private LoginPresenter mLoginPresenter;

    @Before
    public void setupLoginPresenter()
    {
        MockitoAnnotations.initMocks(this);
        mLoginPresenter = new LoginPresenter(mLoginView);
    }

    @Test
    public void clickOnSignIn_jumpToMapUI()
    {
        mLoginPresenter.loginWithPassword();
        verify(mLoginView).checkPassword();
    }

    @Test
    public void clickOnSignUp_jumpToRegisterUI()
    {
        mLoginPresenter.jumpToRegister();
        verify(mLoginView).register();
    }

    @Test
    public void clickOnSkip_jumpToMap()
    {
        mLoginPresenter.jumpToMap();
        verify(mLoginView).toMap();
    }
}
