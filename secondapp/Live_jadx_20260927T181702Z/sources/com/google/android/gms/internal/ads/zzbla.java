package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbla extends zzblk {
    static final int zza;
    static final int zzb;
    private static final int zzc;
    private final String zzd;
    private final List zze = new ArrayList();
    private final List zzf = new ArrayList();
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;

    static {
        int iRgb = Color.rgb(12, 174, 206);
        zzc = iRgb;
        zza = Color.rgb(204, 204, 204);
        zzb = iRgb;
    }

    public zzbla(String str, List list, Integer num, Integer num2, Integer num3, int i10, int i11, boolean z10) {
        this.zzd = str;
        for (int i12 = 0; i12 < list.size(); i12++) {
            zzbld zzbldVar = (zzbld) list.get(i12);
            this.zze.add(zzbldVar);
            this.zzf.add(zzbldVar);
        }
        this.zzg = num != null ? num.intValue() : zza;
        this.zzh = num2 != null ? num2.intValue() : zzb;
        this.zzi = num3 != null ? num3.intValue() : 12;
        this.zzj = i10;
        this.zzk = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzbll
    public final String zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbll
    public final List zzc() {
        return this.zzf;
    }

    public final List zzd() {
        return this.zze;
    }

    public final int zze() {
        return this.zzg;
    }

    public final int zzf() {
        return this.zzh;
    }

    public final int zzg() {
        return this.zzi;
    }

    public final int zzh() {
        return this.zzj;
    }

    public final int zzi() {
        return this.zzk;
    }
}
