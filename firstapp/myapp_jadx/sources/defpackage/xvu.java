package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.settings.notification.matchalert.presentation.MatchAlertViewModel$toggleSubscribedEventEnabling$1", f = "MatchAlertViewModel.kt", l = {117, 124}, m = "invokeSuspend", v = 2)
public final class xvu extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ rvu c;
    public final /* synthetic */ vde0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvu(rvu rvuVar, vde0 vde0Var, v1b<? super xvu> v1bVar) {
        super(2, v1bVar);
        this.c = rvuVar;
        this.d = vde0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xvu xvuVar = new xvu(this.c, this.d, v1bVar);
        xvuVar.b = obj;
        return xvuVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xvu) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r7.b.a(r0.a, !r1, r9) == r3) goto L21;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            vde0 r0 = r9.d
            boolean r1 = r0.d
            java.lang.Object r2 = r9.b
            v5b r2 = (defpackage.v5b) r2
            y5b r3 = defpackage.y5b.a
            int r4 = r9.a
            r5 = 2
            r6 = 0
            rvu r7 = r9.c
            r8 = 1
            if (r4 == 0) goto L28
            if (r4 == r8) goto L24
            if (r4 != r5) goto L1e
            defpackage.uj50.b(r10)     // Catch: java.lang.Throwable -> L1b
            goto L5d
        L1b:
            r0 = move-exception
            r9 = r0
            goto L62
        L1e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r6
        L24:
            defpackage.uj50.b(r10)
            goto L4b
        L28:
            defpackage.uj50.b(r10)
            v340 r10 = r7.C
            uwd0<T> r10 = r10.a
            java.lang.Object r10 = r10.getValue()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L4b
            if (r1 != 0) goto L4b
            qa30 r10 = r7.a
            r9.b = r2
            r9.a = r8
            r2 = 0
            java.lang.Object r10 = r10.d(r8, r8, r2, r9)
            if (r10 != r3) goto L4b
            goto L5c
        L4b:
            zi50$a r10 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L1b
            muu r10 = r7.b     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r0.a     // Catch: java.lang.Throwable -> L1b
            r1 = r1 ^ r8
            r9.b = r6     // Catch: java.lang.Throwable -> L1b
            r9.a = r5     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r9 = r10.a(r0, r1, r9)     // Catch: java.lang.Throwable -> L1b
            if (r9 != r3) goto L5d
        L5c:
            return r3
        L5d:
            kotlin.Unit r9 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L1b
            zi50$a r10 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L1b
            goto L6a
        L62:
            zi50$a r10 = defpackage.zi50.b
            zi50$b r10 = new zi50$b
            r10.<init>(r9)
            r9 = r10
        L6a:
            java.lang.Throwable r9 = defpackage.zi50.a(r9)
            if (r9 == 0) goto L8c
            ku90<com.sporty.android.common.uievent.a> r0 = r7.e
            boolean r10 = r9 instanceof com.sporty.android.common.network.data.SprThrowable
            if (r10 == 0) goto L79
            r6 = r9
            com.sporty.android.common.network.data.SprThrowable r6 = (com.sporty.android.common.network.data.SprThrowable) r6
        L79:
            if (r6 == 0) goto L81
            com.sporty.android.common_ui.uitext.UiText r9 = r6.b()
        L7f:
            r1 = r9
            goto L84
        L81:
            com.sporty.android.common_ui.uitext.ResourceUiText r9 = defpackage.vch0.b
            goto L7f
        L84:
            r4 = 0
            r5 = 126(0x7e, float:1.77E-43)
            r2 = 0
            r3 = 0
            com.sporty.android.common.uievent.b.i(r0, r1, r2, r3, r4, r5)
        L8c:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xvu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
