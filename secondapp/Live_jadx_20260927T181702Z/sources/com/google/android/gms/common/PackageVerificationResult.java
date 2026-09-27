package com.google.android.gms.common;

import androidx.annotation.NonNull;
import zq.h;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class PackageVerificationResult {
    private final String zza;
    private final boolean zzb;

    @h
    private final String zzc;

    @h
    private final Throwable zzd;

    private PackageVerificationResult(String str, int i10, boolean z10, @h String str2, @h Throwable th2, @h com.google.android.gms.common.signatureverification.zza zzaVar) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = str2;
        this.zzd = th2;
    }

    public static PackageVerificationResult zza(String str, @NonNull String str2, @h Throwable th2, @h com.google.android.gms.common.signatureverification.zza zzaVar) {
        return new PackageVerificationResult(str, 1, false, str2, th2, null);
    }

    public static PackageVerificationResult zzd(String str, int i10, @h com.google.android.gms.common.signatureverification.zza zzaVar) {
        return new PackageVerificationResult(str, i10, true, null, null, null);
    }

    public final boolean zzb() {
        return this.zzb;
    }

    public final void zzc() {
        if (this.zzb) {
            return;
        }
        String str = this.zzc;
        Throwable th2 = this.zzd;
        String strConcat = "PackageVerificationRslt: ".concat(String.valueOf(str));
        if (th2 == null) {
            throw new SecurityException(strConcat);
        }
        throw new SecurityException(strConcat, th2);
    }
}
