package com.sportybet.android.livegame;

import android.accounts.Account;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.livegame.LiveGameActivity;
import com.sportybet.android.user.LoadingView;
import com.sportybet.android.virtual.presentation.widget.TitleBar;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.plugin.webcontainer.utils.DeviceInfo;
import com.sportybet.plugin.webcontainer.utils.Server;
import defpackage.c0n;
import defpackage.cbg;
import defpackage.fdt;
import defpackage.gzi0;
import defpackage.i0j0;
import defpackage.i2i;
import defpackage.i8;
import defpackage.itf0;
import defpackage.lfy;
import defpackage.ons;
import defpackage.pu0;
import defpackage.r5b;
import defpackage.rul;
import defpackage.tit;
import defpackage.uy0;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class LiveGameActivity extends rul implements Subscriber, View.OnClickListener, tit {
    public static final /* synthetic */ int B = 0;
    public cbg A;
    public WebView b;
    public TitleBar c;
    public a d;
    public final ons e = new i8() { // from class: ons
        @Override // defpackage.i8
        public final void onAccountChange(Account account) {
            int i = LiveGameActivity.B;
            this.a.c.a();
        }
    };
    public LoadingView f;
    public String i;
    public FrameLayout v;
    public c0n w;
    public uy0 y;
    public gzi0 z;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.a("[Live Game], onReceive action=%s", action);
            if (action.equals("com.sportybet.action.JS_EVENT")) {
                String stringExtra = intent.getStringExtra("eventName");
                if (stringExtra != null) {
                    aVar.q(MyLog.TAG_COMMON);
                    aVar.a("[Live Game], onReceive reason=%s", stringExtra);
                }
                if (stringExtra == null || !stringExtra.equals("refreshBalance")) {
                    return;
                }
                LiveGameActivity.this.y.g();
            }
        }
    }

    public class c extends WebChromeClient {
        public View a;
        public WebChromeClient.CustomViewCallback b;

        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            return false;
        }

        @Override // android.webkit.WebChromeClient
        public final void onHideCustomView() {
            LiveGameActivity liveGameActivity = LiveGameActivity.this;
            liveGameActivity.b.setVisibility(0);
            View view = this.a;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            liveGameActivity.c.setVisibility(0);
            liveGameActivity.v.removeView(this.a);
            this.b.onCustomViewHidden();
            this.a = null;
            liveGameActivity.setRequestedOrientation(1);
            super.onHideCustomView();
        }

        @Override // android.webkit.WebChromeClient
        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            super.onShowCustomView(view, customViewCallback);
            if (this.a != null) {
                customViewCallback.onCustomViewHidden();
                return;
            }
            this.a = view;
            LiveGameActivity liveGameActivity = LiveGameActivity.this;
            liveGameActivity.c.setVisibility(8);
            liveGameActivity.v.addView(this.a);
            this.b = customViewCallback;
            liveGameActivity.b.setVisibility(8);
            liveGameActivity.setRequestedOrientation(0);
        }
    }

    @Override // defpackage.r1k
    public final boolean onBackPressedCompat() {
        if (!this.b.canGoBack()) {
            return false;
        }
        this.b.goBack();
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.login) {
            getAccountHelper().demandAccount(this, this);
        } else if (view.getId() == R.id.register) {
            getAccountHelper().demandNewAccount(this, this);
        } else if (view.getId() == R.id.icon) {
            finish();
        }
    }

    @Override // defpackage.fq0, defpackage.rn8, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        if (i == 1) {
            getWindow().clearFlags(1024);
            getWindow().addFlags(2048);
        } else {
            if (i != 2) {
                return;
            }
            getWindow().clearFlags(2048);
            getWindow().addFlags(1024);
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_live_game);
        if (getIntent() != null) {
            this.i = getIntent().getStringExtra("URL");
        }
        LoadingView loadingView = (LoadingView) findViewById(R.id.loading);
        this.f = loadingView;
        loadingView.setBackgroundColor(-1);
        IntentFilter intentFilter = new IntentFilter("com.sportybet.action.JS_EVENT");
        this.d = new a();
        fdt.a(this).b(this.d, intentFilter);
        TitleBar titleBar = (TitleBar) findViewById(R.id.title_bar);
        this.c = titleBar;
        titleBar.findViewById(R.id.login).setOnClickListener(this);
        this.c.findViewById(R.id.register).setOnClickListener(this);
        this.c.findViewById(R.id.icon).setOnClickListener(this);
        this.b = (WebView) findViewById(R.id.web_view);
        this.v = (FrameLayout) findViewById(R.id.mFrameLayout);
        this.b.clearHistory();
        this.b.getSettings().setSupportZoom(true);
        this.b.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.b.getSettings().setSupportMultipleWindows(true);
        this.b.getSettings().setJavaScriptEnabled(true);
        this.b.getSettings().setSavePassword(false);
        this.b.getSettings().setDomStorageEnabled(true);
        this.A.b();
        this.b.resumeTimers();
        this.b.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.z.a(this.b);
        this.b.clearCache(false);
        this.b.getSettings().setBuiltInZoomControls(true);
        DeviceInfo deviceInfo = DeviceInfo.getInstance();
        if (deviceInfo.isWapApn(this)) {
            Server proxyServer = deviceInfo.getApn(this).getProxyServer();
            this.b.setHttpAuthUsernamePassword(proxyServer.getAddress(), proxyServer.getPort() + "", "", "");
        } else {
            this.b.setHttpAuthUsernamePassword("", "", "", "");
        }
        i0j0 i0j0Var = this.webViewWrapperService;
        if (i0j0Var == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(getCMSString(R.string.app_common__link_error, new Object[0]));
            builder.setMessage(getCMSString(R.string.common_feedback__please_contact_our_customer_service_for_help, new Object[0]));
            builder.setPositiveButton(getCMSString(R.string.common_functions__ok, new Object[0]), new DialogInterface.OnClickListener() { // from class: qns
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    int i2 = LiveGameActivity.B;
                    this.a.finish();
                }
            });
            builder.create().show();
        } else {
            i0j0Var.installJsBridge(this, this.b, new b(), new c());
            ProgressDialog progressDialog = new ProgressDialog(this, R.style.BrandProgressDialogTheme);
            progressDialog.setTitle((CharSequence) null);
            progressDialog.setMessage(getCMSString(R.string.page_payment__being_processed_dot, new Object[0]));
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(true);
            progressDialog.setOnCancelListener(null);
            this.w.c(this.b, this.i);
            r5b r5bVarB = i2i.b(this.y.h(pu0.b.a));
            final TitleBar titleBar2 = this.c;
            Objects.requireNonNull(titleBar2);
            r5bVarB.f(this, new lfy() { // from class: pns
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.lfy
                public final void u1(Object obj) {
                    lk50 lk50Var = (lk50) obj;
                    TextView textView = titleBar2.c;
                    if (lk50Var instanceof lk50.c) {
                        textView.setText(a8b.a(bjb0.U(((AssetsInfo) ((lk50.c) lk50Var).a).balance, Locale.US)));
                    } else {
                        textView.setText("--");
                    }
                }
            });
        }
        this.accountHelper.addAccountChangeListener(this.e);
        this.c.a();
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        i0j0 i0j0Var = this.webViewWrapperService;
        if (i0j0Var != null) {
            i0j0Var.uninstallJsBridge(this.b);
        }
        ((ViewGroup) this.b.getParent()).removeView(this.b);
        this.b.destroy();
        if (this.d != null) {
            fdt.a(this).d(this.d);
            this.d = null;
        }
        this.accountHelper.removeAccountChangeListener(this.e);
        super.onDestroy();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.b.onPause();
    }

    @Override // com.sportybet.ntespm.socket.Subscriber
    public final void onReceive(String str) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_COMMON);
        aVar.a("[Live Game], Refresh balance, onReceive =%s", str);
        try {
            if ("reload_balanace".equals(new JSONObject(str).getString("type"))) {
                this.y.g();
            }
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.b.onResume();
    }

    @Override // defpackage.tit
    public final void w(Account account, boolean z) {
        this.c.a();
        if (account != null) {
            this.f.setVisibility(0);
            this.b.reload();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            LiveGameActivity.this.f.setVisibility(8);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest != null) {
                LiveGameActivity.this.f.setVisibility(8);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            LiveGameActivity.this.f.setVisibility(8);
        }
    }
}
