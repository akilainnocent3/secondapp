package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0002¨\u0006\u0003"}, d2 = {"Ld4d0;", "Lj8i0;", "", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class d4d0 extends j8i0 {
    public final b390 A;
    public final cmo a;
    public final psm b;
    public final i3d0 c;
    public final y1d0 d;
    public final rdd0 e;
    public final y8j f;
    public final v340 i;
    public final ku90<t3d0> v;
    public final wwd0 w;
    public final wwd0 y;
    public final v340 z;

    public d4d0(vu60 vu60Var, cmo cmoVar, psm psmVar, i3d0 i3d0Var, y1d0 y1d0Var, rdd0 rdd0Var, y8j y8jVar) {
        vu60Var.getClass();
        psmVar.getClass();
        i3d0Var.getClass();
        y1d0Var.getClass();
        rdd0Var.getClass();
        y8jVar.getClass();
        this.a = cmoVar;
        this.b = psmVar;
        this.c = i3d0Var;
        this.d = y1d0Var;
        this.e = rdd0Var;
        this.f = y8jVar;
        v340 v340VarD = vu60Var.d(null, "ARG_INPUT");
        this.i = v340VarD;
        this.v = new ku90<>();
        a4d0 a4d0Var = new a4d0(v340VarD, this);
        r2d0.a.getClass();
        wwd0 wwd0VarA = xwd0.a(r2d0.a.b);
        this.w = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(u3d0.h);
        this.y = wwd0VarA2;
        this.z = e1i.b(wwd0VarA2);
        b390 b390VarB = d390.b(0, 1, pb5.b, 1);
        this.A = b390VarB;
        kzh.d(new g1i(new c4d0(r1i.a(a4d0Var, new b4d0(new f1i(v340VarD)), wwd0VarA, v3d0.v), this), new w3d0(this, null)), o8i0.d(this));
        kzh.d(new g1i(b390VarB, new x3d0(this, null)), o8i0.d(this));
        kzh.d(new g1i(new z3d0(wwd0VarA), new y3d0(this, null)), o8i0.d(this));
    }

    public final String x1() {
        b2d0 b2d0Var = (b2d0) this.i.a.getValue();
        String str = b2d0Var != null ? b2d0Var.a : null;
        return str == null ? "" : str;
    }
}
