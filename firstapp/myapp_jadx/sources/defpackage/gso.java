package defpackage;

import com.sporty.android.core.model.security.sportypin.SportyPinStatus;
import com.sporty.android.core.model.service.CountryCodeName;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gso {
    public final String a;
    public final CountryCodeName b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public /* synthetic */ gso(String str, CountryCodeName countryCodeName, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CountryCodeName.NIGERIA : countryCodeName, SportyPinStatus.Blocked.getValue(), false, false);
    }

    public static gso a(gso gsoVar, String str, boolean z, boolean z2, int i) {
        String str2 = gsoVar.a;
        CountryCodeName countryCodeName = gsoVar.b;
        if ((i & 4) != 0) {
            str = gsoVar.c;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            z = gsoVar.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = gsoVar.e;
        }
        gsoVar.getClass();
        str2.getClass();
        countryCodeName.getClass();
        str3.getClass();
        return new gso(str2, countryCodeName, str3, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gso)) {
            return false;
        }
        gso gsoVar = (gso) obj;
        return Intrinsics.g(this.a, gsoVar.a) && this.b == gsoVar.b && Intrinsics.g(this.c, gsoVar.c) && this.d == gsoVar.d && this.e == gsoVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + mtg0.a(gmf0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstructionsUiState(currency=");
        sb.append(this.a);
        sb.append(", currentCountry=");
        sb.append(this.b);
        sb.append(", status=");
        uts.b(this.c, ", isError=", ", isLoading=", sb, this.d);
        return mq0.a(sb, this.e, ")");
    }

    public gso(String str, CountryCodeName countryCodeName, String str2, boolean z, boolean z2) {
        str.getClass();
        countryCodeName.getClass();
        str2.getClass();
        this.a = str;
        this.b = countryCodeName;
        this.c = str2;
        this.d = z;
        this.e = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gso() {
        this(null, 0 == true ? 1 : 0, 31);
    }
}
