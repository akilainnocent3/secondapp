package com.sportybet.plugin.sportydesk.activities;

import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.permission.PermissionActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.sportydesk.activities.SportyDeskActivity;
import com.sportybet.plugin.sportydesk.widgets.SportyDeskButton;
import com.sportybet.plugin.sportydesk.widgets.SportyDeskWebView;
import com.twilio.voice.Call;
import com.twilio.voice.LogLevel;
import com.twilio.voice.Voice;
import defpackage.bb40;
import defpackage.bnh0;
import defpackage.cw;
import defpackage.cyb;
import defpackage.doi0;
import defpackage.dq7;
import defpackage.ej5;
import defpackage.eoi0;
import defpackage.f00;
import defpackage.hb5;
import defpackage.he00;
import defpackage.hp0;
import defpackage.hqc;
import defpackage.hr10;
import defpackage.i2i;
import defpackage.i88;
import defpackage.iai0;
import defpackage.itf0;
import defpackage.j88;
import defpackage.jq40;
import defpackage.l88;
import defpackage.lfy;
import defpackage.lh2;
import defpackage.nnb0;
import defpackage.nqc;
import defpackage.nuh0;
import defpackage.o7d;
import defpackage.o8i0;
import defpackage.p3m;
import defpackage.psm;
import defpackage.pwx;
import defpackage.r8i0;
import defpackage.rx20;
import defpackage.s8i0;
import defpackage.sh8;
import defpackage.snb0;
import defpackage.t2y;
import defpackage.tce0;
import defpackage.tit;
import defpackage.tnb0;
import defpackage.unb0;
import defpackage.v8i0;
import defpackage.vgb0;
import defpackage.vnb0;
import defpackage.w1k;
import defpackage.wae;
import defpackage.wga;
import defpackage.xnb0;
import defpackage.xxz;
import defpackage.yi5;
import defpackage.ynb0;
import defpackage.zux;
import defpackage.zyf0;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class SportyDeskActivity extends p3m implements pwx, cw, tce0, zux, bb40 {
    public static final /* synthetic */ int H = 0;
    public ynb0 A;
    public psm B;
    public xxz C;
    public rx20 D;
    public yi5 E;
    public bnh0 F;
    public final eoi0 G = new eoi0();
    public ViewGroup v;
    public SportyDeskWebView w;
    public LoadingView y;
    public c z;

    public class a extends WebChromeClient {
        public a() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            if (str2 != null) {
                zyf0.c(0, str2);
            }
            jsResult.cancel();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final void onPermissionRequest(final PermissionRequest permissionRequest) {
            SportyDeskActivity.this.runOnUiThread(new Runnable() { // from class: pnb0
                @Override // java.lang.Runnable
                public final void run() {
                    PermissionRequest permissionRequest2 = permissionRequest;
                    permissionRequest2.grant(permissionRequest2.getResources());
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            SportyDeskActivity.this.B1(valueCallback, fileChooserParams);
            return true;
        }
    }

    public static class c {
        public SportyDeskWebView a;
        public String b;
    }

    public static void D1(String str, String str2) {
        try {
            int iOrdinal = hr10.valueOf(str).ordinal();
            if (iOrdinal == 0) {
                sh8.c().e(o7d.a(wae.DEPOSIT));
                return;
            }
            if (iOrdinal == 1) {
                sh8.c().e(o7d.a(wae.WITHDRAW));
                return;
            }
            if (iOrdinal == 2) {
                sh8.c().e(o7d.a(wae.ME_TRANSACTIONS));
                return;
            }
            if (iOrdinal == 3) {
                sh8.c().e(o7d.a(wae.LIVE_HOST));
            } else if (iOrdinal == 4) {
                sh8.c().e(o7d.a(wae.EVENT_LIST_HOST));
            } else {
                if (iOrdinal != 6) {
                    return;
                }
                sh8.c().e(str2);
            }
        } catch (Exception e) {
            itf0.a.e(e);
        }
    }

    @Override // defpackage.i12
    public final String[] A1() {
        return new String[]{"image/*"};
    }

    public final void C1(long j) {
        if (j > 0) {
            unb0 unb0VarC = unb0.c();
            unb0VarC.a = true;
            tnb0 tnb0Var = unb0VarC.i;
            if (tnb0Var != null) {
                tnb0Var.cancel();
            }
            tnb0 tnb0Var2 = new tnb0(unb0VarC, j * 1000);
            unb0VarC.i = tnb0Var2;
            tnb0Var2.start();
            l88.f().e(unb0VarC);
        } else {
            unb0 unb0VarC2 = unb0.c();
            SportyDeskButton sportyDeskButton = unb0VarC2.d;
            if (sportyDeskButton != null) {
                sportyDeskButton.setVisibility(8);
                unb0VarC2.d = null;
            }
            SportyDeskWebView sportyDeskWebView = unb0VarC2.f;
            if (sportyDeskWebView != null) {
                sportyDeskWebView.destroy();
                unb0VarC2.f = null;
            }
            unb0VarC2.a = false;
            unb0VarC2.b = false;
            unb0VarC2.c = true;
        }
        finish();
    }

    public final void E1(int i, boolean z) {
        this.w.setLoginData(z, getAccountHelper().getLastAccessToken(), i, getAccountHelper().getAvatarUrl());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tce0
    public final void a0(hqc hqcVar) {
        if (hqcVar instanceof nqc) {
            i88 i88Var = (i88) ((nqc) hqcVar).a;
            JSONObject jSONObject = i88Var.c;
            try {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_PLEASED);
                aVar.a("onReceive: %s", i88Var);
                switch (j88.valueOf(i88Var.b).ordinal()) {
                    case 1:
                        SportyDeskWebView sportyDeskWebView = this.w;
                        this.z.getClass();
                        sportyDeskWebView.setInitData(null);
                        break;
                    case 2:
                        if (jSONObject != null) {
                            String strOptString = jSONObject.optString("username");
                            String strOptString2 = jSONObject.optString("password");
                            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                                String strA = this.D.a(strOptString2);
                                ynb0 ynb0Var = this.A;
                                ynb0Var.getClass();
                                strOptString.getClass();
                                strA.getClass();
                                ej5.c(o8i0.d(ynb0Var), null, null, new xnb0(ynb0Var, strOptString, strA, null), 3);
                            }
                            E1(0, false);
                        }
                        break;
                    case 3:
                        getAccountHelper().demandAccount(this, new tit() { // from class: lnb0
                            @Override // defpackage.tit
                            public final void w(Account account, boolean z) {
                                int i = SportyDeskActivity.H;
                                final SportyDeskActivity sportyDeskActivity = this.a;
                                sportyDeskActivity.getAccountHelper().loadAccountInfo(new w8() { // from class: onb0
                                    @Override // defpackage.w8
                                    public final void a(AccountInfo accountInfo, String str, String str2) {
                                        int i2 = SportyDeskActivity.H;
                                        sportyDeskActivity.E1(10000, true);
                                    }
                                });
                            }
                        });
                        break;
                    case 4:
                        C1(jSONObject != null ? jSONObject.optLong("period", 0L) : 0L);
                        break;
                    case 5:
                        C1(0L);
                        break;
                    case 7:
                        sh8.c().e(o7d.a(wae.USER_INFO));
                        break;
                    case 8:
                        SportyDeskWebView sportyDeskWebView2 = this.w;
                        if (sportyDeskWebView2 != null) {
                            sportyDeskWebView2.setAppVoicePermission(he00.b(this, new String[]{"android.permission.RECORD_AUDIO"}));
                        }
                        break;
                    case 9:
                        PermissionActivity.z1(this, new String[]{"android.permission.RECORD_AUDIO"}, new lh2());
                        break;
                    case 10:
                        if (jSONObject != null) {
                            D1(jSONObject.optString("action"), jSONObject.optString(AnalyticsParam.MINI_GAMES_PAGE));
                        }
                        break;
                    case 11:
                        if (jSONObject != null) {
                            this.G.getClass();
                            nuh0 nuh0VarA = eoi0.a(jSONObject);
                            if (!(nuh0VarA instanceof nuh0.a)) {
                                doi0 doi0Var = ((nuh0.b) nuh0VarA).a;
                                if (doi0Var.a) {
                                    unb0.c().d(this, doi0Var);
                                }
                            } else {
                                String str = ((nuh0.a) nuh0VarA).a;
                                zyf0.c(1, "Something went wrong. " + str);
                                aVar.q(MyLog.TAG_PLEASED);
                                aVar.a("Invalid payload: %s", str);
                            }
                        } else {
                            aVar.q(MyLog.TAG_PLEASED);
                            aVar.a("Payload is null", new Object[0]);
                        }
                        break;
                    case 12:
                        unb0 unb0VarC = unb0.c();
                        Call call = unb0VarC.e;
                        if (call != null) {
                            call.disconnect();
                            unb0VarC.e = null;
                            new t2y(this).b.cancel(null, 530000);
                        }
                        break;
                }
            } catch (Exception e) {
                itf0.a.e(e);
            }
        }
    }

    @Override // defpackage.r1k
    public final boolean onBackPressedCompat() {
        SportyDeskWebView sportyDeskWebView = this.w;
        if (sportyDeskWebView == null || !sportyDeskWebView.canGoBack()) {
            C1(0L);
            return true;
        }
        this.w.goBack();
        return true;
    }

    @Override // defpackage.i12, defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c cVar;
        super.onCreate(bundle);
        setContentView(R.layout.activity_sporty_desk);
        snb0 snb0Var = (snb0) getIntent().getSerializableExtra("entry_point");
        if (this.E.b().i()) {
            Voice.setLogLevel(LogLevel.DEBUG);
        }
        String strReplace = "/sportydesk/{country_code}/app".replace("{country_code}", this.B.getCountryCode().getCode());
        bnh0 bnh0Var = this.F;
        bnh0Var.getClass();
        String strA = bnh0Var.a("https", new String[]{strReplace});
        if (String.valueOf(getIntent().getAction()).equals("action_my_requests")) {
            cVar = new c();
            cVar.a = new SportyDeskWebView(this);
            cVar.b = strA.concat("?platform=app#/myrequest");
            this.z = cVar;
        } else {
            if (snb0Var != null && unb0.c().c) {
                f00 f00Var = vgb0.a;
                Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(AnalyticsParam.EVENT_PARAM_SCREEN_NAME, snb0Var.a)};
                HashMap map = new HashMap(1);
                Map.Entry entry = entryArr[0];
                Object key = entry.getKey();
                if (w1k.a(key, entry, map, key) != null) {
                    hb5.a(wga.a(key, "duplicate key: "));
                    return;
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                mapUnmodifiableMap.getClass();
                vgb0.c("android_open_customer_service", mapUnmodifiableMap, false);
                unb0.c().c = false;
            }
            cVar = new c();
            unb0 unb0VarC = unb0.c();
            SportyDeskWebView sportyDeskWebView = unb0VarC.f;
            if (sportyDeskWebView == null) {
                sportyDeskWebView = new SportyDeskWebView(hp0.A);
                unb0VarC.f = sportyDeskWebView;
            }
            cVar.a = sportyDeskWebView;
            cVar.b = strA.concat("?platform=app#/");
            this.z = cVar;
        }
        this.w = cVar.a;
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(ynb0.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        ynb0 ynb0Var = (ynb0) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        this.A = ynb0Var;
        if ((snb0Var == snb0.TICKET_DETAIL || snb0Var == snb0.BET_DETAIL) && this.w != null) {
            ej5.c(o8i0.d(ynb0Var), null, null, new vnb0(ynb0Var, new nnb0(this), null), 3);
        }
        this.w.setWebChromeClient(new a());
        this.w.setWebViewClient(new b());
        WebSettings settings = this.w.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setCacheMode(2);
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        if (TextUtils.isEmpty(this.w.getUrl())) {
            this.w.loadUrl(this.z.b);
        }
        this.v = (ViewGroup) findViewById(R.id.webview_container);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        iai0.a(this.w);
        this.v.addView(this.w, layoutParams);
        this.y = (LoadingView) findViewById(R.id.loading);
        i2i.b(this.A.f).f(this, new lfy() { // from class: mnb0
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                mft mftVar = (mft) obj;
                int i = SportyDeskActivity.H;
                boolean z = mftVar instanceof mft.d;
                SportyDeskActivity sportyDeskActivity = this.a;
                if (z) {
                    sportyDeskActivity.E1(((mft.d) mftVar).b, false);
                    sportyDeskActivity.y.E();
                } else if (mftVar instanceof mft.a) {
                    Integer num = ((mft.a) mftVar).a;
                    sportyDeskActivity.E1(num != null ? num.intValue() : 0, false);
                    sportyDeskActivity.y.E();
                } else if (mftVar instanceof mft.c) {
                    sportyDeskActivity.y.K();
                }
            }
        });
    }

    @Override // defpackage.i12, defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.v.removeAllViews();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = l88.f().a;
        if (arrayList.contains(this)) {
            arrayList.remove(this);
        }
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        l88.f().e(this);
    }

    @Override // defpackage.i12
    public final String z1() {
        return "sporty_desk_tmp.jpg";
    }

    public class b extends WebViewClient {
        public b() {
        }

        public final void a(Uri uri) {
            try {
                boolean zStartsWith = uri.toString().startsWith("mailto:");
                SportyDeskActivity sportyDeskActivity = SportyDeskActivity.this;
                if (zStartsWith) {
                    sportyDeskActivity.startActivity(new Intent("android.intent.action.SENDTO", uri));
                } else if (uri.toString().startsWith("tel:")) {
                    sportyDeskActivity.startActivity(new Intent("android.intent.action.DIAL", uri));
                } else {
                    sportyDeskActivity.startActivity(new Intent("android.intent.action.VIEW", uri));
                }
            } catch (ActivityNotFoundException unused) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_COMMON);
                aVar.g(" activity not found: url =%s", uri.toString());
            } catch (SecurityException e) {
                itf0.a aVar2 = itf0.a;
                aVar2.q(MyLog.TAG_COMMON);
                aVar2.h(e);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            SportyDeskActivity.this.y.E();
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            SportyDeskActivity sportyDeskActivity = SportyDeskActivity.this;
            if (TextUtils.equals(sportyDeskActivity.z.b, str)) {
                sportyDeskActivity.y.K();
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            a(Uri.parse(str));
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            a(webResourceRequest.getUrl());
            return true;
        }
    }
}
