package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.CrashFragment$showGiftToast$1", f = "CrashFragment.kt", l = {3022, 3040}, m = "invokeSuspend", v = 1)
public final class ehb extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ fgb b;
    public final /* synthetic */ String c;
    public final /* synthetic */ double d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehb(fgb fgbVar, String str, double d, v1b<? super ehb> v1bVar) {
        super(1, v1bVar);
        this.b = fgbVar;
        this.c = str;
        this.d = d;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new ehb(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((ehb) create(v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0087, code lost:
    
        if (defpackage.hkd.b(2200, r9) == r0) goto L19;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r9.a
            r2 = 2
            r3 = 1
            fgb r4 = r9.b
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L13
            defpackage.uj50.b(r10)
            goto L8a
        L13:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            r9 = 0
            return r9
        L1a:
            defpackage.uj50.b(r10)
            goto L3c
        L1e:
            defpackage.uj50.b(r10)
            ytw<java.lang.Boolean> r10 = r4.i0
            x5a0 r10 = (defpackage.x5a0) r10
            java.lang.Object r10 = r10.getValue()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L94
            r9.a = r3
            r5 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r10 = defpackage.hkd.b(r5, r9)
            if (r10 != r0) goto L3c
            goto L89
        L3c:
            ibs r10 = r4.getViewLifecycleOwner()
            s9s r10 = r10.getLifecycle()
            s9s$b r10 = r10.b()
            s9s$b r1 = s9s.b.e
            int r10 = r10.compareTo(r1)
            if (r10 < 0) goto L94
            ytw<ob30> r10 = r4.c1
            ob30$a r1 = new ob30$a
            ypk$b r5 = new ypk$b
            java.lang.String r6 = r9.c
            double r7 = r9.d
            r5.<init>(r6, r7)
            r1.<init>(r5)
            x5a0 r10 = (defpackage.x5a0) r10
            r10.setValue(r1)
            t530 r10 = r4.f1()
            ssw<java.lang.Boolean> r10 = r10.d
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r10.m(r1)
            ssw<com.sportygames.commons.viewmodels.FbgData> r10 = defpackage.jbh.a
            com.sportygames.commons.viewmodels.FbgData r1 = new com.sportygames.commons.viewmodels.FbgData
            java.lang.Double r5 = new java.lang.Double
            r5.<init>(r7)
            r1.<init>(r3, r5, r6)
            r10.j(r1)
            r9.a = r2
            r1 = 2200(0x898, double:1.087E-320)
            java.lang.Object r9 = defpackage.hkd.b(r1, r9)
            if (r9 != r0) goto L8a
        L89:
            return r0
        L8a:
            r4.s1()
            ssw<java.lang.Boolean> r9 = defpackage.jbh.b
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r9.j(r10)
        L94:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
