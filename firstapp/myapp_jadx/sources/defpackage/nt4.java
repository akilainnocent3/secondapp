package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class nt4 {
    public final String a;
    public final String b;
    public final vt4 c;
    public final wt4 d;
    public final String e;
    public final String f;
    public final String g;
    public final double h;
    public final String i;
    public final boolean j;

    public nt4(String str, String str2, vt4 vt4Var, wt4 wt4Var, String str3, String str4, String str5, double d, String str6, boolean z) {
        wd7.a(str, str2, str3, str6);
        this.a = str;
        this.b = str2;
        this.c = vt4Var;
        this.d = wt4Var;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = d;
        this.i = str6;
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt4)) {
            return false;
        }
        nt4 nt4Var = (nt4) obj;
        return Intrinsics.g(this.a, nt4Var.a) && Intrinsics.g(this.b, nt4Var.b) && this.c == nt4Var.c && this.d == nt4Var.d && Intrinsics.g(this.e, nt4Var.e) && this.f.equals(nt4Var.f) && this.g.equals(nt4Var.g) && Double.compare(this.h, nt4Var.h) == 0 && Intrinsics.g(this.i, nt4Var.i) && this.j == nt4Var.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + gmf0.a(nrg0.a(gmf0.a(gmf0.a(gmf0.a((this.d.hashCode() + ((this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonusVaultGame(gameTitle=");
        sb.append(this.a);
        sb.append(", gameSubtitle=");
        sb.append(this.b);
        sb.append(", bonusVaultGameStatus=");
        sb.append(this.c);
        sb.append(", bonusVaultGameType=");
        sb.append(this.d);
        sb.append(", gameCode=");
        sb.append(this.e);
        sb.append(", launchUrl=");
        sb.append(this.f);
        sb.append(", imageBackgroundCmsKey=");
        sb.append(this.g);
        sb.append(", maxReward=");
        sb.append(this.h);
        sb.append(", currency=");
        sb.append(this.i);
        sb.append(", forceWebView=");
        return ruw.a(sb, this.j, ')');
    }
}
