package com.sportybet.feature.remixbet.presentation;

import com.sporty.android.core.model.remixbet.RemixBetResponse;
import defpackage.c0d;
import defpackage.tje0;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.wwd0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.remixbet.presentation.RemixBetViewModel$loadData$2", f = "RemixBetViewModel.kt", l = {91, 97}, m = "invokeSuspend", v = 2)
public final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public wwd0 a;
    public int b;
    public final /* synthetic */ g c;
    public final /* synthetic */ Function1<v1b<? super RemixBetResponse>, Object> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(g gVar, Function1<? super v1b<? super RemixBetResponse>, ? extends Object> function1, v1b<? super f> v1bVar) {
        super(2, v1bVar);
        this.c = gVar;
        this.d = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new f(this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r10 == r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (r10 == r2) goto L24;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            com.sportybet.feature.remixbet.presentation.g r0 = r9.c
            wwd0 r1 = r0.f
            y5b r2 = defpackage.y5b.a
            int r3 = r9.b
            r4 = 2132017564(0x7f14019c, float:1.967341E38)
            r5 = 0
            r6 = 0
            r7 = 2
            r8 = 1
            if (r3 == 0) goto L25
            if (r3 == r8) goto L1f
            if (r3 != r7) goto L19
            defpackage.uj50.b(r10)     // Catch: java.lang.Exception -> L91
            goto L65
        L19:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r5
        L1f:
            wwd0 r3 = r9.a
            defpackage.uj50.b(r10)
            goto L40
        L25:
            defpackage.uj50.b(r10)
            wwd0 r3 = r0.A
            java.lang.Boolean r10 = r0.I
            if (r10 == 0) goto L33
            boolean r8 = r10.booleanValue()
            goto L4a
        L33:
            x450 r10 = r0.d
            r9.a = r3
            r9.b = r8
            java.lang.Object r10 = r10.a(r9)
            if (r10 != r2) goto L40
            goto L64
        L40:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L49
            goto L4a
        L49:
            r8 = r6
        L4a:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r8)
            r3.setValue(r10)
            com.sportybet.feature.remixbet.presentation.b$b r10 = com.sportybet.feature.remixbet.presentation.b.C0416b.a
            r1.setValue(r10)
            r0.D = r6
            kotlin.jvm.functions.Function1<v1b<? super com.sporty.android.core.model.remixbet.RemixBetResponse>, java.lang.Object> r10 = r9.d     // Catch: java.lang.Exception -> L91
            r9.a = r5     // Catch: java.lang.Exception -> L91
            r9.b = r7     // Catch: java.lang.Exception -> L91
            java.lang.Object r10 = r10.invoke(r9)     // Catch: java.lang.Exception -> L91
            if (r10 != r2) goto L65
        L64:
            return r2
        L65:
            com.sporty.android.core.model.remixbet.RemixBetResponse r10 = (com.sporty.android.core.model.remixbet.RemixBetResponse) r10     // Catch: java.lang.Exception -> L91
            y450 r9 = r0.b     // Catch: java.lang.Exception -> L91
            r9.getClass()     // Catch: java.lang.Exception -> L91
            z450 r9 = defpackage.y450.a(r10)     // Catch: java.lang.Exception -> L91
            java.util.List<f450> r9 = r9.a     // Catch: java.lang.Exception -> L91
            r0.C = r9     // Catch: java.lang.Exception -> L91
            boolean r9 = r9.isEmpty()     // Catch: java.lang.Exception -> L91
            if (r9 == 0) goto L8d
            com.sportybet.feature.remixbet.presentation.b$a r9 = new com.sportybet.feature.remixbet.presentation.b$a     // Catch: java.lang.Exception -> L91
            com.sporty.android.common_ui.uitext.StringUiText r10 = defpackage.vch0.a     // Catch: java.lang.Exception -> L91
            com.sporty.android.common_ui.uitext.ResourceUiText r10 = new com.sporty.android.common_ui.uitext.ResourceUiText     // Catch: java.lang.Exception -> L91
            r10.<init>(r4)     // Catch: java.lang.Exception -> L91
            r9.<init>(r10)     // Catch: java.lang.Exception -> L91
            r1.getClass()     // Catch: java.lang.Exception -> L91
            r1.k(r5, r9)     // Catch: java.lang.Exception -> L91
            goto La3
        L8d:
            r0.x1()     // Catch: java.lang.Exception -> L91
            goto La3
        L91:
            com.sportybet.feature.remixbet.presentation.b$a r9 = new com.sportybet.feature.remixbet.presentation.b$a
            com.sporty.android.common_ui.uitext.StringUiText r10 = defpackage.vch0.a
            com.sporty.android.common_ui.uitext.ResourceUiText r10 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r10.<init>(r4)
            r9.<init>(r10)
            r1.getClass()
            r1.k(r5, r9)
        La3:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sportybet.feature.remixbet.presentation.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
