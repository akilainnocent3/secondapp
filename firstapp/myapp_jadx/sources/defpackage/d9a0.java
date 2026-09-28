package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d9a0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final dja0 e;
    public final y7i f;
    public final Integer g;
    public final String h;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ d9a0(String str, String str2, boolean z, boolean z2, dja0 dja0Var, y7i y7iVar, Integer num, String str3, int i) {
        y7i y7iVar2;
        if ((i & 32) != 0) {
            y7iVar2 = z2 ? y7i.a.a : y7i.c.a;
        } else {
            y7iVar2 = y7iVar;
        }
        this(str, str2, z, z2, dja0Var, y7iVar2, (i & 64) != 0 ? null : num, (i & 512) != 0 ? "" : str3);
    }

    public static d9a0 a(d9a0 d9a0Var, boolean z, y7i y7iVar, int i) {
        String str = d9a0Var.a;
        String str2 = d9a0Var.b;
        boolean z2 = d9a0Var.c;
        if ((i & 8) != 0) {
            z = d9a0Var.d;
        }
        dja0 dja0Var = d9a0Var.e;
        Integer num = d9a0Var.g;
        d9a0Var.getClass();
        d9a0Var.getClass();
        String str3 = d9a0Var.h;
        d9a0Var.getClass();
        d9a0Var.getClass();
        str.getClass();
        str2.getClass();
        dja0Var.getClass();
        y7iVar.getClass();
        str3.getClass();
        return new d9a0(str, str2, z2, z, dja0Var, y7iVar, num, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9a0)) {
            return false;
        }
        d9a0 d9a0Var = (d9a0) obj;
        return Intrinsics.g(this.a, d9a0Var.a) && Intrinsics.g(this.b, d9a0Var.b) && this.c == d9a0Var.c && this.d == d9a0Var.d && this.e == d9a0Var.e && Intrinsics.g(this.f, d9a0Var.f) && Intrinsics.g(this.g, d9a0Var.g) && Intrinsics.g(this.h, d9a0Var.h);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + mtg0.a(mtg0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31;
        Integer num = this.g;
        return gmf0.a((iHashCode + (num == null ? 0 : num.hashCode())) * 29791, 31, this.h);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("FollowState(nickname=", this.a, ", avatarUrl=", this.b, ", isMine=");
        nng.a(", isFollowed=", ", userType=", sbA, this.c, this.d);
        sbA.append(this.e);
        sbA.append(", followState=");
        sbA.append(this.f);
        sbA.append(", followersCount=");
        sbA.append(this.g);
        sbA.append(", totalCodes=null, totalWins=null, userId=");
        sbA.append(this.h);
        sbA.append(", winRatio=null)");
        return sbA.toString();
    }

    public d9a0(String str, String str2, boolean z, boolean z2, dja0 dja0Var, y7i y7iVar, Integer num, String str3) {
        str.getClass();
        str2.getClass();
        dja0Var.getClass();
        y7iVar.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = dja0Var;
        this.f = y7iVar;
        this.g = num;
        this.h = str3;
    }
}
