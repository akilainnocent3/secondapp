package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$fetchLoyaltyBettingStreakUpgradeHint$1", f = "HomeViewModel.kt", l = {898, 906, 907}, m = "invokeSuspend", v = 2)
public final class nim extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public iim a;
    public int b;
    public final /* synthetic */ iim c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nim(iim iimVar, v1b<? super nim> v1bVar) {
        super(2, v1bVar);
        this.c = iimVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new nim(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((nim) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r9.a.b("loyalty_betting_streak_upgrade_notification", r8) == r0) goto L24;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r8.b
            java.lang.String r2 = "loyalty_betting_streak_upgrade_notification"
            iim r3 = r8.c
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L2c
            if (r1 == r6) goto L28
            if (r1 == r5) goto L22
            if (r1 != r4) goto L1c
            iim r8 = r8.a
            java.lang.String r8 = (java.lang.String) r8
            defpackage.uj50.b(r9)
            goto L75
        L1c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r7
        L22:
            iim r3 = r8.a
            defpackage.uj50.b(r9)
            goto L64
        L28:
            defpackage.uj50.b(r9)
            goto L45
        L2c:
            defpackage.uj50.b(r9)
            m2l r9 = r3.A
            mr00 r1 = defpackage.mr00.NewDeviceLogin
            r8.b = r6
            zed r9 = r9.a
            r9.getClass()
            zn20$a r1 = defpackage.co20.f(r2)
            java.lang.Object r9 = r9.f(r1, r8)
            if (r9 != r0) goto L45
            goto L74
        L45:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L75
            com.sporty.android.core.model.json.JsonSerializeService r1 = r3.I
            java.lang.Class<com.sportybet.feature.loyalty.impl.bettingstreak.presentation.model.BettingStreakUpgradeHintUiModel> r6 = com.sportybet.feature.loyalty.impl.bettingstreak.presentation.model.BettingStreakUpgradeHintUiModel.class
            java.lang.Object r9 = r1.fromJson(r9, r6)
            com.sportybet.feature.loyalty.impl.bettingstreak.presentation.model.BettingStreakUpgradeHintUiModel r9 = (com.sportybet.feature.loyalty.impl.bettingstreak.presentation.model.BettingStreakUpgradeHintUiModel) r9
            if (r9 == 0) goto L75
            ku90<com.sportybet.feature.loyalty.impl.bettingstreak.presentation.model.BettingStreakUpgradeHintUiModel> r1 = r3.N0
            r8.a = r3
            r8.b = r5
            b390 r1 = r1.a
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L64
            goto L74
        L64:
            m2l r9 = r3.A
            mr00 r1 = defpackage.mr00.NewDeviceLogin
            r8.a = r7
            r8.b = r4
            zed r9 = r9.a
            java.lang.Object r8 = r9.b(r2, r8)
            if (r8 != r0) goto L75
        L74:
            return r0
        L75:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nim.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
