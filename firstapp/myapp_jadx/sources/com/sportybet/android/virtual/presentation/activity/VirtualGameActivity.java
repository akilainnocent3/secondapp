package com.sportybet.android.virtual.presentation.activity;

import android.accounts.Account;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.widget.ActionBar;
import com.sportybet.android.instantwin.router.VirtualGameInput;
import com.sportybet.android.user.LoadingView;
import com.sportybet.android.virtual.presentation.activity.VirtualGameActivity;
import defpackage.a8b;
import defpackage.azm;
import defpackage.c0n;
import defpackage.cyb;
import defpackage.dq7;
import defpackage.e1i;
import defpackage.fdt;
import defpackage.ffi0;
import defpackage.hb5;
import defpackage.i0j0;
import defpackage.i2i;
import defpackage.i7m;
import defpackage.jfi0;
import defpackage.jq40;
import defpackage.k9j;
import defpackage.lfy;
import defpackage.op8;
import defpackage.pu0;
import defpackage.q4p;
import defpackage.r8i0;
import defpackage.rdd0;
import defpackage.s8i0;
import defpackage.tit;
import defpackage.uxo;
import defpackage.uy0;
import defpackage.v340;
import defpackage.v8i0;
import defpackage.zei0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public class VirtualGameActivity extends i7m implements tit, k9j {
    public static final /* synthetic */ int C = 0;
    public azm A;
    public rdd0 B;
    public jfi0 b;
    public WebView c;
    public ActionBar d;
    public b e;
    public LoadingView f;
    public String i;
    public int v;
    public int w;
    public c0n y;
    public uy0 z;

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String stringExtra;
            if (intent.getAction().equals("com.sportybet.action.JS_EVENT") && (stringExtra = intent.getStringExtra("eventName")) != null && stringExtra.equals("refreshBalance")) {
                VirtualGameActivity.this.z.g();
            }
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_virtual_game);
        Intent intent = getIntent();
        if (intent != null) {
            VirtualGameInput virtualGameInput = (VirtualGameInput) uxo.a(intent, "ARG_INPUT", VirtualGameInput.class);
            if (virtualGameInput == null) {
                this.i = "";
                this.v = -1;
                this.w = R.string.common_functions__virtuals;
            } else {
                this.i = virtualGameInput.a;
                this.v = virtualGameInput.b;
                this.w = virtualGameInput.c;
            }
        }
        LoadingView loadingView = (LoadingView) findViewById(R.id.loading);
        this.f = loadingView;
        loadingView.setBackgroundColor(-1);
        IntentFilter intentFilter = new IntentFilter("com.sportybet.action.JS_EVENT");
        this.e = new b();
        fdt.a(this).b(this.e, intentFilter);
        ActionBar actionBar = (ActionBar) findViewById(R.id.action_bar);
        this.d = actionBar;
        actionBar.setBackButton(new ffi0(this));
        q4p q4pVar = this.d.F;
        q4pVar.d.setVisibility(8);
        q4pVar.y.setVisibility(0);
        this.d.setTitle(this.w);
        Account account = getAccountHelper().getAccount();
        ActionBar actionBar2 = this.d;
        if (account != null) {
            actionBar2.setUserInfoButton(null);
            this.d.E();
            this.d.G(true);
        } else {
            actionBar2.G(false);
            q4p q4pVar2 = this.d.F;
            q4pVar2.c.setVisibility(0);
            q4pVar2.f.setVisibility(0);
            q4pVar2.e.setVisibility(0);
            this.d.setLoginListeners(new View.OnClickListener() { // from class: afi0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = VirtualGameActivity.C;
                    VirtualGameActivity virtualGameActivity = this.a;
                    virtualGameActivity.getAccountHelper().demandNewAccount(virtualGameActivity, virtualGameActivity);
                }
            }, new View.OnClickListener() { // from class: bfi0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = VirtualGameActivity.C;
                    VirtualGameActivity virtualGameActivity = this.a;
                    virtualGameActivity.getAccountHelper().demandAccount(virtualGameActivity, virtualGameActivity);
                }
            });
            this.d.setBackButton(new View.OnClickListener() { // from class: cfi0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = VirtualGameActivity.C;
                    this.a.finish();
                }
            });
        }
        this.c = (WebView) findViewById(R.id.web_view);
        i2i.b(this.z.h(pu0.b.a)).f(this, new lfy() { // from class: dfi0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                lk50 lk50Var = (lk50) obj;
                int i = VirtualGameActivity.C;
                if (lk50Var instanceof lk50.c) {
                    AssetsInfo assetsInfo = (AssetsInfo) ((lk50.c) lk50Var).a;
                    VirtualGameActivity virtualGameActivity = this.a;
                    virtualGameActivity.d.E();
                    virtualGameActivity.d.F(assetsInfo, a8b.e());
                }
            }
        });
        i0j0 i0j0Var = this.webViewWrapperService;
        if (i0j0Var == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(getCMSString(R.string.app_common__link_error, new Object[0]));
            builder.setMessage(getCMSString(R.string.common_feedback__please_contact_our_customer_service_for_help, new Object[0]));
            builder.setPositiveButton(getCMSString(R.string.common_functions__ok, new Object[0]), new DialogInterface.OnClickListener() { // from class: efi0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    int i2 = VirtualGameActivity.C;
                    this.a.finish();
                }
            });
            builder.create().show();
        } else {
            i0j0Var.installJsBridge(this, this.c, new a(), null);
            ProgressDialog progressDialog = new ProgressDialog(this, R.style.BrandProgressDialogTheme);
            progressDialog.setTitle((CharSequence) null);
            progressDialog.setMessage(getCMSString(R.string.page_payment__being_processed_dot, new Object[0]));
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(true);
            progressDialog.setOnCancelListener(null);
            String str = this.i;
            if (str != null) {
                this.y.c(this.c, str);
            }
        }
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(jfi0.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.b = (jfi0) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        ComposeView composeView = (ComposeView) findViewById(R.id.composeview_virtual_game_promotion_banner);
        final v340 v340VarB = e1i.b(this.b.b);
        final zei0 zei0Var = new zei0(this);
        composeView.getClass();
        composeView.setContent(new op8(11618802, new Function2() { // from class: y430
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final v340 v340Var = v340VarB;
                    final zei0 zei0Var2 = zei0Var;
                    o0z.a(null, null, null, null, null, pp8.b(-553535647, new Function2() { // from class: z430
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                e530 e530Var = (e530) wyh.c(v340Var, aVar2, 0, 7).getValue();
                                if (e530Var == null) {
                                    aVar2.N(-2000878124);
                                    aVar2.H();
                                } else {
                                    aVar2.N(-2000878123);
                                    d530.a(e530Var, zei0Var2, aVar2, 0);
                                    aVar2.H();
                                }
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        i0j0 i0j0Var = this.webViewWrapperService;
        if (i0j0Var != null) {
            i0j0Var.uninstallJsBridge(this.c);
        }
        ((ViewGroup) this.c.getParent()).removeView(this.c);
        this.c.destroy();
        if (this.e != null) {
            fdt.a(this).d(this.e);
            this.e = null;
        }
        super.onDestroy();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.c.onPause();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.c.onResume();
    }

    @Override // defpackage.tit
    public final void w(Account account, boolean z) {
        if (account != null) {
            this.d.E();
            this.d.F(this.z.c(), a8b.e());
        }
        String str = this.i;
        if (str != null) {
            this.y.c(this.c, str);
        }
    }

    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            VirtualGameActivity.this.f.setVisibility(8);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            VirtualGameActivity.this.f.setVisibility(8);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            VirtualGameActivity.this.f.setVisibility(8);
        }
    }
}
