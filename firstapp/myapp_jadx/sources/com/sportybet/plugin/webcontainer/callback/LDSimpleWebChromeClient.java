package com.sportybet.plugin.webcontainer.callback;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.sportybet.plugin.webcontainer.utils.AlertDialogViewBuilder;
import defpackage.hp0;

/* JADX INFO: loaded from: classes7.dex */
public class LDSimpleWebChromeClient extends LDBaseChromeClient {
    private WebChromeClient delegateWebChromeClient;
    private JsResult jsResult;
    private WebChromeClient.CustomViewCallback myCallBack;
    private View myView;

    public LDSimpleWebChromeClient(Context context, WebChromeClient webChromeClient, Boolean bool) {
        super(context, bool);
        this.delegateWebChromeClient = webChromeClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onJsAlert$1(JsResult jsResult, DialogInterface dialogInterface) {
        jsResult.confirm();
        this.jsResult = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onJsAlert$2(JsResult jsResult, Dialog dialog, View view) {
        jsResult.confirm();
        this.jsResult = null;
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onJsConfirm$0(JsResult jsResult, DialogInterface dialogInterface) {
        jsResult.cancel();
        this.jsResult = null;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebChromeClient webChromeClient = this.delegateWebChromeClient;
        return webChromeClient != null ? webChromeClient.onCreateWindow(webView, z, z2, message) : super.onCreateWindow(webView, z, z2, message);
    }

    public void onDestroy() {
        WebChromeClient.CustomViewCallback customViewCallback;
        JsResult jsResult = this.jsResult;
        if (jsResult != null) {
            jsResult.cancel();
        }
        this.jsResult = null;
        if (this.myView != null && (customViewCallback = this.myCallBack) != null) {
            customViewCallback.onCustomViewHidden();
        }
        this.myView = null;
        this.myCallBack = null;
    }

    @Override // com.sportybet.plugin.webcontainer.callback.LDBaseChromeClient, android.webkit.WebChromeClient
    public /* bridge */ /* synthetic */ void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        super.onGeolocationPermissionsShowPrompt(str, callback);
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        super.onHideCustomView();
        WebChromeClient webChromeClient = this.delegateWebChromeClient;
        if (webChromeClient != null) {
            webChromeClient.onHideCustomView();
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
        WebChromeClient webChromeClient;
        this.jsResult = jsResult;
        Context context = getContext();
        if (context != null && ((webChromeClient = this.delegateWebChromeClient) == null || !webChromeClient.onJsAlert(webView, str, str2, jsResult))) {
            int identifier = webView.getContext().getResources().getIdentifier("AlertDialogStyle", "style", hp0.A.getPackageName());
            if (identifier <= 0) {
                return super.onJsAlert(webView, str, str2, jsResult);
            }
            AlertDialogViewBuilder alertDialogViewBuilder = new AlertDialogViewBuilder(hp0.A);
            View view = alertDialogViewBuilder.setTitle("System message").setMessage(str2).getView();
            final Dialog dialog = new Dialog(context, identifier);
            dialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: fvp
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.a.lambda$onJsAlert$1(jsResult, dialogInterface);
                }
            });
            alertDialogViewBuilder.setPositiveButton("Ok", new View.OnClickListener() { // from class: gvp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.a.lambda$onJsAlert$2(jsResult, dialog, view2);
                }
            });
            dialog.setContentView(view);
            dialog.show();
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
        WebChromeClient webChromeClient;
        this.jsResult = jsResult;
        Context context = getContext();
        if (context != null && ((webChromeClient = this.delegateWebChromeClient) == null || !webChromeClient.onJsConfirm(webView, str, str2, jsResult))) {
            int identifier = webView.getContext().getResources().getIdentifier("AlertDialogStyle", "style", hp0.A.getPackageName());
            if (identifier <= 0) {
                return super.onJsConfirm(webView, str, str2, jsResult);
            }
            final Dialog dialog = new Dialog(context, identifier);
            dialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: hvp
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.a.lambda$onJsConfirm$0(jsResult, dialogInterface);
                }
            });
            dialog.setContentView(new AlertDialogViewBuilder(hp0.A).setTitle("System message").setMessage(str2).setPositiveButton("Cancel", new View.OnClickListener() { // from class: com.sportybet.plugin.webcontainer.callback.LDSimpleWebChromeClient.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    jsResult.cancel();
                    LDSimpleWebChromeClient.this.jsResult = null;
                    dialog.dismiss();
                }
            }).setNegativeButton("Ok", new View.OnClickListener() { // from class: com.sportybet.plugin.webcontainer.callback.LDSimpleWebChromeClient.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    jsResult.confirm();
                    LDSimpleWebChromeClient.this.jsResult = null;
                    dialog.dismiss();
                }
            }).getView());
            dialog.show();
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        this.jsResult = jsPromptResult;
        WebChromeClient webChromeClient = this.delegateWebChromeClient;
        return webChromeClient != null ? webChromeClient.onJsPrompt(webView, str, str2, str3, jsPromptResult) : super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    @Override // com.sportybet.plugin.webcontainer.callback.LDBaseChromeClient, android.webkit.WebChromeClient
    public /* bridge */ /* synthetic */ void onPermissionRequest(PermissionRequest permissionRequest) {
        super.onPermissionRequest(permissionRequest);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        WebChromeClient webChromeClient = this.delegateWebChromeClient;
        if (webChromeClient != null) {
            webChromeClient.onProgressChanged(webView, i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        WebChromeClient webChromeClient = this.delegateWebChromeClient;
        if (webChromeClient != null) {
            webChromeClient.onReceivedTitle(webView, str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
        WebChromeClient webChromeClient = this.delegateWebChromeClient;
        if (webChromeClient != null) {
            webChromeClient.onShowCustomView(view, customViewCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        WebChromeClient webChromeClient = this.delegateWebChromeClient;
        if (webChromeClient == null) {
            return true;
        }
        webChromeClient.onShowFileChooser(webView, valueCallback, fileChooserParams);
        return true;
    }
}
