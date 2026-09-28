package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.presentation.viewmodel.PiggyBashViewModel$backToLobby$1", f = "PiggyBashViewModel.kt", l = {470, 471, 472}, m = "invokeSuspend", v = 1)
public final class ux00 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ vx00 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux00(vx00 vx00Var, v1b<? super ux00> v1bVar) {
        super(2, v1bVar);
        this.b = vx00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ux00(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ux00) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r5.E1(r6) == r0) goto L20;
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
            r2 = 3
            r3 = 2
            r4 = 1
            vx00 r5 = r6.b
            if (r1 == 0) goto L24
            if (r1 == r4) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L15
            defpackage.uj50.b(r7)
            goto L49
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            r6 = 0
            return r6
        L1c:
            defpackage.uj50.b(r7)
            goto L40
        L20:
            defpackage.uj50.b(r7)
            goto L32
        L24:
            defpackage.uj50.b(r7)
            jum r7 = r5.c
            r6.a = r4
            kotlin.Unit r7 = r7.i()
            if (r7 != r0) goto L32
            goto L48
        L32:
            wwd0 r7 = r5.N
            sxs r1 = defpackage.sxs.a
            r6.a = r3
            r7.setValue(r1)
            kotlin.Unit r7 = kotlin.Unit.a
            if (r7 != r0) goto L40
            goto L48
        L40:
            r6.a = r2
            java.lang.Object r6 = r5.E1(r6)
            if (r6 != r0) goto L49
        L48:
            return r0
        L49:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ux00.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
