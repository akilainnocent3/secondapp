package defpackage;

import androidx.compose.runtime.g;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i1a0 implements oma, Iterable<Object>, dhp {
    public final g a;
    public final int b;
    public final int c;

    public i1a0(g gVar, int i, int i2) {
        this.a = gVar;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        g gVar = this.a;
        if (gVar.v != this.c) {
            j1a0.d();
        }
        int i = this.b;
        h8l h8lVarH = gVar.h(i);
        return h8lVarH != null ? new fqa0(gVar, i, h8lVarH, new l20()) : new f8l(gVar, i + 1, gVar.a[(i * 5) + 3] + i);
    }
}
