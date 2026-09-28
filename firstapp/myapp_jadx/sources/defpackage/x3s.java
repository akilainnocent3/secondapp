package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.penalty.NetworkSportyPenaltyFeature;
import com.sportybet.android.instantwin.newtork.model.response.penalty.NetworkSportyPenaltyMarketCategory;
import com.sportybet.android.instantwin.newtork.model.response.penalty.NetworkSportyPenaltyMarketType;
import com.sportybet.android.instantwin.newtork.model.response.penalty.NetworkSportyPenaltyOddsFilter;
import com.sportybet.android.instantwin.newtork.model.response.penalty.NetworkSportyPenaltySportConfig;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final class x3s {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v3, types: [m2g] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [m2g] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    public static final k4d0 a(NetworkSportyPenaltySportConfig networkSportyPenaltySportConfig) {
        BigDecimal bigDecimalG;
        BigDecimal bigDecimalG2;
        BigDecimal bigDecimalG3;
        ?? arrayList;
        NetworkSportyPenaltyOddsFilter oddsFilter;
        List<Float> presetRange;
        ?? arrayList2;
        pwc0 pwc0Var;
        networkSportyPenaltySportConfig.getClass();
        String sportId = networkSportyPenaltySportConfig.getSportId();
        String minStake = networkSportyPenaltySportConfig.getMinStake();
        String maxStake = networkSportyPenaltySportConfig.getMaxStake();
        String maxPayout = networkSportyPenaltySportConfig.getMaxPayout();
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
        hvc0 hvc0Var = new hvc0(bigDecimalG, bigDecimalG2, bigDecimalG3);
        boolean active = networkSportyPenaltySportConfig.getActive();
        String str = sportId == null ? "" : sportId;
        boolean gift = networkSportyPenaltySportConfig.getGift();
        List<NetworkSportyPenaltyMarketCategory> marketCategories = networkSportyPenaltySportConfig.getMarketCategories();
        wyc0 wyc0Var = null;
        if (marketCategories != null) {
            arrayList = new ArrayList();
            for (NetworkSportyPenaltyMarketCategory networkSportyPenaltyMarketCategory : marketCategories) {
                String id = networkSportyPenaltyMarketCategory.getId();
                if (id == null) {
                    pwc0Var = null;
                } else {
                    String name = networkSportyPenaltyMarketCategory.getName();
                    if (name == null) {
                        name = "";
                    }
                    List<NetworkSportyPenaltyMarketType> marketTypes = networkSportyPenaltyMarketCategory.getMarketTypes();
                    if (marketTypes != null) {
                        arrayList2 = new ArrayList();
                        Iterator it = marketTypes.iterator();
                        while (it.hasNext()) {
                            String type = ((NetworkSportyPenaltyMarketType) it.next()).getType();
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
                    pwc0Var = new pwc0(id, name, arrayList2);
                }
                if (pwc0Var != null) {
                    arrayList.add(pwc0Var);
                }
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = m2g.a;
        }
        ?? r9 = arrayList;
        NetworkSportyPenaltyFeature feature = networkSportyPenaltySportConfig.getFeature();
        if (feature != null && (oddsFilter = feature.getOddsFilter()) != null && oddsFilter.getStatus() == 1 && (presetRange = oddsFilter.getPresetRange()) != null && !presetRange.isEmpty() && oddsFilter.getShortcut() != null) {
            List<Float> presetRange2 = oddsFilter.getPresetRange();
            ArrayList arrayList3 = new ArrayList(l48.r(presetRange2, 10));
            Iterator it2 = presetRange2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new BigDecimal(String.valueOf(((Number) it2.next()).floatValue())));
            }
            wyc0Var = new wyc0(arrayList3, new BigDecimal(String.valueOf(oddsFilter.getShortcut().getRisky())), new BigDecimal(String.valueOf(oddsFilter.getShortcut().getSimple())));
        }
        return new k4d0(active, str, hvc0Var, gift, r9, wyc0Var);
    }
}
