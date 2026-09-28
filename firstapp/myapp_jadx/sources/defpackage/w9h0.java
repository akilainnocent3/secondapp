package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class w9h0 {
    public final f8i a;
    public final t9i b;
    public final int c;
    public final int d;
    public final Object e;

    public w9h0(f8i f8iVar, t9i t9iVar, int i, int i2, Object obj) {
        this.a = f8iVar;
        this.b = t9iVar;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9h0)) {
            return false;
        }
        w9h0 w9h0Var = (w9h0) obj;
        return Intrinsics.g(this.a, w9h0Var.a) && Intrinsics.g(this.b, w9h0Var.b) && this.c == w9h0Var.c && this.d == w9h0Var.d && Intrinsics.g(this.e, w9h0Var.e);
    }

    public final int hashCode() {
        f8i f8iVar = this.a;
        int iA = gpp.a(this.d, gpp.a(this.c, (((f8iVar == null ? 0 : f8iVar.hashCode()) * 31) + this.b.a) * 31, 31), 31);
        Object obj = this.e;
        return iA + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        sb.append((Object) n9i.b(this.c));
        sb.append(", fontSynthesis=");
        int i = this.d;
        if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Weight";
        } else if (i == 2) {
            str = "Style";
        } else {
            str = i == 65535 ? "All" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        return ekw.a(sb, this.e, ')');
    }
}
