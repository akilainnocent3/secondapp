package defpackage;

import android.os.Bundle;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class apr implements ehx {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public apr(String str, String str2, String str3, String str4) {
        wd7.a(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // defpackage.ehx
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("email", this.a);
        bundle.putString("cpf", this.b);
        bundle.putString("phoneNumber", this.c);
        bundle.putString("phoneCountryCode", this.d);
        bundle.putBoolean("isResumptionFlow", true);
        return bundle;
    }

    @Override // defpackage.ehx
    public final int b() {
        return R.id.to_registration_validation_fragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apr)) {
            return false;
        }
        apr aprVar = (apr) obj;
        return Intrinsics.g(this.a, aprVar.a) && Intrinsics.g(this.b, aprVar.b) && Intrinsics.g(this.c, aprVar.c) && Intrinsics.g(this.d, aprVar.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return kwi.a(ux5.a("ToRegistrationValidationFragment(email=", this.a, ", cpf=", this.b, ", phoneNumber="), this.c, ", phoneCountryCode=", this.d, ", isResumptionFlow=true)");
    }
}
