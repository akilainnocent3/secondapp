package defpackage;

import com.google.android.material.tabs.TabLayout;
import com.sporty.android.core.model.common.DataHolder;
import com.sportybet.android.widget.OUEarlyGoalsSwitch;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zfc implements nm20, OUEarlyGoalsSwitch.b {
    public final /* synthetic */ Object a;

    public /* synthetic */ zfc(Object obj) {
        this.a = obj;
    }

    @Override // com.sportybet.android.widget.OUEarlyGoalsSwitch.b
    public void onStateChanged(boolean z) {
        DataHolder<RegularMarketRule> dataHolderW0;
        dfm dfmVar = (dfm) this.a;
        List<String> list = dfm.v2;
        if (!rvi.b(dfmVar) && (dataHolderW0 = dfmVar.w0()) != null) {
            RegularMarketRule primary = dataHolderW0.getPrimary();
            RegularMarketRule current = dataHolderW0.getCurrent();
            iim iimVar = dfmVar.w1;
            mfb0 mfb0Var = dfmVar.t1;
            String id = mfb0Var != null ? mfb0Var.getId() : null;
            hkf hkfVar = iimVar.R;
            ckf ckfVar = ckf.a;
            RegularMarketRule regularMarketRuleA = hkfVar.a(id, current, z, false);
            if (regularMarketRuleA != null) {
                dfmVar.V0.m(regularMarketRuleA, dfmVar.t1.getId(), false);
                dfmVar.W0.m(regularMarketRuleA, false);
                TabLayout.g gVarY0 = dfmVar.y0();
                if (gVarY0 != null && primary != null) {
                    gVarY0.a = new DataHolder(primary, regularMarketRuleA);
                }
                dfmVar.c2.B1(lkf.a, zjf.b, z ? pkf.a : pkf.b);
            }
        }
        dfmVar.m1.setState(z, false, false);
    }

    @Override // defpackage.nm20
    public boolean test(Object obj) {
        wfc wfcVar = (wfc) this.a;
        obj.getClass();
        return ((Boolean) wfcVar.invoke(obj)).booleanValue();
    }
}
