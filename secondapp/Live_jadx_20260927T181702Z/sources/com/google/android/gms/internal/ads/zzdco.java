package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@k.h1
public final class zzdco extends zzdid implements zzdcj {
    @k.h1
    public zzdco(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final void zzc(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzs(new zzdic() { // from class: com.google.android.gms.internal.ads.zzdcn
            @Override // com.google.android.gms.internal.ads.zzdic
            public final /* synthetic */ void zza(Object obj) {
                ((zzdcv) obj).zzj(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final void zzd(final zzdnb zzdnbVar) {
        zzs(new zzdic() { // from class: com.google.android.gms.internal.ads.zzdcl
            @Override // com.google.android.gms.internal.ads.zzdic
            public final /* synthetic */ void zza(Object obj) {
                zzdcv zzdcvVar = (zzdcv) obj;
                String message = zzdnbVar.getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                zzdcvVar.zzj(zzflo.zzd(12, message, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final void zze() {
        zzs(zzdcm.zza);
    }
}
