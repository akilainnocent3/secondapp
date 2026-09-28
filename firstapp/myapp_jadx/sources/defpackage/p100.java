package defpackage;

import com.appsflyer.internal.y;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import java.math.BigDecimal;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p100 implements Function1 {
    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0115  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        Long lS0;
        BigDecimal bigDecimalB;
        Long lS1;
        BigDecimal bigDecimalB2;
        BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) obj;
        bOConfigValueBundle.getClass();
        BOConfigValueWrapper response = bOConfigValueBundle.getResponse(qg4.WithdrawTransferMinParam.a);
        Object configValue = response != null ? response.getConfigValue() : null;
        dq7 dq7VarA = jq40.a(Long.class);
        Class cls = Integer.TYPE;
        boolean zEquals = dq7VarA.equals(jq40.a(cls));
        Class cls2 = Boolean.TYPE;
        Class cls3 = Double.TYPE;
        Class cls4 = Float.TYPE;
        Class cls5 = Long.TYPE;
        if (!zEquals) {
            if (dq7VarA.equals(jq40.a(cls5))) {
                if (configValue instanceof Long) {
                    lS0 = (Long) configValue;
                } else if (!(configValue instanceof String) || (lS0 = StringsKt.s0((String) configValue)) == null) {
                }
            } else if (dq7VarA.equals(jq40.a(cls4))) {
                if (configValue instanceof Float) {
                    if (!(configValue instanceof Long)) {
                        configValue = null;
                    }
                    lS0 = (Long) configValue;
                } else if (configValue instanceof String) {
                    b.i((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(cls3))) {
                if (configValue instanceof Double) {
                    if (!(configValue instanceof Long)) {
                        configValue = null;
                    }
                    lS0 = (Long) configValue;
                } else if (configValue instanceof String) {
                    b.h((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(cls2))) {
                if (configValue instanceof Boolean) {
                    if (!(configValue instanceof Long)) {
                        configValue = null;
                    }
                    lS0 = (Long) configValue;
                } else if (configValue instanceof String) {
                    StringsKt.r0((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(String.class))) {
                if (configValue != null) {
                    configValue.toString();
                }
            } else if (configValue != null) {
                if (!(configValue instanceof Long)) {
                    configValue = null;
                }
                lS0 = (Long) configValue;
            }
            lS0 = null;
        } else if (configValue instanceof Integer) {
            if (!(configValue instanceof Long)) {
                configValue = null;
            }
            lS0 = (Long) configValue;
        } else {
            if (configValue instanceof String) {
                StringsKt.toIntOrNull((String) configValue);
            }
            lS0 = null;
        }
        if (lS0 != null) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(lS0.longValue());
            bigDecimalValueOf.getClass();
            bigDecimalB = p54.b(bigDecimalValueOf);
        } else {
            bigDecimalB = null;
        }
        BOConfigValueWrapper response2 = bOConfigValueBundle.getResponse(qg4.WithdrawTransferMaxParam.a);
        Object configValue2 = response2 != null ? response2.getConfigValue() : null;
        dq7 dq7VarA2 = jq40.a(Long.class);
        if (!dq7VarA2.equals(jq40.a(cls))) {
            if (dq7VarA2.equals(jq40.a(cls5))) {
                if (configValue2 instanceof Long) {
                    lS1 = (Long) configValue2;
                } else if (!(configValue2 instanceof String) || (lS1 = StringsKt.s0((String) configValue2)) == null) {
                }
            } else if (dq7VarA2.equals(jq40.a(cls4))) {
                if (configValue2 instanceof Float) {
                    if (!(configValue2 instanceof Long)) {
                        configValue2 = null;
                    }
                    lS1 = (Long) configValue2;
                } else if (configValue2 instanceof String) {
                    b.i((String) configValue2);
                }
            } else if (dq7VarA2.equals(jq40.a(cls3))) {
                if (configValue2 instanceof Double) {
                    if (!(configValue2 instanceof Long)) {
                        configValue2 = null;
                    }
                    lS1 = (Long) configValue2;
                } else if (configValue2 instanceof String) {
                    b.h((String) configValue2);
                }
            } else if (dq7VarA2.equals(jq40.a(cls2))) {
                if (configValue2 instanceof Boolean) {
                    if (!(configValue2 instanceof Long)) {
                        configValue2 = null;
                    }
                    lS1 = (Long) configValue2;
                } else if (configValue2 instanceof String) {
                    StringsKt.r0((String) configValue2);
                }
            } else if (dq7VarA2.equals(jq40.a(String.class))) {
                if (configValue2 != null) {
                    configValue2.toString();
                }
            } else if (configValue2 != null) {
                if (!(configValue2 instanceof Long)) {
                    configValue2 = null;
                }
                lS1 = (Long) configValue2;
            }
            lS1 = null;
        } else if (configValue2 instanceof Integer) {
            if (!(configValue2 instanceof Long)) {
                configValue2 = null;
            }
            lS1 = (Long) configValue2;
        } else {
            if (configValue2 instanceof String) {
                StringsKt.toIntOrNull((String) configValue2);
            }
            lS1 = null;
        }
        if (lS1 != null) {
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(lS1.longValue());
            bigDecimalValueOf2.getClass();
            bigDecimalB2 = p54.b(bigDecimalValueOf2);
        } else {
            bigDecimalB2 = null;
        }
        vw vwVar = (bigDecimalB == null || bigDecimalB2 == null) ? null : new vw(bigDecimalB, bigDecimalB2);
        if (vwVar != null) {
            return vwVar;
        }
        y.a("Withdraw Transfer min or max is null");
        return null;
    }
}
