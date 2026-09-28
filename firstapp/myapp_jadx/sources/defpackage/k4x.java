package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.notificationcenter.NCUseCase$clearDB$2", f = "NCUseCase.kt", l = {111, 112}, m = "invokeSuspend", v = 2)
public final class k4x extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ h4x b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4x(h4x h4xVar, v1b<? super k4x> v1bVar) {
        super(1, v1bVar);
        this.b = h4xVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new k4x(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((k4x) create(v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r6.a(r5) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            h4x r0 = r5.b
            com.sportybet.feature.notificationcenter.db.NCDatabase r0 = r0.c
            y5b r1 = defpackage.y5b.a
            int r2 = r5.a
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1f
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L14
            defpackage.uj50.b(r6)
            goto L3c
        L14:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L1b:
            defpackage.uj50.b(r6)
            goto L2f
        L1f:
            defpackage.uj50.b(r6)
            o2x r6 = r0.x()
            r5.a = r4
            java.lang.Object r6 = r6.a(r5)
            if (r6 != r1) goto L2f
            goto L3b
        L2f:
            v2x r6 = r0.y()
            r5.a = r3
            java.lang.Object r5 = r6.a(r5)
            if (r5 != r1) goto L3c
        L3b:
            return r1
        L3c:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k4x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
