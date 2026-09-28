package defpackage;

import com.appsflyer.internal.m;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class iv6 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public iv6(String str, String str2, String str3) {
        m.a(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        this.d = StringsKt.M(lowerCase, "games", false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv6)) {
            return false;
        }
        iv6 iv6Var = (iv6) obj;
        return Intrinsics.g(this.a, iv6Var.a) && Intrinsics.g(this.b, iv6Var.b) && Intrinsics.g(this.c, iv6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(ux5.a("CenterTabData(tabLink=", this.a, ", tabImg=", this.b, ", tabText="), this.c, ")");
    }
}
