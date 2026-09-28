package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j100 implements Function1 {
    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer intOrNull;
        BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) obj;
        bOConfigValueBundle.getClass();
        BOConfigValueWrapper response = bOConfigValueBundle.getResponse(qg4.MastercardDepMaxSavedCardParam.a);
        Integer num = null;
        num = null;
        num = null;
        obj = null;
        num = null;
        num = null;
        obj = null;
        num = null;
        num = null;
        obj = null;
        num = null;
        num = null;
        obj = null;
        num = null;
        num = null;
        num = null;
        num = null;
        Object obj2 = null;
        Object configValue = response != null ? response.getConfigValue() : null;
        dq7 dq7VarA = jq40.a(Integer.class);
        if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
            if (configValue instanceof Integer) {
                num = (Integer) configValue;
            } else if ((configValue instanceof String) && (intOrNull = StringsKt.toIntOrNull((String) configValue)) != null) {
                num = intOrNull;
            }
        } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
            if (configValue instanceof Long) {
                if (configValue instanceof Integer) {
                    obj2 = configValue;
                }
                num = (Integer) obj2;
            } else if (configValue instanceof String) {
                StringsKt.s0((String) configValue);
            }
        } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
            if (configValue instanceof Float) {
                if (configValue instanceof Integer) {
                    obj2 = configValue;
                }
                num = (Integer) obj2;
            } else if (configValue instanceof String) {
                b.i((String) configValue);
            }
        } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
            if (configValue instanceof Double) {
                if (configValue instanceof Integer) {
                    obj2 = configValue;
                }
                num = (Integer) obj2;
            } else if (configValue instanceof String) {
                b.h((String) configValue);
            }
        } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
            if (configValue instanceof Boolean) {
                if (configValue instanceof Integer) {
                    obj2 = configValue;
                }
                num = (Integer) obj2;
            } else if (configValue instanceof String) {
                StringsKt.r0((String) configValue);
            }
        } else if (dq7VarA.equals(jq40.a(String.class))) {
            if (configValue != null) {
                configValue.toString();
            }
        } else if (configValue != null) {
            if (configValue instanceof Integer) {
                obj2 = configValue;
            }
            num = (Integer) obj2;
        }
        return num != null ? new ut60.a(num.intValue()) : ut60.b.a;
    }
}
