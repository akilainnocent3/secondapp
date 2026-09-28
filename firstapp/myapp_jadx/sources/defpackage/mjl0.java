package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class mjl0 implements Runnable {
    public final /* synthetic */ o3l0 a;
    public final /* synthetic */ wjl0 b;

    public mjl0(wjl0 wjl0Var, o3l0 o3l0Var) {
        this.a = o3l0Var;
        this.b = wjl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wjl0 wjl0Var = this.b;
        synchronized (wjl0Var) {
            try {
                wjl0Var.a = false;
                ikl0 ikl0Var = wjl0Var.c;
                if (!ikl0Var.x()) {
                    y4l0 y4l0Var = ikl0Var.a.f;
                    k8l0.m(y4l0Var);
                    y4l0Var.m.a("Connected to remote service");
                    o3l0 o3l0Var = this.a;
                    ikl0Var.g();
                    ikl0Var.d = o3l0Var;
                    ikl0Var.t();
                    ikl0Var.v();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ikl0 ikl0Var2 = this.b.c;
        ScheduledExecutorService scheduledExecutorService = ikl0Var2.g;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            ikl0Var2.g = null;
        }
    }
}
