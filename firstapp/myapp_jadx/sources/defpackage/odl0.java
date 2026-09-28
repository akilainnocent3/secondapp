package defpackage;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class odl0 implements Runnable {
    public final /* synthetic */ zvk0 a;
    public final /* synthetic */ nfl0 b;

    public odl0(nfl0 nfl0Var, zvk0 zvk0Var) {
        this.a = zvk0Var;
        Objects.requireNonNull(nfl0Var);
        this.b = nfl0Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0060  */
    /* JADX WARN: Code duplicated, block: B:21:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        Long lValueOf;
        zvk0 zvk0Var;
        nfl0 nfl0Var = this.b;
        wll0 wll0Var = nfl0Var.a.h;
        k8l0.l(wll0Var);
        k8l0 k8l0Var = wll0Var.a;
        j6l0 j6l0Var = k8l0Var.e;
        j6l0 j6l0Var2 = k8l0Var.e;
        k8l0.k(j6l0Var);
        if (j6l0Var.n().i(hbl0.ANALYTICS_STORAGE)) {
            k8l0.k(j6l0Var2);
            k8l0Var.k.getClass();
            if (!j6l0Var2.q(System.currentTimeMillis())) {
                k8l0.k(j6l0Var2);
                if (j6l0Var2.q.a() != 0) {
                    k8l0.k(j6l0Var2);
                    lValueOf = Long.valueOf(j6l0Var2.q.a());
                }
            }
            zvk0Var = this.a;
            if (lValueOf == null) {
                yol0 yol0Var = nfl0Var.a.i;
                k8l0.k(yol0Var);
                yol0Var.Q(zvk0Var, lValueOf.longValue());
            } else {
                try {
                    zvk0Var.O(null);
                    return;
                } catch (RemoteException e) {
                    y4l0 y4l0Var = nfl0Var.a.f;
                    k8l0.m(y4l0Var);
                    y4l0Var.f.b(e, "getSessionId failed with exception");
                    return;
                }
            }
        }
        y4l0 y4l0Var2 = k8l0Var.f;
        k8l0.m(y4l0Var2);
        y4l0Var2.k.a("Analytics storage consent denied; will not get session id");
        lValueOf = null;
        zvk0Var = this.a;
        if (lValueOf == null) {
            zvk0Var.O(null);
            return;
        }
        yol0 yol0Var2 = nfl0Var.a.i;
        k8l0.k(yol0Var2);
        yol0Var2.Q(zvk0Var, lValueOf.longValue());
    }
}
