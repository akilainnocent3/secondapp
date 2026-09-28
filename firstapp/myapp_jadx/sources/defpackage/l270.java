package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballCellHandlerImpl$init$11", f = "ScheduledFootballCellHandlerImpl.kt", l = {139, 143}, m = "invokeSuspend", v = 2)
public final class l270 extends tje0 implements Function2<Pair<? extends ni70, ? extends Long>, v1b<? super Unit>, Object> {
    public ni70 a;
    public long b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ a270 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l270(v1b v1bVar, a270 a270Var) {
        super(2, v1bVar);
        this.e = a270Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        l270 l270Var = new l270(v1bVar, this.e);
        l270Var.d = obj;
        return l270Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends ni70, ? extends Long> pair, v1b<? super Unit> v1bVar) {
        return ((l270) create(pair, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r3.b(r0, r7, r9) == r1) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.d
            kotlin.Pair r0 = (kotlin.Pair) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r9.c
            a270 r3 = r9.e
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L25
            if (r2 == r5) goto L1d
            if (r2 != r4) goto L17
            defpackage.uj50.b(r10)
            goto L53
        L17:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r6
        L1d:
            long r7 = r9.b
            ni70 r0 = r9.a
            defpackage.uj50.b(r10)
            goto L44
        L25:
            defpackage.uj50.b(r10)
            A r10 = r0.a
            ni70 r10 = (defpackage.ni70) r10
            B r0 = r0.b
            java.lang.Number r0 = (java.lang.Number) r0
            long r7 = r0.longValue()
            r9.d = r6
            r9.a = r10
            r9.b = r7
            r9.c = r5
            java.lang.Object r0 = r3.e(r10, r7, r9)
            if (r0 != r1) goto L43
            goto L52
        L43:
            r0 = r10
        L44:
            r9.d = r6
            r9.a = r6
            r9.b = r7
            r9.c = r4
            java.lang.Object r9 = r3.b(r0, r7, r9)
            if (r9 != r1) goto L53
        L52:
            return r1
        L53:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l270.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
