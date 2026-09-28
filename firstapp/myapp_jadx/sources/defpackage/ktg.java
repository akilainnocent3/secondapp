package defpackage;

import com.sporty.android.core.model.json.JsonSerializeService;
import com.sportybet.android.instantwin.newtork.model.ErrorServer;
import com.sportybet.android.instantwin.presentation.promotiondialog.model.InstantWinPromotionDialogInput;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lktg;", "Lj8i0;", "Lhio;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ktg extends j8i0 implements hio {
    public final f4p a;
    public final JsonSerializeService b;
    public final hio c;
    public final ssw<hqc> d;
    public jvd0 e;

    public ktg(f4p f4pVar, JsonSerializeService jsonSerializeService, hio hioVar) {
        jsonSerializeService.getClass();
        hioVar.getClass();
        this.a = f4pVar;
        this.b = jsonSerializeService;
        this.c = hioVar;
        this.d = new ssw<>();
    }

    @Override // defpackage.hio
    public final void X(String str) {
        str.getClass();
        this.c.X(str);
    }

    @Override // defpackage.hio
    public final void r1() {
        this.c.r1();
    }

    @Override // defpackage.hio
    public final lyh<InstantWinPromotionDialogInput> v1() {
        return this.c.v1();
    }

    public final kqc x1(Throwable th) {
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
            if (errorServer == null) {
                return new kqc();
            }
            String str = errorServer.errorName;
            String str2 = errorServer.causeMsg;
            Long lValueOf = Long.valueOf(errorServer.errorCode);
            kqc kqcVar = new kqc();
            kqcVar.a = str;
            kqcVar.b = str2;
            kqcVar.c = lValueOf;
            return kqcVar;
        } catch (Exception unused) {
            return new kqc();
        }
    }
}
