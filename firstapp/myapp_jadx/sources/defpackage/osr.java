package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;

/* JADX INFO: loaded from: classes.dex */
public final class osr extends d.c implements psr {
    public gaj<? super t, ? super vhv, ? super kxa, ? extends biv> D;

    public osr() {
        throw null;
    }

    @Override // defpackage.psr
    public final biv e(t tVar, vhv vhvVar, long j) {
        return this.D.invoke(tVar, vhvVar, new kxa(j));
    }

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.D + ')';
    }
}
