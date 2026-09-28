package defpackage;

import androidx.compose.runtime.m;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.accountprotection.LastLoginDeviceInfo;
import com.sporty.android.platform.features.newotp.util.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lh480;", "Lj8i0;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class h480 extends j8i0 {
    public final lyz a;
    public final uqm b;
    public final psm c;
    public final a d;
    public final ytw e;
    public final wwd0 f;
    public final v340 i;
    public final ku90<ja> v;
    public final t340 w;

    public h480(uqm uqmVar, psm psmVar, lyz lyzVar, a aVar) {
        lyzVar.getClass();
        uqmVar.getClass();
        psmVar.getClass();
        this.a = lyzVar;
        this.b = uqmVar;
        this.c = psmVar;
        this.d = aVar;
        e480 e480Var = e480.a;
        StringUiText stringUiText = vch0.a;
        this.e = m.b(new s380(e480Var, new ResourceUiText(R.string.account_protection__reset_account_for_account_protection), new LastLoginDeviceInfo(null, null, null, null, null, 31, null), ""));
        wwd0 wwd0VarA = xwd0.a(wa.b.b);
        this.f = wwd0VarA;
        this.i = e1i.b(wwd0VarA);
        ku90<ja> ku90Var = new ku90<>();
        this.v = ku90Var;
        this.w = e1i.a(ku90Var);
    }
}
