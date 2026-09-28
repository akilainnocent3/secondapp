package defpackage;

import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import com.sportybet.plugin.realsports.type.RegularMarketRule;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class fqs implements Runnable {
    public final /* synthetic */ djh0 a;
    public final /* synthetic */ RegularMarketRule b;
    public final /* synthetic */ RegularMarketRule c;
    public final /* synthetic */ LivePageActivity d;
    public final /* synthetic */ mfb0 e;

    public /* synthetic */ fqs(djh0 djh0Var, RegularMarketRule regularMarketRule, RegularMarketRule regularMarketRule2, LivePageActivity livePageActivity, mfb0 mfb0Var) {
        this.a = djh0Var;
        this.b = regularMarketRule;
        this.c = regularMarketRule2;
        this.d = livePageActivity;
        this.e = mfb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        djh0 djh0Var = this.a;
        RegularMarketRule regularMarketRule = this.b;
        RegularMarketRule regularMarketRule2 = this.c;
        djh0Var.o(regularMarketRule, regularMarketRule2);
        int i = LivePageActivity.b0;
        LivePageActivity livePageActivity = this.d;
        livePageActivity.G1().i0 = regularMarketRule2;
        djh0Var.p(this.e, regularMarketRule2, livePageActivity.G1().L1(), livePageActivity.G1().E1());
        xss xssVar = livePageActivity.Q;
        if (xssVar != null) {
            xssVar.B(livePageActivity.G1().L1());
        }
        livePageActivity.L1(true);
    }
}
