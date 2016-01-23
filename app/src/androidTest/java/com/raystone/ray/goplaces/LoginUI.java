package com.raystone.ray.goplaces;

import android.support.annotation.IdRes;
import android.support.test.espresso.Espresso;

import android.support.test.espresso.UiController;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.GridView;


import com.raystone.ray.goplaces.Login.LoginActivity;
import com.raystone.ray.goplaces.PlaceDetail.ChoosePicLevel1.Level1Contract;


import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;



import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.swipeLeft;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.contrib.DrawerActions.open;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.isDescendantOfA;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withChild;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.contrib.DrawerActions.openDrawer;
import static android.support.test.espresso.matcher.ViewMatchers.withInputType;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.*;
import static com.google.common.base.Preconditions.checkArgument;
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
        String momentDescription = "what a great time!";
        onView(withId(R.id.skip)).perform(click());
        openDrawer(R.id.drawer_layout);
        onView(withText("Add Moments")).perform(click());
        onData(anything()).atPosition(0).perform(click());
        onView(withId(R.id.popupwindow_photo)).perform(click());
        onData(anything()).atPosition(8).perform(click());
        onData(anything()).atPosition(16).perform(click());
        onView(withId(R.id.bt)).perform(click());
        onView(withId(R.id.descrip)).perform(typeText(momentDescription));
        onView(withId(R.id.activity_selectimg_send)).perform(click());
    }

    @Test
    public void clickOnListItem()
    {
        onView(withId(R.id.skip)).perform(click());
        openDrawer(R.id.drawer_layout);
        onView(withText("View Moments List")).perform(click());
        //  There are several ways of clicking on a child of the RecyclerView;
        //onView(allOf(withId(R.id.place_description),withText("what"))).perform(click());
        onView(withItemText("what")).perform(click());
        onView(withId(R.id.descrip)).check(matches(isDisplayed()));
    }

    @Test
    public void showMomentsOnMap()
    {
        onView(withId(R.id.skip)).perform(click());
        openDrawer(R.id.drawer_layout);
        onView(withText("View Moments on Map")).perform(click());
        onView(withId(R.id.previous_moment)).perform(click());
    }

    @Test
    public void viewPicAndEdit()
    {
        onView(withId(R.id.skip)).perform(click());
        openDrawer(R.id.drawer_layout);
        onView(withText("View Moments List")).perform(click());
        onView(withText("what")).perform(click());
        onData(anything()).atPosition(0).perform(click());  //viewpager
        onView(withId(R.id.viewpager)).perform(swipeLeft());
        onView(withId(R.id.photo_bt_del)).perform(click());
        onView(withId(R.id.photo_bt_enter)).perform(click());
    }

    @Test
    public void viewPicInListMode()
    {
        onView(withId(R.id.skip)).perform(click());
        openDrawer(R.id.drawer_layout);
        onView(withText("View Moments List")).perform(click());
        //onView(withId(R.id.place_item_pics))
        onView(withId(R.id.place_recycle_view)).perform(RecyclerViewActions.actionOnItemAtPosition(4,clickOnChildViewWithId(R.id.place_item_pics)));
        onView(withId(R.id.viewpager)).perform(swipeLeft());
    }

/*
    public class ViewMatchers
    {
        @SuppressWarnings("unchecked")
        public  Matcher<View> withRecyclerView(@IdRes int viewId)
        {
            //return allOf(isAssignableFrom(RecyclerView.class),withId(viewId));
            return onView(withId(R.id.place_recycle_view)).perform(RecyclerViewActions.scrollToPosition(4));
        }

        @SuppressWarnings("unchecked")
        public ViewInteraction onRecyclerItemView(@IdRes int identifyingView, Matcher<View> identifyingMatcher, Matcher<View> childMatcher)
        {
            Matcher<View> view1 = withRecyclerView(R.id.place_recycle_view);
            onView(allOf(withId(identifyingView),identifyingMatcher)).perform(click());
            Matcher<View> itemView = allOf(withParent(withRecyclerView(R.id.place_recycle_view)),withChild(allOf(withId(identifyingView),identifyingMatcher)));
            return onView(allOf(isDescendantOfA(itemView),childMatcher));
        }
    }
    */

    //  This is used to perform click on a specific view within a item from a RecyclerView
    public ViewAction clickOnChildViewWithId(@IdRes final int resId)
    {
        return new ViewAction() {
            @Override
            public Matcher<View> getConstraints() {
                return null;
            }

            @Override
            public String getDescription() {
                return null;
            }

            @Override
            public void perform(UiController uiController, View view) {
                View v = view.findViewById(resId);
                if(v != null)
                {
                    if(v instanceof GridView)
                        ((GridView) v).performItemClick(v,0,0);
                    else
                        v.performClick();
                }
            }
        };
    }


    public Matcher<View> withItemText(final String itemText)
    {
        checkArgument(!TextUtils.isEmpty(itemText),"cannot be null");
        return new TypeSafeMatcher<View>() {
            @Override
            protected boolean matchesSafely(View item) {
                return allOf(isDescendantOfA(isAssignableFrom(RecyclerView.class)),withText(itemText)).matches(item);
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("is descendant of a RecyclerView with text" + itemText);
            }
        };
    }

}
