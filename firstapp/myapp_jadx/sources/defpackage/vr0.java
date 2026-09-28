package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;

/* JADX INFO: loaded from: classes5.dex */
public final class vr0 implements arm {
    public final uqm a;
    public final cbg b;

    public vr0(uqm uqmVar, cbg cbgVar) {
        uqmVar.getClass();
        cbgVar.getClass();
        this.a = uqmVar;
        this.b = cbgVar;
    }

    @Override // defpackage.arm
    public final boolean a() {
        this.b.b();
        return true;
    }

    @Override // defpackage.arm
    public final String d() {
        String strK = a8b.a.a().k();
        strK.getClass();
        return strK;
    }

    @Override // defpackage.arm
    public final int e() {
        return a8b.c().e();
    }

    @Override // defpackage.arm
    public final String g() {
        String strD = a8b.d();
        strD.getClass();
        return strD;
    }

    @Override // defpackage.arm
    public final CountryCodeName getCountryCode() {
        CountryCodeName countryCodeName = a8b.c().a;
        countryCodeName.getClass();
        return countryCodeName;
    }

    @Override // defpackage.arm
    public final String getLanguageCode() {
        String languageCode = this.a.getLanguageCode();
        return languageCode == null ? "en" : languageCode;
    }
}
