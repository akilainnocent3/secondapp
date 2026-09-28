package defpackage;

import java.math.BigDecimal;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class afj0 {
    public final v7k a;
    public final idj0 b;
    public final vcj0 c;
    public final ccj0 d;
    public final psm e;
    public final rdd0 f;
    public final x2f g;
    public final wwd0 h;
    public final wwd0 i;
    public final wwd0 j;
    public final wwd0 k;
    public final wwd0 l;
    public final wwd0 m;
    public final wwd0 n;

    public afj0(v7k v7kVar, idj0 idj0Var, vcj0 vcj0Var, ccj0 ccj0Var, psm psmVar, rdd0 rdd0Var, x2f x2fVar) {
        this.a = v7kVar;
        this.b = idj0Var;
        this.c = vcj0Var;
        this.d = ccj0Var;
        this.e = psmVar;
        this.f = rdd0Var;
        this.g = x2fVar;
        Boolean bool = Boolean.FALSE;
        this.h = xwd0.a(bool);
        this.i = xwd0.a(rcj0.b.a);
        this.j = xwd0.a(bool);
        this.k = xwd0.a(lcj0.a);
        this.l = xwd0.a(null);
        this.m = xwd0.a(null);
        this.n = xwd0.a(null);
    }

    public final String a(BigDecimal bigDecimal) {
        return this.e.b() + bjb0.L(s5y.a(bigDecimal), Locale.US);
    }
}
