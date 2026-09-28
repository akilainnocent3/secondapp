package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fun {
    public final String a;
    public final String b;
    public final jzn c;
    public final String d;
    public final String e;
    public final String f;
    public final dxn g;
    public final List<gun> h;

    public fun(String str, String str2, jzn jznVar, String str3, String str4, String str5, dxn dxnVar, List<gun> list) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = jznVar;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = dxnVar;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fun)) {
            return false;
        }
        fun funVar = (fun) obj;
        return this.a.equals(funVar.a) && this.b.equals(funVar.b) && this.c == funVar.c && this.d.equals(funVar.d) && this.e.equals(funVar.e) && this.f.equals(funVar.f) && this.g.equals(funVar.g) && Intrinsics.g(this.h, funVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + gmf0.a(gmf0.a(gmf0.a((this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("InstantRacingEventMarket(id=", this.a, ", marketPoolId=", this.b, ", type=");
        sbA.append(this.c);
        sbA.append(", title=");
        sbA.append(this.d);
        sbA.append(", subtitle=");
        hxa.c(sbA, this.e, ", bannerTitles=", this.f, ", layout=");
        sbA.append(this.g);
        sbA.append(", outcomes=");
        sbA.append(this.h);
        sbA.append(")");
        return sbA.toString();
    }
}
