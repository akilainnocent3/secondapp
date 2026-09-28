package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.Feature;
import com.sportybet.android.instantwin.newtork.model.response.InstantWinType;
import com.sportybet.android.instantwin.newtork.model.response.MarketCategory;
import com.sportybet.android.instantwin.newtork.model.response.Sports;
import com.sportybet.android.instantwin.newtork.model.response.SportsAnimationMode;
import com.sportygames.crash.models.bet.BetContainerState;
import com.sportygames.vip.data.TurboUsageCountResponse;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final class xxm {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;

    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    public static boolean a(ul2 ul2Var, long j, String str) {
        boolean z;
        Double turboValue;
        ul2Var.getClass();
        x5a0 x5a0Var = (x5a0) gci0.d;
        TurboUsageCountResponse turboUsageCountResponse = (TurboUsageCountResponse) x5a0Var.getValue();
        if (((turboUsageCountResponse == null || (turboValue = turboUsageCountResponse.getTurboValue()) == null) ? 0.0d : turboValue.doubleValue()) >= 100.0d) {
            long roundId = ((BetContainerState) ul2Var.a.getValue()).getRoundId();
            x5a0 x5a0Var2 = (x5a0) gci0.p;
            Object value = x5a0Var2.getValue();
            Boolean bool = Boolean.TRUE;
            boolean z2 = Intrinsics.g(value, bool) && j == roundId && str.equals("ROUND_WAITING");
            if (Intrinsics.g(x5a0Var2.getValue(), bool)) {
                z = true;
            } else {
                TurboUsageCountResponse turboUsageCountResponse2 = (TurboUsageCountResponse) x5a0Var.getValue();
                Long activateAfterRoundId = turboUsageCountResponse2 != null ? turboUsageCountResponse2.getActivateAfterRoundId() : null;
                if (activateAfterRoundId == null || activateAfterRoundId.longValue() == 0 || j <= 0 || (j <= activateAfterRoundId.longValue() && !(j == activateAfterRoundId.longValue() && (str.equals("ROUND_END_WAIT") || str.equals("ROUND_PRE_START") || str.equals("ROUND_ONGOING"))))) {
                    z = false;
                } else {
                    z = true;
                }
            }
            boolean z3 = ((Boolean) ((x5a0) gci0.l).getValue()).booleanValue();
            if (z && (!z3 || z2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v4, types: [m2g] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [m2g] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    public static final imc0 b(Sports sports) {
        BigDecimal bigDecimalG;
        BigDecimal bigDecimalG2;
        BigDecimal bigDecimalG3;
        ?? arrayList;
        ?? arrayList2;
        tdc0 tdc0Var;
        sports.getClass();
        String sportId = sports.getSportId();
        String minStake = sports.getMinStake();
        String maxStake = sports.getMaxStake();
        String maxPayout = sports.getMaxPayout();
        List<MarketCategory> marketCategories = sports.getMarketCategories();
        if (minStake == null || (bigDecimalG = b.g(minStake)) == null) {
            bigDecimalG = BigDecimal.ZERO;
        }
        bigDecimalG.getClass();
        if (maxStake == null || (bigDecimalG2 = b.g(maxStake)) == null) {
            bigDecimalG2 = BigDecimal.ZERO;
        }
        bigDecimalG2.getClass();
        if (maxPayout == null || (bigDecimalG3 = b.g(maxPayout)) == null) {
            bigDecimalG3 = BigDecimal.ZERO;
        }
        bigDecimalG3.getClass();
        vac0 vac0Var = new vac0(bigDecimalG, bigDecimalG2, bigDecimalG3);
        boolean active = sports.getActive();
        String str = sportId == null ? "" : sportId;
        Integer keepBetLimit = sports.getKeepBetLimit();
        long jIntValue = keepBetLimit != null ? keepBetLimit.intValue() : Long.MAX_VALUE;
        boolean gift = sports.getGift();
        boolean statsEnable = sports.getStatsEnable();
        SportsAnimationMode animationMode = sports.getAnimationMode();
        if (marketCategories != null) {
            arrayList = new ArrayList();
            for (MarketCategory marketCategory : marketCategories) {
                String id = marketCategory.getId();
                if (id == null) {
                    tdc0Var = null;
                } else {
                    String name = marketCategory.getName();
                    List<InstantWinType> marketTypes = marketCategory.getMarketTypes();
                    if (name == null) {
                        name = "";
                    }
                    if (marketTypes != null) {
                        arrayList2 = new ArrayList();
                        Iterator it = marketTypes.iterator();
                        while (it.hasNext()) {
                            String type = ((InstantWinType) it.next()).getType();
                            if (type != null) {
                                arrayList2.add(type);
                            }
                        }
                    } else {
                        arrayList2 = 0;
                    }
                    if (arrayList2 == 0) {
                        arrayList2 = m2g.a;
                    }
                    tdc0Var = new tdc0(id, name, arrayList2);
                }
                if (tdc0Var != null) {
                    arrayList.add(tdc0Var);
                }
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = m2g.a;
        }
        ?? r13 = arrayList;
        Feature feature = sports.getFeature();
        return new imc0(active, str, vac0Var, jIntValue, gift, feature != null ? feature.getOddsFilter() : null, r13, statsEnable, animationMode);
    }
}
