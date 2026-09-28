package com.google.android.recaptcha.internal;

import defpackage.hb5;
import defpackage.whs;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
final class zzqs extends zzqv {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzqs(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            Locale locale = Locale.US;
            hb5.a(whs.b(length, i2, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            throw null;
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i2;
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final int zza() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzb(byte b) throws zzqt {
        int i = this.zze;
        try {
            int i2 = i + 1;
            try {
                this.zzc[i] = b;
                this.zze = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new zzqt(i, this.zzd, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    public final void zzc(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i2);
            this.zze += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzqt(this.zze, this.zzd, i2, e);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzd(int i, boolean z) throws zzqt {
        zzt(i << 3);
        zzb(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zze(int i, zzqm zzqmVar) throws zzqt {
        zzt((i << 3) | 2);
        zzt(zzqmVar.zzd());
        zzqmVar.zzi(this);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzf(int i, int i2) throws zzqt {
        zzt((i << 3) | 5);
        zzg(i2);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzg(int i) throws zzqt {
        int i2 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.zze = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzqt(i2, this.zzd, 4, e);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzh(int i, long j) throws zzqt {
        zzt((i << 3) | 1);
        zzi(j);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzi(long j) throws zzqt {
        int i = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.zze = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzqt(i, this.zzd, 8, e);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzj(int i, int i2) throws zzqt {
        zzt(i << 3);
        zzk(i2);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzk(int i) throws zzqt {
        if (i >= 0) {
            zzt(i);
        } else {
            zzv(i);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzl(byte[] bArr, int i, int i2) {
        zzc(bArr, 0, i2);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzm(int i, zzts zztsVar, zzug zzugVar) throws zzqt {
        zzt((i << 3) | 2);
        zzt(((zzpw) zztsVar).zza(zzugVar));
        zzugVar.zzj(zztsVar, this.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzn(int i, zzts zztsVar) throws zzqt {
        zzt(11);
        zzs(2, i);
        zzt(26);
        zzt(zztsVar.zzo());
        zztsVar.zze(this);
        zzt(12);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzo(int i, zzqm zzqmVar) throws zzqt {
        zzt(11);
        zzs(2, i);
        zze(3, zzqmVar);
        zzt(12);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzp(int i, String str) throws zzqt {
        zzt((i << 3) | 2);
        zzq(str);
    }

    public final void zzq(String str) throws zzqt {
        int i = this.zze;
        try {
            int iZzA = zzqv.zzA(str.length() * 3);
            int iZzA2 = zzqv.zzA(str.length());
            if (iZzA2 != iZzA) {
                zzt(zzvf.zzc(str));
                byte[] bArr = this.zzc;
                int i2 = this.zze;
                this.zze = zzvf.zzb(str, bArr, i2, this.zzd - i2);
                return;
            }
            int i3 = i + iZzA2;
            this.zze = i3;
            int iZzb = zzvf.zzb(str, this.zzc, i3, this.zzd - i3);
            this.zze = i;
            zzt((iZzb - i) - iZzA2);
            this.zze = iZzb;
        } catch (zzve e) {
            this.zze = i;
            zzD(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzqt(e2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzr(int i, int i2) throws zzqt {
        zzt((i << 3) | i2);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzs(int i, int i2) throws zzqt {
        zzt(i << 3);
        zzt(i2);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzt(int i) throws zzqt {
        int i2;
        int i3 = this.zze;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.zzc;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.zze = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzqt(i2, this.zzd, 1, e);
                }
            }
            throw new zzqt(i2, this.zzd, 1, e);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzu(int i, long j) throws zzqt {
        zzt(i << 3);
        zzv(j);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzv(long j) throws zzqt {
        byte[] bArr;
        int i;
        byte[] bArr2;
        int i2 = this.zze;
        if (!zzqv.zzd || this.zzd - i2 < 10) {
            while (true) {
                long j2 = j & (-128);
                bArr = this.zzc;
                if (j2 == 0) {
                    break;
                }
                i = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzqt(i, this.zzd, 1, e);
                }
                throw new zzqt(i, this.zzd, 1, e);
            }
            i = i2 + 1;
            bArr[i2] = (byte) j;
        } else {
            while (true) {
                long j3 = j & (-128);
                bArr2 = this.zzc;
                if (j3 == 0) {
                    break;
                }
                zzvc.zzn(bArr2, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            zzvc.zzn(bArr2, i2, (byte) j);
        }
        this.zze = i;
    }
}
