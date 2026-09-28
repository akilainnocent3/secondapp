package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.lobby.remote.models.GameDetails;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wnf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wnf(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ytw) obj).setValue(Boolean.FALSE);
                return Unit.a;
            case 1:
                LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
                return iwh0.a((PreMatchSportActivity) obj, R.drawable.spr_ic_arrow_drop_down_black_24dp, -1);
            default:
                GameDetails gameDetails = ((kab0) obj).b;
                wz.a("AddMoneyClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                SportyGamesManager.getInstance().gotoSportyBet(xae.c, null);
                return Unit.a;
        }
    }
}
