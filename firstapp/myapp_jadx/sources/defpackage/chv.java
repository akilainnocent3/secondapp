package defpackage;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.presentation.MeViewModel$login$1", f = "MeViewModel.kt", l = {643, 644, 646}, m = "invokeSuspend", v = 2)
public final class chv extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ rhv b;
    public final /* synthetic */ Activity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chv(rhv rhvVar, Activity activity, v1b<? super chv> v1bVar) {
        super(2, v1bVar);
        this.b = rhvVar;
        this.c = activity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new chv(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((chv) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (r9 == r3) goto L23;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            rhv r0 = r8.b
            x890 r1 = r0.A
            nev r2 = r0.b
            y5b r3 = defpackage.y5b.a
            int r4 = r8.a
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L28
            if (r4 == r7) goto L24
            if (r4 == r6) goto L20
            if (r4 != r5) goto L19
            defpackage.uj50.b(r9)     // Catch: java.lang.Exception -> L66
            goto L4a
        L19:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            r8 = 0
            return r8
        L20:
            defpackage.uj50.b(r9)     // Catch: java.lang.Exception -> L66
            goto L41
        L24:
            defpackage.uj50.b(r9)     // Catch: java.lang.Exception -> L66
            goto L38
        L28:
            defpackage.uj50.b(r9)
            android.app.Activity r9 = r8.c     // Catch: java.lang.Exception -> L66
            r8.a = r7     // Catch: java.lang.Exception -> L66
            mgb0 r4 = r2.b     // Catch: java.lang.Exception -> L66
            java.lang.Object r9 = r4.ensureLogin(r9, r8)     // Catch: java.lang.Exception -> L66
            if (r9 != r3) goto L38
            goto L49
        L38:
            r8.a = r6     // Catch: java.lang.Exception -> L66
            java.lang.Object r9 = r2.a(r8)     // Catch: java.lang.Exception -> L66
            if (r9 != r3) goto L41
            goto L49
        L41:
            r8.a = r5     // Catch: java.lang.Exception -> L66
            java.lang.Object r9 = r1.b(r8)     // Catch: java.lang.Exception -> L66
            if (r9 != r3) goto L4a
        L49:
            return r3
        L4a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Exception -> L66
            boolean r8 = r9.booleanValue()     // Catch: java.lang.Exception -> L66
            if (r8 == 0) goto L75
            ku90<iev> r8 = r0.M     // Catch: java.lang.Exception -> L66
            lfv r9 = r0.d     // Catch: java.lang.Exception -> L66
            long r1 = r1.a()     // Catch: java.lang.Exception -> L66
            r9.getClass()     // Catch: java.lang.Exception -> L66
            iev$j r9 = new iev$j     // Catch: java.lang.Exception -> L66
            r9.<init>(r1)     // Catch: java.lang.Exception -> L66
            r8.a(r9)     // Catch: java.lang.Exception -> L66
            goto L75
        L66:
            ku90<com.sporty.android.common.uievent.a> r8 = r0.G
            com.sporty.android.common_ui.uitext.StringUiText r9 = defpackage.vch0.a
            com.sporty.android.common_ui.uitext.ResourceUiText r9 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r0 = 2132018154(0x7f1403ea, float:1.9674607E38)
            r9.<init>(r0)
            com.sporty.android.common.uievent.b.j(r8, r9)
        L75:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chv.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
