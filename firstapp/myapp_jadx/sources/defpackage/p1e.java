package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.security.otp.CheckIsTrustedDeviceResponse;
import com.sporty.android.core.model.security.otp.OTPGeneralResult;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lp1e;", "Lc7z;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$VerifyPrimaryPhone;", "Lnxg0;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class p1e extends c7z<OtpData.VerifyPrimaryPhone> implements nxg0 {
    public final lyz A;
    public final u0i0 B;

    public static final class a implements lyh<String> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: p1e$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.newotp.feature.payment.addNewNumber.primaryPhone.DepositMomoPrimaryPhoneOtpSelectorViewModel$getSessionFlow$$inlined$map$1", f = "DepositMomoPrimaryPhoneOtpSelectorViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0958a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0958a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: p1e$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sporty.android.platform.features.newotp.feature.payment.addNewNumber.primaryPhone.DepositMomoPrimaryPhoneOtpSelectorViewModel$getSessionFlow$$inlined$map$1$2", f = "DepositMomoPrimaryPhoneOtpSelectorViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0959a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0959a(v1b v1bVar) {
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
                C0959a c0959a;
                if (v1bVar instanceof C0959a) {
                    c0959a = (C0959a) v1bVar;
                    int i = c0959a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0959a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0959a = new C0959a(v1bVar);
                    }
                } else {
                    c0959a = new C0959a(v1bVar);
                }
                Object obj2 = c0959a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0959a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    String token = ((OTPGeneralResult) n52.b((BaseResponse) obj)).getToken();
                    c0959a.b = 1;
                    if (this.a.emit(token, c0959a) == y5bVar) {
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
            C0958a c0958a;
            if (v1bVar instanceof C0958a) {
                c0958a = (C0958a) v1bVar;
                int i = c0958a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0958a.b = i - Integer.MIN_VALUE;
                } else {
                    c0958a = new C0958a(v1bVar);
                }
            } else {
                c0958a = new C0958a(v1bVar);
            }
            Object obj = c0958a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0958a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c0958a.b = 1;
                if (this.a.collect(bVar, c0958a) == y5bVar) {
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
    public p1e(v8w v8wVar, lyz lyzVar, rdd0 rdd0Var, u0i0 u0i0Var) {
        super(v8wVar, rdd0Var);
        v8wVar.getClass();
        lyzVar.getClass();
        rdd0Var.getClass();
        this.A = lyzVar;
        this.B = u0i0Var;
    }

    @Override // defpackage.nxg0
    public final lyh<lk50<Unit>> J() {
        return b42.F1(bm50.a(u0i0.b(this.B, "", "", 8)), new Function1() { // from class: o1e
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                p1e p1eVar = this.a;
                p1eVar.b = OtpData.VerifyPrimaryPhone.a((OtpData.VerifyPrimaryPhone) p1eVar.B1(), oTPResult);
                return Unit.a;
            }
        });
    }

    @Override // defpackage.c7z
    public final lyh<String> P1() {
        return new a(this.A.g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c7z
    public final lyh<lk50<OTPResponse>> U1(OtpSelection otpSelection) {
        otpSelection.getClass();
        return this.B.a(otpSelection, z1().b, ((OtpData.VerifyPrimaryPhone) B1()).b, ((OtpData.VerifyPrimaryPhone) B1()).a);
    }

    @Override // defpackage.nxg0
    public final lyh<CheckIsTrustedDeviceResponse> z() {
        return this.B.b.a(j6c.BIND_PHONE_PRIMARY);
    }
}
