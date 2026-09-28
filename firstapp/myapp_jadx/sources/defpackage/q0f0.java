package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q0f0 {
    public final String a;
    public final String b;

    public q0f0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0f0)) {
            return false;
        }
        q0f0 q0f0Var = (q0f0) obj;
        return Intrinsics.g(this.a, q0f0Var.a) && Intrinsics.g(this.b, q0f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TGUserInfo(name=");
        sb.append(this.a);
        sb.append(", imageUrl=");
        return j26.a(sb, this.b, ')');
    }
}
