package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$requestBulkDeleteMode$1", f = "RealBetHistoryViewModel.kt", l = {428, 430}, m = "invokeSuspend", v = 2)
public final class q740 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ d740 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q740(d740 d740Var, String str, v1b<? super q740> v1bVar) {
        super(2, v1bVar);
        this.b = d740Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new q740(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((q740) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r1.c(r7, r6) == r2) goto L21;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            d740 r0 = r6.b
            at2 r1 = r0.b
            y5b r2 = defpackage.y5b.a
            int r3 = r6.a
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L1f
            if (r3 == r5) goto L1b
            if (r3 != r4) goto L14
            defpackage.uj50.b(r7)
            goto L4c
        L14:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            r6 = 0
            return r6
        L1b:
            defpackage.uj50.b(r7)
            goto L3f
        L1f:
            defpackage.uj50.b(r7)
            wwd0 r7 = r0.K
            java.lang.Object r7 = r7.getValue()
            z2z r3 = defpackage.z2z.SETTLED
            if (r7 != r3) goto L4f
            k650 r7 = r0.c
            java.lang.String r3 = "enable_bulk_swipe_bet_delete"
            boolean r7 = r7.b(r3)
            if (r7 == 0) goto L4f
            r6.a = r5
            java.lang.Object r7 = r1.g(r5, r6)
            if (r7 != r2) goto L3f
            goto L4b
        L3f:
            java.lang.String r7 = r6.c
            if (r7 == 0) goto L4c
            r6.a = r4
            java.lang.Object r6 = r1.c(r7, r6)
            if (r6 != r2) goto L4c
        L4b:
            return r2
        L4c:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L4f:
            ku90<com.sporty.android.common.uievent.a> r0 = r0.B
            com.sporty.android.common_ui.uitext.StringUiText r6 = defpackage.vch0.a
            com.sporty.android.common_ui.uitext.ResourceUiText r1 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r6 = 2132017500(0x7f14015c, float:1.967328E38)
            r1.<init>(r6)
            r4 = 0
            r5 = 126(0x7e, float:1.77E-43)
            r2 = 0
            r3 = 0
            com.sporty.android.common.uievent.b.i(r0, r1, r2, r3, r4, r5)
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q740.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
