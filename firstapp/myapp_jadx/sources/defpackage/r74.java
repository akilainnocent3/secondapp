package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.security.biometric.BioAuthOTPSessionToken;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lr74;", "Lc7z;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$BioAuth;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class r74 extends c7z<OtpData.BioAuth> {
    public final w74 A;
    public final pc80 B;

    public static final class a implements lyh<String> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: r74$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.newotp.feature.biometric.BioAuthOtpSelectionViewModel$getSessionFlow$$inlined$map$1", f = "BioAuthOtpSelectionViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C1036a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1036a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: r74$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sporty.android.platform.features.newotp.feature.biometric.BioAuthOtpSelectionViewModel$getSessionFlow$$inlined$map$1$2", f = "BioAuthOtpSelectionViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C1037a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1037a(v1b v1bVar) {
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
                C1037a c1037a;
                if (v1bVar instanceof C1037a) {
                    c1037a = (C1037a) v1bVar;
                    int i = c1037a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1037a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1037a = new C1037a(v1bVar);
                    }
                } else {
                    c1037a = new C1037a(v1bVar);
                }
                Object obj2 = c1037a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1037a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    String token = ((BioAuthOTPSessionToken) n52.b((BaseResponse) obj)).getToken();
                    c1037a.b = 1;
                    if (this.a.emit(token, c1037a) == y5bVar) {
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
            C1036a c1036a;
            if (v1bVar instanceof C1036a) {
                c1036a = (C1036a) v1bVar;
                int i = c1036a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1036a.b = i - Integer.MIN_VALUE;
                } else {
                    c1036a = new C1036a(v1bVar);
                }
            } else {
                c1036a = new C1036a(v1bVar);
            }
            Object obj = c1036a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1036a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c1036a.b = 1;
                if (this.a.collect(bVar, c1036a) == y5bVar) {
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
    public r74(w74 w74Var, pc80 pc80Var, v8w v8wVar, rdd0 rdd0Var) {
        super(v8wVar, rdd0Var);
        w74Var.getClass();
        v8wVar.getClass();
        rdd0Var.getClass();
        this.A = w74Var;
        this.B = pc80Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c7z
    public final lyh<String> P1() {
        return new a(this.A.d(((OtpData.BioAuth) B1()).a, ((OtpData.BioAuth) B1()).b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c7z
    public final lyh<lk50<OTPResponse>> U1(OtpSelection otpSelection) {
        otpSelection.getClass();
        return this.B.a(otpSelection, z1().b, j6c.BioRegister, ((OtpData.BioAuth) B1()).b, ((OtpData.BioAuth) B1()).a);
    }
}
