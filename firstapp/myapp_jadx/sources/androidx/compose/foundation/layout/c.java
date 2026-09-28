package androidx.compose.foundation.layout;

import defpackage.gnn;
import defpackage.kxa;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static androidx.compose.ui.d a(androidx.compose.ui.d dVar, float f) {
        return dVar.n(new AspectRatioElement(f, gnn.a));
    }

    public static final boolean b(int i, long j, int i2) {
        int iK = kxa.k(j);
        if (i > kxa.i(j) || iK > i) {
            return false;
        }
        return i2 <= kxa.h(j) && kxa.j(j) <= i2;
    }
}
