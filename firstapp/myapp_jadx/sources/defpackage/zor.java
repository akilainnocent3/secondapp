package defpackage;

import android.os.Bundle;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zor implements ehx {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public zor(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        qn4.b(str, str2, str3, str4, str5);
        wd7.a(str6, str7, str8, str9);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
    }

    @Override // defpackage.ehx
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("email", this.a);
        bundle.putString("cpf", this.b);
        bundle.putString("password", this.c);
        bundle.putString("fullName", this.d);
        bundle.putString("dob", this.e);
        bundle.putString("zipcode", this.f);
        bundle.putString("street", this.g);
        bundle.putString("city", this.h);
        bundle.putString("state", this.i);
        return bundle;
    }

    @Override // defpackage.ehx
    public final int b() {
        return R.id.to_personal_info_fragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zor)) {
            return false;
        }
        zor zorVar = (zor) obj;
        return Intrinsics.g(this.a, zorVar.a) && Intrinsics.g(this.b, zorVar.b) && Intrinsics.g(this.c, zorVar.c) && Intrinsics.g(this.d, zorVar.d) && Intrinsics.g(this.e, zorVar.e) && Intrinsics.g(this.f, zorVar.f) && Intrinsics.g(this.g, zorVar.g) && Intrinsics.g(this.h, zorVar.h) && Intrinsics.g(this.i, zorVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("ToPersonalInfoFragment(email=", this.a, ", cpf=", this.b, ", password=");
        hxa.c(sbA, this.c, ", fullName=", this.d, ", dob=");
        hxa.c(sbA, this.e, ", zipcode=", this.f, ", street=");
        hxa.c(sbA, this.g, ", city=", this.h, ", state=");
        return uf80.a(sbA, this.i, ")");
    }
}
