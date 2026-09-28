package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class zdk0 extends xdk0 {
    public static final Object[] f;
    public static final zdk0 i;
    public final transient Object[] d;
    public final transient Object[] e;

    static {
        Object[] objArr = new Object[0];
        f = objArr;
        i = new zdk0(objArr, objArr);
    }

    public zdk0(Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = objArr2;
    }

    @Override // defpackage.tdk0
    public final void a(Object[] objArr) {
        System.arraycopy(this.d, 0, objArr, 0, 0);
    }

    @Override // defpackage.tdk0
    public final int b() {
        return 0;
    }

    @Override // defpackage.tdk0
    public final int c() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.e.length;
        return false;
    }

    @Override // defpackage.tdk0
    public final Object[] d() {
        return this.d;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        wdk0 wdk0Var = this.b;
        if (wdk0Var == null) {
            udk0 udk0Var = wdk0.b;
            wdk0Var = ydk0.d;
            this.b = wdk0Var;
        }
        return wdk0Var.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }

    @Override // defpackage.xdk0
    public final void e() {
    }
}
