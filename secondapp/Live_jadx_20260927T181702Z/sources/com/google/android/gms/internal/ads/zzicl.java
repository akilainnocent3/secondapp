package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzicl extends zzick {
    private final byte[] zzb;

    public zzicl(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final byte zza(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final zzicn zzc(int i10, int i11) {
        byte[] bArr = this.zzb;
        int iZzD = zzicn.zzD(i10, i11, bArr.length);
        return iZzD == 0 ? zzicn.zza : new zzich(bArr, i10, iZzD);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final zzicn zzd(int i10, int i11) {
        byte[] bArr = this.zzb;
        int iZzD = zzicn.zzD(i10, i11, bArr.length);
        return iZzD == 0 ? zzicn.zza : new zzich(bArr, i10, iZzD);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zzb, i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final ByteBuffer zzf() {
        return ByteBuffer.wrap(this.zzb).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final void zzg(zzice zziceVar) throws IOException {
        byte[] bArr = this.zzb;
        zziceVar.zza(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final String zzh(Charset charset) {
        return new String(this.zzb, charset);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final boolean zzi() {
        return zzigt.zza(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final boolean zzj(zzicn zzicnVar) {
        if (zzicnVar instanceof zzicl) {
            return Arrays.equals(this.zzb, ((zzicl) zzicnVar).zzb);
        }
        return zzicnVar instanceof zzich ? zzk(zzicnVar, 0, this.zzb.length) : zzicnVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zzick
    public final boolean zzk(zzicn zzicnVar, int i10, int i11) {
        if (i11 > zzicnVar.zzb()) {
            byte[] bArr = this.zzb;
            int length = String.valueOf(i11).length();
            int length2 = bArr.length;
            StringBuilder sb2 = new StringBuilder(length + 18 + String.valueOf(length2).length());
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(length2);
            throw new IllegalArgumentException(sb2.toString());
        }
        int i12 = i10 + i11;
        if (i12 <= zzicnVar.zzb()) {
            if (zzicnVar instanceof zzicl) {
                return zzicn.zzE(this.zzb, 0, ((zzicl) zzicnVar).zzb, i10, i11);
            }
            if (!(zzicnVar instanceof zzich)) {
                return zzicnVar.zzd(i10, i12).equals(zzd(0, i11));
            }
            zzich zzichVar = (zzich) zzicnVar;
            return zzicn.zzE(this.zzb, 0, zzichVar.zzn(), zzichVar.zzo() + i10, i11);
        }
        int iZzb = zzicnVar.zzb();
        int length3 = String.valueOf(i10).length();
        StringBuilder sb3 = new StringBuilder(length3 + 24 + String.valueOf(i11).length() + 2 + String.valueOf(iZzb).length());
        sb3.append("Ran off end of other: ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(i11);
        sb3.append(", ");
        sb3.append(iZzb);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final int zzl(int i10, int i11, int i12) {
        return zziee.zzc(i10, this.zzb, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final zzicr zzm() {
        byte[] bArr = this.zzb;
        return zzicr.zzI(bArr, 0, bArr.length, true);
    }

    public final /* synthetic */ byte[] zzn() {
        return this.zzb;
    }
}
