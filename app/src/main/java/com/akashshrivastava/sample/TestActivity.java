package com.akashshrivastava.sample;


import android.content.Intent;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.akashshrivastava.verticalintrolibrary.MainActivity;
import com.akashshrivastava.verticalintrolibrary.VerticalIntro;
import com.akashshrivastava.verticalintrolibrary.VerticalIntroItem;

public class TestActivity extends VerticalIntro {

    @Override
    protected void init() {

        addIntroItem(new VerticalIntroItem.Builder()
                .backgroundColor(R.color.colorAccent)
                .image(R.drawable.intro_second_vector)
                .title("Lorem Ipsum Lorem Ipsum")
                .text("Lorem Ipsum is simply dummy text of the printing and typesetting industry." +
                        "Lorem Ipsum is simply dummy text of the printing and typesetting industry." +
                        "Lorem Ipsum is simply dummy text of the printing and typesetting industry.")
                .build());

        addIntroItem(new VerticalIntroItem.Builder()
                .backgroundColor(R.color.color2)
                .image(R.drawable.four)
                .title("Lorem Ipsum Lorem Ipsum ")
                .text("Lorem Ipsum is simply dummy text of the printing and typesetting industry." +
                        "Lorem Ipsum is simply dummy text of the printing and typesetting industry.")
                .build());

        addIntroItem(new VerticalIntroItem.Builder()
                .backgroundColor(R.color.color1)
                .image(R.drawable.four)
                .title("Lorem Ipsum Lorem Ipsum ")
                .text("Lorem Ipsum is simply dummy text of the printing and typesetting industry." +
                        "Lorem Ipsum is simply dummy text of the printing and typesetting industry.")
                .build());

        addIntroItem(new VerticalIntroItem.Builder()
                .backgroundColor(R.color.colorPrimary)
                .image(R.drawable.android)
                .title("Lorem Ipsum")
                .text("Lorem Ipsum is simply dummy text of the printing and typesetting industry.")
                .build());

        addIntroItem(new VerticalIntroItem.Builder()
                .backgroundColor(R.color.color3)
                .image(R.drawable.new_intro)
                .title("Lorem Ipsum")
                .text("Lorem Ipsum is simply dummy text of the printing and typesetting industry." +
                        "Lorem Ipsum is simply dummy text of the printing and typesetting industry." +
                        "Lorem Ipsum is simply dummy text of the printing and typesetting industry.")
                .build());

        setSkipEnabled(true);
        setVibrateEnabled(true);
//        setNextText("OK");
//        setDoneText("FINISH HIM");
//        setSkipText("GO GO");
        setVibrateIntensity(20);
        setCustomTypeFace(Typeface.createFromAsset(getAssets(), "fonts/NotoSans-Regular.ttf"));
    }

    @Override
    protected Integer setLastItemBottomViewColor() {
        return R.color.color2;
    }

    @Override
    protected void onSkipPressed(View view) {
        Log.e("onSkipPressed ", "onSkipPressed");
    }

    @Override
    protected void onFragmentChanged(int position) {
        Log.e("onFragmentChanged ", "" + position);
    }

    @Override
    public void onDonePressed() {
        Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(TestActivity.this, MainActivity.class);
        startActivity(i);

    }
}
