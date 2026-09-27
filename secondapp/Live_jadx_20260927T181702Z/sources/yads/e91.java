package yads;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class e91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i6 f148588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yp f148589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aq f148590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mg1 f148591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final un0 f148592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lg2 f148593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final re.l4.g f148594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vd3 f148595h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ua f148596i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g6 f148597j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final xo0 f148598k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final lf2 f148599l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public m00 f148600m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public re.l4 f148601n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f148602o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f148603p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f148604q;

    public e91(i6 i6Var, yp ypVar, aq aqVar, mg1 mg1Var, un0 un0Var, lg2 lg2Var, jo0 jo0Var, vd3 vd3Var, ua uaVar, g6 g6Var, xo0 xo0Var, lf2 lf2Var) {
        this.f148588a = i6Var;
        this.f148589b = ypVar;
        this.f148590c = aqVar;
        this.f148591d = mg1Var;
        this.f148592e = un0Var;
        this.f148593f = lg2Var;
        this.f148594g = jo0Var;
        this.f148595h = vd3Var;
        this.f148596i = uaVar;
        this.f148597j = g6Var;
        this.f148598k = xo0Var;
        this.f148599l = lf2Var;
    }

    public final void a(ViewGroup viewGroup, List list) {
        if (this.f148604q || this.f148600m != null || viewGroup == null) {
            return;
        }
        this.f148604q = true;
        if (list == null) {
            list = fr.h0.J();
        }
        mg1 mg1Var = this.f148591d;
        c91 c91Var = new c91(this);
        mg1Var.getClass();
        kg1 kg1Var = new kg1(viewGroup, list, c91Var);
        b81 b81Var = mg1Var.f152448b;
        b81Var.a(kg1Var);
        b81Var.a(mg1Var.f152447a);
    }
}
