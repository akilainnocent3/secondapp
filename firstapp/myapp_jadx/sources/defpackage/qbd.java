package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;

/* JADX INFO: loaded from: classes.dex */
public final class qbd implements pbd {
    public final r7b a;

    public qbd(r7b r7bVar) {
        this.a = r7bVar;
    }

    @Override // defpackage.pbd
    public final Object a(CountryCodeName countryCodeName, emr emrVar) {
        return this.a.a(countryCodeName.getCode(), emrVar);
    }
}
