package defpackage;

import android.os.Bundle;
import com.sportygames.compose.lobbyv2.models.LobbyConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xgo implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xgo(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ogo ogoVar = (ogo) obj;
                ogoVar.getClass();
                ((Function1) obj3).invoke(ogoVar);
                ((Function0) obj2).invoke();
                return Unit.a;
            default:
                m0t m0tVar = (m0t) obj3;
                String str = (String) obj2;
                LobbyConfig lobbyConfig = (LobbyConfig) obj;
                if (lobbyConfig == null) {
                    m0tVar.n0();
                } else if (!Intrinsics.g(lobbyConfig.getLobbyVariant(), str)) {
                    d2t d2tVar = m0tVar.v;
                    if (d2tVar == null) {
                        Intrinsics.n("viewModel");
                        throw null;
                    }
                    Bundle bundleD = d2tVar.b.d();
                    if (bundleD == null) {
                        bundleD = new Bundle();
                    }
                    bundleD.putBoolean("isChristmasThemeEnabled", lobbyConfig.isChristmasThemeEnabled());
                    m0tVar.m0(bundleD, lobbyConfig.newLobby(), lobbyConfig.webViewLobby());
                }
                return Unit.a;
        }
    }
}
