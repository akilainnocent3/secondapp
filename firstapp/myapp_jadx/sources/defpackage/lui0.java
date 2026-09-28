package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.wheelanddeal.sidepanel.WDSidePanelViewModel$handleEvent$1", f = "WDSidePanelViewModel.kt", l = {96, 96}, m = "invokeSuspend", v = 1)
public final class lui0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public mn20 a;
    public String b;
    public int c;
    public final /* synthetic */ mui0 d;
    public final /* synthetic */ cui0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lui0(mui0 mui0Var, cui0 cui0Var, v1b<? super lui0> v1bVar) {
        super(2, v1bVar);
        this.d = mui0Var;
        this.e = cui0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new lui0(this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((lui0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r5.a(r1, r7, r6) == r0) goto L15;
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
            int r1 = r6.c
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            defpackage.uj50.b(r7)
            goto L4e
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r2
        L17:
            java.lang.String r1 = r6.b
            mn20 r5 = r6.a
            defpackage.uj50.b(r7)
            goto L3a
        L1f:
            defpackage.uj50.b(r7)
            mui0 r7 = r6.d
            mn20 r5 = r7.c
            cui0 r7 = r6.e
            cui0$a r7 = (cui0.a) r7
            java.lang.String r1 = r7.a
            r6.a = r5
            r6.b = r1
            r6.c = r4
            r7 = 0
            java.lang.Object r7 = r5.b(r1, r7, r6)
            if (r7 != r0) goto L3a
            goto L4d
        L3a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r7 = r7 ^ r4
            r6.a = r2
            r6.b = r2
            r6.c = r3
            java.lang.Object r6 = r5.a(r1, r7, r6)
            if (r6 != r0) goto L4e
        L4d:
            return r0
        L4e:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lui0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
