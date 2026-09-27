package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.MobileAds;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzele {
    private final Context zza;

    public zzele(Context context) {
        this.zza = context;
    }

    public final nj.t1 zza(boolean z10) {
        try {
            x8.b bVarA = new x8.b.a().b(MobileAds.ERROR_DOMAIN).c(z10).a();
            u8.a aVarA = u8.a.a(this.zza);
            return aVarA != null ? aVarA.b(bVarA) : zzhbi.zzc(new IllegalStateException());
        } catch (Exception e10) {
            return zzhbi.zzc(e10);
        }
    }
}
