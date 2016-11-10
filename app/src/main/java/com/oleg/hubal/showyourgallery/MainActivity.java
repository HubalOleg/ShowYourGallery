package com.oleg.hubal.showyourgallery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    private FrameLayout mDisplayContainer;
    private FrameLayout mGalleryContainer;

    private GalleryFragment mGalleryFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDisplayContainer = (FrameLayout) findViewById(R.id.fl_display_container);
        mGalleryContainer = (FrameLayout) findViewById(R.id.fl_gallery_container);

        mGalleryFragment = new GalleryFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_gallery_container, mGalleryFragment)
                .commit();
    }

}
