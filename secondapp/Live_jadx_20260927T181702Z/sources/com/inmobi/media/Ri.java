package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Ri {
    public static SharedPreferences a() {
        Context context = Ji.f54934a;
        String str = (context != null ? context.getPackageName() : null) + "_preferences";
        if (context != null) {
            return context.getSharedPreferences(str, 0);
        }
        return null;
    }
}
