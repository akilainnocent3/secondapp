package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y4f {
    public static final /* synthetic */ int e = 0;
    public final String a;
    public final String b;
    public final String c;
    public final u4f d;

    static {
        int i = u4f.d;
    }

    public y4f(String str, String str2, String str3, u4f u4fVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = u4fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4f)) {
            return false;
        }
        y4f y4fVar = (y4f) obj;
        return this.a.equals(y4fVar.a) && this.b.equals(y4fVar.b) && this.c.equals(y4fVar.c) && Intrinsics.g(this.d, y4fVar.d);
    }

    public final int hashCode() {
        int iA = gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        u4f u4fVar = this.d;
        return iA + (u4fVar == null ? 0 : u4fVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("DoubleOrNothingTicketDetailHeaderCardState(dateText=", this.a, ", originalBetWinningAmountText=", this.b, ", totalReturnAmountText=");
        sbA.append(this.c);
        sbA.append(", stepperState=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
