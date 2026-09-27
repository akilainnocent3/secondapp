package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgve extends zzguq {
    final /* synthetic */ zzgvg zza;
    private final Object zzb;
    private int zzc;

    public zzgve(zzgvg zzgvgVar, int i10) {
        Objects.requireNonNull(zzgvgVar);
        this.zza = zzgvgVar;
        this.zzb = zzgvgVar.zzo(i10);
        this.zzc = i10;
    }

    private final void zza() {
        int i10 = this.zzc;
        if (i10 != -1) {
            zzgvg zzgvgVar = this.zza;
            if (i10 < zzgvgVar.size() && Objects.equals(this.zzb, zzgvgVar.zzo(this.zzc))) {
                return;
            }
        }
        this.zzc = this.zza.zzi(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzguq, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzguq, java.util.Map.Entry
    public final Object getValue() {
        zzgvg zzgvgVar = this.zza;
        Map mapZzc = zzgvgVar.zzc();
        if (mapZzc != null) {
            return mapZzc.get(this.zzb);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            return null;
        }
        return zzgvgVar.zzp(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzguq, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzgvg zzgvgVar = this.zza;
        Map mapZzc = zzgvgVar.zzc();
        if (mapZzc != null) {
            return mapZzc.put(this.zzb, obj);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            zzgvgVar.put(this.zzb, obj);
            return null;
        }
        Object objZzp = zzgvgVar.zzp(i10);
        zzgvgVar.zzq(this.zzc, obj);
        return objZzp;
    }
}
