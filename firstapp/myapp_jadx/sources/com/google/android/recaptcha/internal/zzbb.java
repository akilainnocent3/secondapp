package com.google.android.recaptcha.internal;

import defpackage.tje0;
import defpackage.v1b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final class zzbb extends tje0 implements Function2 {
    int zza;
    final /* synthetic */ zzbo zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbb(zzbo zzboVar, String str, v1b v1bVar) {
        super(2, v1bVar);
        this.zzb = zzboVar;
        this.zzc = str;
    }

    @Override // defpackage.pz1
    public final v1b create(Object obj, v1b v1bVar) {
        zzbb zzbbVar = new zzbb(this.zzb, this.zzc, v1bVar);
        zzbbVar.zzd = obj;
        return zzbbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbb) create((zzhk) obj, (v1b) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r7 != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r7 == r0) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v6 */
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
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1b
            if (r1 == r3) goto L13
            defpackage.uj50.b(r7)
            if (r1 == r2) goto L56
            goto L64
        L13:
            java.lang.Object r1 = r6.zzd
            com.google.android.recaptcha.internal.zzhk r1 = (com.google.android.recaptcha.internal.zzhk) r1
            defpackage.uj50.b(r7)
            goto L49
        L1b:
            java.lang.Object r1 = r6.zzd
            com.google.android.recaptcha.internal.zzhk r1 = (com.google.android.recaptcha.internal.zzhk) r1
            defpackage.uj50.b(r7)     // Catch: java.lang.Exception -> L3c
            goto L39
        L23:
            defpackage.uj50.b(r7)
            java.lang.Object r7 = r6.zzd
            r1 = r7
            com.google.android.recaptcha.internal.zzhk r1 = (com.google.android.recaptcha.internal.zzhk) r1
            com.google.android.recaptcha.internal.zzbo r7 = r6.zzb     // Catch: java.lang.Exception -> L3c
            java.lang.String r5 = r6.zzc     // Catch: java.lang.Exception -> L3c
            r6.zzd = r1     // Catch: java.lang.Exception -> L3c
            r6.zza = r4     // Catch: java.lang.Exception -> L3c
            java.lang.Object r7 = com.google.android.recaptcha.internal.zzbo.zzd(r7, r5, r6)     // Catch: java.lang.Exception -> L3c
            if (r7 == r0) goto L67
        L39:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L3c
            return r7
        L3c:
            com.google.android.recaptcha.internal.zzbo r7 = r6.zzb
            r6.zzd = r1
            r6.zza = r3
            java.lang.Object r7 = r7.zze(r6)
            if (r7 != r0) goto L49
            goto L67
        L49:
            com.google.android.recaptcha.internal.zzhg r7 = (com.google.android.recaptcha.internal.zzhg) r7
            r3 = 0
            r6.zzd = r3
            r6.zza = r2
            java.lang.Object r7 = r7.zza(r1, r6)
            if (r7 == r0) goto L67
        L56:
            com.google.android.recaptcha.internal.zzbo r7 = r6.zzb
            java.lang.String r1 = r6.zzc
            r2 = 4
            r6.zza = r2
            java.lang.Object r7 = com.google.android.recaptcha.internal.zzbo.zzd(r7, r1, r6)
            if (r7 != r0) goto L64
            goto L67
        L64:
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L67:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzbb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
