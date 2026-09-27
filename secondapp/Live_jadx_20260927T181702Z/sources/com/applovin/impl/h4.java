package com.applovin.impl;

import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final AppLovinAdBase f27167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final com.applovin.impl.sdk.l f27168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.p f27169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final String f27170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f27171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected AdSession f27172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected AdEvents f27173g;

    public h4(AppLovinAdBase appLovinAdBase) {
        this.f27167a = appLovinAdBase;
        this.f27168b = appLovinAdBase.getSdk();
        this.f27169c = appLovinAdBase.getSdk().Q();
        String str = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            str = str + ":" + appLovinAdBase.getDspName();
        }
        this.f27170d = str;
    }

    public abstract AdSessionConfiguration a();

    public abstract AdSessionContext a(WebView webView);

    public void h() {
        b("track loaded", new Runnable() { // from class: com.applovin.impl.sa
            @Override // java.lang.Runnable
            public final void run() {
                this.f28622b.d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView) {
        AdSessionContext adSessionContextA;
        if (!this.f27167a.isOpenMeasurementEnabled()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f27169c.d(this.f27170d, "Skip starting session - Open Measurement disabled");
                return;
            }
            return;
        }
        if (this.f27172f != null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f27169c.k(this.f27170d, "Attempting to start session again for ad: " + this.f27167a);
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f27169c.a(this.f27170d, "Starting session");
        }
        AdSessionConfiguration adSessionConfigurationA = a();
        if (adSessionConfigurationA == null || (adSessionContextA = a(webView)) == null) {
            return;
        }
        try {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfigurationA, adSessionContextA);
            this.f27172f = adSessionCreateAdSession;
            try {
                this.f27173g = AdEvents.createAdEvents(adSessionCreateAdSession);
                a(this.f27172f);
                this.f27172f.start();
                this.f27171e = true;
                if (com.applovin.impl.sdk.p.a()) {
                    this.f27169c.a(this.f27170d, "Session started");
                }
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f27169c.a(this.f27170d, "Failed to create ad events", th2);
                }
            }
        } catch (Throwable th3) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f27169c.a(this.f27170d, "Failed to create session", th3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f27173g.loaded();
    }

    public void a(AdSession adSession) {
    }

    public void c(final WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ra
            @Override // java.lang.Runnable
            public final void run() {
                this.f28576b.b(webView);
            }
        });
    }

    public void e() {
        c(null);
    }

    public void f() {
        b("stop session", new Runnable() { // from class: com.applovin.impl.wa
            @Override // java.lang.Runnable
            public final void run() {
                this.f29478b.b();
            }
        });
    }

    public void g() {
        b("track impression event", new Runnable() { // from class: com.applovin.impl.va
            @Override // java.lang.Runnable
            public final void run() {
                this.f29402b.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.f27173g.impressionOccurred();
    }

    public void a(View view) {
        b(view, Collections.EMPTY_LIST);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, List list) {
        this.f27172f.registerAdView(view);
        this.f27172f.removeAllFriendlyObstructions();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j4 j4Var = (j4) it.next();
            if (j4Var.c() != null) {
                try {
                    this.f27172f.addFriendlyObstruction(j4Var.c(), j4Var.b(), j4Var.a());
                } catch (Throwable th2) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f27169c.a(this.f27170d, "Failed to add friendly obstruction (" + j4Var + gi.j.f86771d, th2);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.f27172f.error(ErrorType.VIDEO, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (this.f27171e) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f27169c.a(this.f27170d, "Running operation: " + str);
                }
                runnable.run();
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f27169c.a(this.f27170d, "Failed to run operation: " + str, th2);
            }
        }
    }

    public void b(final View view, final List list) {
        b("update main view: " + view, new Runnable() { // from class: com.applovin.impl.xa
            @Override // java.lang.Runnable
            public final void run() {
                this.f29515b.a(view, list);
            }
        });
    }

    public void b(final String str) {
        b("track error", new Runnable() { // from class: com.applovin.impl.ta
            @Override // java.lang.Runnable
            public final void run() {
                this.f29282b.a(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f27171e = false;
        this.f27172f.finish();
        this.f27172f = null;
        this.f27173g = null;
    }

    public void b(final String str, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ua
            @Override // java.lang.Runnable
            public final void run() {
                this.f29336b.a(str, runnable);
            }
        });
    }
}
