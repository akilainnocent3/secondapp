package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class asc0 implements bfx {
    public final String a;
    public final int b;

    public asc0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static final asc0 fromBundle(Bundle bundle) {
        String string;
        bundle.getClass();
        bundle.setClassLoader(asc0.class.getClassLoader());
        if (bundle.containsKey("articleId")) {
            string = bundle.getString("articleId");
            if (string == null) {
                hb5.a("Argument \"articleId\" is marked as non-null but was passed a null value.");
                return null;
            }
        } else {
            string = "0";
        }
        return new asc0(string, bundle.containsKey("tabIndex") ? bundle.getInt("tabIndex") : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asc0)) {
            return false;
        }
        asc0 asc0Var = (asc0) obj;
        return Intrinsics.g(this.a, asc0Var.a) && this.b == asc0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return d830.a(this.b, "SportyNewsArticleDetailFragmentArgs(articleId=", this.a, ", tabIndex=", ")");
    }

    public asc0() {
        this("0", 0);
    }
}
