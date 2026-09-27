package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Zn {
    public static boolean a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((Boolean) SystemServiceUtils.accessSystemServiceSafelyOrDefault((UserManager) context.getSystemService(UserManager.class), "detect unlocked user state", "User manager", Boolean.TRUE, new Yn())).booleanValue();
        }
        return true;
    }
}
