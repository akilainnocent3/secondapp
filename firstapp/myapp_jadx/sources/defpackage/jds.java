package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.realsports.StakeConfig;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.limits.base.limitBetting.viewmodel.LimitsBettingViewModel$loadInfo$1", f = "LimitsBettingViewModel.kt", l = {DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class jds extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ kds b;

    public static final class a<T> implements myh {
        public final /* synthetic */ kds a;

        public a(kds kdsVar) {
            this.a = kdsVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            lk50 lk50Var = (lk50) obj;
            kds kdsVar = this.a;
            wwd0 wwd0Var = kdsVar.a;
            if (lk50Var instanceof lk50.c) {
                StakeConfig stakeConfigY = kdsVar.v.y();
                gds gdsVar = kdsVar.e;
                List list = (List) ((lk50.c) lk50Var).a;
                String strF = kdsVar.i.f();
                BigDecimal minStake = stakeConfigY.getMinStake();
                BigDecimal maxStake = stakeConfigY.getMaxStake();
                gdsVar.getClass();
                list.getClass();
                strF.getClass();
                LinkedHashMap linkedHashMapA = ucs.a(list, scs.BETTING_LIMIT_TYPE);
                if (minStake == null) {
                    minStake = new BigDecimal(0);
                }
                if (maxStake == null) {
                    maxStake = new BigDecimal(0);
                }
                Object[] objArr = {strF, Double.valueOf(minStake.doubleValue())};
                StringUiText stringUiText = vch0.a;
                ids.c cVar = new ids.c(new hds(linkedHashMapA, a4h.a(new ResourceUiText(R.string.page_limits__the_minimum_stake_amount_is_vcurrency_vnum_tip, ay0.S(objArr)), new ResourceUiText(R.string.page_limits__the_maximum_stake_amount_is_vcurrency_vnum_tip, ay0.S(new Object[]{strF, Double.valueOf(maxStake.doubleValue())})), new ResourceUiText(R.string.page_limits__if_you_reach_any_real_sports_virtuals_casino_limit_tip))));
                wwd0Var.getClass();
                wwd0Var.k(null, cVar);
            } else if (lk50Var instanceof lk50.a) {
                wwd0Var.setValue(ids.a.a);
            } else {
                if (!(lk50Var instanceof lk50.b)) {
                    uhc.a();
                    return null;
                }
                wwd0Var.setValue(ids.b.a);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jds(kds kdsVar, v1b<? super jds> v1bVar) {
        super(2, v1bVar);
        this.b = kdsVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jds(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jds) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            kds kdsVar = this.b;
            yzh yzhVarB = bm50.b(kdsVar.f.a.i(), vch0.b);
            a aVar = new a(kdsVar);
            this.a = 1;
            if (yzhVarB.collect(aVar, this) == y5bVar) {
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
