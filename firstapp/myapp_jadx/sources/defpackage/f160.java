package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.ui.d;

/* JADX INFO: loaded from: classes7.dex */
public final class f160 implements e160 {
    public static final f160 a = new f160();

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

    public final d d(d dVar) {
        return dVar.n(new WithAlignmentLineElement(mt.a));
    }
}
