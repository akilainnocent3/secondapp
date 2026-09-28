package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.otp.RegisterVCodeIgnoreConfigMap;
import com.sportybet.android.gp.tz.R;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final class idj {
    public final a990 a;
    public final lq1 b;
    public final v5 c;

    public idj(a990 a990Var, lq1 lq1Var, v5 v5Var) {
        a990Var.getClass();
        lq1Var.getClass();
        v5Var.getClass();
        this.a = a990Var;
        this.b = lq1Var;
        this.c = v5Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Code duplicated, block: B:86:0x0124  */
    public final uf00<Integer> a() {
        Map<String, String> map;
        String str;
        uf00<Integer> uf00VarU = n1a0.c;
        a990 a990Var = this.a;
        BOConfigValueBundle bOConfigValueBundleE = a990Var.a.e();
        RegisterVCodeIgnoreConfigMap registerVCodeIgnoreConfigMap = null;
        obj = null;
        registerVCodeIgnoreConfigMap = null;
        registerVCodeIgnoreConfigMap = null;
        obj = null;
        registerVCodeIgnoreConfigMap = null;
        registerVCodeIgnoreConfigMap = null;
        obj = null;
        registerVCodeIgnoreConfigMap = null;
        registerVCodeIgnoreConfigMap = null;
        obj = null;
        registerVCodeIgnoreConfigMap = null;
        registerVCodeIgnoreConfigMap = null;
        obj = null;
        registerVCodeIgnoreConfigMap = null;
        registerVCodeIgnoreConfigMap = null;
        registerVCodeIgnoreConfigMap = null;
        registerVCodeIgnoreConfigMap = null;
        Object obj = null;
        registerVCodeIgnoreConfigMap = null;
        if (bOConfigValueBundleE != null) {
            BOConfigValueWrapper response = bOConfigValueBundleE.getResponse(BOConfigParam.RegisterVcodeIgnoreConfig);
            Object configValue = response != null ? response.getConfigValue() : null;
            dq7 dq7VarA = jq40.a(RegisterVCodeIgnoreConfigMap.class);
            if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                if (configValue instanceof Integer) {
                    if (configValue instanceof RegisterVCodeIgnoreConfigMap) {
                        obj = configValue;
                    }
                    registerVCodeIgnoreConfigMap = (RegisterVCodeIgnoreConfigMap) obj;
                } else if (configValue instanceof String) {
                    StringsKt.toIntOrNull((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                if (configValue instanceof Long) {
                    if (configValue instanceof RegisterVCodeIgnoreConfigMap) {
                        obj = configValue;
                    }
                    registerVCodeIgnoreConfigMap = (RegisterVCodeIgnoreConfigMap) obj;
                } else if (configValue instanceof String) {
                    StringsKt.s0((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                if (configValue instanceof Float) {
                    if (configValue instanceof RegisterVCodeIgnoreConfigMap) {
                        obj = configValue;
                    }
                    registerVCodeIgnoreConfigMap = (RegisterVCodeIgnoreConfigMap) obj;
                } else if (configValue instanceof String) {
                    b.i((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                if (configValue instanceof Double) {
                    if (configValue instanceof RegisterVCodeIgnoreConfigMap) {
                        obj = configValue;
                    }
                    registerVCodeIgnoreConfigMap = (RegisterVCodeIgnoreConfigMap) obj;
                } else if (configValue instanceof String) {
                    b.h((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                if (configValue instanceof Boolean) {
                    if (configValue instanceof RegisterVCodeIgnoreConfigMap) {
                        obj = configValue;
                    }
                    registerVCodeIgnoreConfigMap = (RegisterVCodeIgnoreConfigMap) obj;
                } else if (configValue instanceof String) {
                    StringsKt.r0((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(String.class))) {
                if (configValue != null) {
                    configValue.toString();
                }
            } else if (configValue != null) {
                if (configValue instanceof RegisterVCodeIgnoreConfigMap) {
                    obj = configValue;
                }
                registerVCodeIgnoreConfigMap = (RegisterVCodeIgnoreConfigMap) obj;
            }
        }
        if (registerVCodeIgnoreConfigMap == null || (map = registerVCodeIgnoreConfigMap.getMap()) == null || (str = map.get("android")) == null) {
            uf00VarU = uf00VarU.u(Integer.valueOf(R.string.component_register__progressbar_otp_verification));
        } else if (!str.equals("all")) {
            List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{","}, false, 0, 6, null);
            if (!a990Var.b && (!listSplit$default.contains("sms") || !listSplit$default.contains("voice") || !listSplit$default.contains("revers_sms"))) {
                uf00VarU = uf00VarU.u(Integer.valueOf(R.string.component_register__progressbar_otp_verification));
            }
        }
        Set<Integer> setV = ay0.V(new Integer[]{Integer.valueOf(qq1.e(this.b, BOConfigParam.SimpleKycRegisterStatusConfig, 30)), this.c.d()});
        if (!(setV instanceof Collection) || !setV.isEmpty()) {
            for (Integer num : setV) {
                if (num != null && num.intValue() != 30) {
                    uf00VarU = uf00VarU.u(Integer.valueOf(R.string.component_register__progressbar_personal_info));
                    break;
                }
            }
        }
        return uf00VarU.isEmpty() ? uf00VarU : uf00VarU.g();
    }
}
