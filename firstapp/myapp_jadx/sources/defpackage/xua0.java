package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$fetch$1", f = "SpeedyBingoViewModel.kt", l = {558, 563, 566}, m = "invokeSuspend", v = 1)
public final class xua0 extends tje0 implements Function2<qe60, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ uua0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xua0(uua0 uua0Var, v1b<? super xua0> v1bVar) {
        super(2, v1bVar);
        this.c = uua0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xua0 xua0Var = new xua0(this.c, v1bVar);
        xua0Var.b = obj;
        return xua0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qe60 qe60Var, v1b<? super Unit> v1bVar) {
        return ((xua0) create(qe60Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (kotlin.Unit.a == r1) goto L27;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            qe60 r0 = (defpackage.qe60) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r8.a
            r3 = 0
            uua0 r4 = r8.c
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L24
            if (r2 == r7) goto L20
            if (r2 == r6) goto L20
            if (r2 != r5) goto L1a
            defpackage.uj50.b(r9)
            goto L62
        L1a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r3
        L20:
            defpackage.uj50.b(r9)
            goto L54
        L24:
            defpackage.uj50.b(r9)
            boolean r9 = r0 instanceof qe60.a
            if (r9 == 0) goto L3b
            r9 = r0
            qe60$a r9 = (qe60.a) r9
            java.lang.Throwable r9 = r9.a
            r8.b = r0
            r8.a = r7
            java.lang.Object r9 = r4.z1(r9, r8)
            if (r9 != r1) goto L54
            goto L61
        L3b:
            boolean r9 = r0 instanceof qe60.b
            if (r9 != 0) goto L54
            boolean r9 = r0 instanceof qe60.c
            if (r9 == 0) goto L50
            r8.b = r0
            r8.a = r6
            r6 = 300(0x12c, double:1.48E-321)
            java.lang.Object r9 = defpackage.hkd.b(r6, r8)
            if (r9 != r1) goto L54
            goto L61
        L50:
            defpackage.uhc.a()
            return r3
        L54:
            wwd0 r9 = r4.Q
            r8.b = r3
            r8.a = r5
            r9.setValue(r0)
            kotlin.Unit r8 = kotlin.Unit.a
            if (r8 != r1) goto L62
        L61:
            return r1
        L62:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xua0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
