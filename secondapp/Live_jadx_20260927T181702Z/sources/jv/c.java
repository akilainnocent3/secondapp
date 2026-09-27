package jv;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    public static b f100774a;

    @ur.f
    public static final long c() {
        b bVar = f100774a;
        return bVar != null ? bVar.a() : System.currentTimeMillis();
    }

    public static final void d(@oy.m b bVar) {
        f100774a = bVar;
    }

    @ur.f
    public static final long e() {
        b bVar = f100774a;
        return bVar != null ? bVar.b() : System.nanoTime();
    }

    @ur.f
    public static final void f(Object obj, long j10) {
        b bVar = f100774a;
        if (bVar != null) {
            bVar.c(obj, j10);
        } else {
            LockSupport.parkNanos(obj, j10);
        }
    }

    @ur.f
    public static final void g() {
        b bVar = f100774a;
        if (bVar != null) {
            bVar.d();
        }
    }

    @ur.f
    public static final void h() {
        b bVar = f100774a;
        if (bVar != null) {
            bVar.e();
        }
    }

    @ur.f
    public static final void i() {
        b bVar = f100774a;
        if (bVar != null) {
            bVar.f();
        }
    }

    @ur.f
    public static final void j(Thread thread) {
        b bVar = f100774a;
        if (bVar != null) {
            bVar.g(thread);
        } else {
            LockSupport.unpark(thread);
        }
    }

    @ur.f
    public static final void k() {
        b bVar = f100774a;
        if (bVar != null) {
            bVar.h();
        }
    }

    @ur.f
    public static final Runnable l(Runnable runnable) {
        Runnable runnableI;
        b bVar = f100774a;
        return (bVar == null || (runnableI = bVar.i(runnable)) == null) ? runnable : runnableI;
    }
}
