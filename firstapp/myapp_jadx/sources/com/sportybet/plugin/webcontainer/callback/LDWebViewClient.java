package com.sportybet.plugin.webcontainer.callback;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SEfl.gvQvkPPtA;
import com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity;
import com.sportybet.plugin.webcontainer.utils.Tools;
import defpackage.cvp;
import defpackage.d0n;
import defpackage.dvp;
import defpackage.evp;
import defpackage.fbh0;
import defpackage.itf0;
import defpackage.psm;
import defpackage.wsm;
import defpackage.yrh0;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LDWebViewClient extends LDBaseWebViewClient {
    private final psm countryManager;
    private final wsm crashlyticsHelper;
    private WebViewClient delegateWebViewClient;
    private final evp jsBridgeService;
    public OnPageFinishedListener mOnPageFinishedListener;
    private boolean pageStarted;
    private int retry;
    private final fbh0 uiRouterManager;
    private final d0n utils;

    /* JADX INFO: loaded from: classes7.dex */
    public interface Factory {
        LDWebViewClient create(evp evpVar);
    }

    public LDWebViewClient(Context context, psm psmVar, d0n d0nVar, wsm wsmVar, fbh0 fbh0Var, evp evpVar) {
        super(context);
        this.retry = 0;
        this.uiRouterManager = fbh0Var;
        this.jsBridgeService = evpVar;
        this.countryManager = psmVar;
        this.utils = d0nVar;
        this.crashlyticsHelper = wsmVar;
    }

    private void sendSMS(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.utils.a(getContext(), str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        String string;
        BaseWebViewActivity baseWebViewActivity = (BaseWebViewActivity) getActivity(BaseWebViewActivity.class);
        if (baseWebViewActivity != null) {
            if (!baseWebViewActivity.isRightBtCleanDisabled()) {
                baseWebViewActivity.getRightTitleButton().setVisibility(8);
                baseWebViewActivity.getRightButtonArrowUp().setVisibility(8);
            }
            baseWebViewActivity.hideProgressBar();
        }
        evp evpVar = this.jsBridgeService;
        if (evpVar != null && this.pageStarted) {
            WebView webView2 = evpVar.a;
            dvp dvpVar = evpVar.c;
            try {
                byte[] bArrInputStreamToBytes = Tools.inputStreamToBytes(dvpVar.b.getAssets().open("LDJSBridgeCore.js.txt"));
                StringBuffer stringBuffer = new StringBuffer();
                if (bArrInputStreamToBytes != null) {
                    AccountHelperEntryPointImpl accountHelperEntryPointImpl = yrh0.a;
                    stringBuffer.append(new String(bArrInputStreamToBytes, StandardCharsets.UTF_8).trim());
                    List<String> mappBuildStrings = dvpVar.a.getMappBuildStrings();
                    if (mappBuildStrings != null) {
                        for (String str2 : mappBuildStrings) {
                            if (stringBuffer.charAt(stringBuffer.length() - 1) != ',') {
                                stringBuffer.append(',');
                            }
                            stringBuffer.append(str2.trim());
                        }
                    }
                    if (stringBuffer.charAt(stringBuffer.length() - 1) == ',') {
                        stringBuffer.setLength(stringBuffer.length() - 1);
                    }
                    string = stringBuffer.toString();
                } else {
                    string = "";
                }
            } catch (IOException unused) {
            }
            if (webView2 != null) {
                String str3 = "javascript:function onCoreBridgeJS(){" + Pattern.compile("/\\*[^*]*\\*+(?:[^/*][^*]*\\*+)*/|//[^\r\n]*+|\t|\r|\n").matcher(string).replaceAll("") + "}; onCoreBridgeJS();";
                webView2.loadUrl(str3);
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_JAVA_SCRIPT);
                aVar.a("JS interface: %s", str3);
            }
            this.jsBridgeService.a("LDMJsBridgeReady");
        }
        this.pageStarted = false;
        WebViewClient webViewClient = this.delegateWebViewClient;
        if (webViewClient != null) {
            webViewClient.onPageFinished(webView, str);
        }
        if (baseWebViewActivity != null && !baseWebViewActivity.hasCustomTitle() && !TextUtils.isEmpty(webView.getTitle()) && !TextUtils.isEmpty(webView.getTitle()) && webView.getTitle().length() <= 10) {
            baseWebViewActivity.setTitle(webView.getTitle());
        }
        OnPageFinishedListener onPageFinishedListener = this.mOnPageFinishedListener;
        if (onPageFinishedListener != null) {
            onPageFinishedListener.onFinish();
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        BaseWebViewActivity baseWebViewActivity = (BaseWebViewActivity) getActivity(BaseWebViewActivity.class);
        if (baseWebViewActivity != null && baseWebViewActivity.enableProcessBar()) {
            baseWebViewActivity.showProgressBar();
        }
        this.pageStarted = true;
        WebViewClient webViewClient = this.delegateWebViewClient;
        if (webViewClient != null) {
            webViewClient.onPageStarted(webView, str, bitmap);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webResourceRequest.isForMainFrame()) {
            WebViewClient webViewClient = this.delegateWebViewClient;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
            }
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            int i = this.retry + 1;
            this.retry = i;
            if (i <= 3) {
                webView.loadUrl(webResourceRequest.getUrl().toString());
            } else {
                this.retry = 0;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        WebViewClient webViewClient = this.delegateWebViewClient;
        if (webViewClient != null) {
            webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        WebViewClient webViewClient = this.delegateWebViewClient;
        if (webViewClient != null) {
            webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    public void setDelegeteWebViewClient(WebViewClient webViewClient) {
        this.delegateWebViewClient = webViewClient;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse webResourceResponseShouldInterceptRequest;
        WebViewClient webViewClient = this.delegateWebViewClient;
        return (webViewClient == null || (webResourceResponseShouldInterceptRequest = webViewClient.shouldInterceptRequest(webView, webResourceRequest)) == null) ? super.shouldInterceptRequest(webView, webResourceRequest) : webResourceResponseShouldInterceptRequest;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Activity activity;
        String strDecode;
        ArrayList arrayList;
        String[] strArrSplit;
        String string = webResourceRequest.getUrl().toString();
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_WEB);
        aVar.a("shouldOverrideUrlLoading, url: %s", string);
        WebViewClient webViewClient = this.delegateWebViewClient;
        if (webViewClient == null || !webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest)) {
            int i = 0;
            try {
                if (!string.startsWith("ldjsbridge")) {
                    Uri uri = Uri.parse(string);
                    if (uri != null && (TextUtils.isEmpty(string) || !string.startsWith("about:"))) {
                        if (this.uiRouterManager.h(true, uri)) {
                            this.uiRouterManager.b(uri);
                            if (string.contains(AnalyticsEvent.DEPOSIT) && this.countryManager.r() && (activity = getActivity()) != null) {
                                activity.finish();
                                return true;
                            }
                        } else if (uri.getScheme() == null || uri.getScheme().toLowerCase(Locale.US).startsWith("http")) {
                            BaseWebViewActivity baseWebViewActivity = (BaseWebViewActivity) getActivity(BaseWebViewActivity.class);
                            if (baseWebViewActivity != null) {
                                baseWebViewActivity.resetCloseBtn();
                            }
                            if (string.contains("tgAuthResult")) {
                                webView.loadUrl(string);
                                return true;
                            }
                            if (baseWebViewActivity != null) {
                                baseWebViewActivity.onNewPageIsLoading(string);
                            }
                        } else {
                            Activity activity2 = getActivity();
                            if (activity2 != null) {
                                if (!TextUtils.isEmpty(string) && string.startsWith("sms:")) {
                                    sendSMS(string.split("[:?]")[1], string.split("body=")[1]);
                                    return true;
                                }
                                if (string.startsWith("pay:")) {
                                    try {
                                        Intent intent = new Intent("android.intent.action.VIEW");
                                        intent.setData(Uri.parse(string));
                                        yrh0.s(activity2, intent, true);
                                        return true;
                                    } catch (Exception e) {
                                        itf0.a aVar2 = itf0.a;
                                        aVar2.q(MyLog.TAG_DEPOSIT);
                                        aVar2.p(e, "OverrideUrlLoading with failure: %s", string);
                                    }
                                } else {
                                    Intent intent2 = new Intent();
                                    intent2.setData(Uri.parse(string));
                                    yrh0.s(activity2, intent2, true);
                                }
                            }
                        }
                    }
                    return false;
                }
                evp evpVar = this.jsBridgeService;
                if (evpVar != null && evpVar.a != null && string.startsWith("ldjsbridge")) {
                    cvp cvpVar = evpVar.b;
                    cvpVar.getClass();
                    URI uriCreate = URI.create(string);
                    String host = uriCreate.getHost();
                    String path = uriCreate.getPath();
                    String rawQuery = uriCreate.getRawQuery();
                    String fragment = uriCreate.getFragment();
                    String strDecode2 = "";
                    if (fragment == null || fragment.length() <= 0 || Integer.parseInt(fragment) <= 0) {
                        fragment = "";
                    }
                    if (host == null || host.length() <= 0) {
                        strDecode = "";
                    } else {
                        try {
                            strDecode = URLDecoder.decode(host, "UTF-8");
                        } catch (UnsupportedEncodingException e2) {
                            e2.printStackTrace();
                            strDecode = "";
                        }
                    }
                    if (path != null && !path.equalsIgnoreCase("") && (strArrSplit = path.split("/")) != null && strArrSplit.length >= 2) {
                        try {
                            strDecode2 = URLDecoder.decode(strArrSplit[1], "UTF-8");
                        } catch (UnsupportedEncodingException e3) {
                            e3.printStackTrace();
                        }
                    }
                    HashMap map = null;
                    if (rawQuery == null || rawQuery.length() <= 0) {
                        arrayList = null;
                    } else {
                        String[] strArrSplit2 = rawQuery.split("&");
                        if (strArrSplit2.length > 0) {
                            arrayList = new ArrayList();
                            for (String str : strArrSplit2) {
                                String[] strArrSplit3 = str.split("=");
                                if (strArrSplit3.length == 2) {
                                    try {
                                        arrayList.add(URLDecoder.decode(strArrSplit3[1], "UTF-8"));
                                    } catch (UnsupportedEncodingException e4) {
                                        e4.printStackTrace();
                                    }
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                    }
                    if (arrayList != null && arrayList.size() > 0) {
                        int size = arrayList.size();
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            String str2 = (String) obj;
                            try {
                                JSONObject jSONObject = new JSONObject(str2);
                                if (jSONObject.length() > 0 && map == null) {
                                    map = new HashMap();
                                }
                                Iterator<String> itKeys = jSONObject.keys();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    if (next.equalsIgnoreCase("callback")) {
                                        fragment = jSONObject.getString(next);
                                    }
                                    map.put(next, jSONObject.get(next));
                                }
                                arrayList.remove(str2);
                            } catch (Exception unused) {
                            }
                        }
                    }
                    try {
                        try {
                            cvpVar.a(strDecode, strDecode2, fragment, arrayList, map);
                        } catch (IllegalAccessException e5) {
                            e5.printStackTrace();
                        }
                    } catch (JSONException e6) {
                        e6.printStackTrace();
                    }
                }
            } catch (Exception unused2) {
            }
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        WebViewClient webViewClient = this.delegateWebViewClient;
        if (webViewClient != null) {
            webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
        sslErrorHandler.cancel();
        this.crashlyticsHelper.g(gvQvkPPtA.jJgTbOPOxM, "Error reason:" + sslError.toString(), new SSLException("Received SSL Error"), null);
    }
}
