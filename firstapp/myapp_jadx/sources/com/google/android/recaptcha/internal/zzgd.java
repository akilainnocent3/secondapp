package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
final class zzgd extends tje0 implements Function2 {
    Object zza;
    double zzb;
    int zzc;
    final /* synthetic */ zzge zzd;
    final /* synthetic */ long zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgd(zzge zzgeVar, long j, v1b v1bVar) {
        super(2, v1bVar);
        this.zzd = zzgeVar;
        this.zze = j;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        zzgd zzgdVar = new zzgd(this.zzd, this.zze, v1bVar);
        zzgdVar.zzf = obj;
        return zzgdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgd) create((zzhk) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b5 A[Catch: zzcg -> 0x0015, PHI: r1 r13
      0x00b5: PHI (r1v6 com.google.android.recaptcha.internal.zzhk) = (r1v5 com.google.android.recaptcha.internal.zzhk), (r1v12 com.google.android.recaptcha.internal.zzhk) binds: [B:33:0x00b3, B:12:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x00b5: PHI (r13v12 java.lang.Object) = (r13v11 java.lang.Object), (r13v0 java.lang.Object) binds: [B:33:0x00b3, B:12:0x001c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {zzcg -> 0x0015, blocks: (B:7:0x0010, B:37:0x00c3, B:12:0x001c, B:34:0x00b5, B:15:0x0027, B:32:0x009f, B:18:0x0036, B:29:0x008d, B:26:0x0069), top: B:45:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws zzcg {
        zzhk zzhkVar;
        double d;
        zzhk zzhkVar2;
        double d2;
        zzhk zzhkVar3;
        y5b y5bVar = y5b.a;
        int i = this.zzc;
        try {
            if (i == 0) {
                uj50.b(obj);
                zzhkVar = (zzhk) this.zzf;
                zzge zzgeVar = this.zzd;
                if (Intrinsics.g(zzgeVar.zzb, zzdv.zzb) || Intrinsics.g(zzgeVar.zzb, zzdv.zzd)) {
                    return Unit.a;
                }
                zzgeVar.zzb = zzdv.zzc;
                double d3 = this.zze;
                zzfp zzfpVar = zzgeVar.zza;
                double d4 = 0.6d * d3;
                this.zzf = zzhkVar;
                this.zza = zzhkVar;
                double d5 = d3 * 0.4d;
                this.zzb = d5;
                this.zzc = 1;
                obj = zzfpVar.zzp((long) d4, this);
                if (obj != y5bVar) {
                    d = d5;
                    zzhkVar2 = zzhkVar;
                }
                return y5bVar;
            }
            if (i == 1) {
                d = this.zzb;
                zzhkVar = (zzhk) this.zza;
                zzhkVar2 = (zzhk) this.zzf;
                uj50.b(obj);
            } else {
                if (i == 2) {
                    d2 = this.zzb;
                    zzhkVar3 = (zzhk) this.zzf;
                    uj50.b(obj);
                    zzxn zzxnVar = (zzxn) obj;
                    zzge zzgeVar2 = this.zzd;
                    zzgeVar2.zzc = zzxnVar;
                    this.zzf = zzhkVar3;
                    this.zzc = 3;
                    obj = zzgeVar2.zza.zzn(zzxnVar, (long) d2, this);
                    if (obj != y5bVar) {
                        this.zzf = null;
                        this.zzc = 4;
                        if (((zzhg) obj).zza(zzhkVar3, this) == y5bVar) {
                        }
                    }
                    return y5bVar;
                }
                if (i != 3) {
                    uj50.b(obj);
                } else {
                    zzhkVar3 = (zzhk) this.zzf;
                    uj50.b(obj);
                    this.zzf = null;
                    this.zzc = 4;
                    if (((zzhg) obj).zza(zzhkVar3, this) == y5bVar) {
                        return y5bVar;
                    }
                }
            }
            this.zzd.zzb = zzdv.zzb;
            return Unit.a;
            this.zzf = zzhkVar2;
            this.zza = null;
            this.zzb = d;
            this.zzc = 2;
            obj = ((zzhf) obj).zza(zzhkVar, this);
            if (obj != y5bVar) {
                d2 = d;
                zzhkVar3 = zzhkVar2;
                zzxn zzxnVar2 = (zzxn) obj;
                zzge zzgeVar3 = this.zzd;
                zzgeVar3.zzc = zzxnVar2;
                this.zzf = zzhkVar3;
                this.zzc = 3;
                obj = zzgeVar3.zza.zzn(zzxnVar2, (long) d2, this);
                if (obj != y5bVar) {
                    this.zzf = null;
                    this.zzc = 4;
                    if (((zzhg) obj).zza(zzhkVar3, this) == y5bVar) {
                    }
                    this.zzd.zzb = zzdv.zzb;
                    return Unit.a;
                }
            }
            return y5bVar;
        } catch (zzcg e) {
            this.zzd.zzb = zzdv.zzd;
            throw e;
        }
    }
}
