package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigDeserializeOption;
import com.sporty.android.core.model.config.bo.BOConfigParamDto;
import com.sporty.android.core.model.config.bo.enums.BOConfigAppId;
import com.sporty.android.core.model.config.bo.enums.BOConfigNamespace;
import com.sportybet.android.globalpay.quickinput.model.QuickInputConfigMap;

/* JADX INFO: loaded from: classes4.dex */
public final class hck {
    public static final BOConfigParamDto c = new BOConfigParamDto(BOConfigAppId.PATRON, BOConfigNamespace.APPLICATION, "deposit.quickInputs", new BOConfigDeserializeOption.WithKClass(jq40.a(QuickInputConfigMap.class)));
    public final lq1 a;
    public final psm b;

    public hck(lq1 lq1Var, psm psmVar) {
        lq1Var.getClass();
        psmVar.getClass();
        this.a = lq1Var;
        this.b = psmVar;
    }
}
