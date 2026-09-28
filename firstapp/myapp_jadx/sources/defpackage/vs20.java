package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneBindOTPSessionForNewPhoneBody;
import com.sporty.android.core.model.security.otp.CheckIsTrustedDeviceResponse;
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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lvs20;", "Lc7z;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$PrimaryPhone;", "Lnxg0;", "Lnd4;", "Ld5z;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class vs20 extends c7z<OtpData.PrimaryPhone> implements nxg0, nd4, d5z {
    public final ys20 A;
    public final oxg0 B;
    public final bg C;
    public final d5z D;

    public static final class a implements lyh<CheckIsTrustedDeviceResponse> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: vs20$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.newotp.feature.primaryphone.PrimaryPhoneOtpSelectionViewModel$checkIsTrustedDeviceFlow$$inlined$map$1", f = "PrimaryPhoneOtpSelectionViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C1225a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1225a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: vs20$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sporty.android.platform.features.newotp.feature.primaryphone.PrimaryPhoneOtpSelectionViewModel$checkIsTrustedDeviceFlow$$inlined$map$1$2", f = "PrimaryPhoneOtpSelectionViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C1226a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1226a(v1b v1bVar) {
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
                C1226a c1226a;
                if (v1bVar instanceof C1226a) {
                    c1226a = (C1226a) v1bVar;
                    int i = c1226a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1226a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1226a = new C1226a(v1bVar);
                    }
                } else {
                    c1226a = new C1226a(v1bVar);
                }
                Object obj2 = c1226a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1226a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    CheckIsTrustedDeviceResponse checkIsTrustedDeviceResponse = new CheckIsTrustedDeviceResponse(false);
                    c1226a.b = 1;
                    if (this.a.emit(checkIsTrustedDeviceResponse, c1226a) == y5bVar) {
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
        public final Object collect(myh<? super CheckIsTrustedDeviceResponse> myhVar, v1b v1bVar) {
            C1225a c1225a;
            if (v1bVar instanceof C1225a) {
                c1225a = (C1225a) v1bVar;
                int i = c1225a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1225a.b = i - Integer.MIN_VALUE;
                } else {
                    c1225a = new C1225a(v1bVar);
                }
            } else {
                c1225a = new C1225a(v1bVar);
            }
            Object obj = c1225a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1225a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c1225a.b = 1;
                if (this.a.collect(bVar, c1225a) == y5bVar) {
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
    public vs20(v8w v8wVar, ys20 ys20Var, oxg0 oxg0Var, rdd0 rdd0Var, bg bgVar, d5z d5zVar) {
        super(v8wVar, rdd0Var);
        v8wVar.getClass();
        oxg0Var.getClass();
        rdd0Var.getClass();
        bgVar.getClass();
        d5zVar.getClass();
        this.A = ys20Var;
        this.B = oxg0Var;
        this.C = bgVar;
        this.D = d5zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.d5z
    public final lyh<lk50<Unit>> C() {
        return b42.F1(bm50.a(ys20.b(this.A, "", "", ((OtpData.PrimaryPhone) B1()).f, ((OtpData.PrimaryPhone) B1()).d, 16)), new Function1() { // from class: us20
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                vs20 vs20Var = this.a;
                vs20Var.b = OtpData.PrimaryPhone.a((OtpData.PrimaryPhone) vs20Var.B1(), oTPResult);
                return Unit.a;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nxg0
    public final lyh<lk50<Unit>> J() {
        return b42.F1(bm50.a(ys20.b(this.A, "", "", ((OtpData.PrimaryPhone) B1()).f, ((OtpData.PrimaryPhone) B1()).d, 32)), new Function1() { // from class: ts20
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                vs20 vs20Var = this.a;
                vs20Var.b = OtpData.PrimaryPhone.a((OtpData.PrimaryPhone) vs20Var.B1(), oTPResult);
                return Unit.a;
            }
        });
    }

    @Override // defpackage.d5z
    public final <T> void K0(int i, T t, Function1<? super j7z.b<? extends T>, Unit> function1) {
        function1.getClass();
        this.D.K0(i, t, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c7z
    public final UiText O1() {
        int i = ((OtpData.PrimaryPhone) B1()).e;
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.d5z
    public final Object P0(boolean z, v1b<? super nc4> v1bVar) {
        if (((OtpData.PrimaryPhone) B1()).d) {
            return null;
        }
        return this.D.P0(z, v1bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c7z
    public final lyh<String> P1() {
        boolean z = ((OtpData.PrimaryPhone) B1()).d;
        String str = ((OtpData.PrimaryPhone) B1()).f;
        ys20 ys20Var = this.A;
        ys20Var.getClass();
        str.getClass();
        lyz lyzVar = ys20Var.a;
        return z ? lyzVar.U(new PrimaryPhoneBindOTPSessionForNewPhoneBody(str)) : lyzVar.e0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c7z
    public final lyh<lk50<OTPResponse>> U1(OtpSelection otpSelection) {
        otpSelection.getClass();
        return this.A.a(otpSelection, z1().b, (OtpData.PrimaryPhone) B1());
    }

    @Override // defpackage.d5z
    public final void Y(int i, cp50 cp50Var, Function1<? super wo50.b, Unit> function1) {
        cp50Var.getClass();
        function1.getClass();
        this.D.Y(i, cp50Var, function1);
    }

    @Override // defpackage.d5z
    public final void e1() {
        this.D.e1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nd4
    public final Object i0(ArrayList arrayList, a7z.b.a aVar) {
        return ((OtpData.PrimaryPhone) B1()).d ? a4h.f(arrayList) : this.C.a(arrayList, aVar);
    }

    @Override // defpackage.d5z
    public final <T> Object n1(qd4.c cVar, j6c j6cVar, T t, Function0<Unit> function0, Function0<Unit> function1, Function1<? super j7z.b<? extends T>, Unit> function2, Function0<? extends lyh<? extends lk50<Unit>>> function3, v1b<? super Unit> v1bVar) {
        return this.D.n1(cVar, j6cVar, t, function0, function1, function2, function3, v1bVar);
    }

    @Override // defpackage.d5z
    public final Object t(qd4.c cVar, j6c j6cVar, cp50 cp50Var, Function0<Unit> function0, Function0<Unit> function1, Function1<? super wo50.b, Unit> function2, Function0<? extends lyh<? extends lk50<Unit>>> function3, v1b<? super Unit> v1bVar) {
        return this.D.t(cVar, j6cVar, cp50Var, function0, function1, function2, function3, v1bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nxg0
    public final lyh<CheckIsTrustedDeviceResponse> z() {
        boolean z = ((OtpData.PrimaryPhone) B1()).d;
        oxg0 oxg0Var = this.B;
        return z ? new a(oxg0Var.a(j6c.CHANGE_PRIMARY_PHONE)) : oxg0Var.a(j6c.CHANGE_PRIMARY_PHONE);
    }
}
