package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r17 {
    public final tz6 a;
    public final vz6 b;
    public final mx6 c;
    public final Long d;

    public r17(tz6 tz6Var, vz6 vz6Var, mx6 mx6Var, Long l) {
        tz6Var.getClass();
        vz6Var.getClass();
        mx6Var.getClass();
        this.a = tz6Var;
        this.b = vz6Var;
        this.c = mx6Var;
        this.d = l;
    }

    public static r17 a(r17 r17Var, tz6 tz6Var, vz6 vz6Var, mx6 mx6Var, Long l, int i) {
        if ((i & 1) != 0) {
            tz6Var = r17Var.a;
        }
        if ((i & 2) != 0) {
            vz6Var = r17Var.b;
        }
        if ((i & 4) != 0) {
            mx6Var = r17Var.c;
        }
        if ((i & 8) != 0) {
            l = r17Var.d;
        }
        r17Var.getClass();
        tz6Var.getClass();
        vz6Var.getClass();
        mx6Var.getClass();
        return new r17(tz6Var, vz6Var, mx6Var, l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r17)) {
            return false;
        }
        r17 r17Var = (r17) obj;
        return Intrinsics.g(this.a, r17Var.a) && Intrinsics.g(this.b, r17Var.b) && Intrinsics.g(this.c, r17Var.c) && Intrinsics.g(this.d, r17Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        Long l = this.d;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "ChallengeLobbyUiState(contentState=" + this.a + ", dialogState=" + this.b + ", bottomSheetState=" + this.c + ", acceptingChallengeId=" + this.d + ")";
    }

    public r17() {
        this(null, 15);
    }

    public /* synthetic */ r17(tz6 tz6Var, int i) {
        this((i & 1) != 0 ? tz6.b.a : tz6Var, vz6.b.a, mx6.c.a, null);
    }
}
