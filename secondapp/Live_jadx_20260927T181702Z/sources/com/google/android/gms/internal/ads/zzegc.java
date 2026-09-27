package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzegc implements zzege {
    private final Map zza;
    private final zzhbs zzb;
    private final zzdfj zzc;

    public zzegc(Map map, zzhbs zzhbsVar, zzdfj zzdfjVar) {
        this.zza = map;
        this.zzb = zzhbsVar;
        this.zzc = zzdfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzege
    public final nj.t1 zza(final zzcar zzcarVar) {
        this.zzc.zzdP(zzcarVar);
        nj.t1 t1VarZzc = zzhbi.zzc(new zzedr(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjv)).split(",")) {
            final zzimx zzimxVar = (zzimx) this.zza.get(str.trim());
            if (zzimxVar != null) {
                t1VarZzc = zzhbi.zzh(t1VarZzc, zzedr.class, new zzhaq() { // from class: com.google.android.gms.internal.ads.zzegb
                    @Override // com.google.android.gms.internal.ads.zzhaq
                    public final /* synthetic */ nj.t1 zza(Object obj) {
                        return ((zzege) zzimxVar.zzb()).zza(zzcarVar);
                    }
                }, this.zzb);
            }
        }
        zzhbi.zzr(t1VarZzc, new zzega(this), zzcff.zzh);
        return t1VarZzc;
    }

    public final /* synthetic */ zzdfj zzb() {
        return this.zzc;
    }
}
