package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zoo implements omo {
    public final String a;
    public final String b;

    public zoo(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoo)) {
            return false;
        }
        zoo zooVar = (zoo) obj;
        return Intrinsics.g(this.a, zooVar.a) && Intrinsics.g(this.b, zooVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("InstantWinTicketDetailShowOffCellState(sportId=", this.a, ", ticketId=", this.b, ")");
    }
}
