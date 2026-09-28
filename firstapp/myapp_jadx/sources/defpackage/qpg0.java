package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lqpg0;", "Lj8i0;", "", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qpg0 extends j8i0 {
    public final wwd0 A;
    public final wwd0 B;
    public final v340 C;
    public final ku90<h7l> D;
    public final ku90 E;
    public final v340 F;
    public final uy0 a;
    public final sr10 b;
    public final lyz c;
    public final d100 d;
    public final t990 e;
    public log0 f;
    public final wwd0 i;
    public final wwd0 v;
    public final wwd0 w;
    public final wwd0 y;
    public final wwd0 z;

    public qpg0(uy0 uy0Var, sr10 sr10Var, lyz lyzVar, d100 d100Var, m2l m2lVar, t990 t990Var) {
        uy0Var.getClass();
        sr10Var.getClass();
        lyzVar.getClass();
        d100Var.getClass();
        m2lVar.getClass();
        this.a = uy0Var;
        this.b = sr10Var;
        this.c = lyzVar;
        this.d = d100Var;
        this.e = t990Var;
        wwd0 wwd0VarA = xwd0.a(tzs.a.a);
        this.i = wwd0VarA;
        this.v = wwd0VarA;
        lk50.b bVar = lk50.b.a;
        wwd0 wwd0VarA2 = xwd0.a(bVar);
        this.w = wwd0VarA2;
        this.y = wwd0VarA2;
        wwd0 wwd0VarA3 = xwd0.a(bVar);
        this.z = wwd0VarA3;
        this.A = wwd0VarA3;
        wwd0 wwd0VarA4 = xwd0.a(bVar);
        this.B = wwd0VarA4;
        this.C = e1i.e(bm50.f(r1i.a(wwd0VarA4, lyzVar.a(pu0.b.a), m2lVar.a.getBooleanByFlow("key_name_update_result_dialog_has_shown", true), new gpg0(4, null))), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), m7l.c.a);
        ku90<h7l> ku90Var = new ku90<>();
        this.D = ku90Var;
        this.E = ku90Var;
        t990Var.b(o8i0.d(this));
        this.F = e1i.e(new n1i(bm50.f(wwd0VarA2), new f1i(bm50.f(wwd0VarA3)), new ppg0(3, null)), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), new fpg0(0));
    }

    public final List<c9p> x1() {
        ArrayList arrayListL = b.l(ej5.c(o8i0.d(this), null, null, new jpg0(this, null), 3), ej5.c(o8i0.d(this), null, null, new hpg0(this, null), 3), ej5.c(o8i0.d(this), null, null, new kpg0(this, null), 3), this.b.j(o8i0.d(this)), ej5.c(o8i0.d(this), null, null, new lpg0(this, null), 3));
        log0 log0Var = this.f;
        if (log0Var == null) {
            Intrinsics.n("tradeType");
            throw null;
        }
        if (log0Var == log0.b) {
            arrayListL.add(ej5.c(o8i0.d(this), null, null, new mpg0(this, null), 3));
        }
        return arrayListL;
    }
}
