package com.cleveradssolutions.adapters.exchange.rendering.video;

import android.util.LruCache;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LruCache f42586a = new LruCache(30);

    public static byte[] a(String str) {
        return (byte[]) f42586a.get(str);
    }

    public static boolean b(String str) {
        return f42586a.get(str) != null;
    }

    public static String c(String str) {
        String strSubstring = str.substring(str.lastIndexOf(to.c.userBaseDel));
        StringBuilder sb2 = new StringBuilder();
        int iLastIndexOf = strSubstring.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            strSubstring = strSubstring.substring(0, iLastIndexOf);
        }
        sb2.append(strSubstring);
        return sb2.toString();
    }

    public static void d(String str, byte[] bArr) {
        if (a(str) == null) {
            f42586a.put(str, bArr);
        }
    }
}
