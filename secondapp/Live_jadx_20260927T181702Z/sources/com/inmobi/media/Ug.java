package com.inmobi.media;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Ug {
    public static void a(Sg publisherNativeViewData, final ds.l onClick) {
        kotlin.jvm.internal.m0.p(publisherNativeViewData, "publisherNativeViewData");
        kotlin.jvm.internal.m0.p(onClick, "onClick");
        publisherNativeViewData.f55506a.getParentView$media_release().setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.uu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Ug.a(onClick, view);
            }
        });
        View titleView$media_release = publisherNativeViewData.f55506a.getTitleView$media_release();
        if (titleView$media_release != null) {
            titleView$media_release.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.vu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Ug.b(onClick, view);
                }
            });
        }
        View descriptionView$media_release = publisherNativeViewData.f55506a.getDescriptionView$media_release();
        if (descriptionView$media_release != null) {
            descriptionView$media_release.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.wu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Ug.c(onClick, view);
                }
            });
        }
        ImageView iconView$media_release = publisherNativeViewData.f55506a.getIconView$media_release();
        if (iconView$media_release != null) {
            iconView$media_release.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.xu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Ug.d(onClick, view);
                }
            });
        }
        View ctaView$media_release = publisherNativeViewData.f55506a.getCtaView$media_release();
        if (ctaView$media_release != null) {
            ctaView$media_release.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.yu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Ug.e(onClick, view);
                }
            });
        }
        View advertiserView$media_release = publisherNativeViewData.f55506a.getAdvertiserView$media_release();
        if (advertiserView$media_release != null) {
            advertiserView$media_release.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.zu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Ug.f(onClick, view);
                }
            });
        }
        View ratingView$media_release = publisherNativeViewData.f55506a.getRatingView$media_release();
        if (ratingView$media_release != null) {
            ratingView$media_release.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.av
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Ug.g(onClick, view);
                }
            });
        }
        View view = publisherNativeViewData.f55508c;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.bv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Ug.h(onClick, view2);
                }
            });
        }
    }

    public static final void b(ds.l lVar, View view) {
        lVar.invoke((short) 3);
    }

    public static final void c(ds.l lVar, View view) {
        lVar.invoke((short) 4);
    }

    public static final void d(ds.l lVar, View view) {
        lVar.invoke((short) 5);
    }

    public static final void e(ds.l lVar, View view) {
        lVar.invoke((short) 6);
    }

    public static final void f(ds.l lVar, View view) {
        lVar.invoke((short) 9);
    }

    public static final void g(ds.l lVar, View view) {
        lVar.invoke((short) 8);
    }

    public static final void h(ds.l lVar, View view) {
        lVar.invoke((short) 7);
    }

    public static final void a(ds.l lVar, View view) {
        lVar.invoke((short) 2);
    }
}
