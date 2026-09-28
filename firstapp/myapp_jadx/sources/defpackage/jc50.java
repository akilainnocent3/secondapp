package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.security.otp.CheckIsTrustedDeviceResponse;
import com.sporty.android.core.model.security.otp.OTPGeneralResult;
import com.sporty.android.core.model.security.otp.OTPVerificationRequest;
import com.sporty.android.core.model.security.otp.PhoneOTPSessionData;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Ljc50;", "Lc7z;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$RestPassword;", "Lnxg0;", "Lnd4;", "Ld5z;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jc50 extends c7z<OtpData.RestPassword> implements nxg0, nd4, d5z {
    public final /* synthetic */ nd4 A;
    public final /* synthetic */ d5z B;
    public final kc50 C;
    public final pc80 D;
    public final oxg0 E;

    public static final class a implements lyh<String> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: jc50$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.newotp.feature.restpassword.ResetPasswordOtpSelectorViewModel$getSessionFlow$$inlined$map$1", f = "ResetPasswordOtpSelectorViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0718a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0718a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: jc50$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sporty.android.platform.features.newotp.feature.restpassword.ResetPasswordOtpSelectorViewModel$getSessionFlow$$inlined$map$1$2", f = "ResetPasswordOtpSelectorViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0719a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0719a(v1b v1bVar) {
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
                C0719a c0719a;
                if (v1bVar instanceof C0719a) {
                    c0719a = (C0719a) v1bVar;
                    int i = c0719a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0719a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0719a = new C0719a(v1bVar);
                    }
                } else {
                    c0719a = new C0719a(v1bVar);
                }
                Object obj2 = c0719a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0719a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    String token = ((OTPGeneralResult) n52.b((BaseResponse) obj)).getToken();
                    c0719a.b = 1;
                    if (this.a.emit(token, c0719a) == y5bVar) {
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
        public final Object collect(myh<? super String> myhVar, v1b v1bVar) {
            C0718a c0718a;
            if (v1bVar instanceof C0718a) {
                c0718a = (C0718a) v1bVar;
                int i = c0718a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0718a.b = i - Integer.MIN_VALUE;
                } else {
                    c0718a = new C0718a(v1bVar);
                }
            } else {
                c0718a = new C0718a(v1bVar);
            }
            Object obj = c0718a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0718a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c0718a.b = 1;
                if (this.a.collect(bVar, c0718a) == y5bVar) {
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

    public static final class b implements lyh<OTPGeneralResult> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sporty.android.platform.features.newotp.feature.restpassword.ResetPasswordOtpSelectorViewModel$verifyWithTrustedDeviceFlow$$inlined$map$1", f = "ResetPasswordOtpSelectorViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return b.this.collect(null, this);
            }
        }

        /* JADX INFO: renamed from: jc50$b$b, reason: collision with other inner class name */
        public static final class C0720b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: jc50$b$b$a */
            @c0d(c = "com.sporty.android.platform.features.newotp.feature.restpassword.ResetPasswordOtpSelectorViewModel$verifyWithTrustedDeviceFlow$$inlined$map$1$2", f = "ResetPasswordOtpSelectorViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    return C0720b.this.emit(null, this);
                }
            }

            public C0720b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) throws SprThrowable {
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
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Object objB = n52.b((BaseResponse) obj);
                    aVar.b = 1;
                    if (this.a.emit(objB, aVar) == y5bVar) {
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

        public b(lyh lyhVar) {
            this.a = lyhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super OTPGeneralResult> myhVar, v1b v1bVar) {
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
                C0720b c0720b = new C0720b(myhVar);
                aVar.b = 1;
                if (this.a.collect(c0720b, aVar) == y5bVar) {
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
    public jc50(v8w v8wVar, kc50 kc50Var, pc80 pc80Var, oxg0 oxg0Var, rdd0 rdd0Var, nd4 nd4Var, d5z d5zVar) {
        super(v8wVar, rdd0Var);
        v8wVar.getClass();
        kc50Var.getClass();
        oxg0Var.getClass();
        rdd0Var.getClass();
        nd4Var.getClass();
        d5zVar.getClass();
        this.A = nd4Var;
        this.B = d5zVar;
        this.C = kc50Var;
        this.D = pc80Var;
        this.E = oxg0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.d5z
    public final lyh<lk50<Unit>> C() {
        return b42.D1(this.C.e(new OTPVerificationRequest("", "", ((OtpData.RestPassword) B1()).b, ((OtpData.RestPassword) B1()).a), (2 & 2) == 0, (2 & 4) == 0), new ic50(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nxg0
    public final lyh<lk50<Unit>> J() {
        return b42.F1(bm50.a(new b(this.C.e(new OTPVerificationRequest("", "", ((OtpData.RestPassword) B1()).b, ((OtpData.RestPassword) B1()).a), (2 & 2) == 0, (2 & 4) == 0))), new hz4(this, 1));
    }

    @Override // defpackage.d5z
    public final <T> void K0(int i, T t, Function1<? super j7z.b<? extends T>, Unit> function1) {
        function1.getClass();
        this.B.K0(i, t, function1);
    }

    @Override // defpackage.d5z
    public final Object P0(boolean z, v1b<? super nc4> v1bVar) {
        return this.B.P0(z, v1bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c7z
    public final lyh<String> P1() {
        return new a(this.C.c(new PhoneOTPSessionData(((OtpData.RestPassword) B1()).b, ((OtpData.RestPassword) B1()).a)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c7z
    public final lyh<lk50<OTPResponse>> U1(OtpSelection otpSelection) {
        otpSelection.getClass();
        return this.D.a(otpSelection, z1().b, j6c.RESET_PASSWORD, ((OtpData.RestPassword) B1()).a, ((OtpData.RestPassword) B1()).b);
    }

    @Override // defpackage.d5z
    public final void Y(int i, cp50 cp50Var, Function1<? super wo50.b, Unit> function1) {
        cp50Var.getClass();
        function1.getClass();
        this.B.Y(i, cp50Var, function1);
    }

    @Override // defpackage.d5z
    public final void e1() {
        this.B.e1();
    }

    @Override // defpackage.nd4
    public final Object i0(ArrayList arrayList, a7z.b.a aVar) {
        return this.A.i0(arrayList, aVar);
    }

    @Override // defpackage.d5z
    public final <T> Object n1(qd4.c cVar, j6c j6cVar, T t, Function0<Unit> function0, Function0<Unit> function1, Function1<? super j7z.b<? extends T>, Unit> function2, Function0<? extends lyh<? extends lk50<Unit>>> function3, v1b<? super Unit> v1bVar) {
        return this.B.n1(cVar, j6cVar, t, function0, function1, function2, function3, v1bVar);
    }

    @Override // defpackage.d5z
    public final Object t(qd4.c cVar, j6c j6cVar, cp50 cp50Var, Function0<Unit> function0, Function0<Unit> function1, Function1<? super wo50.b, Unit> function2, Function0<? extends lyh<? extends lk50<Unit>>> function3, v1b<? super Unit> v1bVar) {
        return this.B.t(cVar, j6cVar, cp50Var, function0, function1, function2, function3, v1bVar);
    }

    @Override // defpackage.nxg0
    public final lyh<CheckIsTrustedDeviceResponse> z() {
        return this.E.a(j6c.RESET_PASSWORD);
    }
}
