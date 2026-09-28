package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class td80 implements Iterator<String>, dhp {
    public int a;
    public final /* synthetic */ sag b;

    public td80(sag sagVar) {
        this.b = sagVar;
        this.a = sagVar.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a > 0;
    }

    @Override // java.util.Iterator
    public final String next() {
        sag sagVar = this.b;
        int i = sagVar.c;
        int i2 = this.a;
        this.a = i2 - 1;
        return sagVar.e[i - i2];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
