package com.google.android.recaptcha.internal;

import defpackage.bl0;
import defpackage.dad;
import defpackage.dsl0;
import defpackage.gqm;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzuw {
    private static final zzuw zza = new zzuw(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzuw(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzuw zzc() {
        return zza;
    }

    public static zzuw zze(zzuw zzuwVar, zzuw zzuwVar2) {
        int i = zzuwVar.zzb + zzuwVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzuwVar.zzc, i);
        System.arraycopy(zzuwVar2.zzc, 0, iArrCopyOf, zzuwVar.zzb, zzuwVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzuwVar.zzd, i);
        System.arraycopy(zzuwVar2.zzd, 0, objArrCopyOf, zzuwVar.zzb, zzuwVar2.zzb);
        return new zzuw(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzuw zzf() {
        return new zzuw(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzuw)) {
            return false;
        }
        zzuw zzuwVar = (zzuw) obj;
        int i = this.zzb;
        if (i == zzuwVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzuwVar.zzc;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzuwVar.zzd;
            int i3 = this.zzb;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.zzd;
        int i6 = this.zzb;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final int zza() {
        int iZzA;
        int iZzB;
        int iZzA2;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzA3 = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        int i6 = i4 << 3;
                        zzqm zzqmVar = (zzqm) this.zzd[i2];
                        int iZzA4 = zzqv.zzA(i6);
                        int iZzd = zzqmVar.zzd();
                        iZzA3 = zzqv.zzA(iZzd) + iZzd + iZzA4 + iZzA3;
                    } else if (i5 == 3) {
                        int iZzA5 = zzqv.zzA(i4 << 3);
                        iZzA = iZzA5 + iZzA5;
                        iZzB = ((zzuw) this.zzd[i2]).zza();
                    } else {
                        if (i5 != 5) {
                            dad.a(new zzsw("Protocol message tag had invalid wire type."));
                            return 0;
                        }
                        ((Integer) this.zzd[i2]).getClass();
                        iZzA2 = zzqv.zzA(i4 << 3) + 4;
                    }
                } else {
                    ((Long) this.zzd[i2]).getClass();
                    iZzA2 = zzqv.zzA(i4 << 3) + 8;
                }
                iZzA3 = iZzA2 + iZzA3;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.zzd[i2]).longValue();
                iZzA = zzqv.zzA(i7);
                iZzB = zzqv.zzB(jLongValue);
            }
            iZzA3 = iZzB + iZzA + iZzA3;
        }
        this.zze = iZzA3;
        return iZzA3;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iA = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2] >>> 3;
            zzqm zzqmVar = (zzqm) this.zzd[i2];
            int iZzA = zzqv.zzA(8);
            int iZzA2 = zzqv.zzA(i3) + zzqv.zzA(16);
            int iZzA3 = zzqv.zzA(24);
            int iZzd = zzqmVar.zzd();
            iA += iZzA + iZzA + iZzA2 + dsl0.a(iZzd, iZzd, iZzA3);
        }
        this.zze = iA;
        return iA;
    }

    public final zzuw zzd(zzuw zzuwVar) {
        if (zzuwVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzuwVar.zzb;
        zzm(i);
        System.arraycopy(zzuwVar.zzc, 0, this.zzc, this.zzb, zzuwVar.zzb);
        System.arraycopy(zzuwVar.zzd, 0, this.zzd, this.zzb, zzuwVar.zzb);
        this.zzb = i;
        return this;
    }

    public final void zzg() {
        if (this.zzf) {
            return;
        }
        bl0.a();
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zztu.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    public final void zzj(int i, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final void zzk(zzvi zzviVar) {
        for (int i = 0; i < this.zzb; i++) {
            zzviVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzl(zzvi zzviVar) {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzviVar.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzviVar.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzviVar.zzd(i4, (zzqm) obj);
                } else if (i3 == 3) {
                    zzviVar.zzF(i4);
                    ((zzuw) obj).zzl(zzviVar);
                    zzviVar.zzh(i4);
                } else {
                    if (i3 != 5) {
                        gqm.a(new zzsw("Protocol message tag had invalid wire type."));
                        return;
                    }
                    zzviVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzuw() {
        this(0, new int[8], new Object[8], true);
    }
}
