package defpackage;

import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import java.math.BigDecimal;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final class aa70 {
    public final uqm a;
    public final nzm b;
    public final jpk c;
    public final rmw d;
    public final String e;
    public final wwd0 f;
    public final wwd0 g;
    public final wwd0 h;

    public aa70(uqm uqmVar, nzm nzmVar, jpk jpkVar, rmw rmwVar) {
        this.a = uqmVar;
        this.b = nzmVar;
        this.c = jpkVar;
        this.d = rmwVar;
        bz3 bz3Var = bz3.SINGLE;
        this.e = SimulateBetConsts.BetslipType.MULTIPLE;
        this.f = xwd0.a(nmw.g);
        this.g = xwd0.a(lmw.m);
        String strJ = nzmVar.j();
        strJ.getClass();
        this.h = xwd0.a(strJ);
    }

    public final void a(zrd0 zrd0Var) {
        wwd0 wwd0Var;
        Object value;
        wwd0 wwd0Var2;
        Object value2;
        if (zrd0Var instanceof zrd0.b) {
            return;
        }
        if (!(zrd0Var instanceof zrd0.a)) {
            uhc.a();
            return;
        }
        do {
            wwd0Var = this.h;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, ""));
        do {
            wwd0Var2 = this.f;
            value2 = wwd0Var2.getValue();
        } while (!wwd0Var2.g(value2, nmw.a((nmw) value2, "")));
    }

    public final void b(zrd0 zrd0Var, boolean z) {
        BigDecimal bigDecimalG;
        if (z) {
            if (zrd0Var instanceof zrd0.b) {
                bigDecimalG = null;
            } else {
                if (!(zrd0Var instanceof zrd0.a)) {
                    uhc.a();
                    return;
                }
                bigDecimalG = b.g((String) this.h.getValue());
            }
            if (bigDecimalG == null) {
                return;
            }
            this.a.setCustomDefaultStake(bigDecimalG);
        }
    }

    public final void c(zrd0 zrd0Var) {
        Object value;
        wwd0 wwd0Var;
        Object value2;
        if (zrd0Var instanceof zrd0.b) {
            return;
        }
        if (!(zrd0Var instanceof zrd0.a)) {
            uhc.a();
            return;
        }
        wwd0 wwd0Var2 = this.h;
        String strE = wae0.E((String) wwd0Var2.getValue());
        do {
            value = wwd0Var2.getValue();
        } while (!wwd0Var2.g(value, strE));
        do {
            wwd0Var = this.f;
            value2 = wwd0Var.getValue();
        } while (!wwd0Var.g(value2, nmw.a((nmw) value2, strE)));
    }

    public final void d(zrd0 zrd0Var, BigDecimal bigDecimal) {
        Object value;
        wwd0 wwd0Var;
        Object value2;
        if (zrd0Var instanceof zrd0.b) {
            return;
        }
        if (!(zrd0Var instanceof zrd0.a)) {
            uhc.a();
            return;
        }
        wwd0 wwd0Var2 = this.h;
        BigDecimal bigDecimalG = b.g((String) wwd0Var2.getValue());
        if (bigDecimalG == null) {
            bigDecimalG = BigDecimal.ZERO;
        }
        String strC = b6y.c(bigDecimalG.add(bigDecimal));
        do {
            value = wwd0Var2.getValue();
            strC.getClass();
        } while (!wwd0Var2.g(value, strC));
        do {
            wwd0Var = this.f;
            value2 = wwd0Var.getValue();
        } while (!wwd0Var.g(value2, nmw.a((nmw) value2, strC)));
    }

    public final void e(zrd0 zrd0Var, String str) {
        Object value;
        wwd0 wwd0Var;
        Object value2;
        if (zrd0Var instanceof zrd0.b) {
            return;
        }
        if (!(zrd0Var instanceof zrd0.a)) {
            uhc.a();
            return;
        }
        wwd0 wwd0Var2 = this.h;
        String strA = kn5.a((String) wwd0Var2.getValue(), str);
        do {
            value = wwd0Var2.getValue();
        } while (!wwd0Var2.g(value, strA));
        do {
            wwd0Var = this.f;
            value2 = wwd0Var.getValue();
        } while (!wwd0Var.g(value2, nmw.a((nmw) value2, strA)));
    }
}
