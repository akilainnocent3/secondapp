package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class szw implements bfx {
    public final String a;

    public szw() {
        this.a = "Finish";
    }

    public static final szw fromBundle(Bundle bundle) {
        String string;
        bundle.getClass();
        bundle.setClassLoader(szw.class.getClassLoader());
        if (bundle.containsKey("next")) {
            string = bundle.getString("next");
            if (string == null) {
                hb5.a("Argument \"next\" is marked as non-null but was passed a null value.");
                return null;
            }
        } else {
            string = "Finish";
        }
        return new szw(string);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof szw) && Intrinsics.g(this.a, ((szw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("MyOddsRangeFragmentArgs(next=", this.a, ")");
    }

    public szw(String str) {
        this.a = str;
    }
}
