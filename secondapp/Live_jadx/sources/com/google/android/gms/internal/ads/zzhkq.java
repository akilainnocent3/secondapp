package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzhkq {
    final long[] zza;
    final long[] zzb;
    final long[] zzc;

    public zzhkq(long[] jArr, long[] jArr2, long[] jArr3) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = jArr3;
    }

    public static zzhkq zza(zzhkq zzhkqVar, zzhkp zzhkpVar) {
        zzhkq zzhkqVar2 = zzhkpVar.zza;
        long[] jArr = zzhkqVar.zza;
        long[] jArr2 = zzhkqVar2.zza;
        long[] jArr3 = zzhkpVar.zzb;
        zzhkz.zze(jArr, jArr2, jArr3);
        long[] jArr4 = zzhkqVar.zzb;
        long[] jArr5 = zzhkqVar2.zzb;
        long[] jArr6 = zzhkqVar2.zzc;
        zzhkz.zze(jArr4, jArr5, jArr6);
        zzhkz.zze(zzhkqVar.zzc, jArr6, jArr3);
        return zzhkqVar;
    }

    public final byte[] zzb() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        int i10 = zzhkz.zza;
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = this.zzc;
        zzhkz.zzf(jArr4, jArr14);
        zzhkz.zzf(jArr13, jArr4);
        zzhkz.zzf(jArr12, jArr13);
        zzhkz.zze(jArr5, jArr12, jArr14);
        zzhkz.zze(jArr6, jArr5, jArr4);
        zzhkz.zzf(jArr12, jArr6);
        zzhkz.zze(jArr7, jArr12, jArr5);
        zzhkz.zzf(jArr12, jArr7);
        zzhkz.zzf(jArr13, jArr12);
        zzhkz.zzf(jArr12, jArr13);
        zzhkz.zzf(jArr13, jArr12);
        zzhkz.zzf(jArr12, jArr13);
        zzhkz.zze(jArr8, jArr12, jArr7);
        zzhkz.zzf(jArr12, jArr8);
        zzhkz.zzf(jArr13, jArr12);
        for (int i11 = 2; i11 < 10; i11 += 2) {
            zzhkz.zzf(jArr12, jArr13);
            zzhkz.zzf(jArr13, jArr12);
        }
        zzhkz.zze(jArr9, jArr13, jArr8);
        zzhkz.zzf(jArr12, jArr9);
        zzhkz.zzf(jArr13, jArr12);
        for (int i12 = 2; i12 < 20; i12 += 2) {
            zzhkz.zzf(jArr12, jArr13);
            zzhkz.zzf(jArr13, jArr12);
        }
        zzhkz.zze(jArr12, jArr13, jArr9);
        zzhkz.zzf(jArr13, jArr12);
        zzhkz.zzf(jArr12, jArr13);
        for (int i13 = 2; i13 < 10; i13 += 2) {
            zzhkz.zzf(jArr13, jArr12);
            zzhkz.zzf(jArr12, jArr13);
        }
        zzhkz.zze(jArr10, jArr12, jArr8);
        zzhkz.zzf(jArr12, jArr10);
        zzhkz.zzf(jArr13, jArr12);
        for (int i14 = 2; i14 < 50; i14 += 2) {
            zzhkz.zzf(jArr12, jArr13);
            zzhkz.zzf(jArr13, jArr12);
        }
        zzhkz.zze(jArr11, jArr13, jArr10);
        zzhkz.zzf(jArr13, jArr11);
        zzhkz.zzf(jArr12, jArr13);
        for (int i15 = 2; i15 < 100; i15 += 2) {
            zzhkz.zzf(jArr13, jArr12);
            zzhkz.zzf(jArr12, jArr13);
        }
        zzhkz.zze(jArr13, jArr12, jArr11);
        zzhkz.zzf(jArr12, jArr13);
        zzhkz.zzf(jArr13, jArr12);
        for (int i16 = 2; i16 < 50; i16 += 2) {
            zzhkz.zzf(jArr12, jArr13);
            zzhkz.zzf(jArr13, jArr12);
        }
        zzhkz.zze(jArr12, jArr13, jArr10);
        zzhkz.zzf(jArr13, jArr12);
        zzhkz.zzf(jArr12, jArr13);
        zzhkz.zzf(jArr13, jArr12);
        zzhkz.zzf(jArr12, jArr13);
        zzhkz.zzf(jArr13, jArr12);
        zzhkz.zze(jArr, jArr13, jArr6);
        zzhkz.zze(jArr2, this.zza, jArr);
        zzhkz.zze(jArr3, this.zzb, jArr);
        byte[] bArrZzh = zzhkz.zzh(jArr3);
        bArrZzh[31] = (byte) ((zzhks.zzf(jArr2) << 7) ^ bArrZzh[31]);
        return bArrZzh;
    }

    public zzhkq() {
        this(new long[10], new long[10], new long[10]);
    }

    public zzhkq(zzhkp zzhkpVar) {
        this();
        zza(this, zzhkpVar);
    }

    public zzhkq(zzhkq zzhkqVar) {
        this.zza = Arrays.copyOf(zzhkqVar.zza, 10);
        this.zzb = Arrays.copyOf(zzhkqVar.zzb, 10);
        this.zzc = Arrays.copyOf(zzhkqVar.zzc, 10);
    }
}
