package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcsc0;", "Lj8i0;", "sportyMedia"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class csc0 extends j8i0 {
    public final xtc0 a;
    public final wwd0 b;
    public final v340 c;
    public final wwd0 d;
    public final v340 e;

    public csc0(xtc0 xtc0Var) {
        this.a = xtc0Var;
        wwd0 wwd0VarA = xwd0.a(dy0.b.a);
        this.b = wwd0VarA;
        this.c = e1i.b(wwd0VarA);
        wwd0 wwd0VarA2 = xwd0.a(Boolean.FALSE);
        this.d = wwd0VarA2;
        this.e = e1i.b(wwd0VarA2);
    }

    public final void x1(String str) {
        str.getClass();
        et7 et7VarD = o8i0.d(this);
        m4 m4Var = new m4(this, 3);
        xtc0 xtc0Var = this.a;
        xtc0Var.getClass();
        jvd0 jvd0Var = xtc0Var.d;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        xtc0Var.d = kzh.d(new g1i(new yzh(new xzh(new ltc0(xtc0Var.a.e(str)), new mtc0(2, null)), new ntc0(3, null)), new otc0(m4Var, null)), et7VarD);
    }
}
