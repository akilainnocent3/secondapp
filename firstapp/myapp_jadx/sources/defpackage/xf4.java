package defpackage;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class xf4<T> extends a3<T> {
    public final Thread e;
    public final tpg f;

    public xf4(CoroutineContext coroutineContext, Thread thread, tpg tpgVar) {
        super(coroutineContext, true);
        this.e = thread;
        this.f = tpgVar;
    }

    @Override // defpackage.m9p
    public final void n(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.e;
        if (Intrinsics.g(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
