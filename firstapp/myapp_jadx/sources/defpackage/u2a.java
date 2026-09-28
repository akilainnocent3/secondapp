package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.crash.models.ChipData;
import com.sportygames.crash.models.bet.BetContainerState;
import java.text.DecimalFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.components.ComposeBetContainerGenericKt$ComposeBetContainerGeneric$5$1", f = "ComposeBetContainerGeneric.kt", l = {}, m = "invokeSuspend", v = 1)
public final class u2a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ sl2 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ BetContainerState c;
    public final /* synthetic */ fsw d;
    public final /* synthetic */ ytw<String> e;
    public final /* synthetic */ ytw<Boolean> f;
    public final /* synthetic */ Function0<Unit> i;
    public final /* synthetic */ ytw<String> v;
    public final /* synthetic */ ytw<Boolean> w;
    public final /* synthetic */ SnapshotStateList<ChipData> y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2a(sl2 sl2Var, boolean z, BetContainerState betContainerState, fsw fswVar, ytw<String> ytwVar, ytw<Boolean> ytwVar2, Function0<Unit> function0, ytw<String> ytwVar3, ytw<Boolean> ytwVar4, SnapshotStateList<ChipData> snapshotStateList, v1b<? super u2a> v1bVar) {
        super(2, v1bVar);
        this.a = sl2Var;
        this.b = z;
        this.c = betContainerState;
        this.d = fswVar;
        this.e = ytwVar;
        this.f = ytwVar2;
        this.i = function0;
        this.v = ytwVar3;
        this.w = ytwVar4;
        this.y = snapshotStateList;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new u2a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((u2a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String str = "0.00";
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (this.a.a) {
            boolean z2 = this.b;
            BetContainerState betContainerState = this.c;
            if (!z2 || (!(betContainerState.getBetPlaced() || betContainerState.getBetInProgress()) || betContainerState.getTopBets().getBetId() <= 0)) {
                z = false;
            } else {
                Double giftAmount = betContainerState.getTopBets().getGiftAmount();
                if ((giftAmount != null ? giftAmount.doubleValue() : 0.0d) > 0.0d) {
                    z = true;
                } else {
                    z = false;
                }
            }
            boolean z3 = z2 && !betContainerState.getBetPlaced() && !betContainerState.getBetInProgress() && betContainerState.getFbgAvailable() && egb.a(betContainerState) > 0;
            fsw fswVar = this.d;
            if ((!z2 || betContainerState.getBetPlaced() || betContainerState.getBetInProgress() || fswVar.getDoubleValue() <= 0.0d || z3) && !z) {
                fswVar.t(betContainerState.getDetailResponse().getDefaultAmount());
                try {
                    String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(fswVar.getDoubleValue());
                    str2.getClass();
                    str = str2;
                } catch (Exception unused) {
                }
                this.e.setValue(str);
            }
            if (!z) {
                this.f.setValue(Boolean.FALSE);
            }
            if (z3) {
                this.i.invoke();
            }
            this.v.setValue("5");
            this.w.setValue(Boolean.FALSE);
            for (int i = 0; i < 3; i++) {
                SnapshotStateList<ChipData> snapshotStateList = this.y;
                snapshotStateList.get(i).setSelected(false);
                snapshotStateList.get(i).setCurrentBet(0.0d);
            }
        }
        return Unit.a;
    }
}
