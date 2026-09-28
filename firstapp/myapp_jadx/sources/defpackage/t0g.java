package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPInternalData;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.newotp.channel.email.EmailViewModel$sendOtp$1", f = "EmailViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class t0g extends tje0 implements Function2<lk50<? extends OTPResponse>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ p0g<OtpData> b;
    public final /* synthetic */ OtpSelection c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0g(p0g<OtpData> p0gVar, OtpSelection otpSelection, v1b<? super t0g> v1bVar) {
        super(2, v1bVar);
        this.b = p0gVar;
        this.c = otpSelection;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        t0g t0gVar = new t0g(this.b, this.c, v1bVar);
        t0gVar.a = obj;
        return t0gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends OTPResponse> lk50Var, v1b<? super Unit> v1bVar) {
        return ((t0g) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
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
        p0g<OtpData> p0gVar = this.b;
        wwd0 wwd0Var = p0gVar.e;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (lk50Var instanceof lk50.b) {
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, e6z.a((e6z) value3, null, null, null, null, null, j7z.d.a, null, null, null, null, false, 2015)));
        } else if (lk50Var instanceof lk50.c) {
            p0gVar.c = OTPInternalData.a(p0gVar.z1(), null, null, (OTPResponse) ((lk50.c) lk50Var).a, 3);
            OtpSelection otpSelectionY1 = p0gVar.y1();
            OtpSelection otpSelection = this.c;
            if (otpSelection != otpSelectionY1) {
                p0gVar.f.a(new lwf.d(otpSelection, p0gVar.z1()));
            }
            do {
                value2 = wwd0Var.getValue();
                e6zVar = (e6z) value2;
                uiTextK1 = otpSelection == p0gVar.y1() ? p0g.K1(p0gVar) : e6zVar.e;
                cVar = new j7z.c(null);
                hz00Var = e6zVar.c;
                OtpSelection otpSelectionY2 = p0gVar.y1();
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
            wwd0 wwd0Var2 = p0gVar.e;
            do {
                value = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value, e6z.a((e6z) value, null, null, null, null, null, b42.A1(p0gVar, (lk50.a) lk50Var, new s0g(0)), null, null, null, null, false, 2015)));
        }
        return Unit.a;
    }
}
