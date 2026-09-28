package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import java.math.BigDecimal;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n100 implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: Code duplicated, block: B:20:0x0067  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Long lS0;
        switch (this.a) {
            case 0:
                BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) obj;
                bOConfigValueBundle.getClass();
                BOConfigValueWrapper response = bOConfigValueBundle.getResponse(qg4.PartnerWithdrawCancelFeeParam.a);
                Long l = null;
                obj = null;
                l = null;
                l = null;
                l = null;
                l = null;
                obj = null;
                l = null;
                l = null;
                obj = null;
                l = null;
                l = null;
                obj = null;
                l = null;
                l = null;
                l = null;
                l = null;
                Object obj2 = null;
                Object configValue = response != null ? response.getConfigValue() : null;
                dq7 dq7VarA = jq40.a(Long.class);
                if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                    if (configValue instanceof Integer) {
                        if (configValue instanceof Long) {
                            obj2 = configValue;
                        }
                        l = (Long) obj2;
                    } else if (configValue instanceof String) {
                        StringsKt.toIntOrNull((String) configValue);
                    }
                } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                    if (configValue instanceof Long) {
                        l = (Long) configValue;
                    } else if ((configValue instanceof String) && (lS0 = StringsKt.s0((String) configValue)) != null) {
                        l = lS0;
                    }
                } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                    if (configValue instanceof Float) {
                        if (configValue instanceof Long) {
                            obj2 = configValue;
                        }
                        l = (Long) obj2;
                    } else if (configValue instanceof String) {
                        b.i((String) configValue);
                    }
                } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                    if (configValue instanceof Double) {
                        if (configValue instanceof Long) {
                            obj2 = configValue;
                        }
                        l = (Long) obj2;
                    } else if (configValue instanceof String) {
                        b.h((String) configValue);
                    }
                } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                    if (configValue instanceof Boolean) {
                        if (configValue instanceof Long) {
                            obj2 = configValue;
                        }
                        l = (Long) obj2;
                    } else if (configValue instanceof String) {
                        StringsKt.r0((String) configValue);
                    }
                } else if (dq7VarA.equals(jq40.a(String.class))) {
                    if (configValue != null) {
                        configValue.toString();
                    }
                } else if (configValue != null) {
                    if (configValue instanceof Long) {
                        obj2 = configValue;
                    }
                    l = (Long) obj2;
                }
                if (l != null) {
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(l.longValue());
                    bigDecimalValueOf.getClass();
                    BigDecimal bigDecimalB = p54.b(bigDecimalValueOf);
                    if (bigDecimalB != null) {
                        return bigDecimalB;
                    }
                }
                return BigDecimal.ZERO;
            default:
                gly glyVar = (gly) obj;
                long j = glyVar.a;
                return (9223372034707292159L & j) != 9205357640488583168L ? new jj0(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (glyVar.a & 4294967295L))) : y880.a;
        }
    }
}
