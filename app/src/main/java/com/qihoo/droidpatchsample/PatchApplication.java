package com.qihoo.droidpatchsample;

import android.app.Application;
import android.content.Context;

import com.qihoo.library.PatchHelper;
import com.qihoo.library.annotation.UnInject;


/**
 * Created by zhangying-pd on 2016/5/26.
 */
@UnInject
public class PatchApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        String hackFileName = "cat.dex";
        PatchHelper.getSingleton().loadPatchFromAssets(base, hackFileName);
        String patchFileName = "patch.dex";
        PatchHelper.getSingleton().loadPatchFromAssets(base, patchFileName);
        super.attachBaseContext(base);
    }
}
