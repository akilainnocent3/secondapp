package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.feature.luckynumber.placebet.data.data.LNPlaceBetDTO;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.domain.PlaceBetUseCase$invoke$betFlow$2", f = "PlaceBetUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zh10 extends tje0 implements Function2<BaseResponse<LNPlaceBetDTO>, v1b<? super lyh<? extends LNPlaceBetDTO>>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ai10 b;

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.domain.PlaceBetUseCase$invoke$betFlow$2$1", f = "PlaceBetUseCase.kt", l = {68}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<myh<? super rkd0>, Throwable, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super rkd0> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            a aVar = new a(3, v1bVar);
            aVar.b = myhVar;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            myh myhVar = this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                rkd0.Companion.getClass();
                rkd0 rkd0Var = new rkd0(rkd0.b);
                this.b = null;
                this.a = 1;
                if (myhVar.emit(rkd0Var, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.domain.PlaceBetUseCase$invoke$betFlow$2$2", f = "PlaceBetUseCase.kt", l = {69}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<myh<? super qcn<? extends ocq>>, Throwable, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super qcn<? extends ocq>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            b bVar = new b(3, v1bVar);
            bVar.b = myhVar;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            myh myhVar = this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                n1a0 n1a0Var = n1a0.c;
                this.b = null;
                this.a = 1;
                if (myhVar.emit(n1a0Var, this) == y5bVar) {
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

    public static final class c implements lyh<LNPlaceBetDTO> {
        public final /* synthetic */ lyh[] a;
        public final /* synthetic */ LNPlaceBetDTO b;

        @c0d(c = "com.sportybet.feature.luckynumber.placebet.domain.PlaceBetUseCase$invoke$betFlow$2$invokeSuspend$$inlined$combine$1", f = "PlaceBetUseCase.kt", l = {109}, m = "collect", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public static final class b implements Function0<Object[]> {
            public final /* synthetic */ lyh[] a;

            public b(lyh[] lyhVarArr) {
                this.a = lyhVarArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new Object[2];
            }
        }

        /* JADX INFO: renamed from: zh10$c$c, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.placebet.domain.PlaceBetUseCase$invoke$betFlow$2$invokeSuspend$$inlined$combine$1$3", f = "PlaceBetUseCase.kt", l = {234}, m = "invokeSuspend", v = 2)
        public static final class C1393c extends tje0 implements gaj<myh<? super LNPlaceBetDTO>, Object[], v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ myh b;
            public /* synthetic */ Object[] c;
            public final /* synthetic */ LNPlaceBetDTO d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1393c(v1b v1bVar, LNPlaceBetDTO lNPlaceBetDTO) {
                super(3, v1bVar);
                this.d = lNPlaceBetDTO;
            }

            @Override // defpackage.gaj
            public final Object invoke(myh<? super LNPlaceBetDTO> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
                C1393c c1393c = new C1393c(v1bVar, this.d);
                c1393c.b = myhVar;
                c1393c.c = objArr;
                return c1393c.invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    myh myhVar = this.b;
                    this.b = null;
                    this.c = null;
                    this.a = 1;
                    if (myhVar.emit(this.d, this) == y5bVar) {
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

        public c(lyh[] lyhVarArr, LNPlaceBetDTO lNPlaceBetDTO) {
            this.a = lyhVarArr;
            this.b = lNPlaceBetDTO;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super LNPlaceBetDTO> myhVar, v1b v1bVar) {
            a aVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj);
                lyh[] lyhVarArr = this.a;
                b bVar = new b(lyhVarArr);
                C1393c c1393c = new C1393c(null, this.b);
                aVar.b = 1;
                if (r78.a(aVar, myhVar, c1393c, bVar, lyhVarArr) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh10(ai10 ai10Var, v1b<? super zh10> v1bVar) {
        super(2, v1bVar);
        this.b = ai10Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        zh10 zh10Var = new zh10(this.b, v1bVar);
        zh10Var.a = obj;
        return zh10Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BaseResponse<LNPlaceBetDTO> baseResponse, v1b<? super lyh<? extends LNPlaceBetDTO>> v1bVar) {
        return ((zh10) create(baseResponse, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BaseResponse baseResponse = (BaseResponse) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        LNPlaceBetDTO lNPlaceBetDTO = (LNPlaceBetDTO) n52.b(baseResponse);
        ai10 ai10Var = this.b;
        return new c(new lyh[]{new yzh(ai10Var.b.a(), new a(3, null)), new yzh(ai10Var.d.c.e(), new b(3, null))}, lNPlaceBetDTO);
    }
}
