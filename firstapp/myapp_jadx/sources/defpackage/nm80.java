package defpackage;

import com.sporty.android.core.model.account.themes.ThemeConfig;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnm80;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class nm80 extends j8i0 {
    public final tb5 A;
    public final o67 B;
    public final lyh<Boolean> C;
    public final wwd0 D;
    public final v340 E;
    public final dm80 F;
    public final h440 G;
    public jvd0 H;
    public boolean I;
    public final v340 J;
    public final fls a;
    public final lyz b;
    public final hqa c;
    public final m2l d;
    public final rdd0 e;
    public final k7k f;
    public final vh80 i;
    public final du0 v;
    public jvd0 w;
    public final ssw<Boolean> y;
    public final v340 z;

    public nm80(fls flsVar, lyz lyzVar, hqa hqaVar, lel lelVar, m2l m2lVar, rdd0 rdd0Var, k7k k7kVar, bek bekVar, vh80 vh80Var, du0 du0Var) {
        flsVar.getClass();
        lyzVar.getClass();
        hqaVar.getClass();
        m2lVar.getClass();
        rdd0Var.getClass();
        k7kVar.getClass();
        this.a = flsVar;
        this.b = lyzVar;
        this.c = hqaVar;
        this.d = m2lVar;
        this.e = rdd0Var;
        this.f = k7kVar;
        this.i = vh80Var;
        this.v = du0Var;
        this.y = new ssw<>();
        this.z = hqaVar.f;
        tb5 tb5VarB = d77.b(-1, 6, null);
        this.A = tb5VarB;
        this.B = izh.c(tb5VarB);
        wm20<Boolean> wm20VarA = du0Var.a();
        Boolean bool = Boolean.FALSE;
        this.C = wm20VarA.d(bool);
        wwd0 wwd0VarA = xwd0.a(new bm80(false, false));
        this.D = wwd0VarA;
        this.E = e1i.b(wwd0VarA);
        ej5.c(o8i0.d(this), null, null, new em80(this, null), 3);
        kzh.d(new g1i(new n1i(new yzh(new or60(new ydk(bekVar, null)), new zdk(3, null)), new xdk(((yfe) bekVar.b).d()), new aek(3, null)), new fm80(this, null)), o8i0.d(this));
        this.F = new dm80(this, 0);
        this.G = new h440(this, 1);
        qa30 qa30Var = lelVar.a;
        this.J = e1i.e(uzh.b(new n1i(qa30Var.e(new pu0.a(0)), qa30Var.f(), new kel(3, null))), o8i0.d(this), q490.a.b, bool);
    }

    public final void x1(pdd0 pdd0Var, k00... k00VarArr) {
        pdd0Var.getClass();
        this.e.a(pdd0Var, (k00[]) Arrays.copyOf(k00VarArr, k00VarArr.length));
    }

    public final void y1(ThemeConfig themeConfig) {
        themeConfig.getClass();
        ej5.c(o8i0.d(this), null, null, new im80(this, themeConfig, null), 3);
    }
}
