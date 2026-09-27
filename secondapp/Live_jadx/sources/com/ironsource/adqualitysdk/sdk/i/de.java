package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class de extends cz {
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m1828(List<Object> list) {
        return ke.m2850((View) cz.m1806(list, 0, View.class));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static WebView m1829(List<Object> list) {
        int iIntValue;
        Activity activity = (Activity) cz.m1806(list, 0, Activity.class);
        List arrayList = new ArrayList();
        String str = null;
        if (list.size() > 1) {
            iIntValue = ((Integer) cz.m1806(list, 1, Integer.class)).intValue();
            if (list.size() > 2) {
                str = (String) cz.m1806(list, 2, String.class);
                if (list.size() > 3) {
                    arrayList = (List) cz.m1806(list, 3, List.class);
                }
            }
        } else {
            iIntValue = -1;
        }
        return (WebView) ke.m2841(activity, WebView.class, iIntValue, arrayList, str);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static <E extends View> E m1830(List<Object> list) {
        return (E) ke.m2846((View) cz.m1806(list, 0, View.class), (Class) cz.m1806(list, 1, Class.class), ((Boolean) cz.m1806(list, 2, Boolean.class)).booleanValue());
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static View m1831(List<Object> list) {
        return ke.m2847((Activity) cz.m1806(list, 0, Activity.class));
    }
}
