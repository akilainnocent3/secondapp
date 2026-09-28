package androidx.compose.foundation.layout;

import defpackage.gnn;
import defpackage.pzo;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, pzo pzoVar) {
        return dVar.n(new IntrinsicHeightElement(pzoVar, gnn.a));
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar) {
        return dVar.n(new IntrinsicWidthElement(pzo.a, false, gnn.a));
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, pzo pzoVar) {
        return dVar.n(new IntrinsicWidthElement(pzoVar, true, gnn.a));
    }
}
