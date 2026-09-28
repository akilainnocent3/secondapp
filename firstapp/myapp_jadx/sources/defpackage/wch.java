package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.presentation.viewmodel.FeaturedCodesViewModel$shareCode$1", f = "FeaturedCodesViewModel.kt", l = {349, 354}, m = "invokeSuspend", v = 2)
public final class wch extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public Object a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ tch d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wch(tch tchVar, String str, v1b<? super wch> v1bVar) {
        super(2, v1bVar);
        this.d = tchVar;
        this.e = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        wch wchVar = new wch(this.d, this.e, v1bVar);
        wchVar.c = obj;
        return wchVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wch) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (r2.a.emit((defpackage.wz80) r0, r13) == r10) goto L28;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            tch r8 = r13.d
            wwd0 r9 = r8.P
            java.lang.Object r0 = r13.c
            v5b r0 = (defpackage.v5b) r0
            y5b r10 = defpackage.y5b.a
            int r0 = r13.b
            r11 = 2
            r1 = 1
            r12 = 0
            if (r0 == 0) goto L2d
            if (r0 == r1) goto L22
            if (r0 != r11) goto L1c
            java.lang.Object r0 = r13.a
            defpackage.uj50.b(r14)
            goto L83
        L1c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            return r12
        L22:
            java.lang.Object r0 = r13.a
            v5b r0 = (defpackage.v5b) r0
            defpackage.uj50.b(r14)     // Catch: java.lang.Throwable -> L2b
            r0 = r14
            goto L5d
        L2b:
            r0 = move-exception
            goto L62
        L2d:
            defpackage.uj50.b(r14)
        L30:
            java.lang.Object r0 = r9.getValue()
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r13.e
            boolean r0 = r9.g(r0, r2)
            if (r0 == 0) goto L30
            java.lang.String r0 = r13.e
            zi50$a r2 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L2b
            r2 = r0
            xo20 r0 = r8.a     // Catch: java.lang.Throwable -> L2b
            r3 = r2
            java.lang.String r2 = r8.M     // Catch: java.lang.Throwable -> L2b
            r13.c = r12     // Catch: java.lang.Throwable -> L2b
            r13.a = r12     // Catch: java.lang.Throwable -> L2b
            r13.b = r1     // Catch: java.lang.Throwable -> L2b
            r1 = r3
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 60
            r6 = r13
            java.lang.Object r0 = defpackage.xo20.b(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2b
            if (r0 != r10) goto L5d
            goto L82
        L5d:
            wz80 r0 = (defpackage.wz80) r0     // Catch: java.lang.Throwable -> L2b
            zi50$a r1 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L2b
            goto L6a
        L62:
            zi50$a r1 = defpackage.zi50.b
            zi50$b r1 = new zi50$b
            r1.<init>(r0)
            r0 = r1
        L6a:
            boolean r1 = r0 instanceof zi50.b
            if (r1 != 0) goto L83
            r1 = r0
            wz80 r1 = (defpackage.wz80) r1
            ku90<wz80> r2 = r8.A
            r13.c = r12
            r13.a = r0
            r13.b = r11
            b390 r2 = r2.a
            java.lang.Object r1 = r2.emit(r1, r13)
            if (r1 != r10) goto L83
        L82:
            return r10
        L83:
            java.lang.Throwable r0 = defpackage.zi50.a(r0)
            if (r0 == 0) goto Lab
            itf0$a r1 = defpackage.itf0.a
            r1.e(r0)
            boolean r1 = r0 instanceof com.sporty.android.common.network.data.SprThrowable
            if (r1 == 0) goto L9e
            com.sporty.android.common.network.data.SprThrowable r0 = (com.sporty.android.common.network.data.SprThrowable) r0
            java.lang.String r0 = r0.getE()
            com.sporty.android.common_ui.uitext.StringUiText r0 = defpackage.vch0.d(r0)
        L9c:
            r2 = r0
            goto La1
        L9e:
            com.sporty.android.common_ui.uitext.ResourceUiText r0 = defpackage.vch0.b
            goto L9c
        La1:
            ku90<com.sporty.android.common.uievent.a> r1 = r8.v
            r5 = 0
            r6 = 126(0x7e, float:1.77E-43)
            r3 = 0
            r4 = 0
            com.sporty.android.common.uievent.b.i(r1, r2, r3, r4, r5, r6)
        Lab:
            java.lang.Object r0 = r9.getValue()
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r9.g(r0, r12)
            if (r0 == 0) goto Lab
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wch.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
