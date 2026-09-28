package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes5.dex */
public final class ro7 implements bfx {
    public final String a;
    public final String b;
    public final String c;

    public ro7(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static final ro7 fromBundle(Bundle bundle) {
        bundle.getClass();
        bundle.setClassLoader(ro7.class.getClassLoader());
        if (!bundle.containsKey("clabe")) {
            hb5.a("Required argument \"clabe\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string = bundle.getString("clabe");
        if (string == null) {
            hb5.a("Argument \"clabe\" is marked as non-null but was passed a null value.");
            return null;
        }
        if (!bundle.containsKey("amount")) {
            hb5.a("Required argument \"amount\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string2 = bundle.getString("amount");
        if (string2 == null) {
            hb5.a("Argument \"amount\" is marked as non-null but was passed a null value.");
            return null;
        }
        if (!bundle.containsKey("tradeId")) {
            hb5.a("Required argument \"tradeId\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string3 = bundle.getString("tradeId");
        if (string3 != null) {
            return new ro7(string, string2, string3);
        }
        hb5.a("Argument \"tradeId\" is marked as non-null but was passed a null value.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro7)) {
            return false;
        }
        ro7 ro7Var = (ro7) obj;
        return this.a.equals(ro7Var.a) && this.b.equals(ro7Var.b) && this.c.equals(ro7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(ux5.a("ClabeDepositFragmentArgs(clabe=", this.a, ", amount=", this.b, ", tradeId="), this.c, ")");
    }
}
