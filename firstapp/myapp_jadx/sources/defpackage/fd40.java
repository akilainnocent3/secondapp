package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fd40 implements bd40 {
    public final ge40 a;
    public final ld40 b;
    public final wwd0 c = xwd0.a(ad40.d);
    public boolean d;

    public fd40(ge40 ge40Var, ld40 ld40Var) {
        this.a = ge40Var;
        this.b = ld40Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0059 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r6 == r1) goto L26;
     */
    @Override // defpackage.bd40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.x1b r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.dd40
            if (r0 == 0) goto L13
            r0 = r6
            dd40 r0 = (defpackage.dd40) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dd40 r0 = new dd40
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
            return r6
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L31:
            defpackage.uj50.b(r6)
            goto L4e
        L35:
            defpackage.uj50.b(r6)
            boolean r6 = r5.d
            if (r6 == 0) goto L45
            wwd0 r6 = r5.c
            java.lang.Object r6 = r6.getValue()
            ad40 r6 = (defpackage.ad40) r6
            goto L50
        L45:
            r0.c = r4
            java.lang.Object r6 = r5.b(r0)
            if (r6 != r1) goto L4e
            goto L58
        L4e:
            ad40 r6 = (defpackage.ad40) r6
        L50:
            r0.c = r3
            java.lang.Object r5 = r5.c(r6, r0)
            if (r5 != r1) goto L59
        L58:
            return r1
        L59:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd40.a(x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(x1b x1bVar) {
        cd40 cd40Var;
        if (x1bVar instanceof cd40) {
            cd40Var = (cd40) x1bVar;
            int i = cd40Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cd40Var.c = i - Integer.MIN_VALUE;
            } else {
                cd40Var = new cd40(this, x1bVar);
            }
        } else {
            cd40Var = new cd40(this, x1bVar);
        }
        Object objC = cd40Var.a;
        y5b y5bVar = y5b.a;
        int i2 = cd40Var.c;
        wwd0 wwd0Var = this.c;
        try {
            if (i2 == 0) {
                uj50.b(objC);
                ge40 ge40Var = this.a;
                cd40Var.c = 1;
                objC = ge40Var.c(cd40Var);
                if (objC == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objC);
            }
            wwd0Var.setValue((ad40) objC);
            this.d = true;
            return (ad40) objC;
        } catch (Exception unused) {
            return this.d ? (ad40) wwd0Var.getValue() : ad40.d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(ad40 ad40Var, x1b x1bVar) {
        ed40 ed40Var;
        if (x1bVar instanceof ed40) {
            ed40Var = (ed40) x1bVar;
            int i = ed40Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ed40Var.d = i - Integer.MIN_VALUE;
            } else {
                ed40Var = new ed40(this, x1bVar);
            }
        } else {
            ed40Var = new ed40(this, x1bVar);
        }
        Object objA = ed40Var.b;
        y5b y5bVar = y5b.a;
        int i2 = ed40Var.d;
        if (i2 == 0) {
            uj50.b(objA);
            ld40 ld40Var = this.b;
            lyh lyhVarC = ld40Var.c.a(ld40Var, ld40.d[1]).c();
            ed40Var.a = ad40Var;
            ed40Var.d = 1;
            objA = s0i.a(lyhVarC, ed40Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ad40Var = ed40Var.a;
            uj50.b(objA);
        }
        return new ad40(ad40Var.a, ad40Var.b, !Intrinsics.g((Boolean) objA, Boolean.TRUE));
    }
}
