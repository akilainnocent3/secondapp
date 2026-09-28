package defpackage;

import com.sporty.android.book.domain.entity.BetTypeFlexiBetConfig;
import com.sporty.android.book.domain.entity.FlexiBetConfigConstantsKt;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.realsports.FlexiBetBoConfigOddsKey;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class fd3 {
    public static final /* synthetic */ int a = 0;

    public static final boolean a(String str) {
        return str.equals(BOConfigParam.FlexiBetStatus.getConfigKey()) || str.equals(BOConfigParam.FlexiBetOddsKey.getConfigKey()) || str.equals(BOConfigParam.FlexiBetOddsKeyTable.getConfigKey()) || str.equals(BOConfigParam.FlexiBetWeightedRTPEnabled.getConfigKey()) || str.equals(BOConfigParam.FlexiBetAverageWeightedRTPMultiplier.getConfigKey()) || str.equals(BOConfigParam.FlexiBetAverageWeightedRTPMinimum.getConfigKey()) || str.equals(BOConfigParam.FlexiBetWeightedRTPSupportedMinVersion.getConfigKey()) || str.equals(BOConfigParam.FlexiBetMinOdds.getConfigKey());
    }

    public static final boolean b(BetTypeFlexiBetConfig betTypeFlexiBetConfig) {
        if (betTypeFlexiBetConfig.getOddsKey().compareTo(BigDecimal.ZERO) < 0 || betTypeFlexiBetConfig.getOddsKey().compareTo(BigDecimal.ONE) > 0) {
            return false;
        }
        return betTypeFlexiBetConfig.getStatus() == 0 || betTypeFlexiBetConfig.getStatus() == 1 || betTypeFlexiBetConfig.getStatus() == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4, types: [zi50$b] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r3v0 */
    public static final BetTypeFlexiBetConfig c(BetTypeFlexiBetConfig betTypeFlexiBetConfig, String str, String str2) {
        ?? bVar;
        betTypeFlexiBetConfig.getClass();
        if (str.equals(BOConfigParam.FlexiBetStatus.getConfigKey())) {
            Integer intOrNull = StringsKt.toIntOrNull(str2);
            if (intOrNull != null) {
                return BetTypeFlexiBetConfig.copy$default(betTypeFlexiBetConfig, null, null, false, null, null, null, null, intOrNull.intValue(), 127, null);
            }
        } else if (str.equals(BOConfigParam.FlexiBetWeightedRTPEnabled.getConfigKey())) {
            Boolean boolR0 = StringsKt.r0(str2);
            if (boolR0 != null) {
                return BetTypeFlexiBetConfig.copy$default(betTypeFlexiBetConfig, null, null, boolR0.booleanValue(), null, null, null, null, 0, 251, null);
            }
        } else if (str.equals(BOConfigParam.FlexiBetAverageWeightedRTPMultiplier.getConfigKey())) {
            BigDecimal bigDecimalD = d(str2);
            if (bigDecimalD != null) {
                return BetTypeFlexiBetConfig.copy$default(betTypeFlexiBetConfig, null, null, false, FlexiBetConfigConstantsKt.normalizeFlexiWeightedRtpMultiplier(bigDecimalD), null, null, null, 0, 247, null);
            }
        } else if (str.equals(BOConfigParam.FlexiBetAverageWeightedRTPMinimum.getConfigKey())) {
            BigDecimal bigDecimalD2 = d(str2);
            if (bigDecimalD2 != null) {
                return BetTypeFlexiBetConfig.copy$default(betTypeFlexiBetConfig, null, null, false, null, FlexiBetConfigConstantsKt.normalizeFlexiAverageWeightedMinEffectiveRtp(bigDecimalD2), null, null, 0, 239, null);
            }
        } else {
            if (str.equals(BOConfigParam.FlexiBetWeightedRTPSupportedMinVersion.getConfigKey())) {
                return BetTypeFlexiBetConfig.copy$default(betTypeFlexiBetConfig, null, null, false, null, null, str2, null, 0, 223, null);
            }
            if (!str.equals(BOConfigParam.FlexiBetMinOdds.getConfigKey())) {
                if (str.equals(BOConfigParam.FlexiBetOddsKey.getConfigKey())) {
                    BigDecimal bigDecimalD3 = d(str2);
                    if (bigDecimalD3 != null) {
                        return BetTypeFlexiBetConfig.copy$default(betTypeFlexiBetConfig, bigDecimalD3, null, false, null, null, null, null, 0, 254, null);
                    }
                    return null;
                }
                if (!str.equals(BOConfigParam.FlexiBetOddsKeyTable.getConfigKey())) {
                    return null;
                }
                try {
                    zi50.a aVar = zi50.b;
                    FlexiBetBoConfigOddsKey[] flexiBetBoConfigOddsKeyArr = (FlexiBetBoConfigOddsKey[]) new eal().e(str2, FlexiBetBoConfigOddsKey[].class);
                    if (flexiBetBoConfigOddsKeyArr != null) {
                        int iA = jpu.a(flexiBetBoConfigOddsKeyArr.length);
                        if (iA < 16) {
                            iA = 16;
                        }
                        bVar = new LinkedHashMap(iA);
                        for (FlexiBetBoConfigOddsKey flexiBetBoConfigOddsKey : flexiBetBoConfigOddsKeyArr) {
                            bVar.put(Integer.valueOf(flexiBetBoConfigOddsKey.getNum()), new BigDecimal(String.valueOf(flexiBetBoConfigOddsKey.getValue())));
                        }
                    } else {
                        bVar = 0;
                    }
                } catch (Throwable th) {
                    zi50.a aVar2 = zi50.b;
                    bVar = new zi50.b(th);
                }
                zi50.a aVar3 = zi50.b;
                boolean z = bVar instanceof zi50.b;
                ?? r0 = bVar;
                if (z) {
                    r0 = 0;
                }
                Map map = (Map) r0;
                if (map != null) {
                    return BetTypeFlexiBetConfig.copy$default(betTypeFlexiBetConfig, null, map, false, null, null, null, null, 0, 253, null);
                }
                return null;
            }
            BigDecimal bigDecimalD4 = d(str2);
            if (bigDecimalD4 != null) {
                return BetTypeFlexiBetConfig.copy$default(betTypeFlexiBetConfig, null, null, false, null, null, null, bigDecimalD4, 0, 191, null);
            }
        }
        return null;
    }

    public static final BigDecimal d(String str) {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            bVar = new BigDecimal(str);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        return (BigDecimal) bVar;
    }
}
