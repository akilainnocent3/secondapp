package com.sportybet.plugin.webcontainer;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.sportybet.plugin.webcontainer.callback.LDDownloadListener;
import com.sportybet.plugin.webcontainer.callback.LDSimpleWebChromeClient;
import com.sportybet.plugin.webcontainer.callback.LDWebViewClient;
import com.sportybet.plugin.webcontainer.utils.DeviceInfo;
import com.sportybet.plugin.webcontainer.utils.Server;
import defpackage.evp;
import defpackage.gzi0;
import defpackage.i0j0;
import defpackage.qag;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class WebViewWrapperServiceImpl implements i0j0 {
    private final LDWebViewClient.Factory ldWebViewClientFactory;
    private final evp.a ldjsServiceFactory;
    HashMap<WebView, evp> webView2JsBridge = new HashMap<>();
    HashMap<WebView, LDSimpleWebChromeClient> webView2LDWebChromeClient = new HashMap<>();

    public WebViewWrapperServiceImpl(evp.a aVar, LDWebViewClient.Factory factory) {
        this.ldjsServiceFactory = aVar;
        this.ldWebViewClientFactory = factory;
    }

    @Override // defpackage.i0j0
    public void installJsBridge(Context context, WebView webView, WebViewClient webViewClient, WebChromeClient webChromeClient, Boolean bool) {
        webView.getSettings().setSupportZoom(false);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setSavePassword(false);
        webView.getSettings().setDomStorageEnabled(true);
        webView.clearCache(false);
        DeviceInfo deviceInfo = DeviceInfo.getInstance();
        if (!deviceInfo.isWapApn(webView.getContext()) || deviceInfo.getApn(webView.getContext()).getProxyServer() == null) {
            webView.setHttpAuthUsernamePassword("", "", "", "");
        } else {
            Server proxyServer = deviceInfo.getApn(webView.getContext()).getProxyServer();
            webView.setHttpAuthUsernamePassword(proxyServer.getAddress(), proxyServer.getPort() + "", "", "");
        }
        context.getClass();
        ((gzi0.a) qag.a(context, gzi0.a.class)).x().a(webView);
        evp evpVarA = this.ldjsServiceFactory.a(webView);
        this.webView2JsBridge.put(webView, evpVarA);
        LDWebViewClient lDWebViewClientCreate = this.ldWebViewClientFactory.create(evpVarA);
        lDWebViewClientCreate.setDelegeteWebViewClient(webViewClient);
        webView.setWebViewClient(lDWebViewClientCreate);
        LDSimpleWebChromeClient lDSimpleWebChromeClient = new LDSimpleWebChromeClient(context, webChromeClient, bool);
        webView.setWebChromeClient(lDSimpleWebChromeClient);
        this.webView2LDWebChromeClient.put(webView, lDSimpleWebChromeClient);
        webView.setDownloadListener(new LDDownloadListener(context));
    }

    @Override // defpackage.i0j0
    public void uninstallJsBridge(WebView webView) {
        LDSimpleWebChromeClient lDSimpleWebChromeClientRemove = this.webView2LDWebChromeClient.remove(webView);
        if (lDSimpleWebChromeClientRemove != null) {
            lDSimpleWebChromeClientRemove.onDestroy();
        }
        this.webView2JsBridge.remove(webView);
    }

    @Override // defpackage.i0j0
    public void installJsBridge(Context context, WebView webView, WebViewClient webViewClient, WebChromeClient webChromeClient) {
        installJsBridge(context, webView, webViewClient, webChromeClient, Boolean.FALSE);
    }
}
