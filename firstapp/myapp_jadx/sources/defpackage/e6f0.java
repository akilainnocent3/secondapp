package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e6f0 {
    public final String a;
    public final String b;
    public final String c;

    public e6f0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6f0)) {
            return false;
        }
        e6f0 e6f0Var = (e6f0) obj;
        return this.a.equals(e6f0Var.a) && this.b.equals(e6f0Var.b) && Intrinsics.g(this.c, e6f0Var.c);
    }

    public final int hashCode() {
        int iA = gmf0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return uf80.a(ux5.a("TeamClickData(teamId=", this.a, ", teamName=", this.b, ", sportId="), this.c, ")");
    }
}
