package defpackage;

import androidx.compose.runtime.g;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class f8l implements Iterator<Object>, dhp {
    public final g a;
    public final int b;
    public int c;
    public final int d;

    public f8l(g gVar, int i, int i2) {
        this.a = gVar;
        this.b = i2;
        this.c = i;
        this.d = gVar.v;
        if (gVar.i) {
            j1a0.d();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        g gVar = this.a;
        int i = gVar.v;
        int i2 = this.d;
        if (i != i2) {
            j1a0.d();
        }
        int i3 = this.c;
        this.c = gVar.a[(i3 * 5) + 3] + i3;
        return new i1a0(gVar, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
