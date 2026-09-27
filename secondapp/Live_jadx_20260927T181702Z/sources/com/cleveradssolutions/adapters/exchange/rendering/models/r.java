package com.cleveradssolutions.adapters.exchange.rendering.models;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class r {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f42280j = "zz";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f42281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f42282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.cleveradssolutions.adapters.exchange.rendering.listeners.a f42283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.cleveradssolutions.adapters.exchange.rendering.listeners.e f42284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference f42285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.cleveradssolutions.adapters.exchange.rendering.views.interstitial.d f42286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f42287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m f42288i;

    public r(Context context, e eVar, com.cleveradssolutions.adapters.exchange.rendering.session.manager.b bVar, com.cleveradssolutions.adapters.exchange.rendering.views.interstitial.d dVar) throws com.cleveradssolutions.adapters.exchange.api.exceptions.a {
        if (context == null) {
            throw new com.cleveradssolutions.adapters.exchange.api.exceptions.a("Context is null");
        }
        if (eVar == null) {
            throw new com.cleveradssolutions.adapters.exchange.api.exceptions.a("CreativeModel is null");
        }
        this.f42281b = new WeakReference(context);
        this.f42282c = eVar;
        this.f42285f = new WeakReference(bVar);
        this.f42286g = dVar;
        this.f42282c.t(bVar);
    }

    public void A(com.cleveradssolutions.adapters.exchange.rendering.video.k kVar) {
        com.cleveradssolutions.adapters.exchange.b.h(f42280j, "trackVideoEvent(): Base method implementation: ignoring");
    }

    public abstract void B();

    public void C() {
        m mVar = this.f42288i;
        if (mVar != null) {
            mVar.k();
            this.f42288i = null;
        }
    }

    public abstract void E();

    public e F() {
        return this.f42282c;
    }

    public View G() {
        return this.f42287h;
    }

    public void H(View view) {
        this.f42287h = view;
    }

    public void I(com.cleveradssolutions.adapters.exchange.rendering.listeners.a aVar) {
        this.f42283d = aVar;
    }

    public void J(com.cleveradssolutions.adapters.exchange.rendering.listeners.e eVar) {
        this.f42284e = eVar;
    }

    public void K(com.cleveradssolutions.adapters.exchange.rendering.models.internal.g gVar) {
        if (gVar == null) {
            com.cleveradssolutions.adapters.exchange.b.h(f42280j, "addOmFriendlyObstruction: Obstruction view is null. Skip adding as friendlyObstruction");
            return;
        }
        com.cleveradssolutions.adapters.exchange.rendering.session.manager.b bVar = (com.cleveradssolutions.adapters.exchange.rendering.session.manager.b) this.f42285f.get();
        if (bVar == null) {
            com.cleveradssolutions.adapters.exchange.b.a(f42280j, "Unable to addOmFriendlyObstruction. OmAdSessionManager is null");
        } else {
            bVar.v(gVar);
        }
    }

    public void M(com.cleveradssolutions.adapters.exchange.rendering.session.manager.b bVar, View view) {
        bVar.t(view);
        bVar.h();
    }

    public void N(boolean z10) {
        m mVar = this.f42288i;
        if (mVar == null) {
            com.cleveradssolutions.adapters.exchange.b.h(f42280j, "handleAdWebViewWindowFocusChange(): Failed. CreativeVisibilityTracker is null.");
        } else if (z10) {
            mVar.h();
        } else {
            mVar.k();
        }
    }

    public abstract void O();

    public void P() {
        com.cleveradssolutions.adapters.exchange.b.h(f42280j, "unMute(): Base method implementation: ignoring");
    }

    public com.cleveradssolutions.adapters.exchange.rendering.listeners.a i() {
        return this.f42283d;
    }

    public long j() {
        com.cleveradssolutions.adapters.exchange.b.h(f42280j, "getMediaDuration(): Returning default value: 0");
        return 0L;
    }

    public com.cleveradssolutions.adapters.exchange.rendering.listeners.e k() {
        return this.f42284e;
    }

    public long l() {
        com.cleveradssolutions.adapters.exchange.b.h(f42280j, "getVideoSkipOffset(): Returning default value: -1");
        return -1L;
    }

    public abstract void m();

    public abstract void n();

    public boolean o() {
        return this.f42282c.o().g();
    }

    public abstract boolean q();

    public abstract boolean s();

    public boolean t() {
        com.cleveradssolutions.adapters.exchange.b.h(f42280j, "isInterstitialClosed(): Returning default value: false");
        return false;
    }

    public abstract boolean u();

    public abstract boolean v();

    public abstract void w();

    public void x() {
        com.cleveradssolutions.adapters.exchange.b.h(f42280j, "mute(): Base method implementation: ignoring");
    }

    public void y() {
        com.cleveradssolutions.adapters.exchange.b.h(f42280j, "pause(): Base method implementation: ignoring");
    }

    public void z() {
        com.cleveradssolutions.adapters.exchange.b.h(f42280j, "resume(): Base method implementation: ignoring");
    }
}
