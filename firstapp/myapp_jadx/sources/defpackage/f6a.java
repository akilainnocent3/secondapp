package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.crash.models.ChipData;
import com.sportygames.crash.models.bet.BetContainerState;
import java.text.DecimalFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.components.ComposeBetContainerKt$ComposeBetContainer$4$1", f = "ComposeBetContainer.kt", l = {}, m = "invokeSuspend", v = 1)
public final class f6a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ BetContainerState a;
    public final /* synthetic */ fsw b;
    public final /* synthetic */ ytw<String> c;
    public final /* synthetic */ ytw<Boolean> d;
    public final /* synthetic */ ytw<String> e;
    public final /* synthetic */ ytw<Boolean> f;
    public final /* synthetic */ SnapshotStateList<ChipData> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6a(BetContainerState betContainerState, fsw fswVar, ytw<String> ytwVar, ytw<Boolean> ytwVar2, ytw<String> ytwVar3, ytw<Boolean> ytwVar4, SnapshotStateList<ChipData> snapshotStateList, v1b<? super f6a> v1bVar) {
        super(2, v1bVar);
        this.a = betContainerState;
        this.b = fswVar;
        this.c = ytwVar;
        this.d = ytwVar2;
        this.e = ytwVar3;
        this.f = ytwVar4;
        this.i = snapshotStateList;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new f6a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((f6a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str = "0.00";
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        BetContainerState betContainerState = this.a;
        if (betContainerState.getResetWholeContainer()) {
            double defaultAmount = betContainerState.getDetailResponse().getDefaultAmount();
            fsw fswVar = this.b;
            fswVar.t(defaultAmount);
            try {
                String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(fswVar.getDoubleValue());
                str2.getClass();
                str = str2;
            } catch (Exception unused) {
            }
            this.c.setValue(str);
            Boolean bool = Boolean.FALSE;
            this.d.setValue(bool);
            this.e.setValue("5");
            this.f.setValue(bool);
            for (int i = 0; i < 3; i++) {
                SnapshotStateList<ChipData> snapshotStateList = this.i;
                snapshotStateList.get(i).setSelected(false);
                snapshotStateList.get(i).setCurrentBet(0.0d);
            }
        }
        return Unit.a;
    }
}
