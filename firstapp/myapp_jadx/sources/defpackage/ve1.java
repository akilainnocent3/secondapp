package defpackage;

import android.webkit.WebView;
import com.sporty.android.platform.features.loyalty.LoyaltyActivity;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.lobby.views.fragment.GamesLobbyMainFragment;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ve1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ve1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.Object, ukf0] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ?? r6 = (ukf0) obj;
                r6.getClass();
                ((dq40) obj2).a = r6;
                break;
            case 1:
                GamesLobbyMainFragment gamesLobbyMainFragment = (GamesLobbyMainFragment) obj2;
                LoadingState loadingState = (LoadingState) obj;
                if (loadingState.getStatus() == Status.SUCCESS) {
                    op5 op5Var = op5.a;
                    List<? extends File> list = (List) loadingState.getData();
                    op5Var.getClass();
                    op5.b = list;
                    gamesLobbyMainFragment.U = (List) loadingState.getData();
                    gamesLobbyMainFragment.u0();
                    cn80 cn80Var = (cn80) gamesLobbyMainFragment.b;
                    op5.r(op5Var, b.f(cn80Var != null ? cn80Var.H.i : null, cn80Var != null ? cn80Var.H.w : null, cn80Var != null ? cn80Var.B.b : null), null, 6);
                } else if (loadingState.getStatus() == Status.FAILED) {
                    gamesLobbyMainFragment.u0();
                }
                break;
            default:
                int i2 = LoyaltyActivity.f;
                ((LoyaltyActivity) obj2).getWebViewWrapperService().uninstallJsBridge((WebView) obj);
                break;
        }
        return Unit.a;
    }
}
