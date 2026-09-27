package com.ironsource;

import android.os.Handler;
import com.ironsource.environment.thread.IronSourceThreadManager;

/* JADX INFO: renamed from: com.ironsource.s9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4507s9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final Handler f63576a;

    /* JADX INFO: renamed from: com.ironsource.s9$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends AbstractRunnableC4335ie {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f63577b;

        public a(Runnable runnable) {
            this.f63577b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC4335ie
        public void a() {
            this.f63577b.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4507s9() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void c(Runnable runnable) {
        AbstractRunnableC4335ie aVar = runnable instanceof AbstractRunnableC4335ie ? (AbstractRunnableC4335ie) runnable : new a(runnable);
        if (Thread.currentThread().getId() == this.f63576a.getLooper().getThread().getId()) {
            aVar.run();
        } else {
            a(this, aVar, 0L, 2, null);
        }
    }

    @oy.l
    public final Handler a() {
        return this.f63576a;
    }

    public final void b(@oy.l Runnable runnable) {
        kotlin.jvm.internal.m0.p(runnable, "runnable");
        c(runnable);
    }

    public C4507s9(@oy.l Handler handler) {
        kotlin.jvm.internal.m0.p(handler, "handler");
        this.f63576a = handler;
    }

    public static /* synthetic */ void a(C4507s9 c4507s9, AbstractRunnableC4335ie abstractRunnableC4335ie, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c4507s9.a(abstractRunnableC4335ie, j10);
    }

    public /* synthetic */ C4507s9(Handler handler, int i10, kotlin.jvm.internal.x xVar) {
        this((i10 & 1) != 0 ? new Handler(IronSourceThreadManager.INSTANCE.getSharedManagersThread().getLooper()) : handler);
    }

    public final void a(@oy.l AbstractRunnableC4335ie task, long j10) {
        kotlin.jvm.internal.m0.p(task, "task");
        this.f63576a.postDelayed(task, j10);
    }

    public final void a(@oy.l AbstractRunnableC4335ie task) {
        kotlin.jvm.internal.m0.p(task, "task");
        this.f63576a.removeCallbacks(task);
    }

    public final void a(@oy.l Runnable callback) {
        kotlin.jvm.internal.m0.p(callback, "callback");
        c(callback);
    }
}
