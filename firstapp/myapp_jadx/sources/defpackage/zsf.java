package defpackage;

import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lzsf;", "Lavw;", "Lusf;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class zsf extends avw<usf> {
    public final hrd0 A;
    public vfb0 B;
    public scs C;
    public wfb0 D;
    public wfb0 E;
    public BigDecimal F;
    public BigDecimal G;
    public final wwd0 H;
    public final v340 I;
    public final wwd0 J;
    public final v340 K;
    public ijf0 L;
    public ijf0 M;
    public ijf0 N;
    public final tsf e;
    public final n3k f;
    public final w7k i;
    public final ws60 v;
    public final cnc w;
    public final v0j0 y;
    public final y4w z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsf(tsf tsfVar, n3k n3kVar, w7k w7kVar, ws60 ws60Var, cnc cncVar, v0j0 v0j0Var, y4w y4wVar, hrd0 hrd0Var) {
        super(usf.b.a);
        cncVar.getClass();
        v0j0Var.getClass();
        y4wVar.getClass();
        hrd0Var.getClass();
        this.e = tsfVar;
        this.f = n3kVar;
        this.i = w7kVar;
        this.v = ws60Var;
        this.w = cncVar;
        this.y = v0j0Var;
        this.z = y4wVar;
        this.A = hrd0Var;
        wwd0 wwd0VarA = xwd0.a(uxs.DISABLE);
        this.H = wwd0VarA;
        this.I = e1i.b(wwd0VarA);
        wwd0 wwd0VarA2 = xwd0.a(Boolean.FALSE);
        this.J = wwd0VarA2;
        this.K = e1i.b(wwd0VarA2);
        this.L = new ijf0("", 0L, 6);
        this.M = new ijf0("", 0L, 6);
        this.N = new ijf0("", 0L, 6);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0101  */
    public final void A1() {
        String str = this.L.a.b;
        BigDecimal bigDecimal = this.F;
        BigDecimal bigDecimal2 = this.G;
        cnc cncVar = this.w;
        cncVar.getClass();
        str.getClass();
        muh0 muh0VarA = b22.a(cncVar, str, bigDecimal, bigDecimal2);
        String str2 = this.M.a.b;
        BigDecimal bigDecimal3 = this.F;
        BigDecimal bigDecimal4 = this.G;
        String str3 = this.L.a.b;
        v0j0 v0j0Var = this.y;
        v0j0Var.getClass();
        str2.getClass();
        str3.getClass();
        muh0 muh0VarA2 = b22.a(v0j0Var, str2, bigDecimal3, bigDecimal4);
        if (!(muh0VarA2 instanceof muh0.a)) {
            if (str3.length() == 0) {
                muh0VarA2 = new muh0.b(null);
            } else {
                BigDecimal bigDecimal5 = ((muh0.b) muh0VarA2).a;
                BigDecimal bigDecimalG = b.g(str3);
                if (bigDecimalG == null) {
                    muh0VarA2 = new muh0.a(R.string.page_limits__empty_daily_error);
                } else {
                    muh0VarA2 = (bigDecimal5 == null || bigDecimal5.compareTo(bigDecimalG) > 0) ? new muh0.b(bigDecimalG) : new muh0.a(R.string.page_limits__the_amount_must_be_higher_than_the_daily_limit);
                }
            }
        }
        muh0 muh0Var = muh0VarA2;
        String str4 = this.N.a.b;
        BigDecimal bigDecimal6 = this.F;
        BigDecimal bigDecimal7 = this.G;
        String str5 = this.L.a.b;
        String str6 = this.M.a.b;
        y4w y4wVar = this.z;
        y4wVar.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        muh0 muh0VarA3 = b22.a(y4wVar, str4, bigDecimal6, bigDecimal7);
        if (!(muh0VarA3 instanceof muh0.a)) {
            if (str5.length() == 0 && str6.length() == 0) {
                new muh0.b(null);
            }
            BigDecimal bigDecimal8 = ((muh0.b) muh0VarA3).a;
            if (str6.length() > 0) {
                BigDecimal bigDecimalG2 = b.g(str6);
                if (bigDecimalG2 == null) {
                    muh0VarA3 = new muh0.a(R.string.page_limits__empty_weekly_error);
                } else if (bigDecimal8 == null || bigDecimal8.compareTo(bigDecimalG2) > 0) {
                    muh0VarA3 = new muh0.b(null);
                } else {
                    muh0VarA3 = new muh0.a(R.string.page_limits__the_amount_must_be_higher_than_the_weekly_limit);
                }
            } else if (str5.length() != 0 || str6.length() <= 0) {
                muh0VarA3 = new muh0.b(null);
            } else {
                BigDecimal bigDecimalG3 = b.g(str5);
                if (bigDecimalG3 == null) {
                    muh0VarA3 = new muh0.a(R.string.page_limits__empty_weekly_error);
                } else if (bigDecimal8 == null || bigDecimal8.compareTo(bigDecimalG3) > 0) {
                    muh0VarA3 = new muh0.b(null);
                } else {
                    muh0VarA3 = new muh0.a(R.string.page_limits__the_amount_must_be_higher_than_the_weekly_limit);
                }
            }
        }
        y1(new xsf(this, muh0VarA, muh0Var, muh0VarA3, null));
    }

    public final boolean z1() {
        wfb0 wfb0Var = this.D;
        if (wfb0Var == null) {
            Intrinsics.n("originalInfo");
            throw null;
        }
        wfb0 wfb0Var2 = this.E;
        if (wfb0Var2 != null) {
            this.e.getClass();
            return (Intrinsics.g(wfb0Var.a.b.a.b, wfb0Var2.a.b.a.b) && Intrinsics.g(wfb0Var.b.b.a.b, wfb0Var2.b.b.a.b) && Intrinsics.g(wfb0Var.c.b.a.b, wfb0Var2.c.b.a.b)) ? false : true;
        }
        Intrinsics.n("editedInfo");
        throw null;
    }
}
