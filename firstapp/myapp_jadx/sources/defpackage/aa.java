package defpackage;

import com.sportybet.core.injection.opentelemetry.PageMeta;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Laa;", "Lihb0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class aa extends ihb0 {
    public final vu90 A;
    public jvd0 B;
    public final wwd0 C;
    public final v340 D;
    public final lyz d;
    public final ohb0 e;
    public final oc4 f;
    public final w74 i;
    public final psm v;
    public final ysm w;
    public final rdd0 y;
    public final vu90<lk50<sit>> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(lyz lyzVar, ohb0 ohb0Var, oc4 oc4Var, w74 w74Var, psm psmVar, ysm ysmVar, rdd0 rdd0Var) {
        super(0);
        lyzVar.getClass();
        oc4Var.getClass();
        w74Var.getClass();
        psmVar.getClass();
        ysmVar.getClass();
        rdd0Var.getClass();
        this.d = lyzVar;
        this.e = ohb0Var;
        this.f = oc4Var;
        this.i = w74Var;
        this.v = psmVar;
        this.w = ysmVar;
        this.y = rdd0Var;
        vu90<lk50<sit>> vu90Var = new vu90<>();
        this.z = vu90Var;
        this.A = vu90Var;
        wwd0 wwd0VarA = xwd0.a(new q74(0));
        this.C = wwd0VarA;
        this.D = e1i.b(wwd0VarA);
    }

    public static /* synthetic */ void A1(aa aaVar, String str, String str2, Integer num, Throwable th, int i) {
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            th = null;
        }
        aaVar.z1(str, str2, num, th);
    }

    public final void z1(String str, String str2, Integer num, Throwable th) {
        mit mitVarA = th != null ? oit.a(th) : null;
        String str3 = mitVarA != null ? mitVarA.a : null;
        String str4 = mitVarA != null ? mitVarA.b : null;
        PageMeta.INSTANCE.getClass();
        this.y.a(new xit(str, str2, num, str3, str4, new PageMeta(JsPluginCommon.GAMES_LOGIN, null)), k00.d);
    }
}
