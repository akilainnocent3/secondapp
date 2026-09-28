package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sportybet.android.transaction.ui.txlist.TxListActivity;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lfw implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ lfw(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer intOrNull;
        switch (this.a) {
            case 0:
                BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) obj;
                bOConfigValueBundle.getClass();
                BOConfigValueWrapper response = bOConfigValueBundle.getResponse(BOConfigParam.MultiMakerMaxReqNum);
                Object obj2 = null;
                Object configValue = response != null ? response.getConfigValue() : null;
                dq7 dq7VarA = jq40.a(Integer.class);
                if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                    if (configValue instanceof Integer) {
                        return (Integer) configValue;
                    }
                    if (!(configValue instanceof String) || (intOrNull = StringsKt.toIntOrNull((String) configValue)) == null) {
                        return null;
                    }
                    return intOrNull;
                }
                if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                    if (!(configValue instanceof Long)) {
                        if (!(configValue instanceof String)) {
                            return null;
                        }
                        StringsKt.s0((String) configValue);
                        return null;
                    }
                    if (configValue instanceof Integer) {
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
                    if (configValue instanceof Integer) {
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
                    if (configValue instanceof Integer) {
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
                    if (configValue instanceof Integer) {
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
                    if (configValue instanceof Integer) {
                        obj2 = configValue;
                    }
                }
                return (Integer) obj2;
            default:
                psm psmVar = (psm) obj;
                int i = TxListActivity.K;
                psmVar.getClass();
                return Boolean.valueOf(psmVar.x());
        }
    }
}
