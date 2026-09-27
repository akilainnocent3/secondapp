package yads;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class d91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h6 f148102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xp f148103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zp f148104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lg1 f148105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final tn0 f148106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kg2 f148107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u4.u1.g f148108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vd3 f148109h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ta f148110i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f6 f148111j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final wo0 f148112k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final kf2 f148113l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public m00 f148114m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u4.u1 f148115n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f148116o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f148117p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f148118q;

    public d91(h6 h6Var, xp xpVar, zp zpVar, lg1 lg1Var, tn0 tn0Var, kg2 kg2Var, io0 io0Var, vd3 vd3Var, ta taVar, f6 f6Var, wo0 wo0Var, kf2 kf2Var) {
        this.f148102a = h6Var;
        this.f148103b = xpVar;
        this.f148104c = zpVar;
        this.f148105d = lg1Var;
        this.f148106e = tn0Var;
        this.f148107f = kg2Var;
        this.f148108g = io0Var;
        this.f148109h = vd3Var;
        this.f148110i = taVar;
        this.f148111j = f6Var;
        this.f148112k = wo0Var;
        this.f148113l = kf2Var;
    }

    public final void a(ViewGroup viewGroup, List list) {
        if (this.f148118q || this.f148114m != null || viewGroup == null) {
            return;
        }
        this.f148118q = true;
        if (list == null) {
            list = fr.h0.J();
        }
        lg1 lg1Var = this.f148105d;
        b91 b91Var = new b91(this);
        lg1Var.getClass();
        jg1 jg1Var = new jg1(viewGroup, list, b91Var);
        b81 b81Var = lg1Var.f151977b;
        b81Var.a(jg1Var);
        b81Var.a(lg1Var.f151976a);
    }
}
