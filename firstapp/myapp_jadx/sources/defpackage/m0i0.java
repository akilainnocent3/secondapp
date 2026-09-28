package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.security.otp.CheckIsTrustedDeviceResponse;
import com.sporty.android.core.model.security.otp.OTPGeneralResult;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lm0i0;", "Lc7z;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$VerifyPrimaryPhone;", "Lnxg0;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class m0i0 extends c7z<OtpData.VerifyPrimaryPhone> implements nxg0 {
    public final lyz A;
    public final u0i0 B;

    public static final class a implements lyh<String> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: m0i0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.newotp.feature.verifyphoneforbonus.VerifyPhoneForBonusOtpSelectorViewModel$getSessionFlow$$inlined$map$1", f = "VerifyPhoneForBonusOtpSelectorViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0849a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0849a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: m0i0$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sporty.android.platform.features.newotp.feature.verifyphoneforbonus.VerifyPhoneForBonusOtpSelectorViewModel$getSessionFlow$$inlined$map$1$2", f = "VerifyPhoneForBonusOtpSelectorViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0850a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0850a(v1b v1bVar) {
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
                C0850a c0850a;
                if (v1bVar instanceof C0850a) {
                    c0850a = (C0850a) v1bVar;
                    int i = c0850a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0850a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0850a = new C0850a(v1bVar);
                    }
                } else {
                    c0850a = new C0850a(v1bVar);
                }
                Object obj2 = c0850a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0850a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    String token = ((OTPGeneralResult) n52.b((BaseResponse) obj)).getToken();
                    c0850a.b = 1;
                    if (this.a.emit(token, c0850a) == y5bVar) {
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
            C0849a c0849a;
            if (v1bVar instanceof C0849a) {
                c0849a = (C0849a) v1bVar;
                int i = c0849a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0849a.b = i - Integer.MIN_VALUE;
                } else {
                    c0849a = new C0849a(v1bVar);
                }
            } else {
                c0849a = new C0849a(v1bVar);
            }
            Object obj = c0849a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0849a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c0849a.b = 1;
                if (this.a.collect(bVar, c0849a) == y5bVar) {
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
    public m0i0(v8w v8wVar, lyz lyzVar, rdd0 rdd0Var, u0i0 u0i0Var) {
        super(v8wVar, rdd0Var);
        lyzVar.getClass();
        v8wVar.getClass();
        rdd0Var.getClass();
        this.A = lyzVar;
        this.B = u0i0Var;
    }

    @Override // defpackage.nxg0
    public final lyh<lk50<Unit>> J() {
        return b42.F1(bm50.a(u0i0.b(this.B, "", "", 8)), new Function1() { // from class: l0i0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                m0i0 m0i0Var = this.a;
                m0i0Var.b = OtpData.VerifyPrimaryPhone.a((OtpData.VerifyPrimaryPhone) m0i0Var.B1(), oTPResult);
                return Unit.a;
            }
        });
    }

    @Override // defpackage.c7z
    public final String M1() {
        return "https://s.sporty.net/cms/img_welcome_bonus_fcaf47887e.png";
    }

    @Override // defpackage.c7z
    public final UiText N1() {
        return vch0.c(R.string.common_otp_verify__verify_your_mobile_number_to_unlock_your_bonus, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c7z
    public final UiText O1() {
        int i = ((OtpData.VerifyPrimaryPhone) B1()).d;
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(i);
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
