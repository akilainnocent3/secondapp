package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportygames.compose.lobbyv2.models.LobbyConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n8f implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n8f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FragmentManager supportFragmentManager;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                m020 m020Var = (m020) obj;
                ((Function2) obj2).invoke(m020Var, new gly(ovo.h(m020Var, false)));
                m020Var.a();
                return Unit.a;
            case 1:
                suj sujVar = (suj) obj2;
                LobbyConfig lobbyConfig = (LobbyConfig) obj;
                if (lobbyConfig == null) {
                    sujVar.m0();
                } else {
                    c2t c2tVar = sujVar.b;
                    if (c2tVar == null) {
                        Intrinsics.n("viewModel");
                        throw null;
                    }
                    Bundle bundleD = c2tVar.a.d();
                    if (bundleD == null && (bundleD = sujVar.getArguments()) == null) {
                        bundleD = new Bundle();
                    }
                    bundleD.putBoolean("isChristmasThemeEnabled", lobbyConfig.isChristmasThemeEnabled());
                    sujVar.j0(bundleD, lobbyConfig.newLobby(), lobbyConfig.webViewLobby());
                }
                return Unit.a;
            default:
                a1b0 a1b0Var = (a1b0) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                SharedPreferences.Editor editor = a1b0Var.z;
                if (editor != null) {
                    editor.putBoolean("spin2win_one_tap", zBooleanValue);
                }
                SharedPreferences.Editor editor2 = a1b0Var.z;
                if (editor2 != null) {
                    editor2.apply();
                }
                a1b0Var.D0();
                e activity = a1b0Var.getActivity();
                if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                    supportFragmentManager.a0();
                }
                return Unit.a;
        }
    }
}
