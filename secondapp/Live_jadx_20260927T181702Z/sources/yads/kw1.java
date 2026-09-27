package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class kw1 implements o11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gw1 f151750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xv1 f151751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lh3 f151752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zn3 f151753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uv1 f151754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k11 f151755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nt2 f151756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ev f151757h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f151758i;

    public /* synthetic */ kw1(gw1 gw1Var, xv1 xv1Var) {
        lh3 lh3Var = new lh3();
        zn3 zn3Var = new zn3(gw1Var);
        uv1 uv1Var = new uv1();
        k11 k11Var = new k11();
        Object obj = dw2.f148384j;
        this(gw1Var, xv1Var, lh3Var, zn3Var, uv1Var, k11Var, cw2.a().a(gw1Var.f()));
    }

    @Override // yads.o11
    public final void a(hb2 hb2Var, Map map) {
    }

    @Override // yads.o11
    public final void a(boolean z10) {
    }

    @Override // yads.o11
    public final void a(String str) {
        nt2 nt2Var = this.f151756g;
        if (nt2Var == null || !nt2Var.B0 || this.f151758i) {
            ev evVar = this.f151757h;
            if (evVar != null) {
                gw1 gw1Var = this.f151750a;
                rv1 rv1Var = (rv1) evVar;
                if1 if1Var = rv1Var.f155166a;
                if1 if1Var2 = new if1(if1Var.f150589a, if1Var.f150590b, if1Var.f150591c, str, if1Var.f150593e);
                hv hvVar = rv1Var.f155167b;
                l12 l12Var = hvVar.f150313c;
                iv ivVar = l12Var.f151833a;
                oi oiVar = hvVar.f150311a;
                y3 y3Var = hvVar.f150312b;
                kn2 kn2Var = hvVar.f150314d;
                jx0 jx0Var = hvVar.f150315e;
                ivVar.getClass();
                new tz1(jx0Var, kn2Var, y3Var, l12Var, oiVar, if1Var2).onClick(gw1Var);
            }
            this.f151758i = false;
        }
    }

    public kw1(gw1 gw1Var, xv1 xv1Var, lh3 lh3Var, zn3 zn3Var, uv1 uv1Var, k11 k11Var, nt2 nt2Var) {
        this.f151750a = gw1Var;
        this.f151751b = xv1Var;
        this.f151752c = lh3Var;
        this.f151753d = zn3Var;
        this.f151754e = uv1Var;
        this.f151755f = k11Var;
        this.f151756g = nt2Var;
    }

    @Override // yads.o11
    public final void a() {
        this.f151758i = true;
    }
}
