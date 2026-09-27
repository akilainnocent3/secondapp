package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzicw extends zzice {
    public static final /* synthetic */ int zzb = 0;
    private static final boolean zzc = zzigo.zza();
    Object zza;

    private zzicw() {
        throw null;
    }

    public static int zzE(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int zzF(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int zzG(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int zzH(zzifc zzifcVar) {
        int iZzbr = zzifcVar.zzbr();
        return zzF(iZzbr) + iZzbr;
    }

    public final void zzI() {
        if (zzy() > 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        if (zzy() < 0) {
            throw new IllegalStateException("Wrote more data than expected.");
        }
    }

    public abstract void zzb(int i10, int i11) throws IOException;

    public abstract void zzc(int i10, int i11) throws IOException;

    public abstract void zzd(int i10, int i11) throws IOException;

    public abstract void zze(int i10, int i11) throws IOException;

    public abstract void zzf(int i10, long j10) throws IOException;

    public abstract void zzg(int i10, long j10) throws IOException;

    public abstract void zzh(int i10, boolean z10) throws IOException;

    public abstract void zzi(int i10, String str) throws IOException;

    public abstract void zzj(int i10, zzicn zzicnVar) throws IOException;

    public abstract void zzk(zzicn zzicnVar) throws IOException;

    public abstract void zzl(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void zzm(int i10, zzifc zzifcVar) throws IOException;

    public abstract void zzn(int i10, zzicn zzicnVar) throws IOException;

    public abstract void zzo(zzifc zzifcVar) throws IOException;

    public abstract void zzp(byte b10) throws IOException;

    public abstract void zzq(int i10) throws IOException;

    public abstract void zzr(int i10) throws IOException;

    public abstract void zzs(int i10) throws IOException;

    public abstract void zzt(long j10) throws IOException;

    public abstract void zzu(long j10) throws IOException;

    public abstract void zzw(String str) throws IOException;

    public abstract void zzx() throws IOException;

    public abstract int zzy();

    public /* synthetic */ zzicw(byte[] bArr) {
    }
}
