package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c7e0 {
    public final String a;
    public final b7e0 b;
    public final e7e0 c;

    public c7e0(String str, b7e0 b7e0Var, e7e0 e7e0Var) {
        str.getClass();
        this.a = str;
        this.b = b7e0Var;
        this.c = e7e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7e0)) {
            return false;
        }
        c7e0 c7e0Var = (c7e0) obj;
        return Intrinsics.g(this.a, c7e0Var.a) && this.b.equals(c7e0Var.b) && this.c == c7e0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "StreakRecord(date=" + this.a + ", milestone=" + this.b + ", status=" + this.c + ")";
    }
}
