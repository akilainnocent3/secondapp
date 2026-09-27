package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgpg implements zzgor {
    private final List zza = new ArrayList();

    public final synchronized void zza(List list) {
        List list2 = this.zza;
        list2.clear();
        list2.addAll(list);
    }

    @Override // com.google.android.gms.internal.ads.zzgor
    public final synchronized void zzc(Map map, Context context, View view) {
        List list = this.zza;
        map.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST, new ArrayList(list));
        list.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzgor
    public final void zzb(Map map) {
    }

    @Override // com.google.android.gms.internal.ads.zzgor
    public final void zzd(Map map) {
    }
}
