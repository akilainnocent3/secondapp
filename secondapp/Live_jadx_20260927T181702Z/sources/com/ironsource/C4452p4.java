package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.p4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4452p4 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f63276a;

    public C4452p4(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f63276a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        C4469q4 c4469q4 = new C4469q4(th2);
        if (c4469q4.d()) {
            new P5(c4469q4.b(), "" + System.currentTimeMillis(), "Crash").a();
        }
        this.f63276a.uncaughtException(thread, th2);
    }
}
