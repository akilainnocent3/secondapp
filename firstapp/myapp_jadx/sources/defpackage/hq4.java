package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.bonuscup.presentation.BonusCupViewModel$onBackClick$1", f = "BonusCupViewModel.kt", l = {89, 90}, m = "invokeSuspend", v = 1)
public final class hq4 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ qq4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq4(qq4 qq4Var, v1b<? super hq4> v1bVar) {
        super(2, v1bVar);
        this.b = qq4Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new hq4(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hq4) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (kotlin.Unit.a == r0) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r5.a
            qq4 r2 = r5.b
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L19
            if (r1 != r3) goto L12
            defpackage.uj50.b(r6)
            goto L39
        L12:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L19:
            defpackage.uj50.b(r6)
            goto L2b
        L1d:
            defpackage.uj50.b(r6)
            rrm r6 = r2.d
            r5.a = r4
            java.lang.Object r6 = r6.b(r5)
            if (r6 != r0) goto L2b
            goto L38
        L2b:
            wwd0 r6 = r2.H
            b4s r1 = defpackage.b4s.a
            r5.a = r3
            r6.setValue(r1)
            kotlin.Unit r5 = kotlin.Unit.a
            if (r5 != r0) goto L39
        L38:
            return r0
        L39:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
