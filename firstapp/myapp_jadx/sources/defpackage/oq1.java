package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigParamDto;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.pay.bo.PhonePrefixData;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes6.dex */
public final class oq1 implements Function1<BOConfigValueBundle, PhonePrefixData[]> {
    public final /* synthetic */ BOConfigParamDto a;

    public oq1(BOConfigParamDto bOConfigParamDto) {
        this.a = bOConfigParamDto;
    }

    @Override // kotlin.jvm.functions.Function1
    public final PhonePrefixData[] invoke(BOConfigValueBundle bOConfigValueBundle) {
        String string;
        Boolean boolR0;
        Double dH;
        Float fI;
        Long lS0;
        Integer intOrNull;
        BOConfigValueBundle bOConfigValueBundle2 = bOConfigValueBundle;
        bOConfigValueBundle2.getClass();
        BOConfigValueWrapper response = bOConfigValueBundle2.getResponse(this.a);
        Object configValue = response != null ? response.getConfigValue() : null;
        dq7 dq7VarA = jq40.a(PhonePrefixData[].class);
        if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
            if (configValue instanceof Integer) {
                return (PhonePrefixData[]) (configValue instanceof PhonePrefixData[] ? configValue : null);
            }
            if (!(configValue instanceof String) || (intOrNull = StringsKt.toIntOrNull((String) configValue)) == null) {
                return null;
            }
            return (PhonePrefixData[]) (intOrNull instanceof PhonePrefixData[] ? intOrNull : null);
        }
        if (dq7VarA.equals(jq40.a(Long.TYPE))) {
            if (configValue instanceof Long) {
                return (PhonePrefixData[]) (configValue instanceof PhonePrefixData[] ? configValue : null);
            }
            if (!(configValue instanceof String) || (lS0 = StringsKt.s0((String) configValue)) == null) {
                return null;
            }
            return (PhonePrefixData[]) (lS0 instanceof PhonePrefixData[] ? lS0 : null);
        }
        if (dq7VarA.equals(jq40.a(Float.TYPE))) {
            if (configValue instanceof Float) {
                return (PhonePrefixData[]) (configValue instanceof PhonePrefixData[] ? configValue : null);
            }
            if (!(configValue instanceof String) || (fI = b.i((String) configValue)) == null) {
                return null;
            }
            return (PhonePrefixData[]) (fI instanceof PhonePrefixData[] ? fI : null);
        }
        if (dq7VarA.equals(jq40.a(Double.TYPE))) {
            if (configValue instanceof Double) {
                return (PhonePrefixData[]) (configValue instanceof PhonePrefixData[] ? configValue : null);
            }
            if (!(configValue instanceof String) || (dH = b.h((String) configValue)) == null) {
                return null;
            }
            return (PhonePrefixData[]) (dH instanceof PhonePrefixData[] ? dH : null);
        }
        if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
            if (configValue instanceof Boolean) {
                return (PhonePrefixData[]) (configValue instanceof PhonePrefixData[] ? configValue : null);
            }
            if (!(configValue instanceof String) || (boolR0 = StringsKt.r0((String) configValue)) == null) {
                return null;
            }
            return (PhonePrefixData[]) (boolR0 instanceof PhonePrefixData[] ? boolR0 : null);
        }
        if (!dq7VarA.equals(jq40.a(String.class))) {
            if (configValue != null) {
                return (PhonePrefixData[]) (configValue instanceof PhonePrefixData[] ? configValue : null);
            }
            return null;
        }
        if (configValue == null || (string = configValue.toString()) == null) {
            return null;
        }
        return (PhonePrefixData[]) (string instanceof PhonePrefixData[] ? string : null);
    }
}
