package com.sportybet.feature.remixbet.presentation;

import defpackage.c0d;
import defpackage.tje0;
import defpackage.v1b;
import defpackage.v5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.remixbet.presentation.RemixBetViewModel$handleAction$2", f = "RemixBetViewModel.kt", l = {182, 190}, m = "invokeSuspend", v = 2)
public final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, a aVar, v1b<? super e> v1bVar) {
        super(2, v1bVar);
        this.b = gVar;
        this.c = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new e(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        if (r0 == r10) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0098, code lost:
    
        if (r0.emit(r1, r13) == r10) goto L25;
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
            int r0 = r13.a
            r11 = 2
            r1 = 1
            com.sportybet.feature.remixbet.presentation.g r12 = r13.b
            if (r0 == 0) goto L1f
            if (r0 == r1) goto L1a
            if (r0 != r11) goto L13
            defpackage.uj50.b(r14)
            goto L9b
        L13:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            r0 = 0
            return r0
        L1a:
            defpackage.uj50.b(r14)
            r0 = r14
            goto L79
        L1f:
            defpackage.uj50.b(r14)
            rdd0 r0 = r12.c
            on2 r2 = defpackage.on2.a
            k00 r3 = defpackage.k00.d
            k00[] r4 = new defpackage.k00[]{r3}
            r0.a(r2, r4)
            rdd0 r0 = r12.c
            boolean r2 = r12.H
            if (r2 == 0) goto L38
            cyy r2 = defpackage.cyy.a
            goto L3a
        L38:
            byy r2 = defpackage.byy.a
        L3a:
            k00[] r3 = new defpackage.k00[]{r3}
            r0.a(r2, r3)
            boolean r0 = r12.G
            if (r0 == 0) goto L85
            ku90<com.sporty.android.common.uievent.a> r0 = r12.y
            com.sporty.android.common_ui.uitext.StringUiText r2 = defpackage.vch0.a
            com.sporty.android.common_ui.uitext.ResourceUiText r2 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r3 = 2132019293(0x7f14085d, float:1.9676917E38)
            r2.<init>(r3)
            com.sporty.android.common_ui.uitext.ResourceUiText r3 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r4 = 2132019292(0x7f14085c, float:1.9676915E38)
            r3.<init>(r4)
            com.sporty.android.common_ui.uitext.ResourceUiText r4 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r5 = 2132018485(0x7f140535, float:1.9675278E38)
            r4.<init>(r5)
            com.sporty.android.common_ui.uitext.ResourceUiText r5 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r6 = 2132018232(0x7f140438, float:1.9674765E38)
            r5.<init>(r6)
            r13.a = r1
            r1 = r2
            r2 = 0
            r6 = 0
            r7 = 0
            r9 = 226(0xe2, float:3.17E-43)
            r8 = r13
            java.lang.Object r0 = com.sporty.android.common.uievent.b.f(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 != r10) goto L79
            goto L9a
        L79:
            com.sporty.android.common.uievent.AlertDialogCallbackType r0 = (com.sporty.android.common.uievent.AlertDialogCallbackType) r0
            r0.getClass()
            boolean r0 = r0 instanceof com.sporty.android.common.uievent.AlertDialogCallbackType.Positive
            if (r0 != 0) goto L85
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        L85:
            b390 r0 = r12.v
            com.sportybet.feature.remixbet.presentation.c$a r1 = new com.sportybet.feature.remixbet.presentation.c$a
            com.sportybet.feature.remixbet.presentation.a r2 = r13.c
            com.sportybet.feature.remixbet.presentation.a$a r2 = (com.sportybet.feature.remixbet.presentation.a.C0415a) r2
            java.lang.String r2 = r2.a
            r1.<init>(r2)
            r13.a = r11
            java.lang.Object r0 = r0.emit(r1, r13)
            if (r0 != r10) goto L9b
        L9a:
            return r10
        L9b:
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sportybet.feature.remixbet.presentation.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
