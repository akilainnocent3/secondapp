package defpackage;

import com.sportybet.feature.luckynumber.featurematch.domain.data.LNLastMinuteCard;
import com.sportybet.feature.luckynumber.featurematch.presentation.d;
import com.sportybet.feature.luckynumber.featurematch.presentation.f;
import com.sportybet.feature.luckynumber.featurematch.presentation.k;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.featurematch.presentation.LuckyNumberFeatureMatchViewModel$special$$inlined$flatMapLatest$1", f = "LuckyNumberFeatureMatchViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class w5u extends tje0 implements gaj<myh<? super d.c>, LNLastMinuteCard, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ k d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5u(v1b v1bVar, k kVar) {
        super(3, v1bVar);
        this.d = kVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super d.c> myhVar, LNLastMinuteCard lNLastMinuteCard, v1b<? super Unit> v1bVar) {
        w5u w5uVar = new w5u(v1bVar, this.d);
        w5uVar.b = myhVar;
        w5uVar.c = lNLastMinuteCard;
        return w5uVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lyh gzhVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            LNLastMinuteCard lNLastMinuteCard = (LNLastMinuteCard) this.c;
            if (lNLastMinuteCard != null) {
                k kVar = this.d;
                f fVar = kVar.a;
                ku90<Unit> ku90Var = kVar.w;
                fVar.getClass();
                ku90Var.getClass();
                gzhVar = new hlq(new xzh(ku90Var, new ilq(2, null)), lNLastMinuteCard, fVar);
            } else {
                gzhVar = new gzh(null);
            }
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, gzhVar, this) == y5bVar) {
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
