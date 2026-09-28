package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class jnk0 implements Iterator {
    public int a = 0;
    public final /* synthetic */ pnk0 b;

    public jnk0(pnk0 pnk0Var) {
        this.b = pnk0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.j();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.a;
        pnk0 pnk0Var = this.b;
        int iJ = pnk0Var.j();
        int i2 = this.a;
        if (i < iJ) {
            this.a = i2 + 1;
            return pnk0Var.k(i2);
        }
        ibh0.a(t7l.b(i2, "Out of bounds index: ", new StringBuilder(String.valueOf(i2).length() + 21)));
        return null;
    }
}
