package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.featurematch.presentation.quickbet.LNFeatureMatchQuickBetViewModel$bet$2", f = "LNFeatureMatchQuickBetViewModel.kt", l = {333, 334, 335}, m = "invokeSuspend", v = 2)
public final class naq extends tje0 implements gaj<myh<? super lk50<? extends u2q>>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ uaq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public naq(uaq uaqVar, v1b<? super naq> v1bVar) {
        super(3, v1bVar);
        this.b = uaqVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super lk50<? extends u2q>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        return new naq(this.b, v1bVar).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (kotlin.Unit.a == r0) goto L20;
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
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            uaq r6 = r7.b
            if (r1 == 0) goto L24
            if (r1 == r5) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L16
            defpackage.uj50.b(r8)
            goto L57
        L16:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r2
        L1c:
            defpackage.uj50.b(r8)
            goto L46
        L20:
            defpackage.uj50.b(r8)
            goto L38
        L24:
            defpackage.uj50.b(r8)
            wwd0 r8 = r6.J
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r7.a = r5
            r8.getClass()
            r8.k(r2, r1)
            kotlin.Unit r8 = kotlin.Unit.a
            if (r8 != r0) goto L38
            goto L56
        L38:
            wwd0 r8 = r6.H
            t2q$c r1 = t2q.c.a
            r7.a = r4
            r8.setValue(r1)
            kotlin.Unit r8 = kotlin.Unit.a
            if (r8 != r0) goto L46
            goto L56
        L46:
            wwd0 r8 = r6.I
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.a = r3
            r8.getClass()
            r8.k(r2, r1)
            kotlin.Unit r7 = kotlin.Unit.a
            if (r7 != r0) goto L57
        L56:
            return r0
        L57:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.naq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
