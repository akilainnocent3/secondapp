package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rt7 {
    public final String a;
    public final j6c b;

    public rt7(String str, j6c j6cVar) {
        str.getClass();
        j6cVar.getClass();
        this.a = str;
        this.b = j6cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt7)) {
            return false;
        }
        rt7 rt7Var = (rt7) obj;
        return Intrinsics.g(this.a, rt7Var.a) && this.b == rt7Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CloudflareParams(siteKey=" + this.a + ", action=" + this.b + ")";
    }
}
