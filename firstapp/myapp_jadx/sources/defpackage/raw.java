package defpackage;

import com.sportygames.crash.models.bet.BetContainerState;
import com.sportygames.multilevel.common.model.UserLevelProgressDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.multilevel.common.bet.MultiLevelBetContainerBonusHostKt$MultiLevelBetContainerBonusHost$1$1", f = "MultiLevelBetContainerBonusHost.kt", l = {}, m = "invokeSuspend", v = 1)
public final class raw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ uaw a;
    public final /* synthetic */ BetContainerState b;
    public final /* synthetic */ BetContainerState c;
    public final /* synthetic */ UserLevelProgressDto d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public raw(uaw uawVar, BetContainerState betContainerState, BetContainerState betContainerState2, UserLevelProgressDto userLevelProgressDto, v1b<? super raw> v1bVar) {
        super(2, v1bVar);
        this.a = uawVar;
        this.b = betContainerState;
        this.c = betContainerState2;
        this.d = userLevelProgressDto;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new raw(this.a, this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((raw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        qaw qawVarB = taw.b(this.b);
        qaw qawVarB2 = taw.b(this.c);
        UserLevelProgressDto userLevelProgressDto = this.d;
        boolean z3 = userLevelProgressDto != null && userLevelProgressDto.isNextBonusRound();
        Double stakeAmountCapForNextRound = userLevelProgressDto != null ? userLevelProgressDto.getStakeAmountCapForNextRound() : null;
        uaw uawVar = this.a;
        uawVar.getClass();
        if (stakeAmountCapForNextRound != null) {
            double dDoubleValue = stakeAmountCapForNextRound.doubleValue();
            if (dDoubleValue <= 0.0d || Math.abs(dDoubleValue) > Double.MAX_VALUE) {
                stakeAmountCapForNextRound = null;
            }
        } else {
            stakeAmountCapForNextRound = null;
        }
        if (qawVarB.c <= 0) {
            z = false;
        } else {
            Double d = qawVarB.e;
            if ((d != null ? d.doubleValue() : 0.0d) > 0.0d) {
                z = true;
            } else {
                z = false;
            }
        }
        if (qawVarB2.c <= 0) {
            z2 = false;
        } else {
            Double d2 = qawVarB2.e;
            if ((d2 != null ? d2.doubleValue() : 0.0d) > 0.0d) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        boolean z4 = z || z2;
        if (stakeAmountCapForNextRound != null && (z3 || z4)) {
            ((x5a0) uawVar.J0()).setValue(stakeAmountCapForNextRound);
        }
        if (!z4 && !z3 && !qawVarB.a && !qawVarB2.a) {
            ((x5a0) uawVar.J0()).setValue(null);
        }
        return Unit.a;
    }
}
