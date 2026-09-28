package com.google.android.recaptcha.internal;

import defpackage.cm8;
import defpackage.dm8;
import defpackage.ej5;
import defpackage.em8;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.y5b;
import defpackage.zi50;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzlk extends tje0 implements Function2 {
    int zza;
    final /* synthetic */ zzly zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlk(zzly zzlyVar, String str, v1b v1bVar) {
        super(2, v1bVar);
        this.zzb = zzlyVar;
        this.zzc = str;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        zzlk zzlkVar = new zzlk(this.zzb, this.zzc, v1bVar);
        zzlkVar.zzd = obj;
        return zzlkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlk) create((zzhk) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ad A[PHI: r2 r6
      0x00ad: PHI (r2v8 com.google.android.recaptcha.internal.zzhk) = (r2v7 com.google.android.recaptcha.internal.zzhk), (r2v24 com.google.android.recaptcha.internal.zzhk) binds: [B:29:0x00ab, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x00ad: PHI (r6v8 java.lang.Object) = (r6v7 java.lang.Object), (r6v15 java.lang.Object) binds: [B:29:0x00ab, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b9 A[Catch: Exception -> 0x001f, TRY_ENTER, TryCatch #0 {Exception -> 0x001f, blocks: (B:9:0x0018, B:37:0x010d, B:12:0x0022, B:34:0x00c9, B:32:0x00b9), top: B:46:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c9 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:9:0x0018, B:37:0x010d, B:12:0x0022, B:34:0x00c9, B:32:0x00b9), top: B:46:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:36:0x010c  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objA;
        zzhk zzhkVar;
        Object objZza;
        Object objZza2;
        Object objZzu;
        cm8 cm8VarZzz;
        Object objQ;
        y5b y5bVar = y5b.a;
        int i = this.zza;
        try {
            if (i == 0) {
                uj50.b(obj);
                zzhkVar = (zzhk) this.zzd;
                zzdj zzdjVarZzn = this.zzb.zzn();
                zzmc zzmcVar = zzmc.zzd;
                this.zzd = zzhkVar;
                this.zza = 1;
                objZza = zzdjVarZzn.zza(zzmcVar, this);
                if (objZza != y5bVar) {
                }
                return y5bVar;
            }
            if (i == 1) {
                zzhkVar = (zzhk) this.zzd;
                uj50.b(obj);
                objZza = obj;
            } else {
                if (i == 2) {
                    zzhkVar = (zzhk) this.zzd;
                    uj50.b(obj);
                    objZza2 = obj;
                    if (((Boolean) objZza2).booleanValue()) {
                        cm8VarZzz = this.zzb.zzz();
                        this.zzd = null;
                        this.zza = 5;
                        if (cm8VarZzz.await(this) != y5bVar) {
                            dm8 dm8VarA = em8.a();
                            zzly zzlyVar = this.zzb;
                            Map map = zzlyVar.zzd;
                            String str = this.zzc;
                            map.put(str, dm8VarA);
                            zzze zzzeVarZzf = zzzf.zzf();
                            zzzeVarZzf.zze(str);
                            byte[] bArrZzd = ((zzzf) zzzeVarZzf.zzk()).zzd();
                            ej5.c(zzlyVar.zzD().zzb(), null, null, new zzlj(zzlyVar, zzpp.zzh().zzi(bArrZzd, 0, bArrZzd.length), null), 3);
                            this.zza = 6;
                            objQ = dm8VarA.q(this);
                            if (objQ == y5bVar) {
                            }
                        }
                    } else {
                        zzly zzlyVar2 = this.zzb;
                        this.zzd = zzhkVar;
                        this.zza = 3;
                        objZzu = zzly.zzu(zzlyVar2, this);
                        if (objZzu != y5bVar) {
                            this.zzd = null;
                            this.zza = 4;
                            if (((zzhg) objZzu).zza(zzhkVar, this) != y5bVar) {
                                cm8VarZzz = this.zzb.zzz();
                                this.zzd = null;
                                this.zza = 5;
                                if (cm8VarZzz.await(this) != y5bVar) {
                                    dm8 dm8VarA2 = em8.a();
                                    zzly zzlyVar3 = this.zzb;
                                    Map map2 = zzlyVar3.zzd;
                                    String str2 = this.zzc;
                                    map2.put(str2, dm8VarA2);
                                    zzze zzzeVarZzf2 = zzzf.zzf();
                                    zzzeVarZzf2.zze(str2);
                                    byte[] bArrZzd2 = ((zzzf) zzzeVarZzf2.zzk()).zzd();
                                    ej5.c(zzlyVar3.zzD().zzb(), null, null, new zzlj(zzlyVar3, zzpp.zzh().zzi(bArrZzd2, 0, bArrZzd2.length), null), 3);
                                    this.zza = 6;
                                    objQ = dm8VarA2.q(this);
                                    if (objQ == y5bVar) {
                                    }
                                }
                            }
                        }
                    }
                    return y5bVar;
                }
                if (i == 3) {
                    zzhkVar = (zzhk) this.zzd;
                    uj50.b(obj);
                    objZzu = obj;
                    this.zzd = null;
                    this.zza = 4;
                    if (((zzhg) objZzu).zza(zzhkVar, this) != y5bVar) {
                        cm8VarZzz = this.zzb.zzz();
                        this.zzd = null;
                        this.zza = 5;
                        if (cm8VarZzz.await(this) != y5bVar) {
                            dm8 dm8VarA3 = em8.a();
                            zzly zzlyVar4 = this.zzb;
                            Map map3 = zzlyVar4.zzd;
                            String str3 = this.zzc;
                            map3.put(str3, dm8VarA3);
                            zzze zzzeVarZzf3 = zzzf.zzf();
                            zzzeVarZzf3.zze(str3);
                            byte[] bArrZzd3 = ((zzzf) zzzeVarZzf3.zzk()).zzd();
                            ej5.c(zzlyVar4.zzD().zzb(), null, null, new zzlj(zzlyVar4, zzpp.zzh().zzi(bArrZzd3, 0, bArrZzd3.length), null), 3);
                            this.zza = 6;
                            objQ = dm8VarA3.q(this);
                            if (objQ == y5bVar) {
                            }
                        }
                    }
                    return y5bVar;
                }
                if (i == 4) {
                    uj50.b(obj);
                    cm8VarZzz = this.zzb.zzz();
                    this.zzd = null;
                    this.zza = 5;
                    if (cm8VarZzz.await(this) != y5bVar) {
                        dm8 dm8VarA4 = em8.a();
                        zzly zzlyVar5 = this.zzb;
                        Map map4 = zzlyVar5.zzd;
                        String str4 = this.zzc;
                        map4.put(str4, dm8VarA4);
                        zzze zzzeVarZzf4 = zzzf.zzf();
                        zzzeVarZzf4.zze(str4);
                        byte[] bArrZzd4 = ((zzzf) zzzeVarZzf4.zzk()).zzd();
                        ej5.c(zzlyVar5.zzD().zzb(), null, null, new zzlj(zzlyVar5, zzpp.zzh().zzi(bArrZzd4, 0, bArrZzd4.length), null), 3);
                        this.zza = 6;
                        objQ = dm8VarA4.q(this);
                        if (objQ == y5bVar) {
                        }
                    }
                    return y5bVar;
                }
                if (i != 5) {
                    uj50.b(obj);
                    objQ = obj;
                } else {
                    uj50.b(obj);
                    dm8 dm8VarA5 = em8.a();
                    zzly zzlyVar6 = this.zzb;
                    Map map5 = zzlyVar6.zzd;
                    String str5 = this.zzc;
                    map5.put(str5, dm8VarA5);
                    zzze zzzeVarZzf5 = zzzf.zzf();
                    zzzeVarZzf5.zze(str5);
                    byte[] bArrZzd5 = ((zzzf) zzzeVarZzf5.zzk()).zzd();
                    ej5.c(zzlyVar6.zzD().zzb(), null, null, new zzlj(zzlyVar6, zzpp.zzh().zzi(bArrZzd5, 0, bArrZzd5.length), null), 3);
                    this.zza = 6;
                    objQ = dm8VarA5.q(this);
                    if (objQ == y5bVar) {
                        return y5bVar;
                    }
                }
            }
            zzxx zzxxVar = (zzxx) objQ;
            zzxw zzxwVarZzf = zzxx.zzf();
            zzxwVarZzf.zze(this.zzc);
            zzya zzyaVarZzf = zzyb.zzf();
            zzyaVarZzf.zze(zzxxVar.zzl());
            zzxwVarZzf.zzr(zzyaVarZzf);
            zzxy zzxyVarZzf = zzxz.zzf();
            zzxyVarZzf.zze(zzxxVar.zzj());
            zzxyVarZzf.zzf(zzxxVar.zzM());
            zzxwVarZzf.zzs(zzxyVarZzf);
            zi50.a aVar = zi50.b;
            objA = zzxwVarZzf.zzk();
            return new zi50(objA);
            if (((Boolean) objZza).booleanValue()) {
                zzcg zzcgVar = new zzcg(zzce.zzb, zzcd.zzay, null, null, 12, null);
                zi50.a aVar2 = zi50.b;
                return new zi50(new zi50.b(zzcgVar));
            }
            zzdj zzdjVarZzn2 = this.zzb.zzn();
            zzmc zzmcVar2 = zzmc.zzc;
            this.zzd = zzhkVar;
            this.zza = 2;
            objZza2 = zzdjVarZzn2.zza(zzmcVar2, this);
            if (objZza2 != y5bVar) {
                if (((Boolean) objZza2).booleanValue()) {
                    zzly zzlyVar7 = this.zzb;
                    this.zzd = zzhkVar;
                    this.zza = 3;
                    objZzu = zzly.zzu(zzlyVar7, this);
                    if (objZzu != y5bVar) {
                        this.zzd = null;
                        this.zza = 4;
                        if (((zzhg) objZzu).zza(zzhkVar, this) != y5bVar) {
                            cm8VarZzz = this.zzb.zzz();
                            this.zzd = null;
                            this.zza = 5;
                            if (cm8VarZzz.await(this) != y5bVar) {
                                dm8 dm8VarA6 = em8.a();
                                zzly zzlyVar8 = this.zzb;
                                Map map6 = zzlyVar8.zzd;
                                String str6 = this.zzc;
                                map6.put(str6, dm8VarA6);
                                zzze zzzeVarZzf6 = zzzf.zzf();
                                zzzeVarZzf6.zze(str6);
                                byte[] bArrZzd6 = ((zzzf) zzzeVarZzf6.zzk()).zzd();
                                ej5.c(zzlyVar8.zzD().zzb(), null, null, new zzlj(zzlyVar8, zzpp.zzh().zzi(bArrZzd6, 0, bArrZzd6.length), null), 3);
                                this.zza = 6;
                                objQ = dm8VarA6.q(this);
                                if (objQ == y5bVar) {
                                }
                                zzxx zzxxVar2 = (zzxx) objQ;
                                zzxw zzxwVarZzf2 = zzxx.zzf();
                                zzxwVarZzf2.zze(this.zzc);
                                zzya zzyaVarZzf2 = zzyb.zzf();
                                zzyaVarZzf2.zze(zzxxVar2.zzl());
                                zzxwVarZzf2.zzr(zzyaVarZzf2);
                                zzxy zzxyVarZzf2 = zzxz.zzf();
                                zzxyVarZzf2.zze(zzxxVar2.zzj());
                                zzxyVarZzf2.zzf(zzxxVar2.zzM());
                                zzxwVarZzf2.zzs(zzxyVarZzf2);
                                zi50.a aVar3 = zi50.b;
                                objA = zzxwVarZzf2.zzk();
                                return new zi50(objA);
                            }
                        }
                    }
                } else {
                    cm8VarZzz = this.zzb.zzz();
                    this.zzd = null;
                    this.zza = 5;
                    if (cm8VarZzz.await(this) != y5bVar) {
                        dm8 dm8VarA7 = em8.a();
                        zzly zzlyVar9 = this.zzb;
                        Map map7 = zzlyVar9.zzd;
                        String str7 = this.zzc;
                        map7.put(str7, dm8VarA7);
                        zzze zzzeVarZzf7 = zzzf.zzf();
                        zzzeVarZzf7.zze(str7);
                        byte[] bArrZzd7 = ((zzzf) zzzeVarZzf7.zzk()).zzd();
                        ej5.c(zzlyVar9.zzD().zzb(), null, null, new zzlj(zzlyVar9, zzpp.zzh().zzi(bArrZzd7, 0, bArrZzd7.length), null), 3);
                        this.zza = 6;
                        objQ = dm8VarA7.q(this);
                        if (objQ == y5bVar) {
                        }
                        zzxx zzxxVar3 = (zzxx) objQ;
                        zzxw zzxwVarZzf3 = zzxx.zzf();
                        zzxwVarZzf3.zze(this.zzc);
                        zzya zzyaVarZzf3 = zzyb.zzf();
                        zzyaVarZzf3.zze(zzxxVar3.zzl());
                        zzxwVarZzf3.zzr(zzyaVarZzf3);
                        zzxy zzxyVarZzf3 = zzxz.zzf();
                        zzxyVarZzf3.zze(zzxxVar3.zzj());
                        zzxyVarZzf3.zzf(zzxxVar3.zzM());
                        zzxwVarZzf3.zzs(zzxyVarZzf3);
                        zi50.a aVar4 = zi50.b;
                        objA = zzxwVarZzf3.zzk();
                        return new zi50(objA);
                    }
                }
            }
            return y5bVar;
        } catch (Exception e) {
            zzcg zzcgVarZza = zzh.zza(e, new zzcg(zzce.zzb, zzcd.zzW, e.getMessage(), null, 8, null));
            zzly zzlyVar10 = this.zzb;
            cm8 cm8Var = (cm8) zzlyVar10.zzd.remove(this.zzc);
            if (cm8Var != null) {
                cm8Var.F(zzcgVarZza);
            }
            zi50.a aVar5 = zi50.b;
            objA = uj50.a(zzcgVarZza);
        }
    }
}
