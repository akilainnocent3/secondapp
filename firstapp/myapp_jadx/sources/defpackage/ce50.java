package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.security.otp.CheckIsTrustedDeviceResponse;
import com.sporty.android.core.model.security.otp.ResetSportyPINResult;
import com.sporty.android.core.model.security.otp.SportyPinSessionToken;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lce50;", "Lc7z;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$ResetPin;", "Lnxg0;", "Lnd4;", "Ld5z;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ce50 extends c7z<OtpData.ResetPin> implements nxg0, nd4, d5z {
    public final /* synthetic */ nd4 A;
    public final /* synthetic */ d5z B;
    public final lyz C;
    public final pc80 D;
    public final oxg0 E;

    public static final class a implements lyh<String> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: ce50$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.newotp.feature.resetpin.ResetPinOtpSelectorViewModel$getSessionFlow$$inlined$map$1", f = "ResetPinOtpSelectorViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0159a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0159a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: ce50$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sporty.android.platform.features.newotp.feature.resetpin.ResetPinOtpSelectorViewModel$getSessionFlow$$inlined$map$1$2", f = "ResetPinOtpSelectorViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0160a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0160a(v1b v1bVar) {
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
                C0160a c0160a;
                if (v1bVar instanceof C0160a) {
                    c0160a = (C0160a) v1bVar;
                    int i = c0160a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0160a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0160a = new C0160a(v1bVar);
                    }
                } else {
                    c0160a = new C0160a(v1bVar);
                }
                Object obj2 = c0160a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0160a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    String token = ((SportyPinSessionToken) n52.b((BaseResponse) obj)).getToken();
                    c0160a.b = 1;
                    if (this.a.emit(token, c0160a) == y5bVar) {
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
            C0159a c0159a;
            if (v1bVar instanceof C0159a) {
                c0159a = (C0159a) v1bVar;
                int i = c0159a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0159a.b = i - Integer.MIN_VALUE;
                } else {
                    c0159a = new C0159a(v1bVar);
                }
            } else {
                c0159a = new C0159a(v1bVar);
            }
            Object obj = c0159a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0159a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c0159a.b = 1;
                if (this.a.collect(bVar, c0159a) == y5bVar) {
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

    public static final class b implements lyh<ResetSportyPINResult> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sporty.android.platform.features.newotp.feature.resetpin.ResetPinOtpSelectorViewModel$verifyWithTrustedDeviceFlow$$inlined$map$1", f = "ResetPinOtpSelectorViewModel.kt", l = {109}, m = "collect", v = 2)
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

        /* JADX INFO: renamed from: ce50$b$b, reason: collision with other inner class name */
        public static final class C0161b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: ce50$b$b$a */
            @c0d(c = "com.sporty.android.platform.features.newotp.feature.resetpin.ResetPinOtpSelectorViewModel$verifyWithTrustedDeviceFlow$$inlined$map$1$2", f = "ResetPinOtpSelectorViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    return C0161b.this.emit(null, this);
                }
            }

            public C0161b(myh myhVar) {
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
        public final Object collect(myh<? super ResetSportyPINResult> myhVar, v1b v1bVar) {
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
                C0161b c0161b = new C0161b(myhVar);
                aVar.b = 1;
                if (this.a.collect(c0161b, aVar) == y5bVar) {
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
    public ce50(v8w v8wVar, lyz lyzVar, pc80 pc80Var, oxg0 oxg0Var, rdd0 rdd0Var, nd4 nd4Var, d5z d5zVar) {
        super(v8wVar, rdd0Var);
        v8wVar.getClass();
        lyzVar.getClass();
        oxg0Var.getClass();
        rdd0Var.getClass();
        nd4Var.getClass();
        d5zVar.getClass();
        this.A = nd4Var;
        this.B = d5zVar;
        this.C = lyzVar;
        this.D = pc80Var;
        this.E = oxg0Var;
    }

    @Override // defpackage.d5z
    public final lyh<lk50<Unit>> C() {
        return b42.D1(this.C.D("", "", (4 & 4) == 0, (4 & 8) == 0), new Function1() { // from class: be50
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                ce50 ce50Var = this.a;
                ce50Var.b = OtpData.ResetPin.a((OtpData.ResetPin) ce50Var.B1(), oTPResult);
                return Unit.a;
            }
        });
    }

    @Override // defpackage.nxg0
    public final lyh<lk50<Unit>> J() {
        return b42.F1(bm50.a(new b(this.C.D("", "", (4 & 4) == 0, (4 & 8) == 0))), new Function1() { // from class: ae50
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                ce50 ce50Var = this.a;
                ce50Var.b = OtpData.ResetPin.a((OtpData.ResetPin) ce50Var.B1(), oTPResult);
                return Unit.a;
            }
        });
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

    @Override // defpackage.c7z
    public final lyh<String> P1() {
        return new a(this.C.Z());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c7z
    public final lyh<lk50<OTPResponse>> U1(OtpSelection otpSelection) {
        otpSelection.getClass();
        return this.D.a(otpSelection, z1().b, j6c.RESET_PIN, ((OtpData.ResetPin) B1()).a, ((OtpData.ResetPin) B1()).b);
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
        return this.E.a(j6c.RESET_PIN);
    }
}
