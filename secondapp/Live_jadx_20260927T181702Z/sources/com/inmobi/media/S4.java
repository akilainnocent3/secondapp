package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class S4 extends AbstractC4007t5 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f55470b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S4(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C4032u5 listener) {
        super(listener);
        kotlin.jvm.internal.m0.p(listener, "listener");
        this.f55470b = uncaughtExceptionHandler;
    }

    @Override // com.inmobi.media.AbstractC4007t5
    public final void a() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // com.inmobi.media.AbstractC4007t5
    public final void b() {
        Thread.setDefaultUncaughtExceptionHandler(this.f55470b);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread t10, Throwable e10) {
        kotlin.jvm.internal.m0.p(t10, "t");
        kotlin.jvm.internal.m0.p(e10, "e");
        this.f57692a.a(new T4(t10, e10));
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f55470b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t10, e10);
        }
    }
}
