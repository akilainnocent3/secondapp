package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.ui.d;

/* JADX INFO: loaded from: classes.dex */
public final class p2i implements e160, o2i {
    public static final p2i a = new p2i();

    @Override // defpackage.e160
    public final d a(float f, d dVar, boolean z) {
        if (f <= 0.0d) {
            ukn.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return dVar.n(new LayoutWeightElement(f, z));
    }

    @Override // defpackage.e160
    public final d b(d dVar, n54.b bVar) {
        return dVar.n(new VerticalAlignElement(bVar));
    }
}
