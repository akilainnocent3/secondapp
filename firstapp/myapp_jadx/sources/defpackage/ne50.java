package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.security.otp.ResetSportyPINResult;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lne50;", "Lecf0;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$ResetPin;", "Ld5z;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ne50 extends ecf0<OtpData.ResetPin> implements d5z {
    public final lyz A;
    public final pc80 B;
    public final /* synthetic */ d5z z;

    public static final class a implements lyh<ResetSportyPINResult> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: ne50$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.newotp.feature.resetpin.ResetPinTelegramViewModel$verifyFlow$$inlined$map$1", f = "ResetPinTelegramViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0894a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0894a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: ne50$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sporty.android.platform.features.newotp.feature.resetpin.ResetPinTelegramViewModel$verifyFlow$$inlined$map$1$2", f = "ResetPinTelegramViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0895a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0895a(v1b v1bVar) {
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
                C0895a c0895a;
                if (v1bVar instanceof C0895a) {
                    c0895a = (C0895a) v1bVar;
                    int i = c0895a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0895a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0895a = new C0895a(v1bVar);
                    }
                } else {
                    c0895a = new C0895a(v1bVar);
                }
                Object obj2 = c0895a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0895a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Object objB = n52.b((BaseResponse) obj);
                    c0895a.b = 1;
                    if (this.a.emit(objB, c0895a) == y5bVar) {
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
        public final Object collect(myh<? super ResetSportyPINResult> myhVar, v1b v1bVar) {
            C0894a c0894a;
            if (v1bVar instanceof C0894a) {
                c0894a = (C0894a) v1bVar;
                int i = c0894a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0894a.b = i - Integer.MIN_VALUE;
                } else {
                    c0894a = new C0894a(v1bVar);
                }
            } else {
                c0894a = new C0894a(v1bVar);
            }
            Object obj = c0894a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0894a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c0894a.b = 1;
                if (this.a.collect(bVar, c0894a) == y5bVar) {
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
    public ne50(lyz lyzVar, pc80 pc80Var, rdd0 rdd0Var, d5z d5zVar) {
        super(rdd0Var);
        lyzVar.getClass();
        rdd0Var.getClass();
        d5zVar.getClass();
        this.z = d5zVar;
        this.A = lyzVar;
        this.B = pc80Var;
    }

    @Override // defpackage.d5z
    public final lyh<lk50<Unit>> C() {
        return b42.D1(this.A.D("", "", (4 & 4) == 0, (4 & 8) == 0), new e35(this, 2));
    }

    @Override // defpackage.d5z
    public final <T> void K0(int i, T t, Function1<? super j7z.b<? extends T>, Unit> function1) {
        function1.getClass();
        this.z.K0(i, t, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ecf0
    public final lyh<lk50<OTPResponse>> N1(OtpSelection otpSelection) {
        return this.B.a(otpSelection, z1().b, j6c.RESET_PIN, ((OtpData.ResetPin) B1()).a, ((OtpData.ResetPin) B1()).b);
    }

    @Override // defpackage.d5z
    public final Object P0(boolean z, v1b<? super nc4> v1bVar) {
        return this.z.P0(z, v1bVar);
    }

    @Override // defpackage.ecf0
    public final lyh<lk50<Unit>> P1(String str) {
        return b42.F1(bm50.a(new a(this.A.D(z1().b, str, (4 & 4) == 0, (4 & 8) == 0))), new Function1() { // from class: me50
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                ne50 ne50Var = this.a;
                ne50Var.b = OtpData.ResetPin.a((OtpData.ResetPin) ne50Var.B1(), oTPResult);
                return Unit.a;
            }
        });
    }

    @Override // defpackage.d5z
    public final void Y(int i, cp50 cp50Var, Function1<? super wo50.b, Unit> function1) {
        cp50Var.getClass();
        function1.getClass();
        this.z.Y(i, cp50Var, function1);
    }

    @Override // defpackage.d5z
    public final void e1() {
        this.z.e1();
    }

    @Override // defpackage.d5z
    public final <T> Object n1(qd4.c cVar, j6c j6cVar, T t, Function0<Unit> function0, Function0<Unit> function1, Function1<? super j7z.b<? extends T>, Unit> function2, Function0<? extends lyh<? extends lk50<Unit>>> function3, v1b<? super Unit> v1bVar) {
        return this.z.n1(cVar, j6cVar, t, function0, function1, function2, function3, v1bVar);
    }

    @Override // defpackage.d5z
    public final Object t(qd4.c cVar, j6c j6cVar, cp50 cp50Var, Function0<Unit> function0, Function0<Unit> function1, Function1<? super wo50.b, Unit> function2, Function0<? extends lyh<? extends lk50<Unit>>> function3, v1b<? super Unit> v1bVar) {
        return this.z.t(cVar, j6cVar, cp50Var, function0, function1, function2, function3, v1bVar);
    }
}
