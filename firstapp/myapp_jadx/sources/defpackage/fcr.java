package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNSharedPlaceBetViewModel$fetchData$1", f = "LNSharedPlaceBetViewModel.kt", l = {47, 48}, m = "invokeSuspend", v = 2)
public final class fcr extends tje0 implements Function2<lk50<? extends qxp>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gcr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcr(gcr gcrVar, v1b<? super fcr> v1bVar) {
        super(2, v1bVar);
        this.c = gcrVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        fcr fcrVar = new fcr(this.c, v1bVar);
        fcrVar.b = obj;
        return fcrVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends qxp> lk50Var, v1b<? super Unit> v1bVar) {
        return ((fcr) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (kotlin.Unit.a == r1) goto L19;
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
            lk50 r0 = (defpackage.lk50) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r7.a
            r3 = 0
            gcr r4 = r7.c
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L21
            if (r2 == r6) goto L1d
            if (r2 != r5) goto L17
            defpackage.uj50.b(r8)
            goto L4c
        L17:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r3
        L1d:
            defpackage.uj50.b(r8)
            goto L32
        L21:
            defpackage.uj50.b(r8)
            wwd0 r8 = r4.y
            r7.b = r0
            r7.a = r6
            r8.setValue(r0)
            kotlin.Unit r8 = kotlin.Unit.a
            if (r8 != r1) goto L32
            goto L4b
        L32:
            wwd0 r8 = r4.z
            java.lang.Object r0 = defpackage.bm50.i(r0)
            qxp r0 = (defpackage.qxp) r0
            if (r0 == 0) goto L3f
            dvq r0 = r0.j
            goto L40
        L3f:
            r0 = r3
        L40:
            r7.b = r3
            r7.a = r5
            r8.setValue(r0)
            kotlin.Unit r7 = kotlin.Unit.a
            if (r7 != r1) goto L4c
        L4b:
            return r1
        L4c:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcr.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
