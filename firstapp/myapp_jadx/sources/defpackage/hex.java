package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.security.otp.OTPUpdateNameResult;
import com.sporty.android.core.model.security.otp.OTPVerificationRequest;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lhex;", "Lgoi0;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$NameUpdate;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hex extends goi0<OtpData.NameUpdate> {
    public final pc80 A;
    public final lyz z;

    public static final class a implements lyh<OTPUpdateNameResult> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: hex$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.newotp.feature.nameupdate.NameUpdateVoiceViewModel$verifyFlow$$inlined$map$1", f = "NameUpdateVoiceViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0639a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0639a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: hex$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sporty.android.platform.features.newotp.feature.nameupdate.NameUpdateVoiceViewModel$verifyFlow$$inlined$map$1$2", f = "NameUpdateVoiceViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0640a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0640a(v1b v1bVar) {
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
                C0640a c0640a;
                if (v1bVar instanceof C0640a) {
                    c0640a = (C0640a) v1bVar;
                    int i = c0640a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0640a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0640a = new C0640a(v1bVar);
                    }
                } else {
                    c0640a = new C0640a(v1bVar);
                }
                Object obj2 = c0640a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0640a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Object objB = n52.b((BaseResponse) obj);
                    c0640a.b = 1;
                    if (this.a.emit(objB, c0640a) == y5bVar) {
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
            C0639a c0639a;
            if (v1bVar instanceof C0639a) {
                c0639a = (C0639a) v1bVar;
                int i = c0639a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0639a.b = i - Integer.MIN_VALUE;
                } else {
                    c0639a = new C0639a(v1bVar);
                }
            } else {
                c0639a = new C0639a(v1bVar);
            }
            Object obj = c0639a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0639a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c0639a.b = 1;
                if (this.a.collect(bVar, c0639a) == y5bVar) {
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
    public hex(lyz lyzVar, pc80 pc80Var, rdd0 rdd0Var) {
        super(rdd0Var);
        lyzVar.getClass();
        rdd0Var.getClass();
        this.z = lyzVar;
        this.A = pc80Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.goi0
    public final lyh<lk50<OTPResponse>> M1(OtpSelection otpSelection) {
        return this.A.a(otpSelection, z1().b, j6c.UPDATE_NAME, ((OtpData.NameUpdate) B1()).a, ((OtpData.NameUpdate) B1()).b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.goi0
    public final lyh<lk50<Unit>> O1(String str) {
        return b42.F1(bm50.a(new a(this.z.W(new OTPVerificationRequest(z1().b, str, ((OtpData.NameUpdate) B1()).b, ((OtpData.NameUpdate) B1()).a)))), new Function1() { // from class: gex
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                hex hexVar = this.a;
                hexVar.b = OtpData.NameUpdate.a((OtpData.NameUpdate) hexVar.B1(), oTPResult);
                return Unit.a;
            }
        });
    }
}
