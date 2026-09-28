package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l2x implements bfx {
    public final String a;

    public l2x() {
        this.a = "Next";
    }

    public static final l2x fromBundle(Bundle bundle) {
        String string;
        bundle.getClass();
        bundle.setClassLoader(l2x.class.getClassLoader());
        if (bundle.containsKey("next")) {
            string = bundle.getString("next");
            if (string == null) {
                hb5.a("Argument \"next\" is marked as non-null but was passed a null value.");
                return null;
            }
        } else {
            string = "Next";
        }
        return new l2x(string);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l2x) && Intrinsics.g(this.a, ((l2x) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("MyTeamSearchFragmentArgs(next=", this.a, ")");
    }

    public l2x(String str) {
        this.a = str;
    }
}
