package defpackage;

import androidx.fragment.app.Fragment;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qqa implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ qqa(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                rqa rqaVar = (rqa) fragment;
                Function0<Unit> function0 = rqaVar.i;
                if (function0 != null) {
                    function0.invoke();
                }
                rqaVar.m0();
                break;
            default:
                SportyGamesManager.getInstance().gotoSportyBet(xae.c, null);
                GameDetails gameDetails = ((a1b0) fragment).i;
                wz.a("AddMoneyClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                break;
        }
        return Unit.a;
    }
}
