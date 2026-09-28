package defpackage;

import android.view.View;
import android.widget.SpinnerAdapter;
import com.cruxlab.sectionedrecyclerview.lib.a;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.OUEarlyGoalsSwitch;
import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import com.sportybet.plugin.realsports.type.RegularMarketRule;

/* JADX INFO: loaded from: classes7.dex */
public final class zih0 extends a.AbstractC0185a {
    public final sih0 b;
    public final hkf c;
    public final fjh0 d;
    public final rih0 e;
    public final nps f;
    public final gqs g;
    public final mpe0 h;
    public final mpe0 i;

    public zih0(sih0 sih0Var, hkf hkfVar, fjh0 fjh0Var, jqs jqsVar, nps npsVar, gqs gqsVar) {
        super(sih0Var.a);
        this.b = sih0Var;
        this.c = hkfVar;
        this.d = fjh0Var;
        this.e = jqsVar;
        this.f = npsVar;
        this.g = gqsVar;
        this.h = hwr.b(new ij(this, 2));
        mpe0 mpe0VarB = hwr.b(new jj(this, 2));
        this.i = mpe0VarB;
        sih0Var.e.v.setAdapter((SpinnerAdapter) mpe0VarB.getValue());
        sih0Var.i.setOnClickListener(new View.OnClickListener() { // from class: uih0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rih0 rih0Var = this.a.e;
                if (rih0Var != null) {
                    rih0Var.a();
                }
            }
        });
        int i = 1;
        sih0Var.v.setOnClickListener(new lj(this, 1));
        sih0Var.f.setOnClickListener(new mj(this, i));
        sih0Var.d.a(new xih0(this));
        sih0Var.y.setOnStateChangedListener(new yih0(this));
        sih0Var.z.setOnStateChangedListener(new OUEarlyGoalsSwitch.b() { // from class: vih0
            @Override // com.sportybet.android.widget.OUEarlyGoalsSwitch.b
            public final void onStateChanged(boolean z) {
                RegularMarketRule regularMarketRule;
                gqs gqsVar2 = this.a.g;
                if (gqsVar2 != null) {
                    djh0 djh0Var = gqsVar2.b;
                    LivePageActivity livePageActivity = gqsVar2.a;
                    int i2 = LivePageActivity.b0;
                    mfb0 mfb0Var = livePageActivity.G1().B;
                    if (mfb0Var == null || (regularMarketRule = livePageActivity.G1().i0) == null) {
                        return;
                    }
                    djh0Var.s = z;
                    xss xssVar = livePageActivity.Q;
                    if (xssVar != null) {
                        aos aosVar = xssVar.G;
                        OUEarlyGoalsSwitch oUEarlyGoalsSwitch = aosVar != null ? aosVar.y : null;
                        if (oUEarlyGoalsSwitch != null) {
                            oUEarlyGoalsSwitch.setState(z, false, false);
                        }
                    }
                    xss xssVar2 = livePageActivity.Q;
                    if (xssVar2 != null) {
                        xssVar2.h();
                    }
                    hkf hkfVarF1 = livePageActivity.F1();
                    ckf ckfVar = ckf.a;
                    RegularMarketRule regularMarketRuleA = hkfVarF1.a(mfb0Var.getId(), regularMarketRule, z, false);
                    if (regularMarketRuleA == null) {
                        return;
                    }
                    livePageActivity.z1().e.post(new fqs(djh0Var, regularMarketRule, regularMarketRuleA, livePageActivity, mfb0Var));
                    ((ijf) livePageActivity.M.getValue()).B1(lkf.b, zjf.b, z ? pkf.a : pkf.b);
                }
            }
        });
        BubbleView bubbleView = sih0Var.c;
        bubbleView.setOnClickedClose(new y310(this, i));
        gby.a(bubbleView.getDescriptionView(), new z310(this, i));
    }
}
