package com.raystone.ray.goplaces.Login;

/**
 * Created by Ray on 1/14/2016.
 */
public interface LoginContract {

    interface View{
        void checkPassword();
        void register();
        void toMap();
    }

    interface UserActionsListener{

        void loginWithPassword();
        void jumpToRegister();
        void jumpToMap();
    }
}
