package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.core.model.security.otp.OTPUpdateNameResult;
import com.sporty.android.core.model.security.otp.OTPVerificationRequest;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lxdx;", "Lnq50;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$NameUpdate;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xdx extends nq50<OtpData.NameUpdate> {
    public final lyz H;
    public final pc80 I;
    public final ResourceUiText J;

    public static final class a implements lyh<OTPUpdateNameResult> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: xdx$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.newotp.feature.nameupdate.NameUpdateReversOtpViewModel$completeAPIFlow$$inlined$map$1", f = "NameUpdateReversOtpViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C1288a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1288a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: xdx$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sporty.android.platform.features.newotp.feature.nameupdate.NameUpdateReversOtpViewModel$completeAPIFlow$$inlined$map$1$2", f = "NameUpdateReversOtpViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C1289a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1289a(v1b v1bVar) {
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
                C1289a c1289a;
                if (v1bVar instanceof C1289a) {
                    c1289a = (C1289a) v1bVar;
                    int i = c1289a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1289a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1289a = new C1289a(v1bVar);
                    }
                } else {
                    c1289a = new C1289a(v1bVar);
                }
                Object obj2 = c1289a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1289a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Object objB = n52.b((BaseResponse) obj);
                    c1289a.b = 1;
                    if (this.a.emit(objB, c1289a) == y5bVar) {
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
        public final Object collect(myh<? super OTPUpdateNameResult> myhVar, v1b v1bVar) {
            C1288a c1288a;
            if (v1bVar instanceof C1288a) {
                c1288a = (C1288a) v1bVar;
                int i = c1288a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1288a.b = i - Integer.MIN_VALUE;
                } else {
                    c1288a = new C1288a(v1bVar);
                }
            } else {
                c1288a = new C1288a(v1bVar);
            }
            Object obj = c1288a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1288a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c1288a.b = 1;
                if (this.a.collect(bVar, c1288a) == y5bVar) {
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
    public xdx(fq50 fq50Var, lyz lyzVar, pc80 pc80Var, rdd0 rdd0Var) {
        super(fq50Var, rdd0Var);
        lyzVar.getClass();
        rdd0Var.getClass();
        this.H = lyzVar;
        this.I = pc80Var;
        this.J = new ResourceUiText(R.string.common_otp_verify__continue_to_change_account_name);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nq50
    public final lyh<lk50<Unit>> K1(String str) {
        str.getClass();
        return b42.F1(bm50.a(new a(this.H.W(new OTPVerificationRequest(z1().b, str, ((OtpData.NameUpdate) B1()).b, ((OtpData.NameUpdate) B1()).a)))), new j2j(this, 1));
    }

    @Override // defpackage.nq50
    /* JADX INFO: renamed from: N1, reason: from getter */
    public final ResourceUiText getJ() {
        return this.J;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nq50
    public final lyh<lk50<OTPResponse>> Q1(OtpSelection otpSelection) {
        return this.I.a(otpSelection, z1().b, j6c.UPDATE_NAME, ((OtpData.NameUpdate) B1()).a, ((OtpData.NameUpdate) B1()).b);
    }
}
