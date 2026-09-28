package defpackage;

import java.io.IOException;
import java.util.function.Consumer;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class yom implements Consumer {
    public final /* synthetic */ apm a;
    public final /* synthetic */ rm8 b;
    public final /* synthetic */ w0h.a c;

    public /* synthetic */ yom(apm apmVar, rm8 rm8Var, w0h.a aVar) {
        this.a = apmVar;
        this.b = rm8Var;
        this.c = aVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        byte[] bArrA;
        String str;
        String strA;
        w0h.a aVar = this.c;
        x0h.a aVar2 = aVar.a;
        xpm.a aVar3 = (xpm.a) obj;
        apm apmVar = this.a;
        opf0 opf0Var = apmVar.a;
        int iB = aVar3.b();
        Long lValueOf = Long.valueOf(iB);
        aVar.b = lValueOf;
        rm8 rm8Var = this.b;
        if (iB >= 200 && iB < 300) {
            vw0 vw0VarC = m21.c(la80.d, lValueOf);
            if (aVar2.a) {
                ib5.a("Recording already ended");
                return;
            }
            aVar2.a = true;
            aVar2.a(null, vw0VarC);
            rm8Var.f();
            return;
        }
        String strValueOf = String.valueOf(iB);
        Long l = aVar.b;
        vw0 vw0VarC2 = l != null ? m21.c(la80.d, l) : vw0.d;
        if (aVar2.a) {
            ib5.a("Recording already ended");
            return;
        }
        aVar2.a = true;
        if (strValueOf == null || strValueOf.isEmpty()) {
            hb5.a("The export failed but no failure reason was provided");
            return;
        }
        aVar2.a(strValueOf, vw0VarC2);
        try {
            bArrA = aVar3.a();
        } catch (IOException e) {
            opf0Var.a(Level.FINE, "Unable to obtain response body", e);
            bArrA = null;
        }
        String strC = aVar3.c();
        if (bArrA != null) {
            try {
                strA = y9l.a(bArrA);
            } catch (IOException unused) {
                str = "Unable to parse response body, HTTP status message: ";
                strA = inm.a(str, strC);
            }
            Level level = Level.WARNING;
            StringBuilder sb = new StringBuilder("Failed to export ");
            wxa.b(iB, apmVar.c, "s. Server responded with HTTP status code ", ". Error message: ", sb);
            sb.append(strA);
            opf0Var.a(level, sb.toString(), null);
            int i = c9h.a;
            rm8Var.a(new c9h.a(aVar3, null));
        }
        str = "Response body missing, HTTP status message: ";
        strA = inm.a(str, strC);
        Level level2 = Level.WARNING;
        StringBuilder sb2 = new StringBuilder("Failed to export ");
        wxa.b(iB, apmVar.c, "s. Server responded with HTTP status code ", ". Error message: ", sb2);
        sb2.append(strA);
        opf0Var.a(level2, sb2.toString(), null);
        int i2 = c9h.a;
        rm8Var.a(new c9h.a(aVar3, null));
    }
}
