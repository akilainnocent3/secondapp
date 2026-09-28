package defpackage;

import defpackage.mj0;

/* JADX INFO: loaded from: classes.dex */
public interface pwh0<V extends mj0> {
    boolean a();

    long c(V v, V v2, V v3);

    default V e(V v, V v2, V v3) {
        return (V) f(c(v, v2, v3), v, v2, v3);
    }

    V f(long j, V v, V v2, V v3);

    V g(long j, V v, V v2, V v3);
}
