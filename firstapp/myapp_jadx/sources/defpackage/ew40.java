package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lew40;", "Lecf0;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$Register;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ew40 extends ecf0<OtpData.Register> {
    public final pc80 A;
    public final mpe0 B;
    public final ku40 z;

    @c0d(c = "com.sporty.android.platform.features.newotp.feature.register.RegisterTelegramViewModel$sendOTPFlow$1", f = "RegisterTelegramViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<lk50.a, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = ew40.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50.a aVar, v1b<? super Unit> v1bVar) {
            return ((a) create(aVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50.a aVar = (lk50.a) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            Integer numG = bm50.g(aVar);
            ew40 ew40Var = ew40.this;
            ew40Var.I1(new m7z(7, null, null, ew40Var.y1().b, m7z.a.a(numG), numG), k00.c);
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.platform.features.newotp.feature.register.RegisterTelegramViewModel$verifyFlow$1", f = "RegisterTelegramViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<lk50.a, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = ew40.this.new b(v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50.a aVar, v1b<? super Unit> v1bVar) {
            return ((b) create(aVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50.a aVar = (lk50.a) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            Integer numG = bm50.g(aVar);
            ew40 ew40Var = ew40.this;
            ew40Var.I1(new m7z(7, null, null, ew40Var.y1().b, m7z.a.a(numG), numG), k00.c);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew40(ku40 ku40Var, pc80 pc80Var, rdd0 rdd0Var) {
        super(rdd0Var);
        rdd0Var.getClass();
        this.z = ku40Var;
        this.A = pc80Var;
        this.B = hwr.b(new f9(this, 3));
    }

    @Override // defpackage.b42
    public final void H1() {
        I1(ts40.h.a, k00.d);
    }

    @Override // defpackage.ecf0
    public final ResourceUiText K1(int i) {
        return super.K1(((gu40) this.B.getValue()).c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ecf0
    public final void L1(q5z q5zVar) {
        q5zVar.getClass();
        if (q5zVar instanceof q5z.q) {
            pdd0 pdd0VarA = au40.a((OtpData.Register) B1(), ((q5z.q) q5zVar).a, new ts40.k(0));
            if (pdd0VarA != null) {
                I1(pdd0VarA, k00.d);
            }
        } else if (q5zVar instanceof q5z.r) {
            pdd0 pdd0VarA2 = au40.a((OtpData.Register) B1(), y1(), null);
            if (pdd0VarA2 != null) {
                I1(pdd0VarA2, k00.d);
            }
        } else if (q5zVar instanceof q5z.o) {
            I1(q7z.a, k00.c);
        } else if (q5zVar instanceof q5z.j) {
            I1(s7z.a, k00.c);
        } else if (q5zVar instanceof q5z.m) {
            I1(n7z.a, k00.c);
        }
        super.L1(q5zVar);
    }

    @Override // defpackage.ecf0
    public final UiText M1() {
        return ((gu40) this.B.getValue()).b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ecf0
    public final lyh<lk50<OTPResponse>> N1(OtpSelection otpSelection) {
        return bm50.n(this.A.a(otpSelection, z1().b, j6c.REGISTER, ((OtpData.Register) B1()).a, ((OtpData.Register) B1()).b), new a(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ecf0
    public final lyh<lk50<Unit>> P1(String str) {
        return b42.F1(bm50.n(bm50.a(this.z.a((OtpData.Register) B1(), z1(), str)), new b(null)), new i6i(this, 1));
    }
}
