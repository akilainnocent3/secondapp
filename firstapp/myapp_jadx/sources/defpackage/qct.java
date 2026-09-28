package defpackage;

import android.webkit.JavascriptInterface;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.compose.lobbyv2.models.GameLogData;
import com.sportygames.compose.lobbyv2.models.LobbyV2GameDetailsModel;
import com.sportygames.compose.lobbyv2.models.LobbyV2HomeItemModel;
import com.sportygames.compose.lobbyv2.models.LobbyV2ProviderDetailsModel;
import com.sportygames.compose.lobbyv2.webview.LobbyWebView;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class qct {
    public final String a;
    public final LobbyWebView b;
    public final sct c;
    public final LobbyWebView d;
    public final eal e;

    public qct(String str, LobbyWebView lobbyWebView, sct sctVar, LobbyWebView lobbyWebView2) {
        str.getClass();
        this.a = str;
        this.b = lobbyWebView;
        this.c = sctVar;
        this.d = lobbyWebView2;
        this.e = new eal();
    }

    @JavascriptInterface
    public final void postMessage(final String str, final String str2) {
        if (str != null && str.equals(this.a)) {
            this.b.post(new Runnable() { // from class: pct
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // java.lang.Runnable
                public final void run() {
                    qct qctVar = this.a;
                    LobbyWebView lobbyWebView = qctVar.c.a;
                    List<String> list = LobbyWebView.B;
                    if (d0j0.b(lobbyWebView.getUrl(), SportyGamesManager.getInstance().getDomain(lobbyWebView.getContext()))) {
                        ConcurrentHashMap<Integer, f0j0> concurrentHashMap = jzi0.a;
                        if (jzi0.a(qctVar.b, qctVar.a)) {
                            eal ealVar = qctVar.e;
                            final LobbyWebView lobbyWebView2 = qctVar.d;
                            String str3 = str;
                            int iHashCode = str3.hashCode();
                            String str4 = str2;
                            LobbyV2HomeItemModel lobbyV2HomeItemModel = null;
                            lobbyV2ProviderDetailsModel = null;
                            final LobbyV2ProviderDetailsModel lobbyV2ProviderDetailsModel = null;
                            lobbyV2GameDetailsModel = null;
                            final LobbyV2GameDetailsModel lobbyV2GameDetailsModel = null;
                            lobbyV2HomeItemModel = null;
                            switch (iHashCode) {
                                case -1992088920:
                                    if (str3.equals("show_all_click")) {
                                        if (str4 != null) {
                                            try {
                                                lobbyV2HomeItemModel = (LobbyV2HomeItemModel) ealVar.e(str4, LobbyV2HomeItemModel.class);
                                            } catch (Exception e) {
                                                e.printStackTrace();
                                            }
                                        }
                                        if (lobbyV2HomeItemModel != null) {
                                            lobbyWebView2.currentLobbyWebViewPage = b5c.b;
                                            lobbyWebView2.post(new tb6(1, lobbyWebView2, lobbyV2HomeItemModel));
                                        }
                                        break;
                                    }
                                    break;
                                case -539377023:
                                    if (str3.equals("search_open")) {
                                        lobbyWebView2.post(new Runnable() { // from class: wct
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                Function0<Unit> function0 = lobbyWebView2.onSearchOpened;
                                                if (function0 != null) {
                                                    function0.invoke();
                                                }
                                            }
                                        });
                                        break;
                                    }
                                    break;
                                case 447989921:
                                    if (str3.equals("search_close")) {
                                        lobbyWebView2.post(new Runnable() { // from class: yct
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                Function0<Unit> function0 = lobbyWebView2.onSearchClosed;
                                                if (function0 != null) {
                                                    function0.invoke();
                                                }
                                            }
                                        });
                                        break;
                                    }
                                    break;
                                case 955397883:
                                    if (str3.equals("game_click")) {
                                        if (str4 != null) {
                                            try {
                                                lobbyV2GameDetailsModel = (LobbyV2GameDetailsModel) ealVar.e(str4, LobbyV2GameDetailsModel.class);
                                            } catch (Exception e2) {
                                                e2.printStackTrace();
                                            }
                                        }
                                        if (lobbyV2GameDetailsModel != null) {
                                            lobbyWebView2.post(new Runnable() { // from class: xct
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    gaj<? super LobbyV2GameDetailsModel, ? super gnj, ? super GameLogData, Unit> gajVar = lobbyWebView2.openGameCallback;
                                                    if (gajVar != null) {
                                                        gajVar.invoke(lobbyV2GameDetailsModel, gnj.c, null);
                                                    }
                                                }
                                            });
                                        }
                                        break;
                                    }
                                    break;
                                case 1305228730:
                                    if (str3.equals("provider_click")) {
                                        if (str4 != null) {
                                            try {
                                                lobbyV2ProviderDetailsModel = (LobbyV2ProviderDetailsModel) ealVar.e(str4, LobbyV2ProviderDetailsModel.class);
                                            } catch (Exception e3) {
                                                e3.printStackTrace();
                                            }
                                        }
                                        if (lobbyV2ProviderDetailsModel != null) {
                                            lobbyWebView2.currentLobbyWebViewPage = b5c.b;
                                            lobbyWebView2.post(new Runnable() { // from class: vct
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    ikx ikxVar = lobbyWebView2.navigationRouteChanged;
                                                    if (ikxVar != null) {
                                                        LobbyV2ProviderDetailsModel lobbyV2ProviderDetailsModel2 = lobbyV2ProviderDetailsModel;
                                                        ikxVar.a(lobbyV2ProviderDetailsModel2.getId(), lobbyV2ProviderDetailsModel2.getName(), "game_providers");
                                                    }
                                                }
                                            });
                                        }
                                        break;
                                    }
                                    break;
                                case 1899409159:
                                    if (str3.equals("category_click") && str4 != null) {
                                        try {
                                        } catch (Exception e4) {
                                            e4.printStackTrace();
                                            return;
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                }
            });
        }
    }
}
