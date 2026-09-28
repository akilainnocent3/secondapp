package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.v1b;
import defpackage.v5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzbh extends tje0 implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzbo zzc;
    final /* synthetic */ zzhk zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbh(zzbo zzboVar, zzhk zzhkVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zzc = zzboVar;
        this.zzd = zzhkVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        return new zzbh(this.zzc, this.zzd, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbh) create((v5b) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r4).zza(r1, r3) == r0) goto L14;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r3.zzb
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.uj50.b(r4)
            goto L3a
        Ld:
            java.lang.Object r1 = r3.zza
            com.google.android.recaptcha.internal.zzhk r1 = (com.google.android.recaptcha.internal.zzhk) r1
            defpackage.uj50.b(r4)
            goto L2b
        L15:
            defpackage.uj50.b(r4)
            com.google.android.recaptcha.internal.zzbo r4 = r3.zzc
            com.google.android.recaptcha.internal.zzbp r1 = com.google.android.recaptcha.internal.zzbp.zza
            com.google.android.recaptcha.internal.zzbo.zzi(r4, r1)
            com.google.android.recaptcha.internal.zzhk r1 = r3.zzd
            r3.zza = r1
            r3.zzb = r2
            java.lang.Object r4 = r4.zze(r3)
            if (r4 == r0) goto L3d
        L2b:
            com.google.android.recaptcha.internal.zzhg r4 = (com.google.android.recaptcha.internal.zzhg) r4
            r2 = 0
            r3.zza = r2
            r2 = 2
            r3.zzb = r2
            java.lang.Object r3 = r4.zza(r1, r3)
            if (r3 != r0) goto L3a
            goto L3d
        L3a:
            kotlin.Unit r3 = kotlin.Unit.a
            return r3
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzbh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
