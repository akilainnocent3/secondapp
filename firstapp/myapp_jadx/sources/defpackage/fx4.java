package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.realsports.MaxCombinationRejectConfig;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fx4 implements Function1 {
    public final /* synthetic */ int a = 1;

    public /* synthetic */ fx4() {
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX WARN: Code duplicated, block: B:93:0x013e  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Boolean boolR0;
        Integer intOrNull;
        switch (this.a) {
            case 0:
                BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) obj;
                bOConfigValueBundle.getClass();
                BOConfigValueWrapper response = bOConfigValueBundle.getResponse(BOConfigParam.MaxCombinationsRejectEnabled);
                Integer maxCombinations = null;
                maxCombinations = null;
                maxCombinations = null;
                obj = null;
                maxCombinations = null;
                maxCombinations = null;
                obj = null;
                maxCombinations = null;
                maxCombinations = null;
                obj = null;
                maxCombinations = null;
                maxCombinations = null;
                obj = null;
                maxCombinations = null;
                maxCombinations = null;
                maxCombinations = null;
                maxCombinations = null;
                Object obj2 = null;
                Object configValue = response != null ? response.getConfigValue() : null;
                dq7 dq7VarA = jq40.a(Boolean.class);
                Class cls = Integer.TYPE;
                boolean zEquals = dq7VarA.equals(jq40.a(cls));
                Class cls2 = Boolean.TYPE;
                Class cls3 = Double.TYPE;
                Class cls4 = Float.TYPE;
                Class cls5 = Long.TYPE;
                if (zEquals) {
                    if (configValue instanceof Integer) {
                        if (!(configValue instanceof Boolean)) {
                            configValue = null;
                        }
                        boolR0 = (Boolean) configValue;
                    } else {
                        if (configValue instanceof String) {
                            StringsKt.toIntOrNull((String) configValue);
                        }
                        boolR0 = null;
                    }
                } else if (dq7VarA.equals(jq40.a(cls5))) {
                    if (configValue instanceof Long) {
                        if (!(configValue instanceof Boolean)) {
                            configValue = null;
                        }
                        boolR0 = (Boolean) configValue;
                    } else {
                        if (configValue instanceof String) {
                            StringsKt.s0((String) configValue);
                        }
                        boolR0 = null;
                    }
                } else if (dq7VarA.equals(jq40.a(cls4))) {
                    if (configValue instanceof Float) {
                        if (!(configValue instanceof Boolean)) {
                            configValue = null;
                        }
                        boolR0 = (Boolean) configValue;
                    } else {
                        if (configValue instanceof String) {
                            b.i((String) configValue);
                        }
                        boolR0 = null;
                    }
                } else if (!dq7VarA.equals(jq40.a(cls3))) {
                    if (dq7VarA.equals(jq40.a(cls2))) {
                        if (configValue instanceof Boolean) {
                            boolR0 = (Boolean) configValue;
                        } else if (!(configValue instanceof String) || (boolR0 = StringsKt.r0((String) configValue)) == null) {
                        }
                    } else if (dq7VarA.equals(jq40.a(String.class))) {
                        if (configValue != null) {
                            configValue.toString();
                        }
                    } else if (configValue != null) {
                        if (!(configValue instanceof Boolean)) {
                            configValue = null;
                        }
                        boolR0 = (Boolean) configValue;
                    }
                    boolR0 = null;
                } else if (configValue instanceof Double) {
                    if (!(configValue instanceof Boolean)) {
                        configValue = null;
                    }
                    boolR0 = (Boolean) configValue;
                } else {
                    if (configValue instanceof String) {
                        b.h((String) configValue);
                    }
                    boolR0 = null;
                }
                if (boolR0 == null) {
                    boolR0 = MaxCombinationRejectConfig.INSTANCE.getDefault().getEnabled();
                }
                BOConfigValueWrapper response2 = bOConfigValueBundle.getResponse(BOConfigParam.MaxCombinationsRejectCount);
                Object configValue2 = response2 != null ? response2.getConfigValue() : null;
                dq7 dq7VarA2 = jq40.a(Integer.class);
                if (dq7VarA2.equals(jq40.a(cls))) {
                    if (configValue2 instanceof Integer) {
                        maxCombinations = (Integer) configValue2;
                    } else if ((configValue2 instanceof String) && (intOrNull = StringsKt.toIntOrNull((String) configValue2)) != null) {
                        maxCombinations = intOrNull;
                    }
                } else if (dq7VarA2.equals(jq40.a(cls5))) {
                    if (configValue2 instanceof Long) {
                        if (configValue2 instanceof Integer) {
                            obj2 = configValue2;
                        }
                        maxCombinations = (Integer) obj2;
                    } else if (configValue2 instanceof String) {
                        StringsKt.s0((String) configValue2);
                    }
                } else if (dq7VarA2.equals(jq40.a(cls4))) {
                    if (configValue2 instanceof Float) {
                        if (configValue2 instanceof Integer) {
                            obj2 = configValue2;
                        }
                        maxCombinations = (Integer) obj2;
                    } else if (configValue2 instanceof String) {
                        b.i((String) configValue2);
                    }
                } else if (dq7VarA2.equals(jq40.a(cls3))) {
                    if (configValue2 instanceof Double) {
                        if (configValue2 instanceof Integer) {
                            obj2 = configValue2;
                        }
                        maxCombinations = (Integer) obj2;
                    } else if (configValue2 instanceof String) {
                        b.h((String) configValue2);
                    }
                } else if (dq7VarA2.equals(jq40.a(cls2))) {
                    if (configValue2 instanceof Boolean) {
                        if (configValue2 instanceof Integer) {
                            obj2 = configValue2;
                        }
                        maxCombinations = (Integer) obj2;
                    } else if (configValue2 instanceof String) {
                        StringsKt.r0((String) configValue2);
                    }
                } else if (dq7VarA2.equals(jq40.a(String.class))) {
                    if (configValue2 != null) {
                        configValue2.toString();
                    }
                } else if (configValue2 != null) {
                    if (configValue2 instanceof Integer) {
                        obj2 = configValue2;
                    }
                    maxCombinations = (Integer) obj2;
                }
                if (maxCombinations == null) {
                    maxCombinations = MaxCombinationRejectConfig.INSTANCE.getDefault().getMaxCombinations();
                }
                return new MaxCombinationRejectConfig(boolR0, maxCombinations);
            default:
                vci vciVar = (vci) obj;
                vciVar.getClass();
                return Integer.valueOf(vciVar.c);
        }
    }

    public /* synthetic */ fx4(hx4 hx4Var) {
    }
}
