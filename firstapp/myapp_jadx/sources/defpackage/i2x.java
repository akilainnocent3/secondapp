package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i2x implements bfx {
    public final String a;

    public i2x() {
        this.a = "Next";
    }

    public static final i2x fromBundle(Bundle bundle) {
        String string;
        bundle.getClass();
        bundle.setClassLoader(i2x.class.getClassLoader());
        if (bundle.containsKey("next")) {
            string = bundle.getString("next");
            if (string == null) {
                hb5.a("Argument \"next\" is marked as non-null but was passed a null value.");
                return null;
            }
        } else {
            string = "Next";
        }
        return new i2x(string);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i2x) && Intrinsics.g(this.a, ((i2x) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("MyTeamFragmentArgs(next=", this.a, ")");
    }

    public i2x(String str) {
        this.a = str;
    }
}
