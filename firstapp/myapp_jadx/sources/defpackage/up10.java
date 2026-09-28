package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class up10 {
    public final String a;
    public final boolean b;

    public up10(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up10)) {
            return false;
        }
        up10 up10Var = (up10) obj;
        return Intrinsics.g(this.a, up10Var.a) && this.b == up10Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerInformation(nickname=");
        sb.append(this.a);
        sb.append(", isUser=");
        return ruw.a(sb, this.b, ')');
    }
}
