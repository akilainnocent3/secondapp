package defpackage;

import com.sporty.android.book.domain.entity.BetBuilderData;
import com.sporty.android.book.domain.entity.BetBuilderDataWSelections;
import com.sporty.android.book.domain.entity.UIState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.presentation.betbuilder.BetBuilderViewModel$calculateOdds$3", f = "BetBuilderViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class hj2 extends tje0 implements Function2<BetBuilderData, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ fj2 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj2(fj2 fj2Var, ArrayList arrayList, Boolean bool, v1b v1bVar) {
        super(2, v1bVar);
        this.b = fj2Var;
        this.c = arrayList;
        this.d = bool;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        hj2 hj2Var = new hj2(this.b, this.c, this.d, v1bVar);
        hj2Var.a = obj;
        return hj2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BetBuilderData betBuilderData, v1b<? super Unit> v1bVar) {
        return ((hj2) create(betBuilderData, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BetBuilderData betBuilderData = (BetBuilderData) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        itf0.a aVar = itf0.a;
        aVar.q("BetBuilder");
        boolean z = false;
        aVar.a("Odds calculated!", new Object[0]);
        fj2 fj2Var = this.b;
        wwd0 wwd0Var = fj2Var.d;
        if (betBuilderData.getValid() && ((List) fj2Var.z.getValue()).size() <= ((Number) fj2Var.B.getValue()).intValue() && betBuilderData.getOddsDouble() <= ((Number) fj2Var.C.getValue()).doubleValue()) {
            z = true;
        }
        UIState.Success success = new UIState.Success(BetBuilderData.copy$default(betBuilderData, null, null, null, null, z, null, null, null, 239, null));
        wwd0Var.getClass();
        wwd0Var.k(null, success);
        fj2Var.v.m(new BetBuilderDataWSelections(this.c, betBuilderData, this.d));
        fj2Var.f.m(betBuilderData.getIncompatibleMarkets());
        return Unit.a;
    }
}
