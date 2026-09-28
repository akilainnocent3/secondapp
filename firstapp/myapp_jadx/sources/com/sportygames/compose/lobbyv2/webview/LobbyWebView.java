package com.sportygames.compose.lobbyv2.webview;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.AttributeSet;
import android.webkit.CookieManager;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.compose.lobbyv2.models.GameLogData;
import com.sportygames.compose.lobbyv2.models.LobbyV2GameDetailsModel;
import defpackage.a1s;
import defpackage.b5c;
import defpackage.bb;
import defpackage.d0j0;
import defpackage.dq7;
import defpackage.e0j0;
import defpackage.eal;
import defpackage.f0j0;
import defpackage.fae;
import defpackage.gaj;
import defpackage.gnj;
import defpackage.gxj;
import defpackage.hwr;
import defpackage.hxj;
import defpackage.ikx;
import defpackage.ixj;
import defpackage.jq40;
import defpackage.krp;
import defpackage.l48;
import defpackage.m2g;
import defpackage.m8;
import defpackage.nzf0;
import defpackage.o2g;
import defpackage.oxj;
import defpackage.prp;
import defpackage.qae0;
import defpackage.qct;
import defpackage.qn70;
import defpackage.rct;
import defpackage.rrp;
import defpackage.sct;
import defpackage.sjj;
import defpackage.tct;
import defpackage.ttr;
import defpackage.u3w;
import defpackage.wzi0;
import defpackage.xjj;
import defpackage.xnh0;
import defpackage.xzi0;
import defpackage.yk10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0011B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR>\u0010)\u001a\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\"\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u00101\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R*\u00105\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010,\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010E\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010I\u001a\u00020F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L¨\u0006M"}, d2 = {"Lcom/sportygames/compose/lobbyv2/webview/LobbyWebView;", "Landroid/webkit/WebView;", "Lbb;", "", "Lxjj;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getLobbyURL", "()Ljava/lang/String;", "Lxzi0;", "a", "Lttr;", "getWebViewProvider", "()Lxzi0;", "webViewProvider", "Likx;", "b", "Likx;", "getNavigationRouteChanged", "()Likx;", "setNavigationRouteChanged", "(Likx;)V", "navigationRouteChanged", "Lkotlin/Function3;", "Lcom/sportygames/compose/lobbyv2/models/LobbyV2GameDetailsModel;", "Lgnj;", "Lcom/sportygames/compose/lobbyv2/models/GameLogData;", "", "c", "Lgaj;", "getOpenGameCallback", "()Lgaj;", "setOpenGameCallback", "(Lgaj;)V", "openGameCallback", "Lkotlin/Function0;", "d", "Lkotlin/jvm/functions/Function0;", "getOnSearchOpened", "()Lkotlin/jvm/functions/Function0;", "setOnSearchOpened", "(Lkotlin/jvm/functions/Function0;)V", "onSearchOpened", "e", "getOnSearchClosed", "setOnSearchClosed", "onSearchClosed", "Lb5c;", "f", "Lb5c;", "getCurrentLobbyWebViewPage", "()Lb5c;", "setCurrentLobbyWebViewPage", "(Lb5c;)V", "currentLobbyWebViewPage", "Lrct;", "i", "Lrct;", "getLoadingCallbacks", "()Lrct;", "setLoadingCallbacks", "(Lrct;)V", "loadingCallbacks", "", "A", "Z", "isDarkThemeOn", "()Z", "setDarkThemeOn", "(Z)V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LobbyWebView extends WebView implements bb, xjj {
    public static final List<String> B = kotlin.collections.b.k("game_click", "show_all_click", "provider_click", "category_click", "search_open", "search_close");

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public boolean isDarkThemeOn;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final ttr webViewProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public ikx navigationRouteChanged;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public gaj<? super LobbyV2GameDetailsModel, ? super gnj, ? super GameLogData, Unit> openGameCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public Function0<Unit> onSearchOpened;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public Function0<Unit> onSearchClosed;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public b5c currentLobbyWebViewPage;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public rct loadingCallbacks;
    public final eal v;
    public List<String> w;
    public boolean y;
    public boolean z;

    public static final class b implements Function0<xzi0> {
        public b() {
        }

        /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, xzi0] */
        @Override // kotlin.jvm.functions.Function0
        public final xzi0 invoke() {
            qn70 qn70VarJ;
            dq7 dq7VarA;
            prp prpVar = LobbyWebView.this;
            if (prpVar instanceof rrp) {
                qn70VarJ = ((rrp) prpVar).j();
                dq7VarA = jq40.a(xzi0.class);
                qn70VarJ.getClass();
            } else {
                qn70VarJ = prpVar.getKoin().c.d;
                dq7VarA = jq40.a(xzi0.class);
            }
            return qn70VarJ.a(dq7VarA, null, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LobbyWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.webViewProvider = hwr.a(a1s.a, new b());
        this.currentLobbyWebViewPage = b5c.a;
        this.v = new eal();
        this.w = m2g.a;
        boolean z = false;
        try {
            if ((getResources().getConfiguration().uiMode & 48) == 32) {
                z = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.isDarkThemeOn = z;
    }

    private final String getLobbyURL() {
        return yk10.a(SportyGamesManager.getInstance().baseUrlLobbyWeb(), "sportygames/lobby");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xzi0 getWebViewProvider() {
        return (xzi0) this.webViewProvider.getValue();
    }

    @Override // defpackage.bb
    public final void Q(xnh0 xnh0Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = nzf0.a;
        if (!z && jCurrentTimeMillis - nzf0.b <= 500) {
            z = true;
        }
        if (z) {
            return;
        }
        b();
        if (getContext() != null) {
            c(getContext());
        }
        e();
    }

    public final void b() {
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        if ((sportyGamesManager != null ? sportyGamesManager.getBridge() : null) == null) {
            Intent intent = new Intent();
            intent.setAction("com.sportybet.android.game.REOPEN_GAME_LOBBY");
            Context context = getContext();
            intent.setPackage(context != null ? context.getPackageName() : null);
            Context context2 = getContext();
            if (context2 != null) {
                context2.sendBroadcast(intent);
            }
        }
    }

    public final void c(Context context) {
        xnh0 user;
        xnh0 user2;
        xnh0 user3;
        xnh0 user4;
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        if (sportyGamesManager != null) {
            if (sportyGamesManager.getEnvironment() != null) {
                sportyGamesManager.getEnvironment().toString();
            }
            String country = sportyGamesManager.getCountry();
            if (country == null || country.length() == 0) {
                b();
            }
            String platform = sportyGamesManager.getPlatform();
            platform.getClass();
            u3w.a = platform;
            u3w.d = sportyGamesManager.getCountry();
            u3w.b = sportyGamesManager.getDomain(context);
            u3w.c = sportyGamesManager.getLanguageCode();
        }
        SportyGamesManager sportyGamesManager2 = SportyGamesManager.getInstance();
        if (((sportyGamesManager2 == null || (user4 = sportyGamesManager2.getUser()) == null) ? null : user4.a) != null) {
            CookieManager cookieManager = CookieManager.getInstance();
            String str = u3w.b;
            SportyGamesManager sportyGamesManager3 = SportyGamesManager.getInstance();
            cookieManager.setCookie(str, "accessToken=" + ((sportyGamesManager3 == null || (user3 = sportyGamesManager3.getUser()) == null) ? null : user3.a));
        } else {
            CookieManager.getInstance().setCookie(u3w.b, "accessToken=");
        }
        SportyGamesManager sportyGamesManager4 = SportyGamesManager.getInstance();
        if (((sportyGamesManager4 == null || (user2 = sportyGamesManager4.getUser()) == null) ? null : user2.b) != null) {
            CookieManager cookieManager2 = CookieManager.getInstance();
            String str2 = u3w.b;
            SportyGamesManager sportyGamesManager5 = SportyGamesManager.getInstance();
            cookieManager2.setCookie(str2, "userId=" + ((sportyGamesManager5 == null || (user = sportyGamesManager5.getUser()) == null) ? null : user.b));
        } else {
            CookieManager.getInstance().setCookie(u3w.b, "userId=");
        }
        CookieManager cookieManager3 = CookieManager.getInstance();
        String str3 = u3w.b;
        SportyGamesManager sportyGamesManager6 = SportyGamesManager.getInstance();
        cookieManager3.setCookie(str3, "deviceId=" + (sportyGamesManager6 != null ? sportyGamesManager6.getDeviceId() : null));
        CookieManager.getInstance().setCookie(u3w.b, "platform=" + u3w.a);
        CookieManager.getInstance().setCookie(u3w.b, "sb_country=" + u3w.d);
        if (context != null) {
            try {
                CookieManager.getInstance().setCookie(u3w.b, "download-source=".concat(SportyGamesManager.getInstance().isSideLoading(context) ? "external-link" : "google-play-store"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        PackageManager packageManager = context != null ? context.getPackageManager() : null;
        PackageInfo packageInfo = packageManager != null ? packageManager.getPackageInfo(context.getPackageName(), 0) : null;
        String str4 = packageInfo != null ? packageInfo.versionName : null;
        CookieManager.getInstance().setCookie(u3w.b, "app-version=" + str4);
        CookieManager.getInstance().setCookie(u3w.b, "locale=" + u3w.c);
    }

    public final void d() {
        SportyGamesManager.getInstance().removeAccountUpdatedListener(this);
        if (this.z) {
            Iterator<T> it = B.iterator();
            while (it.hasNext()) {
                removeJavascriptInterface((String) it.next());
            }
            this.z = false;
        }
        getWebViewProvider().a(this);
        this.loadingCallbacks = null;
        this.navigationRouteChanged = null;
        this.openGameCallback = null;
        this.onSearchOpened = null;
        this.onSearchClosed = null;
        destroy();
    }

    public final void e() {
        String lobbyURL = getLobbyURL();
        String domain = SportyGamesManager.getInstance().getDomain(getContext());
        if (getContext() == null || !getWebViewProvider().h(this)) {
            return;
        }
        if (d0j0.b(lobbyURL, domain)) {
            xzi0 webViewProvider = getWebViewProvider();
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            g(webViewProvider.b(this, lobbyURL, o2gVar));
            return;
        }
        rct rctVar = this.loadingCallbacks;
        if (rctVar != null) {
            rctVar.c();
        }
    }

    public final void f(List list, oxj.d dVar, gxj gxjVar, hxj hxjVar, ixj ixjVar) {
        list.getClass();
        this.navigationRouteChanged = dVar;
        this.openGameCallback = gxjVar;
        this.onSearchOpened = hxjVar;
        this.onSearchClosed = ixjVar;
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        this.w = arrayList;
        this.y = false;
        getSettings().setTextZoom(100);
        setFocusableInTouchMode(true);
        requestFocusFromTouch();
        if (getContext() != null) {
            c(getContext());
        }
        xzi0 webViewProvider = getWebViewProvider();
        Context context = getContext();
        context.getClass();
        String lobbyURL = getLobbyURL();
        a aVar = new a();
        if ((1 & 4) != 0) {
            lobbyURL = null;
        }
        if ((4 & 2) != 0) {
            aVar = null;
        }
        g(webViewProvider.e(context, this, new wzi0(lobbyURL, aVar, null)));
        SportyGamesManager.getInstance().addAccountUpdatedListener(this);
    }

    @Override // defpackage.bb
    public final void f0(m8 m8Var) {
        System.currentTimeMillis();
    }

    public final void g(f0j0 f0j0Var) {
        f0j0Var.getClass();
        e0j0 e0j0Var = f0j0Var.a;
        e0j0 e0j0Var2 = e0j0.a;
        boolean z = this.z;
        List<String> list = B;
        if (e0j0Var != e0j0Var2) {
            if (z) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    removeJavascriptInterface((String) it.next());
                }
                this.z = false;
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        for (String str : list) {
            addJavascriptInterface(new qct(str, this, new sct(this), this), str);
        }
        this.z = true;
    }

    public final b5c getCurrentLobbyWebViewPage() {
        return this.currentLobbyWebViewPage;
    }

    @Override // defpackage.xjj, defpackage.prp
    public krp getKoin() {
        return sjj.b();
    }

    public final rct getLoadingCallbacks() {
        return this.loadingCallbacks;
    }

    public final ikx getNavigationRouteChanged() {
        return this.navigationRouteChanged;
    }

    public final Function0<Unit> getOnSearchClosed() {
        return this.onSearchClosed;
    }

    public final Function0<Unit> getOnSearchOpened() {
        return this.onSearchOpened;
    }

    public final gaj<LobbyV2GameDetailsModel, gnj, GameLogData, Unit> getOpenGameCallback() {
        return this.openGameCallback;
    }

    public final void setCurrentLobbyWebViewPage(b5c b5cVar) {
        b5cVar.getClass();
        this.currentLobbyWebViewPage = b5cVar;
    }

    public final void setDarkThemeOn(boolean z) {
        this.isDarkThemeOn = z;
    }

    public final void setLoadingCallbacks(rct rctVar) {
        this.loadingCallbacks = rctVar;
    }

    public final void setNavigationRouteChanged(ikx ikxVar) {
        this.navigationRouteChanged = ikxVar;
    }

    public final void setOnSearchClosed(Function0<Unit> function0) {
        this.onSearchClosed = function0;
    }

    public final void setOnSearchOpened(Function0<Unit> function0) {
        this.onSearchOpened = function0;
    }

    public final void setOpenGameCallback(gaj<? super LobbyV2GameDetailsModel, ? super gnj, ? super GameLogData, Unit> gajVar) {
        this.openGameCallback = gajVar;
    }

    public final class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            List<String> list = LobbyWebView.B;
            LobbyWebView lobbyWebView = LobbyWebView.this;
            if (!lobbyWebView.y && !lobbyWebView.w.isEmpty()) {
                lobbyWebView.evaluateJavascript(qae0.c("\n                (function() {\n                    try {\n                        window.localStorage.setItem(\"lobby:user:recent:games\", JSON.stringify(" + lobbyWebView.v.j(lobbyWebView.w) + "));\n                    } catch (error) {\n                        // Ignore storage sync failures to avoid breaking lobby load.\n                    }\n                })();\n            "), null);
                lobbyWebView.y = true;
            }
            lobbyWebView.evaluateJavascript(qae0.c("\n                (function() {\n                    try {\n                        window.localStorage.setItem(\n                            \"theme\",\n                            \"" + (lobbyWebView.isDarkThemeOn ? "Dark" : "Light") + "\"\n                        );\n                    } catch (error) { }\n                })();\n            "), new tct());
            rct loadingCallbacks = lobbyWebView.getLoadingCallbacks();
            if (loadingCallbacks != null) {
                loadingCallbacks.b();
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            f0j0 f0j0VarC;
            super.onPageStarted(webView, str, bitmap);
            LobbyWebView lobbyWebView = LobbyWebView.this;
            if (webView != null && (f0j0VarC = lobbyWebView.getWebViewProvider().c(webView)) != null) {
                lobbyWebView.g(f0j0VarC);
            }
            rct loadingCallbacks = lobbyWebView.getLoadingCallbacks();
            if (loadingCallbacks != null) {
                loadingCallbacks.a();
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            rct loadingCallbacks;
            CharSequence description;
            Uri url;
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if ((webResourceRequest == null || webResourceRequest.isForMainFrame()) && (loadingCallbacks = LobbyWebView.this.getLoadingCallbacks()) != null) {
                if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
                    url.toString();
                }
                if (webResourceError != null && (description = webResourceError.getDescription()) != null) {
                    description.toString();
                }
                loadingCallbacks.c();
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            return !d0j0.b((webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? null : url.toString(), SportyGamesManager.getInstance().getDomain(LobbyWebView.this.getContext()));
        }

        @Override // android.webkit.WebViewClient
        @fae
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return !d0j0.b(str, SportyGamesManager.getInstance().getDomain(LobbyWebView.this.getContext()));
        }

        @Override // android.webkit.WebViewClient
        @fae
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            webView.getClass();
            super.onReceivedError(webView, i, str, str2);
            rct loadingCallbacks = LobbyWebView.this.getLoadingCallbacks();
            if (loadingCallbacks != null) {
                loadingCallbacks.c();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LobbyWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LobbyWebView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ LobbyWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
