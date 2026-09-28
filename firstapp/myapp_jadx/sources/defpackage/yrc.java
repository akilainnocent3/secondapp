package defpackage;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class yrc implements xrc {
    public final rdd0 a;
    public final Set<String> b;
    public boolean c;

    public yrc(rdd0 rdd0Var) {
        rdd0Var.getClass();
        this.a = rdd0Var;
        this.b = Collections.synchronizedSet(new LinkedHashSet());
    }

    @Override // defpackage.xrc
    public final void a(int i) {
        pdd0 pdd0Var;
        if (i == 5 || i == 10 || i == 20) {
            pdd0Var = xn2.a;
        } else if (i == 30) {
            pdd0Var = pn2.a;
        } else if (i != 40) {
            return;
        } else {
            pdd0Var = vn2.a;
        }
        this.a.a(pdd0Var, k00.d);
    }

    @Override // defpackage.xrc
    public final void b(int i) {
        pdd0 pdd0Var;
        if (i == 5 || i == 10 || i == 20) {
            pdd0Var = do2.a;
        } else if (i == 30) {
            pdd0Var = zn2.a;
        } else if (i != 40) {
            return;
        } else {
            pdd0Var = bo2.a;
        }
        itf0.a aVar = itf0.a;
        aVar.q("DataTrackingManager");
        aVar.a(inm.a("Track ticket detail click: event=", pdd0Var.getName()), new Object[0]);
        this.a.a(pdd0Var, k00.d);
    }

    @Override // defpackage.xrc
    public final void c() {
        itf0.a aVar = itf0.a;
        aVar.q("DataTrackingManager");
        Set<String> set = this.b;
        aVar.a(pe4.b(set.size(), "Reset view tracking, cleared ", " entries"), new Object[0]);
        set.clear();
    }

    @Override // defpackage.xrc
    public final void d(int i, String str) {
        pdd0 pdd0Var;
        str.getClass();
        if (this.c) {
            if (!this.b.add(str)) {
                itf0.a aVar = itf0.a;
                aVar.q("DataTrackingManager");
                aVar.a("Skip duplicate view: orderId=".concat(str), new Object[0]);
                return;
            }
            if (i == 5 || i == 10 || i == 20) {
                pdd0Var = yn2.a;
            } else if (i == 30) {
                pdd0Var = qn2.a;
            } else if (i != 40) {
                return;
            } else {
                pdd0Var = wn2.a;
            }
            itf0.a aVar2 = itf0.a;
            aVar2.q("DataTrackingManager");
            aVar2.a(lx5.a("Track view: orderId=", str, ", event=", pdd0Var.getName()), new Object[0]);
            this.a.a(pdd0Var, k00.d);
        }
    }

    @Override // defpackage.xrc
    public final void e(boolean z) {
        itf0.a aVar = itf0.a;
        aVar.q("DataTrackingManager");
        aVar.a("View tracking enabled=" + z, new Object[0]);
        this.c = z;
    }

    @Override // defpackage.xrc
    public final void f(int i) {
        pdd0 pdd0Var;
        if (i == 5 || i == 10 || i == 20) {
            pdd0Var = eo2.a;
        } else if (i == 30) {
            pdd0Var = ao2.a;
        } else if (i != 40) {
            return;
        } else {
            pdd0Var = co2.a;
        }
        itf0.a aVar = itf0.a;
        aVar.q("DataTrackingManager");
        aVar.a(inm.a("Track ticket detail view: event=", pdd0Var.getName()), new Object[0]);
        this.a.a(pdd0Var, k00.d);
    }
}
