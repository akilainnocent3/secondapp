package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kz0 {
    public final boolean a;
    public final String b;
    public final gdc c;
    public final String d;
    public final jz0 e;

    public kz0(boolean z, String str, gdc gdcVar, String str2, jz0 jz0Var) {
        str.getClass();
        this.a = z;
        this.b = str;
        this.c = gdcVar;
        this.d = str2;
        this.e = jz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz0)) {
            return false;
        }
        kz0 kz0Var = (kz0) obj;
        return this.a == kz0Var.a && Intrinsics.g(this.b, kz0Var.b) && Intrinsics.g(this.c, kz0Var.c) && Intrinsics.g(this.d, kz0Var.d) && this.e == kz0Var.e;
    }

    public final int hashCode() {
        int iA = gmf0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
        gdc gdcVar = this.c;
        int iHashCode = (iA + (gdcVar == null ? 0 : gdcVar.hashCode())) * 31;
        String str = this.d;
        return this.e.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = t160.a("AssignedCustomCodeUIState(isLoading=", ", bookingCode=", this.b, ", customCode=", this.a);
        sbA.append(this.c);
        sbA.append(", userSportySocialName=");
        sbA.append(this.d);
        sbA.append(", result=");
        sbA.append(this.e);
        sbA.append(")");
        return sbA.toString();
    }

    public kz0() {
        this(0);
    }

    public /* synthetic */ kz0(int i) {
        this(false, "", null, null, jz0.a);
    }
}
