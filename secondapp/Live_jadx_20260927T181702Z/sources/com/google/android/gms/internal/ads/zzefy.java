package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzefy implements zzdfl {
    private final Context zza;
    private final zzcdn zzb;

    public zzefy(Context context, zzcdn zzcdnVar) {
        this.zza = context;
        this.zzb = zzcdnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final void zzdQ(zzfke zzfkeVar) {
        String str = zzfkeVar.zzb.zzb.zze;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzcdn zzcdnVar = this.zzb;
        Context context = this.zza;
        zzcdnVar.zzc(context, zzfkeVar.zza.zza.zzd);
        zzcdnVar.zzm(context, str);
    }

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final void zzdP(zzcar zzcarVar) {
    }
}
