package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class xll0 implements Iterator {
    public int a = -1;
    public boolean b;
    public Iterator c;
    public final /* synthetic */ bml0 d;

    public final Iterator a() {
        Iterator it = this.c;
        if (it != null) {
            return it;
        }
        Iterator it2 = this.d.c.entrySet().iterator();
        this.c = it2;
        return it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a + 1;
        bml0 bml0Var = this.d;
        return i < bml0Var.b || (!bml0Var.c.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        bml0 bml0Var = this.d;
        return i < bml0Var.b ? (vll0) bml0Var.a[i] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            ib5.a("remove() was called before next()");
            return;
        }
        this.b = false;
        bml0 bml0Var = this.d;
        bml0Var.h();
        int i = this.a;
        if (i >= bml0Var.b) {
            a().remove();
        } else {
            this.a = i - 1;
            bml0Var.f(i);
        }
    }
}
