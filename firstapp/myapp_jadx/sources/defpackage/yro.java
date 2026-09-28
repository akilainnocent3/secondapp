package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyro;", "Lj8i0;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class yro extends j8i0 {
    public final psm a;
    public final rdd0 b;
    public final fro c;
    public final ku90<wro> d;
    public final t340 e;
    public final wwd0 f;

    public yro(vu60 vu60Var, cmo cmoVar, psm psmVar, rdd0 rdd0Var) {
        BigDecimal bigDecimal;
        vu60Var.getClass();
        psmVar.getClass();
        rdd0Var.getClass();
        this.a = psmVar;
        this.b = rdd0Var;
        fro froVar = (fro) vu60Var.b("ARG_INPUT");
        this.c = froVar;
        ku90<wro> ku90Var = new ku90<>();
        this.d = ku90Var;
        this.e = e1i.a(ku90Var);
        StringBuilder sb = new StringBuilder();
        sb.append(psmVar.B());
        sb.append(" ");
        sb.append(bjb0.L((froVar == null || (bigDecimal = froVar.b) == null) ? BigDecimal.ZERO : bigDecimal, Locale.US));
        String string = sb.toString();
        StringUiText stringUiText = vch0.a;
        ResourceUiText resourceUiText = new ResourceUiText(R.string.common_dates__from);
        StringUiText stringUiText2 = new StringUiText(" ");
        String str = froVar != null ? froVar.a : null;
        Integer numC = cmoVar.c(str == null ? "" : str);
        Iterator it = b.k(resourceUiText, stringUiText2, numC != null ? new ResourceUiText(numC.intValue()) : new StringUiText("Unknown")).iterator();
        if (!it.hasNext()) {
            zkh.a("Empty collection can't be reduced.");
            throw null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = ((UiText) next).h((UiText) it.next());
        }
        UiText uiText = (UiText) next;
        fro froVar2 = this.c;
        this.f = xwd0.a(new xro(string, uiText, froVar2 != null ? froVar2.c : false, gro.a.a));
    }
}
