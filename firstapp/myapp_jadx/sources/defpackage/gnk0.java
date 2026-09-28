package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes4.dex */
public final class gnk0 extends ymk0 {
    public final g2l0 g;
    public final /* synthetic */ knk0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnk0(knk0 knk0Var, String str, int i, g2l0 g2l0Var) {
        super(str, i);
        this.h = knk0Var;
        this.g = g2l0Var;
    }

    @Override // defpackage.ymk0
    public final int a() {
        return this.g.r();
    }

    @Override // defpackage.ymk0
    public final boolean b() {
        return true;
    }

    @Override // defpackage.ymk0
    public final boolean c() {
        return false;
    }

    public final boolean g(Long l, Long l2, s9l0 s9l0Var, boolean z) {
        boolean z2;
        Boolean boolD;
        Boolean boolF;
        Boolean boolF2;
        Boolean boolF3;
        epl0.a();
        k8l0 k8l0Var = this.h.a;
        wok0 wok0Var = k8l0Var.d;
        k4l0 k4l0Var = k8l0Var.j;
        y4l0 y4l0Var = k8l0Var.f;
        boolean zQ = wok0Var.q(this.a, v2l0.D0);
        g2l0 g2l0Var = this.g;
        boolean zU = g2l0Var.u();
        boolean zV = g2l0Var.v();
        boolean zX = g2l0Var.x();
        boolean z3 = zU || zV || zX;
        if (z && !z3) {
            k8l0.m(y4l0Var);
            y4l0Var.n.c(Integer.valueOf(this.b), "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", g2l0Var.q() ? Integer.valueOf(g2l0Var.r()) : null);
            return true;
        }
        z1l0 z1l0VarT = g2l0Var.t();
        boolean zV2 = z1l0VarT.v();
        if (!s9l0Var.v()) {
            z2 = zX;
            if (!s9l0Var.z()) {
                if (!s9l0Var.t()) {
                    k8l0.m(y4l0Var);
                    y4l0Var.i.b(k4l0Var.c(s9l0Var.s()), "User property has no value, property");
                } else if (z1l0VarT.q()) {
                    String strU = s9l0Var.u();
                    k2l0 k2l0VarR = z1l0VarT.r();
                    k8l0.m(y4l0Var);
                    boolD = ymk0.d(ymk0.e(strU, k2l0VarR, y4l0Var), zV2);
                } else if (!z1l0VarT.s()) {
                    k8l0.m(y4l0Var);
                    y4l0Var.i.b(k4l0Var.c(s9l0Var.s()), "No string or number filter defined. property");
                } else if (pol0.H(s9l0Var.u())) {
                    String strU2 = s9l0Var.u();
                    d2l0 d2l0VarT = z1l0VarT.t();
                    if (pol0.H(strU2)) {
                        try {
                            boolF = ymk0.f(new BigDecimal(strU2), d2l0VarT, 0.0d);
                        } catch (NumberFormatException unused) {
                            boolF = null;
                        }
                    } else {
                        boolF = null;
                    }
                    boolD = ymk0.d(boolF, zV2);
                } else {
                    k8l0.m(y4l0Var);
                    y4l0Var.i.c(k4l0Var.c(s9l0Var.s()), "Invalid user property value for Numeric number filter. property, value", s9l0Var.u());
                }
                boolD = null;
            } else if (z1l0VarT.s()) {
                double dA = s9l0Var.A();
                try {
                    boolF2 = ymk0.f(new BigDecimal(dA), z1l0VarT.t(), Math.ulp(dA));
                } catch (NumberFormatException unused2) {
                    boolF2 = null;
                }
                boolD = ymk0.d(boolF2, zV2);
            } else {
                k8l0.m(y4l0Var);
                y4l0Var.i.b(k4l0Var.c(s9l0Var.s()), "No number filter for double property. property");
                boolD = null;
            }
        } else if (z1l0VarT.s()) {
            z2 = zX;
            try {
                boolF3 = ymk0.f(new BigDecimal(s9l0Var.w()), z1l0VarT.t(), 0.0d);
            } catch (NumberFormatException unused3) {
                boolF3 = null;
            }
            boolD = ymk0.d(boolF3, zV2);
        } else {
            k8l0.m(y4l0Var);
            y4l0Var.i.b(k4l0Var.c(s9l0Var.s()), "No number filter for long property. property");
            z2 = zX;
            boolD = null;
        }
        k8l0.m(y4l0Var);
        y4l0Var.n.b(boolD == null ? "null" : boolD, "Property filter result");
        if (boolD == null) {
            return false;
        }
        this.c = Boolean.TRUE;
        if (!z2 || boolD.booleanValue()) {
            if (!z || g2l0Var.u()) {
                this.d = boolD;
            }
            if (boolD.booleanValue() && z3 && s9l0Var.q()) {
                long jR = s9l0Var.r();
                if (l != null) {
                    jR = l.longValue();
                }
                if (zQ && g2l0Var.u() && !g2l0Var.v() && l2 != null) {
                    jR = l2.longValue();
                }
                if (g2l0Var.v()) {
                    this.f = Long.valueOf(jR);
                } else {
                    this.e = Long.valueOf(jR);
                }
            }
        }
        return true;
    }
}
