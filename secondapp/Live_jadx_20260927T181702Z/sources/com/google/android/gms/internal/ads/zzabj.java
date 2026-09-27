package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzabj implements zzabd {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzabb[] zzd = new zzabb[100];

    public zzabj(boolean z10, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzabd
    public final synchronized zzabb zza() {
        zzabb zzabbVar;
        try {
            this.zzb++;
            int i10 = this.zzc;
            if (i10 > 0) {
                zzabb[] zzabbVarArr = this.zzd;
                int i11 = i10 - 1;
                this.zzc = i11;
                zzabbVar = zzabbVarArr[i11];
                if (zzabbVar == null) {
                    throw null;
                }
                zzabbVarArr[i11] = null;
            } else {
                zzabbVar = new zzabb(new byte[65536], 0);
                int i12 = this.zzb;
                zzabb[] zzabbVarArr2 = this.zzd;
                int length = zzabbVarArr2.length;
                if (i12 > length) {
                    this.zzd = (zzabb[]) Arrays.copyOf(zzabbVarArr2, length + length);
                    return zzabbVar;
                }
            }
            return zzabbVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabd
    public final synchronized void zzb(zzabb zzabbVar) {
        zzabb[] zzabbVarArr = this.zzd;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        zzabbVarArr[i10] = zzabbVar;
        this.zzb--;
        notifyAll();
    }

    @Override // com.google.android.gms.internal.ads.zzabd
    public final synchronized void zzc(@Nullable zzabc zzabcVar) {
        while (zzabcVar != null) {
            try {
                zzabb[] zzabbVarArr = this.zzd;
                int i10 = this.zzc;
                this.zzc = i10 + 1;
                zzabbVarArr[i10] = zzabcVar.zzd();
                this.zzb--;
                zzabcVar = zzabcVar.zze();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }

    @Override // com.google.android.gms.internal.ads.zzabd
    public final synchronized void zzd() {
        int i10 = this.zza;
        String str = zzfk.zza;
        int iMax = Math.max(0, ((i10 + 65535) / 65536) - this.zzb);
        int i11 = this.zzc;
        if (iMax >= i11) {
            return;
        }
        Arrays.fill(this.zzd, iMax, i11, (Object) null);
        this.zzc = iMax;
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i10) {
        int i11 = this.zza;
        this.zza = i10;
        if (i10 < i11) {
            zzd();
        }
    }

    public final synchronized int zzg() {
        return this.zzb * 65536;
    }
}
