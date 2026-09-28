package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.presentation.viewmodel.PiggyBashViewModel$onRoundFinished$1", f = "PiggyBashViewModel.kt", l = {550, 551, 552, 553}, m = "invokeSuspend", v = 1)
public final class my00 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ vx00 b;
    public final /* synthetic */ ap20 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my00(vx00 vx00Var, ap20 ap20Var, v1b<? super my00> v1bVar) {
        super(2, v1bVar);
        this.b = vx00Var;
        this.c = ap20Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new my00(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((my00) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r6.D1(r7.c, r7) == r0) goto L25;
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
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            vx00 r6 = r7.b
            if (r1 == 0) goto L2b
            if (r1 == r5) goto L27
            if (r1 == r4) goto L23
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L18
            defpackage.uj50.b(r8)
            goto L65
        L18:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            r7 = 0
            return r7
        L1f:
            defpackage.uj50.b(r8)
            goto L5a
        L23:
            defpackage.uj50.b(r8)
            goto L4c
        L27:
            defpackage.uj50.b(r8)
            goto L3e
        L2b:
            defpackage.uj50.b(r8)
            mtm r8 = r6.z
            r8.b()
            jum r8 = r6.c
            r7.a = r5
            kotlin.Unit r8 = r8.i()
            if (r8 != r0) goto L3e
            goto L64
        L3e:
            wwd0 r8 = r6.O
            nu00$h r1 = nu00.h.a
            r7.a = r4
            r8.setValue(r1)
            kotlin.Unit r8 = kotlin.Unit.a
            if (r8 != r0) goto L4c
            goto L64
        L4c:
            wwd0 r8 = r6.N
            sxs r1 = defpackage.sxs.a
            r7.a = r3
            r8.setValue(r1)
            kotlin.Unit r8 = kotlin.Unit.a
            if (r8 != r0) goto L5a
            goto L64
        L5a:
            r7.a = r2
            ap20 r8 = r7.c
            java.lang.Object r7 = r6.D1(r8, r7)
            if (r7 != r0) goto L65
        L64:
            return r0
        L65:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.my00.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
