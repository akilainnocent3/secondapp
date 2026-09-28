package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcw40;", "Lx2a0;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$Register;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class cw40 extends x2a0<OtpData.Register> {
    public final ku40 B;
    public final pc80 C;
    public final mpe0 D;
    public boolean E;

    @c0d(c = "com.sporty.android.platform.features.newotp.feature.register.RegisterSmsViewModel$sendOTPFlow$1", f = "RegisterSmsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<lk50.a, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ OtpSelection c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(OtpSelection otpSelection, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = otpSelection;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = cw40.this.new a(this.c, v1bVar);
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
            cw40.this.I1(new m7z(7, null, null, this.c.b, m7z.a.a(numG), numG), k00.c);
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.platform.features.newotp.feature.register.RegisterSmsViewModel$verifyFlow$1", f = "RegisterSmsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<lk50.a, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = cw40.this.new b(v1bVar);
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
            cw40 cw40Var = cw40.this;
            cw40Var.I1(new m7z(7, null, null, cw40Var.y1().b, m7z.a.a(numG), numG), k00.c);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw40(@Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar, ku40 ku40Var, pc80 pc80Var, rdd0 rdd0Var) {
        super(oddVar, rdd0Var);
        rdd0Var.getClass();
        this.B = ku40Var;
        this.C = pc80Var;
        this.D = hwr.b(new egw(this, 1));
        ej5.c(o8i0.d(this), null, null, new bw40(this, null), 3);
    }

    @Override // defpackage.b42
    public final void H1() {
        Q1(ts40.h.a);
    }

    @Override // defpackage.x2a0
    public final ResourceUiText K1(int i) {
        return super.K1(((gu40) this.D.getValue()).c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x2a0
    public final void L1(q5z q5zVar) {
        q5zVar.getClass();
        if (q5zVar instanceof q5z.k) {
            if (((q5z.k) q5zVar).b == gay.a) {
                Q1(new ts40.i0(0));
                this.E = false;
            }
        } else if (q5zVar instanceof q5z.h) {
            if (((q5z.h) q5zVar).a == gay.b) {
                Q1(new ts40.i0(0));
            }
        } else if (q5zVar instanceof q5z.r) {
            pdd0 pdd0VarA = au40.a((OtpData.Register) B1(), y1(), new ts40.k0(0));
            if (pdd0VarA != null) {
                Q1(pdd0VarA);
            }
        } else if (q5zVar instanceof q5z.q) {
            pdd0 pdd0VarA2 = au40.a((OtpData.Register) B1(), ((q5z.q) q5zVar).a, new ts40.k(0));
            if (pdd0VarA2 != null) {
                Q1(pdd0VarA2);
            }
        } else if (q5zVar instanceof q5z.g) {
            Q1(new ts40.j(0));
        } else if (q5zVar instanceof q5z.o) {
            I1(q7z.a, k00.c);
        } else if (q5zVar instanceof q5z.j) {
            I1(s7z.a, k00.c);
        } else if (q5zVar instanceof q5z.m) {
            I1(n7z.a, k00.c);
        }
        super.L1(q5zVar);
    }

    @Override // defpackage.x2a0
    public final UiText M1() {
        return ((gu40) this.D.getValue()).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x2a0
    public final lyh<lk50<OTPResponse>> N1(OtpSelection otpSelection) {
        return bm50.n(this.C.a(otpSelection, z1().b, j6c.REGISTER, ((OtpData.Register) B1()).a, ((OtpData.Register) B1()).b), new a(otpSelection, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x2a0
    public final lyh<lk50<Unit>> P1(String str) {
        return b42.F1(bm50.n(bm50.a(this.B.a((OtpData.Register) B1(), z1(), str)), new b(null)), new aw40(this, 0));
    }

    public final void Q1(pdd0 pdd0Var) {
        I1(pdd0Var, k00.d);
    }
}
