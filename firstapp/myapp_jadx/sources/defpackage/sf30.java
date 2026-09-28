package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.OrderWithFailUpdate;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.QuickBetViewModel$proceedPlaceBetResponseWithBalanceInsufficient$1", f = "QuickBetViewModel.kt", l = {244, 262}, m = "invokeSuspend", v = 2)
public final class sf30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public Long a;
    public int b;
    public final /* synthetic */ BaseResponse<OrderWithFailUpdate> c;
    public final /* synthetic */ tf30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf30(BaseResponse<OrderWithFailUpdate> baseResponse, tf30 tf30Var, v1b<? super sf30> v1bVar) {
        super(2, v1bVar);
        this.c = baseResponse;
        this.d = tf30Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new sf30(this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((sf30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r3 == r10) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b1, code lost:
    
        if (r0 == r10) goto L33;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            y5b r10 = defpackage.y5b.a
            int r0 = r13.b
            r1 = 2
            r2 = 1
            tf30 r11 = r13.d
            r12 = 0
            if (r0 == 0) goto L22
            if (r0 == r2) goto L1b
            if (r0 != r1) goto L15
            defpackage.uj50.b(r14)
            r0 = r14
            goto Lb4
        L15:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            return r12
        L1b:
            java.lang.Long r0 = r13.a
            defpackage.uj50.b(r14)
            r3 = r14
            goto L4d
        L22:
            defpackage.uj50.b(r14)
            com.sporty.android.common.network.data.BaseResponse<com.sportybet.plugin.realsports.data.OrderWithFailUpdate> r0 = r13.c
            T r0 = r0.data
            com.sportybet.plugin.realsports.data.OrderWithFailUpdate r0 = (com.sportybet.plugin.realsports.data.OrderWithFailUpdate) r0
            if (r0 == 0) goto L30
            java.lang.Long r0 = r0.balance
            goto L31
        L30:
            r0 = r12
        L31:
            if (r0 == 0) goto L3a
            uy0 r3 = r11.e
            r3.d(r0)
            r3 = r12
            goto L4f
        L3a:
            uy0 r3 = r11.e
            pu0$c r4 = pu0.c.a
            lyh r3 = r3.h(r4)
            r13.a = r0
            r13.b = r2
            java.lang.Object r3 = defpackage.bm50.p(r3, r13)
            if (r3 != r10) goto L4d
            goto Lb3
        L4d:
            lk50 r3 = (defpackage.lk50) r3
        L4f:
            r4 = 2132018178(0x7f140402, float:1.9674655E38)
            if (r0 != 0) goto L62
            boolean r0 = r3 instanceof lk50.c
            if (r0 == 0) goto L59
            goto L62
        L59:
            com.sporty.android.common_ui.uitext.StringUiText r0 = defpackage.vch0.a
            com.sporty.android.common_ui.uitext.ResourceUiText r0 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r0.<init>(r4)
        L60:
            r3 = r0
            goto L7f
        L62:
            it90 r0 = r11.d
            cvd0 r0 = r0.a()
            boolean r3 = r0 instanceof cvd0.c
            if (r3 == 0) goto L77
            psm r3 = r11.E
            java.lang.String r3 = r3.f()
            com.sporty.android.common_ui.uitext.UiText r0 = defpackage.fvd0.a(r0, r2, r3)
            goto L60
        L77:
            com.sporty.android.common_ui.uitext.StringUiText r0 = defpackage.vch0.a
            com.sporty.android.common_ui.uitext.ResourceUiText r0 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r0.<init>(r4)
            goto L60
        L7f:
            ku90<com.sporty.android.common.uievent.a> r0 = r11.Q
            com.sporty.android.common_ui.uitext.StringUiText r2 = defpackage.vch0.a
            com.sporty.android.common_ui.uitext.ResourceUiText r2 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r4 = 2132018212(0x7f140424, float:1.9674724E38)
            r2.<init>(r4)
            com.sporty.android.common_ui.uitext.ResourceUiText r4 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r5 = 2132018292(0x7f140474, float:1.9674887E38)
            r4.<init>(r5)
            com.sporty.android.common_ui.uitext.ResourceUiText r5 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r6 = 2132018393(0x7f1404d9, float:1.9675091E38)
            r5.<init>(r6)
            java.lang.Integer r6 = new java.lang.Integer
            r7 = 2132083938(0x7f1504e2, float:1.9808032E38)
            r6.<init>(r7)
            r13.a = r12
            r13.b = r1
            r1 = r2
            r2 = 0
            r7 = 0
            r9 = 162(0xa2, float:2.27E-43)
            r8 = r13
            java.lang.Object r0 = com.sporty.android.common.uievent.b.f(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 != r10) goto Lb4
        Lb3:
            return r10
        Lb4:
            com.sporty.android.common.uievent.AlertDialogCallbackType r0 = (com.sporty.android.common.uievent.AlertDialogCallbackType) r0
            r0.getClass()
            boolean r0 = r0 instanceof com.sporty.android.common.uievent.AlertDialogCallbackType.Positive
            if (r0 == 0) goto Lc2
            j800 r0 = r11.K
            r0.b(r12)
        Lc2:
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sf30.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
