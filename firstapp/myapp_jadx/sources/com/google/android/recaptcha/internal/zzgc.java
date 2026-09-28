package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
final class zzgc extends tje0 implements Function2 {
    Object zza;
    double zzb;
    int zzc;
    final /* synthetic */ zzge zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ String zzf;
    final /* synthetic */ RecaptchaAction zzg;
    private /* synthetic */ Object zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgc(zzge zzgeVar, long j, String str, RecaptchaAction recaptchaAction, v1b v1bVar) {
        super(2, v1bVar);
        this.zzd = zzgeVar;
        this.zze = j;
        this.zzf = str;
        this.zzg = recaptchaAction;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        zzgc zzgcVar = new zzgc(this.zzd, this.zze, this.zzf, this.zzg, v1bVar);
        zzgcVar.zzh = obj;
        return zzgcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgc) create((zzhk) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ef A[Catch: Exception -> 0x0128, zzcg -> 0x013b, PHI: r2 r5
      0x00ef: PHI (r2v14 java.lang.Object) = (r2v13 java.lang.Object), (r2v27 java.lang.Object) binds: [B:43:0x00ed, B:17:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x00ef: PHI (r5v5 com.google.android.recaptcha.internal.zzhk) = (r5v4 com.google.android.recaptcha.internal.zzhk), (r5v9 com.google.android.recaptcha.internal.zzhk) binds: [B:43:0x00ed, B:17:0x0039] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {zzcg -> 0x013b, Exception -> 0x0128, blocks: (B:10:0x001c, B:49:0x0113, B:13:0x0029, B:46:0x0103, B:16:0x0036, B:44:0x00ef, B:19:0x0046, B:42:0x00e1, B:22:0x0054, B:36:0x00ba, B:39:0x00cb, B:25:0x0065, B:33:0x00a9, B:28:0x0073, B:30:0x0083, B:52:0x0119, B:53:0x0127), top: B:59:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0103 A[Catch: Exception -> 0x0128, zzcg -> 0x013b, PHI: r2 r3 r5
      0x0103: PHI (r2v16 com.google.android.recaptcha.internal.zzyg) = (r2v15 com.google.android.recaptcha.internal.zzyg), (r2v30 com.google.android.recaptcha.internal.zzyg) binds: [B:45:0x0101, B:14:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0103: PHI (r3v4 java.lang.Object) = (r3v3 java.lang.Object), (r3v8 java.lang.Object) binds: [B:45:0x0101, B:14:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0103: PHI (r5v6 com.google.android.recaptcha.internal.zzhk) = (r5v5 com.google.android.recaptcha.internal.zzhk), (r5v10 com.google.android.recaptcha.internal.zzhk) binds: [B:45:0x0101, B:14:0x002c] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {zzcg -> 0x013b, Exception -> 0x0128, blocks: (B:10:0x001c, B:49:0x0113, B:13:0x0029, B:46:0x0103, B:16:0x0036, B:44:0x00ef, B:19:0x0046, B:42:0x00e1, B:22:0x0054, B:36:0x00ba, B:39:0x00cb, B:25:0x0065, B:33:0x00a9, B:28:0x0073, B:30:0x0083, B:52:0x0119, B:53:0x0127), top: B:59:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0112  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws zzcg {
        zzhk zzhkVar;
        Object objZzl;
        double d;
        zzhk zzhkVar2;
        Object objZza;
        double d2;
        zzxn zzxnVar;
        Object objZzm;
        zzhk zzhkVar3;
        Object objZza2;
        zzyg zzygVar;
        Object objZzo;
        zzyg zzygVar2;
        y5b y5bVar = y5b.a;
        int i = this.zzc;
        try {
            if (i == 0) {
                uj50.b(obj);
                zzhkVar = (zzhk) this.zzh;
                zzge zzgeVar = this.zzd;
                if (!Intrinsics.g(zzgeVar.zzb, zzdv.zzb)) {
                    throw new zzcg(zzce.zzb, zzcd.zzas, null, null, 12, null);
                }
                double d3 = this.zze;
                zzfp zzfpVar = zzgeVar.zza;
                String str = this.zzf;
                double d4 = 0.45d * d3;
                this.zzh = zzhkVar;
                this.zza = zzhkVar;
                double d5 = d3 * 0.55d;
                this.zzb = d5;
                this.zzc = 1;
                objZzl = zzfpVar.zzl(str, (long) d4, this);
                if (objZzl != y5bVar) {
                    d = d5;
                    zzhkVar2 = zzhkVar;
                }
                return y5bVar;
            }
            if (i == 1) {
                d = this.zzb;
                zzhkVar = (zzhk) this.zza;
                zzhk zzhkVar4 = (zzhk) this.zzh;
                uj50.b(obj);
                zzhkVar2 = zzhkVar4;
                objZzl = obj;
            } else {
                if (i == 2) {
                    d2 = this.zzb;
                    zzhk zzhkVar5 = (zzhk) this.zzh;
                    uj50.b(obj);
                    zzhkVar2 = zzhkVar5;
                    objZza = obj;
                    zzxx zzxxVar = (zzxx) objZza;
                    zzge zzgeVar2 = this.zzd;
                    zzfp zzfpVar2 = zzgeVar2.zza;
                    RecaptchaAction recaptchaAction = this.zzg;
                    zzxnVar = zzgeVar2.zzc;
                    if (zzxnVar == null) {
                        zzxnVar = null;
                    }
                    zzye zzyeVarZzk = zzfpVar2.zzk(recaptchaAction, zzxxVar, zzxnVar);
                    this.zzh = zzhkVar2;
                    this.zza = zzhkVar2;
                    this.zzc = 3;
                    objZzm = zzgeVar2.zza.zzm(zzyeVarZzk, (long) d2, this);
                    if (objZzm != y5bVar) {
                        zzhkVar3 = zzhkVar2;
                        this.zzh = zzhkVar3;
                        this.zza = null;
                        this.zzc = 4;
                        objZza2 = ((zzhf) objZzm).zza(zzhkVar2, this);
                        if (objZza2 != y5bVar) {
                            zzygVar = (zzyg) objZza2;
                            zzfp zzfpVar3 = this.zzd.zza;
                            this.zzh = zzygVar;
                            this.zza = zzhkVar3;
                            this.zzc = 5;
                            objZzo = zzfpVar3.zzo(zzygVar, this);
                            if (objZzo != y5bVar) {
                                this.zzh = zzygVar;
                                this.zza = null;
                                this.zzc = 6;
                                if (zzhj.zzb(zzhkVar3, (zzhf) objZzo, this) != y5bVar) {
                                    zzygVar2 = zzygVar;
                                }
                            }
                        }
                    }
                    return y5bVar;
                }
                if (i == 3) {
                    zzhk zzhkVar6 = (zzhk) this.zza;
                    zzhkVar3 = (zzhk) this.zzh;
                    uj50.b(obj);
                    zzhkVar2 = zzhkVar6;
                    objZzm = obj;
                    this.zzh = zzhkVar3;
                    this.zza = null;
                    this.zzc = 4;
                    objZza2 = ((zzhf) objZzm).zza(zzhkVar2, this);
                    if (objZza2 != y5bVar) {
                        zzygVar = (zzyg) objZza2;
                        zzfp zzfpVar4 = this.zzd.zza;
                        this.zzh = zzygVar;
                        this.zza = zzhkVar3;
                        this.zzc = 5;
                        objZzo = zzfpVar4.zzo(zzygVar, this);
                        if (objZzo != y5bVar) {
                            this.zzh = zzygVar;
                            this.zza = null;
                            this.zzc = 6;
                            if (zzhj.zzb(zzhkVar3, (zzhf) objZzo, this) != y5bVar) {
                                zzygVar2 = zzygVar;
                            }
                        }
                    }
                    return y5bVar;
                }
                if (i == 4) {
                    zzhk zzhkVar7 = (zzhk) this.zzh;
                    uj50.b(obj);
                    zzhkVar3 = zzhkVar7;
                    objZza2 = obj;
                    zzygVar = (zzyg) objZza2;
                    zzfp zzfpVar5 = this.zzd.zza;
                    this.zzh = zzygVar;
                    this.zza = zzhkVar3;
                    this.zzc = 5;
                    objZzo = zzfpVar5.zzo(zzygVar, this);
                    if (objZzo != y5bVar) {
                        this.zzh = zzygVar;
                        this.zza = null;
                        this.zzc = 6;
                        if (zzhj.zzb(zzhkVar3, (zzhf) objZzo, this) != y5bVar) {
                            zzygVar2 = zzygVar;
                        }
                    }
                    return y5bVar;
                }
                if (i == 5) {
                    zzhk zzhkVar8 = (zzhk) this.zza;
                    zzyg zzygVar3 = (zzyg) this.zzh;
                    uj50.b(obj);
                    zzhkVar3 = zzhkVar8;
                    zzygVar = zzygVar3;
                    objZzo = obj;
                    this.zzh = zzygVar;
                    this.zza = null;
                    this.zzc = 6;
                    if (zzhj.zzb(zzhkVar3, (zzhf) objZzo, this) != y5bVar) {
                        zzygVar2 = zzygVar;
                    }
                    return y5bVar;
                }
                zzygVar2 = (zzyg) this.zzh;
                uj50.b(obj);
            }
            return zzygVar2.zzj();
            this.zzh = zzhkVar2;
            this.zza = null;
            this.zzb = d;
            this.zzc = 2;
            objZza = ((zzhf) objZzl).zza(zzhkVar, this);
            if (objZza != y5bVar) {
                d2 = d;
                zzxx zzxxVar2 = (zzxx) objZza;
                zzge zzgeVar3 = this.zzd;
                zzfp zzfpVar6 = zzgeVar3.zza;
                RecaptchaAction recaptchaAction2 = this.zzg;
                zzxnVar = zzgeVar3.zzc;
                if (zzxnVar == null) {
                    zzxnVar = null;
                }
                zzye zzyeVarZzk2 = zzfpVar6.zzk(recaptchaAction2, zzxxVar2, zzxnVar);
                this.zzh = zzhkVar2;
                this.zza = zzhkVar2;
                this.zzc = 3;
                objZzm = zzgeVar3.zza.zzm(zzyeVarZzk2, (long) d2, this);
                if (objZzm != y5bVar) {
                    zzhkVar3 = zzhkVar2;
                    this.zzh = zzhkVar3;
                    this.zza = null;
                    this.zzc = 4;
                    objZza2 = ((zzhf) objZzm).zza(zzhkVar2, this);
                    if (objZza2 != y5bVar) {
                        zzygVar = (zzyg) objZza2;
                        zzfp zzfpVar7 = this.zzd.zza;
                        this.zzh = zzygVar;
                        this.zza = zzhkVar3;
                        this.zzc = 5;
                        objZzo = zzfpVar7.zzo(zzygVar, this);
                        if (objZzo != y5bVar) {
                            this.zzh = zzygVar;
                            this.zza = null;
                            this.zzc = 6;
                            if (zzhj.zzb(zzhkVar3, (zzhf) objZzo, this) != y5bVar) {
                                zzygVar2 = zzygVar;
                                return zzygVar2.zzj();
                            }
                        }
                    }
                }
            }
            return y5bVar;
        } catch (zzcg e) {
            throw e;
        } catch (Exception e2) {
            throw new zzcg(zzce.zzb, zzcd.zzaC, e2.getMessage(), null, 8, null);
        }
    }
}
