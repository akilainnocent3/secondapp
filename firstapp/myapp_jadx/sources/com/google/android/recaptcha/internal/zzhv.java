package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.c;

/* JADX INFO: loaded from: classes4.dex */
final class zzhv extends tje0 implements Function2 {
    int zza;
    final /* synthetic */ zzib zzb;
    final /* synthetic */ zzxn zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhv(zzib zzibVar, zzxn zzxnVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zzb = zzibVar;
        this.zzc = zzxnVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        zzhv zzhvVar = new zzhv(this.zzb, this.zzc, v1bVar);
        zzhvVar.zzd = obj;
        return zzhvVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhv) create((zzhk) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Exception {
        zzhk zzhkVar;
        y5b y5bVar = y5b.a;
        int i = this.zza;
        try {
            if (i != 0) {
                if (i != 1) {
                    uj50.b(obj);
                } else {
                    zzhkVar = (zzhk) this.zzd;
                    uj50.b(obj);
                }
                return c.p(this.zzc.zzl(), "JAVASCRIPT_TAG", (String) obj, false);
            }
            uj50.b(obj);
            zzhkVar = (zzhk) this.zzd;
            zzib zzibVar = this.zzb;
            zzxn zzxnVar = this.zzc;
            String strZzM = zzxnVar.zzM();
            String strZzN = zzxnVar.zzN();
            this.zzd = zzhkVar;
            this.zza = 1;
            obj = new zzhg(new zzhw(zzibVar, strZzN, strZzM, null));
            if (obj != y5bVar) {
            }
            return y5bVar;
            this.zzd = null;
            this.zza = 2;
            obj = ((zzhg) obj).zza(zzhkVar, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            return c.p(this.zzc.zzl(), "JAVASCRIPT_TAG", (String) obj, false);
        } catch (Exception e) {
            if (e instanceof zzcg) {
                throw e;
            }
            throw new zzcg(zzce.zzb, zzcd.zzL, e.getMessage(), null, 8, null);
        }
    }
}
