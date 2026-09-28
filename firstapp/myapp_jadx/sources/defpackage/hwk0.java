package defpackage;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class hwk0 extends m1l0 {
    public final ox0 b;
    public final ox0 c;
    public long d;

    public hwk0(k8l0 k8l0Var) {
        super(k8l0Var);
        this.c = new ox0();
        this.b = new ox0();
    }

    public final void h(long j, String str) {
        k8l0 k8l0Var = this.a;
        if (str == null || str.length() == 0) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.a("Ad unit id must be a non-empty string");
        } else {
            p7l0 p7l0Var = k8l0Var.g;
            k8l0.m(p7l0Var);
            p7l0Var.p(new xlk0(this, str, j));
        }
    }

    public final void i(long j, String str) {
        k8l0 k8l0Var = this.a;
        if (str == null || str.length() == 0) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.a("Ad unit id must be a non-empty string");
        } else {
            p7l0 p7l0Var = k8l0Var.g;
            k8l0.m(p7l0Var);
            p7l0Var.p(new nrk0(this, str, j));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(long j) {
        khl0 khl0Var = this.a.l;
        k8l0.l(khl0Var);
        igl0 igl0VarM = khl0Var.m(false);
        ox0 ox0Var = this.b;
        for (String str : (ox0.c) ox0Var.keySet()) {
            l(str, j - ((Long) ox0Var.get(str)).longValue(), igl0VarM);
        }
        if (!ox0Var.isEmpty()) {
            k(j - this.d, igl0VarM);
        }
        m(j);
    }

    public final void k(long j, igl0 igl0Var) {
        k8l0 k8l0Var = this.a;
        if (igl0Var == null) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.n.a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            y4l0 y4l0Var2 = k8l0Var.f;
            k8l0.m(y4l0Var2);
            y4l0Var2.n.b(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            yol0.Y(igl0Var, bundle, true);
            nfl0 nfl0Var = k8l0Var.m;
            k8l0.l(nfl0Var);
            nfl0Var.n("am", "_xa", bundle);
        }
    }

    public final void l(String str, long j, igl0 igl0Var) {
        k8l0 k8l0Var = this.a;
        if (igl0Var == null) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.n.a("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                y4l0 y4l0Var2 = k8l0Var.f;
                k8l0.m(y4l0Var2);
                y4l0Var2.n.b(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            yol0.Y(igl0Var, bundle, true);
            nfl0 nfl0Var = k8l0Var.m;
            k8l0.l(nfl0Var);
            nfl0Var.n("am", "_xu", bundle);
        }
    }

    public final void m(long j) {
        ox0 ox0Var = this.b;
        Iterator it = ((ox0.c) ox0Var.keySet()).iterator();
        while (it.hasNext()) {
            ox0Var.put((String) it.next(), Long.valueOf(j));
        }
        if (ox0Var.isEmpty()) {
            return;
        }
        this.d = j;
    }
}
