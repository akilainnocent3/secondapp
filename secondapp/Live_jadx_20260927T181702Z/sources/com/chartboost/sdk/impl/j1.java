package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static j1 f39493a = new j1();

    public static j1 b() {
        return f39493a;
    }

    public Task a(Context context) {
        try {
            return AppSet.getClient(context).getAppSetIdInfo();
        } catch (Exception e10) {
            sb.b("Cannot retrieve appSetId client", e10);
            return null;
        }
    }

    public boolean a(CharSequence charSequence) {
        return TextUtils.isEmpty(charSequence);
    }

    public String a() {
        return Build.VERSION.RELEASE;
    }
}
