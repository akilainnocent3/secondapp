package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.sportynews.data.CategoryList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportynews.usecase.SportyNewsUseCase$fetchCategoryList$4", f = "SportyNewsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class itc0 extends tje0 implements Function2<lk50<? extends BaseResponse<CategoryList>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ wb90 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itc0(wb90 wb90Var, v1b v1bVar) {
        super(2, v1bVar);
        this.b = wb90Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        itc0 itc0Var = new itc0(this.b, v1bVar);
        itc0Var.a = obj;
        return itc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends BaseResponse<CategoryList>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((itc0) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.invoke(lk50Var);
        return Unit.a;
    }
}
