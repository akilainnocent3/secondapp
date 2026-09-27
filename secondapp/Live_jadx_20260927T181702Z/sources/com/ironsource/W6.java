package com.ironsource;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class W6 implements InterfaceC4564vf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final a f60264a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {

        /* JADX INFO: renamed from: com.ironsource.W6$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public interface InterfaceC0543a {
            void cancel();
        }

        @oy.l
        InterfaceC0543a a(@oy.l Runnable runnable, long j10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends AbstractRunnableC4335ie {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f60265b;

        public b(Runnable runnable) {
            this.f60265b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC4335ie
        public void a() {
            this.f60265b.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public W6() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.InterfaceC4564vf
    @oy.l
    public InterfaceC4564vf.a a(@oy.l Runnable task, long j10) {
        kotlin.jvm.internal.m0.p(task, "task");
        return new InterfaceC4564vf.a(this.f60264a.a(a(task), ev.h.w(j10)));
    }

    public W6(@oy.l a handler) {
        kotlin.jvm.internal.m0.p(handler, "handler");
        this.f60264a = handler;
    }

    public /* synthetic */ W6(a aVar, int i10, kotlin.jvm.internal.x xVar) {
        this((i10 & 1) != 0 ? X6.a(new Handler(Looper.getMainLooper())) : aVar);
    }

    @Override // com.ironsource.InterfaceC4564vf
    @oy.l
    public InterfaceC4564vf.a a(@oy.l InterfaceC4564vf.b task, long j10) {
        kotlin.jvm.internal.m0.p(task, "task");
        return a(task.a(), j10);
    }

    private final AbstractRunnableC4335ie a(Runnable runnable) {
        return runnable instanceof AbstractRunnableC4335ie ? (AbstractRunnableC4335ie) runnable : new b(runnable);
    }
}
