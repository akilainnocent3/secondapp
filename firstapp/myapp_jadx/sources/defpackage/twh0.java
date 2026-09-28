package defpackage;

import defpackage.mj0;

/* JADX INFO: loaded from: classes.dex */
public interface twh0<V extends mj0> extends uwh0<V> {
    int b();

    @Override // defpackage.pwh0
    default long c(V v, V v2, V v3) {
        return ((long) (b() + d())) * 1000000;
    }

    int d();
}
