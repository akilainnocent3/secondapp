package defpackage;

import defpackage.mj0;

/* JADX INFO: loaded from: classes.dex */
public final class bxh0<V extends mj0> implements twh0<V> {
    public final int a;

    public bxh0(int i) {
        this.a = i;
    }

    @Override // defpackage.twh0
    public final int b() {
        return 0;
    }

    @Override // defpackage.twh0
    public final int d() {
        return this.a;
    }

    @Override // defpackage.pwh0
    public final V g(long j, V v, V v2, V v3) {
        return j < ((long) this.a) * 1000000 ? v : v2;
    }

    @Override // defpackage.pwh0
    public final V f(long j, V v, V v2, V v3) {
        return v3;
    }
}
