package com.cleveradssolutions.adapters.exchange.rendering.views.webview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.cleveradssolutions.adapters.exchange.rendering.interstitial.n;
import com.ironsource.G5;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k extends l implements b.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f42919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f42920i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f42921j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.cleveradssolutions.adapters.exchange.rendering.views.webview.mraid.g f42922k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f42923l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public n f42924m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f42925n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f42926o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f42927p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f42928q;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            k.this.setIsClicked(true);
            return motionEvent.getAction() == 2;
        }
    }

    public k(Context context, h hVar, c cVar) {
        super(context);
        this.f42926o = false;
        this.f42921j = hVar;
        this.f42919h = cVar;
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.views.webview.b.a
    public void a() {
        this.f42927p = true;
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.views.webview.b.a
    public void c() {
        this.f42922k.t();
    }

    @Override // android.webkit.WebView
    public void destroy() {
        super.destroy();
        this.f42922k.u();
    }

    public int getAdHeight() {
        return this.f42934e;
    }

    public int getAdWidth() {
        return this.f42933d;
    }

    public n getDialog() {
        return this.f42924m;
    }

    public String getJSName() {
        return this.f42920i;
    }

    public com.cleveradssolutions.adapters.exchange.rendering.views.webview.mraid.g getMRAIDInterface() {
        return this.f42922k;
    }

    public c getMraidListener() {
        return this.f42919h;
    }

    public ViewGroup getParentContainer() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    public h getPreloadedListener() {
        return this.f42921j;
    }

    public String getTargetUrl() {
        return this.f42928q;
    }

    public boolean k() {
        return this.f42925n;
    }

    public void l() {
        ViewGroup parentContainer = getParentContainer();
        if (parentContainer != null) {
            parentContainer.removeView(this);
        }
    }

    public void m() {
        setVisibility(4);
        if (com.cleveradssolutions.adapters.exchange.rendering.models.internal.c.e() == null) {
            com.cleveradssolutions.adapters.exchange.rendering.models.internal.c.m(0);
        }
        i(this, com.cleveradssolutions.adapters.exchange.rendering.sdk.b.g(getContext()).b());
        this.f42923l = w(this.f42923l);
    }

    public void n() {
        super.f();
        super.e();
    }

    public boolean o() {
        return this.f42926o;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (p()) {
            getMRAIDInterface().l(null);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        this.f42919h.zz(z10);
    }

    public boolean p() {
        return this.f42927p;
    }

    public void q() {
        m();
        setOnTouchListener(new a());
        loadDataWithBaseURL("https://" + this.f42935f + to.c.userBaseDel, this.f42923l, "text/html", G5.N, null);
    }

    public void r(String str) {
        this.f42925n = Pattern.compile("(<iframe[^>]*)>", 2).matcher(str).find();
    }

    public final /* synthetic */ void s(String str) {
        this.f42919h.f(str);
    }

    public void setAdHeight(int i10) {
        this.f42934e = i10;
    }

    public void setAdWidth(int i10) {
        this.f42933d = i10;
    }

    public void setBaseJSInterface(com.cleveradssolutions.adapters.exchange.rendering.views.webview.mraid.g gVar) {
        this.f42922k = gVar;
    }

    public void setDialog(n nVar) {
        this.f42924m = nVar;
    }

    public void setIsClicked(boolean z10) {
        this.f42926o = z10;
    }

    public void setJSName(String str) {
        this.f42920i = str;
    }

    public void setTargetUrl(String str) {
        this.f42928q = str;
    }

    public void t(final String str) {
        post(new Runnable() { // from class: com.cleveradssolutions.adapters.exchange.rendering.views.webview.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f42917b.s(str);
            }
        });
    }

    public final String u() {
        String initialScaleValue = getInitialScaleValue();
        if (initialScaleValue == null || initialScaleValue.isEmpty()) {
            return "<meta name='viewport' content='width=device-width' />";
        }
        return "<meta name='viewport' content='width=device-width, initial-scale=" + initialScaleValue + ", minimum-scale=0.01' />";
    }

    public boolean v() {
        return (getMRAIDInterface() == null || getPreloadedListener() == null) ? false : true;
    }

    public final String w(String str) {
        return "<html><head>" + u() + "<body>" + str + "</body></html>";
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.views.webview.b.a
    public void zz() {
        if (this.f42927p) {
            getMRAIDInterface().i();
        }
        h hVar = this.f42921j;
        if (hVar != null) {
            hVar.c(this);
        }
    }

    public k(Context context, String str, int i10, int i11, h hVar, c cVar) {
        super(context);
        this.f42926o = false;
        this.f42933d = i10;
        this.f42934e = i11;
        this.f42923l = str;
        this.f42921j = hVar;
        this.f42919h = cVar;
        n();
    }
}
