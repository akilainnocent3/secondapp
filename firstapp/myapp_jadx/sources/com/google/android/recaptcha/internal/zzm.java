package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import defpackage.zi50;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzm extends tje0 implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ zzg zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzxn zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzm(zzgr zzgrVar, zzg zzgVar, long j, zzxn zzxnVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zzc = zzgrVar;
        this.zzd = zzgVar;
        this.zze = j;
        this.zzf = zzxnVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        return new zzm(this.zzc, this.zzd, this.zze, this.zzf, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzm) create((v5b) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        zzgr zzgrVar;
        y5b y5bVar = y5b.a;
        int i = this.zzb;
        try {
            if (i != 0) {
                if (i != 1) {
                    uj50.b(obj);
                } else {
                    zzgrVar = (zzgr) this.zza;
                    uj50.b(obj);
                }
                zi50.a aVar = zi50.b;
                bVar = Unit.a;
                return new zi50(bVar);
            }
            uj50.b(obj);
            zzgrVar = this.zzc;
            zzg zzgVar = this.zzd;
            long j = this.zze;
            zzxn zzxnVar = this.zzf;
            this.zza = zzgrVar;
            this.zzb = 1;
            zzhf zzhfVar = new zzhf(zzgVar.zzk(), new zzd(zzgVar, j, zzxnVar, null), null);
            if (zzhfVar != y5bVar) {
                obj = zzhfVar;
            }
            return y5bVar;
            this.zza = null;
            this.zzb = 2;
            if (((zzhf) obj).zza(zzgrVar.zza(), this) == y5bVar) {
                return y5bVar;
            }
            zi50.a aVar2 = zi50.b;
            bVar = Unit.a;
        } catch (zzcg e) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(e);
        }
        return new zi50(bVar);
    }
}
