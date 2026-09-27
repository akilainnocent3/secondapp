package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzafm implements zzahb {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzahb
    public /* synthetic */ void zzO(long j10) {
        i.a(this, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public /* synthetic */ int zza(zzj zzjVar, int i10, boolean z10) {
        return i.b(this, zzjVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final int zzb(zzj zzjVar, int i10, boolean z10, int i11) throws IOException {
        int iZza = zzjVar.zza(this.zza, 0, Math.min(4096, i10));
        if (iZza != -1) {
            return iZza;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public /* synthetic */ void zzc(zzes zzesVar, int i10) {
        i.c(this, zzesVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final void zzd(zzes zzesVar, int i10, int i11) {
        zzesVar.zzk(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final void zzA(zzv zzvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final void zze(long j10, int i10, int i11, int i12, @Nullable zzaha zzahaVar) {
    }
}
