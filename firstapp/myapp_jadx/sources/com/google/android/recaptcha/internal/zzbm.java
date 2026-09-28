package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.v1b;
import defpackage.v5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzbm extends tje0 implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzhk zzc;
    final /* synthetic */ zzbo zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbm(zzhk zzhkVar, zzbo zzboVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zzc = zzhkVar;
        this.zzd = zzboVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        return new zzbm(this.zzc, this.zzd, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbm) create((v5b) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (com.google.android.recaptcha.internal.zzhj.zzb(r1, (com.google.android.recaptcha.internal.zzhf) r6, r5) == r0) goto L14;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r5.zzb
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L17
            if (r1 == r4) goto Lf
            defpackage.uj50.b(r6)
            goto L3c
        Lf:
            java.lang.Object r1 = r5.zza
            com.google.android.recaptcha.internal.zzhk r1 = (com.google.android.recaptcha.internal.zzhk) r1
            defpackage.uj50.b(r6)
            goto L2f
        L17:
            defpackage.uj50.b(r6)
            com.google.android.recaptcha.internal.zzhk r1 = r5.zzc
            com.google.android.recaptcha.internal.zzbo r6 = r5.zzd
            r5.zza = r1
            r5.zzb = r4
            com.google.android.recaptcha.internal.zzbf r4 = new com.google.android.recaptcha.internal.zzbf
            r4.<init>(r6, r2)
            r6 = 38
            java.lang.Object r6 = com.google.android.recaptcha.internal.zzhj.zzd(r6, r3, r4, r5)
            if (r6 == r0) goto L3f
        L2f:
            com.google.android.recaptcha.internal.zzhf r6 = (com.google.android.recaptcha.internal.zzhf) r6
            r5.zza = r2
            r5.zzb = r3
            java.lang.Object r5 = com.google.android.recaptcha.internal.zzhj.zzb(r1, r6, r5)
            if (r5 != r0) goto L3c
            goto L3f
        L3c:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzbm.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
