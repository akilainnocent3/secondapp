package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$betIdFlow$1", f = "BetSlipViewModel.kt", l = {926, 928, 930, 933}, m = "invokeSuspend", v = 2)
public final class m63 extends tje0 implements Function2<myh<? super String>, v1b<? super Unit>, Object> {
    public String a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ q73 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m63(q73 q73Var, v1b<? super m63> v1bVar) {
        super(2, v1bVar);
        this.d = q73Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        m63 m63Var = new m63(this.d, v1bVar);
        m63Var.c = obj;
        return m63Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super String> myhVar, v1b<? super Unit> v1bVar) {
        return ((m63) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        if (r1.a.putString("edit_bet_id", r0, r12) == r3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        if (r2.emit(r13, r12) == r3) goto L30;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            q73 r0 = r12.d
            xlf r1 = r0.e0
            java.lang.Object r2 = r12.c
            myh r2 = (defpackage.myh) r2
            y5b r3 = defpackage.y5b.a
            int r4 = r12.b
            java.lang.String r5 = ""
            java.lang.String r6 = "edit_bet_id"
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            r11 = 0
            if (r4 == 0) goto L37
            if (r4 == r10) goto L33
            if (r4 == r9) goto L2f
            if (r4 == r8) goto L29
            if (r4 != r7) goto L23
            defpackage.uj50.b(r13)
            goto L86
        L23:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r12)
            return r11
        L29:
            java.lang.String r0 = r12.a
            defpackage.uj50.b(r13)
            goto L78
        L2f:
            defpackage.uj50.b(r13)
            goto L60
        L33:
            defpackage.uj50.b(r13)
            goto L47
        L37:
            defpackage.uj50.b(r13)
            r12.c = r2
            r12.b = r10
            zed r13 = r1.a
            java.lang.Object r13 = r13.getString(r6, r5, r12)
            if (r13 != r3) goto L47
            goto L85
        L47:
            java.lang.String r13 = (java.lang.String) r13
            boolean r4 = kotlin.text.StringsKt.U(r13)
            if (r4 == 0) goto L79
            m2l r13 = r0.F
            r12.c = r2
            r12.a = r11
            r12.b = r9
            zed r13 = r13.a
            java.lang.Object r13 = r13.getString(r6, r5, r12)
            if (r13 != r3) goto L60
            goto L85
        L60:
            r0 = r13
            java.lang.String r0 = (java.lang.String) r0
            boolean r13 = kotlin.text.StringsKt.U(r0)
            if (r13 != 0) goto L78
            r12.c = r2
            r12.a = r0
            r12.b = r8
            zed r13 = r1.a
            java.lang.Object r13 = r13.putString(r6, r0, r12)
            if (r13 != r3) goto L78
            goto L85
        L78:
            r13 = r0
        L79:
            r12.c = r11
            r12.a = r11
            r12.b = r7
            java.lang.Object r12 = r2.emit(r13, r12)
            if (r12 != r3) goto L86
        L85:
            return r3
        L86:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m63.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
