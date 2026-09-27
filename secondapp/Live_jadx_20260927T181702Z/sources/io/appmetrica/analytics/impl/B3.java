package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class B3 extends S7 {
    @Override // io.appmetrica.analytics.impl.S7
    public final boolean a(@oy.l C5364s3 c5364s3, @oy.l C5364s3 c5364s4) {
        if (mo.a(c5364s4.f98282a)) {
            return true;
        }
        if (mo.a(c5364s3.f98282a)) {
            return false;
        }
        T7 t10 = c5364s3.f98283b;
        if (t10 == T7.f96502c) {
            if (((Number) this.f96445a.a(t10)).intValue() >= ((Number) this.f96445a.a(c5364s4.f98283b)).intValue()) {
                return true;
            }
        } else if (((Number) this.f96445a.a(t10)).intValue() > ((Number) this.f96445a.a(c5364s4.f98283b)).intValue()) {
            return true;
        }
        return false;
    }
}
