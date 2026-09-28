package defpackage;

import com.appsflyer.internal.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wgh {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;

    public wgh(String str, String str2, String str3, String str4, long j) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgh)) {
            return false;
        }
        wgh wghVar = (wgh) obj;
        return Intrinsics.g(this.a, wghVar.a) && this.b.equals(wghVar.b) && this.c.equals(wghVar.c) && this.d == wghVar.d && Intrinsics.g(this.e, wghVar.e);
    }

    public final int hashCode() {
        int iA = f87.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31);
        String str = this.e;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("Feed(id=", this.a, ", headline=", this.b, ", description=");
        l.a(this.d, this.c, ", publishedTime=", sbA);
        return pr0.a(sbA, ", imageUrl=", this.e, ")");
    }
}
