package defpackage;

import com.sporty.android.common.uievent.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.uiprocess.RealtimeInsufficientFundsUiProcess$invoke$onPrimaryActionClicked$1", f = "RealtimeInsufficientFundsUiProcess.kt", l = {60, 63}, m = "invokeSuspend", v = 2)
public final class tb40 extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ vb40 c;
    public final /* synthetic */ vtw<a> d;
    public final /* synthetic */ a2g0 e;
    public final /* synthetic */ vtw<spg0> f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb40(boolean z, vb40 vb40Var, vtw<a> vtwVar, a2g0 a2g0Var, vtw<spg0> vtwVar2, v1b<? super tb40> v1bVar) {
        super(1, v1bVar);
        this.b = z;
        this.c = vb40Var;
        this.d = vtwVar;
        this.e = a2g0Var;
        this.f = vtwVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new tb40(this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((tb40) create(v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (defpackage.gi8.a(r7, r10, r5, r9) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        if (defpackage.gi8.b(r7, r10, r5, r9) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        return r0;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r9.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 == r3) goto L14
            if (r1 != r2) goto Ld
            goto L14
        Ld:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            r9 = 0
            return r9
        L14:
            defpackage.uj50.b(r10)
            goto L63
        L18:
            defpackage.uj50.b(r10)
            vb40 r10 = r9.c
            rdd0 r10 = r10.a
            java.lang.String r1 = "primary"
            java.lang.String r4 = "real_time_insufficient_fund"
            vtw<spg0> r5 = r9.f
            a2g0 r6 = r9.e
            vtw<com.sporty.android.common.uievent.a> r7 = r9.d
            boolean r8 = r9.b
            if (r8 == 0) goto L48
            jnd r2 = new jnd
            java.lang.String r8 = "common_functions__dial_ussd_to_top_up"
            r2.<init>(r4, r1, r8)
            k00 r1 = defpackage.k00.d
            k00[] r1 = new defpackage.k00[]{r1}
            r10.a(r2, r1)
            com.sporty.android.common_ui.uitext.UiText r10 = r6.a
            r9.a = r3
            java.lang.Object r9 = defpackage.gi8.a(r7, r10, r5, r9)
            if (r9 != r0) goto L63
            goto L62
        L48:
            jnd r3 = new jnd
            java.lang.String r8 = "common_functions__check_balance_with_network"
            r3.<init>(r4, r1, r8)
            k00 r1 = defpackage.k00.d
            k00[] r1 = new defpackage.k00[]{r1}
            r10.a(r3, r1)
            com.sporty.android.common_ui.uitext.UiText r10 = r6.b
            r9.a = r2
            java.lang.Object r9 = defpackage.gi8.b(r7, r10, r5, r9)
            if (r9 != r0) goto L63
        L62:
            return r0
        L63:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tb40.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
