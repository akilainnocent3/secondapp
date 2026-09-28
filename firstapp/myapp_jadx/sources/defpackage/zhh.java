package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzhh;", "Lj8i0;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class zhh extends j8i0 {
    public final lyz a;
    public final wwd0 b;
    public final v340 c;
    public final ku90<chh> d;
    public final t340 e;

    public zhh(lyz lyzVar) {
        lyzVar.getClass();
        this.a = lyzVar;
        StringUiText stringUiText = vch0.a;
        wwd0 wwd0VarA = xwd0.a(new whh(HttpStatusCodesKt.HTTP_EARLY_HINTS, new StringUiText("0/2000")));
        this.b = wwd0VarA;
        this.c = e1i.b(wwd0VarA);
        ku90<chh> ku90Var = new ku90<>();
        this.d = ku90Var;
        this.e = e1i.a(ku90Var);
    }

    public final void x1(ijf0 ijf0Var) {
        Object value;
        whh whhVar;
        wf00 wf00VarG;
        uxs uxsVar;
        String strA;
        wwd0 wwd0Var = this.b;
        bhh bhhVar = ((whh) wwd0Var.getValue()).a;
        nk0 nk0Var = ijf0Var.a;
        int iA = lta0.a(nk0Var.b);
        boolean z = iA <= 2000;
        do {
            value = wwd0Var.getValue();
            whhVar = (whh) value;
            LinkedHashMap linkedHashMapM = kpu.m(whhVar.b);
            linkedHashMapM.put(bhhVar, ijf0Var);
            boolean z2 = !StringsKt.U(nk0Var.b) && z && iA >= whhVar.e;
            wf00VarG = a4h.g(linkedHashMapM);
            uxsVar = z2 ? uxs.ENABLE : uxs.DISABLE;
            strA = m58.a(iA, "/2000");
            StringUiText stringUiText = vch0.a;
        } while (!wwd0Var.g(value, whh.a(whhVar, null, wf00VarG, uxsVar, new StringUiText(strA), !z, null, 81)));
    }
}
