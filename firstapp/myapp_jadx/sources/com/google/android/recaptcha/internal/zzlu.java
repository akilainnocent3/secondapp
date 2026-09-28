package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.v1b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzlu extends tje0 implements Function2 {
    int zza;
    final /* synthetic */ zzly zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlu(zzly zzlyVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zzb = zzlyVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        zzlu zzluVar = new zzlu(this.zzb, v1bVar);
        zzluVar.zzc = obj;
        return zzluVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlu) create((zzhk) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r7.zzc(r1, r6) == r0) goto L19;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r6.zza
            r2 = 1
            if (r1 == 0) goto L11
            java.lang.Object r3 = r6.zzc
            com.google.android.recaptcha.internal.zzhk r3 = (com.google.android.recaptcha.internal.zzhk) r3
            defpackage.uj50.b(r7)
            if (r1 == r2) goto L34
            goto L53
        L11:
            defpackage.uj50.b(r7)
            java.lang.Object r7 = r6.zzc
            com.google.android.recaptcha.internal.zzhk r7 = (com.google.android.recaptcha.internal.zzhk) r7
            com.google.android.recaptcha.internal.zzly r1 = r6.zzb
            com.google.android.recaptcha.internal.zzdj r1 = r1.zzn()
            com.google.android.recaptcha.internal.zzmc r3 = com.google.android.recaptcha.internal.zzmc.zzd
            com.google.android.recaptcha.internal.zzmc r4 = com.google.android.recaptcha.internal.zzmc.zzc
            com.google.android.recaptcha.internal.zzmc r5 = com.google.android.recaptcha.internal.zzmc.zzb
            com.google.android.recaptcha.internal.zzmc[] r3 = new com.google.android.recaptcha.internal.zzmc[]{r3, r4, r5}
            r6.zzc = r7
            r6.zza = r2
            java.lang.Object r1 = r1.zzb(r3, r6)
            if (r1 == r0) goto L70
            r3 = r7
            r7 = r1
        L34:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L3f
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L3f:
            com.google.android.recaptcha.internal.zzly r7 = r6.zzb
            com.google.android.recaptcha.internal.zzdj r7 = r7.zzn()
            com.google.android.recaptcha.internal.zzmc r1 = com.google.android.recaptcha.internal.zzmc.zzb
            r6.zzc = r3
            r2 = 2
            r6.zza = r2
            java.lang.Object r7 = r7.zzc(r1, r6)
            if (r7 != r0) goto L53
            goto L70
        L53:
            com.google.android.recaptcha.internal.zzly r6 = r6.zzb
            dm8 r7 = defpackage.em8.a()
            r6.zza = r7
            com.google.android.recaptcha.internal.zzcr r7 = com.google.android.recaptcha.internal.zzly.zzl(r6)
            v5b r7 = r7.zza()
            com.google.android.recaptcha.internal.zzlt r0 = new com.google.android.recaptcha.internal.zzlt
            r1 = 0
            r0.<init>(r3, r6, r1)
            r6 = 3
            defpackage.ej5.c(r7, r1, r1, r0, r6)
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzlu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
