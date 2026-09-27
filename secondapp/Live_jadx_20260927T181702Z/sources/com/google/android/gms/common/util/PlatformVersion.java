package com.google.android.gms.common.util;

import android.os.Build;
import com.google.android.gms.common.annotation.KeepForSdk;
import k.j;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@KeepForSdk
public final class PlatformVersion {
    private PlatformVersion() {
    }

    @j(api = 11)
    @KeepForSdk
    @Deprecated
    public static boolean isAtLeastHoneycomb() {
        return true;
    }

    @j(api = 12)
    @KeepForSdk
    @Deprecated
    public static boolean isAtLeastHoneycombMR1() {
        return true;
    }

    @j(api = 14)
    @KeepForSdk
    @Deprecated
    public static boolean isAtLeastIceCreamSandwich() {
        return true;
    }

    @j(api = 15)
    @KeepForSdk
    @Deprecated
    public static boolean isAtLeastIceCreamSandwichMR1() {
        return true;
    }

    @j(api = 16)
    @KeepForSdk
    @Deprecated
    public static boolean isAtLeastJellyBean() {
        return true;
    }

    @j(api = 17)
    @KeepForSdk
    @Deprecated
    public static boolean isAtLeastJellyBeanMR1() {
        return true;
    }

    @j(api = 18)
    @KeepForSdk
    @Deprecated
    public static boolean isAtLeastJellyBeanMR2() {
        return true;
    }

    @j(api = 19)
    @KeepForSdk
    @Deprecated
    public static boolean isAtLeastKitKat() {
        return true;
    }

    @j(api = 20)
    @KeepForSdk
    @Deprecated
    public static boolean isAtLeastKitKatWatch() {
        return true;
    }

    @j(api = 21)
    @KeepForSdk
    @Deprecated
    public static boolean isAtLeastLollipop() {
        return true;
    }

    @j(api = 22)
    @KeepForSdk
    @Deprecated
    public static boolean isAtLeastLollipopMR1() {
        return true;
    }

    @j(api = 23)
    @KeepForSdk
    @Deprecated
    public static boolean isAtLeastM() {
        return true;
    }

    @j(api = 24)
    @KeepForSdk
    public static boolean isAtLeastN() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @j(api = 26)
    @KeepForSdk
    public static boolean isAtLeastO() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @j(api = 28)
    @KeepForSdk
    public static boolean isAtLeastP() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @j(api = 29)
    @KeepForSdk
    public static boolean isAtLeastQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @j(api = 30)
    @KeepForSdk
    public static boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @j(api = 31)
    @KeepForSdk
    public static boolean isAtLeastS() {
        return Build.VERSION.SDK_INT >= 31;
    }

    @j(api = 32)
    @KeepForSdk
    public static boolean isAtLeastSv2() {
        return Build.VERSION.SDK_INT >= 32;
    }

    @j(api = 33)
    @KeepForSdk
    public static boolean isAtLeastT() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @j(api = 34)
    @KeepForSdk
    public static boolean isAtLeastU() {
        return Build.VERSION.SDK_INT >= 34;
    }

    @j(api = 35)
    @KeepForSdk
    public static boolean isAtLeastV() {
        return u1.a.m();
    }
}
