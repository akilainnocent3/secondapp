package defpackage;

import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import com.sportybet.plugin.realsports.type.RegularMarketRule;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class dqs implements Runnable {
    public final /* synthetic */ xss a;
    public final /* synthetic */ RegularMarketRule b;
    public final /* synthetic */ RegularMarketRule c;
    public final /* synthetic */ LivePageActivity d;

    public /* synthetic */ dqs(xss xssVar, RegularMarketRule regularMarketRule, RegularMarketRule regularMarketRule2, LivePageActivity livePageActivity) {
        this.a = xssVar;
        this.b = regularMarketRule;
        this.c = regularMarketRule2;
        this.d = livePageActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xss xssVar = this.a;
        RegularMarketRule regularMarketRule = this.b;
        RegularMarketRule regularMarketRule2 = this.c;
        xssVar.F(regularMarketRule, regularMarketRule2);
        int i = LivePageActivity.b0;
        LivePageActivity livePageActivity = this.d;
        livePageActivity.G1().C = regularMarketRule2;
        xss.n();
        xssVar.C(regularMarketRule2);
        livePageActivity.P1();
    }
}
