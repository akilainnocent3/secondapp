package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPInternalData;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.newotp.channel.reverse.ReversedOTPViewModel$sendOTP$1", f = "ReversedOTPViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class pq50 extends tje0 implements Function2<lk50<? extends OTPResponse>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ nq50<OtpData> b;
    public final /* synthetic */ OtpSelection c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq50(nq50<OtpData> nq50Var, OtpSelection otpSelection, v1b<? super pq50> v1bVar) {
        super(2, v1bVar);
        this.b = nq50Var;
        this.c = otpSelection;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        pq50 pq50Var = new pq50(this.b, this.c, v1bVar);
        pq50Var.a = obj;
        return pq50Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends OTPResponse> lk50Var, v1b<? super Unit> v1bVar) {
        return ((pq50) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        sq50 sq50Var;
        UiText resourceUiText;
        Object value3;
        nq50<OtpData> nq50Var = this.b;
        wwd0 wwd0Var = nq50Var.f;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (lk50Var instanceof lk50.b) {
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, sq50.a((sq50) value3, null, null, null, null, wo50.d.a, null, 95)));
        } else if (lk50Var instanceof lk50.c) {
            nq50Var.c = OTPInternalData.a(nq50Var.z1(), null, null, (OTPResponse) ((lk50.c) lk50Var).a, 3);
            OtpSelection otpSelectionY1 = nq50Var.y1();
            OtpSelection otpSelection = this.c;
            if (otpSelection != otpSelectionY1) {
                nq50Var.v.a(new vo50.d(otpSelection, nq50Var.z1()));
            }
            do {
                value2 = wwd0Var.getValue();
                sq50Var = (sq50) value2;
                if (otpSelection == nq50Var.y1()) {
                    Object[] objArr = {6, nq50Var.M1().b};
                    StringUiText stringUiText = vch0.a;
                    resourceUiText = new ResourceUiText(R.string.common_otp_verify__reverse_otp_kindly_press_the_send_button_enter_digit_otp_tip, ay0.S(objArr));
                } else {
                    resourceUiText = sq50Var.b;
                }
            } while (!wwd0Var.g(value2, sq50.a(sq50Var, resourceUiText, otpSelection == nq50Var.y1() ? nq50.L1(nq50Var.M1().a) : sq50Var.c, null, null, new wo50.c(null), null, 89)));
        } else {
            if (!(lk50Var instanceof lk50.a)) {
                uhc.a();
                return null;
            }
            j7z.b bVarA1 = b42.A1(nq50Var, (lk50.a) lk50Var, new g9x(1));
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, sq50.a((sq50) value, null, null, null, null, new wo50.b(bVarA1.a, bVarA1.b, cp50.g.a), null, 95)));
        }
        return Unit.a;
    }
}
