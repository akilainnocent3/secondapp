package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.security.otp.OTPGeneralResult;
import com.sporty.android.core.model.security.otp.OTPVerificationRequest;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lfd50;", "Lecf0;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$RestPassword;", "Ld5z;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class fd50 extends ecf0<OtpData.RestPassword> implements d5z {
    public final pc80 A;
    public final kc50 B;
    public final /* synthetic */ d5z z;

    public static final class a implements lyh<OTPGeneralResult> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: fd50$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.newotp.feature.restpassword.ResetPasswordTelegramViewModel$verifyFlow$$inlined$map$1", f = "ResetPasswordTelegramViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0559a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0559a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: fd50$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sporty.android.platform.features.newotp.feature.restpassword.ResetPasswordTelegramViewModel$verifyFlow$$inlined$map$1$2", f = "ResetPasswordTelegramViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0560a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0560a(v1b v1bVar) {
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
                C0560a c0560a;
                if (v1bVar instanceof C0560a) {
                    c0560a = (C0560a) v1bVar;
                    int i = c0560a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0560a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0560a = new C0560a(v1bVar);
                    }
                } else {
                    c0560a = new C0560a(v1bVar);
                }
                Object obj2 = c0560a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0560a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Object objB = n52.b((BaseResponse) obj);
                    c0560a.b = 1;
                    if (this.a.emit(objB, c0560a) == y5bVar) {
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
        public final Object collect(myh<? super OTPGeneralResult> myhVar, v1b v1bVar) {
            C0559a c0559a;
            if (v1bVar instanceof C0559a) {
                c0559a = (C0559a) v1bVar;
                int i = c0559a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0559a.b = i - Integer.MIN_VALUE;
                } else {
                    c0559a = new C0559a(v1bVar);
                }
            } else {
                c0559a = new C0559a(v1bVar);
            }
            Object obj = c0559a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0559a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c0559a.b = 1;
                if (this.a.collect(bVar, c0559a) == y5bVar) {
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
    public fd50(pc80 pc80Var, kc50 kc50Var, rdd0 rdd0Var, d5z d5zVar) {
        super(rdd0Var);
        kc50Var.getClass();
        rdd0Var.getClass();
        d5zVar.getClass();
        this.z = d5zVar;
        this.A = pc80Var;
        this.B = kc50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.d5z
    public final lyh<lk50<Unit>> C() {
        return b42.D1(this.B.e(new OTPVerificationRequest("", "", ((OtpData.RestPassword) B1()).b, ((OtpData.RestPassword) B1()).a), (2 & 2) == 0, (2 & 4) == 0), new z910(this, 1));
    }

    @Override // defpackage.d5z
    public final <T> void K0(int i, T t, Function1<? super j7z.b<? extends T>, Unit> function1) {
        function1.getClass();
        this.z.K0(i, t, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ecf0
    public final lyh<lk50<OTPResponse>> N1(OtpSelection otpSelection) {
        return this.A.a(otpSelection, z1().b, j6c.RESET_PASSWORD, ((OtpData.RestPassword) B1()).a, ((OtpData.RestPassword) B1()).b);
    }

    @Override // defpackage.d5z
    public final Object P0(boolean z, v1b<? super nc4> v1bVar) {
        return this.z.P0(z, v1bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ecf0
    public final lyh<lk50<Unit>> P1(String str) {
        return b42.F1(bm50.a(new a(this.B.e(new OTPVerificationRequest(z1().b, str, ((OtpData.RestPassword) B1()).b, ((OtpData.RestPassword) B1()).a), (2 & 2) == 0, (2 & 4) == 0))), new Function1() { // from class: ed50
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                fd50 fd50Var = this.a;
                fd50Var.b = OtpData.RestPassword.a((OtpData.RestPassword) fd50Var.B1(), oTPResult);
                return Unit.a;
            }
        });
    }

    @Override // defpackage.d5z
    public final void Y(int i, cp50 cp50Var, Function1<? super wo50.b, Unit> function1) {
        cp50Var.getClass();
        function1.getClass();
        this.z.Y(i, cp50Var, function1);
    }

    @Override // defpackage.d5z
    public final void e1() {
        this.z.e1();
    }

    @Override // defpackage.d5z
    public final <T> Object n1(qd4.c cVar, j6c j6cVar, T t, Function0<Unit> function0, Function0<Unit> function1, Function1<? super j7z.b<? extends T>, Unit> function2, Function0<? extends lyh<? extends lk50<Unit>>> function3, v1b<? super Unit> v1bVar) {
        return this.z.n1(cVar, j6cVar, t, function0, function1, function2, function3, v1bVar);
    }

    @Override // defpackage.d5z
    public final Object t(qd4.c cVar, j6c j6cVar, cp50 cp50Var, Function0<Unit> function0, Function0<Unit> function1, Function1<? super wo50.b, Unit> function2, Function0<? extends lyh<? extends lk50<Unit>>> function3, v1b<? super Unit> v1bVar) {
        return this.z.t(cVar, j6cVar, cp50Var, function0, function1, function2, function3, v1bVar);
    }
}
