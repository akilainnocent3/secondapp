package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class yav {
    public final String a;
    public final double b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final wph0 g;

    public /* synthetic */ yav(int i) {
        this("", 0.0d, 0, 0, 0, 0, new wph0(Integer.MIN_VALUE, "", ""));
    }

    public static yav a(yav yavVar, String str, double d, int i, int i2, int i3, int i4, wph0 wph0Var, int i5) {
        if ((i5 & 1) != 0) {
            str = yavVar.a;
        }
        String str2 = str;
        if ((i5 & 2) != 0) {
            d = yavVar.b;
        }
        double d2 = d;
        if ((i5 & 4) != 0) {
            i = yavVar.c;
        }
        int i6 = i;
        if ((i5 & 8) != 0) {
            i2 = yavVar.d;
        }
        int i7 = i2;
        if ((i5 & 16) != 0) {
            i3 = yavVar.e;
        }
        int i8 = i3;
        int i9 = (i5 & 32) != 0 ? yavVar.f : i4;
        wph0 wph0Var2 = (i5 & 64) != 0 ? yavVar.g : wph0Var;
        str2.getClass();
        wph0Var2.getClass();
        return new yav(str2, d2, i6, i7, i8, i9, wph0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yav)) {
            return false;
        }
        yav yavVar = (yav) obj;
        return Intrinsics.g(this.a, yavVar.a) && Double.compare(this.b, yavVar.b) == 0 && this.c == yavVar.c && this.d == yavVar.d && this.e == yavVar.e && this.f == yavVar.f && Intrinsics.g(this.g, yavVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + gpp.a(this.f, gpp.a(this.e, gpp.a(this.d, gpp.a(this.c, nrg0.a(this.a.hashCode() * 31, 31, this.b), 31), 31), 31), 31);
    }

    public final String toString() {
        return "MatchmakingState(currency=" + this.a + ", amount=" + this.b + ", joinedPlayers=" + this.c + ", totalPlayers=" + this.d + ", remainingSeconds=" + this.e + ", totalSeconds=" + this.f + ", userReactionData=" + this.g + ')';
    }

    public yav(String str, double d, int i, int i2, int i3, int i4, wph0 wph0Var) {
        this.a = str;
        this.b = d;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = wph0Var;
    }

    public yav() {
        this(0);
    }
}
