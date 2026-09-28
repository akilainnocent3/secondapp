package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.security.otp.OTPCompleteResult;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrd50;", "Lj8i0;", "password-entry"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class rd50 extends j8i0 {
    public final lyz a;
    public final evz b;
    public final wwd0 c;
    public final v340 d;
    public final ku90<xuz> e;
    public final ku90 f;
    public final String i;
    public final String v;
    public final boolean w;
    public final String y;
    public id50 z;

    public rd50(lyz lyzVar, vu60 vu60Var) {
        lyzVar.getClass();
        vu60Var.getClass();
        this.a = lyzVar;
        this.b = new evz();
        wwd0 wwd0VarA = xwd0.a(new tvz(null, null, 255));
        this.c = wwd0VarA;
        this.d = e1i.b(wwd0VarA);
        ku90<xuz> ku90Var = new ku90<>();
        this.e = ku90Var;
        this.f = ku90Var;
        String str = (String) vu60Var.b("mobile");
        this.i = str == null ? "" : str;
        String str2 = (String) vu60Var.b("token");
        this.v = str2 == null ? "" : str2;
        Boolean bool = (Boolean) vu60Var.b("isForced");
        this.w = bool != null ? bool.booleanValue() : false;
        String str3 = (String) vu60Var.b("triggeredEvent");
        this.y = str3 != null ? str3 : "";
    }

    public final void x1(String str, Throwable th) {
        String message;
        Object value;
        Object value2;
        itf0.a aVar = itf0.a;
        aVar.q("ResetPasswordVM");
        aVar.f(th, str, new Object[0]);
        SprThrowable sprThrowable = th instanceof SprThrowable ? (SprThrowable) th : null;
        if ((sprThrowable == null || (message = sprThrowable.getE()) == null) && (message = th.getMessage()) == null) {
            message = "";
        }
        String str2 = message;
        wwd0 wwd0Var = this.c;
        if (sprThrowable == null || sprThrowable.getD() != 11810) {
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, tvz.a((tvz) value, null, null, null, false, new xce0.a(str2), str2, null, false, 207)));
        } else {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, tvz.a((tvz) value2, null, null, null, false, xce0.b.a, "", new wuz.a(str2), false, 143)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object y1(String str, x1b x1bVar) {
        md50 md50Var;
        wwd0 wwd0Var;
        Object value;
        if (x1bVar instanceof md50) {
            md50Var = (md50) x1bVar;
            int i = md50Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                md50Var.c = i - Integer.MIN_VALUE;
            } else {
                md50Var = new md50(this, x1bVar);
            }
        } else {
            md50Var = new md50(this, x1bVar);
        }
        Object objA0 = md50Var.a;
        y5b y5bVar = y5b.a;
        int i2 = md50Var.c;
        if (i2 == 0) {
            uj50.b(objA0);
            md50Var.c = 1;
            objA0 = this.a.A0(this.v, str, md50Var);
            if (objA0 == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objA0);
        }
        lk50 lk50Var = (lk50) objA0;
        if (lk50Var instanceof lk50.c) {
            this.z = new id50(this, (OTPCompleteResult) ((lk50.c) lk50Var).a);
            do {
                wwd0Var = this.c;
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, tvz.a((tvz) value, null, null, null, false, xce0.d.a, null, null, true, 111)));
        } else if (lk50Var instanceof lk50.a) {
            x1("resetPassword failed", ((lk50.a) lk50Var).a);
        } else if (!(lk50Var instanceof lk50.b)) {
            uhc.a();
            return null;
        }
        return Unit.a;
    }
}
