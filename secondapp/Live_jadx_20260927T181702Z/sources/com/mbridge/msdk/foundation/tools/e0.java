package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class e0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Runnable f67399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Runnable f67400b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f67401a;

        public a(Runnable runnable) {
            this.f67401a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f67401a.run();
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("LimitExecutor", e10.getMessage());
                }
            } finally {
                e0.this.a();
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        try {
            if (this.f67399a == null) {
                this.f67399a = a(runnable);
                c0.a().execute(this.f67399a);
            } else if (this.f67400b == null) {
                this.f67400b = a(runnable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private Runnable a(Runnable runnable) {
        return new a(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        Runnable runnable = this.f67400b;
        this.f67399a = runnable;
        this.f67400b = null;
        if (runnable != null) {
            c0.a().execute(this.f67399a);
        }
    }
}
