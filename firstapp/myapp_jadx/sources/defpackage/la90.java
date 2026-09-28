package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.mission.ShowMissionViewModel$addMissionShowCountIfMissionShowed$1", f = "ShowMissionViewModel.kt", l = {179, 180}, m = "invokeSuspend", v = 2)
public final class la90 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ sa90 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la90(v1b v1bVar, sa90 sa90Var) {
        super(2, v1bVar);
        this.b = sa90Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new la90(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((la90) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r9.g(r8, r0) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            sa90 r0 = r8.b
            com.sportybet.plugin.realsports.data.local.BetSlipDataStore r0 = r0.e
            y5b r1 = defpackage.y5b.a
            int r2 = r8.a
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1f
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L14
            defpackage.uj50.b(r9)
            goto L51
        L14:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            r8 = 0
            return r8
        L1b:
            defpackage.uj50.b(r9)
            goto L36
        L1f:
            defpackage.uj50.b(r9)
            wm20 r9 = r0.getBetSlipMissionReportCount()
            java.lang.Long r2 = new java.lang.Long
            r5 = 0
            r2.<init>(r5)
            r8.a = r4
            java.lang.Object r9 = r9.e(r8, r2)
            if (r9 != r1) goto L36
            goto L50
        L36:
            java.lang.Number r9 = (java.lang.Number) r9
            long r4 = r9.longValue()
            wm20 r9 = r0.getBetSlipMissionReportCount()
            r6 = 1
            long r4 = r4 + r6
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r4)
            r8.a = r3
            java.lang.Object r8 = r9.g(r8, r0)
            if (r8 != r1) goto L51
        L50:
            return r1
        L51:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.la90.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
