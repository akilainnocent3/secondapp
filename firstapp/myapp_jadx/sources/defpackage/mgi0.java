package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.virtual.MainEntranceItem;
import com.sportybet.android.virtual.domain.entity.MainEntranceEntity;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mgi0 implements Function1 {
    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MainEntranceItem[] mainEntranceItemArr;
        BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) obj;
        bOConfigValueBundle.getClass();
        BOConfigValueWrapper response = bOConfigValueBundle.getResponse(BOConfigParam.NewVirtualLobbyMainEntranceAndroid);
        Object configValue = response != null ? response.getConfigValue() : null;
        dq7 dq7VarA = jq40.a(MainEntranceItem[].class);
        if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
            if (configValue instanceof Integer) {
                if (!(configValue instanceof MainEntranceItem[])) {
                    configValue = null;
                }
            } else if (!(configValue instanceof String) || (configValue = StringsKt.toIntOrNull((String) configValue)) == null) {
                mainEntranceItemArr = null;
            } else if (!(configValue instanceof MainEntranceItem[])) {
                configValue = null;
            }
            mainEntranceItemArr = (MainEntranceItem[]) configValue;
        } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
            if (configValue instanceof Long) {
                if (!(configValue instanceof MainEntranceItem[])) {
                    configValue = null;
                }
            } else if (!(configValue instanceof String) || (configValue = StringsKt.s0((String) configValue)) == null) {
                mainEntranceItemArr = null;
            } else if (!(configValue instanceof MainEntranceItem[])) {
                configValue = null;
            }
            mainEntranceItemArr = (MainEntranceItem[]) configValue;
        } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
            if (configValue instanceof Float) {
                if (!(configValue instanceof MainEntranceItem[])) {
                    configValue = null;
                }
            } else if (!(configValue instanceof String) || (configValue = b.i((String) configValue)) == null) {
                mainEntranceItemArr = null;
            } else if (!(configValue instanceof MainEntranceItem[])) {
                configValue = null;
            }
            mainEntranceItemArr = (MainEntranceItem[]) configValue;
        } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
            if (configValue instanceof Double) {
                if (!(configValue instanceof MainEntranceItem[])) {
                    configValue = null;
                }
            } else if (!(configValue instanceof String) || (configValue = b.h((String) configValue)) == null) {
                mainEntranceItemArr = null;
            } else if (!(configValue instanceof MainEntranceItem[])) {
                configValue = null;
            }
            mainEntranceItemArr = (MainEntranceItem[]) configValue;
        } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
            if (configValue instanceof Boolean) {
                if (!(configValue instanceof MainEntranceItem[])) {
                    configValue = null;
                }
            } else if (!(configValue instanceof String) || (configValue = StringsKt.r0((String) configValue)) == null) {
                mainEntranceItemArr = null;
            } else if (!(configValue instanceof MainEntranceItem[])) {
                configValue = null;
            }
            mainEntranceItemArr = (MainEntranceItem[]) configValue;
        } else if (dq7VarA.equals(jq40.a(String.class))) {
            if (configValue == null || (configValue = configValue.toString()) == null) {
                mainEntranceItemArr = null;
            } else {
                if (!(configValue instanceof MainEntranceItem[])) {
                    configValue = null;
                }
                mainEntranceItemArr = (MainEntranceItem[]) configValue;
            }
        } else if (configValue != null) {
            if (!(configValue instanceof MainEntranceItem[])) {
                configValue = null;
            }
            mainEntranceItemArr = (MainEntranceItem[]) configValue;
        } else {
            mainEntranceItemArr = null;
        }
        return new MainEntranceEntity(mainEntranceItemArr != null ? ay0.S(mainEntranceItemArr) : null);
    }
}
