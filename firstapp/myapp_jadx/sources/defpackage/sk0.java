package defpackage;

import android.os.Bundle;
import android.widget.TextView;
import androidx.compose.ui.layout.y;
import com.sportybet.android.virtual.presentation.activity.VirtualLobbyActivity;
import com.sportygames.compose.lobbyv2.models.LobbyConfig;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sk0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sk0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                y.a aVar = (y.a) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    y.a.A(aVar, (y) arrayList.get(i2), 0, 0);
                }
                return Unit.a;
            case 1:
                m0t m0tVar = (m0t) obj2;
                LobbyConfig lobbyConfig = (LobbyConfig) obj;
                if (lobbyConfig == null) {
                    m0tVar.n0();
                } else {
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
            default:
                VirtualLobbyActivity virtualLobbyActivity = (VirtualLobbyActivity) obj2;
                int i3 = VirtualLobbyActivity.E;
                int i4 = ((wyy) obj).a;
                TextView textView = (TextView) virtualLobbyActivity.v.get("Open Bets");
                if (virtualLobbyActivity.getAccountHelper().getAccount() != null && textView != null) {
                    textView.setVisibility(i4 <= 0 ? 8 : 0);
                    textView.setText(i4 >= 100 ? "99+" : String.valueOf(i4));
                } else if (textView != null) {
                    textView.setVisibility(8);
                }
                tzf0.j(virtualLobbyActivity, i4);
                return Unit.a;
        }
    }
}
