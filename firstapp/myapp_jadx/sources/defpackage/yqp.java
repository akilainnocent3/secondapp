package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yqp {
    public final String a;
    public final String b;
    public final int c;
    public final zqp d;
    public final List<wqp> e;

    public yqp(String str, String str2, int i, zqp zqpVar, List<wqp> list) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = zqpVar;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqp)) {
            return false;
        }
        yqp yqpVar = (yqp) obj;
        return Intrinsics.g(this.a, yqpVar.a) && Intrinsics.g(this.b, yqpVar.b) && this.c == yqpVar.c && this.d == yqpVar.d && this.e.equals(yqpVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + gpp.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("KnockoutStage(stageId=", this.a, ", name=", this.b, ", order=");
        sbA.append(this.c);
        sbA.append(", status=");
        sbA.append(this.d);
        sbA.append(", matches=");
        return ng1.a(sbA, this.e, ")");
    }
}
