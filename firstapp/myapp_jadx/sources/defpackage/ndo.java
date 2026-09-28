package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigParamDto;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes4.dex */
public final class ndo implements Function1<BOConfigValueBundle, Boolean> {
    public final /* synthetic */ BOConfigParamDto a;

    public ndo(BOConfigParamDto bOConfigParamDto) {
        this.a = bOConfigParamDto;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(BOConfigValueBundle bOConfigValueBundle) {
        Boolean boolR0;
        BOConfigValueBundle bOConfigValueBundle2 = bOConfigValueBundle;
        bOConfigValueBundle2.getClass();
        BOConfigValueWrapper response = bOConfigValueBundle2.getResponse(this.a);
        Object configValue = response != null ? response.getConfigValue() : null;
        dq7 dq7VarA = jq40.a(Boolean.class);
        if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
            if (configValue instanceof Integer) {
                return (Boolean) (configValue instanceof Boolean ? configValue : null);
            }
            if (!(configValue instanceof String)) {
                return null;
            }
            StringsKt.toIntOrNull((String) configValue);
            return null;
        }
        if (dq7VarA.equals(jq40.a(Long.TYPE))) {
            if (configValue instanceof Long) {
                return (Boolean) (configValue instanceof Boolean ? configValue : null);
            }
            if (!(configValue instanceof String)) {
                return null;
            }
            StringsKt.s0((String) configValue);
            return null;
        }
        if (dq7VarA.equals(jq40.a(Float.TYPE))) {
            if (configValue instanceof Float) {
                return (Boolean) (configValue instanceof Boolean ? configValue : null);
            }
            if (!(configValue instanceof String)) {
                return null;
            }
            b.i((String) configValue);
            return null;
        }
        if (dq7VarA.equals(jq40.a(Double.TYPE))) {
            if (configValue instanceof Double) {
                return (Boolean) (configValue instanceof Boolean ? configValue : null);
            }
            if (!(configValue instanceof String)) {
                return null;
            }
            b.h((String) configValue);
            return null;
        }
        if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
            if (configValue instanceof Boolean) {
                return (Boolean) configValue;
            }
            if (!(configValue instanceof String) || (boolR0 = StringsKt.r0((String) configValue)) == null) {
                return null;
            }
            return boolR0;
        }
        if (!dq7VarA.equals(jq40.a(String.class))) {
            if (configValue != null) {
                return (Boolean) (configValue instanceof Boolean ? configValue : null);
            }
            return null;
        }
        if (configValue == null) {
            return null;
        }
        configValue.toString();
        return null;
    }
}
