package defpackage;

import com.sporty.android.core.model.json.JsonSerializeService;
import com.sportybet.android.instantwin.newtork.model.ErrorServer;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBetSource;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class vpp {
    public final e4p a;
    public final JsonSerializeService b;
    public final wwd0 c;
    public final v340 d;
    public final ku90<q3v> e;
    public final t340 f;

    public vpp(e4p e4pVar, JsonSerializeService jsonSerializeService) {
        jsonSerializeService.getClass();
        this.a = e4pVar;
        this.b = jsonSerializeService;
        wwd0 wwd0VarA = xwd0.a(Boolean.FALSE);
        this.c = wwd0VarA;
        this.d = e1i.b(wwd0VarA);
        ku90<q3v> ku90Var = new ku90<>();
        this.e = ku90Var;
        this.f = e1i.a(ku90Var);
    }

    public final void a() {
        yy50.a.m(new jqc());
    }

    public final kqc b(Throwable th) {
        th.getClass();
        try {
            String message = th.getMessage();
            ErrorServer errorServer = null;
            if (message != null) {
                if (message.length() <= 0) {
                    message = null;
                }
                if (message != null) {
                    errorServer = (ErrorServer) this.b.fromJson(message, ErrorServer.class);
                }
            }
            gm gmVarA = gm.a(errorServer);
            return gmVarA != null ? new kqc(gmVarA.a, gmVarA.b) : new kqc();
        } catch (Exception unused) {
            return new kqc();
        }
    }

    public final void c(et7 et7Var, String str) {
        str.getClass();
        if (StringsKt.U(str)) {
            return;
        }
        wwd0 wwd0Var = this.c;
        if (((Boolean) wwd0Var.getValue()).booleanValue()) {
            return;
        }
        wwd0Var.k(null, Boolean.TRUE);
        InstantWinBetSource instantWinBetSource = InstantWinBetSource.BETSLIP;
        instantWinBetSource.getClass();
        e4p e4pVar = this.a;
        kzh.d(new yzh(new g1i(new spp(bm50.a(((eko) e4pVar.a).c(((n4p) e4pVar.b).c(), str, instantWinBetSource)), this), new tpp(this, null)), new upp(this, null)), et7Var);
    }
}
