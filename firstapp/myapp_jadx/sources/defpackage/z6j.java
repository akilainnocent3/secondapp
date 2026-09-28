package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportygames.fruithunt.views.FruitHuntFragment$dropletView$2$1", f = "FruitHuntFragment.kt", l = {1955, 1956}, m = "invokeSuspend", v = 1)
public final class z6j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ u6j b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6j(u6j u6jVar, v1b<? super z6j> v1bVar) {
        super(2, v1bVar);
        this.b = u6jVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new z6j(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((z6j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r5.b.m1(r5) == r0) goto L15;
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
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            defpackage.uj50.b(r6)
            goto L35
        L10:
            r5 = 0
            java.lang.String r5 = com.sportybet.feature.payment.impl.tradeadditional.domain.model.Phv.dqvOSm.ttsFosYowgN
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L18:
            defpackage.uj50.b(r6)
            goto L2a
        L1c:
            defpackage.uj50.b(r6)
            r5.a = r3
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r6 = defpackage.hkd.b(r3, r5)
            if (r6 != r0) goto L2a
            goto L34
        L2a:
            r5.a = r2
            u6j r6 = r5.b
            java.lang.Object r5 = r6.m1(r5)
            if (r5 != r0) goto L35
        L34:
            return r0
        L35:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z6j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
