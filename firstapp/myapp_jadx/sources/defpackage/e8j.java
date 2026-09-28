package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e8j implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ e8j(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Boolean boolR0;
        switch (this.a) {
            case 0:
                return Unit.a;
            case 1:
                return Unit.a;
            default:
                BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) obj;
                bOConfigValueBundle.getClass();
                BOConfigValueWrapper response = bOConfigValueBundle.getResponse(BOConfigParam.NewVirtualLobbyBngFloatButtonEnableAndroid);
                Object obj2 = null;
                Object configValue = response != null ? response.getConfigValue() : null;
                dq7 dq7VarA = jq40.a(Boolean.class);
                if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                    if (configValue instanceof Integer) {
                        if (configValue instanceof Boolean) {
                            obj2 = configValue;
                        }
                        obj2 = (Boolean) obj2;
                    } else if (configValue instanceof String) {
                        StringsKt.toIntOrNull((String) configValue);
                    }
                } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                    if (configValue instanceof Long) {
                        if (configValue instanceof Boolean) {
                            obj2 = configValue;
                        }
                        obj2 = (Boolean) obj2;
                    } else if (configValue instanceof String) {
                        StringsKt.s0((String) configValue);
                    }
                } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                    if (configValue instanceof Float) {
                        if (configValue instanceof Boolean) {
                            obj2 = configValue;
                        }
                        obj2 = (Boolean) obj2;
                    } else if (configValue instanceof String) {
                        b.i((String) configValue);
                    }
                } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                    if (configValue instanceof Double) {
                        if (configValue instanceof Boolean) {
                            obj2 = configValue;
                        }
                        obj2 = (Boolean) obj2;
                    } else if (configValue instanceof String) {
                        b.h((String) configValue);
                    }
                } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                    if (configValue instanceof Boolean) {
                        obj2 = (Boolean) configValue;
                    } else if ((configValue instanceof String) && (boolR0 = StringsKt.r0((String) configValue)) != null) {
                        obj2 = boolR0;
                    }
                } else if (dq7VarA.equals(jq40.a(String.class))) {
                    if (configValue != null) {
                        configValue.toString();
                    }
                } else if (configValue != null) {
                    if (configValue instanceof Boolean) {
                        obj2 = configValue;
                    }
                    obj2 = (Boolean) obj2;
                }
                return Boolean.valueOf(Intrinsics.g(obj2, Boolean.TRUE));
        }
    }
}
