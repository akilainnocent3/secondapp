package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.net.Uri;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.feature.gameslobby.model.GamesLobbyResult;
import kotlin.Pair;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class uvj implements svj {
    public final uqm a;
    public final fbh0 b;
    public final rdd0 c;
    public final str<String> d;
    public final psm e;
    public final ysm f;
    public final uy0 g;

    public uvj(uqm uqmVar, fbh0 fbh0Var, rdd0 rdd0Var, str<String> strVar, psm psmVar, ysm ysmVar, uy0 uy0Var) {
        this.a = uqmVar;
        this.b = fbh0Var;
        this.c = rdd0Var;
        this.d = strVar;
        this.e = psmVar;
        this.f = ysmVar;
        this.g = uy0Var;
    }

    @Override // defpackage.svj
    public final void a(GamesLobbyResult gamesLobbyResult, Activity activity, String str, oqv oqvVar, final kuj kujVar) {
        activity.getClass();
        if (gamesLobbyResult instanceof GamesLobbyResult.Exit) {
            kujVar.b();
            return;
        }
        if ((gamesLobbyResult instanceof GamesLobbyResult.Login) || (gamesLobbyResult instanceof GamesLobbyResult.RefreshToken)) {
            this.a.demandAccount(activity, new tit() { // from class: tvj
                @Override // defpackage.tit
                public final void w(Account account, boolean z) {
                    if (account != null) {
                        kujVar.a();
                    }
                }
            });
            return;
        }
        boolean z = gamesLobbyResult instanceof GamesLobbyResult.AddMoney;
        fbh0 fbh0Var = this.b;
        if (z) {
            fbh0Var.e(o7d.a(wae.DEPOSIT));
            return;
        }
        if (gamesLobbyResult instanceof GamesLobbyResult.Transaction) {
            String str2 = ((GamesLobbyResult.Transaction) gamesLobbyResult).a;
            if (str2 == null || StringsKt.U(str2)) {
                fbh0Var.e(o7d.a(wae.ME_TRANSACTIONS));
                return;
            } else {
                fbh0Var.b(o7d.b(wae.TRANS_SEARCH, new Pair[]{new Pair(AnalyticsParam.EVENT_PARAM_ID, str2)}));
                return;
            }
        }
        if (gamesLobbyResult instanceof GamesLobbyResult.RedirectToGames) {
            fbh0Var.e(o7d.a(wae.GAMES_LOBBY));
            return;
        }
        if (gamesLobbyResult instanceof GamesLobbyResult.BetPlaced) {
            GamesLobbyResult.BetPlaced betPlaced = (GamesLobbyResult.BetPlaced) gamesLobbyResult;
            this.c.a(new nqv.d(str, oqvVar, betPlaced.b, betPlaced.a), k00.d, k00.c);
            return;
        }
        if (gamesLobbyResult instanceof GamesLobbyResult.WalletUpdated) {
            this.g.g();
        } else {
            uhc.a();
        }
    }

    @Override // defpackage.svj
    public final String b(boolean z) {
        String str = this.d.get();
        uqm uqmVar = this.a;
        String string = ((Object) str) + "&locale=" + uqmVar.getLanguageCode();
        if (z) {
            string = Uri.parse(string).buildUpon().appendQueryParameter("theme", "dark").build().toString();
            string.getClass();
        }
        h0j0.c(string, "platform", "ANDROID");
        h0j0.c(string, "sb_country", this.e.getCountryCode().toString());
        String userId = uqmVar.getUserId();
        if (userId != null) {
            h0j0.c(string, "userId", userId);
        }
        String lastAccessToken = uqmVar.getLastAccessToken();
        if (lastAccessToken != null) {
            h0j0.c(string, "accessToken", lastAccessToken);
        }
        s9e0 s9e0Var = s9e0.a;
        k9e0 k9e0Var = k9e0.a;
        s9e0Var.getClass();
        k9e0Var.getClass();
        String strC = this.f.c((3 & 1) != 0 ? "not_started" : "");
        if (!StringsKt.U(strC)) {
            h0j0.c(string, "deviceId", strC);
        }
        return string;
    }
}
