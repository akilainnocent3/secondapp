package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.multifactorauth.MFAViewModel$fetchTwoFactorAuthInfo$1", f = "MFAViewModel.kt", l = {284, 288}, m = "invokeSuspend", v = 2)
public final class rcu extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ocu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rcu(ocu ocuVar, v1b<? super rcu> v1bVar) {
        super(2, v1bVar);
        this.b = ocuVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new rcu(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((rcu) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        if (r14.setTwoFactorAuthEnabled(r8, r13) == r2) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            ocu r0 = r13.b
            wwd0 r1 = r0.C
            y5b r2 = defpackage.y5b.a
            int r3 = r13.a
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L20
            if (r3 == r6) goto L1c
            if (r3 != r5) goto L16
            defpackage.uj50.b(r14)
            goto La2
        L16:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r13)
            return r4
        L1c:
            defpackage.uj50.b(r14)
            goto L2e
        L20:
            defpackage.uj50.b(r14)
            gcu r14 = r0.a
            r13.a = r6
            java.lang.Object r14 = r14.d(r13)
            if (r14 != r2) goto L2e
            goto L5f
        L2e:
            lk50 r14 = (defpackage.lk50) r14
            boolean r3 = r14 instanceof lk50.c
            if (r3 == 0) goto L60
            lk50$c r14 = (lk50.c) r14
            T r14 = r14.a
            com.sporty.android.core.model.patron.Get2FAInfoResponse r14 = (com.sporty.android.core.model.patron.Get2FAInfoResponse) r14
            boolean r8 = r14.getEnable()
        L3e:
            java.lang.Object r14 = r1.getValue()
            r6 = r14
            oaw r6 = (defpackage.oaw) r6
            r11 = 0
            r12 = 29
            r7 = 0
            r9 = 0
            r10 = 0
            oaw r3 = defpackage.oaw.a(r6, r7, r8, r9, r10, r11, r12)
            boolean r14 = r1.g(r14, r3)
            if (r14 == 0) goto L3e
            mgb0 r14 = r0.c
            r13.a = r5
            java.lang.Object r13 = r14.setTwoFactorAuthEnabled(r8, r13)
            if (r13 != r2) goto La2
        L5f:
            return r2
        L60:
            r14.getClass()
            boolean r13 = r14 instanceof lk50.a
            if (r13 == 0) goto L72
            lk50$a r14 = (lk50.a) r14
            java.lang.Throwable r13 = r14.a
            boolean r14 = r13 instanceof defpackage.fk50
            if (r14 == 0) goto L72
            r4 = r13
            fk50 r4 = (defpackage.fk50) r4
        L72:
            if (r4 == 0) goto L7a
            com.sporty.android.common_ui.uitext.UiText r13 = r4.getText()
            if (r13 != 0) goto L7c
        L7a:
            com.sporty.android.common_ui.uitext.ResourceUiText r13 = defpackage.vch0.b
        L7c:
            java.lang.Object r14 = r1.getValue()
            r2 = r14
            oaw r2 = (defpackage.oaw) r2
            o9w$a r7 = new o9w$a
            com.sporty.android.common_ui.uitext.StringUiText r0 = defpackage.vch0.a
            com.sporty.android.common_ui.uitext.ResourceUiText r0 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r3 = 2132018321(0x7f140491, float:1.9674945E38)
            r0.<init>(r3)
            r7.<init>(r0, r13)
            r8 = 15
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            oaw r0 = defpackage.oaw.a(r2, r3, r4, r5, r6, r7, r8)
            boolean r14 = r1.g(r14, r0)
            if (r14 == 0) goto L7c
        La2:
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rcu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
