package com.inmobi.media;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.ads.nativeAd.MediaView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Gd implements Nn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Jn f54716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Be f54717b;

    public Gd(Jn viewableConfig, Be nativeViewabilityViewHolder) {
        kotlin.jvm.internal.m0.p(viewableConfig, "viewableConfig");
        kotlin.jvm.internal.m0.p(nativeViewabilityViewHolder, "nativeViewabilityViewHolder");
        this.f54716a = viewableConfig;
        this.f54717b = nativeViewabilityViewHolder;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0044  */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    @Override // com.inmobi.media.Nn
    public final Mn a() {
        boolean zA;
        boolean z10;
        ViewGroup viewGroup = this.f54717b.f54401a;
        Rect rect = new Rect();
        if (!viewGroup.getGlobalVisibleRect(rect)) {
            return Mn.HIDDEN;
        }
        Be be2 = this.f54717b;
        Fe fe2 = be2.f54405e;
        C4100wn c4100wn = fe2.f54625b;
        if (c4100wn.f58041a) {
            MediaView mediaView = be2.f54403c;
            if (mediaView == null || !c4100wn.f58042b) {
                zA = false;
            } else {
                zA = Un.a(mediaView, c4100wn.f58043c);
            }
        } else {
            C4100wn c4100wn2 = fe2.f54624a;
            if (c4100wn2.f58041a) {
                ImageView imageView = be2.f54402b;
                if (imageView == null || !c4100wn2.f58042b) {
                    zA = false;
                } else {
                    zA = Un.a(imageView, c4100wn2.f58043c);
                }
            } else {
                zA = true;
            }
        }
        if (zA) {
            Jn jn2 = this.f54716a;
            z10 = Un.a(viewGroup, rect, jn2.f54951a, jn2.f54952b) && Un.a(viewGroup, rect, this.f54716a.f54951a, this.f54717b.f54404d);
        }
        return z10 ? Mn.VISIBLE : Mn.HIDDEN;
    }
}
