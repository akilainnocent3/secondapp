package defpackage;

import com.appsflyer.internal.x;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u690 {
    public final String a;
    public final long b;

    public u690(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u690)) {
            return false;
        }
        u690 u690Var = (u690) obj;
        return Intrinsics.g(this.a, u690Var.a) && this.b == u690Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbA = x.a(this.b, "ShortcutEntity(shortcutId=", this.a, ", lastModified=");
        sbA.append(")");
        return sbA.toString();
    }
}
