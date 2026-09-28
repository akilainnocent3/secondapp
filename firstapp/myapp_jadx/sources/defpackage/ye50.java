package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ye50 implements bfx {
    public final String a;

    public ye50() {
        this.a = "";
    }

    public static final ye50 fromBundle(Bundle bundle) {
        String string;
        bundle.getClass();
        bundle.setClassLoader(ye50.class.getClassLoader());
        if (bundle.containsKey("email")) {
            string = bundle.getString("email");
            if (string == null) {
                hb5.a("Argument \"email\" is marked as non-null but was passed a null value.");
                return null;
            }
        } else {
            string = "";
        }
        return new ye50(string);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ye50) && Intrinsics.g(this.a, ((ye50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("ResetPwdConfirmFragmentArgs(email=", this.a, ")");
    }

    public ye50(String str) {
        this.a = str;
    }
}
