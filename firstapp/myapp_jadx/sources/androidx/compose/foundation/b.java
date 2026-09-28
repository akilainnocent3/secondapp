package androidx.compose.foundation;

import defpackage.btu;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static androidx.compose.ui.d a(int i, int i2, androidx.compose.ui.d dVar) {
        if ((i2 & 1) != 0) {
            i = 3;
        }
        return dVar.n(new MarqueeModifierElement(i, 1200, btu.a, 30.0f));
    }
}
