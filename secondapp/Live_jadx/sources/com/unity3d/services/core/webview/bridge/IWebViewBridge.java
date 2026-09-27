package com.unity3d.services.core.webview.bridge;

import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface IWebViewBridge {
    void handleCallback(@m String str, @m String str2, @m Object[] objArr) throws Exception;

    void handleInvocation(@m String str, @m String str2, @m Object[] objArr, @m WebViewCallback webViewCallback) throws Exception;
}
