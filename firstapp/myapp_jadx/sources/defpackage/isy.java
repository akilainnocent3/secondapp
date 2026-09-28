package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class isy implements xty {
    public final str<ksy> a;
    public final jsy b;

    public isy(str<ksy> strVar, jsy jsyVar) {
        strVar.getClass();
        jsyVar.getClass();
        this.a = strVar;
        this.b = jsyVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xty
    public final Object a(x1b x1bVar) {
        fsy fsyVar;
        if (x1bVar instanceof fsy) {
            fsyVar = (fsy) x1bVar;
            int i = fsyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fsyVar.c = i - Integer.MIN_VALUE;
            } else {
                fsyVar = new fsy(this, x1bVar);
            }
        } else {
            fsyVar = new fsy(this, x1bVar);
        }
        Object obj = fsyVar.a;
        y5b y5bVar = y5b.a;
        int i2 = fsyVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            fsyVar.c = 1;
            if (this.b.a(fsyVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0096  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (r3.c(r8, false, r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
    
        if (r3.c(r10, true, r0) == r1) goto L41;
     */
    @Override // defpackage.xty
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.yty r11, defpackage.x1b r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.hsy
            if (r0 == 0) goto L13
            r0 = r12
            hsy r0 = (defpackage.hsy) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            hsy r0 = new hsy
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.b
            y5b r1 = defpackage.y5b.a
            int r2 = r0.d
            jsy r3 = r10.b
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L41
            if (r2 == r6) goto L3d
            if (r2 == r5) goto L37
            if (r2 != r4) goto L31
            defpackage.uj50.b(r12)
            goto La4
        L31:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r10)
            return r7
        L37:
            java.lang.String r10 = r0.a
            defpackage.uj50.b(r12)
            goto L8e
        L3d:
            defpackage.uj50.b(r12)
            goto L7f
        L41:
            defpackage.uj50.b(r12)
            str<ksy> r12 = r10.a
            java.lang.Object r12 = r12.get()
            r12.getClass()
            ksy r12 = (defpackage.ksy) r12
            psy r2 = r11.f
            if (r2 != 0) goto L56
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        L56:
            wwd0 r8 = r12.w
            java.lang.Object r8 = r8.getValue()
            osy r8 = (defpackage.osy) r8
            psy r8 = r8.a
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L69
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        L69:
            com.sportybet.plugin.realsports.betslip.Selection r8 = r11.a
            java.lang.String r8 = r8.k()
            boolean r9 = r11.b
            if (r9 != 0) goto L82
            r0.a = r7
            r0.d = r6
            r10 = 0
            java.lang.Object r10 = r3.c(r8, r10, r0)
            if (r10 != r1) goto L7f
            goto La3
        L7f:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        L82:
            r0.a = r8
            r0.d = r5
            java.lang.Object r12 = r10.c(r11, r12, r2, r0)
            if (r12 != r1) goto L8d
            goto La3
        L8d:
            r10 = r8
        L8e:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            if (r11 == 0) goto La7
            r10.getClass()
            r0.a = r7
            r0.d = r4
            java.lang.Object r10 = r3.c(r10, r6, r0)
            if (r10 != r1) goto La4
        La3:
            return r1
        La4:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        La7:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isy.b(yty, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(yty ytyVar, ksy ksyVar, psy psyVar, x1b x1bVar) {
        gsy gsyVar;
        boolean z;
        if (x1bVar instanceof gsy) {
            gsyVar = (gsy) x1bVar;
            int i = gsyVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gsyVar.d = i - Integer.MIN_VALUE;
            } else {
                gsyVar = new gsy(this, x1bVar);
            }
        } else {
            gsyVar = new gsy(this, x1bVar);
        }
        Object objA = gsyVar.b;
        Object obj = y5b.a;
        int i2 = gsyVar.d;
        if (i2 == 0) {
            uj50.b(objA);
            if (psyVar.b == null) {
                return Boolean.FALSE;
            }
            gsyVar.a = ytyVar;
            gsyVar.d = 1;
            objA = ksyVar.a(psyVar, gsyVar);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ytyVar = gsyVar.a;
            uj50.b(objA);
        }
        qsy qsyVar = (qsy) objA;
        if (qsyVar == null) {
            return Boolean.FALSE;
        }
        if (qsyVar.b && qsyVar.c != esy.a) {
            int iOrdinal = qsyVar.a.ordinal();
            if (iOrdinal != 0 && iOrdinal != 1) {
                uhc.a();
                return null;
            }
            z = zty.a(ytyVar);
        }
        return Boolean.valueOf(z);
    }
}
