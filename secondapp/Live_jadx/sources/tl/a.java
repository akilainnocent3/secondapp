package tl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import qj.d;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public interface a {
    ExecutorService a(int i10, ThreadFactory threadFactory, c cVar);

    Future<?> b(@d String str, @d String str2, c cVar, Runnable runnable);

    ScheduledExecutorService c(int i10, ThreadFactory threadFactory, c cVar);

    ExecutorService d(c cVar);

    ExecutorService e(int i10, c cVar);

    void f(@d String str, @d String str2, c cVar, Runnable runnable);

    ExecutorService g(ThreadFactory threadFactory, c cVar);

    ScheduledExecutorService h(int i10, c cVar);

    ExecutorService i(c cVar);

    ExecutorService j(ThreadFactory threadFactory, c cVar);
}
