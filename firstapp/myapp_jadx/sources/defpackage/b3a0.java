package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPInternalData;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.newotp.channel.sms.SmsViewModel$sendOTP$1", f = "SmsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b3a0 extends tje0 implements Function2<lk50<? extends OTPResponse>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ x2a0<OtpData> b;
    public final /* synthetic */ OtpSelection c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3a0(x2a0<OtpData> x2a0Var, OtpSelection otpSelection, v1b<? super b3a0> v1bVar) {
        super(2, v1bVar);
        this.b = x2a0Var;
        this.c = otpSelection;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        b3a0 b3a0Var = new b3a0(this.b, this.c, v1bVar);
        b3a0Var.a = obj;
        return b3a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends OTPResponse> lk50Var, v1b<? super Unit> v1bVar) {
        return ((b3a0) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        e6z e6zVar;
        UiText uiTextK1;
        j7z.c cVar;
        hz00 hz00Var;
        uf00<d08> uf00VarF;
        Object value3;
        x2a0<OtpData> x2a0Var = this.b;
        ku90<o2a0> ku90Var = x2a0Var.v;
        wwd0 wwd0Var = x2a0Var.f;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (lk50Var instanceof lk50.b) {
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, e6z.a((e6z) value3, null, null, null, null, null, j7z.d.a, null, null, null, null, false, 2015)));
        } else if (lk50Var instanceof lk50.c) {
            x2a0Var.c = OTPInternalData.a(x2a0Var.z1(), null, null, (OTPResponse) ((lk50.c) lk50Var).a, 3);
            OtpSelection otpSelectionY1 = x2a0Var.y1();
            OtpSelection otpSelection = this.c;
            if (otpSelection != otpSelectionY1) {
                ku90Var.a(new o2a0.e(otpSelection, x2a0Var.z1()));
            }
            do {
                value2 = wwd0Var.getValue();
                e6zVar = (e6z) value2;
                uiTextK1 = otpSelection == x2a0Var.y1() ? x2a0Var.K1(R.string.common_otp_verify__you_can_request_addition_code_vnum_more_vnum_s) : e6zVar.e;
                cVar = new j7z.c(null);
                hz00Var = e6zVar.c;
                OtpSelection otpSelectionY2 = x2a0Var.y1();
                hz00 hz00Var2 = e6zVar.c;
                if (otpSelection == otpSelectionY2) {
                    uf00<d08> uf00Var = hz00Var2.a;
                    ArrayList arrayList = new ArrayList(l48.r(uf00Var, 10));
                    for (d08 d08Var : uf00Var) {
                        arrayList.add(d08.a.a);
                    }
                    uf00VarF = a4h.f(arrayList);
                } else {
                    uf00VarF = hz00Var2.a;
                }
            } while (!wwd0Var.g(value2, e6z.a(e6zVar, null, null, hz00.a(hz00Var, uf00VarF, null, 2), null, uiTextK1, cVar, null, null, null, null, false, 1995)));
            ku90Var.a.a(o2a0.b.a);
        } else {
            if (!(lk50Var instanceof lk50.a)) {
                uhc.a();
                return null;
            }
            wwd0 wwd0Var2 = x2a0Var.f;
            do {
                value = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value, e6z.a((e6z) value, null, null, null, null, null, b42.A1(x2a0Var, (lk50.a) lk50Var, new xc10(1)), null, null, null, null, false, 2015)));
        }
        return Unit.a;
    }
}
