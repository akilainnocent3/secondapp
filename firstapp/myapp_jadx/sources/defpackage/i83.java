package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$waitForAnyWinEnableOrFallbackToFlexi$1", f = "BetSlipViewModel.kt", l = {1126}, m = "invokeSuspend", v = 2)
public final class i83 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public int b;
    public int c;
    public final /* synthetic */ q73 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i83(q73 q73Var, v1b<? super i83> v1bVar) {
        super(2, v1bVar);
        this.d = q73Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new i83(this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((i83) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:13:0x0031 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002f -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r9.c
            r2 = 0
            q73 r3 = r9.d
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L1b
            if (r1 != r5) goto L15
            int r1 = r9.b
            int r6 = r9.a
            defpackage.uj50.b(r10)
            goto L32
        L15:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r2
        L1b:
            defpackage.uj50.b(r10)
            r1 = r4
            r6 = r1
        L20:
            r10 = 3
            if (r1 >= r10) goto L43
            r9.a = r6
            r9.b = r1
            r9.c = r5
            r7 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r10 = defpackage.hkd.b(r7, r9)
            if (r10 != r0) goto L32
            return r0
        L32:
            com.sporty.android.core.model.OrderBetType r10 = com.sporty.android.core.model.OrderBetType.ANY_WIN
            int r10 = r10.getValue()
            luo r10 = r3.F1(r10)
            luo r7 = defpackage.luo.c
            if (r10 != r7) goto L41
            goto L44
        L41:
            int r1 = r1 + r5
            goto L20
        L43:
            r5 = r6
        L44:
            r3.B0 = r4
            wwd0 r9 = r3.x0
            if (r5 == 0) goto L5c
            tb00$d r10 = new tb00$d
            com.sporty.android.core.model.OrderBetType r0 = com.sporty.android.core.model.OrderBetType.ANY_WIN
            int r0 = r0.getValue()
            r10.<init>(r0)
            r9.getClass()
            r9.k(r2, r10)
            goto L70
        L5c:
            tb00$c r10 = new tb00$c
            com.sporty.android.core.model.OrderBetType r0 = com.sporty.android.core.model.OrderBetType.FLEX
            int r0 = r0.getValue()
            r10.<init>(r0)
            r9.getClass()
            r9.k(r2, r10)
            r3.U1()
        L70:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i83.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
