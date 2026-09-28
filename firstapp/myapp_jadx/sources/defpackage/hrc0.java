package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hrc0 implements bfx {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public hrc0(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public static final hrc0 fromBundle(Bundle bundle) {
        String string;
        String string2;
        bundle.getClass();
        bundle.setClassLoader(hrc0.class.getClassLoader());
        if (bundle.containsKey("destination")) {
            string = bundle.getString("destination");
            if (string == null) {
                hb5.a("Argument \"destination\" is marked as non-null but was passed a null value.");
                return null;
            }
        } else {
            string = "tv-streams";
        }
        String string3 = "";
        if (bundle.containsKey("articleId")) {
            string2 = bundle.getString("articleId");
            if (string2 == null) {
                hb5.a("Argument \"articleId\" is marked as non-null but was passed a null value.");
                return null;
            }
        } else {
            string2 = "";
        }
        if (!bundle.containsKey("articleType") || (string3 = bundle.getString("articleType")) != null) {
            return new hrc0(string, string2, string3, bundle.containsKey("multiTab") ? bundle.getBoolean("multiTab") : true);
        }
        hb5.a("Argument \"articleType\" is marked as non-null but was passed a null value.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hrc0)) {
            return false;
        }
        hrc0 hrc0Var = (hrc0) obj;
        return Intrinsics.g(this.a, hrc0Var.a) && Intrinsics.g(this.b, hrc0Var.b) && Intrinsics.g(this.c, hrc0Var.c) && this.d == hrc0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return x9d.a(this.c, ", multiTab=", ")", ux5.a("SportyMediaHostFragmentArgs(destination=", this.a, ", articleId=", this.b, ", articleType="), this.d);
    }

    public hrc0() {
        this("tv-streams", "", "", true);
    }
}
