package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.newotp.util.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Loq5;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class oq5 extends j8i0 {
    public final psm a;
    public final nsm b;
    public final buh0 c;
    public final ct40 d;
    public final nm5 e;
    public final a f;
    public final rdd0 i;
    public final wwd0 v;
    public final v340 w;
    public final ku90<rkh0> y;
    public final t340 z;

    public oq5(psm psmVar, nsm nsmVar, buh0 buh0Var, ct40 ct40Var, nm5 nm5Var, a aVar, rdd0 rdd0Var) {
        psmVar.getClass();
        nsmVar.getClass();
        nm5Var.getClass();
        rdd0Var.getClass();
        this.a = psmVar;
        this.b = nsmVar;
        this.c = buh0Var;
        this.d = ct40Var;
        this.e = nm5Var;
        this.f = aVar;
        this.i = rdd0Var;
        nm5.a aVar2 = nm5Var.a;
        String str = aVar2 != null ? aVar2.b : null;
        wwd0 wwd0VarA = xwd0.a(new skh0(str == null ? "" : str, psmVar.M(), psmVar.l(), 120));
        this.v = wwd0VarA;
        this.w = e1i.b(wwd0VarA);
        ku90<rkh0> ku90Var = new ku90<>();
        this.y = ku90Var;
        this.z = e1i.a(ku90Var);
        rdd0Var.a(ts40.n0.a, k00.d);
        kzh.d(new g1i(new kq5(uzh.b(new lq5(wwd0VarA))), new mq5(this, null)), o8i0.d(this));
    }

    public final void x1(UiText uiText) {
        while (true) {
            wwd0 wwd0Var = this.v;
            Object value = wwd0Var.getValue();
            UiText uiText2 = uiText;
            if (wwd0Var.g(value, skh0.a((skh0) value, null, null, uiText2, uxs.ENABLE, 31))) {
                return;
            } else {
                uiText = uiText2;
            }
        }
    }

    public final ResourceUiText y1(String str) {
        if (StringsKt.U(str)) {
            return null;
        }
        Regex regex = mm5.j;
        List listC = kotlin.collections.a.c(new px40.a(this.a.l()));
        this.c.getClass();
        return buh0.a(str, regex, listC);
    }
}
