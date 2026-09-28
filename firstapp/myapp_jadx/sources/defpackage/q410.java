package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.pingpong.views.PingPongFragment$observeException$1$3$1$4$1", f = "PingPongFragment.kt", l = {6050, 6052}, m = "invokeSuspend", v = 1)
public final class q410 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ m410 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q410(m410 m410Var, v1b<? super q410> v1bVar) {
        super(2, v1bVar);
        this.b = m410Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new q410(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((q410) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        if (defpackage.hkd.b(1500, r6) == r0) goto L18;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r6.a
            m410 r2 = r6.b
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L19
            if (r1 != r3) goto L12
            defpackage.uj50.b(r7)
            goto L41
        L12:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            r6 = 0
            return r6
        L19:
            defpackage.uj50.b(r7)
            goto L2b
        L1d:
            defpackage.uj50.b(r7)
            r6.a = r4
            r4 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r7 = defpackage.hkd.b(r4, r6)
            if (r7 != r0) goto L2b
            goto L40
        L2b:
            B extends g6i0 r7 = r2.b
            ixi r7 = (defpackage.ixi) r7
            if (r7 == 0) goto L36
            com.sportygames.sportyherov2.components.SHToastContainer r7 = r7.X
            r7.setFadeOut()
        L36:
            r6.a = r3
            r3 = 1500(0x5dc, double:7.41E-321)
            java.lang.Object r6 = defpackage.hkd.b(r3, r6)
            if (r6 != r0) goto L41
        L40:
            return r0
        L41:
            B extends g6i0 r6 = r2.b
            ixi r6 = (defpackage.ixi) r6
            if (r6 == 0) goto L4e
            com.sportygames.sportyherov2.components.SHToastContainer r6 = r6.X
            r7 = 8
            r6.setVisibility(r7)
        L4e:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q410.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
