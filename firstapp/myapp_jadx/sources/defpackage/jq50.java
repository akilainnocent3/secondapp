package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.newotp.channel.reverse.ReversedOTPViewModel$autoCheckVerify$1", f = "ReversedOTPViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jq50 extends tje0 implements Function2<to50, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ nq50<OtpData> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq50(nq50<OtpData> nq50Var, v1b<? super jq50> v1bVar) {
        super(2, v1bVar);
        this.b = nq50Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        jq50 jq50Var = new jq50(this.b, v1bVar);
        jq50Var.a = obj;
        return jq50Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(to50 to50Var, v1b<? super Unit> v1bVar) {
        return ((jq50) create(to50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        to50 to50Var = (to50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        nq50<OtpData> nq50Var = this.b;
        ku90<UiText> ku90Var = nq50Var.y;
        wwd0 wwd0Var = nq50Var.f;
        to50 to50Var2 = nq50Var.C;
        if ((to50Var2 != null ? to50Var2.a : 0L) < to50Var.a) {
            nq50Var.C = to50Var;
            gq50 gq50Var = to50Var.b;
            if (gq50Var == hq50.UNVERIFIED) {
                jvd0 jvd0Var = nq50Var.E;
                if (jvd0Var != null) {
                    jvd0Var.cancel((CancellationException) null);
                }
                jvd0 jvd0Var2 = nq50Var.F;
                if (jvd0Var2 != null) {
                    jvd0Var2.cancel((CancellationException) null);
                }
                do {
                    value3 = wwd0Var.getValue();
                } while (!wwd0Var.g(value3, sq50.a((sq50) value3, null, null, null, null, new wo50.e(new d120.c(false, cp50.f.a, nq50Var.O1(), nq50Var.getI(), uxs.ENABLE)), null, 95)));
                ku90Var.a(nq50Var.getI());
            } else if (gq50Var != hq50.VERIFIED && gq50Var != hq50.INACTIVE) {
                if (gq50Var == hq50.ACTIVATE_FAILED) {
                    jvd0 jvd0Var3 = nq50Var.E;
                    if (jvd0Var3 != null) {
                        jvd0Var3.cancel((CancellationException) null);
                    }
                    jvd0 jvd0Var4 = nq50Var.F;
                    if (jvd0Var4 != null) {
                        jvd0Var4.cancel((CancellationException) null);
                    }
                    do {
                        value2 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value2, sq50.a((sq50) value2, null, null, null, null, new wo50.e(new d120.d(0)), null, 95)));
                    StringUiText stringUiText = vch0.a;
                    ku90Var.a(new ResourceUiText(R.string.self_exclusion__please_try_again));
                } else {
                    if (!gq50Var.equals(gq50.a.a)) {
                        uhc.a();
                        return null;
                    }
                    jvd0 jvd0Var5 = nq50Var.E;
                    if (jvd0Var5 != null) {
                        jvd0Var5.cancel((CancellationException) null);
                    }
                    jvd0 jvd0Var6 = nq50Var.F;
                    if (jvd0Var6 != null) {
                        jvd0Var6.cancel((CancellationException) null);
                    }
                    do {
                        value = wwd0Var.getValue();
                    } while (!wwd0Var.g(value, sq50.a((sq50) value, null, null, null, null, new wo50.e(new d120.a(0)), null, 95)));
                }
            }
        }
        return Unit.a;
    }
}
