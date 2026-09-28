package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.security.otp.BindNewPhoneOTPSessionData;
import com.sporty.android.core.model.security.otp.OTPGeneralResult;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lq0e;", "Lc7z;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$PaymentCommonOtpData;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class q0e extends c7z<OtpData.PaymentCommonOtpData> {
    public final lyz A;
    public final u0e B;

    public static final class a implements lyh<String> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: q0e$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.newotp.feature.payment.addNewNumber.DepositMomoAddNewNumberOtpSelectorViewModel$getSessionFlow$$inlined$map$1", f = "DepositMomoAddNewNumberOtpSelectorViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0989a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0989a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: q0e$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sporty.android.platform.features.newotp.feature.payment.addNewNumber.DepositMomoAddNewNumberOtpSelectorViewModel$getSessionFlow$$inlined$map$1$2", f = "DepositMomoAddNewNumberOtpSelectorViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0990a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0990a(v1b v1bVar) {
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
                C0990a c0990a;
                if (v1bVar instanceof C0990a) {
                    c0990a = (C0990a) v1bVar;
                    int i = c0990a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0990a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0990a = new C0990a(v1bVar);
                    }
                } else {
                    c0990a = new C0990a(v1bVar);
                }
                Object obj2 = c0990a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0990a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    String token = ((OTPGeneralResult) n52.b((BaseResponse) obj)).getToken();
                    c0990a.b = 1;
                    if (this.a.emit(token, c0990a) == y5bVar) {
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
            C0989a c0989a;
            if (v1bVar instanceof C0989a) {
                c0989a = (C0989a) v1bVar;
                int i = c0989a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0989a.b = i - Integer.MIN_VALUE;
                } else {
                    c0989a = new C0989a(v1bVar);
                }
            } else {
                c0989a = new C0989a(v1bVar);
            }
            Object obj = c0989a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0989a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c0989a.b = 1;
                if (this.a.collect(bVar, c0989a) == y5bVar) {
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
    public q0e(v8w v8wVar, lyz lyzVar, u0e u0eVar, rdd0 rdd0Var) {
        super(v8wVar, rdd0Var);
        v8wVar.getClass();
        lyzVar.getClass();
        rdd0Var.getClass();
        this.A = lyzVar;
        this.B = u0eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c7z
    public final lyh<String> P1() {
        return new a(this.A.f(new BindNewPhoneOTPSessionData(((OtpData.PaymentCommonOtpData) B1()).a, ((OtpData.PaymentCommonOtpData) B1()).b)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c7z
    public final lyh<lk50<OTPResponse>> U1(OtpSelection otpSelection) {
        otpSelection.getClass();
        return this.B.a(otpSelection, z1().b, ((OtpData.PaymentCommonOtpData) B1()).b, ((OtpData.PaymentCommonOtpData) B1()).a);
    }
}
