package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.playtimecontrol.confirmation.viewmodel.EditPlayTimeConfirmationViewModel$onContinueClicked$1", f = "EditPlayTimeConfirmationViewModel.kt", l = {53, 59}, m = "invokeSuspend", v = 2)
public final class nrf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ mrf b;
    public final /* synthetic */ irf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrf(mrf mrfVar, irf irfVar, v1b<? super nrf> v1bVar) {
        super(2, v1bVar);
        this.b = mrfVar;
        this.c = irfVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new nrf(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((nrf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r9 == r1) goto L23;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            irf r0 = r8.c
            int r0 = r0.b
            y5b r1 = defpackage.y5b.a
            int r2 = r8.a
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L1f
            if (r2 == r5) goto L1b
            if (r2 != r4) goto L15
            defpackage.uj50.b(r9)
            goto L61
        L15:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r3
        L1b:
            defpackage.uj50.b(r9)
            goto L4c
        L1f:
            defpackage.uj50.b(r9)
            mrf r9 = r8.b
            jrf r2 = r9.e
            jrf r6 = r9.e
            r2.getClass()
            r2 = 0
            java.lang.String r2 = defpackage.jrf.b(r2)
            cr10 r7 = r9.y
            if (r7 == 0) goto L66
            int r7 = r7.ordinal()
            if (r7 == 0) goto L53
            if (r7 != r5) goto L4f
            r6.getClass()
            java.lang.String r0 = defpackage.jrf.b(r0)
            r8.a = r5
            java.lang.Object r9 = r9.A1(r2, r0, r8)
            if (r9 != r1) goto L4c
            goto L60
        L4c:
            kotlin.Unit r9 = (kotlin.Unit) r9
            goto L63
        L4f:
            defpackage.uhc.a()
            return r3
        L53:
            r6.getClass()
            int r0 = r0 * 1440
            r8.a = r4
            java.lang.Object r9 = r9.z1(r0, r8)
            if (r9 != r1) goto L61
        L60:
            return r1
        L61:
            kotlin.Unit r9 = (kotlin.Unit) r9
        L63:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L66:
            java.lang.String r8 = "typeSelected"
            kotlin.jvm.internal.Intrinsics.n(r8)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nrf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
