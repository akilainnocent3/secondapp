package io.appmetrica.analytics.coreutils.internal;

import android.annotation.SuppressLint;
import android.os.Build;
import cs.o;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class AndroidUtils {

    @l
    public static final AndroidUtils INSTANCE = new AndroidUtils();

    private AndroidUtils() {
    }

    @SuppressLint({"AnnotateVersionCheck"})
    @o
    public static final boolean isApiAchieved(int i10) {
        return Build.VERSION.SDK_INT >= i10;
    }
}
