package com.fyber.inneractive.sdk.flow;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.external.MediaView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class w0 extends x implements NativeAdContent, com.fyber.inneractive.sdk.flow.nativead.u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f45013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f45014h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f45015i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f45016j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f45017k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Uri f45018l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Uri f45019m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MediaView f45020n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Float f45021o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Float f45022p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f45023q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.r f45024r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public t0 f45025s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashMap f45026t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.j f45027u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.a f45028v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f45029w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f45030x;

    public w0(com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(s0Var, rVar);
        this.f45023q = new ArrayList();
        this.f45026t = new HashMap();
        this.f45029w = new ArrayList();
        this.f45030x = new ArrayList();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    public final void b(String str) {
        com.fyber.inneractive.sdk.util.g gVar;
        if (str == null || str.trim().isEmpty()) {
            str = NativeAdContent.ViewTag.OTHER;
        }
        IAlog.c("%s : handleClick(): %s", "w0", str);
        if (this.f45027u != null) {
            switch (str.hashCode()) {
                case -1884772963:
                    if (!str.equals(NativeAdContent.ViewTag.RATING)) {
                        gVar = com.fyber.inneractive.sdk.util.g.NATIVE;
                    } else {
                        gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_RATING;
                    }
                    break;
                case -1840402880:
                    if (!str.equals(NativeAdContent.ViewTag.MEDIA_VIEW)) {
                        gVar = com.fyber.inneractive.sdk.util.g.NATIVE;
                    } else if (!isVideoAd()) {
                        gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_IMAGE;
                    } else {
                        gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_VIDEO;
                    }
                    break;
                case 67056:
                    if (!str.equals(NativeAdContent.ViewTag.CTA)) {
                        gVar = com.fyber.inneractive.sdk.util.g.NATIVE;
                    } else {
                        gVar = com.fyber.inneractive.sdk.util.g.NATIVE_CTA;
                    }
                    break;
                case 2241657:
                    if (!str.equals(NativeAdContent.ViewTag.AD_ICON)) {
                        gVar = com.fyber.inneractive.sdk.util.g.NATIVE;
                    } else {
                        gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_ICON;
                    }
                    break;
                case 2521314:
                    if (!str.equals(NativeAdContent.ViewTag.ROOT)) {
                        gVar = com.fyber.inneractive.sdk.util.g.NATIVE;
                    } else {
                        gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_ROOT;
                    }
                    break;
                case 75532016:
                    str.equals(NativeAdContent.ViewTag.OTHER);
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE;
                    break;
                case 79833656:
                    if (!str.equals(NativeAdContent.ViewTag.AD_TITLE)) {
                        gVar = com.fyber.inneractive.sdk.util.g.NATIVE;
                    } else {
                        gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_TITLE;
                    }
                    break;
                case 428414940:
                    if (!str.equals(NativeAdContent.ViewTag.AD_DESCRIPTION)) {
                        gVar = com.fyber.inneractive.sdk.util.g.NATIVE;
                    } else {
                        gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_DESCRIPTION;
                    }
                    break;
                default:
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE;
                    break;
            }
            com.fyber.inneractive.sdk.flow.nativead.i iVar = (com.fyber.inneractive.sdk.flow.nativead.i) this.f45026t.get(str);
            com.fyber.inneractive.sdk.flow.nativead.j jVar = this.f45027u;
            if (iVar == null) {
                iVar = jVar.f44798a;
            }
            if (iVar == null) {
                jVar.getClass();
                IAlog.a("%s : No active link (no root and object related links), origin: %s", com.fyber.inneractive.sdk.flow.nativead.j.f44797d, gVar);
            } else {
                com.fyber.inneractive.sdk.flow.nativead.p pVar = jVar.f44800c;
                pVar.getClass();
                com.fyber.inneractive.sdk.util.r.f47891a.execute(new com.fyber.inneractive.sdk.flow.nativead.m(pVar, iVar, false, gVar));
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final void bindMediaView(MediaView mediaView) {
        this.f45020n = mediaView;
        com.fyber.inneractive.sdk.flow.nativead.a aVar = this.f45028v;
        if (aVar != null) {
            aVar.bind(mediaView);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void destroy() {
        t0 t0Var = this.f45025s;
        if (t0Var != null) {
            t0Var.destroy();
            this.f45025s = null;
        }
        com.fyber.inneractive.sdk.flow.nativead.j jVar = this.f45027u;
        if (jVar != null) {
            jVar.f44799b = null;
            jVar.f44800c.f44828a = null;
            this.f45027u = null;
        }
        if (this.f45028v != null) {
            this.f45028v = null;
        }
        for (View view : this.f45023q) {
            if (view != null) {
                view.setOnClickListener(null);
            }
        }
        for (View view2 : this.f45023q) {
            if (view2 != null) {
                view2.setOnTouchListener(null);
            }
        }
        this.f45024r = null;
        this.f45023q.clear();
        this.f45017k = null;
        this.f45021o = null;
        this.f45018l = null;
        this.f45013g = null;
        this.f45019m = null;
        this.f45020n = null;
        this.f45014h = null;
        this.f45016j = null;
        this.f45015i = null;
        this.f45022p = null;
        this.f45026t.clear();
        this.f45029w.clear();
        this.f45030x.clear();
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean e() {
        return (this.f45019m == null && this.f45020n == null) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getAdCallToAction() {
        return this.f45015i;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getAdDescription() {
        return this.f45014h;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getAdTitle() {
        return this.f45013g;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getAdvertiserName() {
        return this.f45016j;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final Uri getAppIcon() {
        return this.f45018l;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final Float getMediaAspectRatio() {
        return this.f45022p;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final MediaView getMediaView() {
        return this.f45020n;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getPrice() {
        return this.f45017k;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final Float getRating() {
        return this.f45021o;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean isVideoAd() {
        return this.f45025s != null;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final void registerViewsForInteraction(ViewGroup viewGroup, MediaView mediaView, ImageView imageView, Collection collection) {
        this.f45023q.clear();
        if (collection != null) {
            this.f45023q.addAll(collection);
        }
        if (viewGroup != null && !this.f45023q.contains(viewGroup)) {
            this.f45023q.add(viewGroup);
        }
        if (mediaView != null && !this.f45023q.contains(mediaView)) {
            this.f45023q.add(mediaView);
        }
        if (imageView != null && !this.f45023q.contains(imageView)) {
            this.f45023q.add(imageView);
        }
        MediaView mediaView2 = this.f45020n;
        if (mediaView2 == null || mediaView2.getContext() == null) {
            IAlog.b("%sCould not attach NativeAdViewGestureDetector, MediaView or its context are null", "w0");
            return;
        }
        this.f45024r = new com.fyber.inneractive.sdk.flow.nativead.r(this.f45020n.getContext(), this);
        for (View view : this.f45023q) {
            if (view != null) {
                view.setOnTouchListener(this.f45024r);
            }
        }
    }
}
