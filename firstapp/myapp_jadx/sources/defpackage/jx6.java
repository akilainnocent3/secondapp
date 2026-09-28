package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jx6 {
    public final qw6 a;
    public final ioh0 b;
    public final boolean c;
    public final boolean d;

    public jx6(qw6 qw6Var, ioh0 ioh0Var, boolean z, boolean z2) {
        this.a = qw6Var;
        this.b = ioh0Var;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx6)) {
            return false;
        }
        jx6 jx6Var = (jx6) obj;
        return this.a.equals(jx6Var.a) && Intrinsics.g(this.b, jx6Var.b) && this.c == jx6Var.c && this.d == jx6Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ioh0 ioh0Var = this.b;
        return Boolean.hashCode(this.d) + mtg0.a((iHashCode + (ioh0Var == null ? 0 : ioh0Var.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChallengeApplicable(challenge=");
        sb.append(this.a);
        sb.append(", userProgress=");
        sb.append(this.b);
        sb.append(", canParticipate=");
        return lng.a(", unlockedLeaderboard=", ")", sb, this.c, this.d);
    }
}
