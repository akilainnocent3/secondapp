package defpackage;

import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class ujl0 implements Runnable {
    public final /* synthetic */ ConnectionResult a;
    public final /* synthetic */ wjl0 b;

    public ujl0(wjl0 wjl0Var, ConnectionResult connectionResult) {
        this.a = connectionResult;
        this.b = wjl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ikl0 ikl0Var = this.b.c;
        ikl0Var.d = null;
        if (this.a.b != 7777) {
            ikl0Var.v();
            return;
        }
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = ikl0Var.g;
        if (scheduledExecutorServiceNewScheduledThreadPool == null) {
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
            ikl0Var.g = scheduledExecutorServiceNewScheduledThreadPool;
        }
        scheduledExecutorServiceNewScheduledThreadPool.schedule(new Runnable() { // from class: qjl0
            @Override // java.lang.Runnable
            public final void run() {
                final ikl0 ikl0Var2 = this.a.b.c;
                p7l0 p7l0Var = ikl0Var2.a.g;
                k8l0.m(p7l0Var);
                p7l0Var.p(new Runnable() { // from class: sjl0
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        ikl0Var2.m();
                    }
                });
            }
        }, ((Long) v2l0.Z.a(null)).longValue(), TimeUnit.MILLISECONDS);
    }
}
