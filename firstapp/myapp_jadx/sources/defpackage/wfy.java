package defpackage;

import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sportybet.feature.liveoddsboost.OddsBoostLfbConfig;
import com.sportybet.feature.liveoddsboost.OddsBoostRtpRatio;
import com.sportybet.plugin.realsports.data.Outcome;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/* JADX INFO: loaded from: classes6.dex */
public final class wfy implements sfy, luh, fjt {
    public static final BigDecimal v;
    public final fgy a;
    public final lq1 b;
    public final yi5 c;
    public OddsBoostLfbConfig d;
    public List<OddsBoostRtpRatio> e;
    public List<OddsBoostRtpRatio> f;
    public Set<String> i;

    static {
        BigDecimal bigDecimal = BigDecimal.ONE;
        bigDecimal.getClass();
        v = bigDecimal;
    }

    public wfy(fgy fgyVar, uqm uqmVar, lq1 lq1Var, yi5 yi5Var) {
        fgyVar.getClass();
        uqmVar.getClass();
        lq1Var.getClass();
        yi5Var.getClass();
        this.a = fgyVar;
        this.b = lq1Var;
        this.c = yi5Var;
        uqmVar.addLogoutEventListener(this);
        m2g m2gVar = m2g.a;
        this.e = m2gVar;
        this.f = m2gVar;
        this.i = t3g.a;
    }

    public static BigDecimal m(Outcome outcome, List list) {
        Object next;
        String ratio;
        String str = outcome.odds;
        str.getClass();
        BigDecimal bigDecimalG = b.g(str);
        if (bigDecimalG != null) {
            BigDecimal bigDecimalMultiply = bigDecimalG.multiply(new BigDecimal(String.valueOf(outcome.probability)));
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                OddsBoostRtpRatio oddsBoostRtpRatio = (OddsBoostRtpRatio) next;
                BigDecimal bigDecimalG2 = b.g(oddsBoostRtpRatio.getMinRtp());
                BigDecimal bigDecimalG3 = b.g(oddsBoostRtpRatio.getMaxRtp());
                if (bigDecimalMultiply.compareTo(bigDecimalG2) >= 0 && bigDecimalMultiply.compareTo(bigDecimalG3) <= 0) {
                    break;
                }
            }
            OddsBoostRtpRatio oddsBoostRtpRatio2 = (OddsBoostRtpRatio) next;
            if (oddsBoostRtpRatio2 != null && (ratio = oddsBoostRtpRatio2.getRatio()) != null) {
                return new BigDecimal(ratio);
            }
        }
        return v;
    }

    @Override // defpackage.sfy, defpackage.luh
    public final BigDecimal a(Outcome outcome) {
        outcome.getClass();
        return m(outcome, this.f);
    }

    @Override // defpackage.sfy, defpackage.luh
    public final boolean b(BigDecimal bigDecimal) {
        bigDecimal.getClass();
        return !h(bigDecimal);
    }

    @Override // defpackage.sfy
    public final BigDecimal c(Outcome outcome) {
        outcome.getClass();
        return m(outcome, this.e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.sfy
    public final Object d(x1b x1bVar) {
        vfy vfyVar;
        if (x1bVar instanceof vfy) {
            vfyVar = (vfy) x1bVar;
            int i = vfyVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vfyVar.d = i - Integer.MIN_VALUE;
            } else {
                vfyVar = new vfy(this, x1bVar);
            }
        } else {
            vfyVar = new vfy(this, x1bVar);
        }
        Object objC = vfyVar.b;
        y5b y5bVar = y5b.a;
        int i2 = vfyVar.d;
        try {
            if (i2 == 0) {
                uj50.b(objC);
                if (!i()) {
                    return Unit.a;
                }
                zi50.a aVar = zi50.b;
                fgy fgyVar = this.a;
                vfyVar.a = this;
                vfyVar.d = 1;
                objC = fgyVar.c(vfyVar);
                if (objC == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = vfyVar.a;
                uj50.b(objC);
            }
            this.d = (OddsBoostLfbConfig) objC;
            Unit unit = Unit.a;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable unused) {
            zi50.a aVar3 = zi50.b;
        }
        return Unit.a;
    }

    @Override // defpackage.sfy
    public final void e(Set<String> set) {
        set.getClass();
        this.i = set;
    }

    @Override // defpackage.sfy
    public final void f() {
        this.a.d();
    }

    @Override // defpackage.sfy
    public final void g() {
        this.i = t3g.a;
    }

    @Override // defpackage.sfy
    public final boolean h(BigDecimal bigDecimal) {
        bigDecimal.getClass();
        return Intrinsics.g(v, bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros());
    }

    @Override // defpackage.luh
    public final boolean i() {
        return qq1.c(this.b, BOConfigParam.OddsBoostFlashBoostEnabled, this.c.b().a());
    }

    @Override // defpackage.luh
    public final OddsBoostLfbConfig j() {
        return this.d;
    }

    @Override // defpackage.luh
    public final boolean k(String str, String str2) {
        str.getClass();
        str2.getClass();
        return this.i.contains(i8z.a(str, str2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.sfy
    public final Object l(x1b x1bVar) {
        tfy tfyVar;
        if (x1bVar instanceof tfy) {
            tfyVar = (tfy) x1bVar;
            int i = tfyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tfyVar.c = i - Integer.MIN_VALUE;
            } else {
                tfyVar = new tfy(this, x1bVar);
            }
        } else {
            tfyVar = new tfy(this, x1bVar);
        }
        Object obj = tfyVar.a;
        y5b y5bVar = y5b.a;
        int i2 = tfyVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            ufy ufyVar = new ufy(this, null);
            tfyVar.c = 1;
            if (w5b.d(ufyVar, tfyVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }

    @Override // defpackage.fjt
    public final void p() {
        this.d = null;
        m2g m2gVar = m2g.a;
        this.e = m2gVar;
        this.f = m2gVar;
        this.i = t3g.a;
        fgy fgyVar = this.a;
        fgyVar.b();
        fgyVar.d();
    }
}
