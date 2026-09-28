package com.google.android.recaptcha.internal;

import defpackage.cm8;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzfx extends tje0 implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzgb zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ cm8 zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfx(zzgb zzgbVar, long j, cm8 cm8Var, v1b v1bVar) {
        super(2, v1bVar);
        this.zzc = zzgbVar;
        this.zzd = j;
        this.zze = cm8Var;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        zzfx zzfxVar = new zzfx(this.zzc, this.zzd, this.zze, v1bVar);
        zzfxVar.zzf = obj;
        return zzfxVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfx) create((zzgr) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007c A[Catch: zzcg -> 0x0015, PHI: r1 r9
      0x007c: PHI (r1v7 com.google.android.recaptcha.internal.zzgr) = (r1v6 com.google.android.recaptcha.internal.zzgr), (r1v14 com.google.android.recaptcha.internal.zzgr) binds: [B:29:0x007a, B:12:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x007c: PHI (r9v12 java.lang.Object) = (r9v11 java.lang.Object), (r9v0 java.lang.Object) binds: [B:29:0x007a, B:12:0x001c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {zzcg -> 0x0015, blocks: (B:7:0x0010, B:33:0x008e, B:12:0x001c, B:30:0x007c, B:15:0x0024, B:28:0x0065, B:18:0x0030, B:25:0x0052, B:21:0x003c), top: B:39:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws zzcg {
        zzgr zzgrVar;
        zzgr zzgrVar2;
        zzgr zzgrVar3;
        y5b y5bVar = y5b.a;
        int i = this.zzb;
        try {
            if (i == 0) {
                uj50.b(obj);
                zzgrVar = (zzgr) this.zzf;
                zzfp zzfpVar = this.zzc.zza;
                long j = this.zzd;
                this.zzf = zzgrVar;
                this.zza = zzgrVar;
                this.zzb = 1;
                obj = zzfpVar.zzp(j, this);
                if (obj != y5bVar) {
                    zzgrVar2 = zzgrVar;
                }
                return y5bVar;
            }
            if (i == 1) {
                zzgrVar = (zzgr) this.zza;
                zzgrVar2 = (zzgr) this.zzf;
                uj50.b(obj);
            } else {
                if (i == 2) {
                    zzgrVar3 = (zzgr) this.zzf;
                    uj50.b(obj);
                    zzxn zzxnVar = (zzxn) obj;
                    zzgb zzgbVar = this.zzc;
                    zzgbVar.zze = zzxnVar;
                    zzfp zzfpVar2 = zzgbVar.zza;
                    long j2 = this.zzd;
                    this.zzf = zzgrVar3;
                    this.zzb = 3;
                    obj = zzfpVar2.zzn(zzxnVar, j2, this);
                    if (obj != y5bVar) {
                        this.zzf = null;
                        this.zzb = 4;
                        if (((zzhg) obj).zza(zzgrVar3.zza(), this) == y5bVar) {
                        }
                    }
                    return y5bVar;
                }
                if (i != 3) {
                    uj50.b(obj);
                } else {
                    zzgrVar3 = (zzgr) this.zzf;
                    uj50.b(obj);
                    this.zzf = null;
                    this.zzb = 4;
                    if (((zzhg) obj).zza(zzgrVar3.zza(), this) == y5bVar) {
                        return y5bVar;
                    }
                }
            }
            this.zzc.zzf = zzdv.zzb;
            return Boolean.valueOf(this.zze.G(Unit.a));
            this.zzf = zzgrVar2;
            this.zza = null;
            this.zzb = 2;
            obj = ((zzhf) obj).zza(zzgrVar.zza(), this);
            if (obj != y5bVar) {
                zzgrVar3 = zzgrVar2;
                zzxn zzxnVar2 = (zzxn) obj;
                zzgb zzgbVar2 = this.zzc;
                zzgbVar2.zze = zzxnVar2;
                zzfp zzfpVar3 = zzgbVar2.zza;
                long j3 = this.zzd;
                this.zzf = zzgrVar3;
                this.zzb = 3;
                obj = zzfpVar3.zzn(zzxnVar2, j3, this);
                if (obj != y5bVar) {
                    this.zzf = null;
                    this.zzb = 4;
                    if (((zzhg) obj).zza(zzgrVar3.zza(), this) == y5bVar) {
                    }
                    this.zzc.zzf = zzdv.zzb;
                    return Boolean.valueOf(this.zze.G(Unit.a));
                }
            }
            return y5bVar;
        } catch (zzcg e) {
            this.zzc.zzd = e;
            throw e;
        }
    }
}
