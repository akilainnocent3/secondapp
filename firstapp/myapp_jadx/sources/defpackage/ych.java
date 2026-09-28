package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.presentation.viewmodel.FeaturedCodesViewModel$toggleRecommendedCodeExpanded$1", f = "FeaturedCodesViewModel.kt", l = {306, 309}, m = "invokeSuspend", v = 2)
public final class ych extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ tch b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ych(v1b v1bVar, tch tchVar) {
        super(2, v1bVar);
        this.b = tchVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ych(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ych) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r7.join(r6) == r0) goto L20;
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
            r2 = 2
            r3 = 1
            tch r4 = r6.b
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L12
            defpackage.uj50.b(r7)
            goto L58
        L12:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            r6 = 0
            return r6
        L19:
            defpackage.uj50.b(r7)
            goto L2b
        L1d:
            defpackage.uj50.b(r7)
            s05 r7 = r4.d
            r6.a = r3
            java.lang.Object r7 = r7.i(r6)
            if (r7 != r0) goto L2b
            goto L57
        L2b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L58
            wwd0 r7 = r4.W
        L35:
            java.lang.Object r1 = r7.getValue()
            r3 = r1
            java.lang.Number r3 = (java.lang.Number) r3
            r3.intValue()
            java.lang.Integer r3 = new java.lang.Integer
            r5 = 0
            r3.<init>(r5)
            boolean r1 = r7.g(r1, r3)
            if (r1 == 0) goto L35
            jvd0 r7 = r4.x1()
            r6.a = r2
            java.lang.Object r6 = r7.join(r6)
            if (r6 != r0) goto L58
        L57:
            return r0
        L58:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ych.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
