package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.multimaker.MultiMakerTotalOddsBOSettings;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jfw implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) obj;
        bOConfigValueBundle.getClass();
        BOConfigValueWrapper response = bOConfigValueBundle.getResponse(BOConfigParam.MultiMakerTotalOddsSetting);
        Object configValue = response != null ? response.getConfigValue() : null;
        dq7 dq7VarA = jq40.a(MultiMakerTotalOddsBOSettings.class);
        if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
            if (configValue instanceof Integer) {
                return (MultiMakerTotalOddsBOSettings) (configValue instanceof MultiMakerTotalOddsBOSettings ? configValue : null);
            }
            if (!(configValue instanceof String)) {
                return null;
            }
            StringsKt.toIntOrNull((String) configValue);
            return null;
        }
        if (dq7VarA.equals(jq40.a(Long.TYPE))) {
            if (configValue instanceof Long) {
                return (MultiMakerTotalOddsBOSettings) (configValue instanceof MultiMakerTotalOddsBOSettings ? configValue : null);
            }
            if (!(configValue instanceof String)) {
                return null;
            }
            StringsKt.s0((String) configValue);
            return null;
        }
        if (dq7VarA.equals(jq40.a(Float.TYPE))) {
            if (configValue instanceof Float) {
                return (MultiMakerTotalOddsBOSettings) (configValue instanceof MultiMakerTotalOddsBOSettings ? configValue : null);
            }
            if (!(configValue instanceof String)) {
                return null;
            }
            b.i((String) configValue);
            return null;
        }
        if (dq7VarA.equals(jq40.a(Double.TYPE))) {
            if (configValue instanceof Double) {
                return (MultiMakerTotalOddsBOSettings) (configValue instanceof MultiMakerTotalOddsBOSettings ? configValue : null);
            }
            if (!(configValue instanceof String)) {
                return null;
            }
            b.h((String) configValue);
            return null;
        }
        if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
            if (configValue instanceof Boolean) {
                return (MultiMakerTotalOddsBOSettings) (configValue instanceof MultiMakerTotalOddsBOSettings ? configValue : null);
            }
            if (!(configValue instanceof String)) {
                return null;
            }
            StringsKt.r0((String) configValue);
            return null;
        }
        if (!dq7VarA.equals(jq40.a(String.class))) {
            if (configValue != null) {
                return (MultiMakerTotalOddsBOSettings) (configValue instanceof MultiMakerTotalOddsBOSettings ? configValue : null);
            }
            return null;
        }
        if (configValue == null) {
            return null;
        }
        configValue.toString();
        return null;
    }
}
