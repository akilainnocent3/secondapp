package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class x0l0 extends v0l0 {
    public static final x0l0 e = new x0l0(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public x0l0(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.p0l0
    public final Object[] a() {
        return this.c;
    }

    @Override // defpackage.p0l0
    public final int b() {
        return 0;
    }

    @Override // defpackage.p0l0
    public final int c() {
        return this.d;
    }

    @Override // defpackage.p0l0
    public final boolean e() {
        return false;
    }

    @Override // defpackage.v0l0, defpackage.p0l0
    public final void f(Object[] objArr) {
        System.arraycopy(this.c, 0, objArr, 0, this.d);
    }

    @Override // java.util.List
    public final Object get(int i) {
        j0l0.a(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
