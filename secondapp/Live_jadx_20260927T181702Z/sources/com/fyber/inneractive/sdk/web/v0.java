package com.fyber.inneractive.sdk.web;

import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class v0 implements com.fyber.inneractive.sdk.ignite.r {
    public boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebView f48046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.ignite.h f48047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.ignite.m f48049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f48050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f48051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f48052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.v f48053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t0 f48054i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f48056k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f48058m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f48060o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public n0 f48061p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public WeakReference f48062q;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f48055j = "invalid_task_id";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f48057l = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f48059n = 10;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f48063r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f48064s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicInteger f48065t = new AtomicInteger(0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f48066u = new AtomicBoolean(false);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f48067v = new AtomicBoolean(false);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f48068w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f48069x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f48070y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f48071z = false;
    public boolean A = false;
    public boolean C = false;
    public boolean D = false;
    public final m0 E = new m0(this);

    public v0(w0 w0Var) {
        this.f48048c = w0Var.f48073a;
        this.f48049d = w0Var.f48074b;
        this.f48050e = w0Var.f48075c;
        this.f48058m = w0Var.f48076d;
        this.f48051f = w0Var.f48077e;
        this.f48052g = w0Var.f48078f;
        this.f48053h = w0Var.f48079g;
        com.fyber.inneractive.sdk.ignite.h hVar = IAConfigManager.O.E;
        this.f48047b = hVar;
        hVar.f45072h.add(this);
        this.f48046a = new WebView(com.fyber.inneractive.sdk.util.o.f47884a);
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str, String str2) {
        if (str == null || str2 == null || !str2.equals(this.f48048c)) {
            return;
        }
        this.f48055j = str;
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void b(String str) {
        this.f48071z = false;
        this.A = true;
        if (this.f48055j.equals(str)) {
            this.f48047b.m();
            d("onInstallationSuccess();");
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void c(String str) {
        com.fyber.inneractive.sdk.flow.v vVar;
        IIgniteServiceAPI iIgniteServiceAPI;
        if (this.f48067v.get() && str != null) {
            if (str.equals(com.fyber.inneractive.sdk.ignite.j.NOT_CONNECTED.a()) || str.equals(com.fyber.inneractive.sdk.ignite.j.SESSION_EXPIRED.a())) {
                if (this.f48065t.getAndIncrement() < 2) {
                    this.f48047b.a(new q0(this));
                    return;
                }
                com.fyber.inneractive.sdk.ignite.h hVar = this.f48047b;
                com.fyber.inneractive.sdk.ignite.l lVar = hVar.f45080p;
                if (lVar == null || !lVar.isConnected() || (iIgniteServiceAPI = hVar.f45066b) == null || !iIgniteServiceAPI.asBinder().isBinderAlive()) {
                    com.fyber.inneractive.sdk.ignite.j jVar = com.fyber.inneractive.sdk.ignite.j.FAILED_TO_BIND_SERVICE;
                    com.fyber.inneractive.sdk.ignite.h hVar2 = this.f48047b;
                    if (hVar2.f45073i || (vVar = this.f48053h) == null) {
                        return;
                    }
                    hVar2.f45073i = true;
                    vVar.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_START, null, jVar.a(), null);
                }
            }
        }
    }

    public final void d(String str) {
        com.fyber.inneractive.sdk.util.r.f47892b.post(new o0(this, str));
    }

    public final void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f48056k = str;
        WebSettings settings = this.f48046a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        this.f48046a.setInitialScale(1);
        this.f48046a.setBackgroundColor(-1);
        this.f48046a.setWebViewClient(this.E);
        WebView webView = this.f48046a;
        webView.setLongClickable(false);
        webView.setOnLongClickListener(new com.fyber.inneractive.sdk.util.p0());
        this.f48046a.addJavascriptInterface(new u0(this), "nativeInterface");
        this.f48046a.loadUrl(str);
        com.fyber.inneractive.sdk.config.global.r rVar = this.f48058m;
        if (rVar != null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Integer numA = ((com.fyber.inneractive.sdk.config.global.features.q) rVar.a(com.fyber.inneractive.sdk.config.global.features.q.class)).a("load_timeout");
            int i10 = 10;
            int iIntValue = numA != null ? numA.intValue() : 10;
            if (iIntValue < 30 && iIntValue > 2) {
                i10 = iIntValue;
            }
            long millis = timeUnit.toMillis(i10);
            this.f48059n = millis;
            IAlog.a("InternalStoreWebpageController: Starting load timeout with %d", Long.valueOf(millis));
        }
        this.f48060o = System.currentTimeMillis();
        n0 n0Var = new n0(this);
        this.f48061p = n0Var;
        com.fyber.inneractive.sdk.util.r.f47892b.postDelayed(n0Var, this.f48059n);
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str) {
        this.f48071z = true;
        if (this.f48055j.equals(str)) {
            this.f48047b.m();
            d("onInstallStart();");
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str, int i10, double d10) {
        if (this.f48055j.equals(str)) {
            if (i10 == 0) {
                d(String.format("onDownloadProgress(%f);", Double.valueOf(d10)));
            } else {
                if (i10 != 1) {
                    return;
                }
                d("onInstallationProgress();");
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str, String str2, String str3) {
        com.fyber.inneractive.sdk.flow.v vVar;
        IIgniteServiceAPI iIgniteServiceAPI;
        if (this.D) {
            this.f48071z = false;
            if (this.f48055j.equals(str)) {
                this.f48047b.m();
                if (!this.f48067v.get() && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str2) && str2.equals("App already installed")) {
                    d("onInstallationSuccess();");
                    this.A = true;
                    return;
                }
            }
            if ((str2 != null && (str2.equals(com.fyber.inneractive.sdk.ignite.j.NOT_CONNECTED.a()) || str2.equals(com.fyber.inneractive.sdk.ignite.j.SESSION_EXPIRED.a()))) || !this.f48047b.n()) {
                if (this.f48065t.getAndIncrement() < 2) {
                    this.f48047b.a(new p0(this, str2, str3));
                    return;
                }
                this.f48047b.m();
                d("onInstallationFailed();");
                com.fyber.inneractive.sdk.ignite.h hVar = this.f48047b;
                com.fyber.inneractive.sdk.ignite.l lVar = hVar.f45080p;
                if (lVar == null || !lVar.isConnected() || (iIgniteServiceAPI = hVar.f45066b) == null || !iIgniteServiceAPI.asBinder().isBinderAlive()) {
                    com.fyber.inneractive.sdk.ignite.j jVar = com.fyber.inneractive.sdk.ignite.j.FAILED_TO_BIND_SERVICE;
                    com.fyber.inneractive.sdk.ignite.h hVar2 = this.f48047b;
                    if (!hVar2.f45073i && (vVar = this.f48053h) != null) {
                        hVar2.f45073i = true;
                        vVar.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_START, null, jVar.a(), null);
                    }
                }
            } else if (!TextUtils.equals(str2, com.fyber.inneractive.sdk.ignite.j.DOWNLOAD_IS_CANCELLED.a())) {
                this.f48047b.m();
                d("onInstallationFailed();");
            }
            com.fyber.inneractive.sdk.ignite.m mVar = this.f48049d;
            if (mVar != null) {
                this.f48053h.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_INSTALL_APP, str2, str3, mVar);
            }
        }
    }
}
