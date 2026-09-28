package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.event.recommendcode.PreMatchRecommendedCodeViewModel$shareCode$1", f = "PreMatchRecommendedCodeViewModel.kt", l = {321, 326}, m = "invokeSuspend", v = 2)
public final class ri20 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public Object a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ mi20 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri20(mi20 mi20Var, String str, v1b<? super ri20> v1bVar) {
        super(2, v1bVar);
        this.d = mi20Var;
        this.e = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ri20 ri20Var = new ri20(this.d, this.e, v1bVar);
        ri20Var.c = obj;
        return ri20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ri20) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    /* JADX WARN: Code duplicated, block: B:32:0x008e  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r2.a.emit((defpackage.wz80) r0, r13) == r8) goto L25;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.c
            v5b r0 = (defpackage.v5b) r0
            y5b r8 = defpackage.y5b.a
            int r0 = r13.b
            r9 = 55
            r10 = 2
            r1 = 1
            mi20 r11 = r13.d
            r12 = 0
            if (r0 == 0) goto L2c
            if (r0 == r1) goto L21
            if (r0 != r10) goto L1b
            java.lang.Object r0 = r13.a
            defpackage.uj50.b(r14)
            goto L78
        L1b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            return r12
        L21:
            java.lang.Object r0 = r13.a
            v5b r0 = (defpackage.v5b) r0
            defpackage.uj50.b(r14)     // Catch: java.lang.Throwable -> L2a
            r0 = r14
            goto L52
        L2a:
            r0 = move-exception
            goto L57
        L2c:
            defpackage.uj50.b(r14)
            java.lang.String r0 = r13.e
            defpackage.mi20.x1(r11, r12, r0, r12, r9)
            java.lang.String r0 = r13.e
            zi50$a r2 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L2a
            r2 = r0
            xo20 r0 = r11.c     // Catch: java.lang.Throwable -> L2a
            r3 = r2
            java.lang.String r2 = "RECOMMENDED_CODE_PREMATCH_EVENT_DETAIL_TAB"
            r13.c = r12     // Catch: java.lang.Throwable -> L2a
            r13.a = r12     // Catch: java.lang.Throwable -> L2a
            r13.b = r1     // Catch: java.lang.Throwable -> L2a
            r1 = r3
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 60
            r6 = r13
            java.lang.Object r0 = defpackage.xo20.b(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2a
            if (r0 != r8) goto L52
            goto L77
        L52:
            wz80 r0 = (defpackage.wz80) r0     // Catch: java.lang.Throwable -> L2a
            zi50$a r1 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L2a
            goto L5f
        L57:
            zi50$a r1 = defpackage.zi50.b
            zi50$b r1 = new zi50$b
            r1.<init>(r0)
            r0 = r1
        L5f:
            boolean r1 = r0 instanceof zi50.b
            if (r1 != 0) goto L78
            r1 = r0
            wz80 r1 = (defpackage.wz80) r1
            ku90<wz80> r2 = r11.y
            r13.c = r12
            r13.a = r0
            r13.b = r10
            b390 r2 = r2.a
            java.lang.Object r1 = r2.emit(r1, r13)
            if (r1 != r8) goto L78
        L77:
            return r8
        L78:
            java.lang.Throwable r0 = defpackage.zi50.a(r0)
            if (r0 == 0) goto L9b
            boolean r1 = r0 instanceof com.sporty.android.common.network.data.SprThrowable
            if (r1 == 0) goto L8e
            com.sporty.android.common.network.data.SprThrowable r0 = (com.sporty.android.common.network.data.SprThrowable) r0
            java.lang.String r0 = r0.getE()
            com.sporty.android.common_ui.uitext.StringUiText r0 = defpackage.vch0.d(r0)
        L8c:
            r2 = r0
            goto L91
        L8e:
            com.sporty.android.common_ui.uitext.ResourceUiText r0 = defpackage.vch0.b
            goto L8c
        L91:
            ku90<com.sporty.android.common.uievent.a> r1 = r11.f
            r5 = 0
            r6 = 126(0x7e, float:1.77E-43)
            r3 = 0
            r4 = 0
            com.sporty.android.common.uievent.b.i(r1, r2, r3, r4, r5, r6)
        L9b:
            defpackage.mi20.x1(r11, r12, r12, r12, r9)
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ri20.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
