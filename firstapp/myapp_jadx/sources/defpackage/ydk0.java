package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class ydk0 extends wdk0 {
    public static final ydk0 d = new ydk0(new Object[0]);
    public final transient Object[] c;

    public ydk0(Object[] objArr) {
        this.c = objArr;
    }

    @Override // defpackage.wdk0, defpackage.tdk0
    public final void a(Object[] objArr) {
        System.arraycopy(this.c, 0, objArr, 0, 0);
    }

    @Override // defpackage.tdk0
    public final int b() {
        return 0;
    }

    @Override // defpackage.tdk0
    public final int c() {
        return 0;
    }

    @Override // defpackage.tdk0
    public final Object[] d() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        rdk0.a(i, 0);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
