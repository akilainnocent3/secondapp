package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.sportygames.compose.lobbyv2.models.LobbyConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class puj implements Function1 {
    public final /* synthetic */ suj a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        final Bundle bundle = (Bundle) obj;
        if (bundle != null) {
            final suj sujVar = this.a;
            c2t c2tVar = sujVar.b;
            if (c2tVar == null) {
                Intrinsics.n("viewModel");
                throw null;
            }
            final LobbyConfig lobbyConfig = c2tVar.b;
            if (lobbyConfig != null) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: ruj
                    @Override // java.lang.Runnable
                    public final void run() {
                        suj sujVar2 = sujVar;
                        if (sujVar2.i != null) {
                            LobbyConfig lobbyConfig2 = lobbyConfig;
                            boolean zNewLobby = lobbyConfig2.newLobby();
                            new Handler(Looper.getMainLooper()).post(new quj(sujVar2, lobbyConfig2.webViewLobby(), zNewLobby, bundle));
                            c2t c2tVar2 = sujVar2.b;
                            if (c2tVar2 != null) {
                                c2tVar2.a.m(null);
                            } else {
                                Intrinsics.n("viewModel");
                                throw null;
                            }
                        }
                    }
                }, 100L);
            }
        }
        return Unit.a;
    }
}
