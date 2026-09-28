package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.codehub.viewmodel.CodeHubEntryViewModel$notifyCreatorCreditsHintWatched$1", f = "CodeHubEntryViewModel.kt", l = {51, 52}, m = "invokeSuspend", v = 2)
public final class cx7 extends tje0 implements Function2<myh<? super Unit>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ex7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx7(ex7 ex7Var, v1b<? super cx7> v1bVar) {
        super(2, v1bVar);
        this.c = ex7Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        cx7 cx7Var = new cx7(this.c, v1bVar);
        cx7Var.b = obj;
        return cx7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super Unit> myhVar, v1b<? super Unit> v1bVar) {
        return ((cx7) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
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
            goto L44
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L1b:
            defpackage.uj50.b(r7)
            goto L37
        L1f:
            defpackage.uj50.b(r7)
            ex7 r7 = r6.c
            m2l r7 = r7.d
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r6.b = r0
            r6.a = r5
            zed r7 = r7.a
            java.lang.String r5 = "key_code_hub_creator_credits_entry_hint_watched"
            java.lang.Object r7 = r7.putBoolean(r5, r2, r6)
            if (r7 != r1) goto L37
            goto L43
        L37:
            kotlin.Unit r7 = kotlin.Unit.a
            r6.b = r3
            r6.a = r4
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r1) goto L44
        L43:
            return r1
        L44:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cx7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
