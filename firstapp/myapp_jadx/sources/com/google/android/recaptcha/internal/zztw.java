package com.google.android.recaptcha.internal;

import defpackage.ib5;
import defpackage.vpl0;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zztw implements zzug {
    private final zzts zza;
    private final zzuv zzb;
    private final boolean zzc;
    private final zzrz zzd;

    private zztw(zzuv zzuvVar, zzrz zzrzVar, zzts zztsVar) {
        this.zzb = zzuvVar;
        this.zzc = zztsVar instanceof zzsk;
        this.zzd = zzrzVar;
        this.zza = zztsVar;
    }

    public static zztw zzc(zzuv zzuvVar, zzrz zzrzVar, zzts zztsVar) {
        return new zztw(zzuvVar, zzrzVar, zztsVar);
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final int zza(Object obj) {
        int iZzb = ((zzsn) obj).zzc.zzb();
        return this.zzc ? iZzb + ((zzsk) obj).zzb.zzb() : iZzb;
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final int zzb(Object obj) {
        int iHashCode = ((zzsn) obj).zzc.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zzsk) obj).zzb.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final Object zze() {
        zzts zztsVar = this.zza;
        return zztsVar instanceof zzsn ? ((zzsn) zztsVar).zzv() : zztsVar.zzaf().zzl();
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final void zzf(Object obj) {
        this.zzb.zzi(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final void zzg(Object obj, Object obj2) {
        zzui.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            zzui.zzp(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final void zzh(Object obj, zzuf zzufVar, zzry zzryVar) {
        boolean zZzO;
        zzuv zzuvVar = this.zzb;
        Object objZza = zzuvVar.zza(obj);
        ((zzsk) obj).zzi();
        while (zzufVar.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zzufVar.zzd();
                int iZzj = 0;
                if (iZzd != 11) {
                    if ((iZzd & 7) != 2) {
                        zZzO = zzufVar.zzO();
                    } else {
                        if (zzryVar.zza(this.zza, iZzd >>> 3) != null) {
                            throw null;
                        }
                        zZzO = zzuvVar.zzk(objZza, zzufVar, 0);
                    }
                    if (!zZzO) {
                        break;
                    }
                } else {
                    zzsm zzsmVarZza = null;
                    zzqm zzqmVarZzp = null;
                    while (zzufVar.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zzufVar.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zzufVar.zzj();
                            zzsmVarZza = zzryVar.zza(this.zza, iZzj);
                        } else if (iZzd2 == 26) {
                            if (zzsmVarZza != null) {
                                throw null;
                            }
                            zzqmVarZzp = zzufVar.zzp();
                        } else if (iZzd2 == 12 || !zzufVar.zzO()) {
                            break;
                        }
                    }
                    if (zzufVar.zzd() != 12) {
                        throw new zzsx("Protocol message end-group tag did not match expected tag.");
                    }
                    if (zzqmVarZzp == null) {
                        continue;
                    } else {
                        if (zzsmVarZza != null) {
                            throw null;
                        }
                        zzuvVar.zzg(objZza, iZzj, zzqmVarZzp);
                    }
                }
            } catch (Throwable th) {
                zzuvVar.zzj(obj, objZza);
                throw th;
            }
        }
        zzuvVar.zzj(obj, objZza);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:58:0x008b A[EDGE_INSN: B:58:0x008b->B:35:0x008b BREAK  A[LOOP:1: B:18:0x004e->B:63:0x004e], SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzug
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzqb zzqbVar) throws zzsx {
        int iZzi;
        zzsn zzsnVar = (zzsn) obj;
        zzuw zzuwVarZzf = zzsnVar.zzc;
        if (zzuwVarZzf == zzuw.zzc()) {
            zzuwVarZzf = zzuw.zzf();
            zzsnVar.zzc = zzuwVarZzf;
        }
        zzuw zzuwVar = zzuwVarZzf;
        ((zzsk) obj).zzi();
        zzsm zzsmVarZza = null;
        while (i < i2) {
            int iZzi2 = zzqc.zzi(bArr, i, zzqbVar);
            int i3 = zzqbVar.zza;
            if (i3 == 11) {
                byte[] bArr2 = bArr;
                int i4 = i2;
                zzqb zzqbVar2 = zzqbVar;
                int i5 = 0;
                zzqm zzqmVar = null;
                while (true) {
                    if (iZzi2 >= i4) {
                        iZzi = iZzi2;
                        break;
                    }
                    iZzi = zzqc.zzi(bArr2, iZzi2, zzqbVar2);
                    int i6 = zzqbVar2.zza;
                    int i7 = i6 >>> 3;
                    int i8 = i6 & 7;
                    if (i7 == 2) {
                        if (i8 != 0) {
                            if (i6 != 12) {
                                break;
                                break;
                            }
                            iZzi2 = zzqc.zzo(i6, bArr2, iZzi, i4, zzqbVar2);
                        } else {
                            iZzi2 = zzqc.zzi(bArr2, iZzi, zzqbVar2);
                            i5 = zzqbVar2.zza;
                            zzsmVarZza = zzqbVar2.zzd.zza(this.zza, i5);
                        }
                    } else {
                        if (i7 == 3) {
                            if (zzsmVarZza != null) {
                                int i9 = zzuc.zza;
                                throw null;
                            }
                            if (i8 == 2) {
                                iZzi2 = zzqc.zza(bArr2, iZzi, zzqbVar2);
                                zzqmVar = (zzqm) zzqbVar2.zzc;
                            }
                        }
                        if (i6 != 12) {
                            break;
                        } else {
                            iZzi2 = zzqc.zzo(i6, bArr2, iZzi, i4, zzqbVar2);
                        }
                    }
                }
                if (zzqmVar != null) {
                    zzuwVar.zzj((i5 << 3) | 2, zzqmVar);
                }
                i = iZzi;
                bArr = bArr2;
                i2 = i4;
                zzqbVar = zzqbVar2;
            } else if ((i3 & 7) == 2) {
                zzsmVarZza = zzqbVar.zzd.zza(this.zza, i3 >>> 3);
                if (zzsmVarZza != null) {
                    int i10 = zzuc.zza;
                    throw null;
                }
                i = zzqc.zzh(i3, bArr, iZzi2, i2, zzuwVar, zzqbVar);
            } else {
                i = zzqc.zzo(i3, bArr, iZzi2, i2, zzqbVar);
            }
        }
        if (i == i2) {
            return;
        }
        vpl0.a("Failed to parse the message.");
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final void zzj(Object obj, zzvi zzviVar) {
        Iterator itZzf = ((zzsk) obj).zzb.zzf();
        while (itZzf.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzf.next();
            zzsc zzscVar = (zzsc) entry.getKey();
            if (zzscVar.zze() != zzvh.MESSAGE) {
                ib5.a("Found invalid MessageSet item.");
                return;
            }
            zzscVar.zzg();
            zzscVar.zzf();
            if (entry instanceof zzsz) {
                zzviVar.zzw(zzscVar.zza(), ((zzsz) entry).zza().zzb());
            } else {
                zzviVar.zzw(zzscVar.zza(), entry.getValue());
            }
        }
        ((zzsn) obj).zzc.zzk(zzviVar);
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final boolean zzk(Object obj, Object obj2) {
        if (!((zzsn) obj).zzc.equals(((zzsn) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzsk) obj).zzb.equals(((zzsk) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final boolean zzl(Object obj) {
        return ((zzsk) obj).zzb.zzk();
    }
}
