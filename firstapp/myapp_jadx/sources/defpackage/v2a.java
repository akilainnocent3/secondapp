package defpackage;

import com.sportygames.commons.SportyGamesManager;
import com.sportygames.crash.models.bet.BetContainerState;
import com.sportygames.crash.remote.models.DetailResponse;
import java.text.DecimalFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.components.ComposeBetContainerGenericKt$ComposeBetContainerGeneric$7$1", f = "ComposeBetContainerGeneric.kt", l = {}, m = "invokeSuspend", v = 1)
public final class v2a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ sl2 b;
    public final /* synthetic */ BetContainerState c;
    public final /* synthetic */ ytw<Boolean> d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ DetailResponse f;
    public final /* synthetic */ DetailResponse i;
    public final /* synthetic */ fsw v;
    public final /* synthetic */ ytw<String> w;
    public final /* synthetic */ fsw y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2a(boolean z, sl2 sl2Var, BetContainerState betContainerState, ytw<Boolean> ytwVar, boolean z2, DetailResponse detailResponse, DetailResponse detailResponse2, fsw fswVar, ytw<String> ytwVar2, fsw fswVar2, v1b<? super v2a> v1bVar) {
        super(2, v1bVar);
        this.a = z;
        this.b = sl2Var;
        this.c = betContainerState;
        this.d = ytwVar;
        this.e = z2;
        this.f = detailResponse;
        this.i = detailResponse2;
        this.v = fswVar;
        this.w = ytwVar2;
        this.y = fswVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new v2a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((v2a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        double defaultAmount;
        String str = "0.00";
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!this.a || !this.b.a) {
            return Unit.a;
        }
        BetContainerState betContainerState = this.c;
        if (betContainerState.getBetPlaced() || betContainerState.getBetInProgress()) {
            return Unit.a;
        }
        if (betContainerState.getFbgAvailable() && egb.a(betContainerState) > 0) {
            return Unit.a;
        }
        ytw<Boolean> ytwVar = this.d;
        if (ytwVar.getValue().booleanValue()) {
            ytwVar.setValue(Boolean.FALSE);
            return Unit.a;
        }
        boolean z = this.e;
        DetailResponse detailResponse = this.f;
        if (z) {
            double defaultAmount2 = detailResponse.getDefaultAmount();
            DetailResponse detailResponse2 = this.i;
            if (defaultAmount2 > detailResponse2.getMaxAmount()) {
                defaultAmount = detailResponse2.getMaxAmount();
            } else {
                defaultAmount = detailResponse.getDefaultAmount();
            }
        } else {
            defaultAmount = detailResponse.getDefaultAmount();
        }
        this.v.t(defaultAmount);
        try {
            String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(defaultAmount);
            str2.getClass();
            str = str2;
        } catch (Exception unused) {
        }
        this.w.setValue(str);
        this.y.t(defaultAmount);
        return Unit.a;
    }
}
