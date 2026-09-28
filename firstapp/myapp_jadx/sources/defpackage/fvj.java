package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.sportygames.lobby.views.fragment.GamesLobbyMainFragment;
import com.sportygames.pingpong.components.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class fvj implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ fvj(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NetworkCapabilities networkCapabilities;
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                GamesLobbyMainFragment gamesLobbyMainFragment = (GamesLobbyMainFragment) fragment;
                Context context = gamesLobbyMainFragment.getContext();
                if (context != null) {
                    Object systemService = context.getSystemService("connectivity");
                    systemService.getClass();
                    ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                        return;
                    }
                    if (!networkCapabilities.hasTransport(0) && !networkCapabilities.hasTransport(3) && !networkCapabilities.hasTransport(1)) {
                        if (connectivityManager.getActiveNetworkInfo() == null) {
                            return;
                        }
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        activeNetworkInfo.getClass();
                        if (!activeNetworkInfo.isConnectedOrConnecting()) {
                            return;
                        }
                    }
                    cn80 cn80Var = (cn80) gamesLobbyMainFragment.b;
                    if (cn80Var != null) {
                        cn80Var.F.setVisibility(8);
                    }
                    gamesLobbyMainFragment.G0();
                    jct jctVar = gamesLobbyMainFragment.f;
                    if (jctVar != null) {
                        ej5.c(o8i0.d(jctVar), null, null, new lct(jctVar, null, null), 3);
                        return;
                    } else {
                        Intrinsics.n("viewModelLobby");
                        throw null;
                    }
                }
                return;
            default:
                a aVar = (a) fragment;
                aVar.e.invoke(Boolean.FALSE);
                String str = aVar.b;
                d820 d820Var = aVar.i;
                if (d820Var != null) {
                    wz.a("popup_action", "Ping Pong", str, d820Var.c.getText().toString());
                    return;
                } else {
                    Intrinsics.n("binding");
                    throw null;
                }
        }
    }
}
