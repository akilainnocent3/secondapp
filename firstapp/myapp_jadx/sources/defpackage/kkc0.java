package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legendsrace.handler.SportyLegendsSettlementAnimationModeStateHandlerImpl$initialAnimationModeStateHandler$1", f = "SportyLegendsSettlementAnimationModeStateHandlerImpl.kt", l = {54, 53}, m = "invokeSuspend", v = 2)
public final class kkc0 extends tje0 implements Function2<myh<? super List<? extends ikc0>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ jkc0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkc0(jkc0 jkc0Var, v1b<? super kkc0> v1bVar) {
        super(2, v1bVar);
        this.d = jkc0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        kkc0 kkc0Var = new kkc0(this.d, v1bVar);
        kkc0Var.c = obj;
        return kkc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super List<? extends ikc0>> myhVar, v1b<? super Unit> v1bVar) {
        return ((kkc0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L21;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r6.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L25
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r7)
            goto L53
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L1b:
            myh r0 = r6.a
            defpackage.uj50.b(r7)
            zi50 r7 = (defpackage.zi50) r7
            java.lang.Object r7 = r7.a
            goto L39
        L25:
            defpackage.uj50.b(r7)
            jkc0 r7 = r6.d
            mgc0 r7 = r7.a
            r6.c = r5
            r6.a = r0
            r6.b = r4
            java.io.Serializable r7 = r7.d(r6)
            if (r7 != r1) goto L39
            goto L52
        L39:
            zi50$a r2 = defpackage.zi50.b
            boolean r2 = r7 instanceof zi50.b
            if (r2 == 0) goto L40
            r7 = r5
        L40:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L46
            m2g r7 = defpackage.m2g.a
        L46:
            r6.c = r5
            r6.a = r5
            r6.b = r3
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r1) goto L53
        L52:
            return r1
        L53:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kkc0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
