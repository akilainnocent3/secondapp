package com.fyber.inneractive.sdk.util;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i1 {
    public static String a(String str, int i10) {
        if (i10 <= 0 || str.length() <= i10) {
            return str;
        }
        return str.substring(0, i10 - 3) + "...";
    }
}
