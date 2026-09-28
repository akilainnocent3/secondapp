package defpackage;

import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import com.sportybet.plugin.realsports.type.RegularMarketRule;

/* JADX INFO: loaded from: classes7.dex */
public final class gqs {
    public final /* synthetic */ LivePageActivity a;
    public final /* synthetic */ djh0 b;

    public gqs(LivePageActivity livePageActivity, djh0 djh0Var) {
        this.a = livePageActivity;
        this.b = djh0Var;
    }

    public final void a() {
        b(jqu.a);
    }

    public final void b(jqu jquVar) {
        int i = LivePageActivity.b0;
        LivePageActivity livePageActivity = this.a;
        livePageActivity.D1(jquVar);
        xss xssVar = livePageActivity.Q;
        if (xssVar != null) {
            xssVar.h();
        }
        djh0 djh0Var = livePageActivity.R;
        if (djh0Var != null) {
            djh0Var.h();
        }
    }

    public final void c(avy avyVar) {
        RegularMarketRule regularMarketRule;
        rhh0 rhh0Var;
        rhh0 rhh0Var2;
        rhh0 rhh0Var3;
        int i = LivePageActivity.b0;
        final LivePageActivity livePageActivity = this.a;
        mfb0 mfb0Var = livePageActivity.G1().B;
        if (mfb0Var == null || (regularMarketRule = livePageActivity.G1().i0) == null) {
            return;
        }
        whh0 whh0VarC = livePageActivity.H1().c(regularMarketRule, mfb0Var.getId(), false);
        djh0 djh0Var = this.b;
        if (whh0VarC != null && (rhh0Var3 = whh0VarC.a) != null) {
            djh0Var.r.put(rhh0Var3, avyVar);
        }
        final RegularMarketRule regularMarketRule2 = livePageActivity.G1().C;
        if (regularMarketRule2 != null) {
            whh0 whh0VarC2 = livePageActivity.H1().c(regularMarketRule2, mfb0Var.getId(), true);
            if (whh0VarC != null && (rhh0Var = whh0VarC.a) != null) {
                if (rhh0Var == (whh0VarC2 != null ? whh0VarC2.a : null)) {
                    xss xssVar = livePageActivity.Q;
                    if (xssVar != null && whh0VarC2 != null && (rhh0Var2 = whh0VarC2.a) != null) {
                        xssVar.C.put(rhh0Var2, avyVar);
                    }
                    final RegularMarketRule regularMarketRuleB = livePageActivity.H1().e(regularMarketRule2, mfb0Var.getId(), true) ? livePageActivity.H1().b(avyVar, regularMarketRule2, mfb0Var.getId(), true) : regularMarketRule2;
                    if (regularMarketRuleB != null) {
                        livePageActivity.z1().e.post(new Runnable() { // from class: tps
                            @Override // java.lang.Runnable
                            public final void run() {
                                LivePageActivity livePageActivity2 = livePageActivity;
                                xss xssVar2 = livePageActivity2.Q;
                                RegularMarketRule regularMarketRule3 = regularMarketRuleB;
                                if (xssVar2 != null) {
                                    xssVar2.F(regularMarketRule2, regularMarketRule3);
                                }
                                livePageActivity2.G1().C = regularMarketRule3;
                                if (livePageActivity2.Q != null) {
                                    xss.n();
                                }
                                xss xssVar3 = livePageActivity2.Q;
                                if (xssVar3 != null) {
                                    xssVar3.C(regularMarketRule3);
                                }
                                livePageActivity2.P1();
                            }
                        });
                    }
                }
            }
        }
        RegularMarketRule regularMarketRuleB2 = livePageActivity.H1().e(regularMarketRule, mfb0Var.getId(), false) ? livePageActivity.H1().b(avyVar, regularMarketRule, mfb0Var.getId(), false) : regularMarketRule;
        if (regularMarketRuleB2 == null) {
            return;
        }
        livePageActivity.z1().e.post(new fqs(djh0Var, regularMarketRule, regularMarketRuleB2, livePageActivity, mfb0Var));
        livePageActivity.N1(avyVar, regularMarketRule, mfb0Var.getId(), false);
    }
}
