package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class igg0 {
    public final jgg0 a;
    public final String b;
    public final String c;
    public final boolean d;

    public igg0(jgg0 jgg0Var, String str, String str2, int i) {
        str2 = (i & 4) != 0 ? "" : str2;
        boolean z = (i & 8) == 0;
        str.getClass();
        str2.getClass();
        this.a = jgg0Var;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igg0)) {
            return false;
        }
        igg0 igg0Var = (igg0) obj;
        return this.a == igg0Var.a && Intrinsics.g(this.b, igg0Var.b) && this.c.equals(igg0Var.c) && this.d == igg0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TournamentTopicMessage(topicType=");
        sb.append(this.a);
        sb.append(", destinationPath=");
        sb.append(this.b);
        sb.append(", payload=");
        sb.append(this.c);
        sb.append(", errorOccurred=");
        return ruw.a(sb, this.d, ')');
    }
}
