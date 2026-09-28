package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.feature.liveoddsboost.OddsBoostLfbConfig;
import com.sportybet.feature.liveoddsboost.OddsBoostRtpRatio;
import com.sportybet.feature.liveoddsboost.OddsBoostRtpRatioResponse;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class mgy implements fgy {
    public final bsu a;
    public final a1f0<Object, List<OddsBoostRtpRatio>> b;
    public final a1f0<ggy, OddsBoostLfbConfig> c;

    public mgy(bsu bsuVar, a1f0<Object, List<OddsBoostRtpRatio>> a1f0Var, a1f0<ggy, OddsBoostLfbConfig> a1f0Var2) {
        bsuVar.getClass();
        a1f0Var.getClass();
        a1f0Var2.getClass();
        this.a = bsuVar;
        this.b = a1f0Var;
        this.c = a1f0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.fgy
    public final Object a(x1b x1bVar) {
        lgy lgyVar;
        if (x1bVar instanceof lgy) {
            lgyVar = (lgy) x1bVar;
            int i = lgyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lgyVar.c = i - Integer.MIN_VALUE;
            } else {
                lgyVar = new lgy(this, x1bVar);
            }
        } else {
            lgyVar = new lgy(this, x1bVar);
        }
        Object objA = lgyVar.a;
        y5b y5bVar = y5b.a;
        int i2 = lgyVar.c;
        igy igyVar = igy.a;
        a1f0<Object, List<OddsBoostRtpRatio>> a1f0Var = this.b;
        if (i2 == 0) {
            uj50.b(objA);
            List<OddsBoostRtpRatio> listA = a1f0Var.a(igyVar);
            if (listA != null) {
                return listA;
            }
            lgyVar.c = 1;
            objA = this.a.a(lgyVar);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objA);
        }
        OddsBoostRtpRatioResponse oddsBoostRtpRatioResponse = (OddsBoostRtpRatioResponse) n52.b((BaseResponse) objA);
        a1f0Var.b(igyVar, oddsBoostRtpRatioResponse.getRatios());
        return oddsBoostRtpRatioResponse.getRatios();
    }

    @Override // defpackage.fgy
    public final void b() {
        this.b.b.e(-1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.fgy
    public final Object c(x1b x1bVar) {
        kgy kgyVar;
        if (x1bVar instanceof kgy) {
            kgyVar = (kgy) x1bVar;
            int i = kgyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kgyVar.c = i - Integer.MIN_VALUE;
            } else {
                kgyVar = new kgy(this, x1bVar);
            }
        } else {
            kgyVar = new kgy(this, x1bVar);
        }
        Object objE = kgyVar.a;
        y5b y5bVar = y5b.a;
        int i2 = kgyVar.c;
        ggy ggyVar = ggy.a;
        a1f0<ggy, OddsBoostLfbConfig> a1f0Var = this.c;
        if (i2 == 0) {
            uj50.b(objE);
            OddsBoostLfbConfig oddsBoostLfbConfigA = a1f0Var.a(ggyVar);
            if (oddsBoostLfbConfigA != null) {
                return oddsBoostLfbConfigA;
            }
            kgyVar.c = 1;
            objE = this.a.e(kgyVar);
            if (objE == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objE);
        }
        OddsBoostLfbConfig oddsBoostLfbConfig = (OddsBoostLfbConfig) n52.b((BaseResponse) objE);
        a1f0Var.b(ggyVar, oddsBoostLfbConfig);
        return oddsBoostLfbConfig;
    }

    @Override // defpackage.fgy
    public final void d() {
        this.c.b.e(-1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.fgy
    public final Object e(x1b x1bVar) {
        jgy jgyVar;
        if (x1bVar instanceof jgy) {
            jgyVar = (jgy) x1bVar;
            int i = jgyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jgyVar.c = i - Integer.MIN_VALUE;
            } else {
                jgyVar = new jgy(this, x1bVar);
            }
        } else {
            jgyVar = new jgy(this, x1bVar);
        }
        Object objC = jgyVar.a;
        y5b y5bVar = y5b.a;
        int i2 = jgyVar.c;
        hgy hgyVar = hgy.a;
        a1f0<Object, List<OddsBoostRtpRatio>> a1f0Var = this.b;
        if (i2 == 0) {
            uj50.b(objC);
            List<OddsBoostRtpRatio> listA = a1f0Var.a(hgyVar);
            if (listA != null) {
                return listA;
            }
            jgyVar.c = 1;
            objC = this.a.c(jgyVar);
            if (objC == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objC);
        }
        OddsBoostRtpRatioResponse oddsBoostRtpRatioResponse = (OddsBoostRtpRatioResponse) n52.b((BaseResponse) objC);
        a1f0Var.b(hgyVar, oddsBoostRtpRatioResponse.getRatios());
        return oddsBoostRtpRatioResponse.getRatios();
    }
}
