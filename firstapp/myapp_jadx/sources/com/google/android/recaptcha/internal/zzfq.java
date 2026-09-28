package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzfq extends tje0 implements Function2 {
    Object zza;
    double zzb;
    int zzc;
    final /* synthetic */ zzgb zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ String zzf;
    final /* synthetic */ RecaptchaAction zzg;
    private /* synthetic */ Object zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfq(zzgb zzgbVar, long j, String str, RecaptchaAction recaptchaAction, v1b v1bVar) {
        super(2, v1bVar);
        this.zzd = zzgbVar;
        this.zze = j;
        this.zzf = str;
        this.zzg = recaptchaAction;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        zzfq zzfqVar = new zzfq(this.zzd, this.zze, this.zzf, this.zzg, v1bVar);
        zzfqVar.zzh = obj;
        return zzfqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfq) create((zzhk) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:49:0x010a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0120 A[Catch: Exception -> 0x0137, zzcg -> 0x014b, PHI: r1 r3 r12
      0x0120: PHI (r1v25 com.google.android.recaptcha.internal.zzhk) = (r1v22 com.google.android.recaptcha.internal.zzhk), (r1v27 com.google.android.recaptcha.internal.zzhk) binds: [B:51:0x011e, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x0120: PHI (r3v21 java.lang.Object) = (r3v20 java.lang.Object), (r3v25 java.lang.Object) binds: [B:51:0x011e, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x0120: PHI (r12v24 com.google.android.recaptcha.internal.zzyg) = (r12v23 com.google.android.recaptcha.internal.zzyg), (r12v25 com.google.android.recaptcha.internal.zzyg) binds: [B:51:0x011e, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {zzcg -> 0x014b, Exception -> 0x0137, blocks: (B:5:0x000c, B:55:0x0131, B:8:0x0019, B:52:0x0120, B:11:0x0025, B:50:0x010b, B:14:0x0032, B:47:0x00fb, B:17:0x003d, B:41:0x00d3, B:44:0x00e4, B:20:0x004c, B:38:0x00c1, B:23:0x0055, B:35:0x0095, B:26:0x0061, B:32:0x0085, B:29:0x006d), top: B:64:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0130  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws zzcg {
        zzhk zzhkVar;
        zzhk zzhkVar2;
        zzhk zzhkVar3;
        double d;
        zzhk zzhkVar4;
        zzhk zzhkVar5;
        zzxn zzxnVar;
        zzhk zzhkVar6;
        zzhk zzhkVar7;
        zzyg zzygVar;
        Object objZzo;
        zzyg zzygVar2;
        y5b y5bVar = y5b.a;
        try {
            switch (this.zzc) {
                case 0:
                    uj50.b(obj);
                    zzhkVar = (zzhk) this.zzh;
                    zzgb zzgbVar = this.zzd;
                    long j = this.zze;
                    this.zzh = zzhkVar;
                    this.zza = zzhkVar;
                    this.zzc = 1;
                    obj = new zzhg(new zzfu(zzgbVar, j, null));
                    if (obj != y5bVar) {
                        zzhkVar2 = zzhkVar;
                        this.zzh = zzhkVar2;
                        this.zza = null;
                        this.zzc = 2;
                        obj = ((zzhg) obj).zza(zzhkVar, this);
                        if (obj != y5bVar) {
                            zzhkVar3 = zzhkVar2;
                            double dLongValue = ((Number) obj).longValue();
                            zzfp zzfpVar = this.zzd.zza;
                            String str = this.zzf;
                            double d2 = 0.45d * dLongValue;
                            this.zzh = zzhkVar3;
                            this.zza = zzhkVar3;
                            d = dLongValue * 0.55d;
                            this.zzb = d;
                            this.zzc = 3;
                            obj = zzfpVar.zzl(str, (long) d2, this);
                            if (obj != y5bVar) {
                                zzhkVar4 = zzhkVar3;
                                this.zzh = zzhkVar4;
                                this.zza = null;
                                this.zzb = d;
                                this.zzc = 4;
                                obj = ((zzhf) obj).zza(zzhkVar3, this);
                                if (obj != y5bVar) {
                                    zzhkVar5 = zzhkVar4;
                                    zzxx zzxxVar = (zzxx) obj;
                                    zzgb zzgbVar2 = this.zzd;
                                    zzfp zzfpVar2 = zzgbVar2.zza;
                                    RecaptchaAction recaptchaAction = this.zzg;
                                    zzxnVar = zzgbVar2.zze;
                                    if (zzxnVar == null) {
                                        zzxnVar = null;
                                    }
                                    zzye zzyeVarZzk = zzfpVar2.zzk(recaptchaAction, zzxxVar, zzxnVar);
                                    this.zzh = zzhkVar5;
                                    this.zza = zzhkVar5;
                                    this.zzc = 5;
                                    obj = zzgbVar2.zza.zzm(zzyeVarZzk, (long) d, this);
                                    if (obj != y5bVar) {
                                        zzhkVar6 = zzhkVar5;
                                        this.zzh = zzhkVar6;
                                        this.zza = null;
                                        this.zzc = 6;
                                        obj = ((zzhf) obj).zza(zzhkVar5, this);
                                        if (obj != y5bVar) {
                                            zzhkVar7 = zzhkVar6;
                                            zzygVar = (zzyg) obj;
                                            zzfp zzfpVar3 = this.zzd.zza;
                                            this.zzh = zzygVar;
                                            this.zza = zzhkVar7;
                                            this.zzc = 7;
                                            objZzo = zzfpVar3.zzo(zzygVar, this);
                                            if (objZzo != y5bVar) {
                                                this.zzh = zzygVar;
                                                this.zza = null;
                                                this.zzc = 8;
                                                if (zzhj.zzb(zzhkVar7, (zzhf) objZzo, this) != y5bVar) {
                                                    zzygVar2 = zzygVar;
                                                    return zzygVar2.zzj();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return y5bVar;
                case 1:
                    zzhkVar = (zzhk) this.zza;
                    zzhkVar2 = (zzhk) this.zzh;
                    uj50.b(obj);
                    this.zzh = zzhkVar2;
                    this.zza = null;
                    this.zzc = 2;
                    obj = ((zzhg) obj).zza(zzhkVar, this);
                    if (obj != y5bVar) {
                        zzhkVar3 = zzhkVar2;
                        double dLongValue2 = ((Number) obj).longValue();
                        zzfp zzfpVar4 = this.zzd.zza;
                        String str2 = this.zzf;
                        double d3 = 0.45d * dLongValue2;
                        this.zzh = zzhkVar3;
                        this.zza = zzhkVar3;
                        d = dLongValue2 * 0.55d;
                        this.zzb = d;
                        this.zzc = 3;
                        obj = zzfpVar4.zzl(str2, (long) d3, this);
                        if (obj != y5bVar) {
                            zzhkVar4 = zzhkVar3;
                            this.zzh = zzhkVar4;
                            this.zza = null;
                            this.zzb = d;
                            this.zzc = 4;
                            obj = ((zzhf) obj).zza(zzhkVar3, this);
                            if (obj != y5bVar) {
                                zzhkVar5 = zzhkVar4;
                                zzxx zzxxVar2 = (zzxx) obj;
                                zzgb zzgbVar3 = this.zzd;
                                zzfp zzfpVar5 = zzgbVar3.zza;
                                RecaptchaAction recaptchaAction2 = this.zzg;
                                zzxnVar = zzgbVar3.zze;
                                if (zzxnVar == null) {
                                    zzxnVar = null;
                                }
                                zzye zzyeVarZzk2 = zzfpVar5.zzk(recaptchaAction2, zzxxVar2, zzxnVar);
                                this.zzh = zzhkVar5;
                                this.zza = zzhkVar5;
                                this.zzc = 5;
                                obj = zzgbVar3.zza.zzm(zzyeVarZzk2, (long) d, this);
                                if (obj != y5bVar) {
                                    zzhkVar6 = zzhkVar5;
                                    this.zzh = zzhkVar6;
                                    this.zza = null;
                                    this.zzc = 6;
                                    obj = ((zzhf) obj).zza(zzhkVar5, this);
                                    if (obj != y5bVar) {
                                        zzhkVar7 = zzhkVar6;
                                        zzygVar = (zzyg) obj;
                                        zzfp zzfpVar6 = this.zzd.zza;
                                        this.zzh = zzygVar;
                                        this.zza = zzhkVar7;
                                        this.zzc = 7;
                                        objZzo = zzfpVar6.zzo(zzygVar, this);
                                        if (objZzo != y5bVar) {
                                            this.zzh = zzygVar;
                                            this.zza = null;
                                            this.zzc = 8;
                                            if (zzhj.zzb(zzhkVar7, (zzhf) objZzo, this) != y5bVar) {
                                                zzygVar2 = zzygVar;
                                                return zzygVar2.zzj();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return y5bVar;
                case 2:
                    zzhkVar3 = (zzhk) this.zzh;
                    uj50.b(obj);
                    double dLongValue3 = ((Number) obj).longValue();
                    zzfp zzfpVar7 = this.zzd.zza;
                    String str3 = this.zzf;
                    double d4 = 0.45d * dLongValue3;
                    this.zzh = zzhkVar3;
                    this.zza = zzhkVar3;
                    d = dLongValue3 * 0.55d;
                    this.zzb = d;
                    this.zzc = 3;
                    obj = zzfpVar7.zzl(str3, (long) d4, this);
                    if (obj != y5bVar) {
                        zzhkVar4 = zzhkVar3;
                        this.zzh = zzhkVar4;
                        this.zza = null;
                        this.zzb = d;
                        this.zzc = 4;
                        obj = ((zzhf) obj).zza(zzhkVar3, this);
                        if (obj != y5bVar) {
                            zzhkVar5 = zzhkVar4;
                            zzxx zzxxVar3 = (zzxx) obj;
                            zzgb zzgbVar4 = this.zzd;
                            zzfp zzfpVar8 = zzgbVar4.zza;
                            RecaptchaAction recaptchaAction3 = this.zzg;
                            zzxnVar = zzgbVar4.zze;
                            if (zzxnVar == null) {
                                zzxnVar = null;
                            }
                            zzye zzyeVarZzk3 = zzfpVar8.zzk(recaptchaAction3, zzxxVar3, zzxnVar);
                            this.zzh = zzhkVar5;
                            this.zza = zzhkVar5;
                            this.zzc = 5;
                            obj = zzgbVar4.zza.zzm(zzyeVarZzk3, (long) d, this);
                            if (obj != y5bVar) {
                                zzhkVar6 = zzhkVar5;
                                this.zzh = zzhkVar6;
                                this.zza = null;
                                this.zzc = 6;
                                obj = ((zzhf) obj).zza(zzhkVar5, this);
                                if (obj != y5bVar) {
                                    zzhkVar7 = zzhkVar6;
                                    zzygVar = (zzyg) obj;
                                    zzfp zzfpVar9 = this.zzd.zza;
                                    this.zzh = zzygVar;
                                    this.zza = zzhkVar7;
                                    this.zzc = 7;
                                    objZzo = zzfpVar9.zzo(zzygVar, this);
                                    if (objZzo != y5bVar) {
                                        this.zzh = zzygVar;
                                        this.zza = null;
                                        this.zzc = 8;
                                        if (zzhj.zzb(zzhkVar7, (zzhf) objZzo, this) != y5bVar) {
                                            zzygVar2 = zzygVar;
                                            return zzygVar2.zzj();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return y5bVar;
                case 3:
                    d = this.zzb;
                    zzhkVar3 = (zzhk) this.zza;
                    zzhkVar4 = (zzhk) this.zzh;
                    uj50.b(obj);
                    this.zzh = zzhkVar4;
                    this.zza = null;
                    this.zzb = d;
                    this.zzc = 4;
                    obj = ((zzhf) obj).zza(zzhkVar3, this);
                    if (obj != y5bVar) {
                        zzhkVar5 = zzhkVar4;
                        zzxx zzxxVar4 = (zzxx) obj;
                        zzgb zzgbVar5 = this.zzd;
                        zzfp zzfpVar10 = zzgbVar5.zza;
                        RecaptchaAction recaptchaAction4 = this.zzg;
                        zzxnVar = zzgbVar5.zze;
                        if (zzxnVar == null) {
                            zzxnVar = null;
                        }
                        zzye zzyeVarZzk4 = zzfpVar10.zzk(recaptchaAction4, zzxxVar4, zzxnVar);
                        this.zzh = zzhkVar5;
                        this.zza = zzhkVar5;
                        this.zzc = 5;
                        obj = zzgbVar5.zza.zzm(zzyeVarZzk4, (long) d, this);
                        if (obj != y5bVar) {
                            zzhkVar6 = zzhkVar5;
                            this.zzh = zzhkVar6;
                            this.zza = null;
                            this.zzc = 6;
                            obj = ((zzhf) obj).zza(zzhkVar5, this);
                            if (obj != y5bVar) {
                                zzhkVar7 = zzhkVar6;
                                zzygVar = (zzyg) obj;
                                zzfp zzfpVar11 = this.zzd.zza;
                                this.zzh = zzygVar;
                                this.zza = zzhkVar7;
                                this.zzc = 7;
                                objZzo = zzfpVar11.zzo(zzygVar, this);
                                if (objZzo != y5bVar) {
                                    this.zzh = zzygVar;
                                    this.zza = null;
                                    this.zzc = 8;
                                    if (zzhj.zzb(zzhkVar7, (zzhf) objZzo, this) != y5bVar) {
                                        zzygVar2 = zzygVar;
                                        return zzygVar2.zzj();
                                    }
                                }
                            }
                        }
                    }
                    return y5bVar;
                case 4:
                    d = this.zzb;
                    zzhkVar5 = (zzhk) this.zzh;
                    uj50.b(obj);
                    zzxx zzxxVar5 = (zzxx) obj;
                    zzgb zzgbVar6 = this.zzd;
                    zzfp zzfpVar12 = zzgbVar6.zza;
                    RecaptchaAction recaptchaAction5 = this.zzg;
                    zzxnVar = zzgbVar6.zze;
                    if (zzxnVar == null) {
                        zzxnVar = null;
                    }
                    zzye zzyeVarZzk5 = zzfpVar12.zzk(recaptchaAction5, zzxxVar5, zzxnVar);
                    this.zzh = zzhkVar5;
                    this.zza = zzhkVar5;
                    this.zzc = 5;
                    obj = zzgbVar6.zza.zzm(zzyeVarZzk5, (long) d, this);
                    if (obj != y5bVar) {
                        zzhkVar6 = zzhkVar5;
                        this.zzh = zzhkVar6;
                        this.zza = null;
                        this.zzc = 6;
                        obj = ((zzhf) obj).zza(zzhkVar5, this);
                        if (obj != y5bVar) {
                            zzhkVar7 = zzhkVar6;
                            zzygVar = (zzyg) obj;
                            zzfp zzfpVar13 = this.zzd.zza;
                            this.zzh = zzygVar;
                            this.zza = zzhkVar7;
                            this.zzc = 7;
                            objZzo = zzfpVar13.zzo(zzygVar, this);
                            if (objZzo != y5bVar) {
                                this.zzh = zzygVar;
                                this.zza = null;
                                this.zzc = 8;
                                if (zzhj.zzb(zzhkVar7, (zzhf) objZzo, this) != y5bVar) {
                                    zzygVar2 = zzygVar;
                                    return zzygVar2.zzj();
                                }
                            }
                        }
                    }
                    return y5bVar;
                case 5:
                    zzhkVar5 = (zzhk) this.zza;
                    zzhkVar6 = (zzhk) this.zzh;
                    uj50.b(obj);
                    this.zzh = zzhkVar6;
                    this.zza = null;
                    this.zzc = 6;
                    obj = ((zzhf) obj).zza(zzhkVar5, this);
                    if (obj != y5bVar) {
                        zzhkVar7 = zzhkVar6;
                        zzygVar = (zzyg) obj;
                        zzfp zzfpVar14 = this.zzd.zza;
                        this.zzh = zzygVar;
                        this.zza = zzhkVar7;
                        this.zzc = 7;
                        objZzo = zzfpVar14.zzo(zzygVar, this);
                        if (objZzo != y5bVar) {
                            this.zzh = zzygVar;
                            this.zza = null;
                            this.zzc = 8;
                            if (zzhj.zzb(zzhkVar7, (zzhf) objZzo, this) != y5bVar) {
                                zzygVar2 = zzygVar;
                                return zzygVar2.zzj();
                            }
                        }
                    }
                    return y5bVar;
                case 6:
                    zzhkVar7 = (zzhk) this.zzh;
                    uj50.b(obj);
                    zzygVar = (zzyg) obj;
                    zzfp zzfpVar15 = this.zzd.zza;
                    this.zzh = zzygVar;
                    this.zza = zzhkVar7;
                    this.zzc = 7;
                    objZzo = zzfpVar15.zzo(zzygVar, this);
                    if (objZzo != y5bVar) {
                        this.zzh = zzygVar;
                        this.zza = null;
                        this.zzc = 8;
                        if (zzhj.zzb(zzhkVar7, (zzhf) objZzo, this) != y5bVar) {
                            zzygVar2 = zzygVar;
                            return zzygVar2.zzj();
                        }
                    }
                    return y5bVar;
                case 7:
                    zzhkVar7 = (zzhk) this.zza;
                    zzyg zzygVar3 = (zzyg) this.zzh;
                    uj50.b(obj);
                    objZzo = obj;
                    zzygVar = zzygVar3;
                    this.zzh = zzygVar;
                    this.zza = null;
                    this.zzc = 8;
                    if (zzhj.zzb(zzhkVar7, (zzhf) objZzo, this) != y5bVar) {
                        zzygVar2 = zzygVar;
                        return zzygVar2.zzj();
                    }
                    return y5bVar;
                default:
                    zzygVar2 = (zzyg) this.zzh;
                    uj50.b(obj);
                    return zzygVar2.zzj();
            }
        } catch (zzcg e) {
            throw e;
        } catch (Exception e2) {
            throw new zzcg(zzce.zzb, zzcd.zzaB, e2.getMessage(), null, 8, null);
        }
    }
}
