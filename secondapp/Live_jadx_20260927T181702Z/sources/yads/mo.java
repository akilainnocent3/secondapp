package yads;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class mo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f152576a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f152577b = new HashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bn1 f152578c = new bn1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ok0 f152579d = new ok0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Looper f152580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s63 f152581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ye2 f152582g;

    public abstract pm1 a(ym1 ym1Var, qe qeVar, long j10);

    public void a() {
    }

    public abstract void a(pm1 pm1Var);

    public abstract void a(r83 r83Var);

    public void b() {
    }

    public abstract fm1 c();

    public final void c(zm1 zm1Var) {
        this.f152576a.remove(zm1Var);
        if (!this.f152576a.isEmpty()) {
            a(zm1Var);
            return;
        }
        this.f152580e = null;
        this.f152581f = null;
        this.f152582g = null;
        this.f152577b.clear();
        e();
    }

    public abstract void d();

    public abstract void e();

    public final ok0 a(ym1 ym1Var) {
        return new ok0(this.f152579d.f153520c, 0, ym1Var);
    }

    public final bn1 b(ym1 ym1Var) {
        return new bn1(this.f152578c.f147287c, 0, ym1Var, 0L);
    }

    public final void a(zm1 zm1Var) {
        boolean zIsEmpty = this.f152577b.isEmpty();
        this.f152577b.remove(zm1Var);
        if (zIsEmpty || !this.f152577b.isEmpty()) {
            return;
        }
        a();
    }

    public final void b(zm1 zm1Var) {
        this.f152580e.getClass();
        boolean zIsEmpty = this.f152577b.isEmpty();
        this.f152577b.add(zm1Var);
        if (zIsEmpty) {
            b();
        }
    }

    public final void a(s63 s63Var) {
        this.f152581f = s63Var;
        Iterator it = this.f152576a.iterator();
        while (it.hasNext()) {
            ((zm1) it.next()).a(this, s63Var);
        }
    }

    public final void a(pk0 pk0Var) {
        ok0 ok0Var = this.f152579d;
        for (nk0 nk0Var : ok0Var.f153520c) {
            if (nk0Var.f153064b == pk0Var) {
                ok0Var.f153520c.remove(nk0Var);
            }
        }
    }

    public final void a(cn1 cn1Var) {
        bn1 bn1Var = this.f152578c;
        for (an1 an1Var : bn1Var.f147287c) {
            if (an1Var.f146872b == cn1Var) {
                bn1Var.f147287c.remove(an1Var);
            }
        }
    }
}
