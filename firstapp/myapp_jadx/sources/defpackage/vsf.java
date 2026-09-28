package defpackage;

import com.sporty.android.core.model.realsports.StakeConfig;
import com.sportybet.android.gp.tz.R;
import com.sportybet.repository.limits.model.LimitResponse;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.limits.edit.viewmodel.EditSportsLimitsViewModel$init$1", f = "EditSportsLimitsViewModel.kt", l = {67}, m = "invokeSuspend", v = 2)
public final class vsf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zsf b;
    public final /* synthetic */ vfb0 c;
    public final /* synthetic */ scs d;

    public static final class a<T> implements myh {
        public final /* synthetic */ zsf a;
        public final /* synthetic */ scs b;

        public a(zsf zsfVar, scs scsVar) {
            this.a = zsfVar;
            this.b = scsVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            String strValueOf;
            String strValueOf2;
            String strValueOf3;
            uf00 uf00VarA;
            Integer monthlyLimit;
            Integer weeklyLimit;
            Integer dailyLimit;
            lk50 lk50Var = (lk50) obj;
            zsf zsfVar = this.a;
            wwd0 wwd0Var = zsfVar.a;
            if (lk50Var instanceof lk50.c) {
                StakeConfig stakeConfigY = zsfVar.A.y();
                zsfVar.F = stakeConfigY.getMinStake();
                zsfVar.G = stakeConfigY.getMaxStake();
                tsf tsfVar = zsfVar.e;
                LimitResponse limitResponse = (LimitResponse) CollectionsKt.firstOrNull((List) ((lk50.c) lk50Var).a);
                BigDecimal bigDecimal = zsfVar.F;
                BigDecimal bigDecimal2 = zsfVar.G;
                tsfVar.getClass();
                Integer numValueOf = Integer.valueOf(R.string.page_limits__min_vnum);
                String strD = a8b.d();
                if (limitResponse == null || (dailyLimit = limitResponse.getDailyLimit()) == null || (strValueOf = String.valueOf(((double) dailyLimit.intValue()) / 10000.0d)) == null) {
                    strValueOf = "";
                }
                ijf0 ijf0Var = new ijf0(strValueOf, 0L, 6);
                Pair pair = new Pair(numValueOf, String.valueOf(bigDecimal));
                strD.getClass();
                pmn pmnVar = new pmn(R.string.page_limits__daily_limits, ijf0Var, false, null, pair, strD);
                if (limitResponse == null || (weeklyLimit = limitResponse.getWeeklyLimit()) == null || (strValueOf2 = String.valueOf(((double) weeklyLimit.intValue()) / 10000.0d)) == null) {
                    strValueOf2 = "";
                }
                pmn pmnVar2 = new pmn(R.string.page_limits__weekly_limits, new ijf0(strValueOf2, 0L, 6), false, null, new Pair(numValueOf, String.valueOf(bigDecimal)), strD);
                if (limitResponse == null || (monthlyLimit = limitResponse.getMonthlyLimit()) == null || (strValueOf3 = String.valueOf(((double) monthlyLimit.intValue()) / 10000.0d)) == null) {
                    strValueOf3 = "";
                }
                pmn pmnVar3 = new pmn(R.string.page_limits__monthly_limits, new ijf0(strValueOf3, 0L, 6), false, null, new Pair(numValueOf, String.valueOf(bigDecimal)), strD);
                int iOrdinal = this.b.ordinal();
                if (iOrdinal != 0) {
                    uf00VarA = iOrdinal != 2 ? tsf.b() : tsf.b();
                } else {
                    uf00VarA = tsf.a(strD, bigDecimal, bigDecimal2);
                }
                usf.c cVar = new usf.c(new wfb0(pmnVar, pmnVar2, pmnVar3, uf00VarA));
                wfb0 wfb0Var = cVar.a;
                zsfVar.D = wfb0Var;
                zsfVar.E = wfb0Var;
                wwd0Var.getClass();
                wwd0Var.k(null, cVar);
                wfb0 wfb0Var2 = zsfVar.E;
                if (wfb0Var2 == null) {
                    Intrinsics.n("editedInfo");
                    throw null;
                }
                zsfVar.L = wfb0Var2.a.b;
                zsfVar.M = wfb0Var2.b.b;
                zsfVar.N = wfb0Var2.c.b;
            } else if (lk50Var instanceof lk50.a) {
                wwd0Var.setValue(usf.a.a);
            } else {
                if (!(lk50Var instanceof lk50.b)) {
                    uhc.a();
                    return null;
                }
                wwd0Var.setValue(usf.b.a);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vsf(v1b v1bVar, zsf zsfVar, scs scsVar, vfb0 vfb0Var) {
        super(2, v1bVar);
        this.b = zsfVar;
        this.c = vfb0Var;
        this.d = scsVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vfb0 vfb0Var = this.c;
        return new vsf(v1bVar, this.b, this.d, vfb0Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vsf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        yzh yzhVarB;
        zsf zsfVar = this.b;
        n3k n3kVar = zsfVar.f;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            vfb0 vfb0Var = this.c;
            zsfVar.B = vfb0Var;
            scs scsVar = this.d;
            zsfVar.C = scsVar;
            int iOrdinal = scsVar.ordinal();
            if (iOrdinal == 0) {
                yzhVarB = bm50.b(n3kVar.a.l(vfb0Var.a()), vch0.b);
            } else if (iOrdinal != 2) {
                yzhVarB = bm50.b(n3kVar.a.l(vfb0Var.a()), vch0.b);
            } else {
                w7k w7kVar = zsfVar.i;
                aoj aojVarA = vfb0Var.a();
                w7kVar.getClass();
                yzhVarB = bm50.b(w7kVar.a.m(aojVarA), vch0.b);
            }
            a aVar = new a(zsfVar, scsVar);
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
