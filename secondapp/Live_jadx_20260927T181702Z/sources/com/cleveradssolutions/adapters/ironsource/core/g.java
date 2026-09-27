package com.cleveradssolutions.adapters.ironsource.core;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.cleveradssolutions.mediation.core.n;
import com.cleveradssolutions.mediation.core.o;
import com.cleveradssolutions.mediation.core.x;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements com.cleveradssolutions.mediation.api.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.cleveradssolutions.sdk.c f43132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f43133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AdapterAdListener f43134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.cleveradssolutions.mediation.core.a f43135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Activity f43136f;

    public g(com.cleveradssolutions.sdk.c format, double d10, AdapterAdListener listener) {
        m0.p(format, "format");
        m0.p(listener, "listener");
        this.f43132b = format;
        this.f43133c = d10;
        this.f43134d = listener;
    }

    public static final void o(g gVar, Activity activity, com.cleveradssolutions.mediation.core.a aVar, AdapterAdInteractionListener adapterAdInteractionListener) {
        try {
            gVar.f43136f = activity;
            m0.n(aVar, "null cannot be cast to non-null type com.cleveradssolutions.mediation.core.MediationScreenAd");
            x xVar = (x) aVar;
            xVar.setListener(gVar);
            xVar.showScreen(gVar);
        } catch (Throwable th2) {
            String strF = aVar == null ? "x" : wc.d.f(aVar.getSourceId());
            com.cleveradssolutions.internal.a.a(gVar, 6, "> " + strF + ": Show screen failed" + (": " + Log.getStackTraceString(th2)));
            adapterAdInteractionListener.onAdShowFailed(0, th2.getMessage());
        }
    }

    public static final void s(g gVar, com.cleveradssolutions.mediation.core.a aVar, o oVar) {
        try {
            AdapterAdListener adapterAdListener = gVar.f43134d;
            m0.n(adapterAdListener, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener");
            BannerAdListener bannerAdListener = (BannerAdListener) adapterAdListener;
            m0.n(aVar, "null cannot be cast to non-null type com.cleveradssolutions.mediation.core.MediationBannerAd");
            View viewCreateView = ((n) aVar).createView(oVar.z0(), gVar);
            if (viewCreateView.getVisibility() != 0) {
                viewCreateView.setVisibility(0);
            }
            ViewGroup.LayoutParams layoutParams = viewCreateView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = oVar.V();
            }
            bannerAdListener.onAdLoadSuccess(viewCreateView, new FrameLayout.LayoutParams(layoutParams));
        } catch (Throwable th2) {
            String strF = aVar == null ? "x" : wc.d.f(aVar.getSourceId());
            com.cleveradssolutions.internal.a.a(gVar, 6, "> " + strF + ": Create ad view failed" + (": " + Log.getStackTraceString(th2)));
            gVar.f43134d.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 0, th2.getMessage());
            gVar.k();
        }
    }

    public final void A(com.cleveradssolutions.mediation.core.a ad2) {
        m0.p(ad2, "ad");
        this.f43135e = ad2;
        this.f43134d.onAdLoadSuccess();
    }

    public final void B(final o request, final com.cleveradssolutions.mediation.core.a ad2) {
        m0.p(request, "request");
        m0.p(ad2, "ad");
        this.f43135e = ad2;
        com.cleveradssolutions.sdk.base.c.f43997a.i(new Runnable() { // from class: com.cleveradssolutions.adapters.ironsource.core.f
            @Override // java.lang.Runnable
            public final void run() {
                g.s(this.f43129b, ad2, request);
            }
        });
    }

    public final void F(wc.b error) {
        m0.p(error, "error");
        this.f43134d.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL, error.a(), error.b());
    }

    @Override // com.cleveradssolutions.mediation.api.b
    public void H(com.cleveradssolutions.mediation.core.a ad2) {
        m0.p(ad2, "ad");
        AdapterAdListener adapterAdListener = this.f43134d;
        if (adapterAdListener instanceof RewardedVideoAdListener) {
            ((RewardedVideoAdListener) adapterAdListener).onAdRewarded();
        }
    }

    @Override // com.cleveradssolutions.mediation.api.b
    public Activity I0(com.cleveradssolutions.mediation.core.a ad2) {
        m0.p(ad2, "ad");
        Activity activityB = this.f43136f;
        if (activityB == null) {
            activityB = getContextService().b();
        }
        if (activityB != null) {
            return activityB;
        }
        Y(ad2, new wc.b(13));
        return null;
    }

    @Override // com.cleveradssolutions.mediation.api.b
    public void L(com.cleveradssolutions.mediation.core.a ad2) {
        m0.p(ad2, "ad");
        if (this.f43132b.k()) {
            return;
        }
        AdapterAdListener adapterAdListener = this.f43134d;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdClosed();
        }
    }

    @Override // com.cleveradssolutions.mediation.api.b
    public void R(com.cleveradssolutions.mediation.core.a ad2) {
        m0.p(ad2, "ad");
        wc.b bVar = wc.b.f142702i;
        this.f43134d.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED, bVar.a(), bVar.b());
    }

    @Override // com.cleveradssolutions.mediation.api.b
    public void Y(com.cleveradssolutions.mediation.core.a ad2, wc.b error) {
        m0.p(ad2, "ad");
        m0.p(error, "error");
        this.f43134d.onAdShowFailed(error.a(), error.b());
    }

    @Override // com.cleveradssolutions.mediation.api.b
    public void b(com.cleveradssolutions.mediation.core.a ad2) {
        m0.p(ad2, "ad");
        AdapterAdListener adapterAdListener = this.f43134d;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdVisible();
        }
    }

    public final com.cleveradssolutions.mediation.core.a e() {
        return this.f43135e;
    }

    @Override // com.cleveradssolutions.mediation.api.b
    public com.cleveradssolutions.mediation.b getContextService() {
        return com.cleveradssolutions.mediation.api.a.f43836a.g();
    }

    @Override // com.cleveradssolutions.mediation.c
    public String getLogTag() {
        return this.f43132b.i() + " > Bridge > " + this.f43133c;
    }

    public final double h() {
        return this.f43133c;
    }

    public final void j(com.cleveradssolutions.mediation.core.a aVar) {
        this.f43135e = aVar;
    }

    @Override // com.cleveradssolutions.mediation.api.b
    public void j0(com.cleveradssolutions.mediation.core.a ad2) {
        m0.p(ad2, "ad");
        this.f43134d.onAdClicked();
    }

    public final void k() {
        com.cleveradssolutions.mediation.core.a aVar = this.f43135e;
        if (aVar != null) {
            aVar.destroy();
        }
        this.f43135e = null;
        this.f43136f = null;
    }

    public final void n(final Activity activity, final AdapterAdInteractionListener listener) {
        m0.p(activity, "activity");
        m0.p(listener, "listener");
        this.f43134d = listener;
        final com.cleveradssolutions.mediation.core.a aVar = this.f43135e;
        if (aVar == null) {
            listener.onAdShowFailed(1, wc.b.f142701h.b());
        } else {
            com.cleveradssolutions.sdk.base.c.f43997a.i(new Runnable() { // from class: com.cleveradssolutions.adapters.ironsource.core.e
                @Override // java.lang.Runnable
                public final void run() {
                    g.o(this.f43125b, activity, aVar, listener);
                }
            });
        }
    }

    @Override // com.cleveradssolutions.mediation.api.b
    public void w(com.cleveradssolutions.mediation.core.a ad2) {
        m0.p(ad2, "ad");
        this.f43134d.onAdOpened();
    }
}
