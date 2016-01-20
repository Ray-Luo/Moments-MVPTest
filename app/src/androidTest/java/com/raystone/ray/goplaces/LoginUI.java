package com.raystone.ray.goplaces;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.widget.GridView;
import android.widget.ImageView;

import com.raystone.ray.goplaces.Login.LoginActivity;

import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.contrib.DrawerActions.open;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.contrib.DrawerActions.openDrawer;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.*;
/**
 * Created by Ray on 1/18/2016.
 */
public class LoginUI {
    @Rule
    public ActivityTestRule<LoginActivity> mLoginActivityTestRule = new ActivityTestRule<>(LoginActivity.class);

    @Test
    public void clickRegister_openRegisterUI() throws Exception
    {
        onView(withId(R.id.sign_up)).perform(click());
        onView(withId(R.id.register_email)).check(matches(isDisplayed()));
    }

    @Test
    public void inputCredentialOnRegisterUI_openMapUI() throws Exception
    {
        String userName = "123@";
        String password = "123456789";

        // click on the "sign up" and go to register
        onView(withId(R.id.sign_up)).perform(click());
        // register
        onView(withId(R.id.register_email)).perform(typeText(userName));
        onView(withId(R.id.register_password)).perform(typeText(password));
        // click "register"
        onView(withId(R.id.register)).perform(click());
        onView(withId(R.id.address)).check(matches(isDisplayed()));

        Espresso.pressBack();

        //  to see if it can go to the map UI using the registered Credential
        onView(withId(R.id.email)).perform(typeText(userName));
        onView(withId(R.id.password)).perform(typeText(password));
        onView(withId(R.id.sign_in)).perform(click());
        onView(withId(R.id.address)).check(matches(isDisplayed()));
    }

    @Test
    public void clickFacebook_openMapUI()
    {
        onView(withId(R.id.sign_in_facebook)).perform(click());
        onView(withId(R.id.address)).check(matches(isDisplayed()));
    }

    @Test
    public void addPlace()
    {
        onView(withId(R.id.skip)).perform(click());
        openDrawer(R.id.drawer_layout);
        onView(withText("Add Moments")).perform(click());
        //  passed  onView(withId(R.id.noScrollgridview)).check(matches(isDisplayed()));
        onData(allOf(anything(),withId(R.id.noScrollgridview))).atPosition(0).perform(click());
    }
}
