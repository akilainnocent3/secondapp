package com.sportybet.plugin.webcontainer.callback;

import android.content.Context;
import android.webkit.WebView;
import defpackage.d0n;
import defpackage.evp;
import defpackage.fbh0;
import defpackage.psm;
import defpackage.wsm;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B=\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/sportybet/plugin/webcontainer/callback/LDGoBackWebViewClient;", "Lcom/sportybet/plugin/webcontainer/callback/LDWebViewClient;", "Landroid/content/Context;", "context", "Lpsm;", "countryManager", "Ld0n;", "utils", "Lwsm;", "crashlyticsHelper", "Lfbh0;", "uiRouterManager", "Levp;", "jsBridgeService", "<init>", "(Landroid/content/Context;Lpsm;Ld0n;Lwsm;Lfbh0;Levp;)V", "Landroid/webkit/WebView;", "view", "", "url", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "Factory", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LDGoBackWebViewClient extends LDWebViewClient {
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/sportybet/plugin/webcontainer/callback/LDGoBackWebViewClient$Factory;", "", "Levp;", "jsBridgeService", "Lcom/sportybet/plugin/webcontainer/callback/LDGoBackWebViewClient;", "create", "(Levp;)Lcom/sportybet/plugin/webcontainer/callback/LDGoBackWebViewClient;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface Factory {
        LDGoBackWebViewClient create(evp jsBridgeService);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LDGoBackWebViewClient(Context context, psm psmVar, d0n d0nVar, wsm wsmVar, fbh0 fbh0Var, evp evpVar) {
        super(context, psmVar, d0nVar, wsmVar, fbh0Var, evpVar);
        context.getClass();
        psmVar.getClass();
        d0nVar.getClass();
        wsmVar.getClass();
        fbh0Var.getClass();
        evpVar.getClass();
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.getClass();
        url.getClass();
        boolean zShouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
        if (zShouldOverrideUrlLoading && view.canGoBack()) {
            view.goBack();
        }
        return zShouldOverrideUrlLoading;
    }
}
