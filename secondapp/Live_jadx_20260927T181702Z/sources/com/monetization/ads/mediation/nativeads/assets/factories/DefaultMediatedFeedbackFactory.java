package com.monetization.ads.mediation.nativeads.assets.factories;

import android.content.Context;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class DefaultMediatedFeedbackFactory {
    @l
    public final MediatedNativeAdImage makeFeedback(@l Context context, int i10) {
        MediatedNativeAdImage.Builder height = new MediatedNativeAdImage.Builder("default_mediation_feedback_url").setWidth(68).setHeight(68);
        try {
            height.setDrawable(context.getDrawable(i10));
        } catch (Throwable unused) {
        }
        return height.build();
    }
}
