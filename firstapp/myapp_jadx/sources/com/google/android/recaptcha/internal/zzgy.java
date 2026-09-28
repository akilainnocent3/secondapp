package com.google.android.recaptcha.internal;

import android.content.ContentValues;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzgy extends tje0 implements Function2 {
    final /* synthetic */ zzgz zza;
    final /* synthetic */ zzzm zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgy(zzgz zzgzVar, zzzm zzzmVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zza = zzgzVar;
        this.zzb = zzzmVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        return new zzgy(this.zza, this.zzb, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgy) create((v5b) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        zzzm zzzmVar = this.zzb;
        zzgz zzgzVar = this.zza;
        synchronized (zzgs.class) {
            try {
                if (zzgzVar.zzc != null) {
                    byte[] bArrZzd = zzzmVar.zzd();
                    zzgp zzgpVar = new zzgp(zzpp.zzg().zzi(bArrZzd, 0, bArrZzd.length), System.currentTimeMillis(), 0);
                    zzgo zzgoVar = zzgzVar.zzc;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("ss", zzgpVar.zzc());
                    contentValues.put("ts", Long.valueOf(zzgpVar.zzb()));
                    zzgoVar.getWritableDatabase().insert("ce", null, contentValues);
                    int iZzb = zzgzVar.zzc.zzb() - 500;
                    if (iZzb > 0) {
                        zzgzVar.zzc.zza(CollectionsKt.t0(zzgzVar.zzc.zzd(), iZzb));
                    }
                    if (zzgzVar.zzc.zzb() >= 20) {
                        zzgzVar.zzf();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return Unit.a;
    }
}
