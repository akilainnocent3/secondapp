package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzift extends zzicn {
    static final int[] zzb = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzicn zzd;
    private final zzicn zze;
    private final int zzf;
    private final int zzg;

    public /* synthetic */ zzift(zzicn zzicnVar, zzicn zzicnVar2, byte[] bArr) {
        this(zzicnVar, zzicnVar2);
    }

    private static zzicn zzG(zzicn zzicnVar, zzicn zzicnVar2) {
        int iZzb = zzicnVar.zzb();
        int iZzb2 = zzicnVar2.zzb();
        byte[] bArr = new byte[iZzb + iZzb2];
        zzicnVar.zzz(bArr, 0, 0, iZzb);
        zzicnVar2.zzz(bArr, 0, iZzb, iZzb2);
        return zzicn.zzv(bArr);
    }

    public static zzicn zzk(zzicn zzicnVar, zzicn zzicnVar2) {
        if (zzicnVar2.zzb() == 0) {
            return zzicnVar;
        }
        if (zzicnVar.zzb() == 0) {
            return zzicnVar2;
        }
        int iZzb = zzicnVar.zzb() + zzicnVar2.zzb();
        if (iZzb < 128) {
            return zzG(zzicnVar, zzicnVar2);
        }
        if (zzicnVar instanceof zzift) {
            zzift zziftVar = (zzift) zzicnVar;
            zzicn zzicnVar3 = zziftVar.zze;
            if (zzicnVar3.zzb() + zzicnVar2.zzb() < 128) {
                return new zzift(zziftVar.zzd, zzG(zzicnVar3, zzicnVar2));
            }
            zzicn zzicnVar4 = zziftVar.zzd;
            if (zzicnVar4.zzp() > zzicnVar3.zzp() && zziftVar.zzg > zzicnVar2.zzp()) {
                return new zzift(zzicnVar4, new zzift(zzicnVar3, zzicnVar2));
            }
        }
        return iZzb >= zzn(Math.max(zzicnVar.zzp(), zzicnVar2.zzp()) + 1) ? new zzift(zzicnVar, zzicnVar2) : zzifr.zza(zzicnVar, zzicnVar2, new ArrayDeque());
    }

    public static int zzn(int i10) {
        int[] iArr = zzb;
        int length = iArr.length;
        if (i10 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzicn, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzifq(this);
    }

    public final /* synthetic */ zzicn zzF() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final byte zza(int i10) {
        int i11 = this.zzf;
        return i10 < i11 ? this.zzd.zza(i10) : this.zze.zza(i10 - i11);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final zzicn zzc(int i10, int i11) {
        return zzd(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final zzicn zzd(int i10, int i11) {
        int i12 = this.zzc;
        int iZzD = zzicn.zzD(i10, i11, i12);
        if (iZzD == 0) {
            return zzicn.zza;
        }
        if (iZzD == i12) {
            return this;
        }
        int i13 = this.zzf;
        if (i11 <= i13) {
            return this.zzd.zzc(i10, i11);
        }
        int i14 = i11 - i13;
        if (i10 >= i13) {
            return this.zze.zzc(i10 - i13, i14);
        }
        zzicn zzicnVar = this.zzd;
        return new zzift(zzicnVar.zzc(i10, zzicnVar.zzb()), this.zze.zzc(0, i14));
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            this.zzd.zze(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.zze.zze(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.zzd.zze(bArr, i10, i11, i15);
            this.zze.zze(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final ByteBuffer zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final void zzg(zzice zziceVar) throws IOException {
        this.zzd.zzg(zziceVar);
        this.zze.zzg(zziceVar);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final String zzh(Charset charset) {
        return new String(zzA(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final boolean zzi() {
        zzifs zzifsVar = new zzifs(this, null);
        while (zzifsVar.hasNext()) {
            if (!zzifsVar.next().zzi()) {
                return zzigt.zza(zzA());
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final boolean zzj(zzicn zzicnVar) {
        zzick zzickVarZza;
        byte[] bArr = null;
        zzifs zzifsVar = new zzifs(this, bArr);
        zzick zzickVarZza2 = zzifsVar.next();
        zzifs zzifsVar2 = new zzifs(zzicnVar, bArr);
        zzick zzickVarZza3 = zzifsVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int iZzb = zzickVarZza2.zzb() - i10;
            int iZzb2 = zzickVarZza3.zzb() - i11;
            int iMin = Math.min(iZzb, iZzb2);
            if (!(i10 == 0 ? zzickVarZza2.zzk(zzickVarZza3, i11, iMin) : zzickVarZza3.zzk(zzickVarZza2, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.zzc;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iZzb) {
                zzickVarZza = zzifsVar.next();
                i10 = 0;
            } else {
                i10 += iMin;
            }
            if (iMin == iZzb2) {
                zzickVarZza2 = zzickVarZza2;
                zzickVarZza2 = zzickVarZza;
                zzickVarZza3 = zzifsVar2.next();
                i11 = 0;
            } else {
                zzickVarZza2 = zzickVarZza2;
                zzickVarZza2 = zzickVarZza;
                i11 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final int zzl(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            return this.zzd.zzl(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.zze.zzl(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.zze.zzl(this.zzd.zzl(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final zzicr zzm() {
        ArrayList arrayList = new ArrayList();
        zzifs zzifsVar = new zzifs(this, null);
        while (zzifsVar.hasNext()) {
            arrayList.add(zzifsVar.next().zzf());
        }
        int i10 = zzicr.zze;
        return zzicr.zzH(new zzieh(arrayList), 4096);
    }

    public final /* synthetic */ zzicn zzo() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final int zzp() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final boolean zzq() {
        return this.zzc >= zzn(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    /* JADX INFO: renamed from: zzr */
    public final zzici iterator() {
        return new zzifq(this);
    }

    private zzift(zzicn zzicnVar, zzicn zzicnVar2) {
        this.zzd = zzicnVar;
        this.zze = zzicnVar2;
        int iZzb = zzicnVar.zzb();
        this.zzf = iZzb;
        this.zzc = iZzb + zzicnVar2.zzb();
        this.zzg = Math.max(zzicnVar.zzp(), zzicnVar2.zzp()) + 1;
    }
}
