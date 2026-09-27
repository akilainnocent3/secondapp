package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzhat extends zzhak {
    private List zza;

    public zzhat(zzgvv zzgvvVar, boolean z10) {
        super(zzgvvVar, z10, true);
        List listZzb = zzgvvVar.isEmpty() ? Collections.EMPTY_LIST : zzgwz.zzb(zzgvvVar.size());
        for (int i10 = 0; i10 < zzgvvVar.size(); i10++) {
            listZzb.add(null);
        }
        this.zza = listZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhak
    public final void zzA(int i10) {
        super.zzA(i10);
        this.zza = null;
    }

    public abstract Object zzD(List list);

    @Override // com.google.android.gms.internal.ads.zzhak
    public final void zzw(int i10, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i10, new zzhas(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhak
    public final void zzx() {
        List list = this.zza;
        if (list != null) {
            zza(zzD(list));
        }
    }
}
