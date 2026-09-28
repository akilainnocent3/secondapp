package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.WelcomeRewardViewModel$onRewardBannerClicked$1", f = "WelcomeRewardViewModel.kt", l = {305, 306}, m = "invokeSuspend", v = 2)
public final class k5j0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ w4j0 b;
    public final /* synthetic */ wm20<String> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5j0(w4j0 w4j0Var, wm20<String> wm20Var, v1b<? super k5j0> v1bVar) {
        super(2, v1bVar);
        this.b = w4j0Var;
        this.c = wm20Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new k5j0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((k5j0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r2.C1(r5.c, (java.lang.String) r6, r1, r5) == r0) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r5.a
            w4j0 r2 = r5.b
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L19
            if (r1 != r3) goto L12
            defpackage.uj50.b(r6)
            goto L3d
        L12:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L19:
            defpackage.uj50.b(r6)
            goto L2b
        L1d:
            defpackage.uj50.b(r6)
            mgb0 r6 = r2.c
            r5.a = r4
            java.lang.Object r6 = r6.getUserId(r5)
            if (r6 != r0) goto L2b
            goto L3c
        L2b:
            java.lang.String r6 = (java.lang.String) r6
            v9y r1 = new v9y
            r1.<init>(r4)
            r5.a = r3
            wm20<java.lang.String> r3 = r5.c
            java.lang.Object r5 = r2.C1(r3, r6, r1, r5)
            if (r5 != r0) goto L3d
        L3c:
            return r0
        L3d:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k5j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
