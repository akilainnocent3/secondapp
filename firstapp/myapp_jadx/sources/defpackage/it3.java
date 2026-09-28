package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.compose.betslip.recommendation.BetslipRecommendationSelectionKt$BetslipRecommendationSelection$4$1", f = "BetslipRecommendationSelection.kt", l = {77}, m = "invokeSuspend", v = 2)
public final class it3 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zpz b;
    public final /* synthetic */ ytw c;

    public static final class a<T> implements myh {
        public final /* synthetic */ ytw a;
        public final /* synthetic */ zpz b;

        public a(ytw ytwVar, zpz zpzVar) {
            this.a = ytwVar;
            this.b = zpzVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            int iIntValue = ((Number) obj).intValue();
            qcn qcnVar = (qcn) this.a.getValue();
            if (qcnVar.size() <= 1) {
                return Unit.a;
            }
            us3 us3Var = (us3) CollectionsKt.V(iIntValue, qcnVar);
            if (us3Var == null) {
                return Unit.a;
            }
            int iOrdinal = us3Var.c.ordinal();
            if (iOrdinal == 0) {
                return Unit.a;
            }
            zpz zpzVar = this.b;
            if (iOrdinal == 1) {
                return zpz.v(qcnVar.size() - 2, v1bVar, zpzVar);
            }
            if (iOrdinal == 2) {
                return zpz.v(1, v1bVar, zpzVar);
            }
            uhc.a();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public it3(zpz zpzVar, ytw ytwVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = zpzVar;
        this.c = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new it3(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((it3) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            zpz zpzVar = this.b;
            lyh lyhVarB = uzh.b(n95.c(new ht3(zpzVar, 0)));
            a aVar = new a(this.c, zpzVar);
            this.a = 1;
            if (lyhVarB.collect(aVar, this) == y5bVar) {
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
