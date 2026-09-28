package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.config.tax.TaxConfigs;
import com.sporty.android.core.model.config.tax.WinningTaxRateMap;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes4.dex */
public final class v7g {
    public static final boolean a(String str) {
        BigDecimal bigDecimalG;
        if (str == null || StringsKt.U(str)) {
            return true;
        }
        BigDecimal bigDecimal = null;
        if (str != null) {
            if (StringsKt.U(str)) {
                str = null;
            }
            if (str != null && (bigDecimalG = b.g(str)) != null && bigDecimalG.compareTo(BigDecimal.ZERO) >= 0) {
                bigDecimal = bigDecimalG;
            }
        }
        return bigDecimal != null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:89:0x0115  */
    public static final TaxConfigs b(BOConfigValueBundle bOConfigValueBundle) {
        String string;
        boolean zA;
        Object configValue;
        WinningTaxRateMap winningTaxRateMap;
        bOConfigValueBundle.getClass();
        BOConfigValueWrapper response = bOConfigValueBundle.getResponse(BOConfigParam.WinningTaxType);
        Object configValue2 = response != null ? response.getConfigValue() : null;
        dq7 dq7VarA = jq40.a(String.class);
        Class cls = Integer.TYPE;
        boolean zEquals = dq7VarA.equals(jq40.a(cls));
        Class cls2 = Boolean.TYPE;
        Class cls3 = Double.TYPE;
        Class cls4 = Float.TYPE;
        Class cls5 = Long.TYPE;
        if (zEquals) {
            if (configValue2 instanceof Integer) {
                if (!(configValue2 instanceof String)) {
                    configValue2 = null;
                }
                string = configValue2;
            } else {
                if (configValue2 instanceof String) {
                    StringsKt.toIntOrNull((String) configValue2);
                }
                string = null;
            }
        } else if (dq7VarA.equals(jq40.a(cls5))) {
            if (configValue2 instanceof Long) {
                if (!(configValue2 instanceof String)) {
                    configValue2 = null;
                }
                string = configValue2;
            } else {
                if (configValue2 instanceof String) {
                    StringsKt.s0((String) configValue2);
                }
                string = null;
            }
        } else if (dq7VarA.equals(jq40.a(cls4))) {
            if (configValue2 instanceof Float) {
                if (!(configValue2 instanceof String)) {
                    configValue2 = null;
                }
                string = configValue2;
            } else {
                if (configValue2 instanceof String) {
                    b.i((String) configValue2);
                }
                string = null;
            }
        } else if (dq7VarA.equals(jq40.a(cls3))) {
            if (configValue2 instanceof Double) {
                if (!(configValue2 instanceof String)) {
                    configValue2 = null;
                }
                string = configValue2;
            } else {
                if (configValue2 instanceof String) {
                    b.h((String) configValue2);
                }
                string = null;
            }
        } else if (!dq7VarA.equals(jq40.a(cls2))) {
            if (dq7VarA.equals(jq40.a(String.class))) {
                if (configValue2 == null || (string = configValue2.toString()) == null) {
                }
            } else if (configValue2 != null) {
                if (!(configValue2 instanceof String)) {
                    configValue2 = null;
                }
                string = configValue2;
            }
            string = null;
        } else if (configValue2 instanceof Boolean) {
            if (!(configValue2 instanceof String)) {
                configValue2 = null;
            }
            string = configValue2;
        } else {
            if (configValue2 instanceof String) {
                StringsKt.r0((String) configValue2);
            }
            string = null;
        }
        if (string != null) {
            if (StringsKt.U(string)) {
                string = null;
            }
            if (string != null) {
                BOConfigParam bOConfigParam = BOConfigParam.WinningTaxRate;
                BOConfigValueWrapper response2 = bOConfigValueBundle.getResponse(bOConfigParam);
                if (response2 == null || response2.getConfigValue() == null) {
                    zA = true;
                } else {
                    BOConfigValueWrapper response3 = bOConfigValueBundle.getResponse(bOConfigParam);
                    Object configValue3 = response3 != null ? response3.getConfigValue() : null;
                    dq7 dq7VarA2 = jq40.a(WinningTaxRateMap.class);
                    if (dq7VarA2.equals(jq40.a(cls))) {
                        if (configValue3 instanceof Integer) {
                            if (!(configValue3 instanceof WinningTaxRateMap)) {
                                configValue3 = null;
                            }
                            winningTaxRateMap = (WinningTaxRateMap) configValue3;
                            if (winningTaxRateMap == null) {
                                zA = false;
                            } else {
                                zA = a(winningTaxRateMap.getMap().get(string));
                            }
                        } else {
                            if (configValue3 instanceof String) {
                                StringsKt.toIntOrNull((String) configValue3);
                            }
                            winningTaxRateMap = null;
                            if (winningTaxRateMap == null) {
                                zA = false;
                            } else {
                                zA = a(winningTaxRateMap.getMap().get(string));
                            }
                        }
                    } else if (dq7VarA2.equals(jq40.a(cls5))) {
                        if (configValue3 instanceof Long) {
                            if (!(configValue3 instanceof WinningTaxRateMap)) {
                                configValue3 = null;
                            }
                            winningTaxRateMap = (WinningTaxRateMap) configValue3;
                            if (winningTaxRateMap == null) {
                                zA = false;
                            } else {
                                zA = a(winningTaxRateMap.getMap().get(string));
                            }
                        } else {
                            if (configValue3 instanceof String) {
                                StringsKt.s0((String) configValue3);
                            }
                            winningTaxRateMap = null;
                            if (winningTaxRateMap == null) {
                                zA = false;
                            } else {
                                zA = a(winningTaxRateMap.getMap().get(string));
                            }
                        }
                    } else if (dq7VarA2.equals(jq40.a(cls4))) {
                        if (configValue3 instanceof Float) {
                            if (!(configValue3 instanceof WinningTaxRateMap)) {
                                configValue3 = null;
                            }
                            winningTaxRateMap = (WinningTaxRateMap) configValue3;
                            if (winningTaxRateMap == null) {
                                zA = false;
                            } else {
                                zA = a(winningTaxRateMap.getMap().get(string));
                            }
                        } else {
                            if (configValue3 instanceof String) {
                                b.i((String) configValue3);
                            }
                            winningTaxRateMap = null;
                            if (winningTaxRateMap == null) {
                                zA = false;
                            } else {
                                zA = a(winningTaxRateMap.getMap().get(string));
                            }
                        }
                    } else if (dq7VarA2.equals(jq40.a(cls3))) {
                        if (configValue3 instanceof Double) {
                            if (!(configValue3 instanceof WinningTaxRateMap)) {
                                configValue3 = null;
                            }
                            winningTaxRateMap = (WinningTaxRateMap) configValue3;
                            if (winningTaxRateMap == null) {
                                zA = false;
                            } else {
                                zA = a(winningTaxRateMap.getMap().get(string));
                            }
                        } else {
                            if (configValue3 instanceof String) {
                                b.h((String) configValue3);
                            }
                            winningTaxRateMap = null;
                            if (winningTaxRateMap == null) {
                                zA = false;
                            } else {
                                zA = a(winningTaxRateMap.getMap().get(string));
                            }
                        }
                    } else if (!dq7VarA2.equals(jq40.a(cls2))) {
                        if (!dq7VarA2.equals(jq40.a(String.class))) {
                            if (configValue3 != null) {
                                if (!(configValue3 instanceof WinningTaxRateMap)) {
                                    configValue3 = null;
                                }
                                winningTaxRateMap = (WinningTaxRateMap) configValue3;
                            }
                            if (winningTaxRateMap == null) {
                                zA = false;
                            } else {
                                zA = a(winningTaxRateMap.getMap().get(string));
                            }
                        } else if (configValue3 != null) {
                            configValue3.toString();
                        }
                        winningTaxRateMap = null;
                        if (winningTaxRateMap == null) {
                            zA = false;
                        } else {
                            zA = a(winningTaxRateMap.getMap().get(string));
                        }
                    } else if (configValue3 instanceof Boolean) {
                        if (!(configValue3 instanceof WinningTaxRateMap)) {
                            configValue3 = null;
                        }
                        winningTaxRateMap = (WinningTaxRateMap) configValue3;
                        if (winningTaxRateMap == null) {
                            zA = false;
                        } else {
                            zA = a(winningTaxRateMap.getMap().get(string));
                        }
                    } else {
                        if (configValue3 instanceof String) {
                            StringsKt.r0((String) configValue3);
                        }
                        winningTaxRateMap = null;
                        if (winningTaxRateMap == null) {
                            zA = false;
                        } else {
                            zA = a(winningTaxRateMap.getMap().get(string));
                        }
                    }
                }
                if (zA) {
                    List listK = kotlin.collections.b.k(BOConfigParam.ExciseTaxRateToShow, BOConfigParam.ExciseTaxRateToCharge, BOConfigParam.ExciseTaxRateStakeBonus);
                    if (listK == null || !listK.isEmpty()) {
                        Iterator it = listK.iterator();
                        while (it.hasNext()) {
                            BOConfigValueWrapper response4 = bOConfigValueBundle.getResponse((BOConfigParam) it.next());
                            if (!((response4 == null || (configValue = response4.getConfigValue()) == null) ? true : a(configValue.toString()))) {
                            }
                        }
                    }
                    return b6f0.b(bOConfigValueBundle);
                }
            }
        }
        return null;
    }
}
