package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.captcha.CaptchaData;
import com.sporty.android.core.model.captcha.CaptchaHeader;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.captcha.domain.CaptchaUseCase$captchaFlow$1", f = "CaptchaUseCase.kt", l = {156}, m = "invokeSuspend", v = 2)
public final class me6 extends tje0 implements Function2<ez20<? super BaseResponse<Object>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ema c;
    public final /* synthetic */ fe6 d;
    public final /* synthetic */ j6c e;
    public final /* synthetic */ CaptchaData f;
    public final /* synthetic */ dq40<c9p> i;
    public final /* synthetic */ Function1<CaptchaHeader, lyh<BaseResponse<Object>>> v;

    @c0d(c = "com.sporty.android.platform.features.captcha.domain.CaptchaUseCase$captchaFlow$1$1$1$1", f = "CaptchaUseCase.kt", l = {141}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function1<CaptchaHeader, lyh<BaseResponse<Object>>> b;
        public final /* synthetic */ CaptchaHeader c;
        public final /* synthetic */ au90.a d;

        /* JADX INFO: renamed from: me6$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.captcha.domain.CaptchaUseCase$captchaFlow$1$1$1$1$1", f = "CaptchaUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0867a extends tje0 implements gaj<myh<? super BaseResponse<Object>>, Throwable, v1b<? super Unit>, Object> {
            public /* synthetic */ Throwable a;
            public final /* synthetic */ au90.a b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0867a(au90.a aVar, v1b v1bVar) {
                super(3, v1bVar);
                this.b = aVar;
            }

            @Override // defpackage.gaj
            public final Object invoke(myh<? super BaseResponse<Object>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
                C0867a c0867a = new C0867a(this.b, v1bVar);
                c0867a.a = th;
                return c0867a.invokeSuspend(Unit.a);
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
        public a(Function1 function1, CaptchaHeader captchaHeader, au90.a aVar, v1b v1bVar) {
            super(2, v1bVar);
            this.b = function1;
            this.c = captchaHeader;
            this.d = aVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                lyh<BaseResponse<Object>> lyhVarInvoke = this.b.invoke(this.c);
                au90.a aVar = this.d;
                yzh yzhVar = new yzh(lyhVarInvoke, new C0867a(aVar, null));
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

    public static final class b extends fte<BaseResponse<Object>> {
        public final /* synthetic */ ez20<BaseResponse<Object>> a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(ez20<? super BaseResponse<Object>> ez20Var) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public me6(ema emaVar, fe6 fe6Var, j6c j6cVar, CaptchaData captchaData, dq40<c9p> dq40Var, Function1<? super CaptchaHeader, ? extends lyh<? extends BaseResponse<Object>>> function1, v1b<? super me6> v1bVar) {
        super(2, v1bVar);
        this.c = emaVar;
        this.d = fe6Var;
        this.e = j6cVar;
        this.f = captchaData;
        this.i = dq40Var;
        this.v = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        me6 me6Var = new me6(this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
        me6Var.b = obj;
        return me6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ez20<? super BaseResponse<Object>> ez20Var, v1b<? super Unit> v1bVar) {
        return ((me6) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        final ez20 ez20Var = (ez20) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            final dq40<c9p> dq40Var = this.i;
            final Function1<CaptchaHeader, lyh<BaseResponse<Object>>> function1 = this.v;
            cu90 cu90VarC = this.d.c(this.e, this.f, new Function1() { // from class: je6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    final CaptchaHeader captchaHeader = (CaptchaHeader) obj2;
                    final dq40 dq40Var2 = dq40Var;
                    final ez20 ez20Var2 = ez20Var;
                    final Function1 function2 = function1;
                    return new au90(new bv90() { // from class: le6
                        /* JADX WARN: Type inference failed for: r5v2, types: [T, jvd0] */
                        @Override // defpackage.bv90
                        public final void a(au90.a aVar) {
                            dq40Var2.a = ej5.c(ez20Var2, null, null, new me6.a(function2, captchaHeader, aVar, null), 3);
                        }
                    });
                }
            });
            b bVar = new b(ez20Var);
            cu90VarC.a(bVar);
            final ema emaVar = this.c;
            emaVar.b(bVar);
            Function0 function0 = new Function0() { // from class: ke6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    c9p c9pVar = (c9p) dq40Var.a;
                    if (c9pVar != null) {
                        c9pVar.cancel((CancellationException) null);
                    }
                    emaVar.d();
                    return Unit.a;
                }
            };
            this.b = null;
            this.a = 1;
            if (az20.a(ez20Var, function0, this) == y5bVar) {
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
