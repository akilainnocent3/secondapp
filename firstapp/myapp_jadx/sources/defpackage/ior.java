package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ior {
    public final jor a;
    public final boolean b;
    public final String c;
    public final String d;

    public ior(jor jorVar, boolean z, String str, String str2) {
        str.getClass();
        this.a = jorVar;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ior)) {
            return false;
        }
        ior iorVar = (ior) obj;
        return this.a.equals(iorVar.a) && this.b == iorVar.b && Intrinsics.g(this.c, iorVar.c) && this.d.equals(iorVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gmf0.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LastMatchesRecord(result=");
        sb.append(this.a);
        sb.append(", teamOnHomeSide=");
        sb.append(this.b);
        sb.append(", opponentNameText=");
        return kwi.a(sb, this.c, ", fullTimeScoreText=", this.d, ")");
    }
}
