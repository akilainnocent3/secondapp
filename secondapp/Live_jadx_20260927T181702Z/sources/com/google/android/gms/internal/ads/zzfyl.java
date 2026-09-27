package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfyl {
    final /* synthetic */ zzfym zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzfyl(zzfym zzfymVar, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(zzfymVar);
        this.zza = zzfymVar;
        this.zzb = bArr;
    }

    public final synchronized void zza() {
        try {
            zzfym zzfymVar = this.zza;
            if (zzfymVar.zzb) {
                zzfyp zzfypVar = zzfymVar.zza;
                zzfypVar.zzg(this.zzb);
                zzfypVar.zzh(this.zzc);
                zzfypVar.zzi(this.zzd);
                zzfypVar.zzf(null);
                zzfypVar.zze();
            }
        } catch (RemoteException e10) {
            Log.d("GASS", "Clearcut log failed", e10);
        }
    }

    public final zzfyl zzb(int i10) {
        this.zzc = i10;
        return this;
    }

    public final zzfyl zzc(int i10) {
        this.zzd = i10;
        return this;
    }
}
