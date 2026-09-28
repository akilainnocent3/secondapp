package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.compose.betslip.recommendation.BetslipRecommendationSelectionKt$BetslipRecommendationSelection$3$1", f = "BetslipRecommendationSelection.kt", l = {69}, m = "invokeSuspend", v = 2)
public final class gt3 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ zpz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt3(int i, v1b v1bVar, zpz zpzVar) {
        super(2, v1bVar);
        this.b = i;
        this.c = zpzVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new gt3(this.b, v1bVar, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((gt3) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            zpz zpzVar = this.c;
            int iN = zpzVar.n() - 1;
            if (iN < 0) {
                iN = 0;
            }
            int iE = f.e(this.b, 0, iN);
            if (zpzVar.k() != iE) {
                this.a = 1;
                if (zpz.v(iE, this, zpzVar) == y5bVar) {
                    return y5bVar;
                }
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
