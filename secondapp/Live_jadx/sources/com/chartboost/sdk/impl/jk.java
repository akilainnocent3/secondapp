package com.chartboost.sdk.impl;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public interface jk {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public static /* synthetic */ void a(jk jkVar, String str, int i10, boolean z10, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startDownloadIfPossible");
            }
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                i10 = 0;
            }
            if ((i11 & 4) != 0) {
                z10 = false;
            }
            jkVar.a(str, i10, z10);
        }
    }

    int a(tj tjVar);

    void a(Context context);

    void a(String str, int i10, boolean z10);

    void a(String str, String str2, boolean z10, r0 r0Var);

    boolean a(String str);

    tj b(String str);
}
