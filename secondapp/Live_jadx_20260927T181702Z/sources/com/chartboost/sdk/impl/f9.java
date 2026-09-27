package com.chartboost.sdk.impl;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public interface f9 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public static /* synthetic */ Object a(f9 f9Var, Context context, String str, t tVar, or.f fVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load-BWLJW6A");
            }
            if ((i10 & 4) != 0) {
                tVar = new t(null, null, 3, null);
            }
            return f9Var.a(context, str, tVar, fVar);
        }
    }

    Object a(Context context, String str, t tVar, or.f fVar);

    Object a(Context context, or.f fVar);

    boolean a();

    void b();

    void c();
}
