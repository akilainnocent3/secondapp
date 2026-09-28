package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.MyLog;
import com.sportybet.plugin.realsports.data.PreMatchSportsData;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.realsports.RealSportsRepoImpl$getEventsByOrder$2", f = "RealSportsRepoImpl.kt", l = {219}, m = "invokeSuspend", v = 2)
public final class n940 extends tje0 implements gaj<myh<? super BaseResponse<PreMatchSportsData>>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Throwable c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n940(int i, v1b<? super n940> v1bVar) {
        super(3, v1bVar);
        this.d = i;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super BaseResponse<PreMatchSportsData>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        n940 n940Var = new n940(this.d, v1bVar);
        n940Var.b = myhVar;
        n940Var.c = th;
        return n940Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, com.sportybet.plugin.realsports.data.PreMatchSportsData] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        myh myhVar = this.b;
        Throwable th = this.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            if (this.d != 1) {
                throw th;
            }
            BaseResponse baseResponse = new BaseResponse();
            baseResponse.bizCode = 10000;
            baseResponse.data = new PreMatchSportsData();
            this.b = null;
            this.c = th;
            this.a = 1;
            if (myhVar.emit(baseResponse, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        itf0.a aVar = itf0.a;
        aVar.a(e40.a(aVar, MyLog.TAG_REAL_SPORTS_REPO, "[getEventsByOrder] : ", th), new Object[0]);
        return Unit.a;
    }
}
