package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class khx implements Iterator<ygx>, dhp {
    public int a = -1;
    public boolean b;
    public final /* synthetic */ lhx c;

    public khx(lhx lhxVar) {
        this.c = lhxVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a + 1 < this.c.b.e();
    }

    @Override // java.util.Iterator
    public final ygx next() {
        if (!hasNext()) {
            lrh0.a();
            return null;
        }
        this.b = true;
        esa0<ygx> esa0Var = this.c.b;
        int i = this.a + 1;
        this.a = i;
        return esa0Var.f(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            ib5.a("You must call next() before you can remove an element");
            return;
        }
        esa0<ygx> esa0Var = this.c.b;
        esa0Var.f(this.a).c = null;
        int i = this.a;
        Object[] objArr = esa0Var.c;
        Object obj = objArr[i];
        Object obj2 = fsa0.a;
        if (obj != obj2) {
            objArr[i] = obj2;
            esa0Var.a = true;
        }
        this.a = i - 1;
        this.b = false;
    }
}
