package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fxm implements bfx {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public fxm(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public static final fxm fromBundle(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        bundle.getClass();
        bundle.setClassLoader(fxm.class.getClassLoader());
        String string = "";
        if (bundle.containsKey("email")) {
            String string2 = bundle.getString("email");
            if (string2 == null) {
                hb5.a("Argument \"email\" is marked as non-null but was passed a null value.");
                return null;
            }
            str = string2;
        } else {
            str = "";
        }
        if (bundle.containsKey("verify_token")) {
            String string3 = bundle.getString("verify_token");
            if (string3 == null) {
                hb5.a("Argument \"verify_token\" is marked as non-null but was passed a null value.");
                return null;
            }
            str2 = string3;
        } else {
            str2 = "";
        }
        if (bundle.containsKey("type")) {
            String string4 = bundle.getString("type");
            if (string4 == null) {
                hb5.a("Argument \"type\" is marked as non-null but was passed a null value.");
                return null;
            }
            str3 = string4;
        } else {
            str3 = "";
        }
        if (bundle.containsKey("token")) {
            String string5 = bundle.getString("token");
            if (string5 == null) {
                hb5.a("Argument \"token\" is marked as non-null but was passed a null value.");
                return null;
            }
            str4 = string5;
        } else {
            str4 = "";
        }
        if (!bundle.containsKey("cpf") || (string = bundle.getString("cpf")) != null) {
            return new fxm(str, str2, str3, str4, string);
        }
        hb5.a("Argument \"cpf\" is marked as non-null but was passed a null value.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxm)) {
            return false;
        }
        fxm fxmVar = (fxm) obj;
        return Intrinsics.g(this.a, fxmVar.a) && Intrinsics.g(this.b, fxmVar.b) && Intrinsics.g(this.c, fxmVar.c) && Intrinsics.g(this.d, fxmVar.d) && Intrinsics.g(this.e, fxmVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("INTVerifyFragmentArgs(email=", this.a, ", verifyToken=", this.b, ", type=");
        hxa.c(sbA, this.c, ", token=", this.d, ", cpf=");
        return uf80.a(sbA, this.e, ")");
    }

    public fxm() {
        this("", "", "", "", "");
    }
}
