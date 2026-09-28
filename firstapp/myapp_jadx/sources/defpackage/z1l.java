package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.globalpay.data.FullSummaryData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.viewmodel.GlobalPayViewModel$getFullSummaryAmount$1", f = "GlobalPayViewModel.kt", l = {63}, m = "invokeSuspend", v = 2)
public final class z1l extends tje0 implements Function2<myh<? super lk50<? extends BaseResponse<FullSummaryData>>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        z1l z1lVar = new z1l(2, v1bVar);
        z1lVar.b = obj;
        return z1lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super lk50<? extends BaseResponse<FullSummaryData>>> myhVar, v1b<? super Unit> v1bVar) {
        return ((z1l) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = (myh) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            lk50.b bVar = lk50.b.a;
            this.b = null;
            this.a = 1;
            if (myhVar.emit(bVar, this) == y5bVar) {
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
