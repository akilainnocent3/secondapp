package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class hh80 {
    public final zl80 a;
    public final zl80 b;

    public hh80(zl80 zl80Var, zl80 zl80Var2) {
        zl80Var.getClass();
        zl80Var2.getClass();
        this.a = zl80Var;
        this.b = zl80Var2;
    }

    public final double a() {
        Double d = this.a.d();
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        Double d2 = this.b.d();
        if (d2 != null) {
            double dDoubleValue2 = d2.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r6.a(r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.x1b r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.gh80
            if (r0 == 0) goto L13
            r0 = r7
            gh80 r0 = (defpackage.gh80) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gh80 r0 = new gh80
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            y5b r1 = defpackage.y5b.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.uj50.b(r7)
            goto L54
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L31:
            hh80 r6 = r0.a
            defpackage.uj50.b(r7)
            goto L47
        L37:
            defpackage.uj50.b(r7)
            r0.a = r6
            r0.d = r5
            zl80 r7 = r6.a
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L47
            goto L53
        L47:
            zl80 r6 = r6.b
            r0.a = r3
            r0.d = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L54
        L53:
            return r1
        L54:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hh80.b(x1b):java.lang.Object");
    }
}
