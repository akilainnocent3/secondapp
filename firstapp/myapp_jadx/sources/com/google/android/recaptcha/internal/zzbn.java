package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.v1b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzbn extends tje0 implements Function2 {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzbo zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbn(zzbo zzboVar, v1b v1bVar) {
        super(2, v1bVar);
        this.zzd = zzboVar;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        zzbn zzbnVar = new zzbn(this.zzd, v1bVar);
        zzbnVar.zze = obj;
        return zzbnVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbn) create((zzhk) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a0, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r10).zza(r1, r9) == r0) goto L30;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r9.zzc
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L1c
            if (r1 == r3) goto L13
            defpackage.uj50.b(r10)
            goto La3
        L13:
            java.lang.Object r1 = r9.zze
            com.google.android.recaptcha.internal.zzhk r1 = (com.google.android.recaptcha.internal.zzhk) r1
            defpackage.uj50.b(r10)
            goto L96
        L1c:
            java.lang.Object r1 = r9.zzb
            com.google.android.recaptcha.internal.zzbo r1 = (com.google.android.recaptcha.internal.zzbo) r1
            java.lang.Object r4 = r9.zza
            quw r4 = (defpackage.quw) r4
            java.lang.Object r6 = r9.zze
            com.google.android.recaptcha.internal.zzhk r6 = (com.google.android.recaptcha.internal.zzhk) r6
            defpackage.uj50.b(r10)
            r10 = r6
            goto L49
        L2d:
            defpackage.uj50.b(r10)
            java.lang.Object r10 = r9.zze
            com.google.android.recaptcha.internal.zzhk r10 = (com.google.android.recaptcha.internal.zzhk) r10
            com.google.android.recaptcha.internal.zzbo r1 = r9.zzd
            quw r6 = com.google.android.recaptcha.internal.zzbo.zzg(r1)
            r9.zze = r10
            r9.zza = r6
            r9.zzb = r1
            r9.zzc = r4
            java.lang.Object r4 = r6.d(r9)
            if (r4 == r0) goto Laa
            r4 = r6
        L49:
            com.google.android.recaptcha.internal.zzbp r6 = com.google.android.recaptcha.internal.zzbo.zza(r1)     // Catch: java.lang.Throwable -> L5b
            com.google.android.recaptcha.internal.zzbp r7 = com.google.android.recaptcha.internal.zzbp.zza     // Catch: java.lang.Throwable -> L5b
            boolean r6 = kotlin.jvm.internal.Intrinsics.g(r6, r7)     // Catch: java.lang.Throwable -> L5b
            if (r6 != 0) goto L5d
            kotlin.Unit r9 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L5b
            r4.f(r5)
            return r9
        L5b:
            r9 = move-exception
            goto La6
        L5d:
            com.google.android.recaptcha.internal.zzbp r6 = com.google.android.recaptcha.internal.zzbp.zzb     // Catch: java.lang.Throwable -> L5b
            com.google.android.recaptcha.internal.zzbo.zzi(r1, r6)     // Catch: java.lang.Throwable -> L5b
            kotlin.Unit r1 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L5b
            r4.f(r5)
            com.google.android.recaptcha.internal.zzbo r1 = r9.zzd
            dm8 r4 = defpackage.em8.a()
            r1.zza = r4
            com.google.android.recaptcha.internal.zzcr r4 = com.google.android.recaptcha.internal.zzbo.zzb(r1)
            v5b r4 = r4.zzc()
            com.google.android.recaptcha.internal.zzbm r6 = new com.google.android.recaptcha.internal.zzbm
            r6.<init>(r10, r1, r5)
            defpackage.ej5.c(r4, r5, r5, r6, r2)
            r9.zze = r10
            r9.zza = r5
            r9.zzb = r5
            r9.zzc = r3
            com.google.android.recaptcha.internal.zzbj r3 = new com.google.android.recaptcha.internal.zzbj
            r3.<init>(r1, r5)
            com.google.android.recaptcha.internal.zzhg r1 = new com.google.android.recaptcha.internal.zzhg
            r1.<init>(r3)
            if (r1 == r0) goto Laa
            r8 = r1
            r1 = r10
            r10 = r8
        L96:
            com.google.android.recaptcha.internal.zzhg r10 = (com.google.android.recaptcha.internal.zzhg) r10
            r9.zze = r5
            r9.zzc = r2
            java.lang.Object r9 = r10.zza(r1, r9)
            if (r9 != r0) goto La3
            goto Laa
        La3:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        La6:
            r4.f(r5)
            throw r9
        Laa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzbn.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
