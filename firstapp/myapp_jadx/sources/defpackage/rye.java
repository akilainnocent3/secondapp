package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class rye {
    public final long a;
    public final String b;

    public rye(long j, String str) {
        str.getClass();
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rye)) {
            return false;
        }
        rye ryeVar = (rye) obj;
        return this.a == ryeVar.a && Intrinsics.g(this.b, ryeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DomainPlayerPayload(playerId=");
        sb.append(this.a);
        sb.append(", nickname=");
        return j26.a(sb, this.b, ')');
    }
}
