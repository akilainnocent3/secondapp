package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p610 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final hw1 i;

    public p610(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, hw1 hw1Var) {
        str.getClass();
        str2.getClass();
        str6.getClass();
        str7.getClass();
        hw1Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = hw1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p610)) {
            return false;
        }
        p610 p610Var = (p610) obj;
        return Intrinsics.g(this.a, p610Var.a) && Intrinsics.g(this.b, p610Var.b) && this.c.equals(p610Var.c) && this.d.equals(p610Var.d) && this.e.equals(p610Var.e) && Intrinsics.g(this.f, p610Var.f) && Intrinsics.g(this.g, p610Var.g) && Intrinsics.g(this.h, p610Var.h) && this.i == p610Var.i;
    }

    public final int hashCode() {
        int iA = gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        return this.i.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("PixBankAccount(id=", this.a, ", ispb=", this.b, ", ispbName=");
        hxa.c(sbA, this.c, ", ispbImgUrl=", this.d, ", ispbImgUrlRound=");
        hxa.c(sbA, this.e, ", bankBranch=", this.f, ", accountId=");
        hxa.c(sbA, this.g, ", accountType=", this.h, ", bankStatus=");
        sbA.append(this.i);
        sbA.append(")");
        return sbA.toString();
    }
}
