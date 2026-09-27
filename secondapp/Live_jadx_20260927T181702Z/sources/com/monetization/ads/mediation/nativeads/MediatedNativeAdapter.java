package com.monetization.ads.mediation.nativeads;

import android.content.Context;
import com.monetization.ads.mediation.base.a;
import java.util.Map;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class MediatedNativeAdapter extends a {
    public abstract void loadAd(@l Context context, @l MediatedNativeAdapterListener mediatedNativeAdapterListener, @l Map<String, ? extends Object> map, @l Map<String, String> map2);
}
