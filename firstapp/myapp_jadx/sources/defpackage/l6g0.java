package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l6g0 {
    public final String a;
    public final String b;
    public final int c;
    public final ArrayList d;

    public l6g0(int i, String str, String str2, ArrayList arrayList) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6g0)) {
            return false;
        }
        l6g0 l6g0Var = (l6g0) obj;
        return Intrinsics.g(this.a, l6g0Var.a) && Intrinsics.g(this.b, l6g0Var.b) && this.c == l6g0Var.c && this.d.equals(l6g0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gpp.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("TournamentGroup(id=", this.a, ", name=", this.b, ", displayOrder=");
        sbA.append(this.c);
        sbA.append(", standings=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
