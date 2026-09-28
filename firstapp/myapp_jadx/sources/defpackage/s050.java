package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.platform.features.newotp.util.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls050;", "Lavw;", "Ll050;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class s050 extends avw<l050> {
    public final r95 e;
    public final a f;
    public final psm i;
    public final vu60 v;
    public final dc w;
    public jvd0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s050(r95 r95Var, a aVar, psm psmVar, vu60 vu60Var, dc dcVar) {
        Object value;
        l050 l050Var;
        String str;
        ijf0 ijf0Var;
        String strP;
        boolean z;
        super(new l050(0));
        psmVar.getClass();
        vu60Var.getClass();
        this.e = r95Var;
        this.f = aVar;
        this.i = psmVar;
        this.v = vu60Var;
        this.w = dcVar;
        wwd0 wwd0Var = this.a;
        do {
            value = wwd0Var.getValue();
            l050Var = (l050) value;
            str = z1().a;
            ijf0Var = new ijf0(z1().c, 0L, 6);
            strP = z1().d;
            strP = strP.length() <= 0 ? null : strP;
            strP = strP == null ? this.i.P() : strP;
            z = z1().c.length() > 0 && z1().e;
            StringUiText stringUiText = vch0.a;
        } while (!wwd0Var.g(value, l050.a(l050Var, str, ijf0Var, strP, null, false, z, z1().e ? new ResourceUiText(R.string.register_login_br__welcome_back_msg) : null, false, false, false, 920)));
    }

    public final fz40 z1() {
        String str;
        Boolean bool;
        vu60 vu60Var = this.v;
        vu60Var.getClass();
        if (!vu60Var.a("email")) {
            hb5.a("Required argument \"email\" is missing and does not have an android:defaultValue");
            return null;
        }
        String str2 = (String) vu60Var.b("email");
        if (str2 == null) {
            hb5.a("Argument \"email\" is marked as non-null but was passed a null value");
            return null;
        }
        if (!vu60Var.a("cpf")) {
            hb5.a("Required argument \"cpf\" is missing and does not have an android:defaultValue");
            return null;
        }
        String str3 = (String) vu60Var.b("cpf");
        if (str3 == null) {
            hb5.a("Argument \"cpf\" is marked as non-null but was passed a null value");
            return null;
        }
        String str4 = "";
        if (vu60Var.a("phoneNumber")) {
            String str5 = (String) vu60Var.b("phoneNumber");
            if (str5 == null) {
                hb5.a("Argument \"phoneNumber\" is marked as non-null but was passed a null value");
                return null;
            }
            str = str5;
        } else {
            str = "";
        }
        if (vu60Var.a("phoneCountryCode") && (str4 = (String) vu60Var.b("phoneCountryCode")) == null) {
            hb5.a("Argument \"phoneCountryCode\" is marked as non-null but was passed a null value");
            return null;
        }
        String str6 = str4;
        if (vu60Var.a("isResumptionFlow")) {
            bool = (Boolean) vu60Var.b("isResumptionFlow");
            if (bool == null) {
                hb5.a("Argument \"isResumptionFlow\" of type boolean does not support null values");
                return null;
            }
        } else {
            bool = Boolean.FALSE;
        }
        return new fz40(str2, str3, str, str6, bool.booleanValue());
    }
}
