package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$exitBulkDeleteMode$1", f = "RealBetHistoryViewModel.kt", l = {353, 358}, m = "invokeSuspend", v = 2)
public final class j740 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ d740 b;
    public final /* synthetic */ Function1<Boolean, Unit> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j740(d740 d740Var, Function1<? super Boolean, Unit> function1, v1b<? super j740> v1bVar) {
        super(2, v1bVar);
        this.b = d740Var;
        this.c = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new j740(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((j740) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r8 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r8.g(false, r7) == r0) goto L29;
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
            r2 = 0
            r3 = 2
            r4 = 1
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r5 = r7.c
            d740 r6 = r7.b
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L15
            defpackage.uj50.b(r8)
            goto L73
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r2
        L1b:
            defpackage.uj50.b(r8)
            goto L55
        L1f:
            defpackage.uj50.b(r8)
            v340 r8 = r6.G
            uwd0<T> r8 = r8.a
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L3c
            if (r5 == 0) goto L39
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r5.invoke(r7)
        L39:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L3c:
            v340 r8 = r6.H
            uwd0<T> r8 = r8.a
            java.lang.Object r8 = r8.getValue()
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L67
            r7.a = r4
            java.lang.Object r8 = r6.z1(r7)
            if (r8 != r0) goto L55
            goto L72
        L55:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L67
            if (r5 == 0) goto L64
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r5.invoke(r7)
        L64:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L67:
            at2 r8 = r6.b
            r7.a = r3
            r1 = 0
            java.lang.Object r7 = r8.g(r1, r7)
            if (r7 != r0) goto L73
        L72:
            return r0
        L73:
            wwd0 r7 = r6.M
            bbj0 r8 = defpackage.bbj0.a
            r7.getClass()
            r7.k(r2, r8)
            if (r5 == 0) goto L84
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r5.invoke(r7)
        L84:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j740.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
