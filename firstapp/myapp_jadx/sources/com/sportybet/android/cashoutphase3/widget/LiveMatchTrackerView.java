package com.sportybet.android.cashoutphase3.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.sporty.android.book.domain.entity.EventSource;
import com.sporty.android.book.domain.entity.SourceType;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.cashoutphase3.widget.LiveMatchTrackerView;
import com.sportybet.android.gp.tz.R;
import defpackage.azd0;
import defpackage.b3;
import defpackage.bmy;
import defpackage.bqe;
import defpackage.c0d;
import defpackage.dbl;
import defpackage.e9p;
import defpackage.ej5;
import defpackage.fse;
import defpackage.gku;
import defpackage.h5e;
import defpackage.hid0;
import defpackage.hkd;
import defpackage.i0j0;
import defpackage.i9p;
import defpackage.ib5;
import defpackage.ils;
import defpackage.itf0;
import defpackage.j1b;
import defpackage.jvd0;
import defpackage.lfb0;
import defpackage.lvs;
import defpackage.mfb0;
import defpackage.pfd;
import defpackage.sa8;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.uqm;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.vos;
import defpackage.w5b;
import defpackage.y5b;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00100\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00064"}, d2 = {"Lcom/sportybet/android/cashoutphase3/widget/LiveMatchTrackerView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getLMTCustomWidgetParams", "()Ljava/lang/String;", "Li0j0;", "c", "Li0j0;", "getWebViewWrapperService", "()Li0j0;", "setWebViewWrapperService", "(Li0j0;)V", "webViewWrapperService", "Llvs;", "d", "Llvs;", "getLiveTrackerWidgetUrlBuilder", "()Llvs;", "setLiveTrackerWidgetUrlBuilder", "(Llvs;)V", "liveTrackerWidgetUrlBuilder", "Lazd0;", "e", "Lazd0;", "getStatisticsWidgetUrlBuilder", "()Lazd0;", "setStatisticsWidgetUrlBuilder", "(Lazd0;)V", "statisticsWidgetUrlBuilder", "Luqm;", "f", "Luqm;", "getAccountHelper", "()Luqm;", "setAccountHelper", "(Luqm;)V", "accountHelper", "", "D", "Z", "isLoadFinished", "()Z", "setLoadFinished", "(Z)V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LiveMatchTrackerView extends Hilt_LiveMatchTrackerView {
    public static final /* synthetic */ int E = 0;
    public jvd0 A;
    public final j1b B;
    public boolean C;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public boolean isLoadFinished;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public i0j0 webViewWrapperService;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public lvs liveTrackerWidgetUrlBuilder;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public azd0 statisticsWidgetUrlBuilder;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public uqm accountHelper;
    public hid0 i;
    public String v;
    public ils w;
    public String y;
    public String z;

    public static final class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            final LiveMatchTrackerView liveMatchTrackerView = LiveMatchTrackerView.this;
            liveMatchTrackerView.setLoadFinished(true);
            if (webView != null) {
                final hid0 hid0Var = liveMatchTrackerView.i;
                if (hid0Var != null) {
                    hid0Var.b.setOnTouchListener(new View.OnTouchListener() { // from class: uos
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            hid0 hid0Var2;
                            int i = LiveMatchTrackerView.E;
                            int action = motionEvent.getAction();
                            hid0 hid0Var3 = hid0Var;
                            if (action == 0) {
                                LiveMatchTrackerView liveMatchTrackerView2 = liveMatchTrackerView;
                                hid0 hid0Var4 = liveMatchTrackerView2.i;
                                if ((hid0Var4 != null && hid0Var4.b.canScrollVertically(1)) || ((hid0Var2 = liveMatchTrackerView2.i) != null && hid0Var2.b.canScrollVertically(-1))) {
                                    hid0Var3.a.getParent().requestDisallowInterceptTouchEvent(true);
                                }
                            } else if (action == 1) {
                                hid0Var3.a.getParent().requestDisallowInterceptTouchEvent(false);
                                return false;
                            }
                            return false;
                        }
                    });
                }
                liveMatchTrackerView.h(liveMatchTrackerView.a(liveMatchTrackerView.y, liveMatchTrackerView.z));
            }
        }
    }

    @c0d(c = "com.sportybet.android.cashoutphase3.widget.LiveMatchTrackerView$showMask$1$1", f = "LiveMatchTrackerView.kt", l = {262}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ hid0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(hid0 hid0Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = hid0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(1000L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            this.b.d.setVisibility(8);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveMatchTrackerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        if (!isInEditMode() && !this.b) {
            this.b = true;
            ((vos) generatedComponent()).u(this);
        }
        this.v = "";
        this.w = ils.NONE;
        this.y = "";
        this.z = "";
        e9p e9pVarA = i9p.a();
        pfd pfdVar = fse.a;
        this.B = w5b.a(CoroutineContext.Element.a.d(e9pVarA, gku.a));
    }

    private final String getLMTCustomWidgetParams() {
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes = "{\"scoreboard\":\"disable\",\"layout\":\"inline\"}".getBytes(charset);
        bytes.getClass();
        String strEncodeToString = Base64.encodeToString(bytes, 0);
        strEncodeToString.getClass();
        return strEncodeToString;
    }

    public final int a(String str, String str2) {
        FrameLayout frameLayout;
        mfb0 mfb0VarE = lfb0.d().e(str2);
        hid0 hid0Var = this.i;
        int width = (hid0Var == null || (frameLayout = hid0Var.c) == null) ? 0 : frameLayout.getWidth();
        if (width <= 0) {
            width = bqe.d();
        }
        float fL = (mfb0VarE != null ? mfb0VarE.l() : 0.0f) * (this.w == ils.LIVE_MATCH_TRACKER ? 1.05f : 0.8f);
        if (!b3.S(str)) {
            return (int) (width * fL);
        }
        float fC = bqe.c();
        return (int) (((width - (16.0f * fC)) * fL) + (154.0f * fC));
    }

    public final void b() {
        this.y = "";
        this.z = "";
        this.w = ils.NONE;
        this.v = "about:blank";
        hid0 hid0Var = this.i;
        if (hid0Var != null) {
            WebView webView = hid0Var.b;
            webView.loadUrl("about:blank");
            webView.clearHistory();
            webView.clearFormData();
            webView.clearCache(true);
            getWebViewWrapperService().uninstallJsBridge(webView);
        }
        jvd0 jvd0Var = this.A;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
    }

    public final void c() {
        if (this.C) {
            return;
        }
        final hid0 hid0Var = this.i;
        if (hid0Var == null) {
            try {
                View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.spr_live_match_tracker, (ViewGroup) this, false);
                addView(viewInflate);
                int i = R.id.live_match_tracker;
                WebView webView = (WebView) h5e.a(R.id.live_match_tracker, viewInflate);
                if (webView != null) {
                    FrameLayout frameLayout = (FrameLayout) viewInflate;
                    View viewA = h5e.a(R.id.mask, viewInflate);
                    if (viewA != null) {
                        hid0Var = new hid0(frameLayout, webView, frameLayout, viewA);
                    } else {
                        i = R.id.mask;
                        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                        hid0Var = null;
                    }
                } else {
                    bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                    hid0Var = null;
                }
                this.i = hid0Var;
            } catch (Exception e) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_LMT);
                aVar.d("Failed to inflate WebView layout: " + e, new Object[0]);
                return;
            }
        }
        try {
            WebView webView2 = hid0Var.b;
            getWebViewWrapperService().uninstallJsBridge(webView2);
            webView2.getSettings().setJavaScriptEnabled(true);
            webView2.getSettings().setDomStorageEnabled(true);
            webView2.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
            webView2.getSettings().setCacheMode(2);
            getWebViewWrapperService().installJsBridge(getRootView().getContext(), webView2, new a(), new WebChromeClient());
            webView2.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: tos
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view, int i2, int i3, int i4, int i5) {
                    hid0 hid0Var2;
                    LiveMatchTrackerView liveMatchTrackerView = this.a;
                    hid0 hid0Var3 = liveMatchTrackerView.i;
                    if (hid0Var3 == null || !hid0Var3.b.canScrollVertically(1) || (hid0Var2 = liveMatchTrackerView.i) == null || !hid0Var2.b.canScrollVertically(-1)) {
                        hid0Var.a.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
            });
            this.C = true;
        } catch (IllegalArgumentException e2) {
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_COMMON);
            aVar2.d("installJsBridge IllegalArgumentException: " + e2, new Object[0]);
        } catch (Exception e3) {
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_COMMON);
            aVar3.d("error on initLiveMatchTrackerView: " + e3, new Object[0]);
        }
    }

    public final void d(String str) {
        try {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_LMT);
            aVar.a("loadUrl ".concat(str), new Object[0]);
            this.v = str;
            hid0 hid0Var = this.i;
            if (hid0Var != null) {
                hid0Var.b.loadUrl(str);
            }
        } catch (Exception e) {
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_LMT);
            aVar2.d("error on playLMTSource: " + e, new Object[0]);
        }
    }

    public final void e(String str, String str2, EventSource eventSource) {
        String strA;
        str.getClass();
        str2.getClass();
        f();
        this.y = str;
        this.z = str2;
        this.w = ils.LIVE_MATCH_TRACKER;
        c();
        int iA = a(str, str2);
        lvs liveTrackerWidgetUrlBuilder = getLiveTrackerWidgetUrlBuilder();
        if (eventSource == null || (strA = eventSource.getSourceId(true)) == null) {
            strA = sa8.a(str);
        }
        String str3 = strA;
        String languageCode = getAccountHelper().getLanguageCode();
        languageCode.getClass();
        String strA2 = liveTrackerWidgetUrlBuilder.a(str, str2, str3, eventSource, languageCode);
        if (this.isLoadFinished && strA2.equals(this.v)) {
            return;
        }
        h(iA);
        d(strA2);
    }

    public final void f() {
        hid0 hid0Var = this.i;
        if (hid0Var != null) {
            hid0Var.d.setVisibility(0);
            jvd0 jvd0Var = this.A;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            this.A = ej5.c(this.B, null, null, new b(hid0Var, null), 3);
        }
    }

    public final void g(String str, String str2, EventSource eventSource) {
        String strC;
        str.getClass();
        str2.getClass();
        f();
        this.y = str;
        this.z = str2;
        this.w = ils.STATS;
        c();
        int iA = a(str, str2);
        if ((eventSource != null ? eventSource.getSourceType(true) : null) == SourceType.LSPORTS) {
            azd0 statisticsWidgetUrlBuilder = getStatisticsWidgetUrlBuilder();
            String languageCode = getAccountHelper().getLanguageCode();
            languageCode.getClass();
            strC = statisticsWidgetUrlBuilder.a(str, eventSource, languageCode, "dark");
        } else {
            lvs liveTrackerWidgetUrlBuilder = getLiveTrackerWidgetUrlBuilder();
            String languageCode2 = getAccountHelper().getLanguageCode();
            languageCode2.getClass();
            String lMTCustomWidgetParams = getLMTCustomWidgetParams();
            dbl dblVar = dbl.V1;
            strC = lvs.c(liveTrackerWidgetUrlBuilder, str, null, eventSource, languageCode2, "dark", null, lMTCustomWidgetParams, 32);
        }
        if (this.isLoadFinished && strC.equals(this.v)) {
            return;
        }
        h(iA);
        d(strC);
    }

    public final uqm getAccountHelper() {
        uqm uqmVar = this.accountHelper;
        if (uqmVar != null) {
            return uqmVar;
        }
        Intrinsics.n("accountHelper");
        throw null;
    }

    public final lvs getLiveTrackerWidgetUrlBuilder() {
        lvs lvsVar = this.liveTrackerWidgetUrlBuilder;
        if (lvsVar != null) {
            return lvsVar;
        }
        Intrinsics.n("liveTrackerWidgetUrlBuilder");
        throw null;
    }

    public final azd0 getStatisticsWidgetUrlBuilder() {
        azd0 azd0Var = this.statisticsWidgetUrlBuilder;
        if (azd0Var != null) {
            return azd0Var;
        }
        Intrinsics.n("statisticsWidgetUrlBuilder");
        throw null;
    }

    public final i0j0 getWebViewWrapperService() {
        i0j0 i0j0Var = this.webViewWrapperService;
        if (i0j0Var != null) {
            return i0j0Var;
        }
        Intrinsics.n("webViewWrapperService");
        throw null;
    }

    public final void h(int i) {
        hid0 hid0Var = this.i;
        if (hid0Var != null) {
            FrameLayout frameLayout = hid0Var.c;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.getClass();
            layoutParams.height = i;
            frameLayout.setLayoutParams(layoutParams);
        }
    }

    public final void setAccountHelper(uqm uqmVar) {
        uqmVar.getClass();
        this.accountHelper = uqmVar;
    }

    public final void setLiveTrackerWidgetUrlBuilder(lvs lvsVar) {
        lvsVar.getClass();
        this.liveTrackerWidgetUrlBuilder = lvsVar;
    }

    public final void setLoadFinished(boolean z) {
        this.isLoadFinished = z;
    }

    public final void setStatisticsWidgetUrlBuilder(azd0 azd0Var) {
        azd0Var.getClass();
        this.statisticsWidgetUrlBuilder = azd0Var;
    }

    public final void setWebViewWrapperService(i0j0 i0j0Var) {
        i0j0Var.getClass();
        this.webViewWrapperService = i0j0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveMatchTrackerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveMatchTrackerView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ LiveMatchTrackerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
