package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdkv extends zzdid implements zzbpw {
    public zzdkv(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbpw
    public final synchronized void zza() {
        zzs(zzdku.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpw
    public final void zzb(@Nullable final zzcbp zzcbpVar) {
        zzs(new zzdic() { // from class: com.google.android.gms.internal.ads.zzdks
            @Override // com.google.android.gms.internal.ads.zzdic
            public final /* synthetic */ void zza(Object obj) {
                ((zzbpw) obj).zzb(zzcbpVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbpw
    public final void zzc() {
        zzs(zzdkt.zza);
    }
}
