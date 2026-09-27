package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzigl extends zzign {
    public zzigl(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzign
    public final void zza(Object obj, long j10, byte b10) {
        if (zzigo.zzb) {
            zzigo.zzF(obj, j10, b10);
        } else {
            zzigo.zzG(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzign
    public final boolean zzb(Object obj, long j10) {
        return zzigo.zzb ? zzigo.zzw(obj, j10) : zzigo.zzx(obj, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzign
    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzigo.zzb) {
            zzigo.zzF(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            zzigo.zzG(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzign
    public final float zzd(Object obj, long j10) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.ads.zzign
    public final void zze(Object obj, long j10, float f10) {
        this.zza.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.zzign
    public final double zzf(Object obj, long j10) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.ads.zzign
    public final void zzg(Object obj, long j10, double d10) {
        this.zza.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.zzign
    public final byte zzh(long j10) {
        return Memory.peekByte((int) j10);
    }
}
