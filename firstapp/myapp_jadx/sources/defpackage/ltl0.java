package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public final class ltl0 extends BroadcastReceiver {
    public final k8l0 a;

    public ltl0(k8l0 k8l0Var) {
        this.a = k8l0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final k8l0 k8l0Var = this.a;
        if (intent == null) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.i.a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            y4l0 y4l0Var2 = k8l0Var.f;
            k8l0.m(y4l0Var2);
            y4l0Var2.i.a("App receiver called with null action");
            return;
        }
        int iHashCode = action.hashCode();
        if (iHashCode != -1928239649) {
            if (iHashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                y4l0 y4l0Var3 = k8l0Var.f;
                k8l0.m(y4l0Var3);
                y4l0Var3.n.a("[sgtm] App Receiver notified batches are available");
                p7l0 p7l0Var = k8l0Var.g;
                k8l0.m(p7l0Var);
                p7l0Var.p(new Runnable() { // from class: lsl0
                    @Override // java.lang.Runnable
                    public final void run() {
                        k8l0 k8l0Var2 = this.a.a;
                        k8l0.j(k8l0Var2.u);
                        k8l0Var2.u.k(((Long) v2l0.D.a(null)).longValue());
                    }
                });
                return;
            }
        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            kql0.a();
            if (k8l0Var.d.q(null, v2l0.Q0)) {
                y4l0 y4l0Var4 = k8l0Var.f;
                k8l0.m(y4l0Var4);
                y4l0Var4.n.a("App receiver notified triggers are available");
                p7l0 p7l0Var2 = k8l0Var.g;
                k8l0.m(p7l0Var2);
                p7l0Var2.p(new Runnable() { // from class: usl0
                    @Override // java.lang.Runnable
                    public final void run() {
                        k8l0 k8l0Var2 = k8l0Var;
                        yol0 yol0Var = k8l0Var2.i;
                        final nfl0 nfl0Var = k8l0Var2.m;
                        k8l0.k(yol0Var);
                        yol0Var.g();
                        if (yol0Var.C() != 1) {
                            y4l0 y4l0Var5 = k8l0Var2.f;
                            k8l0.m(y4l0Var5);
                            y4l0Var5.i.a("registerTrigger called but app not eligible");
                            return;
                        }
                        k8l0.l(nfl0Var);
                        nfl0Var.g();
                        zbl0 zbl0Var = nfl0Var.l;
                        if (zbl0Var != null) {
                            zbl0Var.c();
                        }
                        k8l0.l(nfl0Var);
                        new Thread(new Runnable() { // from class: ftl0
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                nfl0Var.D();
                            }
                        }).start();
                    }
                });
                return;
            }
            return;
        }
        y4l0 y4l0Var5 = k8l0Var.f;
        k8l0.m(y4l0Var5);
        y4l0Var5.i.a("App receiver called with unknown action");
    }
}
