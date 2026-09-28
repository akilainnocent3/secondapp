package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.cms.CMSLanguage;
import com.sporty.android.core.model.patron.KycSource;
import com.sporty.android.core.model.realsports.StakeConfig;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public abstract class w7b {
    public final CountryCodeName a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final int h;
    public final char i = new DecimalFormatSymbols(l()).getDecimalSeparator();

    public w7b(CountryCodeName countryCodeName, String str, String str2, String str3, int i, String str4, String str5, int i2) {
        this.a = countryCodeName;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = str4;
        this.g = str5;
        this.h = i2;
    }

    public boolean A() {
        return this instanceof wcj;
    }

    public boolean B() {
        return this instanceof dr1;
    }

    public abstract boolean C(String str);

    public abstract boolean D();

    public boolean a(KycSource kycSource) {
        return this instanceof wcj;
    }

    public abstract UiText c();

    public abstract int d();

    public abstract int e();

    public CMSLanguage f() {
        return CMSLanguage.ENGLISH;
    }

    public abstract a700 g();

    public abstract StakeConfig h();

    public abstract int i();

    public abstract int j();

    public abstract UiText k();

    public Locale l() {
        return Locale.US;
    }

    public abstract int m();

    public int n() {
        return R.string.page_payment__online_deposit_has_been_initiated_on_your_phone_tip;
    }

    public abstract UiText o();

    public abstract ResourceUiText p();

    public abstract int q();

    public final boolean r() {
        return !c().equals(vch0.a);
    }

    public abstract boolean s();

    public boolean t() {
        return this instanceof mm5;
    }

    public boolean u() {
        return this instanceof mm5;
    }

    public boolean v() {
        return this instanceof mm5;
    }

    public abstract boolean w();

    public boolean x() {
        return !(this instanceof dr1);
    }

    public boolean y() {
        return this instanceof bhp;
    }

    public boolean z() {
        return this instanceof wcj;
    }

    public List b(ArrayList arrayList) {
        return arrayList;
    }
}
