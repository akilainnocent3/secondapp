package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzdg extends zzde implements Serializable {
    static final zzde zza = new zzdg();

    private zzdg() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzdh zzdhVar = (zzdh) obj;
        zzdh zzdhVar2 = (zzdh) obj2;
        return zzca.zzf().zzb(zzdhVar.zza, zzdhVar2.zza).zzb(zzdhVar.zzb, zzdhVar2.zzb).zza();
    }
}
