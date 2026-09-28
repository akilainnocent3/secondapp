package defpackage;

import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lwt40;", "Lp0g;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$Register;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wt40 extends p0g<OtpData.Register> {
    public final ku40 w;
    public final pc80 y;

    @c0d(c = "com.sporty.android.platform.features.newotp.feature.register.RegisterEmailViewModel$sendOTPFlow$1", f = "RegisterEmailViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
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
            a aVar = wt40.this.new a(this.c, v1bVar);
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
            wt40.this.I1(new m7z(7, null, null, this.c.b, m7z.a.a(numG), numG), k00.c);
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.platform.features.newotp.feature.register.RegisterEmailViewModel$verifyFlow$1", f = "RegisterEmailViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<lk50.a, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = wt40.this.new b(v1bVar);
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
            wt40 wt40Var = wt40.this;
            wt40Var.I1(new m7z(7, null, null, wt40Var.y1().b, m7z.a.a(numG), numG), k00.c);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt40(ku40 ku40Var, pc80 pc80Var, rdd0 rdd0Var) {
        super(rdd0Var);
        rdd0Var.getClass();
        this.w = ku40Var;
        this.y = pc80Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p0g
    public final lyh<lk50<OTPResponse>> M1(OtpSelection otpSelection) {
        return bm50.n(this.y.a(otpSelection, z1().b, j6c.REGISTER, ((OtpData.Register) B1()).a, ((OtpData.Register) B1()).b), new a(otpSelection, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p0g
    public final lyh<lk50<Unit>> O1(String str) {
        return b42.F1(bm50.n(bm50.a(this.w.a((OtpData.Register) B1(), z1(), str)), new b(null)), new n1d(this, 1));
    }
}
