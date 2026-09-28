package defpackage;

import com.sporty.android.book.domain.entity.BetTypeConfig;
import com.sporty.android.book.domain.entity.BetTypeFlexiBetConfig;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$fetchBetTypeConfig$1", f = "HomeViewModel.kt", l = {568}, m = "invokeSuspend", v = 2)
public final class dim extends tje0 implements Function2<lk50<? extends BetTypeConfig>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ iim c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dim(iim iimVar, v1b<? super dim> v1bVar) {
        super(2, v1bVar);
        this.c = iimVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        dim dimVar = new dim(this.c, v1bVar);
        dimVar.b = obj;
        return dimVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends BetTypeConfig> lk50Var, v1b<? super Unit> v1bVar) {
        return ((dim) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objB;
        BetTypeFlexiBetConfig flexi;
        lk50 lk50Var = (lk50) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            jvh jvhVar = this.c.P;
            BetTypeConfig betTypeConfig = (BetTypeConfig) bm50.i(lk50Var);
            this.b = null;
            this.a = 1;
            jvhVar.getClass();
            if (betTypeConfig == null || (flexi = betTypeConfig.getFlexi()) == null) {
                objB = Unit.a;
            } else {
                lq1 lq1Var = jvhVar.c;
                lq1Var.getClass();
                BetTypeFlexiBetConfig betTypeFlexiBetConfigCopy$default = BetTypeFlexiBetConfig.copy$default(flexi, null, null, false, null, null, qq1.h(lq1Var, BOConfigParam.FlexiBetWeightedRTPSupportedMinVersion), null, 0, 223, null);
                if (betTypeFlexiBetConfigCopy$default == null || !fd3.b(betTypeFlexiBetConfigCopy$default) || (objB = jvhVar.b.b(betTypeFlexiBetConfigCopy$default, this)) != y5bVar) {
                    objB = Unit.a;
                }
            }
            if (objB == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
