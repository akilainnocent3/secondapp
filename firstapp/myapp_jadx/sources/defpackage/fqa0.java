package defpackage;

import androidx.compose.runtime.c;
import androidx.compose.runtime.g;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class fqa0 implements Iterator<Object>, dhp {
    public final g a;
    public final int b;
    public final h8l c;
    public final int d;
    public int e;

    public fqa0(g gVar, int i, h8l h8lVar, kni0 kni0Var) {
        this.a = gVar;
        this.b = i;
        this.c = h8lVar;
        this.d = gVar.v;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        ArrayList<Object> arrayList = this.c.a;
        return arrayList != null && this.e < arrayList.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        ArrayList<Object> arrayList = this.c.a;
        if (arrayList != null) {
            int i = this.e;
            this.e = i + 1;
            obj = arrayList.get(i);
        } else {
            obj = null;
        }
        boolean z = obj instanceof l00;
        g gVar = this.a;
        if (z) {
            return new i1a0(gVar, ((l00) obj).a, this.d);
        }
        if (obj instanceof h8l) {
            return new gqa0(gVar, this.b, (h8l) obj, new p250());
        }
        c.c("Unexpected group information structure");
        fkd.a();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
