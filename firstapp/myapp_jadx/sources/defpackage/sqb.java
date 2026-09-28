package defpackage;

import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.repository.CrashRepository$getPromotionalGifts$2", f = "CrashRepository.kt", l = {131}, m = "invokeSuspend", v = 1)
public final class sqb extends tje0 implements Function1<v1b<? super HTTPResponse<PromotionGiftsResponse>>, Object> {
    public int a;
    public final /* synthetic */ zqb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqb(zqb zqbVar, v1b<? super sqb> v1bVar) {
        super(1, v1bVar);
        this.b = zqbVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new sqb(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<PromotionGiftsResponse>> v1bVar) {
        return ((sqb) create(v1bVar)).invokeSuspend(Unit.a);
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
        dpb dpbVarA = this.b.a.a();
        this.a = 1;
        Object promotionalGifts = dpbVarA.getPromotionalGifts(this);
        return promotionalGifts == y5bVar ? y5bVar : promotionalGifts;
    }
}
