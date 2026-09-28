package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class euy implements xty {
    public final str<ksy> a;
    public final fuy b;

    public euy(str<ksy> strVar, fuy fuyVar) {
        strVar.getClass();
        fuyVar.getClass();
        this.a = strVar;
        this.b = fuyVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xty
    public final Object a(x1b x1bVar) {
        cuy cuyVar;
        if (x1bVar instanceof cuy) {
            cuyVar = (cuy) x1bVar;
            int i = cuyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cuyVar.c = i - Integer.MIN_VALUE;
            } else {
                cuyVar = new cuy(this, x1bVar);
            }
        } else {
            cuyVar = new cuy(this, x1bVar);
        }
        Object obj = cuyVar.a;
        y5b y5bVar = y5b.a;
        int i2 = cuyVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            cuyVar.c = 1;
            if (this.b.a(cuyVar) == y5bVar) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        if (r6.c(r8, false, r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0094, code lost:
    
        if (r6.c(r8, true, r0) == r1) goto L41;
     */
    @Override // defpackage.xty
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.yty r7, defpackage.x1b r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.duy
            if (r0 == 0) goto L13
            r0 = r8
            duy r0 = (defpackage.duy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            duy r0 = new duy
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            defpackage.uj50.b(r8)
            goto L97
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L31:
            defpackage.uj50.b(r8)
            goto L73
        L35:
            defpackage.uj50.b(r8)
            psy r8 = r7.f
            if (r8 != 0) goto L3f
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L3f:
            str<ksy> r2 = r6.a
            java.lang.Object r2 = r2.get()
            ksy r2 = (defpackage.ksy) r2
            r2.getClass()
            wwd0 r2 = r2.w
            java.lang.Object r2 = r2.getValue()
            osy r2 = (defpackage.osy) r2
            psy r2 = r2.a
            boolean r8 = r2.equals(r8)
            if (r8 != 0) goto L5d
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L5d:
            com.sportybet.plugin.realsports.betslip.Selection r8 = r7.a
            java.lang.String r8 = r8.k()
            boolean r2 = r7.b
            fuy r6 = r6.b
            if (r2 != 0) goto L76
            r0.c = r4
            r7 = 0
            java.lang.Object r6 = r6.c(r8, r7, r0)
            if (r6 != r1) goto L73
            goto L96
        L73:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L76:
            psy r2 = r7.f
            if (r2 == 0) goto L7c
            java.lang.String r5 = r2.b
        L7c:
            if (r5 == 0) goto L9a
            nty r2 = r7.e
            nty$a r5 = nty.a.a
            boolean r2 = kotlin.jvm.internal.Intrinsics.g(r2, r5)
            if (r2 != 0) goto L9a
            boolean r7 = defpackage.zty.a(r7)
            if (r7 == 0) goto L9a
            r0.c = r3
            java.lang.Object r6 = r6.c(r8, r4, r0)
            if (r6 != r1) goto L97
        L96:
            return r1
        L97:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L9a:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.euy.b(yty, x1b):java.lang.Object");
    }
}
