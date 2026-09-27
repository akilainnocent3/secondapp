package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzggn {
    private MessageDigest zza;
    private final zzgpu zzb;
    private final Object zzc = new Object();
    private boolean zzd = false;
    private SecureRandom zze;

    public zzggn(zzgpu zzgpuVar) {
        this.zzb = zzgpuVar;
    }

    public final void zza() {
        if (zzc()) {
            return;
        }
        zzb(new SecureRandom());
    }

    public final synchronized void zzb(SecureRandom secureRandom) {
        zzgps zzgpsVarZza = this.zzb.zza(202);
        try {
            try {
                try {
                    zzgpsVarZza.zza();
                    this.zze = secureRandom;
                    this.zza = MessageDigest.getInstance("MD5");
                    this.zzd = true;
                } catch (Throwable th2) {
                    zzgpsVarZza.zzb(th2);
                    throw th2;
                }
            } catch (NoSuchAlgorithmException e10) {
                zzgpsVarZza.zzb(e10);
            }
            zzgpsVarZza.zzc();
        } catch (Throwable th3) {
            zzgpsVarZza.zzc();
            throw th3;
        }
    }

    public final synchronized boolean zzc() {
        return this.zzd;
    }

    public final byte[] zzd(byte[] bArr, String str, boolean z10) {
        int length = bArr.length;
        int i10 = true != z10 ? 255 : 239;
        zzgsw.zza(length <= i10);
        ByteBuffer byteBufferPut = ByteBuffer.allocate(i10 + 1).put((byte) length);
        if (length < i10) {
            int i11 = i10 - length;
            byte[] bArr2 = new byte[i11];
            this.zze.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i11);
            System.arraycopy(bArr2, 0, bArr, length, i11);
        }
        byte[] bArrArray = byteBufferPut.put(bArr).array();
        if (z10) {
            bArrArray = ByteBuffer.allocate(256).put(zze(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        zzggq[] zzggqVarArr = new zzghd().zzcK;
        int length2 = zzggqVarArr.length;
        for (int i12 = 0; i12 < 12; i12++) {
            zzggqVarArr[i12].zza(bArrArray, bArr3);
        }
        if (!zzgtn.zzc(str)) {
            new zzggp(str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8)).zza(bArr3);
        }
        return bArr3;
    }

    public final byte[] zze(byte[] bArr) {
        byte[] bArrDigest;
        synchronized (this.zzc) {
            this.zza.reset();
            this.zza.update(bArr);
            bArrDigest = this.zza.digest();
        }
        return bArrDigest;
    }

    public final zzayx zzf(byte[] bArr, String str) {
        zzayx zzayxVarZza = zzayy.zza();
        byte[] bArrZze = zze(bArr);
        zzicn zzicnVar = zzicn.zza;
        zzayxVarZza.zzb(zzicn.zzt(bArrZze, 0, bArrZze.length));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            int length = bArr.length;
            if (i10 >= ((length - 1) / 255) + 1) {
                break;
            }
            int i11 = i10 * 255;
            int i12 = i11 + 255;
            if (length > i12) {
                length = i12;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i11, length));
            i10++;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzayxVarZza.zza(zzicn.zzt(zzd((byte[]) it.next(), str, false), 0, 256));
        }
        return zzayxVarZza;
    }

    public final String zzg(int i10, String str) {
        zzaxf zzaxfVarZzj = zzayf.zzj();
        zzaxfVarZzj.zzl(i10);
        return Base64.encodeToString(zzd(((zzayf) zzaxfVarZzj.zzbu()).zzaN(), str, true), 11);
    }
}
