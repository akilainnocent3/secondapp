package yads;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fs implements oh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f149219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rh1 f149220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mh1 f149221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh f149222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sh f149223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ii2 f149224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArrayList f149225g = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f00 f149226h;

    public fs(Context context, rh1 rh1Var, mh1 mh1Var, qh qhVar, sh shVar, ii2 ii2Var) {
        this.f149219a = context;
        this.f149220b = rh1Var;
        this.f149221c = mh1Var;
        this.f149222d = qhVar;
        this.f149223e = shVar;
        this.f149224f = ii2Var;
    }

    @Override // yads.oh
    public final void a() {
        this.f149220b.a();
        this.f149221c.a();
        for (nh nhVar : this.f149225g) {
            nhVar.a((f00) null);
            nhVar.d();
        }
        this.f149225g.clear();
    }

    public final void b(final g9 g9Var) {
        this.f149221c.a(new Runnable() { // from class: yads.x04
            @Override // java.lang.Runnable
            public final void run() {
                fs.b(this.f157607b, g9Var);
            }
        });
    }

    public static final void b(fs fsVar, g9 g9Var) {
        boolean zB;
        fsVar.f149224f.getClass();
        if (ii2.a(g9Var)) {
            sh shVar = fsVar.f149223e;
            synchronized (shVar) {
                zB = shVar.f155427a.b();
            }
            if (zB) {
                fsVar.a(g9Var, new ds(fsVar, g9Var), "render");
            }
        }
    }

    @Override // yads.oh
    public final void a(final g9 g9Var) {
        this.f149220b.a();
        if (this.f149226h == null) {
            lc1.c("AppOpenAdLoader. AppOpenAdLoadListener is null on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f149221c.a(new Runnable() { // from class: yads.w04
            @Override // java.lang.Runnable
            public final void run() {
                fs.a(this.f157159b, g9Var);
            }
        });
    }

    public final void a(g9 g9Var, f00 f00Var, String str) {
        g9 g9VarA = g9.a(g9Var, null, str, 2047);
        nh nhVarA = this.f149222d.a(this.f149219a, this, g9VarA, new cs(this, g9VarA));
        this.f149225g.add(nhVarA);
        nhVarA.f158922c.a(g9VarA.f149471a);
        nhVarA.a(f00Var);
        nhVarA.b(g9VarA);
    }

    public static final void a(fs fsVar, g9 g9Var) {
        uh uhVar;
        fsVar.f149224f.getClass();
        if (ii2.a(g9Var)) {
            sh shVar = fsVar.f149223e;
            synchronized (shVar) {
                ki2 ki2Var = shVar.f155427a;
                shVar.f155428b.getClass();
                uhVar = (uh) ki2Var.a(oy0.a(g9Var));
            }
            if (uhVar != null) {
                f00 f00Var = fsVar.f149226h;
                if (f00Var != null) {
                    f00Var.a(uhVar);
                    return;
                }
                return;
            }
            fsVar.a(g9Var, new es(fsVar), "default");
            return;
        }
        fsVar.a(g9Var, new es(fsVar), "default");
    }

    @Override // yads.r5
    public final void a(fy0 fy0Var) {
        nh nhVar = (nh) fy0Var;
        if (this.f149226h == null) {
            lc1.c("AppOpenAdLoader. AppOpenAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        nhVar.a((f00) null);
        this.f149225g.remove(nhVar);
    }

    @Override // yads.oh
    public final void a(mq3 mq3Var) {
        this.f149220b.a();
        this.f149226h = mq3Var;
    }
}
