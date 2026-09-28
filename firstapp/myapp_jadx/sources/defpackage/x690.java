package defpackage;

import java.net.URI;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class x690 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final i790 f;
    public final v690 g;
    public final t690 h;
    public final boolean i;

    public x690(String str, String str2, String str3, String str4, String str5, i790 i790Var, v690 v690Var, t690 t690Var, boolean z) {
        str.getClass();
        t690Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i790Var;
        this.g = v690Var;
        this.h = t690Var;
        this.i = z;
    }

    public static x690 a(x690 x690Var, t690 t690Var, boolean z, int i) {
        String str = x690Var.a;
        String str2 = x690Var.b;
        String str3 = x690Var.c;
        String str4 = x690Var.d;
        String str5 = x690Var.e;
        i790 i790Var = x690Var.f;
        v690 v690Var = x690Var.g;
        if ((i & 128) != 0) {
            t690Var = x690Var.h;
        }
        t690 t690Var2 = t690Var;
        if ((i & 256) != 0) {
            z = x690Var.i;
        }
        x690Var.getClass();
        str.getClass();
        t690Var2.getClass();
        return new x690(str, str2, str3, str4, str5, i790Var, v690Var, t690Var2, z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final String b() {
        String strM0;
        try {
            URI uri = new URI(this.e);
            String path = uri.getPath();
            String str = null;
            if (path != null) {
                strM0 = StringsKt.m0(path, "/", path);
                if (strM0.length() <= 0) {
                    strM0 = null;
                }
            } else {
                strM0 = null;
            }
            String host = uri.getHost();
            if (host == null || host.length() <= 0) {
                host = null;
            }
            if (strM0 == null) {
                strM0 = host == null ? "unknown" : host;
            }
            String query = uri.getQuery();
            if (query != null && query.length() > 0) {
                str = query;
            }
            if (str == null) {
                return strM0;
            }
            return strM0 + "?" + str;
        } catch (Exception unused) {
            return "invalid";
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x690)) {
            return false;
        }
        x690 x690Var = (x690) obj;
        return Intrinsics.g(this.a, x690Var.a) && this.b.equals(x690Var.b) && this.c.equals(x690Var.c) && this.d.equals(x690Var.d) && this.e.equals(x690Var.e) && this.f == x690Var.f && this.g == x690Var.g && this.h == x690Var.h && this.i == x690Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("ShortcutItem(id=", this.a, ", imgUrl=", this.b, ", imgUrlDark=");
        hxa.c(sbA, this.c, ", text=", this.d, ", linkUrl=");
        sbA.append(this.e);
        sbA.append(", shortcutTag=");
        sbA.append(this.f);
        sbA.append(", group=");
        sbA.append(this.g);
        sbA.append(", editStatus=");
        sbA.append(this.h);
        sbA.append(", isFilledAsDefault=");
        return mq0.a(sbA, this.i, ")");
    }
}
