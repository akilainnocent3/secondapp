package com.fyber.inneractive.sdk.measurement.tracker;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.web.m;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.Partner;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdSession f45116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AdEvents f45117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45118c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Partner f45119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WebView f45120e;

    public e(Partner partner, m mVar) {
        this.f45119d = partner;
        this.f45120e = mVar;
    }

    public abstract void a();

    public void a(m mVar) {
        AdSessionContext adSessionContextCreateHtmlAdSessionContext;
        try {
            AdSessionConfiguration adSessionConfigurationB = b();
            try {
                adSessionContextCreateHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(this.f45119d, mVar, "", "");
            } catch (Throwable unused) {
                adSessionContextCreateHtmlAdSessionContext = null;
            }
            AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfigurationB, adSessionContextCreateHtmlAdSessionContext);
            this.f45116a = adSessionCreateAdSession;
            adSessionCreateAdSession.registerAdView(mVar);
            this.f45116a.start();
        } catch (Throwable unused2) {
        }
    }

    public abstract AdSessionConfiguration b();

    public abstract void c();
}
