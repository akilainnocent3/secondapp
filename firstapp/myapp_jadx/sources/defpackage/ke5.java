package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.instantwin.BuildAndGoTabConfig;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ke5 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ke5(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = null;
        switch (this.a) {
            case 0:
                BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) obj;
                bOConfigValueBundle.getClass();
                BOConfigValueWrapper response = bOConfigValueBundle.getResponse(BOConfigParam.BuildAndGoFeaturedTabConfig);
                Object configValue = response != null ? response.getConfigValue() : null;
                dq7 dq7VarA = jq40.a(BuildAndGoTabConfig.class);
                if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                    if (!(configValue instanceof Integer)) {
                        if (!(configValue instanceof String)) {
                            return null;
                        }
                        StringsKt.toIntOrNull((String) configValue);
                        return null;
                    }
                    if (configValue instanceof BuildAndGoTabConfig) {
                        obj2 = configValue;
                    }
                } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                    if (!(configValue instanceof Long)) {
                        if (!(configValue instanceof String)) {
                            return null;
                        }
                        StringsKt.s0((String) configValue);
                        return null;
                    }
                    if (configValue instanceof BuildAndGoTabConfig) {
                        obj2 = configValue;
                    }
                } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                    if (!(configValue instanceof Float)) {
                        if (!(configValue instanceof String)) {
                            return null;
                        }
                        b.i((String) configValue);
                        return null;
                    }
                    if (configValue instanceof BuildAndGoTabConfig) {
                        obj2 = configValue;
                    }
                } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                    if (!(configValue instanceof Double)) {
                        if (!(configValue instanceof String)) {
                            return null;
                        }
                        b.h((String) configValue);
                        return null;
                    }
                    if (configValue instanceof BuildAndGoTabConfig) {
                        obj2 = configValue;
                    }
                } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                    if (!(configValue instanceof Boolean)) {
                        if (!(configValue instanceof String)) {
                            return null;
                        }
                        StringsKt.r0((String) configValue);
                        return null;
                    }
                    if (configValue instanceof BuildAndGoTabConfig) {
                        obj2 = configValue;
                    }
                } else {
                    if (dq7VarA.equals(jq40.a(String.class))) {
                        if (configValue == null) {
                            return null;
                        }
                        configValue.toString();
                        return null;
                    }
                    if (configValue == null) {
                        return null;
                    }
                    if (configValue instanceof BuildAndGoTabConfig) {
                        obj2 = configValue;
                    }
                }
                return (BuildAndGoTabConfig) obj2;
            default:
                return d120.b.c((d120.b) obj, null, uxs.LOADING, 23);
        }
    }
}
