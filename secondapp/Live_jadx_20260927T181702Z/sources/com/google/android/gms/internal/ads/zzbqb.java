package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.h5.OnH5AdsEventListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@k.t0(api = 21)
public final class zzbqb extends zzbqd {
    private final OnH5AdsEventListener zza;

    public zzbqb(OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbqe
    public final void zzb(String str) {
        this.zza.onH5AdsEvent(str);
    }
}
