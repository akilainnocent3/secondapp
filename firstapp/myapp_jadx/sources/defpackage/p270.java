package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballCellHandlerImpl$init$7", f = "ScheduledFootballCellHandlerImpl.kt", l = {127, 128}, m = "invokeSuspend", v = 2)
public final class p270 extends tje0 implements Function2<ni70, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ a270 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p270(v1b v1bVar, a270 a270Var) {
        super(2, v1bVar);
        this.c = a270Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        p270 p270Var = new p270(v1bVar, this.c);
        p270Var.b = obj;
        return p270Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ni70 ni70Var, v1b<? super Unit> v1bVar) {
        return ((p270) create(ni70Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r4.d(r8, r7) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.b
            ni70 r0 = (defpackage.ni70) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r7.a
            r3 = 0
            a270 r4 = r7.c
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L21
            if (r2 == r6) goto L1d
            if (r2 != r5) goto L17
            defpackage.uj50.b(r8)
            goto L3e
        L17:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r3
        L1d:
            defpackage.uj50.b(r8)
            goto L31
        L21:
            defpackage.uj50.b(r8)
            java.util.Set<java.lang.String> r8 = r0.d
            r7.b = r0
            r7.a = r6
            java.lang.Object r8 = r4.g(r8, r7)
            if (r8 != r1) goto L31
            goto L3d
        L31:
            java.util.Set<java.lang.String> r8 = r0.e
            r7.b = r3
            r7.a = r5
            java.lang.Object r7 = r4.d(r8, r7)
            if (r7 != r1) goto L3e
        L3d:
            return r1
        L3e:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p270.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
