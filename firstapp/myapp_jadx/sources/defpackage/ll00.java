package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes5.dex */
public final class ll00 implements bfx {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public ll00(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
    }

    public static final ll00 fromBundle(Bundle bundle) {
        String str;
        String str2;
        String str3;
        bundle.getClass();
        bundle.setClassLoader(ll00.class.getClassLoader());
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
        if (!bundle.containsKey("password")) {
            hb5.a("Required argument \"password\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string3 = bundle.getString("password");
        if (string3 == null) {
            hb5.a("Argument \"password\" is marked as non-null but was passed a null value.");
            return null;
        }
        if (!bundle.containsKey("fullName")) {
            hb5.a("Required argument \"fullName\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string4 = bundle.getString("fullName");
        if (string4 == null) {
            hb5.a("Argument \"fullName\" is marked as non-null but was passed a null value.");
            return null;
        }
        if (!bundle.containsKey("dob")) {
            hb5.a("Required argument \"dob\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string5 = bundle.getString("dob");
        if (string5 == null) {
            hb5.a("Argument \"dob\" is marked as non-null but was passed a null value.");
            return null;
        }
        String string6 = "";
        if (bundle.containsKey("zipcode")) {
            String string7 = bundle.getString("zipcode");
            if (string7 == null) {
                hb5.a("Argument \"zipcode\" is marked as non-null but was passed a null value.");
                return null;
            }
            str = string7;
        } else {
            str = "";
        }
        if (bundle.containsKey("street")) {
            String string8 = bundle.getString("street");
            if (string8 == null) {
                hb5.a("Argument \"street\" is marked as non-null but was passed a null value.");
                return null;
            }
            str2 = string8;
        } else {
            str2 = "";
        }
        if (bundle.containsKey("city")) {
            String string9 = bundle.getString("city");
            if (string9 == null) {
                hb5.a("Argument \"city\" is marked as non-null but was passed a null value.");
                return null;
            }
            str3 = string9;
        } else {
            str3 = "";
        }
        if (!bundle.containsKey("state") || (string6 = bundle.getString("state")) != null) {
            return new ll00(string, string2, string3, string4, string5, str, str2, str3, string6);
        }
        hb5.a("Argument \"state\" is marked as non-null but was passed a null value.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll00)) {
            return false;
        }
        ll00 ll00Var = (ll00) obj;
        return this.a.equals(ll00Var.a) && this.b.equals(ll00Var.b) && this.c.equals(ll00Var.c) && this.d.equals(ll00Var.d) && this.e.equals(ll00Var.e) && this.f.equals(ll00Var.f) && this.g.equals(ll00Var.g) && this.h.equals(ll00Var.h) && this.i.equals(ll00Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("PersonalInfoFragmentArgs(email=", this.a, ", cpf=", this.b, ", password=");
        hxa.c(sbA, this.c, ", fullName=", this.d, ", dob=");
        hxa.c(sbA, this.e, ", zipcode=", this.f, ", street=");
        hxa.c(sbA, this.g, ", city=", this.h, ", state=");
        return uf80.a(sbA, this.i, ")");
    }
}
