package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.security.otp.OTPCompleteResult;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lii80;", "Lj8i0;", "password-entry"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ii80 extends j8i0 {
    public final lyz a;
    public final psm b;
    public final bnh0 c;
    public final evz d;
    public final wwd0 e;
    public final v340 f;
    public final ku90<xuz> i;
    public final ku90 v;
    public final String w;

    public ii80(lyz lyzVar, psm psmVar, bnh0 bnh0Var, vu60 vu60Var) {
        lyzVar.getClass();
        psmVar.getClass();
        bnh0Var.getClass();
        vu60Var.getClass();
        this.a = lyzVar;
        this.b = psmVar;
        this.c = bnh0Var;
        this.d = new evz();
        wwd0 wwd0VarA = xwd0.a(new tvz(null, null, 255));
        this.e = wwd0VarA;
        this.f = e1i.b(wwd0VarA);
        ku90<xuz> ku90Var = new ku90<>();
        this.i = ku90Var;
        this.v = ku90Var;
        String str = (String) vu60Var.b("mobile");
        this.w = str == null ? "" : str;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object x1(x1b x1bVar) {
        hi80 hi80Var;
        Object value;
        String message;
        Object value2;
        if (x1bVar instanceof hi80) {
            hi80Var = (hi80) x1bVar;
            int i = hi80Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hi80Var.c = i - Integer.MIN_VALUE;
            } else {
                hi80Var = new hi80(this, x1bVar);
            }
        } else {
            hi80Var = new hi80(this, x1bVar);
        }
        hi80 hi80Var2 = hi80Var;
        Object objW = hi80Var2.a;
        y5b y5bVar = y5b.a;
        int i2 = hi80Var2.c;
        wwd0 wwd0Var = this.e;
        if (i2 == 0) {
            uj50.b(objW);
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, tvz.a((tvz) value, null, null, null, false, xce0.c.a, null, null, false, 239)));
            String strP = this.b.P();
            hi80Var2.c = 1;
            objW = this.a.w(strP, this.w, "", "", hi80Var2);
            if (objW == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objW);
        }
        lk50 lk50Var = (lk50) objW;
        if (lk50Var instanceof lk50.c) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, tvz.a((tvz) value2, null, null, null, false, xce0.d.a, null, null, false, 239)));
            this.i.a.a(new xuz.e(this.w, (OTPCompleteResult) ((lk50.c) lk50Var).a));
        } else if (lk50Var instanceof lk50.a) {
            Throwable th = ((lk50.a) lk50Var).a;
            SprThrowable sprThrowable = th instanceof SprThrowable ? (SprThrowable) th : null;
            if ((sprThrowable == null || (message = sprThrowable.getE()) == null) && (message = th.getMessage()) == null) {
                message = "";
            }
            while (true) {
                Object value3 = wwd0Var.getValue();
                String str = message;
                if (wwd0Var.g(value3, tvz.a((tvz) value3, null, null, null, false, new xce0.a(message), str, null, false, 207))) {
                    break;
                }
                message = str;
            }
            itf0.a aVar = itf0.a;
            aVar.q("SetPasswordVM");
            aVar.f(th, "registerComplete failed", new Object[0]);
        } else if (!(lk50Var instanceof lk50.b)) {
            uhc.a();
            return null;
        }
        return Unit.a;
    }
}
