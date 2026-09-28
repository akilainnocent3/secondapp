package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigParamDto;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.pocket.common.PayHintData;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes4.dex */
public final class mq1 implements Function1<BOConfigValueBundle, PayHintData.PayHintEntity> {
    public final /* synthetic */ BOConfigParamDto a;

    public mq1(BOConfigParamDto bOConfigParamDto) {
        this.a = bOConfigParamDto;
    }

    @Override // kotlin.jvm.functions.Function1
    public final PayHintData.PayHintEntity invoke(BOConfigValueBundle bOConfigValueBundle) {
        BOConfigValueBundle bOConfigValueBundle2 = bOConfigValueBundle;
        bOConfigValueBundle2.getClass();
        BOConfigValueWrapper response = bOConfigValueBundle2.getResponse(this.a);
        Object configValue = response != null ? response.getConfigValue() : null;
        dq7 dq7VarA = jq40.a(PayHintData.PayHintEntity.class);
        if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
            if (configValue instanceof Integer) {
                return (PayHintData.PayHintEntity) (configValue instanceof PayHintData.PayHintEntity ? configValue : null);
            }
            if (!(configValue instanceof String)) {
                return null;
            }
            StringsKt.toIntOrNull((String) configValue);
            return null;
        }
        if (dq7VarA.equals(jq40.a(Long.TYPE))) {
            if (configValue instanceof Long) {
                return (PayHintData.PayHintEntity) (configValue instanceof PayHintData.PayHintEntity ? configValue : null);
            }
            if (!(configValue instanceof String)) {
                return null;
            }
            StringsKt.s0((String) configValue);
            return null;
        }
        if (dq7VarA.equals(jq40.a(Float.TYPE))) {
            if (configValue instanceof Float) {
                return (PayHintData.PayHintEntity) (configValue instanceof PayHintData.PayHintEntity ? configValue : null);
            }
            if (!(configValue instanceof String)) {
                return null;
            }
            b.i((String) configValue);
            return null;
        }
        if (dq7VarA.equals(jq40.a(Double.TYPE))) {
            if (configValue instanceof Double) {
                return (PayHintData.PayHintEntity) (configValue instanceof PayHintData.PayHintEntity ? configValue : null);
            }
            if (!(configValue instanceof String)) {
                return null;
            }
            b.h((String) configValue);
            return null;
        }
        if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
            if (configValue instanceof Boolean) {
                return (PayHintData.PayHintEntity) (configValue instanceof PayHintData.PayHintEntity ? configValue : null);
            }
            if (!(configValue instanceof String)) {
                return null;
            }
            StringsKt.r0((String) configValue);
            return null;
        }
        if (!dq7VarA.equals(jq40.a(String.class))) {
            if (configValue != null) {
                return (PayHintData.PayHintEntity) (configValue instanceof PayHintData.PayHintEntity ? configValue : null);
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
