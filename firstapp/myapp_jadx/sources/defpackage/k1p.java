package defpackage;

import com.sporty.android.core.model.config.Version;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.social.CodeChatBOConfigModel;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes4.dex */
public final class k1p {
    public final lq1 a;

    public k1p(lq1 lq1Var) {
        lq1Var.getClass();
        this.a = lq1Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    public final boolean a() {
        BOConfigValueBundle bOConfigValueBundleE;
        BOConfigParam bOConfigParam = BOConfigParam.SportySocialCodeChatEnabled;
        CodeChatBOConfigModel codeChatBOConfigModel = null;
        obj = null;
        codeChatBOConfigModel = null;
        codeChatBOConfigModel = null;
        obj = null;
        codeChatBOConfigModel = null;
        codeChatBOConfigModel = null;
        obj = null;
        codeChatBOConfigModel = null;
        codeChatBOConfigModel = null;
        obj = null;
        codeChatBOConfigModel = null;
        codeChatBOConfigModel = null;
        obj = null;
        codeChatBOConfigModel = null;
        codeChatBOConfigModel = null;
        codeChatBOConfigModel = null;
        codeChatBOConfigModel = null;
        Object obj = null;
        codeChatBOConfigModel = null;
        codeChatBOConfigModel = null;
        if (bOConfigParam != null && (bOConfigValueBundleE = this.a.e()) != null) {
            BOConfigValueWrapper response = bOConfigValueBundleE.getResponse(bOConfigParam);
            Object configValue = response != null ? response.getConfigValue() : null;
            dq7 dq7VarA = jq40.a(CodeChatBOConfigModel.class);
            if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                if (configValue instanceof Integer) {
                    if (configValue instanceof CodeChatBOConfigModel) {
                        obj = configValue;
                    }
                    codeChatBOConfigModel = (CodeChatBOConfigModel) obj;
                } else if (configValue instanceof String) {
                    StringsKt.toIntOrNull((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                if (configValue instanceof Long) {
                    if (configValue instanceof CodeChatBOConfigModel) {
                        obj = configValue;
                    }
                    codeChatBOConfigModel = (CodeChatBOConfigModel) obj;
                } else if (configValue instanceof String) {
                    StringsKt.s0((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                if (configValue instanceof Float) {
                    if (configValue instanceof CodeChatBOConfigModel) {
                        obj = configValue;
                    }
                    codeChatBOConfigModel = (CodeChatBOConfigModel) obj;
                } else if (configValue instanceof String) {
                    b.i((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                if (configValue instanceof Double) {
                    if (configValue instanceof CodeChatBOConfigModel) {
                        obj = configValue;
                    }
                    codeChatBOConfigModel = (CodeChatBOConfigModel) obj;
                } else if (configValue instanceof String) {
                    b.h((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                if (configValue instanceof Boolean) {
                    if (configValue instanceof CodeChatBOConfigModel) {
                        obj = configValue;
                    }
                    codeChatBOConfigModel = (CodeChatBOConfigModel) obj;
                } else if (configValue instanceof String) {
                    StringsKt.r0((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(String.class))) {
                if (configValue != null) {
                    configValue.toString();
                }
            } else if (configValue != null) {
                if (configValue instanceof CodeChatBOConfigModel) {
                    obj = configValue;
                }
                codeChatBOConfigModel = (CodeChatBOConfigModel) obj;
            }
        }
        return codeChatBOConfigModel != null && new Version("1.82.2").compareTo(new Version(codeChatBOConfigModel.getMinVersion())) >= 0 && codeChatBOConfigModel.getEnabled();
    }
}
