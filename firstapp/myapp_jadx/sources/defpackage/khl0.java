package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.zzdf;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.account.Qr.QQWMbKFOuTf;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class khl0 extends j3l0 {
    public volatile igl0 c;
    public volatile igl0 d;
    public igl0 e;
    public final ConcurrentHashMap f;
    public zzdf g;
    public volatile boolean h;
    public volatile igl0 i;
    public igl0 j;
    public boolean k;
    public final Object l;

    public khl0(k8l0 k8l0Var) {
        super(k8l0Var);
        this.l = new Object();
        this.f = new ConcurrentHashMap();
    }

    @Override // defpackage.j3l0
    public final boolean j() {
        return false;
    }

    public final void k(igl0 igl0Var, boolean z, long j) {
        k8l0 k8l0Var = this.a;
        hwk0 hwk0Var = k8l0Var.n;
        k8l0.j(hwk0Var);
        k8l0Var.k.getClass();
        hwk0Var.j(SystemClock.elapsedRealtime());
        boolean z2 = igl0Var != null && igl0Var.d;
        wll0 wll0Var = k8l0Var.h;
        k8l0.l(wll0Var);
        if (!wll0Var.f.a(j, z2, z) || igl0Var == null) {
            return;
        }
        igl0Var.d = false;
    }

    public final igl0 l(zzdf zzdfVar) {
        hm20.h(zzdfVar);
        Integer numValueOf = Integer.valueOf(zzdfVar.a);
        ConcurrentHashMap concurrentHashMap = this.f;
        igl0 igl0Var = (igl0) concurrentHashMap.get(numValueOf);
        if (igl0Var == null) {
            String strN = n(zzdfVar.b);
            yol0 yol0Var = this.a.i;
            k8l0.k(yol0Var);
            igl0 igl0Var2 = new igl0(yol0Var.d0(), null, strN);
            concurrentHashMap.put(numValueOf, igl0Var2);
            igl0Var = igl0Var2;
        }
        return this.i != null ? this.i : igl0Var;
    }

    public final igl0 m(boolean z) {
        h();
        g();
        igl0 igl0Var = this.e;
        return (z && igl0Var == null) ? this.j : igl0Var;
    }

    public final String n(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        int length2 = str2.length();
        k8l0 k8l0Var = this.a;
        k8l0Var.d.getClass();
        if (length2 <= 500) {
            return str2;
        }
        k8l0Var.d.getClass();
        return str2.substring(0, 500);
    }

    public final void o(zzdf zzdfVar, Bundle bundle) {
        Bundle bundle2;
        if (!this.a.d.u() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f.put(Integer.valueOf(zzdfVar.a), new igl0(bundle2.getLong(AnalyticsParam.EVENT_PARAM_ID), bundle2.getString("name"), bundle2.getString("referrer_name")));
    }

    public final void p(String str, igl0 igl0Var, boolean z) {
        igl0 igl0Var2;
        igl0 igl0Var3 = this.c == null ? this.d : this.c;
        if (igl0Var.b == null) {
            igl0Var2 = new igl0(igl0Var.a, str != null ? n(str) : null, igl0Var.c, igl0Var.e, igl0Var.f);
        } else {
            igl0Var2 = igl0Var;
        }
        this.d = this.c;
        this.c = igl0Var2;
        k8l0 k8l0Var = this.a;
        k8l0Var.k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        p7l0 p7l0Var = k8l0Var.g;
        k8l0.m(p7l0Var);
        p7l0Var.p(new mgl0(this, igl0Var2, igl0Var3, jElapsedRealtime, z));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b7  */
    public final void q(igl0 igl0Var, igl0 igl0Var2, long j, boolean z, Bundle bundle) {
        boolean z2;
        long j2;
        long j3;
        boolean z3 = igl0Var.e;
        g();
        boolean z4 = false;
        if (igl0Var2 != null) {
            if (igl0Var2.c == igl0Var.c && Objects.equals(igl0Var2.b, igl0Var.b) && Objects.equals(igl0Var2.a, igl0Var.a)) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = true;
        }
        if (z && this.e != null) {
            z4 = true;
        }
        k8l0 k8l0Var = this.a;
        if (z2) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            yol0.Y(igl0Var, bundle2, true);
            if (igl0Var2 != null) {
                String str = igl0Var2.a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = igl0Var2.b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", igl0Var2.c);
            }
            if (z4) {
                wll0 wll0Var = k8l0Var.h;
                k8l0.l(wll0Var);
                sll0 sll0Var = wll0Var.f;
                j2 = 0;
                long j4 = j - sll0Var.b;
                sll0Var.b = j;
                if (j4 > 0) {
                    yol0 yol0Var = k8l0Var.i;
                    k8l0.k(yol0Var);
                    yol0Var.O(bundle2, j4);
                }
            } else {
                j2 = 0;
            }
            if (!k8l0Var.d.u()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != z3 ? QQWMbKFOuTf.aFrGtKIVSiku : "app";
            k8l0Var.k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z3) {
                long j5 = igl0Var.f;
                if (j5 == j2) {
                    j3 = jCurrentTimeMillis;
                } else {
                    j3 = j5;
                }
            } else {
                j3 = jCurrentTimeMillis;
            }
            nfl0 nfl0Var = k8l0Var.m;
            k8l0.l(nfl0Var);
            nfl0Var.o(j3, bundle2, str3, "_vs");
        }
        if (z4) {
            k(this.e, true, j);
        }
        this.e = igl0Var;
        if (z3) {
            this.j = igl0Var;
        }
        ikl0 ikl0VarO = k8l0Var.o();
        ikl0VarO.g();
        ikl0VarO.h();
        ikl0VarO.u(new fil0(ikl0VarO, igl0Var));
    }
}
