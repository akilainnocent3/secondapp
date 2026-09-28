package defpackage;

import com.sporty.android.core.model.patron.Country;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lphu;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class phu extends j8i0 {
    public final psm a;
    public final azm b;
    public final r2k c;
    public final ct40 d;
    public final le50 e;
    public final buh0 f;
    public final nsm i;
    public final ku90<us40> v;
    public final f1i w;
    public final wwd0 y;
    public final v340 z;

    public phu(yi5 yi5Var, psm psmVar, azm azmVar, r2k r2kVar, ct40 ct40Var, le50 le50Var, buh0 buh0Var, nsm nsmVar) {
        yi5Var.getClass();
        psmVar.getClass();
        azmVar.getClass();
        nsmVar.getClass();
        this.a = psmVar;
        this.b = azmVar;
        this.c = r2kVar;
        this.d = ct40Var;
        this.e = le50Var;
        this.f = buh0Var;
        this.i = nsmVar;
        ku90<us40> ku90Var = new ku90<>();
        this.v = ku90Var;
        this.w = new f1i(e1i.a(ku90Var));
        wwd0 wwd0VarA = xwd0.a(new thu(psmVar.X(), psmVar.c(), psmVar.M(), new ijf0((String) null, 0L, 7), new ijf0((String) null, 0L, 7), n1a0.c, Country.INSTANCE.getMOZAMBIQUE(), null, new ijf0((String) null, 0L, 7), null, new ijf0((String) null, 0L, 7), null, new dwz(63), yi5Var.b().j() ? new iej.b(false, false) : iej.a.a, uxs.DISABLE, sx40.b.a));
        this.y = wwd0VarA;
        this.z = e1i.b(wwd0VarA);
        ej5.c(o8i0.d(this), null, null, new ohu(this, null), 3);
    }

    public final void x1() {
        wwd0 wwd0Var;
        Object value;
        thu thuVar = (thu) this.z.a.getValue();
        if (thuVar.o != uxs.LOADING) {
            boolean z = (StringsKt.U(thuVar.d.a.b) || StringsKt.U(thuVar.e.a.b)) ? false : true;
            boolean z2 = !StringsKt.U(thuVar.i.a.b) && thuVar.j == null;
            boolean zA = thuVar.m.a();
            boolean z3 = thuVar.h != null;
            do {
                wwd0Var = this.y;
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, thu.a((thu) value, null, null, null, null, null, null, null, null, null, (z && z2 && zA && z3) ? uxs.ENABLE : uxs.DISABLE, sx40.b.a, 16383)));
        }
    }
}
