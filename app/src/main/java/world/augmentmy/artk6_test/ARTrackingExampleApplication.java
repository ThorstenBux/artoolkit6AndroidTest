package world.augmentmy.artk6_test;

import android.app.Application;

import org.artoolkit.ar6.base.assets.AssetHelper;

/**
 * Created by thorstenbux on 7/4/2017.
 */

public class ARTrackingExampleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        AssetHelper assetHelper = new AssetHelper(getAssets());
        assetHelper.cacheAssetFolder(this,"Data");
    }
}
