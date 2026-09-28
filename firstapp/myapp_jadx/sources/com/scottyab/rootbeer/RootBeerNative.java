package com.scottyab.rootbeer;

import defpackage.ya30;

/* JADX INFO: loaded from: classes.dex */
public class RootBeerNative {
    public static final boolean a;

    static {
        try {
            System.loadLibrary("toolChecker");
            a = true;
        } catch (UnsatisfiedLinkError e) {
            ya30.a(e);
        }
    }

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z);
}
