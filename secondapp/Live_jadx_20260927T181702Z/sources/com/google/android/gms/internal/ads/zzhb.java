package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzhb implements zzhj {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;

    @Nullable
    private zzhn zzd;

    public zzhb(boolean z10) {
        this.zza = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zze(zzih zzihVar) {
        zzihVar.getClass();
        ArrayList arrayList = this.zzb;
        if (arrayList.contains(zzihVar)) {
            return;
        }
        arrayList.add(zzihVar);
        this.zzc++;
    }

    public final void zzf(zzhn zzhnVar) {
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzih) this.zzb.get(i10)).zza(this, zzhnVar, this.zza);
        }
    }

    public final void zzg(zzhn zzhnVar) {
        this.zzd = zzhnVar;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzih) this.zzb.get(i10)).zzb(this, zzhnVar, this.zza);
        }
    }

    public final void zzh(int i10) {
        zzhn zzhnVar = this.zzd;
        String str = zzfk.zza;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            ((zzih) this.zzb.get(i11)).zzc(this, zzhnVar, this.zza, i10);
        }
    }

    public final void zzi() {
        zzhn zzhnVar = this.zzd;
        String str = zzfk.zza;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzih) this.zzb.get(i10)).zzd(this, zzhnVar, this.zza);
        }
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public /* synthetic */ Map zzj() {
        return c1.a(this);
    }
}
