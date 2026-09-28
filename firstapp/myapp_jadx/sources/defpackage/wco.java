package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.bethistory2.a;
import com.sportybet.android.instantwin.presentation.bethistory2.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wco extends pf implements Function2<pbo, v1b<? super Unit>, Object> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(pbo pboVar, v1b<? super Unit> v1bVar) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        zs.b bVar;
        Object value5;
        pbo pboVar2 = pboVar;
        c cVar = (c) this.a;
        ihi ihiVar = cVar.a;
        wwd0 wwd0Var = cVar.z;
        if (pboVar2 instanceof pbo.b) {
            do {
                value5 = wwd0Var.getValue();
            } while (!wwd0Var.g(value5, lni0.b));
        } else if (pboVar2 instanceof pbo.a) {
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, lni0.a));
            wwd0 wwd0Var2 = cVar.A;
            do {
                value4 = wwd0Var2.getValue();
                nbo nboVar = ((pbo.a) pboVar2).a;
                if (nboVar instanceof nbo.a) {
                    nbo.a aVar = (nbo.a) nboVar;
                    bVar = new zs.b(vch0.d(aVar.a), vch0.d(aVar.b), new ResourceUiText(R.string.page_instant_virtual__next_round), 8);
                } else {
                    if (!(nboVar instanceof nbo.b)) {
                        uhc.a();
                        return null;
                    }
                    StringUiText stringUiText = vch0.a;
                    bVar = new zs.b(new ResourceUiText(R.string.common_feedback__connection_error), new ResourceUiText(R.string.common_feedback__please_check_your_internet_connection_and_try_again), (ResourceUiText) null, 12);
                }
            } while (!wwd0Var2.g(value4, bVar));
        } else {
            if (!(pboVar2 instanceof pbo.c)) {
                uhc.a();
                return null;
            }
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, lni0.a));
            obo oboVar = ((pbo.c) pboVar2).a;
            if (oboVar instanceof obo.a) {
                cVar.A1(new a.i.b(((obo.a) oboVar).a));
            } else {
                if (!(oboVar instanceof obo.b)) {
                    uhc.a();
                    return null;
                }
                String str = ((obo.b) oboVar).a;
                if (ihiVar.e()) {
                    wwd0 wwd0Var3 = cVar.C;
                    do {
                        value2 = wwd0Var3.getValue();
                    } while (!wwd0Var3.g(value2, str));
                    ihiVar.f();
                } else {
                    cVar.A1(new a.i.d(str));
                }
            }
        }
        return Unit.a;
    }
}
