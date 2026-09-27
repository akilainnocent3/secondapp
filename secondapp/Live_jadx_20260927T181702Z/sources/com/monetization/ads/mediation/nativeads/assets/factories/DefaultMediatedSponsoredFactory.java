package com.monetization.ads.mediation.nativeads.assets.factories;

import android.content.Context;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class DefaultMediatedSponsoredFactory {
    @l
    public final String makeSponsored(@l Context context, int i10) {
        try {
            return context.getString(i10);
        } catch (Throwable unused) {
            return "Advertisement";
        }
    }
}
