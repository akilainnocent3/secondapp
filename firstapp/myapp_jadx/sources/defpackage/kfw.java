package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sportybet.android.transaction.ui.txlist.TxListActivity;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kfw implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ kfw(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Boolean boolR0;
        switch (this.a) {
            case 0:
                BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) obj;
                bOConfigValueBundle.getClass();
                BOConfigValueWrapper response = bOConfigValueBundle.getResponse(BOConfigParam.MultiMakerTotalOddsToggle);
                Object obj2 = null;
                Object configValue = response != null ? response.getConfigValue() : null;
                dq7 dq7VarA = jq40.a(Boolean.class);
                if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                    if (!(configValue instanceof Integer)) {
                        if (!(configValue instanceof String)) {
                            return null;
                        }
                        StringsKt.toIntOrNull((String) configValue);
                        return null;
                    }
                    if (configValue instanceof Boolean) {
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
                    if (configValue instanceof Boolean) {
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
                    if (configValue instanceof Boolean) {
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
                    if (configValue instanceof Boolean) {
                        obj2 = configValue;
                    }
                } else {
                    if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                        if (configValue instanceof Boolean) {
                            return (Boolean) configValue;
                        }
                        if (!(configValue instanceof String) || (boolR0 = StringsKt.r0((String) configValue)) == null) {
                            return null;
                        }
                        return boolR0;
                    }
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
                    if (configValue instanceof Boolean) {
                        obj2 = configValue;
                    }
                }
                return (Boolean) obj2;
            default:
                psm psmVar = (psm) obj;
                int i = TxListActivity.K;
                psmVar.getClass();
                return Boolean.valueOf(psmVar.x());
        }
    }
}
