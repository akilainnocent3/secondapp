package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;
import k.i1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@i1
final class zzgx implements Runnable {
    private final zzgw zza;
    private final int zzb;
    private final Throwable zzc;
    private final byte[] zzd;
    private final String zze;
    private final Map zzf;

    public /* synthetic */ zzgx(String str, zzgw zzgwVar, int i10, Throwable th2, byte[] bArr, Map map, byte[] bArr2) {
        Preconditions.checkNotNull(zzgwVar);
        this.zza = zzgwVar;
        this.zzb = i10;
        this.zzc = th2;
        this.zzd = bArr;
        this.zze = str;
        this.zzf = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza(this.zze, this.zzb, this.zzc, this.zzd, this.zzf);
    }
}
