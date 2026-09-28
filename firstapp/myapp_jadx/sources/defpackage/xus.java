package defpackage;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.core.model.MyLog;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.live.data.LiveBoostMatchItem;
import com.sportybet.plugin.realsports.live.livetournament.LiveTournamentActivity;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xus implements Function1 {
    public final /* synthetic */ LiveTournamentActivity a;
    public final /* synthetic */ nqs b;

    public /* synthetic */ xus(LiveTournamentActivity liveTournamentActivity, nqs nqsVar) {
        this.a = liveTournamentActivity;
        this.b = nqsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        xss xssVar;
        nqs nqsVar = this.b;
        SwipeRefreshLayout swipeRefreshLayout = nqsVar.w;
        lk50 lk50Var = (lk50) obj;
        int i = LiveTournamentActivity.I;
        lk50Var.getClass();
        boolean z = lk50Var instanceof lk50.c;
        LiveTournamentActivity liveTournamentActivity = this.a;
        if (z) {
            bxg0 bxg0Var = (bxg0) ((lk50.c) lk50Var).a;
            mfb0 mfb0Var = liveTournamentActivity.D1().B;
            if (mfb0Var == null) {
                return Unit.a;
            }
            RegularMarketRule regularMarketRule = liveTournamentActivity.D1().C;
            if (regularMarketRule == null) {
                evs evsVarD1 = liveTournamentActivity.D1();
                String stringExtra = liveTournamentActivity.getIntent().getStringExtra("key_sport_id");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                mfb0 mfb0VarE = lfb0.d().e(stringExtra);
                RegularMarketRule regularMarketRuleJ = mfb0VarE != null ? mfb0VarE.j() : null;
                if (regularMarketRuleJ != null) {
                    evsVarD1.C = regularMarketRuleJ;
                    regularMarketRule = regularMarketRuleJ;
                } else {
                    regularMarketRule = null;
                }
                if (regularMarketRule == null) {
                    return Unit.a;
                }
            }
            xss xssVar2 = liveTournamentActivity.F;
            if (xssVar2 != null) {
                xssVar2.E = mfb0Var;
                xss.D(xssVar2, regularMarketRule, null, false, 2);
                List<? extends Tournament> list = (List) bxg0Var.a;
                List<LiveBoostMatchItem> list2 = (List) bxg0Var.b;
                boolean zBooleanValue = ((Boolean) bxg0Var.c).booleanValue();
                if (list.isEmpty()) {
                    xss xssVar3 = liveTournamentActivity.F;
                    if (xssVar3 != null) {
                        xssVar3.y();
                    }
                    liveTournamentActivity.D1().B1(true);
                    swipeRefreshLayout.setRefreshing(false);
                    return Unit.a;
                }
                xssVar2.E(regularMarketRule, list, list2, zBooleanValue);
            }
            jvd0 jvd0Var = liveTournamentActivity.G;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            liveTournamentActivity.G = ebs.a(liveTournamentActivity.getLifecycle()).b(new avs(liveTournamentActivity, null));
            swipeRefreshLayout.setRefreshing(false);
            nqsVar.e.o0(0);
        } else if (lk50Var instanceof lk50.a) {
            swipeRefreshLayout.setRefreshing(false);
            xss xssVar4 = liveTournamentActivity.F;
            if (xssVar4 != null) {
                xssVar4.z();
            }
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_LIVE_PAGE);
            aVar.b(((lk50.a) lk50Var).a);
        } else {
            if (!(lk50Var instanceof lk50.b)) {
                uhc.a();
                return null;
            }
            if (!swipeRefreshLayout.c && (xssVar = liveTournamentActivity.F) != null) {
                xssVar.A();
            }
        }
        return Unit.a;
    }
}
