package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.mission.ShowMissionViewModel$getUserIdSuffix$1", f = "ShowMissionViewModel.kt", l = {267, 268}, m = "invokeSuspend", v = 2)
public final class pa90 extends tje0 implements Function2<myh<? super Character>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ sa90 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa90(v1b v1bVar, sa90 sa90Var) {
        super(2, v1bVar);
        this.c = sa90Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        pa90 pa90Var = new pa90(v1bVar, this.c);
        pa90Var.b = obj;
        return pa90Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super Character> myhVar, v1b<? super Unit> v1bVar) {
        return ((pa90) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r6.a
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L1f
            if (r2 == r5) goto L1b
            if (r2 != r4) goto L15
            defpackage.uj50.b(r7)
            goto L42
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L1b:
            defpackage.uj50.b(r7)
            goto L31
        L1f:
            defpackage.uj50.b(r7)
            sa90 r7 = r6.c
            mgb0 r7 = r7.b
            r6.b = r0
            r6.a = r5
            java.lang.Object r7 = r7.getUserId(r6)
            if (r7 != r1) goto L31
            goto L41
        L31:
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            java.lang.Character r7 = defpackage.wae0.J(r7)
            r6.b = r3
            r6.a = r4
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r1) goto L42
        L41:
            return r1
        L42:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pa90.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
