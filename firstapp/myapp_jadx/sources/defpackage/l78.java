package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;

/* JADX INFO: loaded from: classes.dex */
public final class l78 implements j78 {
    public static final l78 a = new l78();

    @Override // defpackage.j78
    public final d a(float f, d dVar, boolean z) {
        if (f <= 0.0d) {
            ukn.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return dVar.n(new LayoutWeightElement(f, z));
    }

    @Override // defpackage.j78
    public final d c(n54.a aVar, d dVar) {
        return k78.a(aVar, dVar);
    }
}
