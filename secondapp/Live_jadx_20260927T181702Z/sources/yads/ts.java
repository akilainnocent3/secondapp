package yads;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ts implements br2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f156031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rh1 f156032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mh1 f156033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ar2 f156034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final tr2 f156035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ii2 f156036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArrayList f156037g = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q10 f156038h;

    public ts(Context context, rh1 rh1Var, mh1 mh1Var, ar2 ar2Var, tr2 tr2Var, ii2 ii2Var) {
        this.f156031a = context;
        this.f156032b = rh1Var;
        this.f156033c = mh1Var;
        this.f156034d = ar2Var;
        this.f156035e = tr2Var;
        this.f156036f = ii2Var;
    }

    @Override // yads.br2
    public final void a() {
        this.f156032b.a();
        this.f156033c.a();
        for (zq2 zq2Var : this.f156037g) {
            zq2Var.a((q10) null);
            zq2Var.d();
        }
        this.f156037g.clear();
    }

    public final void b(final g9 g9Var) {
        this.f156033c.a(new Runnable() { // from class: yads.qb4
            @Override // java.lang.Runnable
            public final void run() {
                ts.b(this.f154401b, g9Var);
            }
        });
    }

    public static final void b(ts tsVar, g9 g9Var) {
        boolean zB;
        tsVar.f156036f.getClass();
        if (ii2.a(g9Var)) {
            tr2 tr2Var = tsVar.f156035e;
            synchronized (tr2Var) {
                zB = tr2Var.f156027a.b();
            }
            if (zB) {
                tsVar.a(g9Var, new qs(tsVar, g9Var), "render");
            }
        }
    }

    @Override // yads.br2
    public final void a(final g9 g9Var) {
        this.f156032b.a();
        if (this.f156038h == null) {
            lc1.c("RewardedAdLoader. RewardedAdLoadListener is on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f156033c.a(new Runnable() { // from class: yads.pb4
            @Override // java.lang.Runnable
            public final void run() {
                ts.a(this.f153863b, g9Var);
            }
        });
    }

    public final void a(g9 g9Var, q10 q10Var, String str) {
        g9 g9VarA = g9.a(g9Var, null, str, 2047);
        zq2 zq2VarA = this.f156034d.a(this.f156031a, this, g9VarA, new ss(this, g9VarA));
        this.f156037g.add(zq2VarA);
        String str2 = g9VarA.f149471a;
        zq2VarA.f158922c.a(str2);
        zq2VarA.F.f156485d = str2;
        zq2VarA.a(q10Var);
        zq2VarA.b(g9VarA);
    }

    public static final void a(ts tsVar, g9 g9Var) {
        dr2 dr2Var;
        tsVar.f156036f.getClass();
        if (ii2.a(g9Var)) {
            tr2 tr2Var = tsVar.f156035e;
            synchronized (tr2Var) {
                ki2 ki2Var = tr2Var.f156027a;
                tr2Var.f156028b.getClass();
                dr2Var = (dr2) ki2Var.a(oy0.a(g9Var));
            }
            if (dr2Var != null) {
                q10 q10Var = tsVar.f156038h;
                if (q10Var != null) {
                    q10Var.a(dr2Var);
                    return;
                }
                return;
            }
            tsVar.a(g9Var, new rs(tsVar), "default");
            return;
        }
        tsVar.a(g9Var, new rs(tsVar), "default");
    }

    @Override // yads.r5
    public final void a(fy0 fy0Var) {
        zq2 zq2Var = (zq2) fy0Var;
        if (this.f156038h == null) {
            lc1.c("RewardedAdLoader. RewardedAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        zq2Var.a((q10) null);
        this.f156037g.remove(zq2Var);
    }

    @Override // yads.br2
    public final void a(hu3 hu3Var) {
        this.f156032b.a();
        this.f156038h = hu3Var;
    }
}
