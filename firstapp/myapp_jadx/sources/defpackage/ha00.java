package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.crypto.IURC.iKBWavCysVP;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class ha00 {
    public final g600 a;
    public jvd0 b;
    public jvd0 c;
    public jvd0 d;
    public jvd0 e;

    public static final class a implements lyh<lk50<? extends BaseResponse<BankTradeData>>> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: ha00$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.basepay.usecase.PaymentUseCase$getBankTrade$$inlined$map$1", f = "PaymentUseCase.kt", l = {109}, m = "collect", v = 2)
        public static final class C0629a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0629a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: ha00$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.android.basepay.usecase.PaymentUseCase$getBankTrade$$inlined$map$1$2", f = "PaymentUseCase.kt", l = {50}, m = "emit", v = 2)
            public static final class C0630a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0630a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0630a c0630a;
                if (v1bVar instanceof C0630a) {
                    c0630a = (C0630a) v1bVar;
                    int i = c0630a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0630a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0630a = new C0630a(v1bVar);
                    }
                } else {
                    c0630a = new C0630a(v1bVar);
                }
                Object obj2 = c0630a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0630a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    lk50.c cVar = new lk50.c((BaseResponse) obj);
                    c0630a.b = 1;
                    if (this.a.emit(cVar, c0630a) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public a(lyh lyhVar) {
            this.a = lyhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super lk50<? extends BaseResponse<BankTradeData>>> myhVar, v1b v1bVar) {
            C0629a c0629a;
            if (v1bVar instanceof C0629a) {
                c0629a = (C0629a) v1bVar;
                int i = c0629a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0629a.b = i - Integer.MIN_VALUE;
                } else {
                    c0629a = new C0629a(v1bVar);
                }
            } else {
                c0629a = new C0629a(v1bVar);
            }
            Object obj = c0629a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0629a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c0629a.b = 1;
                if (this.a.collect(bVar, c0629a) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @c0d(c = "com.sportybet.android.basepay.usecase.PaymentUseCase$getBankTrade$2", f = "PaymentUseCase.kt", l = {73}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<myh<? super lk50<? extends BaseResponse<BankTradeData>>>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(2, v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super lk50<? extends BaseResponse<BankTradeData>>> myhVar, v1b<? super Unit> v1bVar) {
            return ((b) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                    ib5.a(iKBWavCysVP.KPJZFoSBuLl);
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.basepay.usecase.PaymentUseCase$getBankTrade$3", f = "PaymentUseCase.kt", l = {75}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super lk50<? extends BaseResponse<BankTradeData>>>, Throwable, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Throwable c;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super lk50<? extends BaseResponse<BankTradeData>>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            c cVar = new c(3, v1bVar);
            cVar.b = myhVar;
            cVar.c = th;
            return cVar.invokeSuspend(Unit.a);
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

    @c0d(c = "com.sportybet.android.basepay.usecase.PaymentUseCase$getBankTrade$4", f = "PaymentUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<lk50<? extends BaseResponse<BankTradeData>>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ Function1<lk50<? extends BaseResponse<BankTradeData>>, Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super lk50<? extends BaseResponse<BankTradeData>>, Unit> function1, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.b = function1;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = new d(this.b, v1bVar);
            dVar.a = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends BaseResponse<BankTradeData>> lk50Var, v1b<? super Unit> v1bVar) {
            return ((d) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50<? extends BaseResponse<BankTradeData>> lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.b.invoke(lk50Var);
            return Unit.a;
        }
    }

    public ha00(g600 g600Var) {
        g600Var.getClass();
        this.a = g600Var;
    }

    public final void a(v5b v5bVar, String str, Function1<? super lk50<? extends BaseResponse<BankTradeData>>, Unit> function1) {
        v5bVar.getClass();
        str.getClass();
        jvd0 jvd0Var = this.d;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.d = kzh.d(new g1i(new yzh(new xzh(new a(this.a.c(str)), new b(2, null)), new c(3, null)), new d(function1, null)), v5bVar);
    }

    public final void b(et7 et7Var, Function1 function1) {
        jvd0 jvd0Var = this.e;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.e = kzh.d(new g1i(new yzh(new xzh(new ia00(this.a.b()), new ja00(2, null)), new ka00(3, null)), new la00(function1, null)), et7Var);
    }
}
