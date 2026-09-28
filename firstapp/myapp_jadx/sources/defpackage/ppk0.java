package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class ppk0 implements Iterator {
    public int a = 0;
    public final /* synthetic */ ypk0 b;

    public ppk0(ypk0 ypk0Var) {
        this.b = ypk0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.a.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        String str = this.b.a;
        int i = this.a;
        if (i < str.length()) {
            this.a = i + 1;
            return new ypk0(String.valueOf(i));
        }
        lrh0.a();
        return null;
    }
}
