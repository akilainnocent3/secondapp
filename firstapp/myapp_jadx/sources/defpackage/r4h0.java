package defpackage;

import com.sporty.android.common.uievent.a;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lr4h0;", "Lj8i0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class r4h0 extends j8i0 {
    public final mpe0 A;
    public final v340 B;
    public final ku90<a> C;
    public final ku90 D;
    public final wwd0 E;
    public final v340 F;
    public final v340 G;
    public final wwd0 H;
    public final wwd0 I;
    public final v340 J;
    public Long K;
    public final wwd0 L;
    public jvd0 M;
    public final wwd0 N;
    public final wwd0 O;
    public final v340 P;
    public final List<lyh<lk50<Object>>> Q;
    public final v340 R;
    public final sr10 a;
    public final uy0 b;
    public final d100 c;
    public final b700 d;
    public final u700 e;
    public final lyz f;
    public final psm i;
    public final rdd0 v;
    public String w;
    public int y;
    public final String z;

    public r4h0(sr10 sr10Var, uy0 uy0Var, d100 d100Var, b700 b700Var, u700 u700Var, lyz lyzVar, psm psmVar, rdd0 rdd0Var) {
        sr10Var.getClass();
        uy0Var.getClass();
        d100Var.getClass();
        b700Var.getClass();
        lyzVar.getClass();
        psmVar.getClass();
        rdd0Var.getClass();
        this.a = sr10Var;
        this.b = uy0Var;
        this.c = d100Var;
        this.d = b700Var;
        this.e = u700Var;
        this.f = lyzVar;
        this.i = psmVar;
        this.v = rdd0Var;
        this.y = -1;
        this.z = psmVar.B();
        this.A = hwr.b(new n2d(1));
        this.B = e1i.b(y1());
        ku90<a> ku90Var = new ku90<>();
        this.C = ku90Var;
        this.D = ku90Var;
        this.E = xwd0.a(tzs.a.a);
        e77 e77VarI = d100Var.I();
        et7 et7VarD = o8i0.d(this);
        kwd0 kwd0Var = q490.a.a;
        this.F = e1i.e(e77VarI, et7VarD, kwd0Var, 30);
        j200 j200VarO = d100Var.o();
        et7 et7VarD2 = o8i0.d(this);
        Boolean bool = Boolean.FALSE;
        this.G = e1i.e(j200VarO, et7VarD2, q490.a.b, bool);
        this.H = xwd0.a(bool);
        wwd0 wwd0VarA = xwd0.a(null);
        this.I = wwd0VarA;
        this.J = e1i.b(wwd0VarA);
        this.L = xwd0.a(bool);
        lk50.b bVar = lk50.b.a;
        wwd0 wwd0VarA2 = xwd0.a(bVar);
        this.N = wwd0VarA2;
        this.O = xwd0.a(bVar);
        this.P = e1i.e(sr10Var.c0(pu0.b.a), o8i0.d(this), kwd0Var, t8h0.a.a(psmVar.getCountryCode()));
        this.Q = kotlin.collections.a.c(wwd0VarA2);
        this.R = e1i.e(new q4h0(bm50.f(wwd0VarA2), this), o8i0.d(this), kwd0Var, new f1h0(0));
    }

    public static void A1(r4h0 r4h0Var, xpg0 xpg0Var, Function1 function1, int i) {
        k00[] k00VarArr = {k00.d};
        if ((i & 4) != 0) {
            function1 = new b4h0();
        }
        r4h0Var.getClass();
        lpi.b(r4h0Var.v, r4h0Var.i, xpg0Var, (k00[]) Arrays.copyOf(k00VarArr, k00VarArr.length), function1);
    }

    public final long x1() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = this.K;
        return Math.max(0L, (((Number) this.F.a.getValue()).longValue() * 1000) - (System.currentTimeMillis() - (l != null ? l.longValue() : jCurrentTimeMillis - 86400000)));
    }

    public final ztw<t3h0> y1() {
        return (ztw) this.A.getValue();
    }

    public final List<c9p> z1() {
        return b.k(ej5.c(o8i0.d(this), null, null, new o4h0(null, this), 3), ej5.c(o8i0.d(this), null, null, new l4h0(null, this), 3), ej5.c(o8i0.d(this), null, null, new n4h0(null, this), 3), kzh.d(this.c.a(pu0.c.a), o8i0.d(this)));
    }
}
