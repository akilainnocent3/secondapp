package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n7d {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public n7d(String str, boolean z, String str2, boolean z2, boolean z3, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public static n7d a(n7d n7dVar, String str, String str2, boolean z, boolean z2, boolean z3, int i) {
        String str3 = str;
        String str4 = n7dVar.a;
        if ((i & 2) != 0) {
            str3 = n7dVar.b;
        }
        if ((i & 4) != 0) {
            str2 = n7dVar.c;
        }
        if ((i & 32) != 0) {
            z3 = n7dVar.f;
        }
        n7dVar.getClass();
        return new n7d(str4, z, str3, z2, z3, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7d)) {
            return false;
        }
        n7d n7dVar = (n7d) obj;
        return this.a.equals(n7dVar.a) && Intrinsics.g(this.b, n7dVar.b) && Intrinsics.g(this.c, n7dVar.c) && this.d == n7dVar.d && this.e == n7dVar.e && this.f == n7dVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return Boolean.hashCode(this.f) + mtg0.a(mtg0.a((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("DedicatedTeamScreenUiState(teamId=", this.a, ", teamName=", this.b, ", teamLogoUrl=");
        uts.b(this.c, ", isHeaderLoading=", ", headerError=", sbA, this.d);
        return lng.a(", showNoDataEmptyState=", ")", sbA, this.e, this.f);
    }
}
