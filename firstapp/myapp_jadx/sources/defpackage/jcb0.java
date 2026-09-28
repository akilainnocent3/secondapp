package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class jcb0 {
    public final String a;
    public final String b;
    public final String c;

    public jcb0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcb0)) {
            return false;
        }
        jcb0 jcb0Var = (jcb0) obj;
        return Intrinsics.g(this.a, jcb0Var.a) && Intrinsics.g(this.b, jcb0Var.b) && Intrinsics.g(this.c, jcb0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return uf80.a(ux5.a("SpineData(atlasFilePath=", this.a, ", skeletonFilePath=", this.b, ", pngFilePath="), this.c, ")");
    }

    public jcb0() {
        this(null, null, null);
    }
}
