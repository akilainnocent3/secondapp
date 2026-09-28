package defpackage;

import com.sportygames.commons.SportyGamesManager;
import com.sportygames.crash.models.bet.BetContainerState;
import com.sportygames.crash.remote.models.DetailResponse;
import java.text.DecimalFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.components.ComposeBetContainerGenericKt$ComposeBetContainerGeneric$4$1", f = "ComposeBetContainerGeneric.kt", l = {}, m = "invokeSuspend", v = 1)
public final class t2a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ BetContainerState b;
    public final /* synthetic */ osw c;
    public final /* synthetic */ ytw<Boolean> d;
    public final /* synthetic */ fsw e;
    public final /* synthetic */ DetailResponse f;
    public final /* synthetic */ ytw<String> i;
    public final /* synthetic */ fsw v;
    public final /* synthetic */ Function0<Unit> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2a(boolean z, BetContainerState betContainerState, osw oswVar, ytw<Boolean> ytwVar, fsw fswVar, DetailResponse detailResponse, ytw<String> ytwVar2, fsw fswVar2, Function0<Unit> function0, v1b<? super t2a> v1bVar) {
        super(2, v1bVar);
        this.a = z;
        this.b = betContainerState;
        this.c = oswVar;
        this.d = ytwVar;
        this.e = fswVar;
        this.f = detailResponse;
        this.i = ytwVar2;
        this.v = fswVar2;
        this.w = function0;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new t2a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((t2a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str = "0.00";
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!this.a) {
            return Unit.a;
        }
        BetContainerState betContainerState = this.b;
        int levelGameDetailsApplyEpoch = betContainerState.getLevelGameDetailsApplyEpoch();
        if (levelGameDetailsApplyEpoch > 0) {
            osw oswVar = this.c;
            if (levelGameDetailsApplyEpoch != oswVar.D()) {
                oswVar.k(levelGameDetailsApplyEpoch);
                if (betContainerState.getBetPlaced() || betContainerState.getBetInProgress()) {
                    return Unit.a;
                }
                if (!betContainerState.getFbgAvailable() || egb.a(betContainerState) <= 0) {
                    return Unit.a;
                }
                this.d.setValue(Boolean.FALSE);
                fsw fswVar = this.e;
                DetailResponse detailResponse = this.f;
                fswVar.t(detailResponse.getDefaultAmount());
                try {
                    String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(detailResponse.getDefaultAmount());
                    str2.getClass();
                    str = str2;
                } catch (Exception unused) {
                }
                this.i.setValue(str);
                this.v.t(detailResponse.getDefaultAmount());
                this.w.invoke();
                return Unit.a;
            }
        }
        return Unit.a;
    }
}
