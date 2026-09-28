package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.sportynews.data.CategoryList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportynews.usecase.SportyNewsUseCase$fetchCategoryList$3", f = "SportyNewsUseCase.kt", l = {DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class htc0 extends tje0 implements gaj<myh<? super lk50<? extends BaseResponse<CategoryList>>>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Throwable c;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super lk50<? extends BaseResponse<CategoryList>>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        htc0 htc0Var = new htc0(3, v1bVar);
        htc0Var.b = myhVar;
        htc0Var.c = th;
        return htc0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        Throwable th = this.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            lk50.a aVarA = gtc0.a(th, obj);
            this.b = null;
            this.c = null;
            this.a = 1;
            if (myhVar.emit(aVarA, this) == y5bVar) {
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
