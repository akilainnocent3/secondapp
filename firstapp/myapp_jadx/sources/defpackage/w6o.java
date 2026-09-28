package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w6o {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;

    public w6o(String str, String str2, String str3, ArrayList arrayList) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6o)) {
            return false;
        }
        w6o w6oVar = (w6o) obj;
        return Intrinsics.g(this.a, w6oVar.a) && this.b.equals(w6oVar.b) && this.c.equals(w6oVar.c) && this.d.equals(w6oVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("InstantVirtualShowOffRoundInfo(roundId=", this.a, ", createTime=", this.b, ", totalReturn=");
        sbA.append(this.c);
        sbA.append(", events=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
