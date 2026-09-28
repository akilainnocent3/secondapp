package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class ule implements zsm, wtm {
    public final asm a;
    public final kum b;
    public final b390 c;

    public ule(asm asmVar, kum kumVar) {
        asmVar.getClass();
        kumVar.getClass();
        this.a = asmVar;
        this.b = kumVar;
        this.c = d390.b(0, 0, null, 7);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r5.emit(r6, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (r5.emit(r6, r0) == r1) goto L25;
     */
    @Override // defpackage.zsm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Double r6, java.lang.String r7, defpackage.x1b r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.tle
            if (r0 == 0) goto L13
            r0 = r8
            tle r0 = (defpackage.tle) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tle r0 = new tle
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            defpackage.uj50.b(r8)
            goto L5c
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L31:
            defpackage.uj50.b(r8)
            goto L4e
        L35:
            defpackage.uj50.b(r8)
            b390 r5 = r5.c
            if (r6 == 0) goto L51
            double r2 = r6.doubleValue()
            imj r6 = new imj
            r6.<init>(r2, r7)
            r0.c = r4
            java.lang.Object r5 = r5.emit(r6, r0)
            if (r5 != r1) goto L4e
            goto L5b
        L4e:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L51:
            emj r6 = defpackage.emj.a
            r0.c = r3
            java.lang.Object r5 = r5.emit(r6, r0)
            if (r5 != r1) goto L5c
        L5b:
            return r1
        L5c:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ule.a(java.lang.Double, java.lang.String, x1b):java.lang.Object");
    }

    @Override // defpackage.zsm
    public final Object b(gb gbVar) {
        Object objEmit = this.c.emit(dmm.a, gbVar);
        return objEmit == y5b.a ? objEmit : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r3.emit(r6, r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        if (r3.emit(r6, r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        if (r3.emit(r6, r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00de, code lost:
    
        if (r3.emit(r8, r0) == r1) goto L52;
     */
    @Override // defpackage.zsm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.c5c r7, defpackage.x1b r8) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ule.c(c5c, x1b):java.lang.Object");
    }

    @Override // defpackage.zsm
    public final Object d(ip7 ip7Var) {
        Object objEmit = this.c.emit(dzs.a, ip7Var);
        return objEmit == y5b.a ? objEmit : Unit.a;
    }

    @Override // defpackage.wtm
    public final b390 invoke() {
        return this.c;
    }
}
