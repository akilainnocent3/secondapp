package com.sportybet.android.globalpay.jumpbank;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.user.LoadingView;
import com.sportybet.android.virtual.presentation.widget.TitleBar;
import defpackage.bb40;
import defpackage.i0j0;
import defpackage.itf0;
import defpackage.py1;
import defpackage.sfp;
import defpackage.tfp;
import defpackage.vd;

/* JADX INFO: loaded from: classes5.dex */
public class JumpBankActivity extends py1 implements View.OnClickListener, bb40 {
    public static final a d = new a();
    public WebView a;
    public LoadingView b;
    public String c;

    public class a extends vd<sfp, tfp> {
        @Override // defpackage.vd
        public final Intent a(Object obj, Context context) {
            Intent intent = new Intent(context, (Class<?>) JumpBankActivity.class);
            intent.putExtra("JUMP_URL", ((sfp) obj).a);
            return intent;
        }

        @Override // defpackage.vd
        public final Object c(Intent intent, int i) {
            return tfp.a.a;
        }
    }

    @Override // defpackage.r1k
    public final boolean onBackPressedCompat() {
        if (!this.a.canGoBack()) {
            return false;
        }
        this.a.goBack();
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.icon) {
            getOnBackPressedDispatcher().d();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_live_game);
        Intent intent = getIntent();
        if (intent != null) {
            this.c = intent.getStringExtra("JUMP_URL");
        }
        if (TextUtils.isEmpty(this.c)) {
            finish();
            return;
        }
        LoadingView loadingView = (LoadingView) findViewById(R.id.loading);
        this.b = loadingView;
        loadingView.setBackgroundColor(-1);
        TitleBar titleBar = (TitleBar) findViewById(R.id.title_bar);
        titleBar.findViewById(R.id.icon).setOnClickListener(this);
        titleBar.findViewById(R.id.balance).setVisibility(8);
        titleBar.findViewById(R.id.login).setVisibility(8);
        titleBar.findViewById(R.id.register).setVisibility(8);
        titleBar.findViewById(R.id.divide_line).setVisibility(8);
        WebView webView = (WebView) findViewById(R.id.web_view);
        this.a = webView;
        i0j0 i0j0Var = this.webViewWrapperService;
        if (i0j0Var == null) {
            finish();
            return;
        }
        i0j0Var.installJsBridge(this, webView, new b(), null);
        ProgressDialog progressDialog = new ProgressDialog(this, R.style.BrandProgressDialogTheme);
        progressDialog.setTitle((CharSequence) null);
        progressDialog.setMessage(getCMSString(R.string.page_payment__being_processed_dot, new Object[0]));
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(true);
        progressDialog.setOnCancelListener(null);
        try {
            this.a.loadUrl(this.c, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        i0j0 i0j0Var = this.webViewWrapperService;
        if (i0j0Var != null) {
            i0j0Var.uninstallJsBridge(this.a);
        }
        WebView webView = this.a;
        if (webView != null) {
            webView.destroy();
        }
        super.onDestroy();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.a.onPause();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.a.onResume();
    }

    public final void z1(String str) {
        Uri uri = Uri.parse(str);
        String queryParameter = uri.getQueryParameter(AnalyticsParam.EVENT_STATUS);
        Intent intent = new Intent();
        if (queryParameter != null) {
            String queryParameter2 = uri.getQueryParameter("amount");
            String queryParameter3 = uri.getQueryParameter("feeAmount");
            intent.putExtra(AnalyticsParam.EVENT_STATUS, queryParameter);
            intent.putExtra("amount", queryParameter2);
            intent.putExtra("feeAmount", queryParameter3);
        }
        setResult(-1, intent);
        finish();
    }

    public class b extends WebViewClient {
        public b() {
        }

        public static void a(String str) {
            itf0.a aVar = itf0.a;
            aVar.q("JumpBankActivity");
            aVar.a(str, new Object[0]);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            JumpBankActivity.this.b.setVisibility(8);
            a("onPageFinished: url = " + str);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            a("onPageStarted: url = " + str);
            a aVar = JumpBankActivity.d;
            if (str.contains("/za/my_accounts/deposit") || str.contains("/za/m/my_accounts/deposit") || str.contains("za/m/close?type=deposit")) {
                JumpBankActivity.this.z1(str);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            JumpBankActivity.this.b.setVisibility(8);
            a("onReceivedError: request.getUrl() = " + webResourceRequest.getUrl());
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            a aVar = JumpBankActivity.d;
            boolean zContains = str.contains("/za/my_accounts/deposit");
            JumpBankActivity jumpBankActivity = JumpBankActivity.this;
            if (zContains || str.contains("/za/m/my_accounts/deposit") || str.contains("za/m/close?type=deposit")) {
                jumpBankActivity.z1(str);
            }
            if (str.contains("mx/m/close")) {
                jumpBankActivity.finish();
            }
            a("shouldOverrideUrlLoading: url = ".concat(str));
            return super.shouldOverrideUrlLoading(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            JumpBankActivity.this.b.setVisibility(8);
            a("onReceivedError: failingUrl = " + str2);
        }
    }
}
