package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m100 implements Function1 {
    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string;
        BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) obj;
        bOConfigValueBundle.getClass();
        BOConfigValueWrapper response = bOConfigValueBundle.getResponse(qg4.MtnPaybillProviderParam.a);
        String str = null;
        String configValue = response != null ? response.getConfigValue() : null;
        dq7 dq7VarA = jq40.a(String.class);
        if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
            if (configValue instanceof Integer) {
                if (configValue instanceof String) {
                    str = configValue;
                }
                str = str;
            } else if (configValue instanceof String) {
                StringsKt.toIntOrNull(configValue);
            }
        } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
            if (configValue instanceof Long) {
                if (configValue instanceof String) {
                    str = configValue;
                }
                str = str;
            } else if (configValue instanceof String) {
                StringsKt.s0(configValue);
            }
        } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
            if (configValue instanceof Float) {
                if (configValue instanceof String) {
                    str = configValue;
                }
                str = str;
            } else if (configValue instanceof String) {
                b.i(configValue);
            }
        } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
            if (configValue instanceof Double) {
                if (configValue instanceof String) {
                    str = configValue;
                }
                str = str;
            } else if (configValue instanceof String) {
                b.h(configValue);
            }
        } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
            if (configValue instanceof Boolean) {
                if (configValue instanceof String) {
                    str = configValue;
                }
                str = str;
            } else if (configValue instanceof String) {
                StringsKt.r0(configValue);
            }
        } else if (dq7VarA.equals(jq40.a(String.class))) {
            if (configValue != null && (string = configValue.toString()) != null) {
                str = string;
            }
        } else if (configValue != null) {
            if (configValue instanceof String) {
                str = configValue;
            }
            str = str;
        }
        return str == null ? "Hubtel" : str;
    }
}
