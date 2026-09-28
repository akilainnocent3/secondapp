package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.BoostInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.realsports.RealSportsRepoImpl$getOddsBoostInfo$2", f = "RealSportsRepoImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class x940 extends tje0 implements Function2<BaseResponse<BoostInfo>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        x940 x940Var = new x940(2, v1bVar);
        x940Var.a = obj;
        return x940Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BaseResponse<BoostInfo> baseResponse, v1b<? super Unit> v1bVar) {
        return ((x940) create(baseResponse, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, com.sportybet.plugin.realsports.data.BoostInfo] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BaseResponse baseResponse = (BaseResponse) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (baseResponse.data == 0) {
            baseResponse.data = new BoostInfo();
        }
        return Unit.a;
    }
}
