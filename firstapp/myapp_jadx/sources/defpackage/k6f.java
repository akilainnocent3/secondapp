package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.EarlyPayoutMarket;
import com.sportybet.plugin.realsports.data.Market;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k6f {
    public final f6f a;
    public final t880 b;
    public final c980 c;

    public k6f(f6f f6fVar, t880 t880Var, c980 c980Var) {
        t880Var.getClass();
        c980Var.getClass();
        this.a = f6fVar;
        this.b = t880Var;
        this.c = c980Var;
    }

    public final apx a(Selection selection, boolean z, boolean z2, Boolean bool) {
        j6f j6fVar;
        boolean zBooleanValue;
        selection.getClass();
        if (!z) {
            return apx.b.a;
        }
        pvy pvyVar = this.a.a;
        Market market = selection.b;
        String str = market.id;
        boolean z3 = Intrinsics.g(str, "1") || Intrinsics.g(str, "60210");
        boolean z4 = Intrinsics.g(str, "60200") || Intrinsics.g(str, "60100");
        EarlyPayoutMarket earlyPayoutMarketB = qvy.b(market);
        if (z3 || (z4 && earlyPayoutMarketB != null)) {
            Set setB = (earlyPayoutMarketB == null || !earlyPayoutMarketB.getSupported() || selection.n()) ? t3g.a : wi80.b(g6f.a);
            Set set = (!pvyVar.b.e(ckf.e, market.product != 3) || pvyVar.a.m0()) ? t3g.a : setB;
            Set setB2 = (!qvy.d(selection) || selection.n()) ? t3g.a : wi80.b(g6f.a);
            h6f h6fVar = h6f.a;
            j6fVar = new j6f(setB, set, setB2);
        } else {
            j6fVar = null;
        }
        if (j6fVar == null) {
            return apx.b.a;
        }
        if (j6fVar.a.isEmpty()) {
            return apx.b.a;
        }
        Set<g6f> set2 = j6fVar.b;
        g6f g6fVar = g6f.a;
        if (!set2.contains(g6fVar)) {
            return apx.b.a;
        }
        Boolean boolC = this.c.c(selection, c980.a.b);
        boolean zBooleanValue2 = boolC != null ? boolC.booleanValue() : j6fVar.c.contains(g6fVar);
        boolean z5 = this.b.a(o980.a(selection), t880.a.c) || boolC != null;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = u7u.h(selection) || u7u.i(selection);
        }
        return new apx.a(zBooleanValue2, z5, !zBooleanValue, zBooleanValue, z2);
    }
}
