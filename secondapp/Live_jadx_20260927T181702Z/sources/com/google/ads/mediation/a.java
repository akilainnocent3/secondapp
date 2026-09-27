package com.google.ads.mediation;

import android.view.View;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzc;
import com.google.android.gms.ads.formats.zzh;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends UnifiedNativeAdMapper {
    public a(UnifiedNativeAd unifiedNativeAd) {
        setHeadline(unifiedNativeAd.zza());
        setImages(unifiedNativeAd.zzb());
        setBody(unifiedNativeAd.zzc());
        setIcon(unifiedNativeAd.zzd());
        setCallToAction(unifiedNativeAd.zze());
        setAdvertiser(unifiedNativeAd.zzf());
        setStarRating(unifiedNativeAd.zzg());
        setStore(unifiedNativeAd.zzh());
        setPrice(unifiedNativeAd.zzi());
        zzb(unifiedNativeAd.zzk());
        setOverrideImpressionRecording(true);
        setOverrideClickHandling(true);
        zza(unifiedNativeAd.zzj());
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
        if ((view instanceof zzh) || ((zzc) zzc.zza.get(view)) != null) {
            throw null;
        }
    }
}
