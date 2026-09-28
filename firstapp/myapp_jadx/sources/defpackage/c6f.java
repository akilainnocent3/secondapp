package defpackage;

import com.appsflyer.internal.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c6f {
    public final String a;
    public final String b;
    public final String c;

    public c6f(String str, String str2, String str3) {
        m.a(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6f)) {
            return false;
        }
        c6f c6fVar = (c6f) obj;
        return Intrinsics.g(this.a, c6fVar.a) && Intrinsics.g(this.b, c6fVar.b) && Intrinsics.g(this.c, c6fVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(ux5.a("DoubleTextWithSeparator(firstText=", this.a, ", separator=", this.b, ", secondText="), this.c, ")");
    }
}
