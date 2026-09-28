package com.sportygames.compose.lobbyv2.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import com.github.ybq.android.spinkit.SpinKitView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.compose.lobbyv2.webview.LobbyWebView;
import defpackage.b5c;
import defpackage.ikx;
import defpackage.qae0;
import defpackage.rct;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/sportygames/compose/lobbyv2/webview/GamesFallbackLobbyV2;", "Landroid/widget/FrameLayout;", "Lrct;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lb5c;", "getCurrentLobbyWebViewPage", "()Lb5c;", "currentLobbyWebViewPage", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GamesFallbackLobbyV2 extends FrameLayout implements rct {
    public final LobbyWebView a;
    public final SpinKitView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamesFallbackLobbyV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.view_games_fallback_lobby_v2, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.lobby_web_view);
        viewFindViewById.getClass();
        LobbyWebView lobbyWebView = (LobbyWebView) viewFindViewById;
        this.a = lobbyWebView;
        View viewFindViewById2 = findViewById(R.id.loading_spinner);
        viewFindViewById2.getClass();
        SpinKitView spinKitView = (SpinKitView) viewFindViewById2;
        this.b = spinKitView;
        lobbyWebView.setLoadingCallbacks(this);
        spinKitView.setVisibility(8);
    }

    @Override // defpackage.rct
    public final void a() {
        this.b.setVisibility(0);
    }

    @Override // defpackage.rct
    public final void b() {
        this.b.setVisibility(8);
    }

    @Override // defpackage.rct
    public final void c() {
        this.b.setVisibility(8);
    }

    public final void d(int i) {
        final LobbyWebView lobbyWebView = this.a;
        lobbyWebView.getClass();
        lobbyWebView.evaluateJavascript(qae0.c("\n                (function() {\n                    try {\n                        const gameId = \"" + i + "\";\n                        let gameList = JSON.parse(window.localStorage.getItem(\"lobby:user:recent:games\") || '[]');\n                        if (!Array.isArray(gameList)) {\n                            gameList = [];\n                        }\n                        gameList = gameList.filter((id) => gameId !== String(id));\n                        gameList.unshift(gameId);\n                        window.localStorage.setItem(\n                            \"lobby:user:recent:games\",\n                            JSON.stringify(gameList.slice(0, 30))\n                        );\n                    } catch (error) {\n                        window.localStorage.setItem(\"lobby:user:recent:games\", `[\"" + i + "\"]`);\n                    }\n                })();\n            "), new ValueCallback() { // from class: uct
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                List<String> list = LobbyWebView.B;
                lobbyWebView.evaluateJavascript("window.postMessage('soft_reload', '*');", null);
            }
        });
    }

    public final void e() {
        LobbyWebView lobbyWebView = this.a;
        if (lobbyWebView.currentLobbyWebViewPage == b5c.b) {
            lobbyWebView.evaluateJavascript("window.postMessage('toggleNavGoBack', '*');", null);
            ikx ikxVar = lobbyWebView.navigationRouteChanged;
            if (ikxVar != null) {
                ikxVar.b();
            }
            lobbyWebView.currentLobbyWebViewPage = b5c.a;
        }
    }

    public final b5c getCurrentLobbyWebViewPage() {
        return this.a.getCurrentLobbyWebViewPage();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GamesFallbackLobbyV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GamesFallbackLobbyV2(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ GamesFallbackLobbyV2(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
