package defpackage;

import com.google.protobuf.RuntimeVersion;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.model.cashOut.CashOutPageResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.realsportsgame.RealSportsGameRepoImpl$getOpenBetCount$1", f = "RealSportsGameRepoImpl.kt", l = {RuntimeVersion.MINOR}, m = "invokeSuspend", v = 2)
public final class a940 extends tje0 implements Function2<myh<? super lk50<? extends BaseResponse<CashOutPageResponse>>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ c940 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a940(c940 c940Var, v1b<? super a940> v1bVar) {
        super(2, v1bVar);
        this.c = c940Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        a940 a940Var = new a940(this.c, v1bVar);
        a940Var.b = obj;
        return a940Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super lk50<? extends BaseResponse<CashOutPageResponse>>> myhVar, v1b<? super Unit> v1bVar) {
        return ((a940) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = (myh) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            lk50<? extends BaseResponse<CashOutPageResponse>> lk50Var = this.c.b;
            this.b = null;
            this.a = 1;
            if (myhVar.emit(lk50Var, this) == y5bVar) {
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
