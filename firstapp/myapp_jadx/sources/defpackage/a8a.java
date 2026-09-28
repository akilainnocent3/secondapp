package defpackage;

import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.compose.lobbyv2.models.UIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a8a implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xjj b;

    public /* synthetic */ a8a(xjj xjjVar, int i) {
        this.a = i;
        this.b = xjjVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        xjj xjjVar = this.b;
        switch (i) {
            case 0:
                ssw<UIState<HTTPResponse<String>>> sswVar = ((db6) xjjVar).e;
                UIState.INSTANCE.getClass();
                sswVar.j(UIState.Companion.b());
                break;
            default:
                l560 l560Var = (l560) xjjVar;
                if (l560Var.N0()) {
                    l560Var.o0 = l560.a.c;
                    l560Var.F0();
                    SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                } else {
                    l560Var.R0(false);
                }
                break;
        }
        return Unit.a;
    }
}
