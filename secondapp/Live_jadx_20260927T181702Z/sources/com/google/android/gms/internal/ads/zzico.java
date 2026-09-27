package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzico extends zzicr {
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private final int zzj;
    private int zzk;
    private int zzl;

    public /* synthetic */ zzico(byte[] bArr, int i10, int i11, boolean z10, byte[] bArr2) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        this.zzf = bArr;
        this.zzg = i11 + i10;
        this.zzi = i10;
        this.zzj = i10;
    }

    private final void zzP() {
        int i10 = this.zzg + this.zzh;
        this.zzg = i10;
        int i11 = i10 - this.zzj;
        int i12 = this.zzl;
        if (i11 <= i12) {
            this.zzh = 0;
            return;
        }
        int i13 = i11 - i12;
        this.zzh = i13;
        this.zzg = i10 - i13;
    }

    public final long zzA() throws IOException {
        int i10 = this.zzi;
        if (this.zzg - i10 < 8) {
            throw new zzieg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 8;
        long j10 = bArr[i10];
        long j11 = (((long) bArr[i10 + 1]) & 255) << 8;
        long j12 = bArr[i10 + 2];
        long j13 = bArr[i10 + 3];
        return ((((long) bArr[i10 + 6]) & 255) << 48) | (j10 & 255) | j11 | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    @Override // com.google.android.gms.internal.ads.zzicr
    public final int zzB(int i10) throws zzieg {
        if (i10 < 0) {
            throw new zzieg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = i10 + (this.zzi - this.zzj);
        if (i11 < 0) {
            throw new zzieg("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i12 = this.zzl;
        if (i11 > i12) {
            throw new zzieg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i11;
        zzP();
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.zzicr
    public final void zzC(int i10) {
        this.zzl = i10;
        zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzicr
    public final boolean zzD() throws IOException {
        return this.zzi == this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzicr
    public final int zzE() {
        return this.zzi - this.zzj;
    }

    public final byte zzF() throws IOException {
        int i10 = this.zzi;
        if (i10 == this.zzg) {
            throw new zzieg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 1;
        return bArr[i10];
    }

    public final void zzG(int i10) throws IOException {
        if (i10 >= 0) {
            int i11 = this.zzg;
            int i12 = this.zzi;
            if (i10 <= i11 - i12) {
                this.zzi = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw new zzieg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzieg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.ads.zzicr
    public final int zza() throws IOException {
        if (zzD()) {
            this.zzk = 0;
            return 0;
        }
        int iZzu = zzu();
        this.zzk = iZzu;
        if ((iZzu >>> 3) != 0) {
            return iZzu;
        }
        throw new zzieg("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzicr
    public final void zzb(int i10) throws zzieg {
        if (this.zzk != i10) {
            throw new zzieg("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzicr
    public final boolean zzc(int i10) throws IOException {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i12 < 10) {
                    if (zzF() < 0) {
                        i12++;
                    }
                }
                throw new zzieg("CodedInputStream encountered a malformed varint.");
            }
            while (i12 < 10) {
                byte[] bArr = this.zzf;
                int i13 = this.zzi;
                this.zzi = i13 + 1;
                if (bArr[i13] < 0) {
                    i12++;
                }
            }
            throw new zzieg("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i11 == 1) {
            zzG(8);
            return true;
        }
        if (i11 == 2) {
            zzG(zzu());
            return true;
        }
        if (i11 == 3) {
            zzL();
            zzb(((i10 >>> 3) << 3) | 4);
            return true;
        }
        if (i11 == 4) {
            zzK();
            return false;
        }
        if (i11 != 5) {
            throw new zzief("Protocol message tag had invalid wire type.");
        }
        zzG(4);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzicr
    public final double zzd() throws IOException {
        return Double.longBitsToDouble(zzA());
    }

    @Override // com.google.android.gms.internal.ads.zzicr
    public final float zze() throws IOException {
        return Float.intBitsToFloat(zzz());
    }

    @Override // com.google.android.gms.internal.ads.zzicr
    public final long zzf() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzicr
    public final long zzg() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzicr
    public final int zzh() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzicr
    public final long zzi() throws IOException {
        return zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzicr
    public final int zzj() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzicr
    public final boolean zzk() throws IOException {
        return zzx() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzicr
    public final String zzl() throws IOException {
        int iZzu = zzu();
        if (iZzu > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (iZzu <= i10 - i11) {
                String str = new String(this.zzf, i11, iZzu, zziee.zza);
                this.zzi += iZzu;
                return str;
            }
        }
        if (iZzu == 0) {
            return "";
        }
        if (iZzu < 0) {
            throw new zzieg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzieg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzicr
    public final String zzm() throws IOException {
        int iZzu = zzu();
        if (iZzu > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (iZzu <= i10 - i11) {
                String strZze = zzigt.zze(this.zzf, i11, iZzu);
                this.zzi += iZzu;
                return strZze;
            }
        }
        if (iZzu == 0) {
            return "";
        }
        if (iZzu <= 0) {
            throw new zzieg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzieg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzicr
    public final zzicn zzn() throws IOException {
        int iZzu = zzu();
        if (iZzu > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (iZzu <= i10 - i11) {
                zzicn zzicnVarZzu = zzicn.zzu(this.zzf, i11, iZzu, false);
                this.zzi += iZzu;
                return zzicnVarZzu;
            }
        }
        if (iZzu == 0) {
            return zzicn.zza;
        }
        if (iZzu > 0) {
            int i12 = this.zzg;
            int i13 = this.zzi;
            if (iZzu <= i12 - i13) {
                int i14 = iZzu + i13;
                this.zzi = i14;
                return zzicn.zzw(Arrays.copyOfRange(this.zzf, i13, i14), false);
            }
        }
        if (iZzu <= 0) {
            throw new zzieg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzieg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzicr
    public final int zzo() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzicr
    public final int zzp() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzicr
    public final int zzq() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzicr
    public final long zzr() throws IOException {
        return zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzicr
    public final int zzs() throws IOException {
        return zzicr.zzM(zzu());
    }

    @Override // com.google.android.gms.internal.ads.zzicr
    public final long zzt() throws IOException {
        return zzicr.zzN(zzx());
    }

    public abstract int zzu() throws IOException;

    public abstract int zzv() throws IOException;

    public final int zzw() throws IOException {
        int i10;
        int i11 = this.zzi;
        int i12 = this.zzg;
        if (i12 != i11) {
            byte[] bArr = this.zzf;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.zzi = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << zi.c.f161638p) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << zi.c.f161647y);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.zzi = i14;
                return i10;
            }
        }
        return (int) zzy();
    }

    public final long zzx() throws IOException {
        long j10;
        long j11;
        long j12;
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (i11 != i10) {
            byte[] bArr = this.zzf;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.zzi = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    j12 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << zi.c.f161638p) ^ i14;
                    if (i16 >= 0) {
                        j12 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << zi.c.f161647y);
                        if (i18 < 0) {
                            long j13 = (-2080896) ^ i18;
                            i13 = i17;
                            j12 = j13;
                        } else {
                            i15 = i10 + 5;
                            long j14 = (((long) bArr[i17]) << 28) ^ ((long) i18);
                            if (j14 >= 0) {
                                j12 = j14 ^ 266354560;
                            } else {
                                i13 = i10 + 6;
                                long j15 = (((long) bArr[i15]) << 35) ^ j14;
                                if (j15 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    int i19 = i10 + 7;
                                    long j16 = j15 ^ (((long) bArr[i13]) << 42);
                                    if (j16 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        i13 = i10 + 8;
                                        j15 = j16 ^ (((long) bArr[i19]) << 49);
                                        if (j15 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i19 = i10 + 9;
                                            j16 = j15 ^ (((long) bArr[i13]) << 56);
                                            if (j16 >= 0) {
                                                j11 = 71499008037633920L;
                                            } else {
                                                i13 = i10 + 10;
                                                j15 = j16 ^ (((long) bArr[i19]) << 63);
                                                if (j15 >= 0) {
                                                    j10 = -9151873028817141888L;
                                                }
                                            }
                                        }
                                    }
                                    j12 = j11 ^ j16;
                                    i13 = i19;
                                }
                                j12 = j15 ^ j10;
                            }
                        }
                    }
                    i13 = i15;
                }
                this.zzi = i13;
                return j12;
            }
        }
        return zzy();
    }

    public final long zzy() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte bZzF = zzF();
            j10 |= ((long) (bZzF & 127)) << i10;
            if ((bZzF & 128) == 0) {
                return j10;
            }
        }
        throw new zzieg("CodedInputStream encountered a malformed varint.");
    }

    public final int zzz() throws IOException {
        int i10 = this.zzi;
        if (this.zzg - i10 < 4) {
            throw new zzieg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 4;
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }
}
