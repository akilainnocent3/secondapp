package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.vip.presentation.VipOnboardingKt$VipOnboardingTwo$2$1", f = "VipOnboarding.kt", l = {1528, 1530}, m = "invokeSuspend", v = 1)
public final class sdi0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ytw<Boolean> b;
    public final /* synthetic */ ytw<Boolean> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sdi0(ytw<Boolean> ytwVar, ytw<Boolean> ytwVar2, v1b<? super sdi0> v1bVar) {
        super(2, v1bVar);
        this.b = ytwVar;
        this.c = ytwVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new sdi0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((sdi0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (defpackage.hkd.b(500, r7) == r0) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r7.a
            ytw<java.lang.Boolean> r2 = r7.c
            ytw<java.lang.Boolean> r3 = r7.b
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1f
            if (r1 == r5) goto L1b
            if (r1 != r4) goto L14
            defpackage.uj50.b(r8)
            goto L45
        L14:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            r7 = 0
            return r7
        L1b:
            defpackage.uj50.b(r8)
            goto L35
        L1f:
            defpackage.uj50.b(r8)
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r3.setValue(r8)
            r2.setValue(r8)
            r7.a = r5
            r5 = 1500(0x5dc, double:7.41E-321)
            java.lang.Object r8 = defpackage.hkd.b(r5, r7)
            if (r8 != r0) goto L35
            goto L44
        L35:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r3.setValue(r8)
            r7.a = r4
            r3 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r7 = defpackage.hkd.b(r3, r7)
            if (r7 != r0) goto L45
        L44:
            return r0
        L45:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r2.setValue(r7)
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sdi0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
