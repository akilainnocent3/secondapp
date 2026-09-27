package com.startapp.sdk.adsbase;

import android.R;
import android.app.Activity;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class ActivityExtra implements Serializable {
    private static final long serialVersionUID = 4821646469251112585L;
    private boolean isActivityFullScreen;

    public ActivityExtra(Activity activity) {
        this.isActivityFullScreen = (activity.getWindow().getAttributes().flags & 1024) != 0 ? true : activity.getTheme().obtainStyledAttributes(new int[]{R.attr.windowFullscreen}).getBoolean(0, false);
    }

    public final boolean a() {
        return this.isActivityFullScreen;
    }
}
