package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public static d a(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return new c(context);
        }
        if (i10 >= 24) {
            return new g(context);
        }
        return null;
    }
}
