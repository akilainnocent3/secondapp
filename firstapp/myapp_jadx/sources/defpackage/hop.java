package defpackage;

import com.google.android.gms.recaptchabase.WnDZ.CaxEybC;

/* JADX INFO: loaded from: classes.dex */
public final class hop {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof hop) {
            return this.a == ((hop) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }

    public static String a(int i) {
        if (i == 0) {
            return "Unspecified";
        }
        if (i == 1) {
            return "Text";
        }
        if (i == 2) {
            return "Ascii";
        }
        if (i == 3) {
            return "Number";
        }
        if (i == 4) {
            return "Phone";
        }
        if (i == 5) {
            return "Uri";
        }
        if (i == 6) {
            return "Email";
        }
        if (i == 7) {
            return "Password";
        }
        if (i == 8) {
            return CaxEybC.CAuzSBBMuJ;
        }
        return i == 9 ? "Decimal" : "Invalid";
    }
}
