package defpackage;

import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spindabottle.repositories.SpinDaBottleRepository$getPromotionalGifts$2", f = "SpinDaBottleRepository.kt", l = {56}, m = "invokeSuspend", v = 1)
public final class y5b0 extends tje0 implements Function1<v1b<? super HTTPResponse<PromotionGiftsResponse>>, Object> {
    public int a;

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new y5b0(1, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<PromotionGiftsResponse>> v1bVar) {
        return ((y5b0) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        mpe0 mpe0Var = on0.a;
        s5b0 s5b0VarQ = on0.q();
        this.a = 1;
        Object promotionalGifts = s5b0VarQ.getPromotionalGifts(this);
        return promotionalGifts == y5bVar ? y5bVar : promotionalGifts;
    }
}
