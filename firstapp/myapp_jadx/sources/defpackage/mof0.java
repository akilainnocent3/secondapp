package defpackage;

import com.appsflyer.internal.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mof0 {
    public final long a;
    public final String b;
    public final String c;
    public final boolean d;

    public mof0(long j, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mof0)) {
            return false;
        }
        mof0 mof0Var = (mof0) obj;
        return this.a == mof0Var.a && Intrinsics.g(this.b, mof0Var.b) && Intrinsics.g(this.c, mof0Var.c) && this.d == mof0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + gmf0.a(gmf0.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbA = b0.a(this.a, "ThemeRowUi(id=", ", name=", this.b);
        sbA.append(", thumbnailPath=");
        sbA.append(this.c);
        sbA.append(", isApplied=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
