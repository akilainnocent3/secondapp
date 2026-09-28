package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class if50 implements bfx {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public if50(String str, String str2, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public static final if50 fromBundle(Bundle bundle) {
        String string;
        bundle.getClass();
        bundle.setClassLoader(if50.class.getClassLoader());
        String string2 = "";
        if (bundle.containsKey("email")) {
            string = bundle.getString("email");
            if (string == null) {
                hb5.a("Argument \"email\" is marked as non-null but was passed a null value.");
                return null;
            }
        } else {
            string = "";
        }
        if (!bundle.containsKey("token") || (string2 = bundle.getString("token")) != null) {
            return new if50(string, string2, bundle.containsKey("from_deeplink") ? bundle.getBoolean("from_deeplink") : false, bundle.containsKey("from_settings_password") ? bundle.getBoolean("from_settings_password") : false);
        }
        hb5.a("Argument \"token\" is marked as non-null but was passed a null value.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if50)) {
            return false;
        }
        if50 if50Var = (if50) obj;
        return Intrinsics.g(this.a, if50Var.a) && Intrinsics.g(this.b, if50Var.b) && this.c == if50Var.c && this.d == if50Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + mtg0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return lng.a(", fromSettingsPassword=", ")", ux5.a("ResetPwdFragmentArgs(email=", this.a, ", token=", this.b, ", fromDeeplink="), this.c, this.d);
    }

    public if50() {
        this("", "", false, false);
    }
}
