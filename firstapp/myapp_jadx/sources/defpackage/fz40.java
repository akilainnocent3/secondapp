package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes5.dex */
public final class fz40 implements bfx {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public fz40(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public static final fz40 fromBundle(Bundle bundle) {
        String str;
        bundle.getClass();
        bundle.setClassLoader(fz40.class.getClassLoader());
        if (!bundle.containsKey("email")) {
            hb5.a("Required argument \"email\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string = bundle.getString("email");
        if (string == null) {
            hb5.a("Argument \"email\" is marked as non-null but was passed a null value.");
            return null;
        }
        if (!bundle.containsKey("cpf")) {
            hb5.a("Required argument \"cpf\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string2 = bundle.getString("cpf");
        if (string2 == null) {
            hb5.a("Argument \"cpf\" is marked as non-null but was passed a null value.");
            return null;
        }
        String string3 = "";
        if (bundle.containsKey("phoneNumber")) {
            String string4 = bundle.getString("phoneNumber");
            if (string4 == null) {
                hb5.a("Argument \"phoneNumber\" is marked as non-null but was passed a null value.");
                return null;
            }
            str = string4;
        } else {
            str = "";
        }
        if (!bundle.containsKey("phoneCountryCode") || (string3 = bundle.getString("phoneCountryCode")) != null) {
            return new fz40(string, string2, str, string3, bundle.containsKey("isResumptionFlow") ? bundle.getBoolean("isResumptionFlow") : false);
        }
        hb5.a("Argument \"phoneCountryCode\" is marked as non-null but was passed a null value.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz40)) {
            return false;
        }
        fz40 fz40Var = (fz40) obj;
        return this.a.equals(fz40Var.a) && this.b.equals(fz40Var.b) && this.c.equals(fz40Var.c) && this.d.equals(fz40Var.d) && this.e == fz40Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("RegistrationValidationFragmentArgs(email=", this.a, ", cpf=", this.b, ", phoneNumber=");
        hxa.c(sbA, this.c, ", phoneCountryCode=", this.d, ", isResumptionFlow=");
        return mq0.a(sbA, this.e, ")");
    }
}
