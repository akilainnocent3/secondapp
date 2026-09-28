package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.crash.models.ChipData;
import com.sportygames.crash.models.bet.BetContainerState;
import com.sportygames.crash.remote.models.DetailResponse;
import java.text.DecimalFormat;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.components.ComposeBetContainerGenericKt$ComposeBetContainerGeneric$8$1", f = "ComposeBetContainerGeneric.kt", l = {}, m = "invokeSuspend", v = 1)
public final class w2a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ BetContainerState a;
    public final /* synthetic */ fsw b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ytw<String> d;
    public final /* synthetic */ DetailResponse e;
    public final /* synthetic */ ytw<String> f;
    public final /* synthetic */ ytw<String> i;
    public final /* synthetic */ SnapshotStateList<ChipData> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2a(BetContainerState betContainerState, fsw fswVar, boolean z, ytw ytwVar, DetailResponse detailResponse, ytw ytwVar2, ytw ytwVar3, SnapshotStateList snapshotStateList, v1b v1bVar) {
        super(2, v1bVar);
        this.a = betContainerState;
        this.b = fswVar;
        this.c = z;
        this.d = ytwVar;
        this.e = detailResponse;
        this.f = ytwVar2;
        this.i = ytwVar3;
        this.v = snapshotStateList;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new w2a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((w2a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        double doubleValue;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        BetContainerState betContainerState = this.a;
        if (betContainerState.getResetAllData()) {
            double minAmount = betContainerState.getDetailResponse().getMinAmount();
            fsw fswVar = this.b;
            double doubleValue2 = fswVar.getDoubleValue();
            ytw<String> ytwVar = this.d;
            boolean z = this.c;
            String str2 = "0.00";
            if ((doubleValue2 == 0.0d || fswVar.getDoubleValue() < minAmount) && !z) {
                fswVar.t(minAmount);
                try {
                    str = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(fswVar.getDoubleValue());
                    str.getClass();
                } catch (Exception unused) {
                    str = "0.00";
                }
                ytwVar.setValue(str);
            }
            DetailResponse detailResponse = this.e;
            if (!z && fswVar.getDoubleValue() > detailResponse.getMaxAmount()) {
                fswVar.t(detailResponse.getMaxAmount());
                try {
                    String str3 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(fswVar.getDoubleValue());
                    str3.getClass();
                    str2 = str3;
                } catch (Exception unused2) {
                }
                ytwVar.setValue(str2);
            }
            ytw<String> ytwVar2 = this.f;
            if (ytwVar2.getValue().length() == 0) {
                ytwVar2.setValue("1.01");
            }
            try {
                doubleValue = fswVar.getDoubleValue() * Double.parseDouble(ytwVar2.getValue());
            } catch (Exception unused3) {
                doubleValue = 1.01d;
            }
            if (doubleValue > betContainerState.getDetailResponse().getMaxPayoutAmount()) {
                double maxAmount = fswVar.getDoubleValue() > detailResponse.getMaxAmount() ? detailResponse.getMaxAmount() : fswVar.getDoubleValue();
                TreeMap treeMap = pw.a;
                ytwVar2.setValue(pw.n(betContainerState.getDetailResponse().getMaxPayoutAmount() / maxAmount));
                this.i.setValue(((Object) ytwVar2.getValue()) + "x");
            }
            for (int i = 0; i < 3; i++) {
                this.v.get(i).setSelected(false);
            }
        }
        return Unit.a;
    }
}
