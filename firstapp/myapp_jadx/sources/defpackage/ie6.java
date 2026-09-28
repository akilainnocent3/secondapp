package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.captcha.CaptchaHeader;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.captcha.domain.CaptchaUseCase$captcha$captchaSingle$1$1$1", f = "CaptchaUseCase.kt", l = {HttpStatusCodesKt.HTTP_EARLY_HINTS}, m = "invokeSuspend", v = 2)
public final class ie6 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ Function1<CaptchaHeader, lyh<BaseResponse<Object>>> b;
    public final /* synthetic */ CaptchaHeader c;
    public final /* synthetic */ au90.a d;

    @c0d(c = "com.sporty.android.platform.features.captcha.domain.CaptchaUseCase$captcha$captchaSingle$1$1$1$1", f = "CaptchaUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<myh<? super BaseResponse<Object>>, Throwable, v1b<? super Unit>, Object> {
        public /* synthetic */ Throwable a;
        public final /* synthetic */ au90.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(au90.a aVar, v1b v1bVar) {
            super(3, v1bVar);
            this.b = aVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super BaseResponse<Object>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            a aVar = new a(this.b, v1bVar);
            aVar.a = th;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            iu90.b(this.b, th);
            return Unit.a;
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ au90.a a;

        public b(au90.a aVar) {
            this.a = aVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            iu90.a(this.a, (BaseResponse) obj);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie6(Function1 function1, CaptchaHeader captchaHeader, au90.a aVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = function1;
        this.c = captchaHeader;
        this.d = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ie6(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ie6) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            lyh<BaseResponse<Object>> lyhVarInvoke = this.b.invoke(this.c);
            au90.a aVar = this.d;
            yzh yzhVar = new yzh(lyhVarInvoke, new a(aVar, null));
            b bVar = new b(aVar);
            this.a = 1;
            if (yzhVar.collect(bVar, this) == y5bVar) {
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
