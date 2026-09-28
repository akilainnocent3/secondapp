package defpackage;

import com.appsflyer.internal.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j3x {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final n2x f;
    public final boolean g;

    public j3x(int i, String str, String str2, String str3, String str4, n2x n2xVar, boolean z) {
        m.a(str, str2, str4);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = n2xVar;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3x)) {
            return false;
        }
        j3x j3xVar = (j3x) obj;
        return this.a == j3xVar.a && Intrinsics.g(this.b, j3xVar.b) && Intrinsics.g(this.c, j3xVar.c) && this.d.equals(j3xVar.d) && Intrinsics.g(this.e, j3xVar.e) && this.f.equals(j3xVar.f) && this.g == j3xVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = uqe0.a(this.a, "NCItemState(id=", ", title=", this.b, ", content=");
        hxa.c(sbA, this.c, ", createTime=", this.d, ", bannerImageUrl=");
        sbA.append(this.e);
        sbA.append(", ncButton=");
        sbA.append(this.f);
        sbA.append(", isExpanded=");
        return mq0.a(sbA, this.g, ")");
    }
}
