package defpackage;

import com.sportybet.plugin.sportystories.domain.entity.StoryWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.sportystories.presentation.StoriesViewModel$onCtaButtonClick$1", f = "StoriesViewModel.kt", l = {265, 268}, m = "invokeSuspend", v = 2)
public final class d2e0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ c2e0 b;
    public final /* synthetic */ StoryWidget.a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2e0(c2e0 c2e0Var, StoryWidget.a aVar, v1b<? super d2e0> v1bVar) {
        super(2, v1bVar);
        this.b = c2e0Var;
        this.c = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new d2e0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((d2e0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (defpackage.hkd.b(300, r7) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r8.emit(r1, r7) == r0) goto L18;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r7.a
            r2 = 2
            r3 = 1
            c2e0 r4 = r7.b
            r5 = 0
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L13
            defpackage.uj50.b(r8)
            goto L59
        L13:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r5
        L19:
            defpackage.uj50.b(r8)
            goto L42
        L1d:
            defpackage.uj50.b(r8)
            azm r8 = r4.b
            com.sportybet.plugin.sportystories.domain.entity.StoryWidget$a r1 = r7.c
            java.lang.String r1 = r1.b
            android.net.Uri r1 = android.net.Uri.parse(r1)
            com.sportybet.android.router.Sender r6 = com.sportybet.android.router.Sender.HOMEPAGE_SPORTY_STORY
            boolean r8 = r8.a(r1, r5, r6)
            if (r8 == 0) goto L46
            java.lang.String r8 = "button_click"
            r4.A1(r8)
            r7.a = r3
            r1 = 300(0x12c, double:1.48E-321)
            java.lang.Object r7 = defpackage.hkd.b(r1, r7)
            if (r7 != r0) goto L42
            goto L58
        L42:
            r4.D1()
            goto L59
        L46:
            b390 r8 = r4.z
            c2e0$d$b r1 = new c2e0$d$b
            r3 = 2132018120(0x7f1403c8, float:1.9674538E38)
            r1.<init>(r3, r5, r5)
            r7.a = r2
            java.lang.Object r7 = r8.emit(r1, r7)
            if (r7 != r0) goto L59
        L58:
            return r0
        L59:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d2e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
