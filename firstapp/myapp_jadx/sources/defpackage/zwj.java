package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.e;
import com.sporty.android.book.domain.entity.Category;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.GamesLobbyV2MainFragmentNew$getGameByName$1", f = "GamesLobbyV2MainFragmentNew.kt", l = {1181}, m = "invokeSuspend", v = 1)
public final class zwj extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ywj b;

    public static final class a<T> implements myh {
        public final /* synthetic */ ywj a;

        /* JADX INFO: renamed from: zwj$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1430a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[Status.values().length];
                try {
                    iArr[Status.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Status.FAILED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Status.RUNNING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        public a(ywj ywjVar) {
            this.a = ywjVar;
        }

        /* JADX WARN: Code duplicated, block: B:44:0x0097  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Context context;
            Context context2;
            NetworkCapabilities networkCapabilities;
            LobbyV2ViewModel lobbyV2ViewModel;
            LoadingState loadingState = (LoadingState) obj;
            int i = C1430a.a[loadingState.getStatus().ordinal()];
            ywj ywjVar = this.a;
            if (i == 1) {
                HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                GameDetails gameDetails = hTTPResponse != null ? (GameDetails) hTTPResponse.getData() : null;
                if (gameDetails != null && (context = ywjVar.getContext()) != null) {
                    Object systemService = context.getSystemService("connectivity");
                    systemService.getClass();
                    ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                        context2 = ywjVar.getContext();
                        if (context2 != null) {
                            op5 op5Var = op5.a;
                            String string = context2.getString(R.string.no_internet_cms);
                            Toast.makeText(context2, at6.a(string, context2, R.string.no_internet, op5Var, string), 0).show();
                        }
                    } else {
                        if (!networkCapabilities.hasTransport(0) && !networkCapabilities.hasTransport(3) && !networkCapabilities.hasTransport(1)) {
                            if (connectivityManager.getActiveNetworkInfo() != null) {
                                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                                activeNetworkInfo.getClass();
                                if (activeNetworkInfo.isConnectedOrConnecting()) {
                                }
                            }
                            context2 = ywjVar.getContext();
                            if (context2 != null) {
                                op5 op5Var2 = op5.a;
                                String string2 = context2.getString(R.string.no_internet_cms);
                                Toast.makeText(context2, at6.a(string2, context2, R.string.no_internet, op5Var2, string2), 0).show();
                            }
                        }
                        Bundle bundle = ywjVar.i;
                        if (bundle != null) {
                            String string3 = bundle.getString("key - game sender");
                            String str = (string3 == null || StringsKt.U(string3)) ? null : string3;
                            if (bundle.containsKey("source")) {
                                String string4 = bundle.getString("source");
                                if (string4 == null) {
                                    string4 = "";
                                }
                                String str2 = string4;
                                ywjVar.G = str2;
                                ywjVar.v.b(gameDetails, context, null, 0, str2, ywjVar.I, str);
                                e activity = ywjVar.getActivity();
                                if (activity != null) {
                                    activity.finish();
                                }
                            } else {
                                ywjVar.v.b(gameDetails, context, null, 0, "", ywjVar.I, str);
                            }
                        }
                    }
                }
                Bundle bundle2 = ywjVar.i;
                if (bundle2 != null && bundle2.containsKey("game")) {
                    LobbyV2ViewModel lobbyV2ViewModel2 = (LobbyV2ViewModel) ywjVar.a;
                    if (lobbyV2ViewModel2 != null) {
                        lobbyV2ViewModel2.z1();
                    }
                    Bundle bundle3 = ywjVar.i;
                    if (bundle3 != null && !bundle3.containsKey(Category.CATEGORY_ID)) {
                        ywjVar.i = null;
                        ywjVar.setArguments(null);
                    }
                }
            } else if (i == 2) {
                Bundle bundle4 = ywjVar.i;
                if (bundle4 != null && bundle4.containsKey("game") && (lobbyV2ViewModel = (LobbyV2ViewModel) ywjVar.a) != null) {
                    lobbyV2ViewModel.z1();
                }
            } else if (i != 3) {
                uhc.a();
                return null;
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwj(ywj ywjVar, v1b<? super zwj> v1bVar) {
        super(2, v1bVar);
        this.b = ywjVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new zwj(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((zwj) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        b390 b390Var;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                throw l80.a(obj);
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        ywj ywjVar = this.b;
        LobbyV2ViewModel lobbyV2ViewModel = (LobbyV2ViewModel) ywjVar.a;
        if (lobbyV2ViewModel == null || (b390Var = lobbyV2ViewModel.i) == null) {
            return Unit.a;
        }
        a aVar = new a(ywjVar);
        this.a = 1;
        b390Var.collect(aVar, this);
        return y5bVar;
    }
}
