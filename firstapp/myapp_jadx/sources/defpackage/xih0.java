package defpackage;

import com.google.android.material.tabs.TabLayout;
import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import com.sportybet.plugin.realsports.type.RegularMarketRule;

/* JADX INFO: loaded from: classes7.dex */
public final class xih0 implements TabLayout.d {
    public final /* synthetic */ zih0 a;

    public xih0(zih0 zih0Var) {
        this.a = zih0Var;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void A0(TabLayout.g gVar) {
        gVar.getClass();
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void G(TabLayout.g gVar) {
        nps npsVar;
        gVar.getClass();
        zih0 zih0Var = this.a;
        sih0 sih0Var = zih0Var.b;
        Object tag = sih0Var.d.getTag();
        if (!(tag instanceof Integer)) {
            tag = null;
        }
        Integer num = (Integer) tag;
        int iIntValue = num != null ? num.intValue() : 0;
        int i = gVar.e;
        if (iIntValue == i) {
            return;
        }
        sih0Var.d.setTag(Integer.valueOf(i));
        Object obj = gVar.a;
        final RegularMarketRule regularMarketRuleA = (RegularMarketRule) (obj instanceof RegularMarketRule ? obj : null);
        if (regularMarketRuleA == null || (npsVar = zih0Var.f) == null) {
            return;
        }
        final LivePageActivity livePageActivity = npsVar.a;
        final djh0 djh0Var = npsVar.b;
        int i2 = LivePageActivity.b0;
        final mfb0 mfb0Var = livePageActivity.G1().B;
        if (mfb0Var == null) {
            return;
        }
        boolean zE = livePageActivity.H1().e(regularMarketRuleA, mfb0Var.getId(), false);
        boolean zB = livePageActivity.F1().a.b(ckf.c, mfb0Var.getId(), regularMarketRuleA.a, false);
        if (zE) {
            whh0 whh0VarC = livePageActivity.H1().c(regularMarketRuleA, mfb0Var.getId(), false);
            xhh0 xhh0VarH1 = livePageActivity.H1();
            String id = mfb0Var.getId();
            djh0 djh0Var2 = livePageActivity.R;
            regularMarketRuleA = xhh0VarH1.b(djh0Var2 != null ? djh0Var2.n(whh0VarC) : avy.c, regularMarketRuleA, id, false);
        } else if (zB) {
            regularMarketRuleA = livePageActivity.F1().a(mfb0Var.getId(), regularMarketRuleA, djh0Var.s, false);
        }
        if (regularMarketRuleA == null) {
            return;
        }
        livePageActivity.z1().e.post(new Runnable() { // from class: sps
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = LivePageActivity.b0;
                LivePageActivity livePageActivity2 = livePageActivity;
                uqs uqsVarG1 = livePageActivity2.G1();
                RegularMarketRule regularMarketRule = regularMarketRuleA;
                uqsVarG1.i0 = regularMarketRule;
                djh0Var.p(mfb0Var, regularMarketRule, livePageActivity2.G1().L1(), livePageActivity2.G1().E1());
                xss xssVar = livePageActivity2.Q;
                if (xssVar != null) {
                    xssVar.B(livePageActivity2.G1().L1());
                }
                livePageActivity2.L1(true);
            }
        });
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void g0(TabLayout.g gVar) {
        gVar.getClass();
    }
}
