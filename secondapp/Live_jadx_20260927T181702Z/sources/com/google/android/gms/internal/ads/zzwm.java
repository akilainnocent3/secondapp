package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzwm implements zzyw {
    private final zzgvz zza;
    private long zzb;

    public zzwm(List list, List list2) {
        int i10 = zzgvz.zzd;
        zzgvw zzgvwVar = new zzgvw();
        zzgsw.zza(list.size() == list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzgvwVar.zzf(new zzwl((zzyw) list.get(i11), (List) list2.get(i11)));
        }
        this.zza = zzgvwVar.zzi();
        this.zzb = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzyw
    public final void zzg(long j10) {
        int i10 = 0;
        while (true) {
            zzgvz zzgvzVar = this.zza;
            if (i10 >= zzgvzVar.size()) {
                return;
            }
            ((zzwl) zzgvzVar.get(i10)).zzg(j10);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyw
    public final long zzi() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            zzgvz zzgvzVar = this.zza;
            if (i10 >= zzgvzVar.size()) {
                break;
            }
            zzwl zzwlVar = (zzwl) zzgvzVar.get(i10);
            long jZzi = zzwlVar.zzi();
            if ((zzwlVar.zza().contains(1) || zzwlVar.zza().contains(2) || zzwlVar.zza().contains(4)) && jZzi != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzi);
            }
            if (jZzi != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jZzi);
            }
            i10++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.zzb = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.zzb;
        return j10 != -9223372036854775807L ? j10 : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.zzyw
    public final long zzl() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            zzgvz zzgvzVar = this.zza;
            if (i10 >= zzgvzVar.size()) {
                break;
            }
            long jZzl = ((zzwl) zzgvzVar.get(i10)).zzl();
            if (jZzl != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzl);
            }
            i10++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzyw
    public final boolean zzm(zzlu zzluVar) {
        boolean zZzm;
        boolean z10 = false;
        do {
            long jZzl = zzl();
            if (jZzl == Long.MIN_VALUE) {
                break;
            }
            int i10 = 0;
            zZzm = false;
            while (true) {
                zzgvz zzgvzVar = this.zza;
                if (i10 >= zzgvzVar.size()) {
                    break;
                }
                long jZzl2 = ((zzwl) zzgvzVar.get(i10)).zzl();
                boolean z11 = jZzl2 != Long.MIN_VALUE && jZzl2 <= zzluVar.zza;
                if (jZzl2 == jZzl || z11) {
                    zZzm |= ((zzwl) zzgvzVar.get(i10)).zzm(zzluVar);
                }
                i10++;
            }
            z10 |= zZzm;
        } while (zZzm);
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzyw
    public final boolean zzn() {
        int i10 = 0;
        while (true) {
            zzgvz zzgvzVar = this.zza;
            if (i10 >= zzgvzVar.size()) {
                return false;
            }
            if (((zzwl) zzgvzVar.get(i10)).zzn()) {
                return true;
            }
            i10++;
        }
    }
}
