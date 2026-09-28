package com.sportybet.plugin.webcontainer.callback;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Toast;
import com.sporty.android.permission.PermissionActivity;
import com.sportybet.android.fileprovider.MyFileProvider;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity;
import com.sportybet.plugin.webcontainer.widget.CustomAlertDialog;
import defpackage.de;
import defpackage.ee;
import defpackage.ee00;
import defpackage.fq0;
import defpackage.he00;
import defpackage.mkh;
import defpackage.ud;
import defpackage.yrh0;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class LDWebChromeClient extends LDBaseChromeClient {
    private static final String UPLOAD_IMG_NAME_PREFIX = "upload_image_";
    private static final String UPLOAD_IMG_NAME_SUFFIX = ".jpg";
    private ValueCallback<Uri[]> cameraFilePathCallback;
    private Uri cameraFileUri;
    private ee<Uri> cameraLauncher;
    private JsResult jsResult;

    public LDWebChromeClient(Context context, Boolean bool) {
        super(context, bool);
        initCameraLauncher();
    }

    private Uri createCameraFileUri() {
        Context context = getContext();
        if (context != null) {
            String str = UPLOAD_IMG_NAME_PREFIX + System.currentTimeMillis() + UPLOAD_IMG_NAME_SUFFIX;
            String strH = yrh0.h(context);
            int i = MyFileProvider.v;
            this.cameraFileUri = mkh.c(context, strH, new File(MyFileProvider.b.a(), str));
        }
        return this.cameraFileUri;
    }

    private fq0 getAliveActivity() {
        Activity activity = getActivity();
        if (activity == null || activity.isFinishing() || !(activity instanceof fq0)) {
            return null;
        }
        return (fq0) activity;
    }

    private ee<Uri> initCameraLauncher() {
        fq0 aliveActivity = getAliveActivity();
        ee<Uri> eeVar = this.cameraLauncher;
        if (eeVar != null || aliveActivity == null) {
            return eeVar;
        }
        ee<Uri> eeVarRegisterForActivityResult = aliveActivity.registerForActivityResult(new de(), new ud() { // from class: ivp
            @Override // defpackage.ud
            public final void a(Object obj) {
                this.a.lambda$initCameraLauncher$4((Boolean) obj);
            }
        });
        this.cameraLauncher = eeVarRegisterForActivityResult;
        return eeVarRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initCameraLauncher$4(Boolean bool) {
        Uri[] uriArr = bool.booleanValue() ? new Uri[]{this.cameraFileUri} : null;
        ValueCallback<Uri[]> valueCallback = this.cameraFilePathCallback;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(uriArr);
            this.cameraFilePathCallback = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onJsAlert$3(JsResult jsResult, DialogInterface dialogInterface) {
        jsResult.cancel();
        this.jsResult = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onJsConfirm$0(JsResult jsResult, DialogInterface dialogInterface, int i) {
        jsResult.cancel();
        this.jsResult = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onJsConfirm$1(JsResult jsResult, DialogInterface dialogInterface, int i) {
        jsResult.confirm();
        this.jsResult = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onJsConfirm$2(JsResult jsResult, DialogInterface dialogInterface) {
        jsResult.cancel();
        this.jsResult = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openCamera(final ValueCallback<Uri[]> valueCallback) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (he00.b(context, new String[]{"android.permission.CAMERA"})) {
            openCameraWithoutPermissionCheck(valueCallback);
        } else {
            PermissionActivity.z1(context, new String[]{"android.permission.CAMERA"}, new ee00() { // from class: com.sportybet.plugin.webcontainer.callback.LDWebChromeClient.3
                @Override // defpackage.ee00
                public void onDenied() {
                    Context context2 = LDWebChromeClient.this.getContext();
                    if (context2 != null) {
                        Toast.makeText(context2, R.string.common_functions__permission_denied, 0).show();
                    }
                    ValueCallback valueCallback2 = valueCallback;
                    if (valueCallback2 != null) {
                        valueCallback2.onReceiveValue(null);
                    }
                }

                @Override // defpackage.ee00
                public void onGranted() {
                    LDWebChromeClient.this.openCamera(valueCallback);
                }
            });
        }
    }

    private void openCameraWithoutPermissionCheck(ValueCallback<Uri[]> valueCallback) {
        ee<Uri> eeVarInitCameraLauncher = initCameraLauncher();
        Uri uriCreateCameraFileUri = createCameraFileUri();
        if (eeVarInitCameraLauncher == null || uriCreateCameraFileUri == null) {
            return;
        }
        this.cameraFilePathCallback = valueCallback;
        eeVarInitCameraLauncher.b(uriCreateCameraFileUri);
    }

    private void openChooserActivity() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        Activity activity = getActivity();
        if (activity != null) {
            activity.startActivityForResult(Intent.createChooser(intent, "File Chooser"), BaseWebViewActivity.FILECHOOSER_RESULTCODE);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        super.onCreateWindow(webView, z, z2, message);
        return false;
    }

    public void onDestroy() {
        JsResult jsResult = this.jsResult;
        if (jsResult != null) {
            jsResult.cancel();
        }
        this.jsResult = null;
    }

    @Override // com.sportybet.plugin.webcontainer.callback.LDBaseChromeClient, android.webkit.WebChromeClient
    public /* bridge */ /* synthetic */ void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        super.onGeolocationPermissionsShowPrompt(str, callback);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
        this.jsResult = jsResult;
        Context context = getContext();
        if (context == null) {
            return true;
        }
        CustomAlertDialog customAlertDialogCreate = new CustomAlertDialog.Builder(context).setTitle("Warning").setMessage(str2).setPositiveButton("Ok", new DialogInterface.OnClickListener() { // from class: com.sportybet.plugin.webcontainer.callback.LDWebChromeClient.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                jsResult.confirm();
                LDWebChromeClient.this.jsResult = null;
            }
        }).create();
        customAlertDialogCreate.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: jvp
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.a.lambda$onJsAlert$3(jsResult, dialogInterface);
            }
        });
        customAlertDialogCreate.show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
        this.jsResult = jsResult;
        Context context = getContext();
        if (context == null) {
            return true;
        }
        CustomAlertDialog customAlertDialogCreate = new CustomAlertDialog.Builder(context).setTitle("Warning").setMessage(str2).setPositiveButton("Cancel", new DialogInterface.OnClickListener() { // from class: kvp
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.lambda$onJsConfirm$0(jsResult, dialogInterface, i);
            }
        }).setNegativeButton("Ok", new DialogInterface.OnClickListener() { // from class: lvp
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.lambda$onJsConfirm$1(jsResult, dialogInterface, i);
            }
        }).create();
        customAlertDialogCreate.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: mvp
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.a.lambda$onJsConfirm$2(jsResult, dialogInterface);
            }
        });
        customAlertDialogCreate.show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        this.jsResult = jsPromptResult;
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    @Override // com.sportybet.plugin.webcontainer.callback.LDBaseChromeClient, android.webkit.WebChromeClient
    public /* bridge */ /* synthetic */ void onPermissionRequest(PermissionRequest permissionRequest) {
        super.onPermissionRequest(permissionRequest);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        BaseWebViewActivity baseWebViewActivity = (BaseWebViewActivity) getActivity(BaseWebViewActivity.class);
        if (baseWebViewActivity != null) {
            if (baseWebViewActivity.getProgressBar().getVisibility() != 0 && i != 100) {
                baseWebViewActivity.getProgressBar().setVisibility(0);
            }
            baseWebViewActivity.getProgressBar().setProgress(i);
            if (i == 100) {
                baseWebViewActivity.getProgressBar().postDelayed(new Runnable() { // from class: com.sportybet.plugin.webcontainer.callback.LDWebChromeClient.2
                    @Override // java.lang.Runnable
                    public void run() {
                        BaseWebViewActivity baseWebViewActivity2 = (BaseWebViewActivity) LDWebChromeClient.this.getActivity(BaseWebViewActivity.class);
                        if (baseWebViewActivity2 == null || baseWebViewActivity2.getProgressBar() == null) {
                            return;
                        }
                        baseWebViewActivity2.getProgressBar().setVisibility(8);
                    }
                }, 500L);
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        BaseWebViewActivity baseWebViewActivity = (BaseWebViewActivity) getActivity(BaseWebViewActivity.class);
        if (baseWebViewActivity == null || baseWebViewActivity.hasCustomTitle()) {
            return;
        }
        baseWebViewActivity.setTitle(str);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        BaseWebViewActivity baseWebViewActivity = (BaseWebViewActivity) getActivity(BaseWebViewActivity.class);
        if (baseWebViewActivity != null) {
            baseWebViewActivity.setUploadFileHigh(valueCallback);
        }
        if (fileChooserParams == null || !fileChooserParams.isCaptureEnabled()) {
            openChooserActivity();
            return true;
        }
        openCamera(valueCallback);
        return true;
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        BaseWebViewActivity baseWebViewActivity = (BaseWebViewActivity) getActivity(BaseWebViewActivity.class);
        if (baseWebViewActivity != null) {
            baseWebViewActivity.setUploadFile(valueCallback);
        }
        openChooserActivity();
    }

    public void openFileChooser(ValueCallback valueCallback, String str) {
        openFileChooser(valueCallback, str, null);
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback) {
        openFileChooser(valueCallback, "*/*");
    }
}
