package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.newotp.channel.reverse.ReversedOTPViewModel$completeAPI$1", f = "ReversedOTPViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class mq50 extends tje0 implements Function2<lk50<? extends Unit>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ nq50<OtpData> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq50(nq50<OtpData> nq50Var, v1b<? super mq50> v1bVar) {
        super(2, v1bVar);
        this.b = nq50Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        mq50 mq50Var = new mq50(this.b, v1bVar);
        mq50Var.a = obj;
        return mq50Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Unit> lk50Var, v1b<? super Unit> v1bVar) {
        return ((mq50) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        wo50.e eVar;
        wwd0 wwd0Var = this.b.f;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (Intrinsics.g(lk50Var, lk50.b.a)) {
            wo50 wo50Var = ((sq50) wwd0Var.getValue()).f;
            if (!(wo50Var instanceof wo50.e)) {
                wo50Var = null;
            }
            wo50.e eVar2 = (wo50.e) wo50Var;
            if (eVar2 != null) {
                d120 d120Var = eVar2.a;
                if (!(d120Var instanceof d120.c)) {
                    d120Var = null;
                }
                d120.c cVar = (d120.c) d120Var;
                if (cVar != null) {
                    uxs uxsVar = uxs.LOADING;
                    boolean z = cVar.a;
                    cp50 cp50Var = cVar.b;
                    UiText uiText = cVar.c;
                    UiText uiText2 = cVar.d;
                    cp50Var.getClass();
                    uiText.getClass();
                    uiText2.getClass();
                    eVar = new wo50.e(new d120.c(z, cp50Var, uiText, uiText2, uxsVar));
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    wwd0Var.k(null, sq50.a((sq50) wwd0Var.getValue(), null, null, null, null, eVar, null, 95));
                }
            }
        } else if (lk50Var instanceof lk50.c) {
            do {
                value6 = wwd0Var.getValue();
            } while (!wwd0Var.g(value6, sq50.a((sq50) value6, null, null, null, null, new wo50.c(cp50.i.a), null, 95)));
        } else {
            if (!(lk50Var instanceof lk50.a)) {
                uhc.a();
                return null;
            }
            lk50.a aVar = (lk50.a) lk50Var;
            UiText uiText3 = aVar.b;
            Throwable th = aVar.a;
            SprThrowable sprThrowable = (SprThrowable) (th instanceof SprThrowable ? th : null);
            if (sprThrowable == null) {
                do {
                    value5 = wwd0Var.getValue();
                    StringUiText stringUiText = vch0.a;
                } while (!wwd0Var.g(value5, sq50.a((sq50) value5, null, null, null, null, new wo50.b(new ResourceUiText(R.string.common_functions__error), uiText3, cp50.f.a), null, 95)));
                return Unit.a;
            }
            int d = sprThrowable.getD();
            gay gayVar = gay.a;
            if (d == 11707) {
                do {
                    value4 = wwd0Var.getValue();
                    StringUiText stringUiText2 = vch0.a;
                } while (!wwd0Var.g(value4, sq50.a((sq50) value4, null, null, null, null, new wo50.a(new ResourceUiText(R.string.component_bvn__verification_failed), cp50.f.a), null, 95)));
            } else if (d == 11701) {
                do {
                    value3 = wwd0Var.getValue();
                    StringUiText stringUiText3 = vch0.a;
                } while (!wwd0Var.g(value3, sq50.a((sq50) value3, null, null, null, null, new wo50.b(new ResourceUiText(R.string.component_bvn__verification_failed), uiText3, cp50.f.a), null, 95)));
            } else if (d == 11700) {
                do {
                    value2 = wwd0Var.getValue();
                    StringUiText stringUiText4 = vch0.a;
                } while (!wwd0Var.g(value2, sq50.a((sq50) value2, null, null, null, null, new wo50.b(new ResourceUiText(R.string.component_bvn__verification_failed), uiText3, cp50.f.a), null, 95)));
            } else {
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, sq50.a((sq50) value, null, null, null, null, new wo50.c(cp50.i.a), null, 95)));
            }
        }
        return Unit.a;
    }
}
