package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.rush.view.RushFragment$onboardingDoneSetup$1", f = "RushFragment.kt", l = {4680, 4683}, m = "invokeSuspend", v = 1)
public final class x560 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ l560 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x560(boolean z, boolean z2, l560 l560Var, v1b<? super x560> v1bVar) {
        super(2, v1bVar);
        this.b = z;
        this.c = z2;
        this.d = l560Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new x560(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((x560) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0031  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (defpackage.hkd.b(100, r5) == r0) goto L19;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r5.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto L10
            defpackage.uj50.b(r6)
            goto L45
        L10:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L17:
            defpackage.uj50.b(r6)
            goto L31
        L1b:
            defpackage.uj50.b(r6)
            boolean r6 = r5.b
            if (r6 == 0) goto L45
            boolean r6 = r5.c
            if (r6 == 0) goto L31
            r5.a = r3
            r3 = 1800(0x708, double:8.893E-321)
            java.lang.Object r6 = defpackage.hkd.b(r3, r5)
            if (r6 != r0) goto L31
            goto L44
        L31:
            l560 r6 = r5.d
            c760 r6 = r6.F0()
            r6.x1()
            r5.a = r2
            r1 = 100
            java.lang.Object r5 = defpackage.hkd.b(r1, r5)
            if (r5 != r0) goto L45
        L44:
            return r0
        L45:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x560.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
