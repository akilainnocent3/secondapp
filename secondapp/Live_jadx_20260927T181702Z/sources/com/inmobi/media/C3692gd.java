package com.inmobi.media;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.ads.nativeAd.MediaView;

/* JADX INFO: renamed from: com.inmobi.media.gd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3692gd implements Nn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Jn f56496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Be f56497b;

    public C3692gd(Jn viewableConfig, Be nativeViewabilityViewHolder) {
        kotlin.jvm.internal.m0.p(viewableConfig, "viewableConfig");
        kotlin.jvm.internal.m0.p(nativeViewabilityViewHolder, "nativeViewabilityViewHolder");
        this.f56496a = viewableConfig;
        this.f56497b = nativeViewabilityViewHolder;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    @Override // com.inmobi.media.Nn
    public final Mn a() {
        boolean z10;
        boolean z11;
        Jn jn2;
        ViewGroup viewGroup = this.f56497b.f54401a;
        Rect rect = new Rect();
        if (!viewGroup.getGlobalVisibleRect(rect)) {
            return Mn.HIDDEN;
        }
        Be be2 = this.f56497b;
        Fe fe2 = be2.f54405e;
        if (fe2.f54625b.f58041a || fe2.f54624a.f58041a) {
            C4100wn c4100wn = fe2.f54624a;
            ImageView imageView = be2.f54402b;
            if (c4100wn.f58041a) {
                if ((imageView == null || !c4100wn.f58042b) ? false : Un.a(imageView, c4100wn.f58043c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (z10) {
                jn2 = this.f56496a;
                if (Un.a(viewGroup, rect, jn2.f54951a, jn2.f54952b)) {
                    return Mn.VISIBLE;
                }
            } else {
                C4100wn c4100wn2 = fe2.f54625b;
                MediaView mediaView = this.f56497b.f54403c;
                if (c4100wn2.f58041a) {
                    z11 = (mediaView == null || !c4100wn2.f58042b) ? false : Un.a(mediaView, c4100wn2.f58043c);
                }
                if (z11) {
                    jn2 = this.f56496a;
                    if (Un.a(viewGroup, rect, jn2.f54951a, jn2.f54952b) && Un.a(viewGroup, rect, this.f56496a.f54951a, this.f56497b.f54404d)) {
                        return Mn.VISIBLE;
                    }
                }
            }
        } else {
            jn2 = this.f56496a;
            if (Un.a(viewGroup, rect, jn2.f54951a, jn2.f54952b)) {
                return Mn.VISIBLE;
            }
        }
        return Mn.HIDDEN;
    }
}
