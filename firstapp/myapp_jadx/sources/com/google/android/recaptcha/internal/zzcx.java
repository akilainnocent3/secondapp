package com.google.android.recaptcha.internal;

import defpackage.v1b;
import defpackage.vxf0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcx {
    public static final zzcx zza = new zzcx();

    private zzcx() {
    }

    public static final Object zzc(long j, int i, long j2, long j3, double d, Function1 function1, v1b v1bVar) {
        return vxf0.b(j, new zzcw(20, 100L, 1000L, 2.0d, function1, null), v1bVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:43|24|(0)(1:27)) */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
    
        r14 = r3;
        r3 = r13;
        r13 = r10;
        r9 = r8;
        r8 = r12;
        r1 = r11;
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
    
        if (defpackage.hkd.b(r4, r1) != r2) goto L18;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00bc -> B:18:0x0049). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zza(int r18, long r19, long r21, double r23, kotlin.jvm.functions.Function1 r25, defpackage.v1b r26) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcx.zza(int, long, long, double, kotlin.jvm.functions.Function1, v1b):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(2:4|(1:6)(1:7))(1:7)|8|(3:(1:(2:12|13)(2:14|15))(4:16|40|17|18)|28|(3:30|(1:32)|33)(1:37))(1:21)|38|22|(1:36)(1:25)) */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        r14 = r12;
        r12 = r1;
        r1 = r14;
        r14 = r10;
        r10 = r8;
        r8 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
    
        if (defpackage.hkd.b(r6, r1) != r2) goto L13;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00aa -> B:13:0x003b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzb(kotlin.jvm.functions.Function1 r17, long r18, long r20, double r22, kotlin.jvm.functions.Function1 r24, defpackage.v1b r25) throws java.lang.Exception {
        /*
            r16 = this;
            r0 = r25
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzcv
            if (r1 == 0) goto L15
            r1 = r0
            com.google.android.recaptcha.internal.zzcv r1 = (com.google.android.recaptcha.internal.zzcv) r1
            int r2 = r1.zzh
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.zzh = r2
            goto L1c
        L15:
            com.google.android.recaptcha.internal.zzcv r1 = new com.google.android.recaptcha.internal.zzcv
            r2 = r16
            r1.<init>(r2, r0)
        L1c:
            java.lang.Object r0 = r1.zzf
            y5b r2 = defpackage.y5b.a
            int r3 = r1.zzh
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L5d
            if (r3 == r5) goto L49
            if (r3 != r4) goto L42
            long r6 = r1.zzd
            double r8 = r1.zze
            long r10 = r1.zzc
            java.lang.Object r3 = r1.zzb
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            java.lang.Object r12 = r1.zza
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            defpackage.uj50.b(r0)
        L3b:
            r14 = r12
            r12 = r1
            r1 = r14
            r14 = r10
            r10 = r8
            r8 = r14
            goto L6b
        L42:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            r0 = 0
            return r0
        L49:
            long r6 = r1.zzd
            double r8 = r1.zze
            long r10 = r1.zzc
            java.lang.Object r3 = r1.zzb
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            java.lang.Object r12 = r1.zza
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            defpackage.uj50.b(r0)     // Catch: java.lang.Exception -> L5b
            return r0
        L5b:
            r0 = move-exception
            goto L86
        L5d:
            defpackage.uj50.b(r0)
            r6 = r18
            r8 = r20
            r10 = r22
            r3 = r24
            r12 = r1
            r1 = r17
        L6b:
            r12.zza = r1     // Catch: java.lang.Exception -> L7f
            r12.zzb = r3     // Catch: java.lang.Exception -> L7f
            r12.zzc = r8     // Catch: java.lang.Exception -> L7f
            r12.zze = r10     // Catch: java.lang.Exception -> L7f
            r12.zzd = r6     // Catch: java.lang.Exception -> L7f
            r12.zzh = r5     // Catch: java.lang.Exception -> L7f
            java.lang.Object r0 = r3.invoke(r12)     // Catch: java.lang.Exception -> L7f
            if (r0 != r2) goto L7e
            goto Lad
        L7e:
            return r0
        L7f:
            r0 = move-exception
            r14 = r12
            r12 = r1
            r1 = r14
            r14 = r10
            r10 = r8
            r8 = r14
        L86:
            java.lang.Object r13 = r12.invoke(r0)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto Lae
            double r6 = (double) r6
            double r6 = r6 * r8
            long r6 = (long) r6
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 <= 0) goto L9a
            r6 = r10
        L9a:
            r1.zza = r12
            r1.zzb = r3
            r1.zzc = r10
            r1.zze = r8
            r1.zzd = r6
            r1.zzh = r4
            java.lang.Object r0 = defpackage.hkd.b(r6, r1)
            if (r0 == r2) goto Lad
            goto L3b
        Lad:
            return r2
        Lae:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcx.zzb(kotlin.jvm.functions.Function1, long, long, double, kotlin.jvm.functions.Function1, v1b):java.lang.Object");
    }
}
