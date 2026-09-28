package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.home.CenterTabViewModel$init$1", f = "CenterTabViewModel.kt", l = {50, 51, 52, 54}, m = "invokeSuspend", v = 2)
public final class mv6 extends tje0 implements Function2<myh<? super iv6>, v1b<? super Unit>, Object> {
    public String a;
    public String b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ov6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv6(ov6 ov6Var, v1b<? super mv6> v1bVar) {
        super(2, v1bVar);
        this.e = ov6Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        mv6 mv6Var = new mv6(this.e, v1bVar);
        mv6Var.d = obj;
        return mv6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super iv6> myhVar, v1b<? super Unit> v1bVar) {
        return ((mv6) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0081  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
    
        if (r1.emit(r5, r11) == r2) goto L27;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            ov6 r0 = r11.e
            jv6 r0 = r0.a
            java.lang.Object r1 = r11.d
            myh r1 = (defpackage.myh) r1
            y5b r2 = defpackage.y5b.a
            int r3 = r11.c
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            java.lang.String r9 = ""
            if (r3 == 0) goto L3e
            if (r3 == r7) goto L3a
            if (r3 == r6) goto L34
            if (r3 == r5) goto L2c
            if (r3 != r4) goto L26
            java.lang.String r11 = r11.a
            iv6 r11 = (defpackage.iv6) r11
            defpackage.uj50.b(r12)
            goto L9a
        L26:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r11)
            return r8
        L2c:
            java.lang.String r0 = r11.b
            java.lang.String r3 = r11.a
            defpackage.uj50.b(r12)
            goto L84
        L34:
            java.lang.String r3 = r11.a
            defpackage.uj50.b(r12)
            goto L6a
        L3a:
            defpackage.uj50.b(r12)
            goto L52
        L3e:
            defpackage.uj50.b(r12)
            cfd[] r12 = defpackage.cfd.b
            r11.d = r1
            r11.c = r7
            zed r12 = r0.a
            java.lang.String r3 = "new_center_tab_link"
            java.lang.Object r12 = r12.getString(r3, r9, r11)
            if (r12 != r2) goto L52
            goto L99
        L52:
            java.lang.String r12 = (java.lang.String) r12
            cfd[] r3 = defpackage.cfd.b
            r11.d = r1
            r11.a = r12
            r11.c = r6
            zed r3 = r0.a
            java.lang.String r6 = "new_center_tab_image"
            java.lang.Object r3 = r3.getString(r6, r9, r11)
            if (r3 != r2) goto L67
            goto L99
        L67:
            r10 = r3
            r3 = r12
            r12 = r10
        L6a:
            java.lang.String r12 = (java.lang.String) r12
            cfd[] r6 = defpackage.cfd.b
            r11.d = r1
            r11.a = r3
            r11.b = r12
            r11.c = r5
            zed r0 = r0.a
            java.lang.String r5 = "new_center_tab_text"
            java.lang.Object r0 = r0.getString(r5, r9, r11)
            if (r0 != r2) goto L81
            goto L99
        L81:
            r10 = r0
            r0 = r12
            r12 = r10
        L84:
            java.lang.String r12 = (java.lang.String) r12
            iv6 r5 = new iv6
            r5.<init>(r3, r0, r12)
            r11.d = r8
            r11.a = r8
            r11.b = r8
            r11.c = r4
            java.lang.Object r11 = r1.emit(r5, r11)
            if (r11 != r2) goto L9a
        L99:
            return r2
        L9a:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mv6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
