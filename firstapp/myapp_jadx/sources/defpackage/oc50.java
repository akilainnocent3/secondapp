package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.security.otp.OTPGeneralResult;
import com.sporty.android.core.model.security.otp.OTPVerificationRequest;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Loc50;", "Lnq50;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$RestPassword;", "Ld5z;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class oc50 extends nq50<OtpData.RestPassword> implements d5z {
    public final /* synthetic */ d5z H;
    public final pc80 I;
    public final kc50 J;

    public static final class a implements lyh<OTPGeneralResult> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: oc50$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.newotp.feature.restpassword.ResetPasswordReversOTPViewModel$completeAPIFlow$$inlined$map$1", f = "ResetPasswordReversOTPViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0927a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0927a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: oc50$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sporty.android.platform.features.newotp.feature.restpassword.ResetPasswordReversOTPViewModel$completeAPIFlow$$inlined$map$1$2", f = "ResetPasswordReversOTPViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0928a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0928a(v1b v1bVar) {
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
                C0928a c0928a;
                if (v1bVar instanceof C0928a) {
                    c0928a = (C0928a) v1bVar;
                    int i = c0928a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0928a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0928a = new C0928a(v1bVar);
                    }
                } else {
                    c0928a = new C0928a(v1bVar);
                }
                Object obj2 = c0928a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0928a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Object objB = n52.b((BaseResponse) obj);
                    c0928a.b = 1;
                    if (this.a.emit(objB, c0928a) == y5bVar) {
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
            C0927a c0927a;
            if (v1bVar instanceof C0927a) {
                c0927a = (C0927a) v1bVar;
                int i = c0927a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0927a.b = i - Integer.MIN_VALUE;
                } else {
                    c0927a = new C0927a(v1bVar);
                }
            } else {
                c0927a = new C0927a(v1bVar);
            }
            Object obj = c0927a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0927a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c0927a.b = 1;
                if (this.a.collect(bVar, c0927a) == y5bVar) {
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
    public oc50(fq50 fq50Var, pc80 pc80Var, kc50 kc50Var, rdd0 rdd0Var, d5z d5zVar) {
        super(fq50Var, rdd0Var);
        kc50Var.getClass();
        rdd0Var.getClass();
        d5zVar.getClass();
        this.H = d5zVar;
        this.I = pc80Var;
        this.J = kc50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.d5z
    public final lyh<lk50<Unit>> C() {
        return b42.D1(this.J.e(new OTPVerificationRequest("", "", ((OtpData.RestPassword) B1()).b, ((OtpData.RestPassword) B1()).a), (2 & 2) == 0, (2 & 4) == 0), new h910(this, 1));
    }

    @Override // defpackage.d5z
    public final <T> void K0(int i, T t, Function1<? super j7z.b<? extends T>, Unit> function1) {
        function1.getClass();
        this.H.K0(i, t, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nq50
    public final lyh<lk50<Unit>> K1(String str) {
        str.getClass();
        return b42.F1(bm50.a(new a(this.J.e(new OTPVerificationRequest(z1().b, str, ((OtpData.RestPassword) B1()).b, ((OtpData.RestPassword) B1()).a), (2 & 2) == 0, (2 & 4) == 0))), new f910(this, 1));
    }

    @Override // defpackage.nq50
    /* JADX INFO: renamed from: N1 */
    public final ResourceUiText getJ() {
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.common_otp_verify__continue_password_reset);
    }

    @Override // defpackage.d5z
    public final Object P0(boolean z, v1b<? super nc4> v1bVar) {
        return this.H.P0(z, v1bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nq50
    public final lyh<lk50<OTPResponse>> Q1(OtpSelection otpSelection) {
        return this.I.a(otpSelection, z1().b, j6c.RESET_PASSWORD, ((OtpData.RestPassword) B1()).a, ((OtpData.RestPassword) B1()).b);
    }

    @Override // defpackage.d5z
    public final void Y(int i, cp50 cp50Var, Function1<? super wo50.b, Unit> function1) {
        cp50Var.getClass();
        function1.getClass();
        this.H.Y(i, cp50Var, function1);
    }

    @Override // defpackage.d5z
    public final void e1() {
        this.H.e1();
    }

    @Override // defpackage.d5z
    public final <T> Object n1(qd4.c cVar, j6c j6cVar, T t, Function0<Unit> function0, Function0<Unit> function1, Function1<? super j7z.b<? extends T>, Unit> function2, Function0<? extends lyh<? extends lk50<Unit>>> function3, v1b<? super Unit> v1bVar) {
        return this.H.n1(cVar, j6cVar, t, function0, function1, function2, function3, v1bVar);
    }

    @Override // defpackage.d5z
    public final Object t(qd4.c cVar, j6c j6cVar, cp50 cp50Var, Function0<Unit> function0, Function0<Unit> function1, Function1<? super wo50.b, Unit> function2, Function0<? extends lyh<? extends lk50<Unit>>> function3, v1b<? super Unit> v1bVar) {
        return this.H.t(cVar, j6cVar, cp50Var, function0, function1, function2, function3, v1bVar);
    }
}
