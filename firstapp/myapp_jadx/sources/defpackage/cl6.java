package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.e;
import com.sportybet.android.cashoutphase3.b;
import com.sportybet.feature.gameslobby.model.GamesLobbyResult;
import com.sportybet.plugin.realsports.data.Bet;
import com.sportybet.plugin.realsports.data.BetSelection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cl6 extends BroadcastReceiver {
    public final /* synthetic */ b a;

    public cl6(b bVar) {
        this.a = bVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        GamesLobbyResult gamesLobbyResult;
        Bet bet;
        List<BetSelection> list;
        context.getClass();
        intent.getClass();
        if (!TextUtils.equals(intent.getStringExtra("eventName"), "gamesLobbyResult") || (gamesLobbyResult = (GamesLobbyResult) intent.getParcelableExtra("data")) == null) {
            return;
        }
        b bVar = this.a;
        svj svjVar = bVar.Q;
        String str = null;
        if (svjVar == null) {
            Intrinsics.n("gamesLobbyManager");
            throw null;
        }
        e eVarRequireActivity = bVar.requireActivity();
        eVarRequireActivity.getClass();
        xh6 xh6Var = bVar.c0;
        if (xh6Var == null) {
            Intrinsics.n("adapter");
            throw null;
        }
        pl6 pl6Var = xh6Var.N;
        if (pl6Var != null && ((bet = pl6Var.a) == null || (list = bet.selections) == null || (str = list.get(pl6Var.d).matchStatus) == null)) {
            str = "";
        }
        svjVar.a(gamesLobbyResult, eVarRequireActivity, str != null ? str : "", oqv.OPEN_BETS, new zj6(bVar));
    }
}
