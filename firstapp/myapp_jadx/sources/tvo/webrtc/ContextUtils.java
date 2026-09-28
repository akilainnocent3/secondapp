package tvo.webrtc;

import android.content.Context;
import defpackage.hb5;

/* JADX INFO: loaded from: classes8.dex */
public class ContextUtils {
    private static final String TAG = "ContextUtils";
    private static Context applicationContext;

    @Deprecated
    public static Context getApplicationContext() {
        return applicationContext;
    }

    public static void initialize(Context context) {
        if (context != null) {
            applicationContext = context;
        } else {
            hb5.a("Application context cannot be null for ContextUtils.initialize.");
        }
    }
}
