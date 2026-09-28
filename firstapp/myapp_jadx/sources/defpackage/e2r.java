package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$8", f = "LNPlaceBetViewModel.kt", l = {693, 693}, m = "invokeSuspend", v = 2)
public final class e2r extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public f2r a;
    public int b;
    public final /* synthetic */ f2r c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2r(v1b v1bVar, f2r f2rVar) {
        super(2, v1bVar);
        this.c = f2rVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new e2r(v1bVar, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((e2r) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (kotlin.Unit.a == r0) goto L15;
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
            int r1 = r5.b
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            defpackage.uj50.b(r6)
            goto L4d
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            return r2
        L17:
            f2r r1 = r5.a
            defpackage.uj50.b(r6)
            goto L33
        L1d:
            defpackage.uj50.b(r6)
            f2r r1 = r5.c
            m9k r6 = r1.v
            jte r6 = r6.b()
            r5.a = r1
            r5.b = r4
            java.lang.Object r6 = defpackage.s0i.a(r6, r5)
            if (r6 != r0) goto L33
            goto L4c
        L33:
            cvq r6 = (defpackage.cvq) r6
            java.math.BigDecimal r6 = r6.a
            r5.a = r2
            r5.b = r3
            wwd0 r5 = r1.L
            r1 = 0
            java.lang.String r6 = defpackage.ukd0.a(r3, r6, r1, r1)
            r5.getClass()
            r5.k(r2, r6)
            kotlin.Unit r5 = kotlin.Unit.a
            if (r5 != r0) goto L4d
        L4c:
            return r0
        L4d:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e2r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
