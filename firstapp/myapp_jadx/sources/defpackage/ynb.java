package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crashInitiated.CrashInitiatedFragment$showFBGToast$1", f = "CrashInitiatedFragment.kt", l = {2719, 2730}, m = "invokeSuspend", v = 1)
public final class ynb extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ enb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ynb(enb enbVar, v1b<? super ynb> v1bVar) {
        super(2, v1bVar);
        this.b = enbVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ynb(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ynb) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if (defpackage.hkd.b(4000, r10) == r2) goto L34;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            enb r0 = r10.b
            ytw<java.lang.Boolean> r1 = r0.W
            y5b r2 = defpackage.y5b.a
            int r3 = r10.a
            r4 = 8
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L23
            if (r3 == r6) goto L1f
            if (r3 != r5) goto L18
            defpackage.uj50.b(r11)
            goto L86
        L18:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r10)
            r10 = 0
            return r10
        L1f:
            defpackage.uj50.b(r11)
            goto L31
        L23:
            defpackage.uj50.b(r11)
            r10.a = r6
            r8 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r11 = defpackage.hkd.b(r8, r10)
            if (r11 != r2) goto L31
            goto L85
        L31:
            com.sportygames.commons.models.PromotionGiftsResponse r11 = r0.g0
            if (r11 == 0) goto L40
            java.util.List r11 = r11.getEntityList()
            if (r11 == 0) goto L40
            int r11 = r11.size()
            goto L41
        L40:
            r11 = r7
        L41:
            if (r11 <= 0) goto Lac
            r11 = r1
            x5a0 r11 = (defpackage.x5a0) r11
            java.lang.Object r11 = r11.getValue()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto Lac
            hvi r11 = r0.a
            if (r11 == 0) goto Lac
            com.sportygames.commons.components.GiftToast r11 = r11.y
            int r11 = r11.getVisibility()
            if (r11 != r4) goto Lac
            hvi r11 = r0.a
            if (r11 == 0) goto L67
            com.sportygames.commons.components.GiftToast r11 = r11.y
            r11.setVisibility(r7)
        L67:
            hvi r11 = r0.a
            if (r11 == 0) goto L7b
            com.sportygames.commons.components.GiftToast r11 = r11.y
            android.content.Context r3 = r0.getContext()
            r6 = 2130772017(0x7f010031, float:1.714714E38)
            android.view.animation.Animation r3 = android.view.animation.AnimationUtils.loadAnimation(r3, r6)
            r11.startAnimation(r3)
        L7b:
            r10.a = r5
            r5 = 4000(0xfa0, double:1.9763E-320)
            java.lang.Object r10 = defpackage.hkd.b(r5, r10)
            if (r10 != r2) goto L86
        L85:
            return r2
        L86:
            androidx.fragment.app.e r10 = r0.getActivity()
            if (r10 == 0) goto Lac
            hvi r10 = r0.a
            if (r10 == 0) goto L95
            com.sportygames.commons.components.GiftToast r10 = r10.y
            r10.setVisibility(r4)
        L95:
            hvi r10 = r0.a
            if (r10 == 0) goto L9e
            com.sportygames.commons.components.GiftToast r10 = r10.y
            r10.setClickable(r7)
        L9e:
            ssw<java.lang.Boolean> r10 = defpackage.jbh.b
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r10.j(r11)
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            x5a0 r1 = (defpackage.x5a0) r1
            r1.setValue(r10)
        Lac:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ynb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
