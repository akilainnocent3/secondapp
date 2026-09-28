package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class icb0 {
    public final String a;
    public final String b;

    public icb0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icb0)) {
            return false;
        }
        icb0 icb0Var = (icb0) obj;
        return Intrinsics.g(this.a, icb0Var.a) && Intrinsics.g(this.b, icb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpineData(atlasFilePath=");
        sb.append(this.a);
        sb.append(", skeletonFilePath=");
        return j26.a(sb, this.b, ')');
    }
}
