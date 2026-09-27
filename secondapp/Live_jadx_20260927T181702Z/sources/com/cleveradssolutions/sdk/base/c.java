package com.cleveradssolutions.sdk.base;

import android.os.HandlerThread;
import android.os.Looper;
import com.cleveradssolutions.internal.services.q;
import dr.g1;
import dr.o;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.i1;
import k.j0;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public static final c f43997a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.cleveradssolutions.internal.threads.e f43998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.cleveradssolutions.internal.threads.e f43999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadPoolExecutor f44000d;

    static {
        HandlerThread handlerThread = new HandlerThread("CASHandler");
        Looper mainLooper = Looper.getMainLooper();
        m0.o(mainLooper, "getMainLooper(...)");
        f43999c = new com.cleveradssolutions.internal.threads.e(mainLooper);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(6, 6, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), new com.cleveradssolutions.internal.threads.b());
        f44000d = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        m0.o(looper, "getLooper(...)");
        f43998b = new com.cleveradssolutions.internal.threads.e(looper);
    }

    public final <T> T a(long j10, @i1 @l Callable<T> action) {
        m0.p(action, "action");
        com.cleveradssolutions.internal.threads.e eVar = f43998b;
        if (m0.g(eVar.getLooper(), Looper.myLooper())) {
            return action.call();
        }
        FutureTask futureTask = new FutureTask(action);
        eVar.post(futureTask);
        return j10 <= 0 ? (T) futureTask.get() : (T) futureTask.get(j10, TimeUnit.MILLISECONDS);
    }

    public final <T> T b(long j10, @l @j0 Callable<T> action) {
        m0.p(action, "action");
        if (f()) {
            return action.call();
        }
        FutureTask futureTask = new FutureTask(action);
        f43999c.post(futureTask);
        return j10 == 0 ? (T) futureTask.get() : (T) futureTask.get(j10, TimeUnit.SECONDS);
    }

    @l
    public final com.cleveradssolutions.internal.threads.e c() {
        return f43998b;
    }

    @l
    public final ThreadPoolExecutor d() {
        return f44000d;
    }

    @l
    public final com.cleveradssolutions.internal.threads.e e() {
        return f43999c;
    }

    public final boolean f() {
        return m0.g(f43999c.getLooper(), Looper.myLooper());
    }

    public final boolean g() {
        q qVar = q.f43760b;
        return q.f43772n.zz();
    }

    @m
    public final d h(int i10, @l @j0 Runnable action) {
        m0.p(action, "action");
        return f43999c.a(i10, action);
    }

    public final void i(@l @j0 Runnable action) {
        m0.p(action, "action");
        if (f()) {
            f43999c.b(0, action);
        } else {
            f43999c.post(action);
        }
    }

    @m
    public final d j(int i10, @i1 @l Runnable action) {
        m0.p(action, "action");
        return f43998b.a(i10, action);
    }

    public final void k(@i1 @l Runnable action) {
        m0.p(action, "action");
        f43998b.post(action);
    }

    public final void l(@l Runnable action) {
        m0.p(action, "action");
        try {
            f44000d.execute(action);
        } catch (Throwable unused) {
            f43998b.post(action);
        }
    }

    @o(message = "Renamed to work()", replaceWith = @g1(expression = "work(action)", imports = {}))
    public final void m(@i1 @l Runnable action) throws Throwable {
        m0.p(action, "action");
        n(action);
    }

    public final void n(@i1 @l Runnable action) throws Throwable {
        m0.p(action, "action");
        com.cleveradssolutions.internal.threads.e eVar = f43998b;
        if (m0.g(eVar.getLooper(), Looper.myLooper())) {
            eVar.b(0, action);
        } else {
            eVar.post(action);
        }
    }
}
