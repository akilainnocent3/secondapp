package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import androidx.compose.ui.draw.SimpleDropShadowElement;
import androidx.compose.ui.draw.SimpleInnerShadowElement;

/* JADX INFO: loaded from: classes.dex */
public final class lx80 {
    public static final d a(d dVar, qx80 qx80Var, hx80 hx80Var) {
        return dVar.n(new SimpleDropShadowElement(qx80Var, hx80Var));
    }

    public static final d b(d dVar, qx80 qx80Var, hx80 hx80Var) {
        return dVar.n(new SimpleInnerShadowElement(qx80Var, hx80Var));
    }

    public static final d c(d dVar, float f, qx80 qx80Var, boolean z, long j, long j2) {
        return (Float.compare(f, 0.0f) > 0 || z) ? dVar.n(new ShadowGraphicsLayerElement(f, qx80Var, z, j, j2)) : dVar;
    }

    public static d d(d dVar, float f, qx80 qx80Var, boolean z, long j, long j2, int i) {
        if ((i & 2) != 0) {
            qx80Var = zk40.a;
        }
        qx80 qx80Var2 = qx80Var;
        if ((i & 4) != 0) {
            z = Float.compare(f, 0.0f) > 0;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            j = b7l.a;
        }
        return c(dVar, f, qx80Var2, z2, j, (i & 16) != 0 ? b7l.a : j2);
    }
}
