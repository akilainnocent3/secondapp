package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListViewModel$onLoadMore$1", f = "TxListViewModel.kt", l = {309, 312}, m = "invokeSuspend", v = 2)
public final class v7h0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ o7h0 b;
    public final /* synthetic */ v8h0.f c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7h0(o7h0 o7h0Var, v8h0.f fVar, v1b<? super v7h0> v1bVar) {
        super(2, v1bVar);
        this.b = o7h0Var;
        this.c = fVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new v7h0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((v7h0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r5.C1(r10, r1, r9.c, r9) == r0) goto L15;
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
            r4 = 0
            o7h0 r5 = r9.b
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L13
            defpackage.uj50.b(r10)
            goto L63
        L13:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r4
        L19:
            defpackage.uj50.b(r10)
            goto L2b
        L1d:
            defpackage.uj50.b(r10)
            r9.a = r3
            r6 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r10 = defpackage.hkd.b(r6, r9)
            if (r10 != r0) goto L2b
            goto L62
        L2b:
            wwd0 r10 = r5.C
            java.lang.Object r10 = r10.getValue()
            b1h0 r10 = (defpackage.b1h0) r10
            kotlin.Pair r1 = new kotlin.Pair
            java.util.Date r3 = new java.util.Date
            java.util.Date r6 = r10.a
            long r6 = r6.getTime()
            r3.<init>(r6)
            java.util.Date r6 = new java.util.Date
            java.util.Date r10 = r10.b
            long r7 = r10.getTime()
            r6.<init>(r7)
            r1.<init>(r3, r6)
            wwd0 r10 = r5.A
            java.lang.Object r10 = r10.getValue()
            w0h0 r10 = (defpackage.w0h0) r10
            aqg0 r10 = r10.a
            r9.a = r2
            v8h0$f r2 = r9.c
            java.lang.Object r9 = r5.C1(r10, r1, r2, r9)
            if (r9 != r0) goto L63
        L62:
            return r0
        L63:
            r5.Q = r4
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v7h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
