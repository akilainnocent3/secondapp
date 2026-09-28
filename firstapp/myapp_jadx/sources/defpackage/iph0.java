package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class iph0 {
    public final String a;
    public final String b;

    public iph0(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iph0)) {
            return false;
        }
        iph0 iph0Var = (iph0) obj;
        return Intrinsics.g(this.a, iph0Var.a) && Intrinsics.g(this.b, iph0Var.b);
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

    public /* synthetic */ iph0(int i) {
        this("", "");
    }
}
