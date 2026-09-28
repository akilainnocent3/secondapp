package defpackage;

import com.sportygames.commons.SportyGamesManager;
import com.sportygames.crash.models.bet.BetContainerState;
import com.sportygames.crash.remote.models.DetailResponse;
import java.text.DecimalFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.components.ComposeBetContainerGenericKt$ComposeBetContainerGeneric$3$1", f = "ComposeBetContainerGeneric.kt", l = {}, m = "invokeSuspend", v = 1)
public final class s2a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ BetContainerState a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ytw<Boolean> d;
    public final /* synthetic */ fsw e;
    public final /* synthetic */ ytw<String> f;
    public final /* synthetic */ fsw i;
    public final /* synthetic */ Function0<Unit> v;
    public final /* synthetic */ DetailResponse w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2a(BetContainerState betContainerState, boolean z, boolean z2, ytw<Boolean> ytwVar, fsw fswVar, ytw<String> ytwVar2, fsw fswVar2, Function0<Unit> function0, DetailResponse detailResponse, v1b<? super s2a> v1bVar) {
        super(2, v1bVar);
        this.a = betContainerState;
        this.b = z;
        this.c = z2;
        this.d = ytwVar;
        this.e = fswVar;
        this.f = ytwVar2;
        this.i = fswVar2;
        this.v = function0;
        this.w = detailResponse;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new s2a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((s2a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        BetContainerState betContainerState = this.a;
        if (betContainerState.getBetPlaced() || betContainerState.getBetInProgress()) {
            return Unit.a;
        }
        ytw<String> ytwVar = this.f;
        DetailResponse detailResponse = this.w;
        String str2 = "0.00";
        fsw fswVar = this.e;
        boolean z = this.b;
        boolean z2 = this.c;
        if (z) {
            fsw fswVar2 = this.i;
            if (z2 && betContainerState.getFbgAvailable() && egb.a(betContainerState) > 0) {
                this.d.setValue(Boolean.FALSE);
                fswVar.t(betContainerState.getDetailResponse().getDefaultAmount());
                try {
                    str = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(fswVar.getDoubleValue());
                    str.getClass();
                } catch (Exception unused) {
                    str = "0.00";
                }
                ytwVar.setValue(str);
                fswVar2.t(fswVar.getDoubleValue());
                this.v.invoke();
            }
            double doubleValue = fswVar.getDoubleValue();
            double minAmount = detailResponse.getMinAmount();
            double maxAmount = detailResponse.getMaxAmount();
            p8i p8iVar = enb0.a;
            if (doubleValue < minAmount) {
                doubleValue = minAmount;
            } else if (doubleValue > maxAmount) {
                doubleValue = maxAmount;
            }
            if (doubleValue != fswVar.getDoubleValue()) {
                fswVar.t(doubleValue);
                try {
                    String str3 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(doubleValue);
                    str3.getClass();
                    str2 = str3;
                } catch (Exception unused2) {
                }
                ytwVar.setValue(str2);
                fswVar2.t(doubleValue);
            }
        } else if (!z2 && fswVar.getDoubleValue() > detailResponse.getMaxAmount()) {
            fswVar.t(detailResponse.getMaxAmount());
            try {
                String str4 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(fswVar.getDoubleValue());
                str4.getClass();
                str2 = str4;
            } catch (Exception unused3) {
            }
            ytwVar.setValue(str2);
        }
        return Unit.a;
    }
}
