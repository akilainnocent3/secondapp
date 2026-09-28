package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.security.otp.CheckIsTrustedDeviceResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class oxg0 {
    public final lyz a;
    public final uqm b;

    public static final class a implements lyh<CheckIsTrustedDeviceResponse> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: oxg0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.newotp.domain.TrustedDeviceUseCase$invoke$$inlined$map$1", f = "TrustedDeviceUseCase.kt", l = {109}, m = "collect", v = 2)
        public static final class C0951a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0951a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: oxg0$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sporty.android.platform.features.newotp.domain.TrustedDeviceUseCase$invoke$$inlined$map$1$2", f = "TrustedDeviceUseCase.kt", l = {50}, m = "emit", v = 2)
            public static final class C0952a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0952a(v1b v1bVar) {
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
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) throws SprThrowable {
                C0952a c0952a;
                if (v1bVar instanceof C0952a) {
                    c0952a = (C0952a) v1bVar;
                    int i = c0952a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0952a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0952a = new C0952a(v1bVar);
                    }
                } else {
                    c0952a = new C0952a(v1bVar);
                }
                Object obj2 = c0952a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0952a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Object objB = n52.b((BaseResponse) obj);
                    c0952a.b = 1;
                    if (this.a.emit(objB, c0952a) == y5bVar) {
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
        public final Object collect(myh<? super CheckIsTrustedDeviceResponse> myhVar, v1b v1bVar) {
            C0951a c0951a;
            if (v1bVar instanceof C0951a) {
                c0951a = (C0951a) v1bVar;
                int i = c0951a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0951a.b = i - Integer.MIN_VALUE;
                } else {
                    c0951a = new C0951a(v1bVar);
                }
            } else {
                c0951a = new C0951a(v1bVar);
            }
            Object obj = c0951a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0951a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c0951a.b = 1;
                if (this.a.collect(bVar, c0951a) == y5bVar) {
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

    @c0d(c = "com.sporty.android.platform.features.newotp.domain.TrustedDeviceUseCase$invoke$2", f = "TrustedDeviceUseCase.kt", l = {24}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<myh<? super CheckIsTrustedDeviceResponse>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(2, v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super CheckIsTrustedDeviceResponse> myhVar, v1b<? super Unit> v1bVar) {
            return ((b) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            myh myhVar = (myh) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                CheckIsTrustedDeviceResponse checkIsTrustedDeviceResponse = new CheckIsTrustedDeviceResponse(false);
                this.b = null;
                this.a = 1;
                if (myhVar.emit(checkIsTrustedDeviceResponse, this) == y5bVar) {
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

    public oxg0(lyz lyzVar, uqm uqmVar) {
        lyzVar.getClass();
        uqmVar.getClass();
        this.a = lyzVar;
        this.b = uqmVar;
    }

    public final lyh<CheckIsTrustedDeviceResponse> a(j6c j6cVar) {
        return this.b.isLogin() ? new a(this.a.v(j6cVar)) : new or60(new b(2, null));
    }
}
