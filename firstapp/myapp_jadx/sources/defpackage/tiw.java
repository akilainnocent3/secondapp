package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.multimaker.presentation.viewmodel.MultiMakerViewModel$changeTimeRange$1", f = "MultiMakerViewModel.kt", l = {567, 568, 569}, m = "invokeSuspend", v = 2)
public final class tiw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ tjw b;
    public final /* synthetic */ xvf0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tiw(tjw tjwVar, xvf0 xvf0Var, v1b<? super tiw> v1bVar) {
        super(2, v1bVar);
        this.b = tjwVar;
        this.c = xvf0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new tiw(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((tiw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (r9.join(r8) == r0) goto L20;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r8.a
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 3
            tjw r7 = r8.b
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r6) goto L17
            defpackage.uj50.b(r9)
            goto L66
        L17:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r2
        L1d:
            defpackage.uj50.b(r9)
            goto L59
        L21:
            defpackage.uj50.b(r9)
            goto L4c
        L25:
            defpackage.uj50.b(r9)
            wwd0 r9 = r7.V
            java.lang.Object r9 = r9.getValue()
            java.lang.String r9 = (java.lang.String) r9
            r7.K1(r9)
            wwd0 r9 = r7.Z
            r9.getClass()
            xvf0 r1 = r8.c
            r9.k(r2, r1)
            qhw r9 = defpackage.qhw.d
            jvd0 r9 = r7.G1(r9)
            r8.a = r4
            java.lang.Object r9 = r9.join(r8)
            if (r9 != r0) goto L4c
            goto L65
        L4c:
            jvd0 r9 = r7.H1(r5)
            r8.a = r3
            java.lang.Object r9 = r9.join(r8)
            if (r9 != r0) goto L59
            goto L65
        L59:
            jvd0 r9 = defpackage.tjw.I1(r7, r5, r6)
            r8.a = r6
            java.lang.Object r8 = r9.join(r8)
            if (r8 != r0) goto L66
        L65:
            return r0
        L66:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tiw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
