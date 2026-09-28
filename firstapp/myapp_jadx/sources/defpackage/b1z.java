package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;

/* JADX INFO: loaded from: classes5.dex */
public interface b1z {

    public enum a {
        NetworkError("NETWORK_ERROR"),
        BizCodeError("BIZ_CODE_ERROR"),
        ClientError("CLIENT_ERROR");

        public final String a;

        a(String str) {
            this.a = str;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public enum b {
        NavBar(AnalyticsParam.DATA_NAV_BAR),
        /* JADX INFO: Fake field, exist only in values array */
        Url("url"),
        Betslip("betslip"),
        LiveEventPage(AnalyticsParam.DATA_LIVE_EVENT_PAGE),
        QuickBetQuickCheck(AnalyticsParam.DATA_QUICK_BET_QUICK_CHECK),
        /* JADX INFO: Fake field, exist only in values array */
        BetHistory("bet_history"),
        NoDefined("no_defined");

        public final String a;

        b(String str) {
            this.a = str;
        }
    }

    void i();

    void j();

    void k();

    void l(boolean z, a aVar, String str);

    void m();

    void n(b bVar);

    void o();

    void p();

    void q();

    void r(Integer num);

    void s(e1z e1zVar);

    void t(yyy yyyVar);
}
