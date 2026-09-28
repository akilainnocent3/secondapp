package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.captcha.domain.CaptchaUseCase$captcha$1", f = "CaptchaUseCase.kt", l = {122}, m = "invokeSuspend", v = 2)
public final class he6 extends tje0 implements Function2<ez20<? super BaseResponse<Object>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ema c;
    public final /* synthetic */ cu90 d;
    public final /* synthetic */ dq40<c9p> e;

    public static final class a extends fte<BaseResponse<Object>> {
        public final /* synthetic */ ez20<BaseResponse<Object>> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ez20<? super BaseResponse<Object>> ez20Var) {
            this.a = ez20Var;
        }

        @Override // defpackage.zu90
        public final void onError(Throwable th) {
            th.getClass();
            this.a.k(th);
        }

        @Override // defpackage.zu90
        public final void onSuccess(Object obj) {
            BaseResponse<Object> baseResponse = (BaseResponse) obj;
            baseResponse.getClass();
            this.a.c(baseResponse);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he6(ema emaVar, cu90 cu90Var, dq40 dq40Var, v1b v1bVar) {
        super(2, v1bVar);
        this.c = emaVar;
        this.d = cu90Var;
        this.e = dq40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        he6 he6Var = new he6(this.c, this.d, this.e, v1bVar);
        he6Var.b = obj;
        return he6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ez20<? super BaseResponse<Object>> ez20Var, v1b<? super Unit> v1bVar) {
        return ((he6) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ez20 ez20Var = (ez20) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            a aVar = new a(ez20Var);
            this.d.a(aVar);
            ema emaVar = this.c;
            emaVar.b(aVar);
            ge6 ge6Var = new ge6(0, this.e, emaVar);
            this.b = null;
            this.a = 1;
            if (az20.a(ez20Var, ge6Var, this) == y5bVar) {
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
