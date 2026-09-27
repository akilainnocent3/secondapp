package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class P1 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f96306e = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ga f96307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5367s6 f96308b = C4959c4.l().n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5293p6 f96309c = new C5293p6();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final En f96310d = new En();

    public P1(C5193l6 c5193l6) {
        this.f96307a = c5193l6;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        StackTraceElement[] stackTraceElementArrB;
        try {
            f96306e.set(true);
            Ga ga2 = this.f96307a;
            C5509xn c5509xnApply = this.f96309c.apply(thread);
            En en2 = this.f96310d;
            Thread threadA = en2.f95798a.a();
            ArrayList arrayListA = en2.a(threadA, thread);
            if (thread != threadA) {
                try {
                    stackTraceElementArrB = en2.f95798a.b();
                    if (stackTraceElementArrB == null) {
                        try {
                            stackTraceElementArrB = threadA.getStackTrace();
                        } catch (SecurityException unused) {
                        }
                    }
                } catch (SecurityException unused2) {
                    stackTraceElementArrB = null;
                }
                arrayListA.add(0, (C5509xn) en2.f95799b.apply(threadA, stackTraceElementArrB));
            }
            ga2.a(th2, new V(c5509xnApply, arrayListA, this.f96308b.f98287a.a()));
        } catch (Throwable th3) {
            LoggerStorage.getMainPublicOrAnonymousLogger().error(th3, th3.getMessage(), new Object[0]);
        }
    }
}
