package defpackage;

import androidx.compose.runtime.g;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class gqa0 implements oma, Iterable<Object>, dhp {
    public final g a;
    public final int b;
    public final h8l c;
    public final p250 d;

    public gqa0(g gVar, int i, h8l h8lVar, p250 p250Var) {
        this.a = gVar;
        this.b = i;
        this.c = h8lVar;
        this.d = p250Var;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new fqa0(this.a, this.b, this.c, this.d);
    }
}
