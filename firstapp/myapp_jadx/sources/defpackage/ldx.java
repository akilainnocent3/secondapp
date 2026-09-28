package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.security.otp.OTPUpdateNameResult;
import com.sporty.android.core.model.security.otp.OTPVerificationRequest;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lldx;", "Lp0g;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$NameUpdate;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ldx extends p0g<OtpData.NameUpdate> {
    public final lyz w;
    public final pc80 y;

    public static final class a implements lyh<OTPUpdateNameResult> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: ldx$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.newotp.feature.nameupdate.NameUpdateEmailViewModel$verifyFlow$$inlined$map$1", f = "NameUpdateEmailViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0810a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0810a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: ldx$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sporty.android.platform.features.newotp.feature.nameupdate.NameUpdateEmailViewModel$verifyFlow$$inlined$map$1$2", f = "NameUpdateEmailViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0811a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0811a(v1b v1bVar) {
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
                C0811a c0811a;
                if (v1bVar instanceof C0811a) {
                    c0811a = (C0811a) v1bVar;
                    int i = c0811a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0811a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0811a = new C0811a(v1bVar);
                    }
                } else {
                    c0811a = new C0811a(v1bVar);
                }
                Object obj2 = c0811a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0811a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Object objB = n52.b((BaseResponse) obj);
                    c0811a.b = 1;
                    if (this.a.emit(objB, c0811a) == y5bVar) {
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
            C0810a c0810a;
            if (v1bVar instanceof C0810a) {
                c0810a = (C0810a) v1bVar;
                int i = c0810a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0810a.b = i - Integer.MIN_VALUE;
                } else {
                    c0810a = new C0810a(v1bVar);
                }
            } else {
                c0810a = new C0810a(v1bVar);
            }
            Object obj = c0810a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0810a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c0810a.b = 1;
                if (this.a.collect(bVar, c0810a) == y5bVar) {
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
    public ldx(lyz lyzVar, pc80 pc80Var, rdd0 rdd0Var) {
        super(rdd0Var);
        lyzVar.getClass();
        rdd0Var.getClass();
        this.w = lyzVar;
        this.y = pc80Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p0g
    public final lyh<lk50<OTPResponse>> M1(OtpSelection otpSelection) {
        return this.y.a(otpSelection, z1().b, j6c.UPDATE_NAME, ((OtpData.NameUpdate) B1()).a, ((OtpData.NameUpdate) B1()).b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p0g
    public final lyh<lk50<Unit>> O1(String str) {
        return b42.F1(bm50.a(new a(this.w.W(new OTPVerificationRequest(z1().b, str, ((OtpData.NameUpdate) B1()).b, ((OtpData.NameUpdate) B1()).a)))), new ed0(this, 1));
    }
}
