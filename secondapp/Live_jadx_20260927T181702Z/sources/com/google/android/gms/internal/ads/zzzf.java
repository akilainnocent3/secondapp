package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzzf {
    public static final zzzf zza = new zzzf(new zzbg[0]);
    public final int zzb;
    private final zzgvz zzc;
    private int zzd;

    static {
        String str = zzfk.zza;
        Integer.toString(0, 36);
    }

    public zzzf(zzbg... zzbgVarArr) {
        this.zzc = zzgvz.zzr(zzbgVarArr);
        this.zzb = zzbgVarArr.length;
        int i10 = 0;
        while (i10 < this.zzc.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.zzc.size(); i12++) {
                if (((zzbg) this.zzc.get(i10)).equals(this.zzc.get(i12))) {
                    zzef.zzf("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzf.class == obj.getClass()) {
            zzzf zzzfVar = (zzzf) obj;
            if (this.zzb == zzzfVar.zzb && this.zzc.equals(zzzfVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzd;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.zzc.hashCode();
        this.zzd = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.zzc.toString();
    }

    public final zzbg zza(int i10) {
        return (zzbg) this.zzc.get(i10);
    }

    public final int zzb(zzbg zzbgVar) {
        int iIndexOf = this.zzc.indexOf(zzbgVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final zzgvz zzc() {
        return zzgvz.zzq(zzgwz.zzc(this.zzc, zzze.zza));
    }
}
