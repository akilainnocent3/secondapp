package com.vungle.ads.internal.presenter;

import android.content.Context;
import android.webkit.WebView;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.ThreadUtil;
import dr.w2;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class WebViewManager {

    @l
    private static final String TAG = "WebViewManager";

    @l
    public static final WebViewManager INSTANCE = new WebViewManager();

    @l
    private static final ReentrantLock lock = new ReentrantLock();

    @l
    private static final LinkedHashMap<String, WebViewEntry> webViewCache = new LinkedHashMap<>();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class WebViewEntry {

        @l
        private final WebView webView;

        @l
        private final VungleWebClient webViewClient;

        public WebViewEntry(@l WebView webView, @l VungleWebClient webViewClient) {
            m0.p(webView, "webView");
            m0.p(webViewClient, "webViewClient");
            this.webView = webView;
            this.webViewClient = webViewClient;
        }

        public static /* synthetic */ WebViewEntry copy$default(WebViewEntry webViewEntry, WebView webView, VungleWebClient vungleWebClient, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                webView = webViewEntry.webView;
            }
            if ((i10 & 2) != 0) {
                vungleWebClient = webViewEntry.webViewClient;
            }
            return webViewEntry.copy(webView, vungleWebClient);
        }

        @l
        public final WebView component1() {
            return this.webView;
        }

        @l
        public final VungleWebClient component2() {
            return this.webViewClient;
        }

        @l
        public final WebViewEntry copy(@l WebView webView, @l VungleWebClient webViewClient) {
            m0.p(webView, "webView");
            m0.p(webViewClient, "webViewClient");
            return new WebViewEntry(webView, webViewClient);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebViewEntry)) {
                return false;
            }
            WebViewEntry webViewEntry = (WebViewEntry) obj;
            return m0.g(this.webView, webViewEntry.webView) && m0.g(this.webViewClient, webViewEntry.webViewClient);
        }

        @l
        public final WebView getWebView() {
            return this.webView;
        }

        @l
        public final VungleWebClient getWebViewClient() {
            return this.webViewClient;
        }

        public int hashCode() {
            return (this.webView.hashCode() * 31) + this.webViewClient.hashCode();
        }

        @l
        public String toString() {
            return "WebViewEntry(webView=" + this.webView + ", webViewClient=" + this.webViewClient + ')';
        }
    }

    private WebViewManager() {
    }

    private final void destroyWebViewInternal(String str) {
        webViewCache.remove(str);
    }

    public final void destroyWebView(@l String key) {
        m0.p(key, "key");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            INSTANCE.destroyWebViewInternal(key);
            w2 w2Var = w2.f79517a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @l
    public final WebView getOrCreateWebView(@l Context context, @m String str) {
        WebView webView;
        m0.p(context, "context");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            LinkedHashMap<String, WebViewEntry> linkedHashMap = webViewCache;
            WebViewEntry webViewEntry = linkedHashMap.get(str);
            if (webViewEntry != null) {
                Logger.Companion.d(TAG, "Reusing cached webview. Cache size: " + linkedHashMap.size());
                webView = webViewEntry.getWebView();
            } else {
                Logger.Companion.d(TAG, "Creating new webview. Cache size: " + linkedHashMap.size());
                webView = new WebView(context);
            }
            return webView;
        } finally {
            reentrantLock.unlock();
        }
    }

    @l
    public final VungleWebClient getOrCreateWebViewClient(@l AdPayload advertisement, @l Placement placement, @l VungleThreadPoolExecutor offloadExecutor, @l Platform platform) {
        m0.p(advertisement, "advertisement");
        m0.p(placement, "placement");
        m0.p(offloadExecutor, "offloadExecutor");
        m0.p(platform, "platform");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            WebViewEntry webViewEntry = webViewCache.get(advertisement.eventId());
            VungleWebClient webViewClient = webViewEntry != null ? webViewEntry.getWebViewClient() : null;
            if (webViewClient == null) {
                webViewClient = new VungleWebClient(advertisement, placement, offloadExecutor, platform, null, null, 48, null);
            }
            return webViewClient;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void preloadWebView$vungle_ads_release(@l Context context, @l AdPayload adv, @l Placement placement, @l String templatePath, @m AdPayload.WebViewSettings webViewSettings, @l PreloadDelegate delegate, @m Long l10) {
        m0.p(context, "context");
        m0.p(adv, "adv");
        m0.p(placement, "placement");
        m0.p(templatePath, "templatePath");
        m0.p(delegate, "delegate");
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            Logger.Companion companion = Logger.Companion;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Preload webview start. Cache size: ");
            LinkedHashMap<String, WebViewEntry> linkedHashMap = webViewCache;
            sb2.append(linkedHashMap.size());
            companion.d(TAG, sb2.toString());
            String strEventId = adv.eventId();
            if (!linkedHashMap.containsKey(strEventId)) {
                ThreadUtil.INSTANCE.runOnUiThread(new WebViewManager$preloadWebView$1$1(context, adv, placement, delegate, l10, templatePath, strEventId, webViewSettings));
            }
            w2 w2Var = w2.f79517a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
