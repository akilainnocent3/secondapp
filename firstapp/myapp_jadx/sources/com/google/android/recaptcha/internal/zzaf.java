package com.google.android.recaptcha.internal;

import defpackage.c9p;
import defpackage.ej5;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.up1;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import defpackage.zi50;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzaf extends tje0 implements Function2 {
    int zza;
    final /* synthetic */ zzaj zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzhk zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaf(zzaj zzajVar, String str, zzhk zzhkVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zzb = zzajVar;
        this.zzc = str;
        this.zzd = zzhkVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        zzaf zzafVar = new zzaf(this.zzb, this.zzc, this.zzd, v1bVar);
        zzafVar.zze = obj;
        return zzafVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaf) create((v5b) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.zza;
        uj50.b(obj);
        if (i == 0) {
            v5b v5bVar = (v5b) this.zze;
            ArrayList arrayList = new ArrayList();
            zzaj zzajVar = this.zzb;
            String str = this.zzc;
            zzajVar.zzn().put(str, arrayList);
            ArrayList arrayList2 = new ArrayList();
            List list = zzajVar.zza;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((zzar) obj2).zzi()) {
                    arrayList3.add(obj2);
                }
            }
            int size = arrayList3.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(ej5.c(v5bVar, null, null, new zzae(this.zzd, (zzar) arrayList3.get(i2), str, arrayList, null), 3));
            }
            c9p[] c9pVarArr = (c9p[]) arrayList2.toArray(new c9p[0]);
            c9p[] c9pVarArr2 = (c9p[]) Arrays.copyOf(c9pVarArr, c9pVarArr.length);
            this.zza = 1;
            if (up1.d(c9pVarArr2, this) == y5bVar) {
                return y5bVar;
            }
        }
        zi50.a aVar = zi50.b;
        return new zi50(this.zzb.zzp(this.zzc));
    }
}
