package com.google.android.recaptcha.internal;

import defpackage.ej5;
import defpackage.ojd;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.up1;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import defpackage.zi50;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzn extends tje0 implements Function2 {
    int zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzxn zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzn(zzq zzqVar, zzgr zzgrVar, long j, zzxn zzxnVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zzb = zzqVar;
        this.zzc = zzgrVar;
        this.zzd = j;
        this.zze = zzxnVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        zzn zznVar = new zzn(this.zzb, this.zzc, this.zzd, this.zze, v1bVar);
        zznVar.zzf = obj;
        return zznVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzn) create((v5b) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws zzcg {
        y5b y5bVar = y5b.a;
        int i = this.zza;
        uj50.b(obj);
        if (i == 0) {
            v5b v5bVar = (v5b) this.zzf;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(ej5.a(v5bVar, null, new zzm(this.zzc, (zzg) it.next(), this.zzd, this.zze, null), 3));
            }
            ojd[] ojdVarArr = (ojd[]) arrayList.toArray(new ojd[0]);
            ojd[] ojdVarArr2 = (ojd[]) Arrays.copyOf(ojdVarArr, ojdVarArr.length);
            this.zza = 1;
            obj = up1.b(ojdVarArr2, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        }
        List list = (List) obj;
        if (list == null || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!(((zi50) it2.next()).a instanceof zi50.b)) {
                    return Unit.a;
                }
            }
        }
        throw new zzcg(zzce.zzb, zzcd.zzY, null, null, 12, null);
    }
}
