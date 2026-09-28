package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.crash.models.ChipData;
import com.sportygames.crash.models.bet.BetContainerState;
import java.text.DecimalFormat;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.components.ComposeBetContainerKt$ComposeBetContainer$6$1", f = "ComposeBetContainer.kt", l = {}, m = "invokeSuspend", v = 1)
public final class h6a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ BetContainerState a;
    public final /* synthetic */ fsw b;
    public final /* synthetic */ ytw<String> c;
    public final /* synthetic */ ytw<String> d;
    public final /* synthetic */ ytw<String> e;
    public final /* synthetic */ SnapshotStateList<ChipData> f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6a(BetContainerState betContainerState, fsw fswVar, ytw ytwVar, ytw ytwVar2, ytw ytwVar3, SnapshotStateList snapshotStateList, v1b v1bVar) {
        super(2, v1bVar);
        this.a = betContainerState;
        this.b = fswVar;
        this.c = ytwVar;
        this.d = ytwVar2;
        this.e = ytwVar3;
        this.f = snapshotStateList;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new h6a(this.a, this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((h6a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        double doubleValue;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        BetContainerState betContainerState = this.a;
        if (betContainerState.getResetAllData()) {
            fsw fswVar = this.b;
            double doubleValue2 = fswVar.getDoubleValue();
            ytw<String> ytwVar = this.c;
            String str2 = "0.00";
            if (doubleValue2 == 0.0d || fswVar.getDoubleValue() < betContainerState.getDetailResponse().getMinAmount()) {
                fswVar.t(betContainerState.getDetailResponse().getMinAmount());
                try {
                    str = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(fswVar.getDoubleValue());
                    str.getClass();
                } catch (Exception unused) {
                    str = "0.00";
                }
                ytwVar.setValue(str);
            }
            if (fswVar.getDoubleValue() > betContainerState.getDetailResponse().getMaxAmount()) {
                fswVar.t(betContainerState.getDetailResponse().getMaxAmount());
                try {
                    String str3 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(fswVar.getDoubleValue());
                    str3.getClass();
                    str2 = str3;
                } catch (Exception unused2) {
                }
                ytwVar.setValue(str2);
            }
            ytw<String> ytwVar2 = this.d;
            if (ytwVar2.getValue().length() == 0) {
                ytwVar2.setValue("1.01");
            }
            try {
                doubleValue = fswVar.getDoubleValue() * Double.parseDouble(ytwVar2.getValue());
            } catch (Exception unused3) {
                doubleValue = 1.01d;
            }
            if (doubleValue > betContainerState.getDetailResponse().getMaxPayoutAmount()) {
                double maxAmount = fswVar.getDoubleValue() > betContainerState.getDetailResponse().getMaxAmount() ? betContainerState.getDetailResponse().getMaxAmount() : fswVar.getDoubleValue();
                TreeMap treeMap = pw.a;
                ytwVar2.setValue(pw.n(betContainerState.getDetailResponse().getMaxPayoutAmount() / maxAmount));
                this.e.setValue(((Object) ytwVar2.getValue()) + "x");
            }
            for (int i = 0; i < 3; i++) {
                this.f.get(i).setSelected(false);
            }
        }
        return Unit.a;
    }
}
