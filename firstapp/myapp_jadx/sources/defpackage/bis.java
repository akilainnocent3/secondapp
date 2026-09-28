package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bis {
    /* JADX WARN: Can't wrap try/catch for region: R(3:35|19|20) */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        r2 = r14 + 1;
        defpackage.itf0.a.p(r3, defpackage.pe4.b(r2, "ConcurrentModificationException while snapshotting list (attempt=", ")"), new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r2 < r13) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        r0.a = r12;
        r0.b = r3;
        r0.c = r13;
        r0.d = r2;
        r0.e = r6;
        r0.i = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (defpackage.hkd.b(r6, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        r10 = r6;
        r7 = r12;
        r6 = r3;
        r3 = r13;
        r12 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        r14 = r2;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0079 -> B:12:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.util.ArrayList r12, int r13, defpackage.x1b r14) {
        /*
            boolean r0 = r14 instanceof defpackage.ais
            if (r0 == 0) goto L13
            r0 = r14
            ais r0 = (defpackage.ais) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            ais r0 = new ais
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f
            y5b r1 = defpackage.y5b.a
            int r2 = r0.i
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 != r5) goto L34
            long r12 = r0.e
            int r2 = r0.d
            int r3 = r0.c
            java.util.ConcurrentModificationException r6 = r0.b
            java.util.List r7 = r0.a
            defpackage.uj50.b(r14)
        L32:
            r14 = r2
            goto L7f
        L34:
            r12 = 0
            java.lang.String r12 = com.sportybet.android.instantwin.presentation.openbet.fNZf.oLsIjJCWb.eQjXhIBuwxCkJu
            defpackage.ib5.a(r12)
            return r3
        L3b:
            defpackage.uj50.b(r14)
            r6 = 1
            r14 = r4
        L41:
            if (r14 >= r13) goto L89
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            boolean r2 = defpackage.i9p.h(r2)
            if (r2 == 0) goto L89
            java.util.List r12 = kotlin.collections.CollectionsKt.A0(r12)     // Catch: java.util.ConcurrentModificationException -> L52
            return r12
        L52:
            r3 = move-exception
            int r2 = r14 + 1
            itf0$a r14 = defpackage.itf0.a
            java.lang.String r8 = "ConcurrentModificationException while snapshotting list (attempt="
            java.lang.String r9 = ")"
            java.lang.String r8 = defpackage.pe4.b(r2, r8, r9)
            java.lang.Object[] r9 = new java.lang.Object[r4]
            r14.p(r3, r8, r9)
            if (r2 >= r13) goto L88
            r0.a = r12
            r0.b = r3
            r0.c = r13
            r0.d = r2
            r0.e = r6
            r0.i = r5
            java.lang.Object r14 = defpackage.hkd.b(r6, r0)
            if (r14 != r1) goto L79
            return r1
        L79:
            r10 = r6
            r7 = r12
            r6 = r3
            r3 = r13
            r12 = r10
            goto L32
        L7f:
            r8 = 2
            long r12 = r12 * r8
            r10 = r12
            r13 = r3
            r3 = r6
            r12 = r7
            r6 = r10
            goto L41
        L88:
            r14 = r2
        L89:
            kotlin.coroutines.CoroutineContext r13 = r0.getContext()
            boolean r13 = defpackage.i9p.h(r13)
            if (r13 == 0) goto Lc1
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            int r12 = r12.size()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = ", size="
            java.lang.String r2 = ", thread="
            java.lang.String r4 = "safeSnapshot failed: attempts="
            java.lang.StringBuilder r12 = defpackage.dy5.a(r4, r14, r12, r1, r2)
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r13.<init>(r12, r3)
            gph r12 = defpackage.gph.a()
            r12.b(r13)
            itf0$a r12 = defpackage.itf0.a
            r12.e(r13)
        Lc1:
            m2g r12 = defpackage.m2g.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bis.a(java.util.ArrayList, int, x1b):java.lang.Object");
    }
}
