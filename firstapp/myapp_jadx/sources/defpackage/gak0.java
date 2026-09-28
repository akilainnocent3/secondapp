package defpackage;

import android.content.Context;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.platform.features.newotp.feature.register.revamp.RegisterRevampConfig;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPInternalData;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgak0;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class gak0 extends j8i0 {
    public static final /* synthetic */ ohp<Object>[] C = {new otw(0, gak0.class, "state", "getState()Lcom/sportybet/android/account/zaaccount/otp/ZAOTPState;")};
    public String A;
    public h5b B;
    public final Context a;
    public final psm b;
    public final ku40 c;
    public final pc80 d;
    public final rdd0 e;
    public final yck f;
    public final ku90<u9k0> i;
    public final ku90 v;
    public final v340 w;
    public final vwd0 y;
    public String z;

    @c0d(c = "com.sportybet.android.account.zaaccount.otp.ZAOTPViewModel$createSession$1", f = "ZAOTPViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<lk50<? extends String>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = gak0.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends String> lk50Var, v1b<? super Unit> v1bVar) {
            return ((a) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (!(lk50Var instanceof lk50.b)) {
                boolean z = lk50Var instanceof lk50.a;
                gak0 gak0Var = gak0.this;
                if (z) {
                    ku90<u9k0> ku90Var = gak0Var.i;
                    ku90Var.a.a(new u9k0.e(((lk50.a) lk50Var).b));
                } else {
                    if (!(lk50Var instanceof lk50.c)) {
                        uhc.a();
                        return null;
                    }
                    gak0Var.z = (String) ((lk50.c) lk50Var).a;
                    gak0Var.A1();
                }
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.account.zaaccount.otp.ZAOTPViewModel$sendOtp$1", f = "ZAOTPViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<lk50<? extends OTPResponse>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = gak0.this.new b(v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends OTPResponse> lk50Var, v1b<? super Unit> v1bVar) {
            return ((b) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ku90<u9k0> ku90Var = gak0.this.i;
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (lk50Var instanceof lk50.b) {
                Unit unit = Unit.a;
            } else if (lk50Var instanceof lk50.a) {
                ku90Var.a.a(new u9k0.e(((lk50.a) lk50Var).b));
            } else {
                if (!(lk50Var instanceof lk50.c)) {
                    uhc.a();
                    return null;
                }
                StringUiText stringUiText = vch0.a;
                ku90Var.a.a(new u9k0.e(new ResourceUiText(R.string.common_otp_verify__code_sent)));
            }
            return Unit.a;
        }
    }

    public gak0(Context context, psm psmVar, ku40 ku40Var, pc80 pc80Var, rdd0 rdd0Var, yck yckVar) {
        psmVar.getClass();
        rdd0Var.getClass();
        yckVar.getClass();
        this.a = context;
        this.b = psmVar;
        this.c = ku40Var;
        this.d = pc80Var;
        this.e = rdd0Var;
        this.f = yckVar;
        ku90<u9k0> ku90Var = new ku90<>();
        this.i = ku90Var;
        this.v = ku90Var;
        vwd0 vwd0Var = new vwd0(new fak0(psmVar.M(), 510));
        this.w = vwd0Var.b;
        this.y = vwd0Var;
        this.A = "";
    }

    public final void A1() {
        String str = this.z;
        if (str == null) {
            x1(y1().b);
            return;
        }
        kzh.d(new g1i(this.d.a(OtpSelection.SMS, str, j6c.REGISTER, y1().b, this.b.P()), new b(null)), o8i0.d(this));
    }

    public final void B1(fak0 fak0Var) {
        this.y.b(this, C[0], fak0Var);
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        super.onCleared();
        h5b h5bVar = this.B;
        if (h5bVar != null) {
            h5bVar.a();
        }
    }

    public final void x1(String str) {
        String strP = this.b.P();
        ku40 ku40Var = this.c;
        ku40Var.getClass();
        str.getClass();
        strP.getClass();
        kzh.d(new g1i(bm50.a(new iu40(ku40Var.a.B(str, strP))), new a(null)), o8i0.d(this));
    }

    public final fak0 y1() {
        return (fak0) this.y.a(this, C[0]);
    }

    public final void z1(v9k0 v9k0Var) {
        v9k0Var.getClass();
        if (v9k0Var.equals(v9k0.h.a)) {
            h5b h5bVar = this.B;
            if (h5bVar != null) {
                h5bVar.b();
                return;
            }
            return;
        }
        if (v9k0Var.equals(v9k0.i.a)) {
            h5b h5bVar2 = this.B;
            if (h5bVar2 != null) {
                h5bVar2.c();
                return;
            }
            return;
        }
        boolean zEquals = v9k0Var.equals(v9k0.b.a);
        ku90<u9k0> ku90Var = this.i;
        rdd0 rdd0Var = this.e;
        if (zEquals) {
            rdd0Var.a(new p7z("otp send page"), k00.d);
            ku90Var.a(u9k0.b.a);
            return;
        }
        if (v9k0Var.equals(v9k0.a.a)) {
            ku90Var.a(u9k0.a.a);
            return;
        }
        if (v9k0Var.equals(v9k0.g.a)) {
            ku90Var.a(u9k0.d.a);
            rdd0Var.a(new ts40.j(0), k00.d);
            return;
        }
        if (v9k0Var.equals(v9k0.c.a)) {
            B1(fak0.a(y1(), null, uxs.DISABLE, sx40.b.a, null, 415));
            return;
        }
        if (v9k0Var instanceof v9k0.d) {
            B1(fak0.a(y1(), null, uxs.ENABLE, null, null, 479));
            this.A = ((v9k0.d) v9k0Var).a;
            return;
        }
        if (v9k0Var.equals(v9k0.e.a)) {
            A1();
            h5b h5bVar3 = this.B;
            if (h5bVar3 != null) {
                h5bVar3.a();
            }
            h5b h5bVar4 = new h5b(o8i0.d(this), RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS, new hak0(this, null), new iak0(this, null));
            this.B = h5bVar4;
            h5bVar4.d();
            B1(fak0.a(y1(), null, null, null, null, 255));
            rdd0Var.a(new ts40.k0(0), k00.d);
            return;
        }
        if (!v9k0Var.equals(v9k0.f.a)) {
            uhc.a();
            return;
        }
        rdd0Var.a(new lbf0(0), k00.d);
        OtpData.Register register = new OtpData.Register(y1().b, this.b.P(), (OTPResult.Success) null, (RegisterRevampConfig) null, 28);
        String str = this.z;
        str.getClass();
        kzh.d(new g1i(bm50.a(this.c.a(register, new OTPInternalData(str, 5), this.A)), new jak0(this, null)), o8i0.d(this));
    }
}
