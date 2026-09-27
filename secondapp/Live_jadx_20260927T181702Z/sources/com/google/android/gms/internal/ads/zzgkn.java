package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgkn {
    private final File zza;
    private final zzfwl zzb;
    private final zzgpu zzc;

    public zzgkn(File file, zzfwl zzfwlVar, zzgpu zzgpuVar) {
        this.zza = file;
        this.zzb = zzfwlVar;
        this.zzc = zzgpuVar;
    }

    public final boolean zza(byte[] bArr) {
        boolean zZza;
        try {
            File file = this.zza;
            zzgzg.zzb(file);
            zzgzg.zza(bArr, file);
            zZza = this.zzb.zza(file);
        } catch (IOException | GeneralSecurityException e10) {
            this.zzc.zzd(2027, e10);
            zZza = false;
        }
        try {
            this.zza.delete();
        } catch (SecurityException unused) {
        }
        return zZza;
    }
}
