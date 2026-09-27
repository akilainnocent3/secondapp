package com.cleveradssolutions.adapters.exchange.rendering.video;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f42587b = "zt";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f42588a;

    public void a(float f10, float f11) {
        WeakReference weakReference = this.f42588a;
        if (weakReference == null || weakReference.get() == null) {
            com.cleveradssolutions.adapters.exchange.b.d(f42587b, "Unable to trackVideoAdStarted: AdSessionManager is null");
        } else {
            ((com.cleveradssolutions.adapters.exchange.rendering.session.manager.b) this.f42588a.get()).s(f10, f11);
        }
    }

    public void b(com.cleveradssolutions.adapters.exchange.rendering.models.internal.a aVar) {
        WeakReference weakReference = this.f42588a;
        if (weakReference == null || weakReference.get() == null) {
            com.cleveradssolutions.adapters.exchange.b.d(f42587b, "Unable to trackOmPlayerStateChange: AdSessionManager is null");
        } else {
            ((com.cleveradssolutions.adapters.exchange.rendering.session.manager.b) this.f42588a.get()).u(aVar);
        }
    }

    public void c(com.cleveradssolutions.adapters.exchange.rendering.models.b bVar) {
        WeakReference weakReference = this.f42588a;
        if (weakReference == null || weakReference.get() == null) {
            com.cleveradssolutions.adapters.exchange.b.d(f42587b, "Unable to trackOmHtmlAdEvent: AdSessionManager is null");
        } else {
            ((com.cleveradssolutions.adapters.exchange.rendering.session.manager.b) this.f42588a.get()).w(bVar);
        }
    }

    public void d(com.cleveradssolutions.adapters.exchange.rendering.session.manager.b bVar) {
        this.f42588a = new WeakReference(bVar);
    }

    public void e(k kVar) {
        WeakReference weakReference = this.f42588a;
        if (weakReference == null || weakReference.get() == null) {
            com.cleveradssolutions.adapters.exchange.b.d(f42587b, "Unable to trackOmVideoAdEvent: AdSessionManager is null");
        } else {
            ((com.cleveradssolutions.adapters.exchange.rendering.session.manager.b) this.f42588a.get()).x(kVar);
        }
    }

    public void f(boolean z10) {
        WeakReference weakReference = this.f42588a;
        if (weakReference == null || weakReference.get() == null) {
            com.cleveradssolutions.adapters.exchange.b.d(f42587b, "Unable to trackVideoAdStarted: AdSessionManager is null");
        } else {
            ((com.cleveradssolutions.adapters.exchange.rendering.session.manager.b) this.f42588a.get()).A(z10);
        }
    }
}
