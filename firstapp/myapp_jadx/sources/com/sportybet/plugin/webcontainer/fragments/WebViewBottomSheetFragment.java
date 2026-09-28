package com.sportybet.plugin.webcontainer.fragments;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.b;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.WebviewEffect;
import com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity;
import com.sportybet.plugin.webcontainer.callback.LDDownloadListener;
import com.sportybet.plugin.webcontainer.callback.LDGoBackWebViewClient;
import com.sportybet.plugin.webcontainer.callback.LDWebChromeClient;
import com.sportybet.plugin.webcontainer.callback.LDWebViewClient;
import com.sportybet.plugin.webcontainer.fragments.WebViewBottomSheetFragment;
import com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin;
import com.sportybet.plugin.webcontainer.jsbridge.service.JSPluginService;
import com.sportybet.plugin.webcontainer.utils.DeviceInfo;
import com.sportybet.plugin.webcontainer.utils.Server;
import com.sportybet.plugin.webcontainer.viewmodel.WebViewViewModel;
import defpackage.a1s;
import defpackage.a390;
import defpackage.c0d;
import defpackage.c0n;
import defpackage.c8i0;
import defpackage.cbg;
import defpackage.d630;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.evp;
import defpackage.fdt;
import defpackage.g5e;
import defpackage.gzi0;
import defpackage.h0j0;
import defpackage.hb5;
import defpackage.hwr;
import defpackage.i6i0;
import defpackage.ib5;
import defpackage.ibs;
import defpackage.itf0;
import defpackage.jq40;
import defpackage.kzh;
import defpackage.m850;
import defpackage.ohp;
import defpackage.psm;
import defpackage.q8i0;
import defpackage.qag;
import defpackage.s9s;
import defpackage.str;
import defpackage.tje0;
import defpackage.ttr;
import defpackage.ui60;
import defpackage.uj50;
import defpackage.uqm;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.vj5;
import defpackage.wyi;
import defpackage.y5b;
import defpackage.yrh0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u008a\u00012\u00020\u0001:\u0004\u008a\u0001\u008b\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0003J!\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0019\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u0016J-\u0010\"\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\tH\u0002¢\u0006\u0004\b&\u0010\u0003J\u000f\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\b'\u0010\u0003J\u000f\u0010(\u001a\u00020\tH\u0002¢\u0006\u0004\b(\u0010\u0003J\u000f\u0010)\u001a\u00020\tH\u0002¢\u0006\u0004\b)\u0010\u0003J\u000f\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b*\u0010\u0003J\u0011\u0010,\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\b,\u0010-R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\"\u0010;\u001a\u00020:8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010B\u001a\u00020A8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010I\u001a\u00020H8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR(\u0010P\u001a\b\u0012\u0004\u0012\u00020\u001d0O8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010W\u001a\u00020V8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010^\u001a\u00020]8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010e\u001a\u00020d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010l\u001a\u00020k8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010s\u001a\u00020r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010yR\u0016\u0010{\u001a\u00020z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010}\u001a\u00020z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010|R\u0019\u0010\u007f\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001c\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001c\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R \u0010\u0088\u0001\u001a\t\u0018\u00010\u0087\u0001R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001¨\u0006\u008c\u0001"}, d2 = {"Lcom/sportybet/plugin/webcontainer/fragments/WebViewBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lcom/google/android/material/bottomsheet/b;", "onCreateDialog", "(Landroid/os/Bundle;)Lcom/google/android/material/bottomsheet/b;", "", "onStart", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "onDestroyView", "initTitleBar", "initWebView", "bundle", "refreshPage", "(Landroid/os/Bundle;)V", "setTitle", "", "title", "setSheetTitle", "(Ljava/lang/CharSequence;)V", "setCookies", "Landroid/webkit/CookieManager;", "cookieManager", "", "url", "keyValuePair", "setCookie", "(Landroid/webkit/CookieManager;Ljava/lang/String;Ljava/lang/String;)V", "getCookieUrlForCMSLanguageCode", "(Ljava/lang/String;)Ljava/lang/String;", "collectEffect", "registerReceivers", "unregisterReceivers", "clearJsPluginWebViewReference", "clearWebViewCookies", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "Lwyi;", "binding$delegate", "Li6i0;", "getBinding", "()Lwyi;", "binding", "Lcom/sportybet/plugin/webcontainer/viewmodel/WebViewViewModel;", "webViewViewModel$delegate", "Lttr;", "getWebViewViewModel", "()Lcom/sportybet/plugin/webcontainer/viewmodel/WebViewViewModel;", "webViewViewModel", "Luqm;", "accountHelper", "Luqm;", "getAccountHelper", "()Luqm;", "setAccountHelper", "(Luqm;)V", "Lpsm;", "countryButler", "Lpsm;", "getCountryButler", "()Lpsm;", "setCountryButler", "(Lpsm;)V", "Lc0n;", "urlTool", "Lc0n;", "getUrlTool", "()Lc0n;", "setUrlTool", "(Lc0n;)V", "Lstr;", "cookieManagerLazy", "Lstr;", "getCookieManagerLazy", "()Lstr;", "setCookieManagerLazy", "(Lstr;)V", "Lcbg;", "environmentManager", "Lcbg;", "getEnvironmentManager", "()Lcbg;", "setEnvironmentManager", "(Lcbg;)V", "Levp$a;", "ldjsServiceFactory", "Levp$a;", "getLdjsServiceFactory", "()Levp$a;", "setLdjsServiceFactory", "(Levp$a;)V", "Lcom/sportybet/plugin/webcontainer/callback/LDWebViewClient$Factory;", "ldWebViewClientFactory", "Lcom/sportybet/plugin/webcontainer/callback/LDWebViewClient$Factory;", "getLdWebViewClientFactory", "()Lcom/sportybet/plugin/webcontainer/callback/LDWebViewClient$Factory;", "setLdWebViewClientFactory", "(Lcom/sportybet/plugin/webcontainer/callback/LDWebViewClient$Factory;)V", "Lcom/sportybet/plugin/webcontainer/callback/LDGoBackWebViewClient$Factory;", "stayOnPageClientFactory", "Lcom/sportybet/plugin/webcontainer/callback/LDGoBackWebViewClient$Factory;", "getStayOnPageClientFactory", "()Lcom/sportybet/plugin/webcontainer/callback/LDGoBackWebViewClient$Factory;", "setStayOnPageClientFactory", "(Lcom/sportybet/plugin/webcontainer/callback/LDGoBackWebViewClient$Factory;)V", "Lcom/sportybet/plugin/webcontainer/jsbridge/service/JSPluginService;", "jsPluginService", "Lcom/sportybet/plugin/webcontainer/jsbridge/service/JSPluginService;", "getJsPluginService", "()Lcom/sportybet/plugin/webcontainer/jsbridge/service/JSPluginService;", "setJsPluginService", "(Lcom/sportybet/plugin/webcontainer/jsbridge/service/JSPluginService;)V", "Ljava/lang/String;", "", "isDestroy", "Z", "hasCustomTitleText", "Levp;", "jsBridgeService", "Levp;", "Lcom/sportybet/plugin/webcontainer/callback/LDWebViewClient;", "client", "Lcom/sportybet/plugin/webcontainer/callback/LDWebViewClient;", "Lcom/sportybet/plugin/webcontainer/callback/LDWebChromeClient;", "chromeClient", "Lcom/sportybet/plugin/webcontainer/callback/LDWebChromeClient;", "Lcom/sportybet/plugin/webcontainer/fragments/WebViewBottomSheetFragment$WebViewCommandReceiver;", "webViewCommandReceiver", "Lcom/sportybet/plugin/webcontainer/fragments/WebViewBottomSheetFragment$WebViewCommandReceiver;", "Companion", "WebViewCommandReceiver", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class WebViewBottomSheetFragment extends Hilt_WebViewBottomSheetFragment {
    private static final float SHEET_HEIGHT_RATIO = 0.8f;
    public static final String TAG = "WebViewBottomSheet";
    public uqm accountHelper;

    /* JADX INFO: renamed from: binding$delegate, reason: from kotlin metadata */
    private final i6i0 binding;
    private LDWebChromeClient chromeClient;
    private LDWebViewClient client;
    public str<CookieManager> cookieManagerLazy;
    public psm countryButler;
    public cbg environmentManager;
    private boolean hasCustomTitleText;
    private boolean isDestroy;
    private evp jsBridgeService;
    public JSPluginService jsPluginService;
    public LDWebViewClient.Factory ldWebViewClientFactory;
    public evp.a ldjsServiceFactory;
    public LDGoBackWebViewClient.Factory stayOnPageClientFactory;
    private String url;
    public c0n urlTool;
    private WebViewCommandReceiver webViewCommandReceiver;

    /* JADX INFO: renamed from: webViewViewModel$delegate, reason: from kotlin metadata */
    private final ttr webViewViewModel;
    static final /* synthetic */ ohp<Object>[] $$delegatedProperties = {new d630(0, WebViewBottomSheetFragment.class, "binding", "getBinding()Lcom/sportybet/android/databinding/FragmentWebViewBottomSheetBinding;")};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007b\u0002\b\u000fJ\u0014\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007b\u0002\b\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/sportybet/plugin/webcontainer/fragments/WebViewBottomSheetFragment$Companion;", "", "<init>", "()V", "TAG", "", "SHEET_HEIGHT_RATIO", "", "newInstance", "Lcom/sportybet/plugin/webcontainer/fragments/WebViewBottomSheetFragment;", "url", "titleId", "", "stayOnPageWhenDeepLinkTriggered", "", "Lkotlin/jvm/JvmStatic;", "args", "Landroid/os/Bundle;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ WebViewBottomSheetFragment newInstance$default(Companion companion, String str, int i, boolean z, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                z = false;
            }
            return companion.newInstance(str, i, z);
        }

        public final WebViewBottomSheetFragment newInstance(String url, int titleId, boolean stayOnPageWhenDeepLinkTriggered) {
            url.getClass();
            WebViewBottomSheetFragment webViewBottomSheetFragment = new WebViewBottomSheetFragment();
            webViewBottomSheetFragment.setArguments(vj5.a(new Pair("url", url), new Pair("title_id", Integer.valueOf(titleId)), new Pair("stay_on_page_when_deep_link_triggered", Boolean.valueOf(stayOnPageWhenDeepLinkTriggered))));
            return webViewBottomSheetFragment;
        }

        private Companion() {
        }

        public final WebViewBottomSheetFragment newInstance(Bundle args) {
            args.getClass();
            WebViewBottomSheetFragment webViewBottomSheetFragment = new WebViewBottomSheetFragment();
            webViewBottomSheetFragment.setArguments(new Bundle(args));
            return webViewBottomSheetFragment;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/sportybet/plugin/webcontainer/fragments/WebViewBottomSheetFragment$WebViewCommandReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lcom/sportybet/plugin/webcontainer/fragments/WebViewBottomSheetFragment;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public final class WebViewCommandReceiver extends BroadcastReceiver {
        public WebViewCommandReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            context.getClass();
            intent.getClass();
            String stringExtra = intent.getStringExtra("eventName");
            if (stringExtra != null) {
                int iHashCode = stringExtra.hashCode();
                if (iHashCode != -1241591313) {
                    if (iHashCode == 591337921 && stringExtra.equals("finishWeb")) {
                        WebViewBottomSheetFragment.this.dismissAllowingStateLoss();
                        return;
                    }
                    return;
                }
                if (stringExtra.equals("goBack")) {
                    WebView webView = WebViewBottomSheetFragment.this.getWebView();
                    if (webView == null || !webView.canGoBack()) {
                        WebViewBottomSheetFragment.this.dismissAllowingStateLoss();
                    } else {
                        webView.goBack();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.sportybet.plugin.webcontainer.fragments.WebViewBottomSheetFragment$collectEffect$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv5b;", "", "<anonymous>", "(Lv5b;)V"}, k = 3, mv = {2, 4, 0})
    @c0d(c = "com.sportybet.plugin.webcontainer.fragments.WebViewBottomSheetFragment$collectEffect$1", f = "WebViewBottomSheetFragment.kt", l = {364}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        final /* synthetic */ ibs $owner;
        int label;
        final /* synthetic */ WebViewBottomSheetFragment this$0;

        /* JADX INFO: renamed from: com.sportybet.plugin.webcontainer.fragments.WebViewBottomSheetFragment$collectEffect$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv5b;", "", "<anonymous>", "(Lv5b;)V"}, k = 3, mv = {2, 4, 0})
        @c0d(c = "com.sportybet.plugin.webcontainer.fragments.WebViewBottomSheetFragment$collectEffect$1$1", f = "WebViewBottomSheetFragment.kt", l = {365}, m = "invokeSuspend", v = 2)
        public static final class C04331 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            int label;
            final /* synthetic */ WebViewBottomSheetFragment this$0;

            /* JADX INFO: renamed from: com.sportybet.plugin.webcontainer.fragments.WebViewBottomSheetFragment$collectEffect$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/sportybet/plugin/webcontainer/WebviewEffect;"}, k = 3, mv = {2, 4, 0}, xi = 48)
            @c0d(c = "com.sportybet.plugin.webcontainer.fragments.WebViewBottomSheetFragment$collectEffect$1$1$1", f = "WebViewBottomSheetFragment.kt", l = {}, m = "invokeSuspend", v = 2)
            public static final class C04341 extends tje0 implements Function2<WebviewEffect, v1b<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ WebViewBottomSheetFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C04341(WebViewBottomSheetFragment webViewBottomSheetFragment, v1b<? super C04341> v1bVar) {
                    super(2, v1bVar);
                    this.this$0 = webViewBottomSheetFragment;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    C04341 c04341 = new C04341(this.this$0, v1bVar);
                    c04341.L$0 = obj;
                    return c04341;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(WebviewEffect webviewEffect, v1b<? super Unit> v1bVar) {
                    return ((C04341) create(webviewEffect, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    WebviewEffect webviewEffect = (WebviewEffect) this.L$0;
                    y5b y5bVar = y5b.a;
                    if (this.label != 0) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                    if (webviewEffect instanceof WebviewEffect.Leave) {
                        this.this$0.dismissAllowingStateLoss();
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04331(WebViewBottomSheetFragment webViewBottomSheetFragment, v1b<? super C04331> v1bVar) {
                super(2, v1bVar);
                this.this$0 = webViewBottomSheetFragment;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C04331(this.this$0, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C04331) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.label;
                if (i == 0) {
                    uj50.b(obj);
                    a390<WebviewEffect> effect = this.this$0.getWebViewViewModel().getEffect();
                    C04341 c04341 = new C04341(this.this$0, null);
                    this.label = 1;
                    if (kzh.b(effect, c04341, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ibs ibsVar, WebViewBottomSheetFragment webViewBottomSheetFragment, v1b<? super AnonymousClass1> v1bVar) {
            super(2, v1bVar);
            this.$owner = ibsVar;
            this.this$0 = webViewBottomSheetFragment;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new AnonymousClass1(this.$owner, this.this$0, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((AnonymousClass1) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.label;
            if (i == 0) {
                uj50.b(obj);
                ibs ibsVar = this.$owner;
                s9s.b bVar = s9s.b.d;
                C04331 c04331 = new C04331(this.this$0, null);
                this.label = 1;
                if (m850.b(ibsVar, bVar, c04331, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: com.sportybet.plugin.webcontainer.fragments.WebViewBottomSheetFragment$initWebView$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/sportybet/plugin/webcontainer/fragments/WebViewBottomSheetFragment$initWebView$2", "Lcom/sportybet/plugin/webcontainer/callback/LDWebChromeClient;", "onReceivedTitle", "", "view", "Landroid/webkit/WebView;", "htmlTitle", "", "onProgressChanged", "newProgress", "", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class AnonymousClass2 extends LDWebChromeClient {
        final /* synthetic */ ProgressBar $progressLine;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ProgressBar progressBar, Context context) {
            super(context, Boolean.FALSE);
            this.$progressLine = progressBar;
        }

        @Override // com.sportybet.plugin.webcontainer.callback.LDWebChromeClient, android.webkit.WebChromeClient
        public void onProgressChanged(WebView view, int newProgress) {
            view.getClass();
            super.onProgressChanged(view, newProgress);
            if (this.$progressLine.getVisibility() != 0 && newProgress != 100) {
                this.$progressLine.setVisibility(0);
            }
            this.$progressLine.setProgress(newProgress);
            if (newProgress == 100) {
                final ProgressBar progressBar = this.$progressLine;
                progressBar.postDelayed(new Runnable() { // from class: fzi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        progressBar.setVisibility(8);
                    }
                }, 500L);
            }
        }

        @Override // com.sportybet.plugin.webcontainer.callback.LDWebChromeClient, android.webkit.WebChromeClient
        public void onReceivedTitle(WebView view, String htmlTitle) {
            view.getClass();
            htmlTitle.getClass();
            super.onReceivedTitle(view, htmlTitle);
            if (WebViewBottomSheetFragment.this.hasCustomTitleText) {
                return;
            }
            WebViewBottomSheetFragment.this.setSheetTitle(htmlTitle);
        }
    }

    public WebViewBottomSheetFragment() {
        super(R.layout.fragment_web_view_bottom_sheet);
        this.binding = g5e.a(WebViewBottomSheetFragment$binding$2.INSTANCE);
        ttr ttrVarA = hwr.a(a1s.c, new WebViewBottomSheetFragment$special$$inlined$viewModels$default$2(new WebViewBottomSheetFragment$special$$inlined$viewModels$default$1(this)));
        this.webViewViewModel = new q8i0(jq40.a(WebViewViewModel.class), new WebViewBottomSheetFragment$special$$inlined$viewModels$default$3(ttrVarA), new WebViewBottomSheetFragment$special$$inlined$viewModels$default$5(this, ttrVarA), new WebViewBottomSheetFragment$special$$inlined$viewModels$default$4(null, ttrVarA));
    }

    private final void clearJsPluginWebViewReference() {
        Collection<LDJSPlugin> collectionValues = getJsPluginService().getJSPlugins().values();
        collectionValues.getClass();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((LDJSPlugin) it.next()).webView = null;
        }
    }

    private final void clearWebViewCookies() {
        try {
            getCookieManagerLazy().get().removeAllCookies(null);
        } catch (Exception e) {
            itf0.a.f(e, "Failed to clear WebView cookies: %s", e.getMessage());
        }
    }

    private final void collectEffect() {
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new AnonymousClass1(viewLifecycleOwner, this, null), 3);
    }

    private final wyi getBinding() {
        return (wyi) this.binding.a(this, $$delegatedProperties[0]);
    }

    private final String getCookieUrlForCMSLanguageCode(String url) {
        try {
            Uri uri = Uri.parse(url);
            return new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).build().toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WebView getWebView() {
        View view = getView();
        if (view != null) {
            return (WebView) view.findViewById(R.id.webview);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WebViewViewModel getWebViewViewModel() {
        return (WebViewViewModel) this.webViewViewModel.getValue();
    }

    private final void initTitleBar() {
        getBinding().b.setOnClickListener(new ui60(this, 1));
    }

    private final void initWebView() {
        LDWebViewClient lDWebViewClientCreate;
        WebView webView = getBinding().e;
        ProgressBar progressBar = getBinding().c;
        int i = requireArguments().getInt(BaseWebViewActivity.DATA_PROGRESSBAR_COLOR, 0);
        progressBar.setVisibility(0);
        if (i != 0) {
            progressBar.setProgressDrawable(new ClipDrawable(new ColorDrawable(i), 51, 1));
        }
        WebSettings settings = webView.getSettings();
        settings.setSupportZoom(true);
        settings.setAllowFileAccess(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        getEnvironmentManager().b();
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setGeolocationEnabled(true);
        settings.setBuiltInZoomControls(true);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ((gzi0.a) qag.a(contextRequireContext, gzi0.a.class)).x().a(webView);
        webView.clearCache(false);
        webView.resumeTimers();
        DeviceInfo deviceInfo = DeviceInfo.getInstance();
        if (deviceInfo.isWapApn(requireContext())) {
            Server proxyServer = deviceInfo.getApn(requireContext()).getProxyServer();
            webView.setHttpAuthUsernamePassword(proxyServer.getAddress(), String.valueOf(proxyServer.getPort()), "", "");
        } else {
            webView.setHttpAuthUsernamePassword("", "", "", "");
        }
        Bundle arguments = getArguments();
        boolean z = arguments != null ? arguments.getBoolean("stay_on_page_when_deep_link_triggered", false) : false;
        this.jsBridgeService = getLdjsServiceFactory().a(webView);
        if (z) {
            LDGoBackWebViewClient.Factory stayOnPageClientFactory = getStayOnPageClientFactory();
            evp evpVar = this.jsBridgeService;
            if (evpVar == null) {
                hb5.a("Required value was null.");
                return;
            }
            lDWebViewClientCreate = stayOnPageClientFactory.create(evpVar);
        } else {
            LDWebViewClient.Factory ldWebViewClientFactory = getLdWebViewClientFactory();
            evp evpVar2 = this.jsBridgeService;
            if (evpVar2 == null) {
                hb5.a("Required value was null.");
                return;
            }
            lDWebViewClientCreate = ldWebViewClientFactory.create(evpVar2);
        }
        this.client = lDWebViewClientCreate;
        this.chromeClient = new AnonymousClass2(progressBar, requireContext());
        LDWebViewClient lDWebViewClient = this.client;
        lDWebViewClient.getClass();
        webView.setWebViewClient(lDWebViewClient);
        webView.setDownloadListener(new LDDownloadListener(requireContext()));
        webView.setWebChromeClient(this.chromeClient);
    }

    public static final WebViewBottomSheetFragment newInstance(Bundle bundle) {
        return INSTANCE.newInstance(bundle);
    }

    private final void refreshPage(Bundle bundle) {
        final WebView webView = getWebView();
        if (webView == null) {
            return;
        }
        setTitle(bundle);
        webView.clearHistory();
        final String string = bundle.getString("jumpJs");
        String string2 = bundle.getString("url");
        boolean zEquals = TextUtils.equals(string2, this.url);
        this.url = string2;
        if (zEquals) {
            return;
        }
        final boolean z = !bundle.getBoolean("disable url redirect", false);
        String strD = this.url;
        if (strD == null) {
            return;
        }
        if (!StringsKt.M(strD, getEnvironmentManager().b().i, false)) {
            strD = yrh0.d(c8i0.e(webView), strD);
        }
        final String str = strD;
        webView.post(new Runnable() { // from class: ezi0
            @Override // java.lang.Runnable
            public final void run() {
                WebViewBottomSheetFragment.refreshPage$lambda$0(this.a, z, webView, str, string);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshPage$lambda$0(WebViewBottomSheetFragment webViewBottomSheetFragment, boolean z, final WebView webView, String str, final String str2) {
        if (!webViewBottomSheetFragment.isAdded() || webViewBottomSheetFragment.isDestroy) {
            return;
        }
        if (z) {
            c0n urlTool = webViewBottomSheetFragment.getUrlTool();
            str.getClass();
            urlTool.c(webView, str);
        } else {
            webView.loadUrl(str);
        }
        if (str2 == null || str2.length() == 0) {
            return;
        }
        webView.postDelayed(new Runnable() { // from class: dzi0
            @Override // java.lang.Runnable
            public final void run() {
                WebViewBottomSheetFragment.refreshPage$lambda$0$0(webView, str2);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshPage$lambda$0$0(WebView webView, String str) {
        webView.loadUrl("javascript:window.location.hash=\"" + str + "\"");
    }

    private final void registerReceivers() {
        WebViewCommandReceiver webViewCommandReceiver = new WebViewCommandReceiver();
        this.webViewCommandReceiver = webViewCommandReceiver;
        fdt.a(requireContext()).b(webViewCommandReceiver, new IntentFilter("com.sportybet.action.JS_EVENT"));
    }

    private final void setCookie(CookieManager cookieManager, String url, String keyValuePair) {
        if (cookieManager == null || url == null || url.length() == 0 || keyValuePair == null || keyValuePair.length() == 0) {
            return;
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_WEB);
        aVar.a("set cookie: %s, url: %s", keyValuePair, url);
        cookieManager.setCookie(url, keyValuePair);
    }

    private final void setCookies(Bundle bundle) {
        CookieManager cookieManagerA;
        List<String> listSplit$default;
        WebView webView = getWebView();
        if (webView == null || (cookieManagerA = h0j0.a()) == null) {
            return;
        }
        cookieManagerA.setAcceptThirdPartyCookies(webView, true);
        String string = bundle.getString("url");
        if (string == null) {
            return;
        }
        String languageCode = getAccountHelper().getLanguageCode();
        languageCode.getClass();
        setCookie(cookieManagerA, getCookieUrlForCMSLanguageCode(string), "locale=".concat(languageCode));
        setCookie(cookieManagerA, string, "sb_country=" + getCountryButler().getCountryCode());
        setCookie(cookieManagerA, string, "download-source=google-play-store");
        String string2 = bundle.getString("data_cookies");
        if (string2 == null || (listSplit$default = StringsKt__StringsKt.split$default(string2, new String[]{";"}, false, 0, 6, null)) == null) {
            return;
        }
        for (String str : listSplit$default) {
            if (str.length() > 0) {
                setCookie(cookieManagerA, string, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSheetTitle(CharSequence title) {
        TextView textView = getBinding().d;
        if (title == null) {
            title = "";
        }
        textView.setText(title);
    }

    private final void setTitle(Bundle bundle) {
        String string = bundle.getString("title");
        if (string != null && string.length() != 0) {
            this.hasCustomTitleText = true;
            setSheetTitle(string);
            return;
        }
        int i = bundle.getInt("title_id", -1);
        if (i == -1) {
            this.hasCustomTitleText = false;
        } else {
            this.hasCustomTitleText = true;
            setSheetTitle(getString(i));
        }
    }

    private final void unregisterReceivers() {
        WebViewCommandReceiver webViewCommandReceiver = this.webViewCommandReceiver;
        if (webViewCommandReceiver != null) {
            fdt.a(requireContext()).d(webViewCommandReceiver);
        }
        this.webViewCommandReceiver = null;
    }

    public final uqm getAccountHelper() {
        uqm uqmVar = this.accountHelper;
        if (uqmVar != null) {
            return uqmVar;
        }
        Intrinsics.n("accountHelper");
        throw null;
    }

    public final str<CookieManager> getCookieManagerLazy() {
        str<CookieManager> strVar = this.cookieManagerLazy;
        if (strVar != null) {
            return strVar;
        }
        Intrinsics.n("cookieManagerLazy");
        throw null;
    }

    public final psm getCountryButler() {
        psm psmVar = this.countryButler;
        if (psmVar != null) {
            return psmVar;
        }
        Intrinsics.n("countryButler");
        throw null;
    }

    public final cbg getEnvironmentManager() {
        cbg cbgVar = this.environmentManager;
        if (cbgVar != null) {
            return cbgVar;
        }
        Intrinsics.n("environmentManager");
        throw null;
    }

    public final JSPluginService getJsPluginService() {
        JSPluginService jSPluginService = this.jsPluginService;
        if (jSPluginService != null) {
            return jSPluginService;
        }
        Intrinsics.n("jsPluginService");
        throw null;
    }

    public final LDWebViewClient.Factory getLdWebViewClientFactory() {
        LDWebViewClient.Factory factory = this.ldWebViewClientFactory;
        if (factory != null) {
            return factory;
        }
        Intrinsics.n("ldWebViewClientFactory");
        throw null;
    }

    public final evp.a getLdjsServiceFactory() {
        evp.a aVar = this.ldjsServiceFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("ldjsServiceFactory");
        throw null;
    }

    public final LDGoBackWebViewClient.Factory getStayOnPageClientFactory() {
        LDGoBackWebViewClient.Factory factory = this.stayOnPageClientFactory;
        if (factory != null) {
            return factory;
        }
        Intrinsics.n("stayOnPageClientFactory");
        throw null;
    }

    public final c0n getUrlTool() {
        c0n c0nVar = this.urlTool;
        if (c0nVar != null) {
            return c0nVar;
        }
        Intrinsics.n("urlTool");
        throw null;
    }

    @Override // com.google.android.material.bottomsheet.c, defpackage.yq0, androidx.fragment.app.d
    public b onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        dialogOnCreateDialog.getClass();
        b bVar = (b) dialogOnCreateDialog;
        bVar.g().L(3);
        bVar.g().Y = true;
        bVar.g().Z = false;
        return bVar;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.isDestroy = true;
        unregisterReceivers();
        LDWebChromeClient lDWebChromeClient = this.chromeClient;
        if (lDWebChromeClient != null) {
            lDWebChromeClient.onDestroy();
        }
        this.jsBridgeService = null;
        clearWebViewCookies();
        WebView webView = getWebView();
        if (webView != null) {
            ViewParent parent = webView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(webView);
            }
            webView.removeAllViews();
            webView.destroy();
        }
        clearJsPluginWebViewReference();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        WebView webView = getWebView();
        if (webView != null) {
            webView.onPause();
        }
        evp evpVar = this.jsBridgeService;
        if (evpVar != null) {
            evpVar.a("onWebViewHidden");
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        WebView webView = getWebView();
        if (webView != null) {
            webView.onResume();
        }
        evp evpVar = this.jsBridgeService;
        if (evpVar != null) {
            evpVar.a("onWebViewShow");
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        int i = (int) (getResources().getDisplayMetrics().heightPixels * SHEET_HEIGHT_RATIO);
        Dialog dialog = getDialog();
        ViewGroup.LayoutParams layoutParams = null;
        b bVar = dialog instanceof b ? (b) dialog : null;
        if (bVar == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) bVar.findViewById(R.id.design_bottom_sheet);
        if (frameLayout != null) {
            ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = i;
                layoutParams = layoutParams2;
            }
            frameLayout.setLayoutParams(layoutParams);
        }
        if (frameLayout != null) {
            frameLayout.setBackgroundResource(R.drawable.bg_webview_bottom_sheet);
        }
        if (frameLayout != null) {
            frameLayout.setClipToOutline(true);
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorG = bVar.g();
        bottomSheetBehaviorG.K(i);
        bottomSheetBehaviorG.L(3);
        bottomSheetBehaviorG.Y = true;
        bottomSheetBehaviorG.Z = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        view.getClass();
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null) {
            dismissAllowingStateLoss();
            return;
        }
        initTitleBar();
        initWebView();
        refreshPage(arguments);
        setCookies(arguments);
        registerReceivers();
        collectEffect();
    }

    public final void setAccountHelper(uqm uqmVar) {
        uqmVar.getClass();
        this.accountHelper = uqmVar;
    }

    public final void setCookieManagerLazy(str<CookieManager> strVar) {
        strVar.getClass();
        this.cookieManagerLazy = strVar;
    }

    public final void setCountryButler(psm psmVar) {
        psmVar.getClass();
        this.countryButler = psmVar;
    }

    public final void setEnvironmentManager(cbg cbgVar) {
        cbgVar.getClass();
        this.environmentManager = cbgVar;
    }

    public final void setJsPluginService(JSPluginService jSPluginService) {
        jSPluginService.getClass();
        this.jsPluginService = jSPluginService;
    }

    public final void setLdWebViewClientFactory(LDWebViewClient.Factory factory) {
        factory.getClass();
        this.ldWebViewClientFactory = factory;
    }

    public final void setLdjsServiceFactory(evp.a aVar) {
        aVar.getClass();
        this.ldjsServiceFactory = aVar;
    }

    public final void setStayOnPageClientFactory(LDGoBackWebViewClient.Factory factory) {
        factory.getClass();
        this.stayOnPageClientFactory = factory;
    }

    public final void setUrlTool(c0n c0nVar) {
        c0nVar.getClass();
        this.urlTool = c0nVar;
    }

    public static final WebViewBottomSheetFragment newInstance(String str, int i, boolean z) {
        return INSTANCE.newInstance(str, i, z);
    }
}
