package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
public interface zb6<T> extends v1b<T> {
    boolean cancel(Throwable th);

    toe0 i(Object obj, gaj gajVar);

    boolean isActive();

    <R extends T> void s(R r, gaj<? super Throwable, ? super R, ? super CoroutineContext, Unit> gajVar);

    void x(Object obj);
}
