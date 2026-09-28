package defpackage;

import android.os.Bundle;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yor implements ehx {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;

    public yor(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = R.id.to_int_verify_fragment;
    }

    @Override // defpackage.ehx
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("email", this.a);
        bundle.putString("verify_token", this.b);
        bundle.putString("type", this.c);
        bundle.putString("token", this.d);
        bundle.putString("cpf", this.e);
        return bundle;
    }

    @Override // defpackage.ehx
    public final int b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yor)) {
            return false;
        }
        yor yorVar = (yor) obj;
        return Intrinsics.g(this.a, yorVar.a) && Intrinsics.g(this.b, yorVar.b) && Intrinsics.g(this.c, yorVar.c) && Intrinsics.g(this.d, yorVar.d) && Intrinsics.g(this.e, yorVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("ToIntVerifyFragment(email=", this.a, ", verifyToken=", this.b, ", type=");
        hxa.c(sbA, this.c, ", token=", this.d, ", cpf=");
        return uf80.a(sbA, this.e, ")");
    }
}
