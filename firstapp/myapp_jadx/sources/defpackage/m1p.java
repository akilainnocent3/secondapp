package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final class m1p {
    public final lq1 a;

    public m1p(lq1 lq1Var) {
        lq1Var.getClass();
        this.a = lq1Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        l1p l1pVar;
        BOConfigParam bOConfigParam;
        Boolean bool;
        Boolean boolR0;
        if (x1bVar instanceof l1p) {
            l1pVar = (l1p) x1bVar;
            int i = l1pVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                l1pVar.e = i - Integer.MIN_VALUE;
            } else {
                l1pVar = new l1p(this, x1bVar);
            }
        } else {
            l1pVar = new l1p(this, x1bVar);
        }
        Object obj = l1pVar.c;
        y5b y5bVar = y5b.a;
        int i2 = l1pVar.e;
        Object obj2 = null;
        if (i2 == 0) {
            uj50.b(obj);
            BOConfigParam bOConfigParam2 = BOConfigParam.CodeHubWorldCupEnabledAndroid;
            Boolean bool2 = Boolean.TRUE;
            l1pVar.a = bOConfigParam2;
            l1pVar.b = bool2;
            l1pVar.e = 1;
            Object objJ = qq1.j(this.a, l1pVar);
            if (objJ == y5bVar) {
                return y5bVar;
            }
            bOConfigParam = bOConfigParam2;
            obj = objJ;
            bool = bool2;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bool = l1pVar.b;
            bOConfigParam = l1pVar.a;
            uj50.b(obj);
        }
        BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) obj;
        if (bOConfigValueBundle != null) {
            BOConfigValueWrapper response = bOConfigValueBundle.getResponse(bOConfigParam);
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
            if (obj2 != null) {
                return obj2;
            }
        }
        return bool;
    }
}
