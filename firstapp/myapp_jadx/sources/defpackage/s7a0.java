package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s7a0 {
    public final boolean a;
    public final String b;
    public final boolean c;

    public s7a0(String str, boolean z, boolean z2) {
        str.getClass();
        this.a = z;
        this.b = str;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7a0)) {
            return false;
        }
        s7a0 s7a0Var = (s7a0) obj;
        return this.a == s7a0Var.a && Intrinsics.g(this.b, s7a0Var.b) && this.c == s7a0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + gmf0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return mq0.a(t160.a("SocialAccountState(isLogin=", ", accountName=", this.b, ", hasPersonalPage=", this.a), this.c, ")");
    }
}
