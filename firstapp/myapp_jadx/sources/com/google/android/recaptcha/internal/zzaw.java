package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzaw extends tje0 implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzhk zzc;
    final /* synthetic */ zzba zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaw(zzhk zzhkVar, zzba zzbaVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zzc = zzhkVar;
        this.zzd = zzbaVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        return new zzaw(this.zzc, this.zzd, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaw) create((v5b) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws zzcg {
        zzhk zzhkVar;
        y5b y5bVar = y5b.a;
        int i = this.zzb;
        try {
            if (i != 0) {
                if (i != 1) {
                    uj50.b(obj);
                } else {
                    zzhkVar = (zzhk) this.zza;
                    uj50.b(obj);
                }
                zzba zzbaVar = this.zzd;
                zzyu zzyuVarZzf = zzyx.zzf();
                zzyv zzyvVarZzf = zzyw.zzf();
                zzyvVarZzf.zzw((String) obj);
                zzyuVarZzf.zzf((zzyw) zzyvVarZzf.zzk());
                return zzas.zzb(zzbaVar, (zzyx) zzyuVarZzf.zzk());
            }
            uj50.b(obj);
            zzhkVar = this.zzc;
            zzba zzbaVar2 = this.zzd;
            zzbo zzboVar = zzbaVar2.zza;
            String str = zzbaVar2.zzd;
            this.zza = zzhkVar;
            this.zzb = 1;
            obj = new zzhg(new zzbb(zzboVar, str, null));
            if (obj != y5bVar) {
            }
            return y5bVar;
            this.zza = null;
            this.zzb = 2;
            obj = ((zzhg) obj).zza(zzhkVar, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            zzba zzbaVar3 = this.zzd;
            zzyu zzyuVarZzf2 = zzyx.zzf();
            zzyv zzyvVarZzf2 = zzyw.zzf();
            zzyvVarZzf2.zzw((String) obj);
            zzyuVarZzf2.zzf((zzyw) zzyvVarZzf2.zzk());
            return zzas.zzb(zzbaVar3, (zzyx) zzyuVarZzf2.zzk());
        } catch (Exception e) {
            throw new zzcg(zzce.zzb, zzcd.zzaa, e.getMessage(), e);
        }
    }
}
