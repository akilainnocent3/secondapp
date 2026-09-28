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
@c0d(c = "com.sporty.android.platform.features.newotp.channel.voice.VoiceViewModel$sendOTP$1", f = "VoiceViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class hoi0 extends tje0 implements Function2<lk50<? extends OTPResponse>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ goi0<OtpData> b;
    public final /* synthetic */ OtpSelection c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hoi0(goi0<OtpData> goi0Var, OtpSelection otpSelection, v1b<? super hoi0> v1bVar) {
        super(2, v1bVar);
        this.b = goi0Var;
        this.c = otpSelection;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        hoi0 hoi0Var = new hoi0(this.b, this.c, v1bVar);
        hoi0Var.a = obj;
        return hoi0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends OTPResponse> lk50Var, v1b<? super Unit> v1bVar) {
        return ((hoi0) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
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
        goi0<OtpData> goi0Var = this.b;
        wwd0 wwd0Var = goi0Var.e;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (lk50Var instanceof lk50.b) {
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, e6z.a((e6z) value3, null, null, null, null, null, j7z.d.a, null, null, null, null, false, 2015)));
        } else if (lk50Var instanceof lk50.c) {
            goi0Var.c = OTPInternalData.a(goi0Var.z1(), null, null, (OTPResponse) ((lk50.c) lk50Var).a, 3);
            OtpSelection otpSelectionY1 = goi0Var.y1();
            OtpSelection otpSelection = this.c;
            if (otpSelection != otpSelectionY1) {
                goi0Var.i.a(new wni0.d(otpSelection, goi0Var.z1()));
            }
            do {
                value2 = wwd0Var.getValue();
                e6zVar = (e6z) value2;
                uiTextK1 = otpSelection == goi0Var.y1() ? goi0Var.K1(R.string.common_otp_verify__you_have_vnum_vtimetext_left_to_request_another_one) : e6zVar.e;
                cVar = new j7z.c(null);
                hz00Var = e6zVar.c;
                OtpSelection otpSelectionY2 = goi0Var.y1();
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
        } else {
            if (!(lk50Var instanceof lk50.a)) {
                uhc.a();
                return null;
            }
            wwd0 wwd0Var2 = goi0Var.e;
            do {
                value = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value, e6z.a((e6z) value, null, null, null, null, null, b42.A1(goi0Var, (lk50.a) lk50Var, new cqo(1)), null, null, null, null, false, 2015)));
        }
        return Unit.a;
    }
}
