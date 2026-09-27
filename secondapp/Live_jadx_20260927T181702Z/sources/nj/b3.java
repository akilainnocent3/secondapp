package nj;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
@yi.c
@yi.d
@qj.f("Use FakeTimeLimiter")
public interface b3 {
    void a(Runnable runnable, long timeoutDuration, TimeUnit timeoutUnit) throws TimeoutException;

    @f2
    @qj.a
    <T> T b(Callable<T> callable, long timeoutDuration, TimeUnit timeoutUnit) throws ExecutionException, TimeoutException;

    @f2
    @qj.a
    <T> T c(Callable<T> callable, long timeoutDuration, TimeUnit timeoutUnit) throws ExecutionException, InterruptedException, TimeoutException;

    void d(Runnable runnable, long timeoutDuration, TimeUnit timeoutUnit) throws InterruptedException, TimeoutException;

    <T> T e(T target, Class<T> interfaceType, long timeoutDuration, TimeUnit timeoutUnit);
}
