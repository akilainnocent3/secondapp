package com.cleveradssolutions.adapters.exchange.rendering.views.webview.mraid;

import android.webkit.JavascriptInterface;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public interface i {
    @JavascriptInterface
    void close();

    @JavascriptInterface
    void createCalendarEvent(String str);

    @JavascriptInterface
    void expand();

    @JavascriptInterface
    void expand(String str);

    @JavascriptInterface
    String getCurrentAppOrientation();

    @JavascriptInterface
    String getCurrentPosition();

    @JavascriptInterface
    String getDefaultPosition();

    @JavascriptInterface
    String getLocation();

    @JavascriptInterface
    String getMaxSize();

    @JavascriptInterface
    String getPlacementType();

    @JavascriptInterface
    String getScreenSize();

    @JavascriptInterface
    void javaScriptCallback(String str, String str2, String str3);

    @JavascriptInterface
    void onOrientationPropertiesChanged(String str);

    @JavascriptInterface
    void open(String str);

    @JavascriptInterface
    void playVideo(String str);

    @JavascriptInterface
    void resize();

    @JavascriptInterface
    @Deprecated
    void shouldUseCustomClose(String str);

    @JavascriptInterface
    void storePicture(String str);

    @JavascriptInterface
    boolean supports(String str);

    @JavascriptInterface
    void unload();
}
