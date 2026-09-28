package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class wty implements dsy {
    public final Set<xty> a;
    public final tuw b;

    public wty(tcn tcnVar) {
        tcnVar.getClass();
        this.a = tcnVar;
        this.b = uuw.a();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005e A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #2 {all -> 0x002f, blocks: (B:13:0x002b, B:27:0x0058, B:29:0x005e, B:30:0x0064, B:35:0x007d, B:34:0x007c, B:33:0x0071, B:26:0x0050), top: B:40:0x0021, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [quw] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [quw] */
    /* JADX WARN: Type inference failed for: r2v7, types: [quw] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:33:0x0071
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // defpackage.dsy
    public final java.lang.Object a(defpackage.x1b r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.uty
            if (r0 == 0) goto L13
            r0 = r8
            uty r0 = (defpackage.uty) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            uty r0 = new uty
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            y5b r1 = defpackage.y5b.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L39
            if (r2 != r3) goto L33
            java.util.Iterator r7 = r0.b
            quw r2 = r0.a
            defpackage.uj50.b(r8)     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L31 java.lang.Exception -> L71
            goto L58
        L2f:
            r7 = move-exception
            goto L83
        L31:
            r7 = move-exception
            goto L7c
        L33:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r5
        L39:
            quw r2 = r0.a
            defpackage.uj50.b(r8)
            goto L50
        L3f:
            defpackage.uj50.b(r8)
            tuw r8 = r7.b
            r0.a = r8
            r0.e = r4
            java.lang.Object r2 = r8.d(r0)
            if (r2 != r1) goto L4f
            goto L70
        L4f:
            r2 = r8
        L50:
            java.util.Set<xty> r7 = r7.a     // Catch: java.lang.Throwable -> L2f
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch: java.lang.Throwable -> L2f
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L2f
        L58:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r8 == 0) goto L7d
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L2f
            xty r8 = (defpackage.xty) r8     // Catch: java.lang.Throwable -> L2f
            r0.a = r2     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L31 java.lang.Exception -> L71
            r0.b = r7     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L31 java.lang.Exception -> L71
            r0.e = r3     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L31 java.lang.Exception -> L71
            java.lang.Object r8 = r8.a(r0)     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L31 java.lang.Exception -> L71
            if (r8 != r1) goto L58
        L70:
            return r1
        L71:
            itf0$a r8 = defpackage.itf0.a     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = "Failed to clear 1UP attribution recorder"
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L2f
            r8.d(r4, r6)     // Catch: java.lang.Throwable -> L2f
            goto L58
        L7c:
            throw r7     // Catch: java.lang.Throwable -> L2f
        L7d:
            kotlin.Unit r7 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L2f
            r2.f(r5)
            return r7
        L83:
            r2.f(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wty.a(x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0065 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:27:0x005f, B:29:0x0065, B:30:0x006b, B:35:0x0086, B:34:0x0085, B:33:0x007a, B:26:0x0057), top: B:40:0x0021, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [yty] */
    /* JADX WARN: Type inference failed for: r2v6, types: [yty] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [yty] */
    /* JADX WARN: Type inference failed for: r8v1, types: [quw] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [quw] */
    /* JADX WARN: Type inference failed for: r8v6, types: [quw] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v5, types: [xty] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:33:0x007a
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final java.lang.Object b(defpackage.yty r8, defpackage.x1b r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.vty
            if (r0 == 0) goto L13
            r0 = r9
            vty r0 = (defpackage.vty) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            vty r0 = new vty
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.d
            y5b r1 = defpackage.y5b.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L35
            java.util.Iterator r7 = r0.c
            quw r8 = r0.b
            yty r2 = r0.a
            defpackage.uj50.b(r9)     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L33 java.lang.Exception -> L7a
            goto L5f
        L31:
            r7 = move-exception
            goto L8c
        L33:
            r7 = move-exception
            goto L85
        L35:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r5
        L3b:
            quw r8 = r0.b
            yty r2 = r0.a
            defpackage.uj50.b(r9)
            goto L57
        L43:
            defpackage.uj50.b(r9)
            r0.a = r8
            tuw r9 = r7.b
            r0.b = r9
            r0.f = r4
            java.lang.Object r2 = r9.d(r0)
            if (r2 != r1) goto L55
            goto L79
        L55:
            r2 = r8
            r8 = r9
        L57:
            java.util.Set<xty> r7 = r7.a     // Catch: java.lang.Throwable -> L31
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L31
        L5f:
            boolean r9 = r7.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r9 == 0) goto L86
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L31
            xty r9 = (defpackage.xty) r9     // Catch: java.lang.Throwable -> L31
            r0.a = r2     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L33 java.lang.Exception -> L7a
            r0.b = r8     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L33 java.lang.Exception -> L7a
            r0.c = r7     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L33 java.lang.Exception -> L7a
            r0.f = r3     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L33 java.lang.Exception -> L7a
            java.lang.Object r9 = r9.b(r2, r0)     // Catch: java.lang.Throwable -> L31 java.util.concurrent.CancellationException -> L33 java.lang.Exception -> L7a
            if (r9 != r1) goto L5f
        L79:
            return r1
        L7a:
            itf0$a r9 = defpackage.itf0.a     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = "Failed to record 1UP attribution"
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L31
            r9.d(r4, r6)     // Catch: java.lang.Throwable -> L31
            goto L5f
        L85:
            throw r7     // Catch: java.lang.Throwable -> L31
        L86:
            kotlin.Unit r7 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L31
            r8.f(r5)
            return r7
        L8c:
            r8.f(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wty.b(yty, x1b):java.lang.Object");
    }
}
