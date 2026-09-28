package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class hph0 {
    public final String a;
    public final String b;

    public hph0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hph0)) {
            return false;
        }
        hph0 hph0Var = (hph0) obj;
        return Intrinsics.g(this.a, hph0Var.a) && Intrinsics.g(this.b, hph0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserInfo(name=");
        sb.append(this.a);
        sb.append(", imageUrl=");
        return j26.a(sb, this.b, ')');
    }
}
