package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.lobby.views.fragment.GamesLobbyMainFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class kf1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kf1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context;
        NetworkCapabilities networkCapabilities;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                lza lzaVar = (lza) obj;
                lzaVar.getClass();
                if (((Boolean) ((ytw) obj2).getValue()).booleanValue()) {
                    lzaVar.b2();
                }
                return Unit.a;
            case 1:
                GamesLobbyMainFragment gamesLobbyMainFragment = (GamesLobbyMainFragment) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = GamesLobbyMainFragment.a.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    GameDetails gameDetails = hTTPResponse != null ? (GameDetails) hTTPResponse.getData() : null;
                    if (gameDetails != null && (context = gamesLobbyMainFragment.getContext()) != null) {
                        Object systemService = context.getSystemService("connectivity");
                        systemService.getClass();
                        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                        Network activeNetwork = connectivityManager.getActiveNetwork();
                        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                            Context context2 = gamesLobbyMainFragment.getContext();
                            op5 op5Var = op5.a;
                            String string = gamesLobbyMainFragment.getString(R.string.no_internet_cms);
                            string.getClass();
                            String string2 = gamesLobbyMainFragment.getString(R.string.no_internet);
                            string2.getClass();
                            Toast.makeText(context2, op5.c(op5Var, string, string2), 0).show();
                        } else {
                            if (!networkCapabilities.hasTransport(0) && !networkCapabilities.hasTransport(3) && !networkCapabilities.hasTransport(1)) {
                                if (connectivityManager.getActiveNetworkInfo() != null) {
                                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                                    activeNetworkInfo.getClass();
                                    if (activeNetworkInfo.isConnectedOrConnecting()) {
                                    }
                                }
                                Context context3 = gamesLobbyMainFragment.getContext();
                                op5 op5Var2 = op5.a;
                                String string3 = gamesLobbyMainFragment.getString(R.string.no_internet_cms);
                                string3.getClass();
                                String string4 = gamesLobbyMainFragment.getString(R.string.no_internet);
                                string4.getClass();
                                Toast.makeText(context3, op5.c(op5Var2, string3, string4), 0).show();
                            }
                            Bundle bundle = gamesLobbyMainFragment.d;
                            if (bundle != null) {
                                if (bundle.containsKey("source")) {
                                    String string5 = bundle.getString("source");
                                    if (string5 == null) {
                                        string5 = "";
                                    }
                                    String str = string5;
                                    gamesLobbyMainFragment.X = str;
                                    yjj.c(gamesLobbyMainFragment.e, gameDetails, context, null, 0, str, null, 96);
                                    e activity = gamesLobbyMainFragment.getActivity();
                                    if (activity != null) {
                                        activity.finish();
                                    }
                                } else {
                                    yjj.c(gamesLobbyMainFragment.e, gameDetails, context, null, 0, "", null, 96);
                                }
                            }
                        }
                    }
                    Bundle bundle2 = gamesLobbyMainFragment.d;
                    if (bundle2 != null && bundle2.containsKey("game")) {
                        jct jctVar = gamesLobbyMainFragment.f;
                        if (jctVar == null) {
                            Intrinsics.n("viewModelLobby");
                            throw null;
                        }
                        jctVar.A1();
                        gamesLobbyMainFragment.d = null;
                    }
                } else if (i2 == 2) {
                    Bundle bundle3 = gamesLobbyMainFragment.d;
                    if (bundle3 != null && bundle3.containsKey("game")) {
                        jct jctVar2 = gamesLobbyMainFragment.f;
                        if (jctVar2 == null) {
                            Intrinsics.n("viewModelLobby");
                            throw null;
                        }
                        jctVar2.A1();
                    }
                } else if (i2 != 3) {
                    uhc.a();
                    return null;
                }
                return Unit.a;
            default:
                int i3 = PreMatchEventActivity.a2;
                ((PreMatchEventActivity) obj2).n2();
                return Unit.a;
        }
    }
}
