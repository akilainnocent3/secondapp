package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel$bet$2", f = "SpeedyBingoViewModel.kt", l = {578, 582, 583}, m = "invokeSuspend", v = 1)
public final class wua0 extends tje0 implements Function2<mk50<? extends ia60>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ uua0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wua0(uua0 uua0Var, v1b<? super wua0> v1bVar) {
        super(2, v1bVar);
        this.c = uua0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        wua0 wua0Var = new wua0(this.c, v1bVar);
        wua0Var.b = obj;
        return wua0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(mk50<? extends ia60> mk50Var, v1b<? super Unit> v1bVar) {
        return ((wua0) create(mk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r4.z1(r9, r8) == r1) goto L25;
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
            mk50 r0 = (defpackage.mk50) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r8.a
            r3 = 0
            uua0 r4 = r8.c
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L29
            if (r2 == r7) goto L25
            if (r2 == r6) goto L21
            if (r2 == r5) goto L1c
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r3
        L1c:
            zrp r8 = defpackage.l80.a(r9)
            throw r8
        L21:
            defpackage.uj50.b(r9)
            goto L5a
        L25:
            defpackage.uj50.b(r9)
            goto L3a
        L29:
            defpackage.uj50.b(r9)
            wwd0 r9 = r4.G
            r8.b = r0
            r8.a = r7
            r9.setValue(r0)
            kotlin.Unit r9 = kotlin.Unit.a
            if (r9 != r1) goto L3a
            goto L59
        L3a:
            mk50$b r9 = mk50.b.a
            boolean r9 = kotlin.jvm.internal.Intrinsics.g(r0, r9)
            if (r9 != 0) goto L66
            boolean r9 = r0 instanceof mk50.c
            if (r9 == 0) goto L47
            goto L66
        L47:
            boolean r9 = r0 instanceof mk50.a
            if (r9 == 0) goto L62
            mk50$a r0 = (mk50.a) r0
            java.lang.Throwable r9 = r0.a
            r8.b = r3
            r8.a = r6
            java.lang.Object r9 = r4.z1(r9, r8)
            if (r9 != r1) goto L5a
        L59:
            return r1
        L5a:
            r8.b = r3
            r8.a = r5
            defpackage.hkd.a(r8)
            return r1
        L62:
            defpackage.uhc.a()
            return r3
        L66:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wua0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
