package defpackage;

import defpackage.mj0;

/* JADX INFO: loaded from: classes.dex */
public final class cxh0<V extends mj0> implements uwh0<V> {
    public final /* synthetic */ vwh0<V> a;

    public cxh0(float f, float f2, V v) {
        int[] iArr = swh0.a;
        this.a = new vwh0<>(v != null ? new qwh0(f, f2, v) : new rwh0(f, f2));
    }

    @Override // defpackage.uwh0, defpackage.pwh0
    public final boolean a() {
        return false;
    }

    @Override // defpackage.pwh0
    public final long c(V v, V v2, V v3) {
        return this.a.c(v, v2, v3);
    }

    @Override // defpackage.pwh0
    public final V e(V v, V v2, V v3) {
        return (V) this.a.e(v, v2, v3);
    }

    @Override // defpackage.pwh0
    public final V f(long j, V v, V v2, V v3) {
        return (V) this.a.f(j, v, v2, v3);
    }

    @Override // defpackage.pwh0
    public final V g(long j, V v, V v2, V v3) {
        return (V) this.a.g(j, v, v2, v3);
    }
}
