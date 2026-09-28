package defpackage;

import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spinmatch.data.SpinMatchRepository$getPromotionalGifts$2", f = "SpinMatchRepository.kt", l = {88}, m = "invokeSuspend", v = 1)
public final class gbb0 extends tje0 implements Function1<v1b<? super HTTPResponse<PromotionGiftsResponse>>, Object> {
    public int a;

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new gbb0(1, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<PromotionGiftsResponse>> v1bVar) {
        return ((gbb0) create(v1bVar)).invokeSuspend(Unit.a);
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
        abb0 abb0VarP = on0.p();
        this.a = 1;
        Object promotionalGifts = abb0VarP.getPromotionalGifts(this);
        return promotionalGifts == y5bVar ? y5bVar : promotionalGifts;
    }
}
