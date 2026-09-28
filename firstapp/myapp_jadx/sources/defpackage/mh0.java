package defpackage;

import defpackage.mj0;

/* JADX INFO: loaded from: classes.dex */
public interface mh0<T, V extends mj0> {
    boolean a();

    V b(long j);

    default boolean c(long j) {
        return j >= d();
    }

    long d();

    f0h0<T, V> e();

    T f(long j);

    T g();
}
