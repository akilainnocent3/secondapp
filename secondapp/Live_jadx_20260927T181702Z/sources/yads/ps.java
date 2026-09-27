package yads;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ps implements hd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f154090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rh1 f154091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mh1 f154092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gd1 f154093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qd1 f154094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ii2 f154095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArrayList f154096g = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w00 f154097h;

    public ps(Context context, rh1 rh1Var, mh1 mh1Var, gd1 gd1Var, qd1 qd1Var, ii2 ii2Var) {
        this.f154090a = context;
        this.f154091b = rh1Var;
        this.f154092c = mh1Var;
        this.f154093d = gd1Var;
        this.f154094e = qd1Var;
        this.f154095f = ii2Var;
    }

    @Override // yads.hd1
    public final void a() {
        this.f154091b.a();
        this.f154092c.a();
        for (fd1 fd1Var : this.f154096g) {
            fd1Var.a((w00) null);
            fd1Var.d();
        }
        this.f154096g.clear();
    }

    public final void b(final g9 g9Var) {
        this.f154092c.a(new Runnable() { // from class: yads.r84
            @Override // java.lang.Runnable
            public final void run() {
                ps.b(this.f154815b, g9Var);
            }
        });
    }

    public static final void b(ps psVar, g9 g9Var) {
        boolean zB;
        psVar.f154095f.getClass();
        if (ii2.a(g9Var)) {
            qd1 qd1Var = psVar.f154094e;
            synchronized (qd1Var) {
                zB = qd1Var.f154437a.b();
            }
            if (zB) {
                psVar.a(g9Var, new ns(psVar, g9Var), "render");
            }
        }
    }

    @Override // yads.hd1
    public final void a(final g9 g9Var) {
        this.f154091b.a();
        if (this.f154097h == null) {
            lc1.c("InterstitialAdLoader. InterstitialAdLoadListener is null on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f154092c.a(new Runnable() { // from class: yads.q84
            @Override // java.lang.Runnable
            public final void run() {
                ps.a(this.f154356b, g9Var);
            }
        });
    }

    public final void a(g9 g9Var, w00 w00Var, String str) {
        g9 g9VarA = g9.a(g9Var, null, str, 2047);
        fd1 fd1VarA = this.f154093d.a(this.f154090a, this, g9VarA, new ms(this, g9VarA));
        this.f154096g.add(fd1VarA);
        String str2 = g9VarA.f149471a;
        fd1VarA.f158922c.a(str2);
        fd1VarA.F.f155471f = str2;
        fd1VarA.a(w00Var);
        fd1VarA.b(g9VarA);
    }

    public static final void a(ps psVar, g9 g9Var) {
        jd1 jd1Var;
        psVar.f154095f.getClass();
        if (ii2.a(g9Var)) {
            qd1 qd1Var = psVar.f154094e;
            synchronized (qd1Var) {
                ki2 ki2Var = qd1Var.f154437a;
                qd1Var.f154438b.getClass();
                jd1Var = (jd1) ki2Var.a(oy0.a(g9Var));
            }
            if (jd1Var != null) {
                w00 w00Var = psVar.f154097h;
                if (w00Var != null) {
                    w00Var.a(jd1Var);
                    return;
                }
                return;
            }
            psVar.a(g9Var, new os(psVar), "default");
            return;
        }
        psVar.a(g9Var, new os(psVar), "default");
    }

    @Override // yads.r5
    public final void a(fy0 fy0Var) {
        fd1 fd1Var = (fd1) fy0Var;
        if (this.f154097h == null) {
            lc1.c("InterstitialAdLoader. InterstitialAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        fd1Var.a((w00) null);
        this.f154096g.remove(fd1Var);
    }

    @Override // yads.hd1
    public final void a(ct3 ct3Var) {
        this.f154091b.a();
        this.f154097h = ct3Var;
    }
}
