package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class muc0 implements bfx {
    public final String a;
    public final int b;

    public muc0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static final muc0 fromBundle(Bundle bundle) {
        String string;
        bundle.getClass();
        bundle.setClassLoader(muc0.class.getClassLoader());
        if (bundle.containsKey("articleId")) {
            string = bundle.getString("articleId");
            if (string == null) {
                hb5.a("Argument \"articleId\" is marked as non-null but was passed a null value.");
                return null;
            }
        } else {
            string = "0";
        }
        return new muc0(string, bundle.containsKey("tabIndex") ? bundle.getInt("tabIndex") : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof muc0)) {
            return false;
        }
        muc0 muc0Var = (muc0) obj;
        return Intrinsics.g(this.a, muc0Var.a) && this.b == muc0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return d830.a(this.b, "SportyNewsVideoDetailFragmentArgs(articleId=", this.a, ", tabIndex=", ")");
    }

    public muc0() {
        this("0", 0);
    }
}
