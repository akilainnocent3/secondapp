package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import f0.k3;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdpr {
    public static final zzdpr zza = new zzdpr(new zzdpq());

    @Nullable
    private final zzbmq zzb;

    @Nullable
    private final zzbmn zzc;

    @Nullable
    private final zzbnd zzd;

    @Nullable
    private final zzbna zze;

    @Nullable
    private final zzbry zzf;
    private final k3 zzg;
    private final k3 zzh;

    public /* synthetic */ zzdpr(zzdpq zzdpqVar, byte[] bArr) {
        this(zzdpqVar);
    }

    @Nullable
    public final zzbmq zza() {
        return this.zzb;
    }

    @Nullable
    public final zzbmn zzb() {
        return this.zzc;
    }

    @Nullable
    public final zzbnd zzc() {
        return this.zzd;
    }

    @Nullable
    public final zzbna zzd() {
        return this.zze;
    }

    @Nullable
    public final zzbry zze() {
        return this.zzf;
    }

    @Nullable
    public final zzbmw zzf(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return (zzbmw) this.zzg.get(str);
    }

    @Nullable
    public final zzbmt zzg(String str) {
        return (zzbmt) this.zzh.get(str);
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        k3 k3Var = this.zzg;
        ArrayList arrayList = new ArrayList(k3Var.size());
        for (int i10 = 0; i10 < k3Var.size(); i10++) {
            arrayList.add((String) k3Var.g(i10));
        }
        return arrayList;
    }

    private zzdpr(zzdpq zzdpqVar) {
        this.zzb = zzdpqVar.zza;
        this.zzc = zzdpqVar.zzb;
        this.zzd = zzdpqVar.zzc;
        this.zzg = new k3(zzdpqVar.zzf);
        this.zzh = new k3(zzdpqVar.zzg);
        this.zze = zzdpqVar.zzd;
        this.zzf = zzdpqVar.zze;
    }
}
