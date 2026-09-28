package defpackage;

import com.sporty.android.core.model.json.JsonSerializeService;
import com.sportybet.android.instantwin.newtork.model.ErrorServer;
import com.sportybet.android.instantwin.newtork.model.response.Round;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Ldz50;", "Lj8i0;", "", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dz50 extends j8i0 {
    public final e4p a;
    public final JsonSerializeService b;
    public final eqn c;
    public final ihi d;
    public Round e;
    public final jlv f;
    public final AtomicBoolean i;

    public dz50(e4p e4pVar, JsonSerializeService jsonSerializeService, eqn eqnVar, ihi ihiVar) {
        jsonSerializeService.getClass();
        eqnVar.getClass();
        this.a = e4pVar;
        this.b = jsonSerializeService;
        this.c = eqnVar;
        this.d = ihiVar;
        this.f = tsg0.a(tsg0.b(yy50.a, new zy50()));
        this.i = new AtomicBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Round x1() {
        Object objD = this.f.d();
        if (!(objD instanceof nqc)) {
            objD = null;
        }
        nqc nqcVar = (nqc) objD;
        Round round = nqcVar != null ? (Round) nqcVar.a : null;
        if (round != null) {
            this.e = round;
        }
        return this.e;
    }

    public final kqc y1(Throwable th) {
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
}
