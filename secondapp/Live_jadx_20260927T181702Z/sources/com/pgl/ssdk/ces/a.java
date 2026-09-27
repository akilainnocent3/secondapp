package com.pgl.ssdk.ces;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static native Object meta(int i10, Context context, Object obj);

    public static Object njss(int i10, Object obj) {
        try {
            b bVarE = b.e();
            if (bVarE != null) {
                return bVarE.a(i10, obj);
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
