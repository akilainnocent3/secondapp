package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.platform.features.account.verifiedemailchange.model.EmailChangeFlowArgs;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgyf;", "Lj8i0;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class gyf extends j8i0 {
    public final a6k a;
    public final lyz b;
    public final rdd0 c;
    public final EmailChangeFlowArgs d;
    public final wwd0 e;
    public final v340 f;
    public final ku90<wxf> i;
    public final t340 v;

    public gyf(a6k a6kVar, lyz lyzVar, vu60 vu60Var, rdd0 rdd0Var) {
        Object value;
        a6kVar.getClass();
        lyzVar.getClass();
        vu60Var.getClass();
        rdd0Var.getClass();
        this.a = a6kVar;
        this.b = lyzVar;
        this.c = rdd0Var;
        EmailChangeFlowArgs emailChangeFlowArgs = ((pxf) fnf.a(vu60Var, jq40.a(pxf.class), jpu.b(new Pair(jq40.b(EmailChangeFlowArgs.class), new qwf(false))))).a;
        this.d = emailChangeFlowArgs;
        wwd0 wwd0VarA = xwd0.a(new dyf(0));
        this.e = wwd0VarA;
        this.f = e1i.b(wwd0VarA);
        ku90<wxf> ku90Var = new ku90<>();
        this.i = ku90Var;
        this.v = e1i.a(ku90Var);
        StringUiText stringUiText = vch0.a;
        ResourceUiText resourceUiText = new ResourceUiText(R.string.email_change__notice_old_email_removed);
        ResourceUiText resourceUiText2 = new ResourceUiText(R.string.email_change__notice_new_email_verified);
        int i = emailChangeFlowArgs.b;
        uf00 uf00VarA = a4h.a(resourceUiText, resourceUiText2, i == 1 ? new ResourceUiText(R.string.email_change__notice_update_frequency) : new ResourceUiText(R.string.email_change__notice_update_frequency_vtimes, ay0.S(new Object[]{Integer.valueOf(i)})));
        do {
            value = wwd0VarA.getValue();
        } while (!wwd0VarA.g(value, dyf.a((dyf) value, uf00VarA, null, 2)));
    }
}
