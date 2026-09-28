package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xcr extends saj implements Function1<jcr, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(jcr jcrVar) {
        jcr jcrVar2 = jcrVar;
        jcrVar2.getClass();
        ber berVar = (ber) this.receiver;
        rdd0 rdd0Var = berVar.b;
        ku90<cdr> ku90Var = berVar.B;
        wwd0 wwd0Var = berVar.A;
        if (jcrVar2 instanceof jcr.e) {
            berVar.f.d.R(Boolean.valueOf(((jcr.e) jcrVar2).a));
        } else if (jcrVar2 instanceof jcr.a) {
            berVar.i.d.R(Boolean.valueOf(((jcr.a) jcrVar2).a));
        } else if (jcrVar2 instanceof jcr.c) {
            wwd0Var.setValue(((jcr.c) jcrVar2).a);
        } else if (jcrVar2 instanceof jcr.d) {
            jcr.d dVar = (jcr.d) jcrVar2;
            bcr bcrVar = dVar.a;
            cjr cjrVar = bcrVar.d;
            if (cjrVar != null) {
                djr.a(rdd0Var, cjrVar);
            }
            String str = dVar.b;
            String str2 = (String) wwd0Var.getValue();
            StringUiText stringUiText = vch0.a;
            ku90Var.a(new cdr.b(bcrVar, str, str2, new ResourceUiText(R.string.page_lucky_numbers__show_off_share_message)));
        } else if (jcrVar2 instanceof jcr.f) {
            ku90Var.a(new cdr.c(((jcr.f) jcrVar2).a));
        } else {
            if (!jcrVar2.equals(jcr.b.a)) {
                uhc.a();
                return null;
            }
            djr.a(rdd0Var, cjr.f0.a);
            ku90Var.a(new cdr.a((String) wwd0Var.getValue()));
        }
        return Unit.a;
    }
}
