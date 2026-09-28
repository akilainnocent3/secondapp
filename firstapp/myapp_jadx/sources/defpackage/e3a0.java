package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.newotp.channel.sms.SmsViewModel$verify$1", f = "SmsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e3a0 extends tje0 implements Function2<lk50<? extends Unit>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ x2a0<OtpData> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3a0(x2a0<OtpData> x2a0Var, v1b<? super e3a0> v1bVar) {
        super(2, v1bVar);
        this.b = x2a0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        e3a0 e3a0Var = new e3a0(this.b, v1bVar);
        e3a0Var.a = obj;
        return e3a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Unit> lk50Var, v1b<? super Unit> v1bVar) {
        return ((e3a0) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        e6z e6zVar;
        j7z.b bVar;
        hz00 hz00Var;
        ArrayList arrayList;
        Object value3;
        e6z e6zVar2;
        Object value4;
        e6z e6zVar3;
        Object value5;
        e6z e6zVar4;
        Object value6;
        Object value7;
        x2a0<OtpData> x2a0Var = this.b;
        wwd0 wwd0Var = x2a0Var.f;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (lk50Var instanceof lk50.b) {
            do {
                value7 = wwd0Var.getValue();
            } while (!wwd0Var.g(value7, e6z.a((e6z) value7, null, null, null, null, null, j7z.d.a, null, null, null, null, false, 2015)));
        } else if (lk50Var instanceof lk50.c) {
            do {
                value6 = wwd0Var.getValue();
            } while (!wwd0Var.g(value6, e6z.a((e6z) value6, null, null, null, null, null, new j7z.c(q5z.l.a), null, null, null, null, false, 2015)));
        } else {
            if (!(lk50Var instanceof lk50.a)) {
                uhc.a();
                return null;
            }
            lk50.a aVar = (lk50.a) lk50Var;
            Throwable th = aVar.a;
            if (!(th instanceof SprThrowable)) {
                th = null;
            }
            SprThrowable sprThrowable = (SprThrowable) th;
            if (sprThrowable == null) {
                do {
                    value5 = wwd0Var.getValue();
                    e6zVar4 = (e6z) value5;
                    StringUiText stringUiText = vch0.a;
                } while (!wwd0Var.g(value5, e6z.a(e6zVar4, null, null, null, null, null, new j7z.b(new ResourceUiText(R.string.common_functions__error), aVar.b, new q5z.k(false, null), x2a0Var.B1().getC() == j6c.REGISTER ? "register__verify_fail_popup" : null, 16), null, null, null, null, false, 2015)));
                return Unit.a;
            }
            int d = sprThrowable.getD();
            gay gayVar = gay.a;
            if (d == 11707) {
                do {
                    value4 = wwd0Var.getValue();
                    e6zVar3 = (e6z) value4;
                    StringUiText stringUiText2 = vch0.a;
                } while (!wwd0Var.g(value4, e6z.a(e6zVar3, null, null, null, null, null, new j7z.a(new ResourceUiText(R.string.component_bvn__verification_failed), new q5z.h(null), x2a0Var.B1().getC() == j6c.REGISTER ? "otp__limit_popup" : null), null, null, null, null, false, 2015)));
            } else if (d == 11701) {
                do {
                    value3 = wwd0Var.getValue();
                    e6zVar2 = (e6z) value3;
                    StringUiText stringUiText3 = vch0.a;
                } while (!wwd0Var.g(value3, e6z.a(e6zVar2, null, null, null, null, null, new j7z.b((UiText) new ResourceUiText(R.string.component_bvn__verification_failed), aVar.b, new q5z.h(gay.b), x2a0Var.B1().getC() == j6c.REGISTER ? "register__verify_fail_popup" : null, true), null, null, null, null, false, 2015)));
            } else if (d == 11700) {
                do {
                    value2 = wwd0Var.getValue();
                    e6zVar = (e6z) value2;
                    StringUiText stringUiText4 = vch0.a;
                    bVar = new j7z.b((UiText) new ResourceUiText(R.string.component_bvn__verification_failed), aVar.b, new q5z.k(true, gay.a), x2a0Var.B1().getC() == j6c.REGISTER ? "register__verify_fail_popup" : null, true);
                    hz00Var = e6zVar.c;
                    uf00<d08> uf00Var = hz00Var.a;
                    arrayList = new ArrayList(l48.r(uf00Var, 10));
                    for (d08 d08Var : uf00Var) {
                        arrayList.add(d08.a.a);
                    }
                } while (!wwd0Var.g(value2, e6z.a(e6zVar, null, null, hz00.a(hz00Var, a4h.f(arrayList), null, 2), null, null, bVar, null, null, null, null, false, 2011)));
            } else {
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, e6z.a((e6z) value, null, null, null, null, null, new j7z.c(q5z.l.a), null, null, null, null, false, 2015)));
            }
        }
        return Unit.a;
    }
}
