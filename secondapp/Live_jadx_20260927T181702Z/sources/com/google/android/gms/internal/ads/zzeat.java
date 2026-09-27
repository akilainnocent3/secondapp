package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeat implements zzeai {
    private final long zza;
    private final zzesy zzb;

    public zzeat(long j10, Context context, zzeam zzeamVar, zzcmx zzcmxVar, String str) {
        this.zza = j10;
        zzfhy zzfhyVarZzn = zzcmxVar.zzn();
        zzfhyVarZzn.zzd(context);
        zzfhyVarZzn.zzb(new com.google.android.gms.ads.internal.client.zzr());
        zzfhyVarZzn.zzc(str);
        zzesy zzesyVarZza = zzfhyVarZzn.zza().zza();
        this.zzb = zzesyVarZza;
        zzesyVarZza.zzdS(new zzeas(this, zzeamVar));
    }

    @Override // com.google.android.gms.internal.ads.zzeai
    public final void zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zze(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeai
    public final void zzb() {
        this.zzb.zzR(ObjectWrapper.wrap(null));
    }

    @Override // com.google.android.gms.internal.ads.zzeai
    public final void zzc() {
        this.zzb.zzc();
    }

    public final /* synthetic */ long zzd() {
        return this.zza;
    }
}
