package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Laex;", "Lx2a0;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$NameUpdate;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class aex extends x2a0<OtpData.NameUpdate> {
    public final lyz B;
    public final pc80 C;

    public static final class a implements lyh<OTPUpdateNameResult> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: aex$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.newotp.feature.nameupdate.NameUpdateSmsViewModel$verifyFlow$$inlined$map$1", f = "NameUpdateSmsViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0016a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0016a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: aex$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sporty.android.platform.features.newotp.feature.nameupdate.NameUpdateSmsViewModel$verifyFlow$$inlined$map$1$2", f = "NameUpdateSmsViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0017a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0017a(v1b v1bVar) {
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
                C0017a c0017a;
                if (v1bVar instanceof C0017a) {
                    c0017a = (C0017a) v1bVar;
                    int i = c0017a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0017a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0017a = new C0017a(v1bVar);
                    }
                } else {
                    c0017a = new C0017a(v1bVar);
                }
                Object obj2 = c0017a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0017a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Object objB = n52.b((BaseResponse) obj);
                    c0017a.b = 1;
                    if (this.a.emit(objB, c0017a) == y5bVar) {
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
            C0016a c0016a;
            if (v1bVar instanceof C0016a) {
                c0016a = (C0016a) v1bVar;
                int i = c0016a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0016a.b = i - Integer.MIN_VALUE;
                } else {
                    c0016a = new C0016a(v1bVar);
                }
            } else {
                c0016a = new C0016a(v1bVar);
            }
            Object obj = c0016a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0016a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c0016a.b = 1;
                if (this.a.collect(bVar, c0016a) == y5bVar) {
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
    public aex(@Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar, lyz lyzVar, pc80 pc80Var, rdd0 rdd0Var) {
        super(oddVar, rdd0Var);
        lyzVar.getClass();
        rdd0Var.getClass();
        this.B = lyzVar;
        this.C = pc80Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x2a0
    public final lyh<lk50<OTPResponse>> N1(OtpSelection otpSelection) {
        return this.C.a(otpSelection, z1().b, j6c.UPDATE_NAME, ((OtpData.NameUpdate) B1()).a, ((OtpData.NameUpdate) B1()).b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x2a0
    public final lyh<lk50<Unit>> P1(String str) {
        return b42.F1(bm50.a(new a(this.B.W(new OTPVerificationRequest(z1().b, str, ((OtpData.NameUpdate) B1()).b, ((OtpData.NameUpdate) B1()).a)))), new Function1() { // from class: zdx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                aex aexVar = this.a;
                aexVar.b = OtpData.NameUpdate.a((OtpData.NameUpdate) aexVar.B1(), oTPResult);
                return Unit.a;
            }
        });
    }
}
