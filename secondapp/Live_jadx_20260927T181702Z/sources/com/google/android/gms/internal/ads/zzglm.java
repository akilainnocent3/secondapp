package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzglm {
    private final zzauq zza;
    private final long zzb;
    private final long zzc;
    private final String zzd;

    private zzglm(zzauq zzauqVar, long j10, long j11, String str) {
        this.zza = zzauqVar;
        this.zzb = j10;
        this.zzc = j11;
        this.zzd = str;
    }

    public static /* synthetic */ zzglm zza(zzauq zzauqVar, byte[] bArr, boolean z10) throws zzaus, zzauo {
        zzauqVar.zza();
        zzauqVar.zzb(bArr);
        List list = (List) zzauqVar.zzc(Optional.empty());
        long jLongValue = ((Long) list.get(0)).longValue();
        long jLongValue2 = ((Long) list.get(1)).longValue();
        long jLongValue3 = ((Long) list.get(2)).longValue();
        zzauqVar.zzd(jLongValue, Optional.empty());
        String strZza = zzgdj.zza(zzaut.zza(), false);
        int length = strZza.length();
        String str = true != z10 ? "" : "-s";
        StringBuilder sb2 = new StringBuilder(length + 12 + str.length());
        sb2.append("3.869425873.");
        sb2.append(strZza);
        sb2.append(str);
        return new zzglm(zzauqVar, jLongValue2, jLongValue3, sb2.toString());
    }

    public final /* synthetic */ String zzb(Map map) {
        return zzgdj.zza((byte[]) this.zza.zzd(this.zzb, Optional.of(map)), true);
    }

    public final /* synthetic */ void zzc(Map map) throws zzaus, zzauo {
        this.zza.zzd(this.zzc, Optional.of(map));
    }

    public final /* synthetic */ String zzd() {
        return this.zzd;
    }
}
