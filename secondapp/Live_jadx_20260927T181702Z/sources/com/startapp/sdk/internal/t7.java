package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f75538a;

    static {
        int[] iArr = new int[AdPreferences.Placement.values().length];
        f75538a = iArr;
        try {
            iArr[AdPreferences.Placement.INAPP_OFFER_WALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f75538a[AdPreferences.Placement.INAPP_OVERLAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f75538a[AdPreferences.Placement.INAPP_RETURN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f75538a[AdPreferences.Placement.INAPP_SPLASH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f75538a[AdPreferences.Placement.INAPP_FULL_SCREEN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f75538a[AdPreferences.Placement.INAPP_BROWSER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
