package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.WelcomeRewardViewModel$handleAction$1", f = "WelcomeRewardViewModel.kt", l = {433, 441}, m = "invokeSuspend", v = 2)
public final class d5j0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public int b;
    public final /* synthetic */ w4j0 c;
    public final /* synthetic */ j4j0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5j0(w4j0 w4j0Var, j4j0 j4j0Var, v1b<? super d5j0> v1bVar) {
        super(2, v1bVar);
        this.c = w4j0Var;
        this.d = j4j0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new d5j0(this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((d5j0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0080  */
    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r8 == r0) goto L27;
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
            int r1 = r7.b
            r2 = 0
            r3 = 2
            r4 = 1
            w4j0 r5 = r7.c
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L15
            int r7 = r7.a
            defpackage.uj50.b(r8)
            goto L6b
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r2
        L1b:
            defpackage.uj50.b(r8)
            goto L35
        L1f:
            defpackage.uj50.b(r8)
            psm r8 = r5.f
            boolean r8 = r8.n()
            if (r8 == 0) goto L49
            mgb0 r8 = r5.c
            r7.b = r4
            java.lang.Object r8 = r8.getUserCertStatus(r7)
            if (r8 != r0) goto L35
            goto L67
        L35:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r1 = 320(0x140, float:4.48E-43)
            if (r8 != r1) goto L49
            ku90<k4j0> r7 = r5.I
            k4j0$d r8 = k4j0.d.a
            r7.a(r8)
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L49:
            j4j0 r8 = r7.d
            j4j0$b r8 = (j4j0.b) r8
            gr50 r8 = r8.c
            java.lang.Integer r8 = r8.a
            if (r8 == 0) goto L58
            int r8 = r8.intValue()
            goto L59
        L58:
            r8 = 0
        L59:
            wae r1 = r5.K
            if (r1 != 0) goto L71
            r7.a = r8
            r7.b = r3
            java.lang.Enum r7 = r5.B1(r8, r7)
            if (r7 != r0) goto L68
        L67:
            return r0
        L68:
            r6 = r8
            r8 = r7
            r7 = r6
        L6b:
            r1 = r8
            wae r1 = (defpackage.wae) r1
            r5.K = r1
            r8 = r7
        L71:
            ku90<k4j0> r7 = r5.I
            k4j0$c r0 = new k4j0$c
            int r3 = r1.ordinal()
            if (r3 == r4) goto L90
            r4 = 112(0x70, float:1.57E-43)
            if (r3 == r4) goto L80
            goto L98
        L80:
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r3 = "luckyWheelTypeId"
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r2.<init>(r3, r8)
            java.util.List r2 = kotlin.collections.a.c(r2)
            goto L98
        L90:
            java.lang.String r8 = "tab"
            java.lang.String r2 = "usedExpired"
            java.util.List r2 = defpackage.c5j0.a(r8, r2)
        L98:
            r0.<init>(r1, r2)
            r7.a(r0)
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d5j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
