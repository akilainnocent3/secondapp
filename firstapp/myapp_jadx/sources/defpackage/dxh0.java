package defpackage;

import defpackage.mj0;

/* JADX INFO: loaded from: classes.dex */
public final class dxh0<V extends mj0> implements twh0<V> {
    public final int a;
    public final int b;
    public final tkf c;
    public final vwh0<V> d;

    public dxh0(int i, int i2, tkf tkfVar) {
        this.a = i;
        this.b = i2;
        this.c = tkfVar;
        this.d = new vwh0<>(new kxh(i, i2, tkfVar));
    }

    @Override // defpackage.twh0
    public final int b() {
        return this.a;
    }

    @Override // defpackage.twh0
    public final int d() {
        return this.b;
    }

    @Override // defpackage.pwh0
    public final V f(long j, V v, V v2, V v3) {
        return (V) this.d.f(j, v, v2, v3);
    }

    @Override // defpackage.pwh0
    public final V g(long j, V v, V v2, V v3) {
        return (V) this.d.g(j, v, v2, v3);
    }
}
