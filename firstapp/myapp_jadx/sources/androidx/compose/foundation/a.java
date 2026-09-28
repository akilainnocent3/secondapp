package androidx.compose.foundation;

import defpackage.gnn;
import defpackage.qx80;
import defpackage.ya5;
import defpackage.zk40;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static androidx.compose.ui.d a(androidx.compose.ui.d dVar, ya5 ya5Var, qx80 qx80Var, float f, int i) {
        if ((i & 2) != 0) {
            qx80Var = zk40.a;
        }
        qx80 qx80Var2 = qx80Var;
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        return dVar.n(new BackgroundElement(0L, ya5Var, f, qx80Var2, gnn.a, 1));
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, long j, qx80 qx80Var) {
        return dVar.n(new BackgroundElement(j, null, 1.0f, qx80Var, gnn.a, 2));
    }

    public static androidx.compose.ui.d c(long j, androidx.compose.ui.d dVar) {
        return b(dVar, j, zk40.a);
    }
}
