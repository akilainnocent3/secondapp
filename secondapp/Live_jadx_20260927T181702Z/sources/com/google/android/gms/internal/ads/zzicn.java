package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzicn implements Iterable<Byte>, Serializable {
    public static final zzicn zza = new zzicl(zziee.zzb);
    private int zzb = 0;

    static {
        int i10 = zzica.zza;
    }

    public static zzicm zzC() {
        return new zzicm(128);
    }

    public static int zzD(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Beginning index: ");
            sb2.append(i10);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < i10) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 44 + String.valueOf(i11).length());
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(i11).length() + 15 + String.valueOf(i12).length());
        sb4.append("End index: ");
        sb4.append(i11);
        sb4.append(" >= ");
        sb4.append(i12);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    public static /* synthetic */ boolean zzE(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        int i13 = i10 + i12;
        zzD(i10, i13, bArr.length);
        zzD(i11, i12 + i11, bArr2.length);
        while (i10 < i13) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    private static zzicn zzk(Iterator it, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "length (%s) must be >= 1", Integer.valueOf(i10)));
        }
        if (i10 == 1) {
            return (zzicn) it.next();
        }
        int i11 = i10 >>> 1;
        zzicn zzicnVarZzk = zzk(it, i11);
        zzicn zzicnVarZzk2 = zzk(it, i10 - i11);
        if (Integer.MAX_VALUE - zzicnVarZzk.zzb() >= zzicnVarZzk2.zzb()) {
            return zzift.zzk(zzicnVarZzk, zzicnVarZzk2);
        }
        int iZzb = zzicnVarZzk.zzb();
        int iZzb2 = zzicnVarZzk2.zzb();
        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzb).length() + 31 + String.valueOf(iZzb2).length());
        sb2.append("ByteString would be too long: ");
        sb2.append(iZzb);
        sb2.append(com.google.android.material.badge.a.f50153v);
        sb2.append(iZzb2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static zzicn zzt(byte[] bArr, int i10, int i11) {
        try {
            return zzu(bArr, i10, i11, false);
        } catch (zzieg e10) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
        }
    }

    public static zzicn zzu(byte[] bArr, int i10, int i11, boolean z10) throws zzieg {
        if (i11 == 0) {
            return zza;
        }
        zzD(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzicl(bArr2);
    }

    public static zzicn zzv(byte[] bArr) {
        try {
            return zzw(bArr, false);
        } catch (zzieg e10) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
        }
    }

    public static zzicn zzw(byte[] bArr, boolean z10) throws zzieg {
        return bArr.length == 0 ? zza : new zzicl(bArr);
    }

    public static zzicn zzx(String str) {
        return str.isEmpty() ? zza : new zzicl(str.getBytes(zziee.zza));
    }

    public static zzicn zzy(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zza : zzk(iterable.iterator(), size);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzicn)) {
            return false;
        }
        zzicn zzicnVar = (zzicn) obj;
        int iZzb = zzb();
        if (iZzb != zzicnVar.zzb()) {
            return false;
        }
        if (iZzb == 0) {
            return true;
        }
        int i10 = this.zzb;
        int i11 = zzicnVar.zzb;
        if (i10 == 0 || i11 == 0 || i10 == i11) {
            return zzj(zzicnVar);
        }
        return false;
    }

    public final int hashCode() {
        int iZzl = this.zzb;
        if (iZzl == 0) {
            int iZzb = zzb();
            iZzl = zzl(iZzb, 0, iZzb);
            if (iZzl == 0) {
                iZzl = 1;
            }
            this.zzb = iZzl;
        }
        return iZzl;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzb()), zzb() <= 50 ? zzigd.zza(zzA()) : zzigd.zza(zzd(0, 47).zzA()).concat("..."));
    }

    public final byte[] zzA() {
        int iZzb = zzb();
        if (iZzb == 0) {
            return zziee.zzb;
        }
        byte[] bArr = new byte[iZzb];
        zze(bArr, 0, 0, iZzb);
        return bArr;
    }

    public final String zzB() {
        return zzs() ? "" : zzh(zziee.zza);
    }

    public abstract byte zza(int i10);

    public abstract int zzb();

    public abstract zzicn zzc(int i10, int i11);

    public abstract zzicn zzd(int i10, int i11);

    public abstract void zze(byte[] bArr, int i10, int i11, int i12);

    public abstract ByteBuffer zzf();

    public abstract void zzg(zzice zziceVar) throws IOException;

    public abstract String zzh(Charset charset);

    public abstract boolean zzi();

    public abstract boolean zzj(zzicn zzicnVar);

    public abstract int zzl(int i10, int i11, int i12);

    public abstract zzicr zzm();

    public abstract int zzp();

    public abstract boolean zzq();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public zzici iterator() {
        return new zzicf(this);
    }

    public final boolean zzs() {
        return zzb() == 0;
    }

    @Deprecated
    public final void zzz(byte[] bArr, int i10, int i11, int i12) {
        zzD(0, i12, zzb());
        zzD(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            zze(bArr, 0, i11, i12);
        }
    }
}
