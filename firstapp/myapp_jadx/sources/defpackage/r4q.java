package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r4q {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public r4q(String str, String str2, String str3, String str4) {
        wd7.a(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4q)) {
            return false;
        }
        r4q r4qVar = (r4q) obj;
        return Intrinsics.g(this.a, r4qVar.a) && Intrinsics.g(this.b, r4qVar.b) && Intrinsics.g(this.c, r4qVar.c) && Intrinsics.g(this.d, r4qVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return kwi.a(ux5.a("LNCountry(isoCode=", this.a, ", name=", this.b, ", flagUrl="), this.c, ", backgroundUrl=", this.d, ")");
    }
}
