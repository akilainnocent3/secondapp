package defpackage;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes4.dex */
public final class ull0 {
    public final /* synthetic */ wll0 a;

    public ull0(wll0 wll0Var) {
        this.a = wll0Var;
    }

    public final void a() {
        wll0 wll0Var = this.a;
        wll0Var.g();
        k8l0 k8l0Var = wll0Var.a;
        j6l0 j6l0Var = k8l0Var.e;
        k8l0.k(j6l0Var);
        k8l0Var.k.getClass();
        if (j6l0Var.q(System.currentTimeMillis())) {
            j6l0 j6l0Var2 = k8l0Var.e;
            k8l0.k(j6l0Var2);
            j6l0Var2.l.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                y4l0 y4l0Var = k8l0Var.f;
                k8l0.m(y4l0Var);
                y4l0Var.n.a("Detected application was in foreground");
                c(System.currentTimeMillis());
            }
        }
    }

    public final void b(long j) {
        wll0 wll0Var = this.a;
        wll0Var.g();
        wll0Var.k();
        k8l0 k8l0Var = wll0Var.a;
        j6l0 j6l0Var = k8l0Var.e;
        k8l0.k(j6l0Var);
        if (j6l0Var.q(j)) {
            k8l0.k(j6l0Var);
            j6l0Var.l.b(true);
            k8l0Var.q().l();
        }
        k8l0.k(j6l0Var);
        j6l0Var.p.b(j);
        if (j6l0Var.l.a()) {
            c(j);
        }
    }

    public final void c(long j) {
        wll0 wll0Var = this.a;
        wll0Var.g();
        k8l0 k8l0Var = wll0Var.a;
        if (k8l0Var.f()) {
            j6l0 j6l0Var = k8l0Var.e;
            k8l0.k(j6l0Var);
            j6l0Var.p.b(j);
            k8l0Var.k.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.n.b(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j2 = j / 1000;
            Long lValueOf = Long.valueOf(j2);
            nfl0 nfl0Var = k8l0Var.m;
            k8l0.l(nfl0Var);
            nfl0Var.r(j, lValueOf, StompClient.DEFAULT_ACK, "_sid");
            k8l0.k(j6l0Var);
            j6l0Var.q.b(j2);
            j6l0Var.l.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j2);
            k8l0.l(nfl0Var);
            nfl0Var.o(j, bundle, StompClient.DEFAULT_ACK, "_s");
            String strA = j6l0Var.v.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strA);
            k8l0.l(nfl0Var);
            nfl0Var.o(j, bundle2, StompClient.DEFAULT_ACK, "_ssr");
        }
    }
}
