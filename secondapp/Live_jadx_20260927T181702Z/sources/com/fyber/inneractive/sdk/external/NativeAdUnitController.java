package com.fyber.inneractive.sdk.external;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.factories.j;
import com.fyber.inneractive.sdk.flow.i0;
import com.fyber.inneractive.sdk.flow.s0;
import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.renderers.a0;
import com.fyber.inneractive.sdk.renderers.c0;
import com.fyber.inneractive.sdk.renderers.w;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class NativeAdUnitController extends s0 implements com.fyber.inneractive.sdk.flow.nativead.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f44596a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f44597b;

    public final void a() {
        ViewGroup viewGroup = this.f44597b;
        if (viewGroup != null) {
            this.f44597b = null;
            IAlog.a("%s: unbindView called with %s", logPrefix(), viewGroup);
            IAlog.a("%s: spot is %s", logPrefix(), getAdSpot());
            for (InneractiveAdRenderer inneractiveAdRenderer : new HashSet(this.f44596a)) {
                if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                    com.fyber.inneractive.sdk.interfaces.d dVar = (com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer;
                    if (dVar.b(viewGroup)) {
                        IAlog.a("%s: unbindView unbinding renderer %s", logPrefix(), inneractiveAdRenderer);
                        dVar.t();
                        break;
                    }
                }
            }
        }
        Iterator it = new HashSet(this.f44596a).iterator();
        while (it.hasNext()) {
            ((InneractiveAdRenderer) it.next()).destroy();
        }
        this.f44596a.clear();
        this.f44597b = null;
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.a
    public void bind(MediaView mediaView) {
        w a0Var;
        r rVar;
        IAlog.a("%s: bindView called with parent: %s", logPrefix(), mediaView);
        InneractiveAdSpot adSpot = getAdSpot();
        com.fyber.inneractive.sdk.response.e eVarB = null;
        if (adSpot != null) {
            Iterator it = new HashSet(this.f44596a).iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.f44597b = mediaView;
                    Iterator it2 = j.f44613a.f44614a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            a0Var = null;
                            break;
                        }
                        ((com.fyber.inneractive.sdk.nativead.d) it2.next()).getClass();
                        if (adSpot.getAdContent() instanceof w0) {
                            x adContent = adSpot.getAdContent();
                            if (!(adContent instanceof w0) || !adContent.isVideoAd()) {
                                a0Var = new a0();
                                break;
                            } else {
                                a0Var = new c0();
                                break;
                            }
                        }
                    }
                    if (a0Var == null) {
                        IAlog.f("%s: Could not find a renderer for the given spot!", logPrefix());
                        break;
                    }
                    ((w0) adSpot.getAdContent()).f45027u.f44799b = a0Var;
                    a0Var.initialize(adSpot);
                    selectContentController();
                    a0Var.b(mediaView);
                    this.f44596a.add(a0Var);
                    IAlog.a("%s: created renderer %s", logPrefix(), a0Var);
                    break;
                }
                InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
                if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                    com.fyber.inneractive.sdk.interfaces.d dVar = (com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer;
                    if (dVar.b(mediaView)) {
                        dVar.m();
                        IAlog.a("%s: bindView returning an already attached renderer %s", logPrefix(), dVar);
                        break;
                    }
                }
            }
        } else {
            IAlog.f("NativeAdUnitController was not attached to an ad spot", new Object[0]);
        }
        i0 i0Var = this.mAdSpot.get();
        if (i0Var == null || i0Var.getAdContent() == null) {
            rVar = null;
        } else {
            x adContent2 = i0Var.getAdContent();
            eVarB = adContent2.b();
            rVar = adContent2.f45033c;
        }
        View viewCreatePrivacyView = createPrivacyView(mediaView.getContext(), eVarB, rVar);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 83;
        mediaView.addView(viewCreatePrivacyView, layoutParams);
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean canRefreshAd() {
        return false;
    }

    public View createPrivacyView(Context context, com.fyber.inneractive.sdk.response.e eVar, r rVar) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.ia_layout_fyber_ad_identifier_relative, (ViewGroup) null, false);
        com.fyber.inneractive.sdk.flow.g gVar = new com.fyber.inneractive.sdk.flow.g(context, false, null, eVar, rVar);
        IFyberAdIdentifier.Corner corner = IFyberAdIdentifier.Corner.BOTTOM_LEFT;
        IFyberAdIdentifier iFyberAdIdentifier = gVar.f44732d;
        iFyberAdIdentifier.f47821k = corner;
        iFyberAdIdentifier.a(viewGroup);
        viewGroup.setVisibility(0);
        return viewGroup;
    }

    @Override // com.fyber.inneractive.sdk.flow.s0, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void destroy() {
        if (Looper.myLooper() == null || Looper.getMainLooper() != Looper.myLooper()) {
            com.fyber.inneractive.sdk.util.r.f47892b.post(new h(this));
        } else {
            a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean supports(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() instanceof NativeAdContent;
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean supportsRefresh() {
        return false;
    }
}
