package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.v1b;
import defpackage.v5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzfn extends tje0 implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ zzfp zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfn(zzgr zzgrVar, zzfp zzfpVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zzc = zzgrVar;
        this.zzd = zzfpVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        return new zzfn(this.zzc, this.zzd, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfn) create((v5b) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (r5 == r0) goto L14;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r4.zzb
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 == r3) goto Le
            defpackage.uj50.b(r5)
            goto L3f
        Le:
            java.lang.Object r1 = r4.zza
            com.google.android.recaptcha.internal.zzgr r1 = (com.google.android.recaptcha.internal.zzgr) r1
            defpackage.uj50.b(r5)
            goto L2d
        L16:
            defpackage.uj50.b(r5)
            com.google.android.recaptcha.internal.zzgr r1 = r4.zzc
            com.google.android.recaptcha.internal.zzfp r5 = r4.zzd
            r4.zza = r1
            r4.zzb = r3
            com.google.android.recaptcha.internal.zzez r3 = new com.google.android.recaptcha.internal.zzez
            r3.<init>(r5, r2)
            com.google.android.recaptcha.internal.zzhg r5 = new com.google.android.recaptcha.internal.zzhg
            r5.<init>(r3)
            if (r5 == r0) goto L42
        L2d:
            com.google.android.recaptcha.internal.zzhg r5 = (com.google.android.recaptcha.internal.zzhg) r5
            r4.zza = r2
            r2 = 2
            r4.zzb = r2
            com.google.android.recaptcha.internal.zzhk r1 = r1.zza()
            java.lang.Object r5 = r5.zza(r1, r4)
            if (r5 != r0) goto L3f
            goto L42
        L3f:
            com.google.android.recaptcha.internal.zzxn r5 = (com.google.android.recaptcha.internal.zzxn) r5
            return r5
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzfn.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
