package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;
import kotlin.text.b;
import kotlin.text.c;

/* JADX INFO: loaded from: classes5.dex */
public final class fi80 {
    public final lq1 a;
    public final psm b;

    public fi80(lq1 lq1Var, psm psmVar) {
        lq1Var.getClass();
        psmVar.getClass();
        this.a = lq1Var;
        this.b = psmVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:93:0x0109  */
    public final boolean a() {
        String[] strArr;
        BOConfigValueBundle bOConfigValueBundleE = this.a.e();
        List listAsList = null;
        if (bOConfigValueBundleE != null) {
            BOConfigValueWrapper response = bOConfigValueBundleE.getResponse(BOConfigParam.SetPasswordV2EnabledCountries);
            Object configValue = response != null ? response.getConfigValue() : null;
            dq7 dq7VarA = jq40.a(String[].class);
            if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                if (!(configValue instanceof Integer)) {
                    if (!(configValue instanceof String) || (configValue = StringsKt.toIntOrNull((String) configValue)) == null) {
                        strArr = null;
                    } else if (!(configValue instanceof String[])) {
                        configValue = null;
                    }
                    if (strArr != null) {
                        listAsList = Arrays.asList(strArr);
                        listAsList.getClass();
                    }
                } else if (!(configValue instanceof String[])) {
                    configValue = null;
                }
                strArr = (String[]) configValue;
                if (strArr != null) {
                    listAsList = Arrays.asList(strArr);
                    listAsList.getClass();
                }
            } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                if (!(configValue instanceof Long)) {
                    if (!(configValue instanceof String) || (configValue = StringsKt.s0((String) configValue)) == null) {
                        strArr = null;
                    } else if (!(configValue instanceof String[])) {
                        configValue = null;
                    }
                    if (strArr != null) {
                        listAsList = Arrays.asList(strArr);
                        listAsList.getClass();
                    }
                } else if (!(configValue instanceof String[])) {
                    configValue = null;
                }
                strArr = (String[]) configValue;
                if (strArr != null) {
                    listAsList = Arrays.asList(strArr);
                    listAsList.getClass();
                }
            } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                if (!(configValue instanceof Float)) {
                    if (!(configValue instanceof String) || (configValue = b.i((String) configValue)) == null) {
                        strArr = null;
                    } else if (!(configValue instanceof String[])) {
                        configValue = null;
                    }
                    if (strArr != null) {
                        listAsList = Arrays.asList(strArr);
                        listAsList.getClass();
                    }
                } else if (!(configValue instanceof String[])) {
                    configValue = null;
                }
                strArr = (String[]) configValue;
                if (strArr != null) {
                    listAsList = Arrays.asList(strArr);
                    listAsList.getClass();
                }
            } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                if (!(configValue instanceof Double)) {
                    if (!(configValue instanceof String) || (configValue = b.h((String) configValue)) == null) {
                        strArr = null;
                    } else if (!(configValue instanceof String[])) {
                        configValue = null;
                    }
                    if (strArr != null) {
                        listAsList = Arrays.asList(strArr);
                        listAsList.getClass();
                    }
                } else if (!(configValue instanceof String[])) {
                    configValue = null;
                }
                strArr = (String[]) configValue;
                if (strArr != null) {
                    listAsList = Arrays.asList(strArr);
                    listAsList.getClass();
                }
            } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                if (!(configValue instanceof Boolean)) {
                    if (!(configValue instanceof String) || (configValue = StringsKt.r0((String) configValue)) == null) {
                        strArr = null;
                    } else if (!(configValue instanceof String[])) {
                        configValue = null;
                    }
                    if (strArr != null) {
                        listAsList = Arrays.asList(strArr);
                        listAsList.getClass();
                    }
                } else if (!(configValue instanceof String[])) {
                    configValue = null;
                }
                strArr = (String[]) configValue;
                if (strArr != null) {
                    listAsList = Arrays.asList(strArr);
                    listAsList.getClass();
                }
            } else if (dq7VarA.equals(jq40.a(String.class))) {
                if (configValue == null || (configValue = configValue.toString()) == null) {
                    strArr = null;
                } else {
                    if (!(configValue instanceof String[])) {
                        configValue = null;
                    }
                    strArr = (String[]) configValue;
                }
                if (strArr != null) {
                    listAsList = Arrays.asList(strArr);
                    listAsList.getClass();
                }
            } else {
                if (configValue != null) {
                    if (!(configValue instanceof String[])) {
                        configValue = null;
                    }
                    strArr = (String[]) configValue;
                } else {
                    strArr = null;
                }
                if (strArr != null) {
                    listAsList = Arrays.asList(strArr);
                    listAsList.getClass();
                }
            }
        }
        if (listAsList == null) {
            listAsList = m2g.a;
        }
        if (listAsList != null && listAsList.isEmpty()) {
            return false;
        }
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            if (c.l((String) it.next(), this.b.getCountryCode().getCode(), true)) {
                return true;
            }
        }
        return false;
    }
}
