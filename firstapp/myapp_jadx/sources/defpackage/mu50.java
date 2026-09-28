package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.pocketrocket.model.response.RoundDetailResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.pocketrocket.data.RocketRepository$getRoundDetail$2", f = "RocketRepository.kt", l = {HttpStatusCodesKt.HTTP_PROCESSING}, m = "invokeSuspend", v = 1)
public final class mu50 extends tje0 implements Function1<v1b<? super HTTPResponse<RoundDetailResponse>>, Object> {
    public int a;
    public final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu50(long j, v1b<? super mu50> v1bVar) {
        super(1, v1bVar);
        this.b = j;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new mu50(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<RoundDetailResponse>> v1bVar) {
        return ((mu50) create(v1bVar)).invokeSuspend(Unit.a);
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
        au50 au50VarM = on0.m();
        this.a = 1;
        Object objG = au50VarM.g(this.b, this);
        return objG == y5bVar ? y5bVar : objG;
    }
}
