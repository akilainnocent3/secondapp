package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w8z {
    public final String a;
    public final String b;
    public final int c;

    public w8z(String str, String str2, int i) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8z)) {
            return false;
        }
        w8z w8zVar = (w8z) obj;
        return Intrinsics.g(this.a, w8zVar.a) && this.b.equals(w8zVar.b) && this.c == w8zVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return zk1.a(this.c, ")", ux5.a("OutcomeTag(ticketId=", this.a, ", type=", this.b, ", serialNumber="));
    }
}
