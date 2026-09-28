package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import java.util.Arrays;
import java.util.List;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes4.dex */
public final class azy {
    public final lq1 a;

    public azy(lq1 lq1Var) {
        lq1Var.getClass();
        this.a = lq1Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032 A[PHI: r3
      0x0032: PHI (r3v17 java.lang.Object) = 
      (r3v6 java.lang.Object)
      (r3v7 java.lang.Object)
      (r3v9 java.lang.Object)
      (r3v6 java.lang.Object)
      (r3v11 java.lang.Object)
      (r3v6 java.lang.Object)
      (r3v13 java.lang.Object)
      (r3v6 java.lang.Object)
      (r3v15 java.lang.Object)
      (r3v6 java.lang.Object)
      (r3v19 java.lang.Object)
      (r3v6 java.lang.Object)
     binds: [B:90:0x0101, B:86:0x00f9, B:78:0x00df, B:71:0x00cd, B:64:0x00b7, B:57:0x00a6, B:50:0x0091, B:43:0x0080, B:36:0x006b, B:29:0x005a, B:22:0x0045, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    public final List<String> a() {
        BOConfigValueBundle bOConfigValueBundleE = this.a.e();
        if (bOConfigValueBundleE != null) {
            BOConfigValueWrapper response = bOConfigValueBundleE.getResponse(BOConfigParam.FifaWorldCupTournamentIds);
            String[] strArr = null;
            obj = null;
            obj = null;
            strArr = null;
            strArr = null;
            obj = null;
            obj = null;
            strArr = null;
            strArr = null;
            obj = null;
            obj = null;
            strArr = null;
            strArr = null;
            obj = null;
            obj = null;
            strArr = null;
            strArr = null;
            obj = null;
            obj = null;
            strArr = null;
            strArr = null;
            obj = null;
            strArr = null;
            strArr = null;
            Object obj = null;
            Object configValue = response != null ? response.getConfigValue() : null;
            dq7 dq7VarA = jq40.a(String[].class);
            if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                if (configValue instanceof Integer) {
                    if (configValue instanceof String[]) {
                        obj = configValue;
                    }
                    strArr = (String[]) obj;
                } else if ((configValue instanceof String) && (configValue = StringsKt.toIntOrNull((String) configValue)) != null) {
                    if (configValue instanceof String[]) {
                        obj = configValue;
                    }
                    strArr = (String[]) obj;
                }
            } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                if (configValue instanceof Long) {
                    if (configValue instanceof String[]) {
                        obj = configValue;
                    }
                    strArr = (String[]) obj;
                } else if ((configValue instanceof String) && (configValue = StringsKt.s0((String) configValue)) != null) {
                    if (configValue instanceof String[]) {
                        obj = configValue;
                    }
                    strArr = (String[]) obj;
                }
            } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                if (configValue instanceof Float) {
                    if (configValue instanceof String[]) {
                        obj = configValue;
                    }
                    strArr = (String[]) obj;
                } else if ((configValue instanceof String) && (configValue = b.i((String) configValue)) != null) {
                    if (configValue instanceof String[]) {
                        obj = configValue;
                    }
                    strArr = (String[]) obj;
                }
            } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                if (configValue instanceof Double) {
                    if (configValue instanceof String[]) {
                        obj = configValue;
                    }
                    strArr = (String[]) obj;
                } else if ((configValue instanceof String) && (configValue = b.h((String) configValue)) != null) {
                    if (configValue instanceof String[]) {
                        obj = configValue;
                    }
                    strArr = (String[]) obj;
                }
            } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                if (configValue instanceof Boolean) {
                    if (configValue instanceof String[]) {
                        obj = configValue;
                    }
                    strArr = (String[]) obj;
                } else if ((configValue instanceof String) && (configValue = StringsKt.r0((String) configValue)) != null) {
                    if (configValue instanceof String[]) {
                        obj = configValue;
                    }
                    strArr = (String[]) obj;
                }
            } else if (dq7VarA.equals(jq40.a(String.class))) {
                if (configValue != null && (configValue = configValue.toString()) != null) {
                    if (configValue instanceof String[]) {
                        obj = configValue;
                    }
                    strArr = (String[]) obj;
                }
            } else if (configValue != null) {
                if (configValue instanceof String[]) {
                    obj = configValue;
                }
                strArr = (String[]) obj;
            }
            if (strArr != null) {
                List<String> listAsList = Arrays.asList(strArr);
                listAsList.getClass();
                return listAsList;
            }
        }
        return m2g.a;
    }
}
