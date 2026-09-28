package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.sportybet.android.gp.tz.R;
import com.sportygames.lobby.views.fragment.GamesLobbyMainFragment;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class avj implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ avj(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                final GamesLobbyMainFragment gamesLobbyMainFragment = (GamesLobbyMainFragment) fragment;
                cn80 cn80Var = (cn80) gamesLobbyMainFragment.b;
                if (cn80Var != null) {
                    cn80Var.B.a.clearAnimation();
                }
                jvd0 jvd0Var = gamesLobbyMainFragment.Q;
                if (jvd0Var != null) {
                    jvd0Var.cancel((CancellationException) null);
                }
                cn80 cn80Var2 = (cn80) gamesLobbyMainFragment.b;
                if (cn80Var2 != null) {
                    cn80Var2.B.a.setVisibility(8);
                }
                ck60 ck60Var = gamesLobbyMainFragment.O;
                if (ck60Var != null) {
                    ck60Var.b("search_visited", true);
                }
                Function0<Unit> function0 = new Function0() { // from class: evj
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        GamesLobbyMainFragment gamesLobbyMainFragment2 = gamesLobbyMainFragment;
                        if (gamesLobbyMainFragment2.t0()) {
                            gamesLobbyMainFragment2.getChildFragmentManager().Y();
                            hv70 hv70Var = gamesLobbyMainFragment2.N;
                            if (hv70Var != null) {
                                hv70Var.p0();
                            }
                            gamesLobbyMainFragment2.N = null;
                        }
                        return Unit.a;
                    }
                };
                cn80 cn80Var3 = (cn80) gamesLobbyMainFragment.b;
                boolean z = cn80Var3 != null && cn80Var3.H.v.getVisibility() == 8;
                hv70 hv70Var = new hv70();
                hv70Var.f = function0;
                hv70Var.D = z;
                hv70Var.H = gamesLobbyMainFragment;
                gamesLobbyMainFragment.N = hv70Var;
                FragmentManager childFragmentManager = gamesLobbyMainFragment.getChildFragmentManager();
                a aVarA = oke.a(childFragmentManager, childFragmentManager);
                aVarA.e(R.id.search_fragment, hv70Var, "search_fragment", 1);
                aVarA.c("search_fragment");
                aVarA.d();
                cn80 cn80Var4 = (cn80) gamesLobbyMainFragment.b;
                if (cn80Var4 != null) {
                    cn80Var4.y.setVisibility(0);
                }
                GamesLobbyMainFragment.z0("Search", "0", gamesLobbyMainFragment.C);
                break;
            default:
                ((xne0) ((sne0) fragment).w.getValue()).d.a(vne0.a.a);
                break;
        }
    }
}
