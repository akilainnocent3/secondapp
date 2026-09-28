package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class hwd0 implements ozm {
    public final itm a;
    public final kzm b;

    public hwd0(itm itmVar, kzm kzmVar) {
        itmVar.getClass();
        kzmVar.getClass();
        this.a = itmVar;
        this.b = kzmVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (r5.a.h(r0) == r1) goto L21;
     */
    @Override // defpackage.ozm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.x1b r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.gwd0
            if (r0 == 0) goto L13
            r0 = r6
            gwd0 r0 = (defpackage.gwd0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gwd0 r0 = new gwd0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            defpackage.uj50.b(r6)
            goto L50
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L31:
            defpackage.uj50.b(r6)
            goto L45
        L35:
            defpackage.uj50.b(r6)
            mmd0 r6 = defpackage.mmd0.b
            r0.c = r4
            kzm r2 = r5.b
            java.lang.Object r6 = r2.a(r6, r0)
            if (r6 != r1) goto L45
            goto L4f
        L45:
            r0.c = r3
            itm r5 = r5.a
            java.lang.Object r5 = r5.h(r0)
            if (r5 != r1) goto L50
        L4f:
            return r1
        L50:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hwd0.a(x1b):java.lang.Object");
    }
}
