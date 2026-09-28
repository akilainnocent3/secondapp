package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.activity.oddsformat.OddsFormatUseCase$onOddsFormatSelected$1", f = "OddsFormatUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class yjy extends tje0 implements Function2<BaseResponse<Unit>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ zjy b;
    public final /* synthetic */ ljy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yjy(zjy zjyVar, ljy ljyVar, v1b<? super yjy> v1bVar) {
        super(2, v1bVar);
        this.b = zjyVar;
        this.c = ljyVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yjy yjyVar = new yjy(this.b, this.c, v1bVar);
        yjyVar.a = obj;
        return yjyVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BaseResponse<Unit> baseResponse, v1b<? super Unit> v1bVar) {
        return ((yjy) create(baseResponse, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BaseResponse baseResponse = (BaseResponse) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (baseResponse.isSuccessful()) {
            zjy zjyVar = this.b;
            zjyVar.getClass();
            ljy ljyVar = this.c;
            ljyVar.getClass();
            gky.d(zjyVar.a, ljyVar);
        }
        return Unit.a;
    }
}
