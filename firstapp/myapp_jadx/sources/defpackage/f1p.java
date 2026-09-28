package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import java.util.Map;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
public final class f1p {
    public final lq1 a;

    public f1p(lq1 lq1Var) {
        lq1Var.getClass();
        this.a = lq1Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0036 A[PHI: r3
      0x0036: PHI (r3v21 java.lang.Object) = 
      (r3v11 java.lang.Object)
      (r3v12 java.lang.Object)
      (r3v14 java.lang.Object)
      (r3v11 java.lang.Object)
      (r3v16 java.lang.Object)
      (r3v11 java.lang.Object)
      (r3v18 java.lang.Object)
      (r3v11 java.lang.Object)
      (r3v20 java.lang.Object)
      (r3v11 java.lang.Object)
      (r3v23 java.lang.Object)
      (r3v11 java.lang.Object)
     binds: [B:93:0x0105, B:89:0x00fd, B:81:0x00e3, B:74:0x00d1, B:67:0x00bb, B:60:0x00aa, B:53:0x0095, B:46:0x0084, B:39:0x006f, B:32:0x005e, B:25:0x0049, B:16:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean a(me1 me1Var) {
        Boolean bool;
        BOConfigValueBundle bOConfigValueBundleE;
        BOConfigParam bOConfigParam = BOConfigParam.StaleOddsAutoRefresh;
        Map map = null;
        obj = null;
        obj = null;
        map = null;
        map = null;
        obj = null;
        obj = null;
        map = null;
        map = null;
        obj = null;
        obj = null;
        map = null;
        map = null;
        obj = null;
        obj = null;
        map = null;
        map = null;
        obj = null;
        obj = null;
        map = null;
        map = null;
        obj = null;
        map = null;
        map = null;
        Object obj = null;
        map = null;
        map = null;
        if (bOConfigParam != null && (bOConfigValueBundleE = this.a.e()) != null) {
            BOConfigValueWrapper response = bOConfigValueBundleE.getResponse(bOConfigParam);
            Object configValue = response != null ? response.getConfigValue() : null;
            dq7 dq7VarA = jq40.a(Map.class);
            if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                if (configValue instanceof Integer) {
                    if (configValue instanceof Map) {
                        obj = configValue;
                    }
                    map = (Map) obj;
                } else if ((configValue instanceof String) && (configValue = StringsKt.toIntOrNull((String) configValue)) != null) {
                    if (configValue instanceof Map) {
                        obj = configValue;
                    }
                    map = (Map) obj;
                }
            } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                if (configValue instanceof Long) {
                    if (configValue instanceof Map) {
                        obj = configValue;
                    }
                    map = (Map) obj;
                } else if ((configValue instanceof String) && (configValue = StringsKt.s0((String) configValue)) != null) {
                    if (configValue instanceof Map) {
                        obj = configValue;
                    }
                    map = (Map) obj;
                }
            } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                if (configValue instanceof Float) {
                    if (configValue instanceof Map) {
                        obj = configValue;
                    }
                    map = (Map) obj;
                } else if ((configValue instanceof String) && (configValue = b.i((String) configValue)) != null) {
                    if (configValue instanceof Map) {
                        obj = configValue;
                    }
                    map = (Map) obj;
                }
            } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                if (configValue instanceof Double) {
                    if (configValue instanceof Map) {
                        obj = configValue;
                    }
                    map = (Map) obj;
                } else if ((configValue instanceof String) && (configValue = b.h((String) configValue)) != null) {
                    if (configValue instanceof Map) {
                        obj = configValue;
                    }
                    map = (Map) obj;
                }
            } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                if (configValue instanceof Boolean) {
                    if (configValue instanceof Map) {
                        obj = configValue;
                    }
                    map = (Map) obj;
                } else if ((configValue instanceof String) && (configValue = StringsKt.r0((String) configValue)) != null) {
                    if (configValue instanceof Map) {
                        obj = configValue;
                    }
                    map = (Map) obj;
                }
            } else if (dq7VarA.equals(jq40.a(String.class))) {
                if (configValue != null && (configValue = configValue.toString()) != null) {
                    if (configValue instanceof Map) {
                        obj = configValue;
                    }
                    map = (Map) obj;
                }
            } else if (configValue != null) {
                if (configValue instanceof Map) {
                    obj = configValue;
                }
                map = (Map) obj;
            }
        }
        if (map == null || (bool = (Boolean) map.get(me1Var.name())) == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
