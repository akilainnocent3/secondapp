package com.mbridge.msdk.tracker.network;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class f implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f70292a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f70293a;

        public a(Handler handler) {
            this.f70293a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f70293a.post(runnable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t f70295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final v f70296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f70297c;

        public b(t tVar, v vVar, Runnable runnable) {
            this.f70295a = tVar;
            this.f70296b = vVar;
            this.f70297c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f70295a.v()) {
                this.f70295a.c("canceled-at-delivery");
                return;
            }
            if (this.f70296b.a()) {
                this.f70295a.a(this.f70296b.f70413a);
            } else {
                this.f70295a.b(this.f70296b.f70415c);
            }
            if (this.f70296b.f70416d) {
                this.f70295a.a("intermediate-response");
            } else {
                this.f70295a.c("done");
            }
            Runnable runnable = this.f70297c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public f(Handler handler) {
        this.f70292a = new a(handler);
    }

    @Override // com.mbridge.msdk.tracker.network.w
    public void a(t<?> tVar, v<?> vVar) {
        a(tVar, vVar, null);
    }

    public void a(t<?> tVar, v<?> vVar, Runnable runnable) {
        tVar.w();
        tVar.a("post-response");
        this.f70292a.execute(new b(tVar, vVar, runnable));
    }

    public f(Executor executor) {
        this.f70292a = executor;
    }

    @Override // com.mbridge.msdk.tracker.network.w
    public void a(t<?> tVar, b0 b0Var) {
        tVar.a("post-error");
        this.f70292a.execute(new b(tVar, v.a(b0Var), null));
    }
}
