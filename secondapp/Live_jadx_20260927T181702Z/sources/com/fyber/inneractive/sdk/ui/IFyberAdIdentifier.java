package com.fyber.inneractive.sdk.ui;

import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.global.r;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class IFyberAdIdentifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ClickListener f47811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f47815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f47816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f47817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f47818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f47819i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f47820j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Corner f47821k = Corner.BOTTOM_LEFT;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.features.a f47822l;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface ClickListener {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum Corner {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT
    }

    public IFyberAdIdentifier(r rVar) {
        this.f47812b = 0;
        this.f47813c = 0;
        this.f47814d = 0;
        this.f47815e = 0;
        this.f47816f = 0;
        this.f47817g = null;
        this.f47818h = "";
        this.f47819i = "";
        this.f47820j = false;
        this.f47822l = com.fyber.inneractive.sdk.config.global.features.b.f44373e;
        if (rVar != null) {
            com.fyber.inneractive.sdk.config.global.features.b bVar = (com.fyber.inneractive.sdk.config.global.features.b) rVar.a(com.fyber.inneractive.sdk.config.global.features.b.class);
            Integer numA = bVar.a("ad_identifier_text_size_w");
            this.f47812b = numA != null ? numA.intValue() : 110;
            Integer numA2 = bVar.a("ad_identifier_text_size_h");
            this.f47813c = numA2 != null ? numA2.intValue() : 18;
            Integer numA3 = bVar.a("ad_identifier_image_size_w");
            this.f47814d = numA3 != null ? numA3.intValue() : 18;
            Integer numA4 = bVar.a("ad_identifier_image_size_h");
            this.f47815e = numA4 != null ? numA4.intValue() : 18;
            Integer numA5 = bVar.a("ad_identifier_text_size");
            this.f47816f = numA5 != null ? numA5.intValue() : 8;
            this.f47817g = bVar.a("ad_identifier_tint_color", "#75DCDCDC");
            this.f47822l = bVar.c();
            this.f47818h = bVar.a("ad_identifier_text", "Tap for more information");
            this.f47819i = bVar.a("ad_identifier_icon_url", null);
            this.f47820j = true;
        }
    }

    public abstract void a(ViewGroup viewGroup);
}
