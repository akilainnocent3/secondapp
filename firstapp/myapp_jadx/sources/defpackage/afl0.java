package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class afl0 implements Iterator {
    public int a = 0;
    public final int b;
    public final /* synthetic */ lfl0 c;

    public afl0(lfl0 lfl0Var) {
        this.c = lfl0Var;
        this.b = lfl0Var.c();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i < this.b) {
            this.a = i + 1;
            return Byte.valueOf(this.c.b(i));
        }
        lrh0.a();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
