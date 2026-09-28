package com.sportybet.plugin.realsports.data.sim;

import com.google.protobuf.Reader;
import com.sporty.android.core.model.sportysim.SimBonusRatiosData;
import defpackage.ird0;
import defpackage.uwd0;
import defpackage.xwd0;
import defpackage.zd2;
import defpackage.ztw;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010%\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J#\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0003J\u001d\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001aJ\r\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001aJ\r\u0010\u001e\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010!J\r\u0010#\u001a\u00020\u0004¢\u0006\u0004\b#\u0010!J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0002¢\u0006\u0004\b$\u0010%R\"\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b&\u0010!\"\u0004\b(\u0010\bR$\u0010)\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010/\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R$\u00102\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010*\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.R\"\u00105\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u001f\"\u0004\b8\u00109R)\u0010;\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\f0:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R)\u0010?\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\f0:8\u0006¢\u0006\f\n\u0004\b?\u0010<\u001a\u0004\b@\u0010>R\"\u0010A\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010'\u001a\u0004\bA\u0010!\"\u0004\bB\u0010\bR\"\u0010C\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u00106\u001a\u0004\bD\u0010\u001f\"\u0004\bE\u00109R%\u0010H\u001a\u0010\u0012\f\u0012\n G*\u0004\u0018\u00010\u00120\u00120F8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\"\u0010L\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010'\u001a\u0004\bM\u0010!\"\u0004\bN\u0010\bR\"\u0010P\u001a\u00020O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010Q\u001a\u0004\bW\u0010S\"\u0004\bX\u0010UR#\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00140:8\u0006¢\u0006\f\n\u0004\bY\u0010<\u001a\u0004\bZ\u0010>R\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00040[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R$\u0010a\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010\u001f\"\u0004\b`\u00109R\u0017\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00040b8F¢\u0006\u0006\u001a\u0004\bc\u0010dR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020\n0\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bf\u0010%¨\u0006h"}, d2 = {"Lcom/sportybet/plugin/realsports/data/sim/SimShareData;", "", "<init>", "()V", "", "enabled", "", "setSpeedControllerEnabled", "(Z)V", "resetAutoBetTimes", "", "sportId", "", "supportMarkets", "setLiveMarketCategoryMap", "(Ljava/lang/String;Ljava/util/Set;)V", "setPrematchMarketCategoryMap", "clearMarketCategorySets", "", "selections", "Lcom/sporty/android/core/model/sportysim/SimBonusRatiosData;", "bonusRatios", "setRationBySelectionMapping", "(ILcom/sporty/android/core/model/sportysim/SimBonusRatiosData;)V", "Ljava/math/BigDecimal;", "getSimMinStake", "()Ljava/math/BigDecimal;", "getSimMaxStake", "getSimMaxPayout", "getSimOddsLimit", "getMinOddsCount", "()I", "hasAnyOneTwoUpSupportedInSim", "()Z", "isOneUpSupportedInSim", "isTwoUpSupportedInSim", "buildSimSupportedMarketIds", "()Ljava/util/Set;", "isSimulatedActive", "Z", "setSimulatedActive", "minStake", "Ljava/lang/String;", "getMinStake", "()Ljava/lang/String;", "setMinStake", "(Ljava/lang/String;)V", "maxStake", "getMaxStake", "setMaxStake", "maxPayout", "getMaxPayout", "setMaxPayout", "maxSelection", "I", "getMaxSelection", "setMaxSelection", "(I)V", "", "prematchMarketCategorySet", "Ljava/util/Map;", "getPrematchMarketCategorySet", "()Ljava/util/Map;", "liveMarketCategorySet", "getLiveMarketCategorySet", "isAutoBetEnabled", "setAutoBetEnabled", "autoBetMaxTimes", "getAutoBetMaxTimes", "setAutoBetMaxTimes", "Lzd2;", "kotlin.jvm.PlatformType", "autoBetTimesSubject", "Lzd2;", "getAutoBetTimesSubject", "()Lzd2;", "multiBetBonusEnable", "getMultiBetBonusEnable", "setMultiBetBonusEnable", "", "multiBetBonusFactor", "J", "getMultiBetBonusFactor", "()J", "setMultiBetBonusFactor", "(J)V", "multiBetBonusQualifyingOddsLimit", "getMultiBetBonusQualifyingOddsLimit", "setMultiBetBonusQualifyingOddsLimit", "multiBetBonusRatio", "getMultiBetBonusRatio", "Lztw;", "_speedControllerEnabledFlow", "Lztw;", "value", "getAutoBetTimes", "setAutoBetTimes", "autoBetTimes", "Luwd0;", "getSpeedControllerEnabledFlow", "()Luwd0;", "speedControllerEnabledFlow", "getSimSupportedMarketIds", "simSupportedMarketIds", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SimShareData {
    public static final int $stable = 0;
    private static boolean isAutoBetEnabled;
    private static boolean isSimulatedActive;
    private static String maxPayout;
    private static String maxStake;
    private static String minStake;
    private static boolean multiBetBonusEnable;
    private static long multiBetBonusFactor;
    private static long multiBetBonusQualifyingOddsLimit;
    public static final SimShareData INSTANCE = new SimShareData();
    private static int maxSelection = 30;
    private static final Map<String, Set<String>> prematchMarketCategorySet = new LinkedHashMap();
    private static final Map<String, Set<String>> liveMarketCategorySet = new LinkedHashMap();
    private static int autoBetMaxTimes = 1;
    private static final zd2<Integer> autoBetTimesSubject = zd2.j(1);
    private static final Map<Integer, SimBonusRatiosData> multiBetBonusRatio = new LinkedHashMap();
    private static final ztw<Boolean> _speedControllerEnabledFlow = xwd0.a(Boolean.FALSE);

    private SimShareData() {
    }

    private final Set<String> buildSimSupportedMarketIds() {
        HashSet hashSet = new HashSet();
        buildSimSupportedMarketIds$scan(hashSet, liveMarketCategorySet.values());
        buildSimSupportedMarketIds$scan(hashSet, prematchMarketCategorySet.values());
        return hashSet;
    }

    private static final void buildSimSupportedMarketIds$scan(HashSet<String> hashSet, Collection<? extends Set<String>> collection) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        Iterator<? extends Set<String>> it = collection.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next());
        }
    }

    private final Set<String> getSimSupportedMarketIds() {
        return buildSimSupportedMarketIds();
    }

    public final void clearMarketCategorySets() {
        liveMarketCategorySet.clear();
        prematchMarketCategorySet.clear();
    }

    public final int getAutoBetMaxTimes() {
        return autoBetMaxTimes;
    }

    public final int getAutoBetTimes() {
        Integer numK = autoBetTimesSubject.k();
        if (numK != null) {
            return numK.intValue();
        }
        return 1;
    }

    public final zd2<Integer> getAutoBetTimesSubject() {
        return autoBetTimesSubject;
    }

    public final Map<String, Set<String>> getLiveMarketCategorySet() {
        return liveMarketCategorySet;
    }

    public final String getMaxPayout() {
        return maxPayout;
    }

    public final int getMaxSelection() {
        return maxSelection;
    }

    public final String getMaxStake() {
        return maxStake;
    }

    public final int getMinOddsCount() {
        Iterator<Integer> it = multiBetBonusRatio.keySet().iterator();
        int i = Reader.READ_DONE;
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (2 <= iIntValue && iIntValue < i) {
                i = iIntValue;
            }
        }
        return i;
    }

    public final String getMinStake() {
        return minStake;
    }

    public final boolean getMultiBetBonusEnable() {
        return multiBetBonusEnable;
    }

    public final long getMultiBetBonusFactor() {
        return multiBetBonusFactor;
    }

    public final long getMultiBetBonusQualifyingOddsLimit() {
        return multiBetBonusQualifyingOddsLimit;
    }

    public final Map<Integer, SimBonusRatiosData> getMultiBetBonusRatio() {
        return multiBetBonusRatio;
    }

    public final Map<String, Set<String>> getPrematchMarketCategorySet() {
        return prematchMarketCategorySet;
    }

    public final BigDecimal getSimMaxPayout() {
        return maxPayout != null ? new BigDecimal(maxPayout) : ird0.b().y().getMaxPayout();
    }

    public final BigDecimal getSimMaxStake() {
        if (maxStake == null) {
            return new BigDecimal(ird0.b().y().getMaxStake().setScale(0, 1).longValue());
        }
        BigDecimal bigDecimalDivide = new BigDecimal(maxStake).divide(SimulateBetConsts.MAGIC_NUMBER, 2, RoundingMode.HALF_UP);
        bigDecimalDivide.getClass();
        return bigDecimalDivide;
    }

    public final BigDecimal getSimMinStake() {
        if (minStake == null) {
            return new BigDecimal(ird0.b().y().getMinStake().setScale(0, 0).longValue());
        }
        BigDecimal bigDecimalDivide = new BigDecimal(minStake).divide(SimulateBetConsts.MAGIC_NUMBER, 2, RoundingMode.HALF_UP);
        bigDecimalDivide.getClass();
        return bigDecimalDivide;
    }

    public final BigDecimal getSimOddsLimit() {
        BigDecimal bigDecimalDivide = new BigDecimal(multiBetBonusQualifyingOddsLimit).divide(SimulateBetConsts.MAGIC_NUMBER, 2, RoundingMode.HALF_UP);
        bigDecimalDivide.getClass();
        return bigDecimalDivide;
    }

    public final uwd0<Boolean> getSpeedControllerEnabledFlow() {
        return _speedControllerEnabledFlow;
    }

    public final boolean hasAnyOneTwoUpSupportedInSim() {
        return isOneUpSupportedInSim() || isTwoUpSupportedInSim();
    }

    public final boolean isAutoBetEnabled() {
        return isAutoBetEnabled;
    }

    public final boolean isOneUpSupportedInSim() {
        return getSimSupportedMarketIds().contains("60200");
    }

    public final boolean isSimulatedActive() {
        return isSimulatedActive;
    }

    public final boolean isTwoUpSupportedInSim() {
        return getSimSupportedMarketIds().contains("60100");
    }

    public final void resetAutoBetTimes() {
        setAutoBetTimes(1);
    }

    public final void setAutoBetEnabled(boolean z) {
        isAutoBetEnabled = z;
    }

    public final void setAutoBetMaxTimes(int i) {
        autoBetMaxTimes = i;
    }

    public final void setAutoBetTimes(int i) {
        autoBetTimesSubject.onNext(Integer.valueOf(i));
    }

    public final void setLiveMarketCategoryMap(String sportId, Set<String> supportMarkets) {
        sportId.getClass();
        supportMarkets.getClass();
        liveMarketCategorySet.put(sportId, supportMarkets);
    }

    public final void setMaxPayout(String str) {
        maxPayout = str;
    }

    public final void setMaxSelection(int i) {
        maxSelection = i;
    }

    public final void setMaxStake(String str) {
        maxStake = str;
    }

    public final void setMinStake(String str) {
        minStake = str;
    }

    public final void setMultiBetBonusEnable(boolean z) {
        multiBetBonusEnable = z;
    }

    public final void setMultiBetBonusFactor(long j) {
        multiBetBonusFactor = j;
    }

    public final void setMultiBetBonusQualifyingOddsLimit(long j) {
        multiBetBonusQualifyingOddsLimit = j;
    }

    public final void setPrematchMarketCategoryMap(String sportId, Set<String> supportMarkets) {
        sportId.getClass();
        supportMarkets.getClass();
        prematchMarketCategorySet.put(sportId, supportMarkets);
    }

    public final void setRationBySelectionMapping(int selections, SimBonusRatiosData bonusRatios) {
        bonusRatios.getClass();
        multiBetBonusRatio.put(Integer.valueOf(selections), bonusRatios);
    }

    public final void setSimulatedActive(boolean z) {
        isSimulatedActive = z;
    }

    public final void setSpeedControllerEnabled(boolean enabled) {
        Boolean value;
        ztw<Boolean> ztwVar = _speedControllerEnabledFlow;
        do {
            value = ztwVar.getValue();
            value.getClass();
        } while (!ztwVar.g(value, Boolean.valueOf(enabled)));
    }
}
