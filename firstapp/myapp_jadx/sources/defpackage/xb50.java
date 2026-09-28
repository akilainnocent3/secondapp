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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lxb50;", "Lp0g;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$RestPassword;", "Ld5z;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xb50 extends p0g<OtpData.RestPassword> implements d5z {
    public final /* synthetic */ d5z w;
    public final pc80 y;
    public final kc50 z;

    public static final class a implements lyh<OTPGeneralResult> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: xb50$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.newotp.feature.restpassword.ResetPasswordEmailViewModel$verifyFlow$$inlined$map$1", f = "ResetPasswordEmailViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C1284a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1284a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: xb50$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sporty.android.platform.features.newotp.feature.restpassword.ResetPasswordEmailViewModel$verifyFlow$$inlined$map$1$2", f = "ResetPasswordEmailViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C1285a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1285a(v1b v1bVar) {
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
                C1285a c1285a;
                if (v1bVar instanceof C1285a) {
                    c1285a = (C1285a) v1bVar;
                    int i = c1285a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1285a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1285a = new C1285a(v1bVar);
                    }
                } else {
                    c1285a = new C1285a(v1bVar);
                }
                Object obj2 = c1285a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1285a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Object objB = n52.b((BaseResponse) obj);
                    c1285a.b = 1;
                    if (this.a.emit(objB, c1285a) == y5bVar) {
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
            C1284a c1284a;
            if (v1bVar instanceof C1284a) {
                c1284a = (C1284a) v1bVar;
                int i = c1284a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1284a.b = i - Integer.MIN_VALUE;
                } else {
                    c1284a = new C1284a(v1bVar);
                }
            } else {
                c1284a = new C1284a(v1bVar);
            }
            Object obj = c1284a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1284a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c1284a.b = 1;
                if (this.a.collect(bVar, c1284a) == y5bVar) {
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
    public xb50(pc80 pc80Var, kc50 kc50Var, rdd0 rdd0Var, d5z d5zVar) {
        super(rdd0Var);
        kc50Var.getClass();
        rdd0Var.getClass();
        d5zVar.getClass();
        this.w = d5zVar;
        this.y = pc80Var;
        this.z = kc50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.d5z
    public final lyh<lk50<Unit>> C() {
        return b42.D1(this.z.e(new OTPVerificationRequest("", "", ((OtpData.RestPassword) B1()).b, ((OtpData.RestPassword) B1()).a), (2 & 2) == 0, (2 & 4) == 0), new Function1() { // from class: vb50
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                xb50 xb50Var = this.a;
                xb50Var.b = OtpData.RestPassword.a((OtpData.RestPassword) xb50Var.B1(), oTPResult);
                return Unit.a;
            }
        });
    }

    @Override // defpackage.d5z
    public final <T> void K0(int i, T t, Function1<? super j7z.b<? extends T>, Unit> function1) {
        function1.getClass();
        this.w.K0(i, t, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p0g
    public final lyh<lk50<OTPResponse>> M1(OtpSelection otpSelection) {
        return this.y.a(otpSelection, z1().b, j6c.RESET_PASSWORD, ((OtpData.RestPassword) B1()).a, ((OtpData.RestPassword) B1()).b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p0g
    public final lyh<lk50<Unit>> O1(String str) {
        return b42.F1(bm50.a(new a(this.z.e(new OTPVerificationRequest(z1().b, str, ((OtpData.RestPassword) B1()).b, ((OtpData.RestPassword) B1()).a), (2 & 2) == 0, (2 & 4) == 0))), new wb50(this, 0));
    }

    @Override // defpackage.d5z
    public final Object P0(boolean z, v1b<? super nc4> v1bVar) {
        return this.w.P0(z, v1bVar);
    }

    @Override // defpackage.d5z
    public final void Y(int i, cp50 cp50Var, Function1<? super wo50.b, Unit> function1) {
        cp50Var.getClass();
        function1.getClass();
        this.w.Y(i, cp50Var, function1);
    }

    @Override // defpackage.d5z
    public final void e1() {
        this.w.e1();
    }

    @Override // defpackage.d5z
    public final <T> Object n1(qd4.c cVar, j6c j6cVar, T t, Function0<Unit> function0, Function0<Unit> function1, Function1<? super j7z.b<? extends T>, Unit> function2, Function0<? extends lyh<? extends lk50<Unit>>> function3, v1b<? super Unit> v1bVar) {
        return this.w.n1(cVar, j6cVar, t, function0, function1, function2, function3, v1bVar);
    }

    @Override // defpackage.d5z
    public final Object t(qd4.c cVar, j6c j6cVar, cp50 cp50Var, Function0<Unit> function0, Function0<Unit> function1, Function1<? super wo50.b, Unit> function2, Function0<? extends lyh<? extends lk50<Unit>>> function3, v1b<? super Unit> v1bVar) {
        return this.w.t(cVar, j6cVar, cp50Var, function0, function1, function2, function3, v1bVar);
    }
}
