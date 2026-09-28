package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingDynamicMultiBetBonus;
import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingDynamicMultiBetBonusBonusRatio;
import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingFeature;
import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingFeatureFlexibet;
import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingFeatureOnecut;
import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingGameType;
import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingLeague;
import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingMultiBetBonus;
import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingMultiBetBonusBonusRatio;
import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingSportConfig;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final class e4o {
    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:62:0x011b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v4, types: [m2g] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v6, types: [m2g] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [m2g] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [m2g] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.ArrayList] */
    public static final d4o a(NetworkInstantRacingSportConfig networkInstantRacingSportConfig) {
        BigDecimal bigDecimalG;
        BigDecimal bigDecimalG2;
        BigDecimal bigDecimalG3;
        Object next;
        ltn bVar;
        ?? arrayList;
        ?? arrayList2;
        mwn mwnVar;
        ?? arrayList3;
        ?? arrayList4;
        networkInstantRacingSportConfig.getClass();
        String minStake = networkInstantRacingSportConfig.getMinStake();
        if (minStake == null || (bigDecimalG = b.g(minStake)) == null) {
            bigDecimalG = BigDecimal.ZERO;
        }
        bigDecimalG.getClass();
        String maxStake = networkInstantRacingSportConfig.getMaxStake();
        if (maxStake == null || (bigDecimalG2 = b.g(maxStake)) == null) {
            bigDecimalG2 = BigDecimal.ZERO;
        }
        bigDecimalG2.getClass();
        String maxPayout = networkInstantRacingSportConfig.getMaxPayout();
        if (maxPayout == null || (bigDecimalG3 = b.g(maxPayout)) == null) {
            bigDecimalG3 = BigDecimal.ZERO;
        }
        bigDecimalG3.getClass();
        vsn vsnVar = new vsn(bigDecimalG, bigDecimalG2, bigDecimalG3);
        uag uagVar = mtn.f;
        q3.b bVarA = ocx.a(uagVar, uagVar);
        do {
            if (!bVarA.hasNext()) {
                next = null;
                break;
            }
            next = bVarA.next();
        } while (((mtn) next).a != networkInstantRacingSportConfig.getBonusType());
        mtn mtnVar = (mtn) next;
        if (mtnVar == null) {
            bVar = ltn.c.a;
        } else {
            int iOrdinal = mtnVar.ordinal();
            if (iOrdinal == 0) {
                bVar = ltn.c.a;
            } else if (iOrdinal == 1) {
                NetworkInstantRacingMultiBetBonus multiBetBonus = networkInstantRacingSportConfig.getMultiBetBonus();
                if (multiBetBonus != null) {
                    boolean enable = multiBetBonus.getEnable();
                    long qualifyingOddsLimit = multiBetBonus.getQualifyingOddsLimit();
                    int minSelections = multiBetBonus.getMinSelections();
                    int maxSelections = multiBetBonus.getMaxSelections();
                    List<NetworkInstantRacingMultiBetBonusBonusRatio> bonusRatios = multiBetBonus.getBonusRatios();
                    if (bonusRatios != null) {
                        arrayList3 = new ArrayList(l48.r(bonusRatios, 10));
                        for (NetworkInstantRacingMultiBetBonusBonusRatio networkInstantRacingMultiBetBonusBonusRatio : bonusRatios) {
                            arrayList3.add(new ltn.b.a(networkInstantRacingMultiBetBonusBonusRatio.getSelections(), networkInstantRacingMultiBetBonusBonusRatio.getRatio()));
                        }
                    } else {
                        arrayList3 = 0;
                    }
                    if (arrayList3 == 0) {
                        arrayList3 = m2g.a;
                    }
                    bVar = new ltn.b(enable, qualifyingOddsLimit, minSelections, maxSelections, arrayList3);
                } else {
                    bVar = null;
                }
            } else {
                if (iOrdinal != 2) {
                    uhc.a();
                    return null;
                }
                NetworkInstantRacingDynamicMultiBetBonus dynamicMultiBetBonus = networkInstantRacingSportConfig.getDynamicMultiBetBonus();
                if (dynamicMultiBetBonus != null) {
                    boolean enable2 = dynamicMultiBetBonus.getEnable();
                    int factor = dynamicMultiBetBonus.getFactor();
                    long qualifyingOddsLimit2 = dynamicMultiBetBonus.getQualifyingOddsLimit();
                    List<NetworkInstantRacingDynamicMultiBetBonusBonusRatio> bonusRatios2 = dynamicMultiBetBonus.getBonusRatios();
                    if (bonusRatios2 != null) {
                        arrayList4 = new ArrayList(l48.r(bonusRatios2, 10));
                        for (NetworkInstantRacingDynamicMultiBetBonusBonusRatio networkInstantRacingDynamicMultiBetBonusBonusRatio : bonusRatios2) {
                            arrayList4.add(new ltn.a.C0836a(networkInstantRacingDynamicMultiBetBonusBonusRatio.getSelections(), networkInstantRacingDynamicMultiBetBonusBonusRatio.getMin(), networkInstantRacingDynamicMultiBetBonusBonusRatio.getMax()));
                        }
                    } else {
                        arrayList4 = 0;
                    }
                    if (arrayList4 == 0) {
                        arrayList4 = m2g.a;
                    }
                    bVar = new ltn.a(enable2, factor, qualifyingOddsLimit2, arrayList4);
                } else {
                    bVar = null;
                }
            }
            if (bVar == null) {
                bVar = ltn.c.a;
            }
        }
        ltn ltnVar = bVar;
        boolean active = networkInstantRacingSportConfig.getActive();
        String sportId = networkInstantRacingSportConfig.getSportId();
        if (sportId == null) {
            sportId = "";
        }
        String backgroundUrl = networkInstantRacingSportConfig.getBackgroundUrl();
        if (backgroundUrl == null) {
            backgroundUrl = "";
        }
        long keepBetLimit = networkInstantRacingSportConfig.getKeepBetLimit();
        String str = sportId;
        String str2 = backgroundUrl;
        boolean statsEnable = networkInstantRacingSportConfig.getStatsEnable();
        boolean gift = networkInstantRacingSportConfig.getGift();
        List<NetworkInstantRacingGameType> gameTypes = networkInstantRacingSportConfig.getGameTypes();
        if (gameTypes != null) {
            arrayList = new ArrayList(l48.r(gameTypes, 10));
            for (NetworkInstantRacingGameType networkInstantRacingGameType : gameTypes) {
                String id = networkInstantRacingGameType.getId();
                String str3 = id == null ? "" : id;
                String name = networkInstantRacingGameType.getName();
                String str4 = name == null ? "" : name;
                String type = networkInstantRacingGameType.getType();
                if (type == null) {
                    type = "";
                }
                arrayList.add(new nwn(str3, str4, type));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = m2g.a;
        }
        ?? r10 = arrayList;
        List<NetworkInstantRacingLeague> leagues = networkInstantRacingSportConfig.getLeagues();
        if (leagues != null) {
            arrayList2 = new ArrayList(l48.r(leagues, 10));
            Iterator it = leagues.iterator();
            while (it.hasNext()) {
                arrayList2.add(pwn.d((NetworkInstantRacingLeague) it.next()));
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = m2g.a;
        }
        NetworkInstantRacingFeature feature = networkInstantRacingSportConfig.getFeature();
        if (feature != null) {
            NetworkInstantRacingFeatureFlexibet flexibet = feature.getFlexibet();
            mwn.a aVar = flexibet != null ? new mwn.a(flexibet.getStatus(), flexibet.getOddsKey(), flexibet.getFlexibleMinOdds()) : null;
            NetworkInstantRacingFeatureOnecut onecut = feature.getOnecut();
            mwnVar = new mwn(aVar, onecut != null ? new mwn.b(onecut.getStatus()) : null);
        } else {
            mwnVar = null;
        }
        return new d4o(active, str, str2, vsnVar, keepBetLimit, statsEnable, gift, ltnVar, r10, arrayList2, mwnVar);
    }
}
