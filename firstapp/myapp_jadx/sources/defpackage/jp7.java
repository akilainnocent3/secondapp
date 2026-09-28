package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class jp7 implements hsm {
    public final msm a;
    public final jzm b;
    public final zsm c;
    public final lzm d;

    public jp7(msm msmVar, jzm jzmVar, zsm zsmVar, lzm lzmVar) {
        msmVar.getClass();
        jzmVar.getClass();
        zsmVar.getClass();
        lzmVar.getClass();
        this.a = msmVar;
        this.b = jzmVar;
        this.c = zsmVar;
        this.d = lzmVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r4.a(r11, r12, r0) == r1) goto L33;
     */
    @Override // defpackage.hsm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.x1b r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.ip7
            if (r0 == 0) goto L13
            r0 = r12
            ip7 r0 = (defpackage.ip7) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ip7 r0 = new ip7
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.b
            y5b r1 = defpackage.y5b.a
            int r2 = r0.d
            r3 = 0
            zsm r4 = r11.c
            msm r5 = r11.a
            r6 = 3
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L44
            if (r2 == r8) goto L3e
            if (r2 == r7) goto L38
            if (r2 != r6) goto L32
            defpackage.uj50.b(r12)
            goto L88
        L32:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r11)
            return r3
        L38:
            long r7 = r0.a
            defpackage.uj50.b(r12)
            goto L65
        L3e:
            long r8 = r0.a
            defpackage.uj50.b(r12)
            goto L57
        L44:
            defpackage.uj50.b(r12)
            long r9 = r5.f()
            r0.a = r9
            r0.d = r8
            java.lang.Object r12 = r4.d(r0)
            if (r12 != r1) goto L56
            goto L87
        L56:
            r8 = r9
        L57:
            r0.a = r8
            r0.d = r7
            lzm r12 = r11.d
            java.lang.Object r12 = r12.g(r8, r0)
            if (r12 != r1) goto L64
            goto L87
        L64:
            r7 = r8
        L65:
            r2 = r12
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L6f
            r3 = r12
        L6f:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L88
            jzm r11 = r11.b
            java.lang.Double r11 = r11.a()
            java.lang.String r12 = r5.b()
            r0.a = r7
            r0.d = r6
            java.lang.Object r11 = r4.a(r11, r12, r0)
            if (r11 != r1) goto L88
        L87:
            return r1
        L88:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jp7.a(x1b):java.lang.Object");
    }
}
