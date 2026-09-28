package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.cashout.CashOutFallback;
import com.sporty.android.core.model.cashout.CashOutFallbackData;
import com.sporty.android.core.model.cashout.CashoutAdditionalMarketSpecifierMap;
import com.sporty.android.core.model.cashout.CashoutProviderMarketRulesMap;
import com.sporty.android.core.model.cashout.CashoutQuickReinvestConfig;
import com.sporty.android.core.model.cashout.CashoutSuspendDeactivateAllowConfigs;
import com.sporty.android.core.model.cashout.FallbackQuota;
import com.sporty.android.core.model.cashout.FallbackSelectionCashOutQuota;
import com.sporty.android.core.model.cashout.FallbackUserCashOutQuota;
import com.sporty.android.core.model.config.BoreDrawSelectionEligibilityDto;
import com.sporty.android.core.model.config.BoreDrawSport;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.config.tax.TaxConfigs;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sportybet.model.cashOut.CashOutData;
import com.sportybet.model.cashOut.CashOutFilterPageResponse;
import com.sportybet.model.cashOut.CashOutPageResponse;
import com.sportybet.plugin.realsports.data.BoreDrawConfig;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final class fr6 implements rq6 {
    public final lq1 a;
    public final t840 b;
    public final u840 c;
    public final psm d;
    public final JsonSerializeService e;
    public final k5b f;

    public fr6(lq1 lq1Var, t840 t840Var, u840 u840Var, psm psmVar, qqe0 qqe0Var, JsonSerializeService jsonSerializeService, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        this.a = lq1Var;
        this.b = t840Var;
        this.c = u840Var;
        this.d = psmVar;
        this.e = jsonSerializeService;
        this.f = k5bVar;
    }

    /* JADX WARN: Code duplicated, block: B:1017:0x0c74  */
    /* JADX WARN: Code duplicated, block: B:1086:0x0d4c  */
    /* JADX WARN: Code duplicated, block: B:1153:0x0e1d  */
    /* JADX WARN: Code duplicated, block: B:1220:0x0eeb  */
    /* JADX WARN: Code duplicated, block: B:1287:0x0fb8  */
    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    /* JADX WARN: Code duplicated, block: B:1354:0x1087  */
    /* JADX WARN: Code duplicated, block: B:1421:0x1158  */
    /* JADX WARN: Code duplicated, block: B:146:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:213:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:280:0x038b  */
    /* JADX WARN: Code duplicated, block: B:347:0x0459  */
    /* JADX WARN: Code duplicated, block: B:414:0x0529  */
    /* JADX WARN: Code duplicated, block: B:491:0x0616  */
    /* JADX WARN: Code duplicated, block: B:547:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:614:0x0790  */
    /* JADX WARN: Code duplicated, block: B:681:0x085e  */
    /* JADX WARN: Code duplicated, block: B:748:0x092c  */
    /* JADX WARN: Code duplicated, block: B:79:0x011e  */
    /* JADX WARN: Code duplicated, block: B:815:0x09fa  */
    /* JADX WARN: Code duplicated, block: B:882:0x0ac8  */
    /* JADX WARN: Code duplicated, block: B:949:0x0b96  */
    public static xo6 b(BOConfigValueBundle bOConfigValueBundle) {
        Boolean boolR0;
        Double dH;
        Boolean boolR1;
        Boolean boolR2;
        Boolean boolR3;
        Boolean boolR4;
        CashoutSuspendDeactivateAllowConfigs cashoutSuspendDeactivateAllowConfigs;
        Integer intOrNull;
        CashoutAdditionalMarketSpecifierMap cashoutAdditionalMarketSpecifierMap;
        Boolean boolR5;
        Boolean boolR6;
        Boolean boolR7;
        Boolean boolR8;
        Boolean boolR9;
        Boolean boolR10;
        BoreDrawSelectionEligibilityDto boreDrawSelectionEligibilityDto;
        Long lS0;
        Boolean boolR11;
        CashoutProviderMarketRulesMap cashoutProviderMarketRulesMap;
        Long lS1;
        Long lS2;
        CashoutQuickReinvestConfig cashoutQuickReinvestConfig;
        BoreDrawSport sport;
        CashoutAdditionalMarketSpecifierMap cashoutAdditionalMarketSpecifierMap2 = new CashoutAdditionalMarketSpecifierMap(null, 1, null);
        TaxConfigs taxConfigs = TaxConfigs.INSTANCE.getDefault();
        new BoreDrawConfig(null, 1, null);
        CashoutQuickReinvestConfig cashoutQuickReinvestConfig2 = new CashoutQuickReinvestConfig(null, 1, null);
        taxConfigs.getClass();
        BOConfigValueWrapper response = bOConfigValueBundle.getResponse(BOConfigParam.CashoutHighProbabilityAllow);
        Object configValue = response != null ? response.getConfigValue() : null;
        dq7 dq7VarA = jq40.a(Boolean.class);
        Class cls = Integer.TYPE;
        boolean zG = Intrinsics.g(dq7VarA, jq40.a(cls));
        Class cls2 = Boolean.TYPE;
        Class cls3 = Double.TYPE;
        Class cls4 = Float.TYPE;
        Class cls5 = Long.TYPE;
        if (zG) {
            if (configValue instanceof Integer) {
                if (!(configValue instanceof Boolean)) {
                    configValue = null;
                }
                boolR0 = (Boolean) configValue;
            } else {
                if (configValue instanceof String) {
                    StringsKt.toIntOrNull((String) configValue);
                }
                boolR0 = null;
            }
        } else if (Intrinsics.g(dq7VarA, jq40.a(cls5))) {
            if (configValue instanceof Long) {
                if (!(configValue instanceof Boolean)) {
                    configValue = null;
                }
                boolR0 = (Boolean) configValue;
            } else {
                if (configValue instanceof String) {
                    StringsKt.s0((String) configValue);
                }
                boolR0 = null;
            }
        } else if (Intrinsics.g(dq7VarA, jq40.a(cls4))) {
            if (configValue instanceof Float) {
                if (!(configValue instanceof Boolean)) {
                    configValue = null;
                }
                boolR0 = (Boolean) configValue;
            } else {
                if (configValue instanceof String) {
                    b.i((String) configValue);
                }
                boolR0 = null;
            }
        } else if (!Intrinsics.g(dq7VarA, jq40.a(cls3))) {
            if (Intrinsics.g(dq7VarA, jq40.a(cls2))) {
                if (configValue instanceof Boolean) {
                    boolR0 = (Boolean) configValue;
                } else if (!(configValue instanceof String) || (boolR0 = StringsKt.r0((String) configValue)) == null) {
                }
            } else if (Intrinsics.g(dq7VarA, jq40.a(String.class))) {
                if (configValue != null) {
                    configValue.toString();
                }
            } else if (configValue != null) {
                if (!(configValue instanceof Boolean)) {
                    configValue = null;
                }
                boolR0 = (Boolean) configValue;
            }
            boolR0 = null;
        } else if (configValue instanceof Double) {
            if (!(configValue instanceof Boolean)) {
                configValue = null;
            }
            boolR0 = (Boolean) configValue;
        } else {
            if (configValue instanceof String) {
                b.h((String) configValue);
            }
            boolR0 = null;
        }
        boolean zBooleanValue = boolR0 != null ? boolR0.booleanValue() : false;
        BOConfigValueWrapper response2 = bOConfigValueBundle.getResponse(BOConfigParam.CashoutHighProbabilityAllowBound);
        Object configValue2 = response2 != null ? response2.getConfigValue() : null;
        dq7 dq7VarA2 = jq40.a(Double.class);
        if (Intrinsics.g(dq7VarA2, jq40.a(cls))) {
            if (configValue2 instanceof Integer) {
                if (!(configValue2 instanceof Double)) {
                    configValue2 = null;
                }
                dH = (Double) configValue2;
            } else {
                if (configValue2 instanceof String) {
                    StringsKt.toIntOrNull((String) configValue2);
                }
                dH = null;
            }
        } else if (Intrinsics.g(dq7VarA2, jq40.a(cls5))) {
            if (configValue2 instanceof Long) {
                if (!(configValue2 instanceof Double)) {
                    configValue2 = null;
                }
                dH = (Double) configValue2;
            } else {
                if (configValue2 instanceof String) {
                    StringsKt.s0((String) configValue2);
                }
                dH = null;
            }
        } else if (!Intrinsics.g(dq7VarA2, jq40.a(cls4))) {
            if (Intrinsics.g(dq7VarA2, jq40.a(cls3))) {
                if (configValue2 instanceof Double) {
                    dH = (Double) configValue2;
                } else if (!(configValue2 instanceof String) || (dH = b.h((String) configValue2)) == null) {
                }
            } else if (Intrinsics.g(dq7VarA2, jq40.a(cls2))) {
                if (configValue2 instanceof Boolean) {
                    if (!(configValue2 instanceof Double)) {
                        configValue2 = null;
                    }
                    dH = (Double) configValue2;
                } else if (configValue2 instanceof String) {
                    StringsKt.r0((String) configValue2);
                }
            } else if (Intrinsics.g(dq7VarA2, jq40.a(String.class))) {
                if (configValue2 != null) {
                    configValue2.toString();
                }
            } else if (configValue2 != null) {
                if (!(configValue2 instanceof Double)) {
                    configValue2 = null;
                }
                dH = (Double) configValue2;
            }
            dH = null;
        } else if (configValue2 instanceof Float) {
            if (!(configValue2 instanceof Double)) {
                configValue2 = null;
            }
            dH = (Double) configValue2;
        } else {
            if (configValue2 instanceof String) {
                b.i((String) configValue2);
            }
            dH = null;
        }
        double dDoubleValue = dH != null ? dH.doubleValue() : 0.97d;
        BOConfigValueWrapper response3 = bOConfigValueBundle.getResponse(BOConfigParam.CashoutFlexibleBetRealTimeAmountDisplay);
        Object configValue3 = response3 != null ? response3.getConfigValue() : null;
        dq7 dq7VarA3 = jq40.a(Boolean.class);
        if (Intrinsics.g(dq7VarA3, jq40.a(cls))) {
            if (configValue3 instanceof Integer) {
                if (!(configValue3 instanceof Boolean)) {
                    configValue3 = null;
                }
                boolR1 = (Boolean) configValue3;
            } else {
                if (configValue3 instanceof String) {
                    StringsKt.toIntOrNull((String) configValue3);
                }
                boolR1 = null;
            }
        } else if (Intrinsics.g(dq7VarA3, jq40.a(cls5))) {
            if (configValue3 instanceof Long) {
                if (!(configValue3 instanceof Boolean)) {
                    configValue3 = null;
                }
                boolR1 = (Boolean) configValue3;
            } else {
                if (configValue3 instanceof String) {
                    StringsKt.s0((String) configValue3);
                }
                boolR1 = null;
            }
        } else if (Intrinsics.g(dq7VarA3, jq40.a(cls4))) {
            if (configValue3 instanceof Float) {
                if (!(configValue3 instanceof Boolean)) {
                    configValue3 = null;
                }
                boolR1 = (Boolean) configValue3;
            } else {
                if (configValue3 instanceof String) {
                    b.i((String) configValue3);
                }
                boolR1 = null;
            }
        } else if (!Intrinsics.g(dq7VarA3, jq40.a(cls3))) {
            if (Intrinsics.g(dq7VarA3, jq40.a(cls2))) {
                if (configValue3 instanceof Boolean) {
                    boolR1 = (Boolean) configValue3;
                } else if (!(configValue3 instanceof String) || (boolR1 = StringsKt.r0((String) configValue3)) == null) {
                }
            } else if (Intrinsics.g(dq7VarA3, jq40.a(String.class))) {
                if (configValue3 != null) {
                    configValue3.toString();
                }
            } else if (configValue3 != null) {
                if (!(configValue3 instanceof Boolean)) {
                    configValue3 = null;
                }
                boolR1 = (Boolean) configValue3;
            }
            boolR1 = null;
        } else if (configValue3 instanceof Double) {
            if (!(configValue3 instanceof Boolean)) {
                configValue3 = null;
            }
            boolR1 = (Boolean) configValue3;
        } else {
            if (configValue3 instanceof String) {
                b.h((String) configValue3);
            }
            boolR1 = null;
        }
        boolean zBooleanValue2 = boolR1 != null ? boolR1.booleanValue() : true;
        BOConfigValueWrapper response4 = bOConfigValueBundle.getResponse(BOConfigParam.CashoutFlexibleBetAllow);
        Object configValue4 = response4 != null ? response4.getConfigValue() : null;
        dq7 dq7VarA4 = jq40.a(Boolean.class);
        double d = dDoubleValue;
        if (Intrinsics.g(dq7VarA4, jq40.a(cls))) {
            if (configValue4 instanceof Integer) {
                if (!(configValue4 instanceof Boolean)) {
                    configValue4 = null;
                }
                boolR2 = (Boolean) configValue4;
            } else {
                if (configValue4 instanceof String) {
                    StringsKt.toIntOrNull((String) configValue4);
                }
                boolR2 = null;
            }
        } else if (Intrinsics.g(dq7VarA4, jq40.a(cls5))) {
            if (configValue4 instanceof Long) {
                if (!(configValue4 instanceof Boolean)) {
                    configValue4 = null;
                }
                boolR2 = (Boolean) configValue4;
            } else {
                if (configValue4 instanceof String) {
                    StringsKt.s0((String) configValue4);
                }
                boolR2 = null;
            }
        } else if (Intrinsics.g(dq7VarA4, jq40.a(cls4))) {
            if (configValue4 instanceof Float) {
                if (!(configValue4 instanceof Boolean)) {
                    configValue4 = null;
                }
                boolR2 = (Boolean) configValue4;
            } else {
                if (configValue4 instanceof String) {
                    b.i((String) configValue4);
                }
                boolR2 = null;
            }
        } else if (!Intrinsics.g(dq7VarA4, jq40.a(cls3))) {
            if (Intrinsics.g(dq7VarA4, jq40.a(cls2))) {
                if (configValue4 instanceof Boolean) {
                    boolR2 = (Boolean) configValue4;
                } else if (!(configValue4 instanceof String) || (boolR2 = StringsKt.r0((String) configValue4)) == null) {
                }
            } else if (Intrinsics.g(dq7VarA4, jq40.a(String.class))) {
                if (configValue4 != null) {
                    configValue4.toString();
                }
            } else if (configValue4 != null) {
                if (!(configValue4 instanceof Boolean)) {
                    configValue4 = null;
                }
                boolR2 = (Boolean) configValue4;
            }
            boolR2 = null;
        } else if (configValue4 instanceof Double) {
            if (!(configValue4 instanceof Boolean)) {
                configValue4 = null;
            }
            boolR2 = (Boolean) configValue4;
        } else {
            if (configValue4 instanceof String) {
                b.h((String) configValue4);
            }
            boolR2 = null;
        }
        boolean zBooleanValue3 = boolR2 != null ? boolR2.booleanValue() : true;
        BOConfigValueWrapper response5 = bOConfigValueBundle.getResponse(BOConfigParam.CashoutAnyWinAllow);
        Object configValue5 = response5 != null ? response5.getConfigValue() : null;
        dq7 dq7VarA5 = jq40.a(Boolean.class);
        if (Intrinsics.g(dq7VarA5, jq40.a(cls))) {
            if (configValue5 instanceof Integer) {
                if (!(configValue5 instanceof Boolean)) {
                    configValue5 = null;
                }
                boolR3 = (Boolean) configValue5;
            } else {
                if (configValue5 instanceof String) {
                    StringsKt.toIntOrNull((String) configValue5);
                }
                boolR3 = null;
            }
        } else if (Intrinsics.g(dq7VarA5, jq40.a(cls5))) {
            if (configValue5 instanceof Long) {
                if (!(configValue5 instanceof Boolean)) {
                    configValue5 = null;
                }
                boolR3 = (Boolean) configValue5;
            } else {
                if (configValue5 instanceof String) {
                    StringsKt.s0((String) configValue5);
                }
                boolR3 = null;
            }
        } else if (Intrinsics.g(dq7VarA5, jq40.a(cls4))) {
            if (configValue5 instanceof Float) {
                if (!(configValue5 instanceof Boolean)) {
                    configValue5 = null;
                }
                boolR3 = (Boolean) configValue5;
            } else {
                if (configValue5 instanceof String) {
                    b.i((String) configValue5);
                }
                boolR3 = null;
            }
        } else if (!Intrinsics.g(dq7VarA5, jq40.a(cls3))) {
            if (Intrinsics.g(dq7VarA5, jq40.a(cls2))) {
                if (configValue5 instanceof Boolean) {
                    boolR3 = (Boolean) configValue5;
                } else if (!(configValue5 instanceof String) || (boolR3 = StringsKt.r0((String) configValue5)) == null) {
                }
            } else if (Intrinsics.g(dq7VarA5, jq40.a(String.class))) {
                if (configValue5 != null) {
                    configValue5.toString();
                }
            } else if (configValue5 != null) {
                if (!(configValue5 instanceof Boolean)) {
                    configValue5 = null;
                }
                boolR3 = (Boolean) configValue5;
            }
            boolR3 = null;
        } else if (configValue5 instanceof Double) {
            if (!(configValue5 instanceof Boolean)) {
                configValue5 = null;
            }
            boolR3 = (Boolean) configValue5;
        } else {
            if (configValue5 instanceof String) {
                b.h((String) configValue5);
            }
            boolR3 = null;
        }
        boolean zBooleanValue4 = boolR3 != null ? boolR3.booleanValue() : true;
        BOConfigValueWrapper response6 = bOConfigValueBundle.getResponse(BOConfigParam.CashoutSuspendDeactivateEnabled);
        Object configValue6 = response6 != null ? response6.getConfigValue() : null;
        dq7 dq7VarA6 = jq40.a(Boolean.class);
        boolean z = zBooleanValue3;
        if (Intrinsics.g(dq7VarA6, jq40.a(cls))) {
            if (configValue6 instanceof Integer) {
                if (!(configValue6 instanceof Boolean)) {
                    configValue6 = null;
                }
                boolR4 = (Boolean) configValue6;
            } else {
                if (configValue6 instanceof String) {
                    StringsKt.toIntOrNull((String) configValue6);
                }
                boolR4 = null;
            }
        } else if (Intrinsics.g(dq7VarA6, jq40.a(cls5))) {
            if (configValue6 instanceof Long) {
                if (!(configValue6 instanceof Boolean)) {
                    configValue6 = null;
                }
                boolR4 = (Boolean) configValue6;
            } else {
                if (configValue6 instanceof String) {
                    StringsKt.s0((String) configValue6);
                }
                boolR4 = null;
            }
        } else if (Intrinsics.g(dq7VarA6, jq40.a(cls4))) {
            if (configValue6 instanceof Float) {
                if (!(configValue6 instanceof Boolean)) {
                    configValue6 = null;
                }
                boolR4 = (Boolean) configValue6;
            } else {
                if (configValue6 instanceof String) {
                    b.i((String) configValue6);
                }
                boolR4 = null;
            }
        } else if (!Intrinsics.g(dq7VarA6, jq40.a(cls3))) {
            if (Intrinsics.g(dq7VarA6, jq40.a(cls2))) {
                if (configValue6 instanceof Boolean) {
                    boolR4 = (Boolean) configValue6;
                } else if (!(configValue6 instanceof String) || (boolR4 = StringsKt.r0((String) configValue6)) == null) {
                }
            } else if (Intrinsics.g(dq7VarA6, jq40.a(String.class))) {
                if (configValue6 != null) {
                    configValue6.toString();
                }
            } else if (configValue6 != null) {
                if (!(configValue6 instanceof Boolean)) {
                    configValue6 = null;
                }
                boolR4 = (Boolean) configValue6;
            }
            boolR4 = null;
        } else if (configValue6 instanceof Double) {
            if (!(configValue6 instanceof Boolean)) {
                configValue6 = null;
            }
            boolR4 = (Boolean) configValue6;
        } else {
            if (configValue6 instanceof String) {
                b.h((String) configValue6);
            }
            boolR4 = null;
        }
        boolean zBooleanValue5 = boolR4 != null ? boolR4.booleanValue() : false;
        BOConfigValueWrapper response7 = bOConfigValueBundle.getResponse(BOConfigParam.CashoutSuspendDeactivateAllow);
        Object configValue7 = response7 != null ? response7.getConfigValue() : null;
        dq7 dq7VarA7 = jq40.a(CashoutSuspendDeactivateAllowConfigs.class);
        boolean z2 = zBooleanValue5;
        if (Intrinsics.g(dq7VarA7, jq40.a(cls))) {
            if (configValue7 instanceof Integer) {
                if (!(configValue7 instanceof CashoutSuspendDeactivateAllowConfigs)) {
                    configValue7 = null;
                }
                cashoutSuspendDeactivateAllowConfigs = (CashoutSuspendDeactivateAllowConfigs) configValue7;
            } else {
                if (configValue7 instanceof String) {
                    StringsKt.toIntOrNull((String) configValue7);
                }
                cashoutSuspendDeactivateAllowConfigs = null;
            }
        } else if (Intrinsics.g(dq7VarA7, jq40.a(cls5))) {
            if (configValue7 instanceof Long) {
                if (!(configValue7 instanceof CashoutSuspendDeactivateAllowConfigs)) {
                    configValue7 = null;
                }
                cashoutSuspendDeactivateAllowConfigs = (CashoutSuspendDeactivateAllowConfigs) configValue7;
            } else {
                if (configValue7 instanceof String) {
                    StringsKt.s0((String) configValue7);
                }
                cashoutSuspendDeactivateAllowConfigs = null;
            }
        } else if (Intrinsics.g(dq7VarA7, jq40.a(cls4))) {
            if (configValue7 instanceof Float) {
                if (!(configValue7 instanceof CashoutSuspendDeactivateAllowConfigs)) {
                    configValue7 = null;
                }
                cashoutSuspendDeactivateAllowConfigs = (CashoutSuspendDeactivateAllowConfigs) configValue7;
            } else {
                if (configValue7 instanceof String) {
                    b.i((String) configValue7);
                }
                cashoutSuspendDeactivateAllowConfigs = null;
            }
        } else if (Intrinsics.g(dq7VarA7, jq40.a(cls3))) {
            if (configValue7 instanceof Double) {
                if (!(configValue7 instanceof CashoutSuspendDeactivateAllowConfigs)) {
                    configValue7 = null;
                }
                cashoutSuspendDeactivateAllowConfigs = (CashoutSuspendDeactivateAllowConfigs) configValue7;
            } else {
                if (configValue7 instanceof String) {
                    b.h((String) configValue7);
                }
                cashoutSuspendDeactivateAllowConfigs = null;
            }
        } else if (!Intrinsics.g(dq7VarA7, jq40.a(cls2))) {
            if (Intrinsics.g(dq7VarA7, jq40.a(String.class))) {
                if (configValue7 != null) {
                    configValue7.toString();
                }
            } else if (configValue7 != null) {
                if (!(configValue7 instanceof CashoutSuspendDeactivateAllowConfigs)) {
                    configValue7 = null;
                }
                cashoutSuspendDeactivateAllowConfigs = (CashoutSuspendDeactivateAllowConfigs) configValue7;
            }
            cashoutSuspendDeactivateAllowConfigs = null;
        } else if (configValue7 instanceof Boolean) {
            if (!(configValue7 instanceof CashoutSuspendDeactivateAllowConfigs)) {
                configValue7 = null;
            }
            cashoutSuspendDeactivateAllowConfigs = (CashoutSuspendDeactivateAllowConfigs) configValue7;
        } else {
            if (configValue7 instanceof String) {
                StringsKt.r0((String) configValue7);
            }
            cashoutSuspendDeactivateAllowConfigs = null;
        }
        if (cashoutSuspendDeactivateAllowConfigs == null) {
            cashoutSuspendDeactivateAllowConfigs = null;
        }
        BOConfigValueWrapper response8 = bOConfigValueBundle.getResponse(BOConfigParam.CashoutSuspendDeactivatePhase);
        Object configValue8 = response8 != null ? response8.getConfigValue() : null;
        dq7 dq7VarA8 = jq40.a(Integer.class);
        CashoutSuspendDeactivateAllowConfigs cashoutSuspendDeactivateAllowConfigs2 = cashoutSuspendDeactivateAllowConfigs;
        if (Intrinsics.g(dq7VarA8, jq40.a(cls))) {
            if (configValue8 instanceof Integer) {
                intOrNull = (Integer) configValue8;
            } else if (!(configValue8 instanceof String) || (intOrNull = StringsKt.toIntOrNull((String) configValue8)) == null) {
                intOrNull = null;
            }
        } else if (Intrinsics.g(dq7VarA8, jq40.a(cls5))) {
            if (configValue8 instanceof Long) {
                if (!(configValue8 instanceof Integer)) {
                    configValue8 = null;
                }
                intOrNull = (Integer) configValue8;
            } else {
                if (configValue8 instanceof String) {
                    StringsKt.s0((String) configValue8);
                }
                intOrNull = null;
            }
        } else if (Intrinsics.g(dq7VarA8, jq40.a(cls4))) {
            if (configValue8 instanceof Float) {
                if (!(configValue8 instanceof Integer)) {
                    configValue8 = null;
                }
                intOrNull = (Integer) configValue8;
            } else {
                if (configValue8 instanceof String) {
                    b.i((String) configValue8);
                }
                intOrNull = null;
            }
        } else if (Intrinsics.g(dq7VarA8, jq40.a(cls3))) {
            if (configValue8 instanceof Double) {
                if (!(configValue8 instanceof Integer)) {
                    configValue8 = null;
                }
                intOrNull = (Integer) configValue8;
            } else {
                if (configValue8 instanceof String) {
                    b.h((String) configValue8);
                }
                intOrNull = null;
            }
        } else if (!Intrinsics.g(dq7VarA8, jq40.a(cls2))) {
            if (Intrinsics.g(dq7VarA8, jq40.a(String.class))) {
                if (configValue8 != null) {
                    configValue8.toString();
                }
            } else if (configValue8 != null) {
                if (!(configValue8 instanceof Integer)) {
                    configValue8 = null;
                }
                intOrNull = (Integer) configValue8;
            }
            intOrNull = null;
        } else if (configValue8 instanceof Boolean) {
            if (!(configValue8 instanceof Integer)) {
                configValue8 = null;
            }
            intOrNull = (Integer) configValue8;
        } else {
            if (configValue8 instanceof String) {
                StringsKt.r0((String) configValue8);
            }
            intOrNull = null;
        }
        int iIntValue = intOrNull != null ? intOrNull.intValue() : 3;
        BOConfigValueWrapper response9 = bOConfigValueBundle.getResponse(BOConfigParam.CashoutSuspendDeactivateAdditionalMarketSpecifier);
        Object configValue9 = response9 != null ? response9.getConfigValue() : null;
        dq7 dq7VarA9 = jq40.a(CashoutAdditionalMarketSpecifierMap.class);
        int i = iIntValue;
        if (Intrinsics.g(dq7VarA9, jq40.a(cls))) {
            if (configValue9 instanceof Integer) {
                if (!(configValue9 instanceof CashoutAdditionalMarketSpecifierMap)) {
                    configValue9 = null;
                }
                cashoutAdditionalMarketSpecifierMap = (CashoutAdditionalMarketSpecifierMap) configValue9;
            } else {
                if (configValue9 instanceof String) {
                    StringsKt.toIntOrNull((String) configValue9);
                }
                cashoutAdditionalMarketSpecifierMap = null;
            }
        } else if (Intrinsics.g(dq7VarA9, jq40.a(cls5))) {
            if (configValue9 instanceof Long) {
                if (!(configValue9 instanceof CashoutAdditionalMarketSpecifierMap)) {
                    configValue9 = null;
                }
                cashoutAdditionalMarketSpecifierMap = (CashoutAdditionalMarketSpecifierMap) configValue9;
            } else {
                if (configValue9 instanceof String) {
                    StringsKt.s0((String) configValue9);
                }
                cashoutAdditionalMarketSpecifierMap = null;
            }
        } else if (Intrinsics.g(dq7VarA9, jq40.a(cls4))) {
            if (configValue9 instanceof Float) {
                if (!(configValue9 instanceof CashoutAdditionalMarketSpecifierMap)) {
                    configValue9 = null;
                }
                cashoutAdditionalMarketSpecifierMap = (CashoutAdditionalMarketSpecifierMap) configValue9;
            } else {
                if (configValue9 instanceof String) {
                    b.i((String) configValue9);
                }
                cashoutAdditionalMarketSpecifierMap = null;
            }
        } else if (Intrinsics.g(dq7VarA9, jq40.a(cls3))) {
            if (configValue9 instanceof Double) {
                if (!(configValue9 instanceof CashoutAdditionalMarketSpecifierMap)) {
                    configValue9 = null;
                }
                cashoutAdditionalMarketSpecifierMap = (CashoutAdditionalMarketSpecifierMap) configValue9;
            } else {
                if (configValue9 instanceof String) {
                    b.h((String) configValue9);
                }
                cashoutAdditionalMarketSpecifierMap = null;
            }
        } else if (!Intrinsics.g(dq7VarA9, jq40.a(cls2))) {
            if (Intrinsics.g(dq7VarA9, jq40.a(String.class))) {
                if (configValue9 != null) {
                    configValue9.toString();
                }
            } else if (configValue9 != null) {
                if (!(configValue9 instanceof CashoutAdditionalMarketSpecifierMap)) {
                    configValue9 = null;
                }
                cashoutAdditionalMarketSpecifierMap = (CashoutAdditionalMarketSpecifierMap) configValue9;
            }
            cashoutAdditionalMarketSpecifierMap = null;
        } else if (configValue9 instanceof Boolean) {
            if (!(configValue9 instanceof CashoutAdditionalMarketSpecifierMap)) {
                configValue9 = null;
            }
            cashoutAdditionalMarketSpecifierMap = (CashoutAdditionalMarketSpecifierMap) configValue9;
        } else {
            if (configValue9 instanceof String) {
                StringsKt.r0((String) configValue9);
            }
            cashoutAdditionalMarketSpecifierMap = null;
        }
        CashoutAdditionalMarketSpecifierMap cashoutAdditionalMarketSpecifierMap3 = cashoutAdditionalMarketSpecifierMap == null ? cashoutAdditionalMarketSpecifierMap2 : cashoutAdditionalMarketSpecifierMap;
        BOConfigValueWrapper response10 = bOConfigValueBundle.getResponse(BOConfigParam.CashoutOutcomeActiveEnabled);
        Object configValue10 = response10 != null ? response10.getConfigValue() : null;
        dq7 dq7VarA10 = jq40.a(Boolean.class);
        CashoutAdditionalMarketSpecifierMap cashoutAdditionalMarketSpecifierMap4 = cashoutAdditionalMarketSpecifierMap3;
        if (Intrinsics.g(dq7VarA10, jq40.a(cls))) {
            if (configValue10 instanceof Integer) {
                if (!(configValue10 instanceof Boolean)) {
                    configValue10 = null;
                }
                boolR5 = (Boolean) configValue10;
            } else {
                if (configValue10 instanceof String) {
                    StringsKt.toIntOrNull((String) configValue10);
                }
                boolR5 = null;
            }
        } else if (Intrinsics.g(dq7VarA10, jq40.a(cls5))) {
            if (configValue10 instanceof Long) {
                if (!(configValue10 instanceof Boolean)) {
                    configValue10 = null;
                }
                boolR5 = (Boolean) configValue10;
            } else {
                if (configValue10 instanceof String) {
                    StringsKt.s0((String) configValue10);
                }
                boolR5 = null;
            }
        } else if (Intrinsics.g(dq7VarA10, jq40.a(cls4))) {
            if (configValue10 instanceof Float) {
                if (!(configValue10 instanceof Boolean)) {
                    configValue10 = null;
                }
                boolR5 = (Boolean) configValue10;
            } else {
                if (configValue10 instanceof String) {
                    b.i((String) configValue10);
                }
                boolR5 = null;
            }
        } else if (!Intrinsics.g(dq7VarA10, jq40.a(cls3))) {
            if (Intrinsics.g(dq7VarA10, jq40.a(cls2))) {
                if (configValue10 instanceof Boolean) {
                    boolR5 = (Boolean) configValue10;
                } else if (!(configValue10 instanceof String) || (boolR5 = StringsKt.r0((String) configValue10)) == null) {
                }
            } else if (Intrinsics.g(dq7VarA10, jq40.a(String.class))) {
                if (configValue10 != null) {
                    configValue10.toString();
                }
            } else if (configValue10 != null) {
                if (!(configValue10 instanceof Boolean)) {
                    configValue10 = null;
                }
                boolR5 = (Boolean) configValue10;
            }
            boolR5 = null;
        } else if (configValue10 instanceof Double) {
            if (!(configValue10 instanceof Boolean)) {
                configValue10 = null;
            }
            boolR5 = (Boolean) configValue10;
        } else {
            if (configValue10 instanceof String) {
                b.h((String) configValue10);
            }
            boolR5 = null;
        }
        boolean zBooleanValue6 = boolR5 != null ? boolR5.booleanValue() : false;
        BOConfigValueWrapper response11 = bOConfigValueBundle.getResponse(BOConfigParam.CashoutMarketActiveEnabled);
        Object configValue11 = response11 != null ? response11.getConfigValue() : null;
        dq7 dq7VarA11 = jq40.a(Boolean.class);
        boolean z3 = zBooleanValue6;
        if (Intrinsics.g(dq7VarA11, jq40.a(cls))) {
            if (configValue11 instanceof Integer) {
                if (!(configValue11 instanceof Boolean)) {
                    configValue11 = null;
                }
                boolR6 = (Boolean) configValue11;
            } else {
                if (configValue11 instanceof String) {
                    StringsKt.toIntOrNull((String) configValue11);
                }
                boolR6 = null;
            }
        } else if (Intrinsics.g(dq7VarA11, jq40.a(cls5))) {
            if (configValue11 instanceof Long) {
                if (!(configValue11 instanceof Boolean)) {
                    configValue11 = null;
                }
                boolR6 = (Boolean) configValue11;
            } else {
                if (configValue11 instanceof String) {
                    StringsKt.s0((String) configValue11);
                }
                boolR6 = null;
            }
        } else if (Intrinsics.g(dq7VarA11, jq40.a(cls4))) {
            if (configValue11 instanceof Float) {
                if (!(configValue11 instanceof Boolean)) {
                    configValue11 = null;
                }
                boolR6 = (Boolean) configValue11;
            } else {
                if (configValue11 instanceof String) {
                    b.i((String) configValue11);
                }
                boolR6 = null;
            }
        } else if (!Intrinsics.g(dq7VarA11, jq40.a(cls3))) {
            if (Intrinsics.g(dq7VarA11, jq40.a(cls2))) {
                if (configValue11 instanceof Boolean) {
                    boolR6 = (Boolean) configValue11;
                } else if (!(configValue11 instanceof String) || (boolR6 = StringsKt.r0((String) configValue11)) == null) {
                }
            } else if (Intrinsics.g(dq7VarA11, jq40.a(String.class))) {
                if (configValue11 != null) {
                    configValue11.toString();
                }
            } else if (configValue11 != null) {
                if (!(configValue11 instanceof Boolean)) {
                    configValue11 = null;
                }
                boolR6 = (Boolean) configValue11;
            }
            boolR6 = null;
        } else if (configValue11 instanceof Double) {
            if (!(configValue11 instanceof Boolean)) {
                configValue11 = null;
            }
            boolR6 = (Boolean) configValue11;
        } else {
            if (configValue11 instanceof String) {
                b.h((String) configValue11);
            }
            boolR6 = null;
        }
        boolean zBooleanValue7 = boolR6 != null ? boolR6.booleanValue() : false;
        BOConfigValueWrapper response12 = bOConfigValueBundle.getResponse(BOConfigParam.CashoutNewFeedEnabled);
        Object configValue12 = response12 != null ? response12.getConfigValue() : null;
        dq7 dq7VarA12 = jq40.a(Boolean.class);
        boolean z4 = zBooleanValue7;
        if (Intrinsics.g(dq7VarA12, jq40.a(cls))) {
            if (configValue12 instanceof Integer) {
                if (!(configValue12 instanceof Boolean)) {
                    configValue12 = null;
                }
                boolR7 = (Boolean) configValue12;
            } else {
                if (configValue12 instanceof String) {
                    StringsKt.toIntOrNull((String) configValue12);
                }
                boolR7 = null;
            }
        } else if (Intrinsics.g(dq7VarA12, jq40.a(cls5))) {
            if (configValue12 instanceof Long) {
                if (!(configValue12 instanceof Boolean)) {
                    configValue12 = null;
                }
                boolR7 = (Boolean) configValue12;
            } else {
                if (configValue12 instanceof String) {
                    StringsKt.s0((String) configValue12);
                }
                boolR7 = null;
            }
        } else if (Intrinsics.g(dq7VarA12, jq40.a(cls4))) {
            if (configValue12 instanceof Float) {
                if (!(configValue12 instanceof Boolean)) {
                    configValue12 = null;
                }
                boolR7 = (Boolean) configValue12;
            } else {
                if (configValue12 instanceof String) {
                    b.i((String) configValue12);
                }
                boolR7 = null;
            }
        } else if (!Intrinsics.g(dq7VarA12, jq40.a(cls3))) {
            if (Intrinsics.g(dq7VarA12, jq40.a(cls2))) {
                if (configValue12 instanceof Boolean) {
                    boolR7 = (Boolean) configValue12;
                } else if (!(configValue12 instanceof String) || (boolR7 = StringsKt.r0((String) configValue12)) == null) {
                }
            } else if (Intrinsics.g(dq7VarA12, jq40.a(String.class))) {
                if (configValue12 != null) {
                    configValue12.toString();
                }
            } else if (configValue12 != null) {
                if (!(configValue12 instanceof Boolean)) {
                    configValue12 = null;
                }
                boolR7 = (Boolean) configValue12;
            }
            boolR7 = null;
        } else if (configValue12 instanceof Double) {
            if (!(configValue12 instanceof Boolean)) {
                configValue12 = null;
            }
            boolR7 = (Boolean) configValue12;
        } else {
            if (configValue12 instanceof String) {
                b.h((String) configValue12);
            }
            boolR7 = null;
        }
        boolean zBooleanValue8 = boolR7 != null ? boolR7.booleanValue() : false;
        BOConfigValueWrapper response13 = bOConfigValueBundle.getResponse(BOConfigParam.CashoutEventAbandonedEnabled);
        Object configValue13 = response13 != null ? response13.getConfigValue() : null;
        dq7 dq7VarA13 = jq40.a(Boolean.class);
        boolean z5 = zBooleanValue8;
        if (Intrinsics.g(dq7VarA13, jq40.a(cls))) {
            if (configValue13 instanceof Integer) {
                if (!(configValue13 instanceof Boolean)) {
                    configValue13 = null;
                }
                boolR8 = (Boolean) configValue13;
            } else {
                if (configValue13 instanceof String) {
                    StringsKt.toIntOrNull((String) configValue13);
                }
                boolR8 = null;
            }
        } else if (Intrinsics.g(dq7VarA13, jq40.a(cls5))) {
            if (configValue13 instanceof Long) {
                if (!(configValue13 instanceof Boolean)) {
                    configValue13 = null;
                }
                boolR8 = (Boolean) configValue13;
            } else {
                if (configValue13 instanceof String) {
                    StringsKt.s0((String) configValue13);
                }
                boolR8 = null;
            }
        } else if (Intrinsics.g(dq7VarA13, jq40.a(cls4))) {
            if (configValue13 instanceof Float) {
                if (!(configValue13 instanceof Boolean)) {
                    configValue13 = null;
                }
                boolR8 = (Boolean) configValue13;
            } else {
                if (configValue13 instanceof String) {
                    b.i((String) configValue13);
                }
                boolR8 = null;
            }
        } else if (!Intrinsics.g(dq7VarA13, jq40.a(cls3))) {
            if (Intrinsics.g(dq7VarA13, jq40.a(cls2))) {
                if (configValue13 instanceof Boolean) {
                    boolR8 = (Boolean) configValue13;
                } else if (!(configValue13 instanceof String) || (boolR8 = StringsKt.r0((String) configValue13)) == null) {
                }
            } else if (Intrinsics.g(dq7VarA13, jq40.a(String.class))) {
                if (configValue13 != null) {
                    configValue13.toString();
                }
            } else if (configValue13 != null) {
                if (!(configValue13 instanceof Boolean)) {
                    configValue13 = null;
                }
                boolR8 = (Boolean) configValue13;
            }
            boolR8 = null;
        } else if (configValue13 instanceof Double) {
            if (!(configValue13 instanceof Boolean)) {
                configValue13 = null;
            }
            boolR8 = (Boolean) configValue13;
        } else {
            if (configValue13 instanceof String) {
                b.h((String) configValue13);
            }
            boolR8 = null;
        }
        boolean zBooleanValue9 = boolR8 != null ? boolR8.booleanValue() : false;
        BOConfigValueWrapper response14 = bOConfigValueBundle.getResponse(BOConfigParam.CashoutFallbackEnabled);
        Object configValue14 = response14 != null ? response14.getConfigValue() : null;
        dq7 dq7VarA14 = jq40.a(Boolean.class);
        boolean z6 = zBooleanValue9;
        if (Intrinsics.g(dq7VarA14, jq40.a(cls))) {
            if (configValue14 instanceof Integer) {
                if (!(configValue14 instanceof Boolean)) {
                    configValue14 = null;
                }
                boolR9 = (Boolean) configValue14;
            } else {
                if (configValue14 instanceof String) {
                    StringsKt.toIntOrNull((String) configValue14);
                }
                boolR9 = null;
            }
        } else if (Intrinsics.g(dq7VarA14, jq40.a(cls5))) {
            if (configValue14 instanceof Long) {
                if (!(configValue14 instanceof Boolean)) {
                    configValue14 = null;
                }
                boolR9 = (Boolean) configValue14;
            } else {
                if (configValue14 instanceof String) {
                    StringsKt.s0((String) configValue14);
                }
                boolR9 = null;
            }
        } else if (Intrinsics.g(dq7VarA14, jq40.a(cls4))) {
            if (configValue14 instanceof Float) {
                if (!(configValue14 instanceof Boolean)) {
                    configValue14 = null;
                }
                boolR9 = (Boolean) configValue14;
            } else {
                if (configValue14 instanceof String) {
                    b.i((String) configValue14);
                }
                boolR9 = null;
            }
        } else if (!Intrinsics.g(dq7VarA14, jq40.a(cls3))) {
            if (Intrinsics.g(dq7VarA14, jq40.a(cls2))) {
                if (configValue14 instanceof Boolean) {
                    boolR9 = (Boolean) configValue14;
                } else if (!(configValue14 instanceof String) || (boolR9 = StringsKt.r0((String) configValue14)) == null) {
                }
            } else if (Intrinsics.g(dq7VarA14, jq40.a(String.class))) {
                if (configValue14 != null) {
                    configValue14.toString();
                }
            } else if (configValue14 != null) {
                if (!(configValue14 instanceof Boolean)) {
                    configValue14 = null;
                }
                boolR9 = (Boolean) configValue14;
            }
            boolR9 = null;
        } else if (configValue14 instanceof Double) {
            if (!(configValue14 instanceof Boolean)) {
                configValue14 = null;
            }
            boolR9 = (Boolean) configValue14;
        } else {
            if (configValue14 instanceof String) {
                b.h((String) configValue14);
            }
            boolR9 = null;
        }
        boolean zBooleanValue10 = boolR9 != null ? boolR9.booleanValue() : false;
        BOConfigValueWrapper response15 = bOConfigValueBundle.getResponse(BOConfigParam.CashoutFallbackMinCapEnabled);
        Object configValue15 = response15 != null ? response15.getConfigValue() : null;
        dq7 dq7VarA15 = jq40.a(Boolean.class);
        boolean z7 = zBooleanValue10;
        if (Intrinsics.g(dq7VarA15, jq40.a(cls))) {
            if (configValue15 instanceof Integer) {
                if (!(configValue15 instanceof Boolean)) {
                    configValue15 = null;
                }
                boolR10 = (Boolean) configValue15;
            } else {
                if (configValue15 instanceof String) {
                    StringsKt.toIntOrNull((String) configValue15);
                }
                boolR10 = null;
            }
        } else if (Intrinsics.g(dq7VarA15, jq40.a(cls5))) {
            if (configValue15 instanceof Long) {
                if (!(configValue15 instanceof Boolean)) {
                    configValue15 = null;
                }
                boolR10 = (Boolean) configValue15;
            } else {
                if (configValue15 instanceof String) {
                    StringsKt.s0((String) configValue15);
                }
                boolR10 = null;
            }
        } else if (Intrinsics.g(dq7VarA15, jq40.a(cls4))) {
            if (configValue15 instanceof Float) {
                if (!(configValue15 instanceof Boolean)) {
                    configValue15 = null;
                }
                boolR10 = (Boolean) configValue15;
            } else {
                if (configValue15 instanceof String) {
                    b.i((String) configValue15);
                }
                boolR10 = null;
            }
        } else if (!Intrinsics.g(dq7VarA15, jq40.a(cls3))) {
            if (Intrinsics.g(dq7VarA15, jq40.a(cls2))) {
                if (configValue15 instanceof Boolean) {
                    boolR10 = (Boolean) configValue15;
                } else if (!(configValue15 instanceof String) || (boolR10 = StringsKt.r0((String) configValue15)) == null) {
                }
            } else if (Intrinsics.g(dq7VarA15, jq40.a(String.class))) {
                if (configValue15 != null) {
                    configValue15.toString();
                }
            } else if (configValue15 != null) {
                if (!(configValue15 instanceof Boolean)) {
                    configValue15 = null;
                }
                boolR10 = (Boolean) configValue15;
            }
            boolR10 = null;
        } else if (configValue15 instanceof Double) {
            if (!(configValue15 instanceof Boolean)) {
                configValue15 = null;
            }
            boolR10 = (Boolean) configValue15;
        } else {
            if (configValue15 instanceof String) {
                b.h((String) configValue15);
            }
            boolR10 = null;
        }
        boolean zBooleanValue11 = boolR10 != null ? boolR10.booleanValue() : false;
        TaxConfigs taxConfigsB = b6f0.b(bOConfigValueBundle);
        boolean z8 = zBooleanValue11;
        BOConfigValueWrapper response16 = bOConfigValueBundle.getResponse(BOConfigParam.BoreDrawSelectionEligibility);
        Object configValue16 = response16 != null ? response16.getConfigValue() : null;
        dq7 dq7VarA16 = jq40.a(BoreDrawSelectionEligibilityDto.class);
        boolean z9 = zBooleanValue4;
        if (Intrinsics.g(dq7VarA16, jq40.a(cls))) {
            if (configValue16 instanceof Integer) {
                if (!(configValue16 instanceof BoreDrawSelectionEligibilityDto)) {
                    configValue16 = null;
                }
                boreDrawSelectionEligibilityDto = (BoreDrawSelectionEligibilityDto) configValue16;
            } else {
                if (configValue16 instanceof String) {
                    StringsKt.toIntOrNull((String) configValue16);
                }
                boreDrawSelectionEligibilityDto = null;
            }
        } else if (Intrinsics.g(dq7VarA16, jq40.a(cls5))) {
            if (configValue16 instanceof Long) {
                if (!(configValue16 instanceof BoreDrawSelectionEligibilityDto)) {
                    configValue16 = null;
                }
                boreDrawSelectionEligibilityDto = (BoreDrawSelectionEligibilityDto) configValue16;
            } else {
                if (configValue16 instanceof String) {
                    StringsKt.s0((String) configValue16);
                }
                boreDrawSelectionEligibilityDto = null;
            }
        } else if (Intrinsics.g(dq7VarA16, jq40.a(cls4))) {
            if (configValue16 instanceof Float) {
                if (!(configValue16 instanceof BoreDrawSelectionEligibilityDto)) {
                    configValue16 = null;
                }
                boreDrawSelectionEligibilityDto = (BoreDrawSelectionEligibilityDto) configValue16;
            } else {
                if (configValue16 instanceof String) {
                    b.i((String) configValue16);
                }
                boreDrawSelectionEligibilityDto = null;
            }
        } else if (Intrinsics.g(dq7VarA16, jq40.a(cls3))) {
            if (configValue16 instanceof Double) {
                if (!(configValue16 instanceof BoreDrawSelectionEligibilityDto)) {
                    configValue16 = null;
                }
                boreDrawSelectionEligibilityDto = (BoreDrawSelectionEligibilityDto) configValue16;
            } else {
                if (configValue16 instanceof String) {
                    b.h((String) configValue16);
                }
                boreDrawSelectionEligibilityDto = null;
            }
        } else if (!Intrinsics.g(dq7VarA16, jq40.a(cls2))) {
            if (Intrinsics.g(dq7VarA16, jq40.a(String.class))) {
                if (configValue16 != null) {
                    configValue16.toString();
                }
            } else if (configValue16 != null) {
                if (!(configValue16 instanceof BoreDrawSelectionEligibilityDto)) {
                    configValue16 = null;
                }
                boreDrawSelectionEligibilityDto = (BoreDrawSelectionEligibilityDto) configValue16;
            }
            boreDrawSelectionEligibilityDto = null;
        } else if (configValue16 instanceof Boolean) {
            if (!(configValue16 instanceof BoreDrawSelectionEligibilityDto)) {
                configValue16 = null;
            }
            boreDrawSelectionEligibilityDto = (BoreDrawSelectionEligibilityDto) configValue16;
        } else {
            if (configValue16 instanceof String) {
                StringsKt.r0((String) configValue16);
            }
            boreDrawSelectionEligibilityDto = null;
        }
        BoreDrawConfig boreDrawConfig = new BoreDrawConfig((boreDrawSelectionEligibilityDto == null || (sport = boreDrawSelectionEligibilityDto.getSport()) == null) ? null : sport.getItems());
        BOConfigValueWrapper response17 = bOConfigValueBundle.getResponse(BOConfigParam.CashoutDetailThrottleInterval);
        Object configValue17 = response17 != null ? response17.getConfigValue() : null;
        dq7 dq7VarA17 = jq40.a(Long.class);
        if (!Intrinsics.g(dq7VarA17, jq40.a(cls))) {
            if (Intrinsics.g(dq7VarA17, jq40.a(cls5))) {
                if (configValue17 instanceof Long) {
                    lS0 = (Long) configValue17;
                } else if (!(configValue17 instanceof String) || (lS0 = StringsKt.s0((String) configValue17)) == null) {
                }
            } else if (Intrinsics.g(dq7VarA17, jq40.a(cls4))) {
                if (configValue17 instanceof Float) {
                    if (!(configValue17 instanceof Long)) {
                        configValue17 = null;
                    }
                    lS0 = (Long) configValue17;
                } else if (configValue17 instanceof String) {
                    b.i((String) configValue17);
                }
            } else if (Intrinsics.g(dq7VarA17, jq40.a(cls3))) {
                if (configValue17 instanceof Double) {
                    if (!(configValue17 instanceof Long)) {
                        configValue17 = null;
                    }
                    lS0 = (Long) configValue17;
                } else if (configValue17 instanceof String) {
                    b.h((String) configValue17);
                }
            } else if (Intrinsics.g(dq7VarA17, jq40.a(cls2))) {
                if (configValue17 instanceof Boolean) {
                    if (!(configValue17 instanceof Long)) {
                        configValue17 = null;
                    }
                    lS0 = (Long) configValue17;
                } else if (configValue17 instanceof String) {
                    StringsKt.r0((String) configValue17);
                }
            } else if (Intrinsics.g(dq7VarA17, jq40.a(String.class))) {
                if (configValue17 != null) {
                    configValue17.toString();
                }
            } else if (configValue17 != null) {
                if (!(configValue17 instanceof Long)) {
                    configValue17 = null;
                }
                lS0 = (Long) configValue17;
            }
            lS0 = null;
        } else if (configValue17 instanceof Integer) {
            if (!(configValue17 instanceof Long)) {
                configValue17 = null;
            }
            lS0 = (Long) configValue17;
        } else {
            if (configValue17 instanceof String) {
                StringsKt.toIntOrNull((String) configValue17);
            }
            lS0 = null;
        }
        long jLongValue = lS0 != null ? lS0.longValue() : 1000L;
        BOConfigValueWrapper response18 = bOConfigValueBundle.getResponse(BOConfigParam.AndroidMiniGamesOpenBetsEnabled);
        Object configValue18 = response18 != null ? response18.getConfigValue() : null;
        dq7 dq7VarA18 = jq40.a(Boolean.class);
        long j = jLongValue;
        if (Intrinsics.g(dq7VarA18, jq40.a(cls))) {
            if (configValue18 instanceof Integer) {
                if (!(configValue18 instanceof Boolean)) {
                    configValue18 = null;
                }
                boolR11 = (Boolean) configValue18;
            } else {
                if (configValue18 instanceof String) {
                    StringsKt.toIntOrNull((String) configValue18);
                }
                boolR11 = null;
            }
        } else if (Intrinsics.g(dq7VarA18, jq40.a(cls5))) {
            if (configValue18 instanceof Long) {
                if (!(configValue18 instanceof Boolean)) {
                    configValue18 = null;
                }
                boolR11 = (Boolean) configValue18;
            } else {
                if (configValue18 instanceof String) {
                    StringsKt.s0((String) configValue18);
                }
                boolR11 = null;
            }
        } else if (Intrinsics.g(dq7VarA18, jq40.a(cls4))) {
            if (configValue18 instanceof Float) {
                if (!(configValue18 instanceof Boolean)) {
                    configValue18 = null;
                }
                boolR11 = (Boolean) configValue18;
            } else {
                if (configValue18 instanceof String) {
                    b.i((String) configValue18);
                }
                boolR11 = null;
            }
        } else if (!Intrinsics.g(dq7VarA18, jq40.a(cls3))) {
            if (Intrinsics.g(dq7VarA18, jq40.a(cls2))) {
                if (configValue18 instanceof Boolean) {
                    boolR11 = (Boolean) configValue18;
                } else if (!(configValue18 instanceof String) || (boolR11 = StringsKt.r0((String) configValue18)) == null) {
                }
            } else if (Intrinsics.g(dq7VarA18, jq40.a(String.class))) {
                if (configValue18 != null) {
                    configValue18.toString();
                }
            } else if (configValue18 != null) {
                if (!(configValue18 instanceof Boolean)) {
                    configValue18 = null;
                }
                boolR11 = (Boolean) configValue18;
            }
            boolR11 = null;
        } else if (configValue18 instanceof Double) {
            if (!(configValue18 instanceof Boolean)) {
                configValue18 = null;
            }
            boolR11 = (Boolean) configValue18;
        } else {
            if (configValue18 instanceof String) {
                b.h((String) configValue18);
            }
            boolR11 = null;
        }
        boolean zBooleanValue12 = boolR11 != null ? boolR11.booleanValue() : false;
        BOConfigValueWrapper response19 = bOConfigValueBundle.getResponse(BOConfigParam.CashoutProviderMarketRules);
        Object configValue19 = response19 != null ? response19.getConfigValue() : null;
        dq7 dq7VarA19 = jq40.a(CashoutProviderMarketRulesMap.class);
        if (Intrinsics.g(dq7VarA19, jq40.a(cls))) {
            if (configValue19 instanceof Integer) {
                if (!(configValue19 instanceof CashoutProviderMarketRulesMap)) {
                    configValue19 = null;
                }
                cashoutProviderMarketRulesMap = (CashoutProviderMarketRulesMap) configValue19;
            } else {
                if (configValue19 instanceof String) {
                    StringsKt.toIntOrNull((String) configValue19);
                }
                cashoutProviderMarketRulesMap = null;
            }
        } else if (Intrinsics.g(dq7VarA19, jq40.a(cls5))) {
            if (configValue19 instanceof Long) {
                if (!(configValue19 instanceof CashoutProviderMarketRulesMap)) {
                    configValue19 = null;
                }
                cashoutProviderMarketRulesMap = (CashoutProviderMarketRulesMap) configValue19;
            } else {
                if (configValue19 instanceof String) {
                    StringsKt.s0((String) configValue19);
                }
                cashoutProviderMarketRulesMap = null;
            }
        } else if (Intrinsics.g(dq7VarA19, jq40.a(cls4))) {
            if (configValue19 instanceof Float) {
                if (!(configValue19 instanceof CashoutProviderMarketRulesMap)) {
                    configValue19 = null;
                }
                cashoutProviderMarketRulesMap = (CashoutProviderMarketRulesMap) configValue19;
            } else {
                if (configValue19 instanceof String) {
                    b.i((String) configValue19);
                }
                cashoutProviderMarketRulesMap = null;
            }
        } else if (Intrinsics.g(dq7VarA19, jq40.a(cls3))) {
            if (configValue19 instanceof Double) {
                if (!(configValue19 instanceof CashoutProviderMarketRulesMap)) {
                    configValue19 = null;
                }
                cashoutProviderMarketRulesMap = (CashoutProviderMarketRulesMap) configValue19;
            } else {
                if (configValue19 instanceof String) {
                    b.h((String) configValue19);
                }
                cashoutProviderMarketRulesMap = null;
            }
        } else if (!Intrinsics.g(dq7VarA19, jq40.a(cls2))) {
            if (Intrinsics.g(dq7VarA19, jq40.a(String.class))) {
                if (configValue19 != null) {
                    configValue19.toString();
                }
            } else if (configValue19 != null) {
                if (!(configValue19 instanceof CashoutProviderMarketRulesMap)) {
                    configValue19 = null;
                }
                cashoutProviderMarketRulesMap = (CashoutProviderMarketRulesMap) configValue19;
            }
            cashoutProviderMarketRulesMap = null;
        } else if (configValue19 instanceof Boolean) {
            if (!(configValue19 instanceof CashoutProviderMarketRulesMap)) {
                configValue19 = null;
            }
            cashoutProviderMarketRulesMap = (CashoutProviderMarketRulesMap) configValue19;
        } else {
            if (configValue19 instanceof String) {
                StringsKt.r0((String) configValue19);
            }
            cashoutProviderMarketRulesMap = null;
        }
        Map<String, List<? extends CashoutProviderMarketRulesMap.Action>> map = cashoutProviderMarketRulesMap != null ? cashoutProviderMarketRulesMap.getMap() : null;
        BOConfigValueWrapper response20 = bOConfigValueBundle.getResponse(BOConfigParam.CashoutUnavailableClickMetricsDebounceMs);
        Object configValue20 = response20 != null ? response20.getConfigValue() : null;
        dq7 dq7VarA20 = jq40.a(Long.class);
        boolean z10 = zBooleanValue12;
        if (!Intrinsics.g(dq7VarA20, jq40.a(cls))) {
            if (Intrinsics.g(dq7VarA20, jq40.a(cls5))) {
                if (configValue20 instanceof Long) {
                    lS1 = (Long) configValue20;
                } else if (!(configValue20 instanceof String) || (lS1 = StringsKt.s0((String) configValue20)) == null) {
                }
            } else if (Intrinsics.g(dq7VarA20, jq40.a(cls4))) {
                if (configValue20 instanceof Float) {
                    if (!(configValue20 instanceof Long)) {
                        configValue20 = null;
                    }
                    lS1 = (Long) configValue20;
                } else if (configValue20 instanceof String) {
                    b.i((String) configValue20);
                }
            } else if (Intrinsics.g(dq7VarA20, jq40.a(cls3))) {
                if (configValue20 instanceof Double) {
                    if (!(configValue20 instanceof Long)) {
                        configValue20 = null;
                    }
                    lS1 = (Long) configValue20;
                } else if (configValue20 instanceof String) {
                    b.h((String) configValue20);
                }
            } else if (Intrinsics.g(dq7VarA20, jq40.a(cls2))) {
                if (configValue20 instanceof Boolean) {
                    if (!(configValue20 instanceof Long)) {
                        configValue20 = null;
                    }
                    lS1 = (Long) configValue20;
                } else if (configValue20 instanceof String) {
                    StringsKt.r0((String) configValue20);
                }
            } else if (Intrinsics.g(dq7VarA20, jq40.a(String.class))) {
                if (configValue20 != null) {
                    configValue20.toString();
                }
            } else if (configValue20 != null) {
                if (!(configValue20 instanceof Long)) {
                    configValue20 = null;
                }
                lS1 = (Long) configValue20;
            }
            lS1 = null;
        } else if (configValue20 instanceof Integer) {
            if (!(configValue20 instanceof Long)) {
                configValue20 = null;
            }
            lS1 = (Long) configValue20;
        } else {
            if (configValue20 instanceof String) {
                StringsKt.toIntOrNull((String) configValue20);
            }
            lS1 = null;
        }
        long jLongValue2 = lS1 != null ? lS1.longValue() : 500L;
        BOConfigValueWrapper response21 = bOConfigValueBundle.getResponse(BOConfigParam.OpenBetRefreshDebounceTime);
        Object configValue21 = response21 != null ? response21.getConfigValue() : null;
        dq7 dq7VarA21 = jq40.a(Long.class);
        if (!Intrinsics.g(dq7VarA21, jq40.a(cls))) {
            if (Intrinsics.g(dq7VarA21, jq40.a(cls5))) {
                if (configValue21 instanceof Long) {
                    lS2 = (Long) configValue21;
                } else if (!(configValue21 instanceof String) || (lS2 = StringsKt.s0((String) configValue21)) == null) {
                }
            } else if (Intrinsics.g(dq7VarA21, jq40.a(cls4))) {
                if (configValue21 instanceof Float) {
                    if (!(configValue21 instanceof Long)) {
                        configValue21 = null;
                    }
                    lS2 = (Long) configValue21;
                } else if (configValue21 instanceof String) {
                    b.i((String) configValue21);
                }
            } else if (Intrinsics.g(dq7VarA21, jq40.a(cls3))) {
                if (configValue21 instanceof Double) {
                    if (!(configValue21 instanceof Long)) {
                        configValue21 = null;
                    }
                    lS2 = (Long) configValue21;
                } else if (configValue21 instanceof String) {
                    b.h((String) configValue21);
                }
            } else if (Intrinsics.g(dq7VarA21, jq40.a(cls2))) {
                if (configValue21 instanceof Boolean) {
                    if (!(configValue21 instanceof Long)) {
                        configValue21 = null;
                    }
                    lS2 = (Long) configValue21;
                } else if (configValue21 instanceof String) {
                    StringsKt.r0((String) configValue21);
                }
            } else if (Intrinsics.g(dq7VarA21, jq40.a(String.class))) {
                if (configValue21 != null) {
                    configValue21.toString();
                }
            } else if (configValue21 != null) {
                if (!(configValue21 instanceof Long)) {
                    configValue21 = null;
                }
                lS2 = (Long) configValue21;
            }
            lS2 = null;
        } else if (configValue21 instanceof Integer) {
            if (!(configValue21 instanceof Long)) {
                configValue21 = null;
            }
            lS2 = (Long) configValue21;
        } else {
            if (configValue21 instanceof String) {
                StringsKt.toIntOrNull((String) configValue21);
            }
            lS2 = null;
        }
        long jLongValue3 = lS2 != null ? lS2.longValue() : 5000L;
        BOConfigValueWrapper response22 = bOConfigValueBundle.getResponse(BOConfigParam.CashoutQuickReinvestEnabled);
        Object configValue22 = response22 != null ? response22.getConfigValue() : null;
        dq7 dq7VarA22 = jq40.a(CashoutQuickReinvestConfig.class);
        if (Intrinsics.g(dq7VarA22, jq40.a(cls))) {
            if (configValue22 instanceof Integer) {
                if (!(configValue22 instanceof CashoutQuickReinvestConfig)) {
                    configValue22 = null;
                }
                cashoutQuickReinvestConfig = (CashoutQuickReinvestConfig) configValue22;
            } else {
                if (configValue22 instanceof String) {
                    StringsKt.toIntOrNull((String) configValue22);
                }
                cashoutQuickReinvestConfig = null;
            }
        } else if (Intrinsics.g(dq7VarA22, jq40.a(cls5))) {
            if (configValue22 instanceof Long) {
                if (!(configValue22 instanceof CashoutQuickReinvestConfig)) {
                    configValue22 = null;
                }
                cashoutQuickReinvestConfig = (CashoutQuickReinvestConfig) configValue22;
            } else {
                if (configValue22 instanceof String) {
                    StringsKt.s0((String) configValue22);
                }
                cashoutQuickReinvestConfig = null;
            }
        } else if (Intrinsics.g(dq7VarA22, jq40.a(cls4))) {
            if (configValue22 instanceof Float) {
                if (!(configValue22 instanceof CashoutQuickReinvestConfig)) {
                    configValue22 = null;
                }
                cashoutQuickReinvestConfig = (CashoutQuickReinvestConfig) configValue22;
            } else {
                if (configValue22 instanceof String) {
                    b.i((String) configValue22);
                }
                cashoutQuickReinvestConfig = null;
            }
        } else if (Intrinsics.g(dq7VarA22, jq40.a(cls3))) {
            if (configValue22 instanceof Double) {
                if (!(configValue22 instanceof CashoutQuickReinvestConfig)) {
                    configValue22 = null;
                }
                cashoutQuickReinvestConfig = (CashoutQuickReinvestConfig) configValue22;
            } else {
                if (configValue22 instanceof String) {
                    b.h((String) configValue22);
                }
                cashoutQuickReinvestConfig = null;
            }
        } else if (!Intrinsics.g(dq7VarA22, jq40.a(cls2))) {
            if (Intrinsics.g(dq7VarA22, jq40.a(String.class))) {
                if (configValue22 != null) {
                    configValue22.toString();
                }
            } else if (configValue22 != null) {
                if (!(configValue22 instanceof CashoutQuickReinvestConfig)) {
                    configValue22 = null;
                }
                cashoutQuickReinvestConfig = (CashoutQuickReinvestConfig) configValue22;
            }
            cashoutQuickReinvestConfig = null;
        } else if (configValue22 instanceof Boolean) {
            if (!(configValue22 instanceof CashoutQuickReinvestConfig)) {
                configValue22 = null;
            }
            cashoutQuickReinvestConfig = (CashoutQuickReinvestConfig) configValue22;
        } else {
            if (configValue22 instanceof String) {
                StringsKt.r0((String) configValue22);
            }
            cashoutQuickReinvestConfig = null;
        }
        return new xo6(zBooleanValue, d, zBooleanValue2, z, z9, z2, cashoutSuspendDeactivateAllowConfigs2, i, cashoutAdditionalMarketSpecifierMap4, z3, z4, z5, z6, z7, z8, taxConfigsB, boreDrawConfig, j, z10, map, jLongValue2, jLongValue3, cashoutQuickReinvestConfig == null ? cashoutQuickReinvestConfig2 : cashoutQuickReinvestConfig);
    }

    public static CashOutFallbackData k(CashOutFallback cashOutFallback) {
        FallbackQuota fallbackQuota;
        FallbackUserCashOutQuota fallbackUserCashOutQuota;
        Map<String, FallbackSelectionCashOutQuota> selectionCashOutQuota;
        Integer trfGracePeriodSeconds;
        Double maxCashOutPayoutAmount;
        double dDoubleValue = 0.0d;
        if (cashOutFallback == null || (fallbackQuota = cashOutFallback.getGlobalCashOutQuota()) == null) {
            fallbackQuota = new FallbackQuota(0.0d);
        }
        FallbackQuota fallbackQuota2 = fallbackQuota;
        int iIntValue = 0;
        if (cashOutFallback == null || (fallbackUserCashOutQuota = cashOutFallback.getUserCashOutQuota()) == null) {
            fallbackUserCashOutQuota = new FallbackUserCashOutQuota(0.0d, 0);
        }
        if (cashOutFallback == null || (selectionCashOutQuota = cashOutFallback.getSelectionCashOutQuota()) == null) {
            selectionCashOutQuota = o2g.a;
            selectionCashOutQuota.getClass();
        }
        if (cashOutFallback != null && (maxCashOutPayoutAmount = cashOutFallback.getMaxCashOutPayoutAmount()) != null) {
            dDoubleValue = maxCashOutPayoutAmount.doubleValue();
        }
        Double dValueOf = Double.valueOf(dDoubleValue);
        if (cashOutFallback != null && (trfGracePeriodSeconds = cashOutFallback.getTrfGracePeriodSeconds()) != null) {
            iIntValue = trfGracePeriodSeconds.intValue();
        }
        return new CashOutFallbackData(null, null, null, fallbackQuota2, fallbackUserCashOutQuota, selectionCashOutQuota, dValueOf, null, null, Integer.valueOf(iIntValue), 391, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.rq6
    public final Object a(String str, x1b x1bVar) {
        tq6 tq6Var;
        if (x1bVar instanceof tq6) {
            tq6Var = (tq6) x1bVar;
            int i = tq6Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tq6Var.c = i - Integer.MIN_VALUE;
            } else {
                tq6Var = new tq6(this, x1bVar);
            }
        } else {
            tq6Var = new tq6(this, x1bVar);
        }
        Object objG = tq6Var.a;
        y5b y5bVar = y5b.a;
        int i2 = tq6Var.c;
        if (i2 == 0) {
            uj50.b(objG);
            tq6Var.c = 1;
            objG = this.c.g(str, "v2", tq6Var);
            if (objG == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objG);
        }
        return n52.b((BaseResponse) objG);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, x1b x1bVar) {
        uq6 uq6Var;
        if (x1bVar instanceof uq6) {
            uq6Var = (uq6) x1bVar;
            int i = uq6Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uq6Var.c = i - Integer.MIN_VALUE;
            } else {
                uq6Var = new uq6(this, x1bVar);
            }
        } else {
            uq6Var = new uq6(this, x1bVar);
        }
        Object objD = uq6Var.a;
        y5b y5bVar = y5b.a;
        int i2 = uq6Var.c;
        if (i2 == 0) {
            uj50.b(objD);
            uq6Var.c = 1;
            objD = this.b.d(str, uq6Var);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        return n52.b((BaseResponse) objD);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (r8 == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.sportybet.plugin.realsports.data.CashOutBet r7, defpackage.x1b r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.vq6
            if (r0 == 0) goto L13
            r0 = r8
            vq6 r0 = (defpackage.vq6) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            vq6 r0 = new vq6
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            y5b r1 = defpackage.y5b.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            defpackage.uj50.b(r8)
            goto L64
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L31:
            com.sportybet.plugin.realsports.data.CashOutBet r7 = r0.a
            defpackage.uj50.b(r8)
            goto L4c
        L37:
            defpackage.uj50.b(r8)
            wq6 r8 = new wq6
            r8.<init>(r6, r7, r5)
            r0.a = r7
            r0.d = r4
            k5b r2 = r6.f
            java.lang.Object r8 = defpackage.ej5.d(r2, r8, r0)
            if (r8 != r1) goto L4c
            goto L63
        L4c:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r7 = r7.getCashOutBetId()
            r8.getClass()
            r0.a = r5
            r0.d = r3
            u840 r6 = r6.c
            java.lang.String r2 = "v2"
            java.lang.Object r8 = r6.b(r7, r8, r2, r0)
            if (r8 != r1) goto L64
        L63:
            return r1
        L64:
            com.sporty.android.common.network.data.BaseResponse r8 = (com.sporty.android.common.network.data.BaseResponse) r8
            java.lang.Object r6 = defpackage.n52.b(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr6.d(com.sportybet.plugin.realsports.data.CashOutBet, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r7 == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.x1b r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.xq6
            if (r0 == 0) goto L13
            r0 = r7
            xq6 r0 = (defpackage.xq6) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xq6 r0 = new xq6
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.uj50.b(r7)
            goto L58
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L31:
            defpackage.uj50.b(r7)
            goto L48
        L35:
            defpackage.uj50.b(r7)
            yq6 r7 = new yq6
            r7.<init>(r6, r3)
            r0.c = r5
            k5b r2 = r6.f
            java.lang.Object r7 = defpackage.ej5.d(r2, r7, r0)
            if (r7 != r1) goto L48
            goto L57
        L48:
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            r0.c = r4
            t840 r6 = r6.b
            java.lang.Object r7 = r6.g(r7, r0)
            if (r7 != r1) goto L58
        L57:
            return r1
        L58:
            com.sporty.android.common.network.data.BaseResponse r7 = (com.sporty.android.common.network.data.BaseResponse) r7
            java.lang.Object r6 = defpackage.n52.b(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr6.e(x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(x1b x1bVar) {
        zq6 zq6Var;
        if (x1bVar instanceof zq6) {
            zq6Var = (zq6) x1bVar;
            int i = zq6Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zq6Var.c = i - Integer.MIN_VALUE;
            } else {
                zq6Var = new zq6(this, x1bVar);
            }
        } else {
            zq6Var = new zq6(this, x1bVar);
        }
        Object objC = zq6Var.a;
        y5b y5bVar = y5b.a;
        int i2 = zq6Var.c;
        if (i2 == 0) {
            uj50.b(objC);
            zq6Var.c = 1;
            objC = this.b.c(zq6Var);
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
        return n52.b((BaseResponse) objC);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object g(Integer num, String str, x1b x1bVar) {
        ar6 ar6Var;
        if (x1bVar instanceof ar6) {
            ar6Var = (ar6) x1bVar;
            int i = ar6Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ar6Var.c = i - Integer.MIN_VALUE;
            } else {
                ar6Var = new ar6(this, x1bVar);
            }
        } else {
            ar6Var = new ar6(this, x1bVar);
        }
        ar6 ar6Var2 = ar6Var;
        Object objH = ar6Var2.a;
        y5b y5bVar = y5b.a;
        int i2 = ar6Var2.c;
        if (i2 == 0) {
            uj50.b(objH);
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_CASHOUT);
            aVar.g("CashoutRepository.fetchOpenBetsAll(pageNum=" + num + ")", new Object[0]);
            String strValueOf = String.valueOf(System.currentTimeMillis());
            String strValueOf2 = String.valueOf(num != null ? num.intValue() : 1);
            ar6Var2.c = 1;
            objH = this.c.h(strValueOf, 10, strValueOf2, null, null, str, ar6Var2);
            if (objH == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objH);
        }
        CashOutPageResponse cashOutPageResponse = (CashOutPageResponse) n52.b((BaseResponse) objH);
        return new CashOutData(cashOutPageResponse.getTotalNum(), cashOutPageResponse.getCashAbleBets(), cashOutPageResponse.getAutoCashOuts(), null, false, false, k(cashOutPageResponse.getCashOutFallback()), 56, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(String str, x1b x1bVar) {
        br6 br6Var;
        if (x1bVar instanceof br6) {
            br6Var = (br6) x1bVar;
            int i = br6Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                br6Var.c = i - Integer.MIN_VALUE;
            } else {
                br6Var = new br6(this, x1bVar);
            }
        } else {
            br6Var = new br6(this, x1bVar);
        }
        Object objI = br6Var.a;
        y5b y5bVar = y5b.a;
        int i2 = br6Var.c;
        if (i2 == 0) {
            uj50.b(objI);
            br6Var.c = 1;
            objI = this.c.i(str, br6Var);
            if (objI == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objI);
        }
        CashOutPageResponse cashOutPageResponse = (CashOutPageResponse) n52.b((BaseResponse) objI);
        return new wyy(cashOutPageResponse.getTotalNum(), cashOutPageResponse.getTotalNumByEventId(), new Long(System.currentTimeMillis()));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object i(e1z e1zVar, String str, String str2, x1b x1bVar) {
        cr6 cr6Var;
        if (x1bVar instanceof cr6) {
            cr6Var = (cr6) x1bVar;
            int i = cr6Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cr6Var.c = i - Integer.MIN_VALUE;
            } else {
                cr6Var = new cr6(this, x1bVar);
            }
        } else {
            cr6Var = new cr6(this, x1bVar);
        }
        cr6 cr6Var2 = cr6Var;
        Object objF = cr6Var2.a;
        y5b y5bVar = y5b.a;
        int i2 = cr6Var2.c;
        if (i2 == 0) {
            uj50.b(objF);
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_CASHOUT);
            StringBuilder sb = new StringBuilder("CashoutRepository.fetchOpenBetsFiltered(openBetsFilterType=");
            sb.append(e1zVar);
            sb.append(", lastId=");
            aVar.g(uf80.a(sb, str, ")"), new Object[0]);
            String strValueOf = String.valueOf(System.currentTimeMillis());
            if (str == null) {
                str = "";
            }
            String str3 = str;
            boolean z = e1zVar == e1z.b;
            boolean z2 = e1zVar == e1z.c;
            cr6Var2.c = 1;
            objF = this.c.f(strValueOf, "", 10, str3, z, z2, str2, cr6Var2);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objF);
        }
        CashOutFilterPageResponse cashOutFilterPageResponse = (CashOutFilterPageResponse) n52.b((BaseResponse) objF);
        return new CashOutData(cashOutFilterPageResponse.getTotalNum(), cashOutFilterPageResponse.getCashAbleBets(), cashOutFilterPageResponse.getAutoCashOuts(), cashOutFilterPageResponse.getLastBetId(), cashOutFilterPageResponse.getMoreBets(), true, k(cashOutFilterPageResponse.getCashOutFallback()));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object j(String str, String str2, String str3, x1b x1bVar) {
        dr6 dr6Var;
        if (x1bVar instanceof dr6) {
            dr6Var = (dr6) x1bVar;
            int i = dr6Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dr6Var.c = i - Integer.MIN_VALUE;
            } else {
                dr6Var = new dr6(this, x1bVar);
            }
        } else {
            dr6Var = new dr6(this, x1bVar);
        }
        dr6 dr6Var2 = dr6Var;
        Object objH = dr6Var2.a;
        y5b y5bVar = y5b.a;
        int i2 = dr6Var2.c;
        if (i2 == 0) {
            uj50.b(objH);
            itf0.a aVar = itf0.a;
            aVar.g(uf80.a(ce7.a(aVar, MyLog.TAG_CASHOUT, "CashoutRepository.fetchOpenBetsOnMatch(eventId=", str, ", lastId="), str2, ")"), new Object[0]);
            String strValueOf = String.valueOf(System.currentTimeMillis());
            dr6Var2.c = 1;
            objH = this.c.h(strValueOf, 10, "", str, str2, str3, dr6Var2);
            if (objH == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objH);
        }
        CashOutPageResponse cashOutPageResponse = (CashOutPageResponse) n52.b((BaseResponse) objH);
        return new CashOutData(0, cashOutPageResponse.getCashAbleBets(), cashOutPageResponse.getAutoCashOuts(), null, false, false, k(cashOutPageResponse.getCashOutFallback()), 57, null);
    }
}
