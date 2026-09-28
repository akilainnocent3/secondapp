package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.pocket.common.UserAdditionalPhoneConfig;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o100 implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        switch (this.a) {
            case 0:
                BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) obj;
                bOConfigValueBundle.getClass();
                BOConfigValueWrapper response = bOConfigValueBundle.getResponse(qg4.UserAdditionalPhoneConfigParam.a);
                Object obj2 = null;
                Object configValue = response != null ? response.getConfigValue() : null;
                dq7 dq7VarA = jq40.a(UserAdditionalPhoneConfig.class);
                if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                    if (configValue instanceof Integer) {
                        if (configValue instanceof UserAdditionalPhoneConfig) {
                            obj2 = configValue;
                        }
                        obj2 = (UserAdditionalPhoneConfig) obj2;
                    } else if (configValue instanceof String) {
                        StringsKt.toIntOrNull((String) configValue);
                    }
                } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                    if (configValue instanceof Long) {
                        if (configValue instanceof UserAdditionalPhoneConfig) {
                            obj2 = configValue;
                        }
                        obj2 = (UserAdditionalPhoneConfig) obj2;
                    } else if (configValue instanceof String) {
                        StringsKt.s0((String) configValue);
                    }
                } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                    if (configValue instanceof Float) {
                        if (configValue instanceof UserAdditionalPhoneConfig) {
                            obj2 = configValue;
                        }
                        obj2 = (UserAdditionalPhoneConfig) obj2;
                    } else if (configValue instanceof String) {
                        b.i((String) configValue);
                    }
                } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                    if (configValue instanceof Double) {
                        if (configValue instanceof UserAdditionalPhoneConfig) {
                            obj2 = configValue;
                        }
                        obj2 = (UserAdditionalPhoneConfig) obj2;
                    } else if (configValue instanceof String) {
                        b.h((String) configValue);
                    }
                } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                    if (configValue instanceof Boolean) {
                        if (configValue instanceof UserAdditionalPhoneConfig) {
                            obj2 = configValue;
                        }
                        obj2 = (UserAdditionalPhoneConfig) obj2;
                    } else if (configValue instanceof String) {
                        StringsKt.r0((String) configValue);
                    }
                } else if (dq7VarA.equals(jq40.a(String.class))) {
                    if (configValue != null) {
                        configValue.toString();
                    }
                } else if (configValue != null) {
                    if (configValue instanceof UserAdditionalPhoneConfig) {
                        obj2 = configValue;
                    }
                    obj2 = (UserAdditionalPhoneConfig) obj2;
                }
                if (obj2 != null) {
                    return obj2;
                }
                throw new Throwable("UserAdditionalPhoneConfig is null");
            default:
                jj0 jj0Var = (jj0) obj;
                float f = jj0Var.a;
                return new gly((((long) Float.floatToRawIntBits(jj0Var.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
        }
    }
}
