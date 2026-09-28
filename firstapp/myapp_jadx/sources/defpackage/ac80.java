package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class ac80 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r8 == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.bc80 r6, vuh.a.C1227a r7, defpackage.x1b r8) {
        /*
            boolean r0 = r8 instanceof defpackage.zb80
            if (r0 == 0) goto L13
            r0 = r8
            zb80 r0 = (defpackage.zb80) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            zb80 r0 = new zb80
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            y5b r1 = defpackage.y5b.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            bc80 r6 = r0.a
            defpackage.uj50.b(r8)     // Catch: java.lang.Throwable -> L2d
            goto L5a
        L2d:
            r7 = move-exception
            goto L5e
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L35:
            vuh$a$a r7 = r0.b
            bc80 r6 = r0.a
            defpackage.uj50.b(r8)
            goto L4d
        L3d:
            defpackage.uj50.b(r8)
            r0.a = r6
            r0.b = r7
            r0.d = r5
            java.lang.Object r8 = r6.a(r0)
            if (r8 != r1) goto L4d
            goto L59
        L4d:
            r0.a = r6     // Catch: java.lang.Throwable -> L2d
            r0.b = r3     // Catch: java.lang.Throwable -> L2d
            r0.d = r4     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r8 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L2d
            if (r8 != r1) goto L5a
        L59:
            return r1
        L5a:
            r6.c()
            return r8
        L5e:
            r6.c()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ac80.a(bc80, vuh$a$a, x1b):java.lang.Object");
    }
}
