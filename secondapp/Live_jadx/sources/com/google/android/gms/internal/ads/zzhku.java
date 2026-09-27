package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzhku {
    static final long[] zza;
    static final long[] zzb;
    static final long[] zzc;
    static final zzhkn[][] zzd;
    static final zzhkn[] zze;
    private static final BigInteger zzf;
    private static final BigInteger zzg;
    private static final BigInteger zzh;
    private static final BigInteger zzi;

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        zzf = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        zzg = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        zzh = bigIntegerMod2;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerModPow = bigIntegerValueOf.modPow(bigIntegerSubtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        zzi = bigIntegerModPow;
        zzhkt zzhktVar = new zzhkt(null);
        zzhktVar.zzd(BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract));
        BigInteger bigIntegerZzc = zzhktVar.zzc();
        BigInteger bigIntegerMultiply = bigIntegerZzc.pow(2).subtract(bigInteger).multiply(bigIntegerMod.multiply(bigIntegerZzc.pow(2)).add(bigInteger).modInverse(bigIntegerSubtract));
        BigInteger bigIntegerModPow2 = bigIntegerMultiply.modPow(bigIntegerSubtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigIntegerSubtract);
        if (!bigIntegerModPow2.pow(2).subtract(bigIntegerMultiply).mod(bigIntegerSubtract).equals(BigInteger.ZERO)) {
            bigIntegerModPow2 = bigIntegerModPow2.multiply(bigIntegerModPow).mod(bigIntegerSubtract);
        }
        if (bigIntegerModPow2.testBit(0)) {
            bigIntegerModPow2 = bigIntegerSubtract.subtract(bigIntegerModPow2);
        }
        zzhktVar.zzb(bigIntegerModPow2);
        zza = zzhkz.zzg(zzb(bigIntegerMod));
        zzb = zzhkz.zzg(zzb(bigIntegerMod2));
        zzc = zzhkz.zzg(zzb(bigIntegerModPow));
        zzd = (zzhkn[][]) Array.newInstance((Class<?>) zzhkn.class, 32, 8);
        zzhkt zzhktVarZza = zzhktVar;
        for (int i10 = 0; i10 < 32; i10++) {
            zzhkt zzhktVarZza2 = zzhktVarZza;
            for (int i11 = 0; i11 < 8; i11++) {
                zzd[i10][i11] = zzc(zzhktVarZza2);
                zzhktVarZza2 = zza(zzhktVarZza2, zzhktVarZza);
            }
            for (int i12 = 0; i12 < 8; i12++) {
                zzhktVarZza = zza(zzhktVarZza, zzhktVarZza);
            }
        }
        zzhkt zzhktVarZza3 = zza(zzhktVar, zzhktVar);
        zze = new zzhkn[8];
        for (int i13 = 0; i13 < 8; i13++) {
            zze[i13] = zzc(zzhktVar);
            zzhktVar = zza(zzhktVar, zzhktVarZza3);
        }
    }

    private static zzhkt zza(zzhkt zzhktVar, zzhkt zzhktVar2) {
        zzhkt zzhktVar3 = new zzhkt(null);
        BigInteger bigIntegerMultiply = zzg.multiply(zzhktVar.zza().multiply(zzhktVar2.zza()).multiply(zzhktVar.zzc()).multiply(zzhktVar2.zzc()));
        BigInteger bigInteger = zzf;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = zzhktVar.zza().multiply(zzhktVar2.zzc()).add(zzhktVar2.zza().multiply(zzhktVar.zzc()));
        BigInteger bigInteger2 = BigInteger.ONE;
        zzhktVar3.zzb(bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger));
        zzhktVar3.zzd(zzhktVar.zzc().multiply(zzhktVar2.zzc()).add(zzhktVar.zza().multiply(zzhktVar2.zza())).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger));
        return zzhktVar3;
    }

    private static byte[] zzb(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i10 = 0; i10 < 16; i10++) {
            byte b10 = bArr[i10];
            int i11 = 31 - i10;
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }
        return bArr;
    }

    private static zzhkn zzc(zzhkt zzhktVar) {
        BigInteger bigIntegerAdd = zzhktVar.zzc().add(zzhktVar.zza());
        BigInteger bigInteger = zzf;
        return new zzhkn(zzhkz.zzg(zzb(bigIntegerAdd.mod(bigInteger))), zzhkz.zzg(zzb(zzhktVar.zzc().subtract(zzhktVar.zza()).mod(bigInteger))), zzhkz.zzg(zzb(zzh.multiply(zzhktVar.zza()).multiply(zzhktVar.zzc()).mod(bigInteger))));
    }
}
