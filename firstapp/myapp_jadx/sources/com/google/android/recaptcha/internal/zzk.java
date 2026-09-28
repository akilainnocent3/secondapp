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
final class zzk extends tje0 implements Function2 {
    int zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzgr zzd;
    final /* synthetic */ long zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(zzq zzqVar, String str, zzgr zzgrVar, long j, v1b v1bVar) {
        super(2, v1bVar);
        this.zzb = zzqVar;
        this.zzc = str;
        this.zzd = zzgrVar;
        this.zze = j;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, v1bVar);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((v5b) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.zza;
        uj50.b(obj);
        if (i == 0) {
            v5b v5bVar = (v5b) this.zzf;
            ArrayList arrayList = new ArrayList();
            for (zzg zzgVar : this.zzb.zzd()) {
                if (zzgVar.zzi()) {
                    arrayList.add(ej5.a(v5bVar, null, new zzj(this.zzd, zzgVar, this.zzc, this.zze, null), 3));
                }
            }
            ojd[] ojdVarArr = (ojd[]) arrayList.toArray(new ojd[0]);
            ojd[] ojdVarArr2 = (ojd[]) Arrays.copyOf(ojdVarArr, ojdVarArr.length);
            this.zza = 1;
            obj = up1.b(ojdVarArr2, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        }
        String str = this.zzc;
        zzxw zzxwVarZzf = zzxx.zzf();
        zzxwVarZzf.zze(str);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            Object obj2 = ((zi50) it.next()).a;
            if (!(obj2 instanceof zi50.b)) {
                zzxwVarZzf.zzh((zzxx) obj2);
            }
        }
        return (zzxx) zzxwVarZzf.zzk();
    }
}
